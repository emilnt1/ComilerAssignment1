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
		| x=ID '[' e=expr ']' '=' e=expr 	# ArrayAssignment
        | 'for' '(' x=ID '=' e1=expr '..' e2=expr')' p=program #ForLoop
	;

	
expr	: e1=expr '/' e2=expr # Division
	| e1=expr '*' e2=expr # Multiplication
	| e1=expr '+' e2=expr # Addition
	| e1=expr '-' e2=expr # Subtraction
	| x=ID '[' e=expr ']' # Array
	| c=FLOAT 			# Constant
	| '-' c=FLOAT 		# Negative
	| x=ID		      # Variable
	| '(' e=expr ')'      # Parenthesis
	;

condition : e1=expr '!=' e2=expr # Unequal
	  | e1=expr '==' e2=expr # Equal
	  | e1=expr '&&' e2=expr # And
	  | e1=expr '||' e2=expr # Or
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
