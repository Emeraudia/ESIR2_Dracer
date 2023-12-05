import java.io.IOException;

public class FFT_2D {

	//renvoie la TFD d'une image de complexes
	public static CpxImg FFT(CpxImg I) {

		CpxImg out = new CpxImg(I.taille());

		// FFT 1D sur les lignes
		for (int k = 0; k < I.taille(); k++)
			out.set_line(k,FFT_1D.FFT(I.get_line(k)));
		  
		// transposition
		out.transpose();

		// FFT 1D sur les "nouvelles" lignes de out (anciennes colonnes)
		for (int k = 0; k < I.taille(); k++)
			out.set_line(k,FFT_1D.FFT(out.get_line(k)));

		//on re transpose pour revenir dans le sens de d�part
		out.transpose();
		
		//on divise par la taille de I
		out.multiply(1./I.taille());
		return out.recentrage();
	}
	
	//renvoie la TFD inverse d'une images de complexes
	public static CpxImg FFT_inverse(CpxImg I) {
		I = I.recentrage();
		CpxImg out = new CpxImg(I.taille());
		for (int k = 0; k < I.taille(); k++)
			out.set_line(k, I.get_line(k).conjugue());

		out = FFT(out).recentrage();
		for (int k = 0; k < I.taille(); k++)
			out.set_line(k, out.get_line(k).conjugue());
		return out;
	}

	// compression par mise � z�ro des coefficients de fr�quence 
	// FI contient la TDF de I 
	// Dans FI on met � z�ros tous les coefficients correspondant � des fr�quences inf�rieures � k
	public static void compression(CpxImg FI, int k) {
		int size = FI.taille()/2;
		for(int i = 0 ; i < FI.taille() ; i++) {
			for(int j = 0 ; j < FI.taille() ; j++) {
				if((i<size-k || i>size+k) || (j<size-k || j>size+k) ){
					FI.set_p_reel(i, j, 0);
					FI.set_p_imag(i, j, 0);
				}
			}
		}
	}

	// compression par seuillage des coefficients faibles
	// FI contient la TDF de I 
	// Dans FI on met � z�ros tous les coefficients dont le module est inf�rieur � seuil 
	// on renvoie le nombre de coefficients conserv�s 
	public static int compression_seuil(CpxImg FI, double seuil){
		int cons = 0;
		for(int i = 0 ; i < FI.taille() ; i++) {
			for(int j = 0 ; j < FI.taille() ; j++) {
				if(Math.sqrt(FI.get_p_reel(i, j)*FI.get_p_reel(i, j)+FI.get_p_imag(i, j)*FI.get_p_imag(i, j)) < seuil){
					FI.set_p_reel(i, j, 0);
					FI.set_p_imag(i, j, 0);
				}
				else cons++;
			}
		}
		return cons;
	}

	private static void compression_10(String name){
		try{
			//compression seuil
			BytePixmap BP_seuil = new BytePixmap(name+".pgm");
			CpxImg I_seuil = new CpxImg(BP_seuil);
			int seuil = 0;
			int nbPix = I_seuil.taille()*I_seuil.taille();
			int val = nbPix;

			while(val > nbPix/10) {
				I_seuil = new CpxImg(BP_seuil);
				seuil++;
				I_seuil = FFT(I_seuil);
				val = compression_seuil(I_seuil, seuil);
				System.out.println(val+" "+seuil);
			}
			I_seuil = FFT_inverse(I_seuil);
			BP_seuil = I_seuil.convert_to_BytePixmap();
			BP_seuil.write(name+"_seuil_10%.pgm");
			//compression carre

			BP_seuil = new BytePixmap(name+".pgm");
			I_seuil = new CpxImg(BP_seuil);
			int k = (int)Math.sqrt((I_seuil.taille()*I_seuil.taille())/10);
			System.out.println(k/2);
			I_seuil = FFT(I_seuil);
			compression(I_seuil, k/2);
			I_seuil = FFT_inverse(I_seuil);
			BP_seuil = I_seuil.convert_to_BytePixmap();
			BP_seuil.write(name+"_carre_10%.pgm");


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		
		try {			
			//PLACEZ ICI VOS TESTS en 2D
			//Exemple, lecture
			BytePixmap BP = new BytePixmap("tigre_512.pgm");
			CpxImg I = new CpxImg(BP);
			
			I = FFT(I);

			//Exemple, �criture
			BP = I.convert_to_BytePixmap();
			BP.write("nomfichier2.pgm");

			System.out.println("Ex3 FFT");
			String[] ex = {"mire1","mire2","mire3","fingerprint","barbara_512"};
			for(String s : ex){
				BytePixmap BP2 = new BytePixmap(s+".pgm");
				CpxImg I2 = new CpxImg(BP2);
				I2 = FFT(I2);
				BP2 = I2.convert_to_BytePixmap();
				BP2.write(s+"_FFT.pgm");


			}

			System.out.println("Ex4 Basse fréquence");
			BytePixmap BP_bf = new BytePixmap("tigre_512.pgm");
			CpxImg I_bf = new CpxImg(BP_bf);
			
			I_bf = FFT(I_bf);

			BP_bf = I_bf.convert_to_BytePixmap();
			BP_bf.write("tigre_fft.pgm");

			I_bf.set_p_reel(512/2, 0, 0);
			I_bf.set_p_imag(512/2, 0, 0);
			I_bf = FFT_inverse(I_bf);

			//Exemple, �criture
			BP_bf = I_bf.convert_to_BytePixmap();
			BP_bf.write("tigre_bf.pgm");

			System.out.println("Ex5 compression");
			BytePixmap BP_comp = new BytePixmap("tigre_512.pgm");
			CpxImg I_comp = new CpxImg(BP_comp);
			int t_img = I_comp.taille();
			int[] K = {t_img/2,t_img/3,t_img/4,t_img/5};
			for(int k : K){
				I_comp = FFT(I_comp);
				compression(I_comp, k/2);
				I_comp = FFT_inverse(I_comp);
				BP_comp = I_comp.convert_to_BytePixmap();
				BP_comp.write("tigre_"+k+".pgm");

				BP_comp = new BytePixmap("tigre_512.pgm");
				I_comp = new CpxImg(BP_comp);
			}


			System.out.println("Ex6 compression tatonnement");
			compression_10("tigre_512");
			compression_10("barbara_512");
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
