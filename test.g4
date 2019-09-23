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
type: 'VARCHAR' '(' INTEGER ')' | 'INTEGER';
attribute_list: attribute_name (',' attribute_name)*;
typed_attribute_list: attribute_name type  (',' attribute_name type)*;
open_cmd: 'OPEN' relation_name;
close_cmd: 'CLOSE' relation_name;
write_cmd: 'WRITE' relation_name;
exit_cmd: 'EXIT';
OP: '==' | '!=' | '<' | '>' | '<=' | '>=';
INTEGER: (DIGIT)+;
DIGIT: [0-9];
IDENTIFIER: ALPHA (ALPHA | DIGIT)*;
STRINGLITERAL: '"' ALPHA (ALPHA | DIGIT)* '"';
ALPHA: [a-zA-z_];
WHITESPACE: [ \t\r\n] -> skip;
/*
*/

