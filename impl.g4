grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                      # SingleCommand
	| '{' cs+=command* '}'           # MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	         # Assignment
	| 'output' e=expr ';' 				 # Output
        | 'while' '('c=condition')' p=program  # WhileLoop
        | 'if' '('c=condition')' p=program #IfStatement
		| x=ID '[' e1=expr ']' '=' e2=expr ';'	# ArrayAssignment
        | 'for' '(' x=ID '=' e1=expr '..' e2=expr')' p=program #ForLoop
	;
	
expr	: e1=expr '/' e2=expr # Division
	| e1=expr '*' e2=expr # Multiplication
	| e1=expr '+' e2=expr # Addition
	| e1=expr '-' e2=expr # Subtraction
	| x=ID '[' e=expr ']' # Arrayy
	| c=FLOAT 			# Constant
	| '-' c=FLOAT 		# Negative
	| x=ID		      # Variable
	| '(' e=expr ')'      # Parenthesis
	;

condition : '!' c=condition # Not
      | e1=expr '!=' e2=expr # Unequal
	  | e1=expr '==' e2=expr # Equal
	  | c1=condition '&&' c2=condition # And
	  | c1=condition '||' c2=condition # Or
	  | e1=expr '<' e2=expr # Smaller
	  | e1=expr '>' e2=expr # Larger
	  ;  

ID    : ALPHA (ALPHA|NUM)* ;
FLOAT : NUM+ ('.' NUM+)? ;



ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
