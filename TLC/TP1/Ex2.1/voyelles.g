grammar voyelles;

fragment ALP 	:	 'a'..'z';
fragment ALP_a 	:	 'b'..'z';
fragment ALP_e 	:	 'a'..'d'|'f'..'z';
fragment ALP_i 	:	 'a'..'h'|'j'..'z';
fragment ALP_o 	:	 'a'..'n'|'p'..'z';
fragment ALP_u 	:	 'a'..'t'|'v'..'z';
fragment ALP_y 	:	 'a'..'x'|'z';

S  	:	ALP_a*'a'ALP_e*'e'ALP_i*'i'ALP_o*'o'ALP_u*'u'ALP_y*'y'ALP*;

axiome	:	S;