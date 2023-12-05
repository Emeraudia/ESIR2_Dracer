grammar triple_a;

fragment S	:	'b'*'a';
T	:	S S S('a'|'b')*;

rule 	:	 T	;