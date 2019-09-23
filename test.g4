grammar test;
/*plus : NUMBER '+' NUMBER;
sub : NUMBER '-' NUMBER;
mult : NUMBER '*' NUMBER;
div : NUMBER '/' NUMBER;
exp : NUMBER '**' NUMBER;
paren : NUMBER '(' NUMBER ')' ;
heavyparen : '(' NUMBER ')' '(' NUMBER ')';*/
literal: STRINGLITERAL | INTEGER;
relation_name: IDENTIFIER;
attribute_name: IDENTIFIER;
operand: attribute_name | literal;
OP: '==' | '!=' | '<' | '>' | '<=' | '>=';
INTEGER: (DIGIT)+;
DIGIT: [0-9];
IDENTIFIER: ALPHA (ALPHA | DIGIT)*;
STRINGLITERAL: '"' ALPHA (ALPHA | DIGIT)* '"';
ALPHA: [a-zA-z_];
WHITESPACE: [ \t\r\n] -> skip;
/*
*/

