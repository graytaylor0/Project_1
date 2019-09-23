grammar test;
/*plus : NUMBER '+' NUMBER;
sub : NUMBER '-' NUMBER;
mult : NUMBER '*' NUMBER;
div : NUMBER '/' NUMBER;
exp : NUMBER '**' NUMBER;
paren : NUMBER '(' NUMBER ')' ;
heavyparen : '(' NUMBER ')' '(' NUMBER ')';*/
prule: IDENTIFIER;
OP: '==' | '!=' | '<' | '>' | '<=' | '>=';
INTEGER: (DIGIT)+;
DIGIT: [0-9];
IDENTIFIER: ALPHA (ALPHA | DIGIT)*;
ALPHA: [a-zA-z];
STRINGLITERAL:
WHITESPACE: [ \t\r\n] -> skip;
/*
*/

