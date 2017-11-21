grammar calculator;

NUMBER : [0-9]+;
WS  :  [ \t\r\n\u000C]+ -> skip;

MUL: '*' ;
DIV: '/' ;
MOD: '%';
ADD: '+' ;
SUB: '-' ;
SEMICOLON: ';';

start: num_expression SEMICOLON;

num_expression:       num_expression op=(MUL|DIV|MOD) num_expression    # MDM
                    | num_expression op=(ADD|SUB) num_expression        # AS
                    | value                                             # ValNumber
                    | '('num_expression')'                              # ParenExpression
                    | SUB '('num_expression')'							# NegativeParenExpression
    ;


value: '-'? NUMBER ('.' NUMBER)?;
