grammar Ex3_1;

@parser::members
{ 
	java.util.Map<String,Double> variables = new java.util.HashMap(); 
}


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
   

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;



add	:	minus('+'add)?;
	
minus	:	mul('-'minus)?;

mul	:	div('*'mul)?;
	
div	:	uni('/'div)?;

uni	:	'-'?ope;

ope	:	WS* (INT|FLOAT) WS* | '(' add ')';
	
ex3_1	:	add;


num returns [Double val] :	
		WS*(var = ID)WS* {$val = variables.get($var.text);}
	|	a= (WS* (INT|FLOAT) WS*) { $val = Double.parseDouble($a.text); } 
	|	 ('('x = addExp{$val = $x.val; } ')' )
	;
	
uniExp returns [Double val] :	
	( a= num { $val = $a.val;  }) 
	|	 ('-'x = num{$val -= $x.val; })
	;

divExp returns [Double val]:
	(b = uniExp) {$val = $b.val;}
	(
		'/'(c=uniExp) { $val /= $c.val; } 
	)*;
	
mulExp returns [Double val]:
	(b = divExp) {$val = $b.val;}
	(
		'*'(c=divExp) { $val *= $c.val; } 
	)*;

minusExp returns [Double val]:
	(b = mulExp) {$val = $b.val;}
	(
		'-'(c=mulExp) { $val -= $c.val; }
	)*;
	
addExp returns [Double val]:
	(b = minusExp) {$val = $b.val;}
	(
		'+'(c=minusExp) { $val += $c.val; } 
	)*;
	
opeExp
	:	v = addExp { System.out.println("Résultat : " + $v.val); }';';
	

input 
	: 
	declaration*
	opeExp*
	
	;
	
declaration
	:
		'set' WS* (varname = ID) WS* '=' WS* 
		(x = addExp {
			variables.put($varname.text,$x.val);
		})';'
	;	
	


