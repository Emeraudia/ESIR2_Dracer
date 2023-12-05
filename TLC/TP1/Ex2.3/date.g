grammar date;

fragment Date31 
	:	('0' '1'..'9')|('1'..'2')('0'..'9')|('3' ('0'|'1'));
	
fragment Date30
	:	('0' '1'..'9')|('1'..'2')('0'..'9')|('3''0');
	
fragment Date29
	:	('0' '1'..'9')|('1'..'2')('0'..'9');
	
fragment Mois31
	:	'0'('1'|'3'|'5'|'7'|'8') |'10'|'12';

fragment Mois30
	:	'0'('4'|'6'|'9') |'11';
	
fragment INT
	:	'0'..'9';
	
fragment Annee 
	:	INT INT INT INT;
	
Date	:	(Date31'/'Mois31'/'Annee) | (Date30'/'Mois30'/'Annee) | Date29'/02/'Annee;

rule 	:	Date;

	