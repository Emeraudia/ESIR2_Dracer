/**** on va ici implémenter la transformée de Fourier rapide 1D ****/

public class FFT_1D {
	
	//"combine" c1 et c2 selon la formule vue en TD
	// c1 et c2 sont de même taille
	// la taille du résultat est le double de la taille de c1
	public static CpxTab combine(CpxTab c1, CpxTab c2) {
		assert (c1.taille()==c2.taille()) : "combine: c1 et c2 ne sont pas de même taille, taille c1="+c1.taille()+" taille c2="+c2.taille();
		int n = c1.taille()+c2.taille();
		CpxTab c = new CpxTab(n);

		CpxTab wkn = new CpxTab(n/2);
		for(int i = 0 ; i < n/2 ; i++){
			wkn.set_p_reel(i, Math.cos(Math.PI*2*i/n));
			wkn.set_p_imag(i, Math.sin(Math.PI*2*i/n));
		}

		CpxTab wC2 = CpxTab.multiplie(wkn, c2);

		for(int k = 0 ; k < n/2 ; k++){

			c.set_p_reel(k, c1.get_p_reel(k)+wC2.get_p_reel(k));
			c.set_p_imag(k, c1.get_p_imag(k)+wC2.get_p_imag(k));

			c.set_p_reel(k+n/2, c1.get_p_reel(k)-wC2.get_p_reel(k));
			c.set_p_imag(k+n/2, c1.get_p_imag(k)-wC2.get_p_imag(k));

		}
		return c;
	}

	//renvoie la TFD d'un tableau de complexes
	//la taille de x doit être une puissance de 2
	public static CpxTab FFT(CpxTab x) {
		if(x.taille() == 1) return x; 
		assert (x.taille()%2==0) : "FFT: la taille de x doit être une puissance de 2";
		CpxTab c1 = new CpxTab(x.taille()/2);
		CpxTab c2 = new CpxTab(x.taille()/2);

		for(int i = 0; i < x.taille() / 2; i++) {
			c1.set_p_reel(i, x.get_p_reel(2*i));
			c1.set_p_imag(i, x.get_p_imag(2*i));
			c2.set_p_reel(i, x.get_p_reel(2*i+1));
			c2.set_p_imag(i, x.get_p_imag(2*i+1));
		}
		return combine(FFT(c1), FFT(c2));
	}

	//renvoie la TFD d'un tableau de réels
	//la taille de x doit être une puissance de 2
	public static CpxTab FFT(double[] x) {
		return FFT(new CpxTab(x));
	}
			
	//renvoie la transformée de Fourier inverse de y
	public static CpxTab FFT_inverse(CpxTab y) {
		CpxTab tmp = (FFT(y.conjugue())).conjugue();
		for(int i = 0 ; i < y.taille() ; i++) {
			tmp.set_p_reel(i, tmp.get_p_reel(i)/y.taille());
			tmp.set_p_imag(i, tmp.get_p_imag(i)/y.taille());
		}
		return tmp;
	}
	
	//calcule le produit de deux polynômes en utilisant la FFT
	//tab1 et tab2, sont les coefficients de ces polynômes
	// CpxTab sera le tableau des coefficients du polynôme produit (purement réel)
	public static CpxTab multiplication_polynome_viaFFT(double[] tab1, double[] tab2) {
		
		//on commence par doubler la taille des vecteurs en rajoutant des zéros à la fin (cf TD)
		double[] t1 = new double[2*tab1.length], t2 = new double[2*tab1.length];
		for (int i = 0; i < tab1.length; i++) {
			t1[i] = tab1[i];
			t2[i] = tab2[i];
		}

		return FFT_inverse(CpxTab.multiplie(FFT(t1), FFT(t2)));
	}

	
	//renvoie un tableau de réels aléatoires
	//utile pour tester la multiplication de polynômes
	public static double[] random(int n) {
		double[] t = new double[n];

		for (int i = 0; i < n; i++)
			t[i] = Math.random();
		return t;
	}

	//effectue la multiplication de polynômes représentés par coefficients
	// p1, p2 les coefficients des deux polynômes P1 et P2
	// renvoie les coefficients du polynôme P1*P2
	private static double [] multiplication_polynome_viaCoeff(double[] p1, double[] p2){
		
		int n = p1.length + p2.length - 1;
		double a,b;
		double [] out = new double[n];
		for (int k = 0; k < n; k++) {
			for (int i = 0; i <= k; i++) {
				a = (i<p1.length) ? p1[i]:0;
				b = (k-i<p2.length) ? p2[k-i] : 0;
				out[k] += a*b;
			}
		}
		return out;
	}
	

	//affiche un tableau de réels
	private static void afficher(double [] t){
		System.out.print("[");
		for(int k=0;k<t.length;k++){
			System.out.print(t[k]);
			if (k<(t.length-1))
				System.out.print(" ");
		}
		System.out.println("]");
	}


	//FFT d'un vecteur
	private static CpxTab TFD(double[] a) {
		int n = a.length;
		CpxTab FFT = new CpxTab(n);
		for(int k = 0 ; k < n ; k++) {
			for(int j = 0 ; j < n ; j++) {
				FFT.set_p_reel(k, FFT.get_p_reel(k)+a[j]*Math.cos((2*Math.PI*k*j)/n));
				FFT.set_p_imag(k, FFT.get_p_imag(k)+a[j]*Math.sin((2*Math.PI*k*j)/n));
			}
		}

		return FFT;
	}
	
	public static void main(String[] args) {
		double[] t5 = {1,2,3,4};

		/* Exo 2: calculez et affichez TFD(1,2,3,4) */
		System.out.println("FFT du polynome {1,2,3,4}");
		CpxTab y = FFT(t5);
		System.out.println(y);
		System.out.println();
		
		/* Exo 3: calculez et affichez TFD_inverse(TFD(1,2,3,4)) */
		System.out.println("FFT inverse de la FFT du polynome {1,2,3,4}");
		System.out.println(FFT_inverse(y));
		System.out.println();

		/* Exo 4: multiplication polynomiale, vérification*/
			/* A(X) = 2 et B(X)=-3 */
			double[] A = {2};
			double[] B = {-3};
			System.out.println(multiplication_polynome_viaFFT(A,B));	

			/* A(X) = 2+X et B(X)= -3+2X */
			A = new double[]{2,1};
			B = new double[]{-3,2};
			System.out.println(multiplication_polynome_viaFFT(A,B));						

			/* A(X) = 1 + 2X + 3X^2 + 4X^3 et B(X) = -3 + 2X - 5 X^2*/
			A = new double[]{1,2,3,4};
			B = new double[]{-3,2,-5,0};
			System.out.println(multiplication_polynome_viaFFT(A,B));	

		System.out.println("-----------------------------------------------------");
		System.out.println("   Comparaison des 2 méthodes de multiplications polynomiales");
		double[] t6 = {-3,2,-5,0};
		System.out.println("mult via FFT  --> " + multiplication_polynome_viaFFT(t5, t6));
		System.out.print(  "mult via coeff -> ");
		afficher(multiplication_polynome_viaCoeff(t5, t6));

		/* Exo 5: comparaison des temps de calculs */

		// Pour étude du temps de calcul 
		int n = 256;  // taille des polynômes à multiplier (testez différentes valeurs en gardant des puissances de 2)
			
		System.out.println("Temps de calcul pour n="+n);
		double[] tab1 =random(n),tab2 = random(n);
		long date1, date2;
		date1 = System.currentTimeMillis();
		multiplication_polynome_viaCoeff(tab1, tab2);
		date2 = System.currentTimeMillis();
		System.out.println("   via Coeff: " + (date2 - date1));

		date1 = System.currentTimeMillis();
		multiplication_polynome_viaFFT(tab1, tab2);
		date2 = System.currentTimeMillis();
		System.out.println("   via FFT  : " + (date2 - date1));


		System.out.println("-----------------------------------------------------");
		System.out.println("   TFD d'un vecteur");
		n = 16;
		double[] a = new double[n];
		for(int i = 0 ; i < n ; i++) a[i] = 2;
		System.out.print("Vecteur constant : ");
		afficher(a);
		System.out.println(TFD(a));

		int k = 8;
		for(int i = 0 ; i < n ; i++) a[i] = Math.cos(i*(2*Math.PI*k)/n);
		System.out.print("Sinusoïd pure : ");
		afficher(a);
		System.out.println(TFD(a));

		for(int i = 0 ; i < n ; i++) a[i] = Math.cos((2*Math.PI*i)/n)+Math.cos((2*Math.PI*3*i)/n)/2;
		System.out.print("somme de 2 sinusoid : ");
		afficher(a);
		System.out.println(TFD(a));

		for(int i = 0 ; i < n ; i++) a[i] = 4 + 2*Math.sin((2*Math.PI*2*i)/n)+Math.cos((2*Math.PI*7*i)/n);
		System.out.print("somme de 2 sinusoid : ");
		afficher(a);
		System.out.println(TFD(a));
	}

}
