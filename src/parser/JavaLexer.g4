lexer grammar JavaLexer;

@header {
    package parser;
}

// ====================
// Keywords
// ====================

PACKAGE   : 'package';
IMPORT    : 'import';
CLASS     : 'class';

PUBLIC    : 'public';
PRIVATE   : 'private';
PROTECTED : 'protected';
STATIC    : 'static';
FINAL     : 'final';

RETURN    : 'return';
NEW       : 'new';
THIS      : 'this';
VOID      : 'void';

INT       : 'int';
DOUBLE    : 'double';
BOOLEAN   : 'boolean';
CHAR      : 'char';
BYTE      : 'byte';
LONG      : 'long';
FLOAT     : 'float';
SHORT     : 'short';

// ====================
// Literals
// ====================

STRING_LITERAL
    : '"' ( '\\' . | ~["\\\r\n] )* '"'
    ;

CHAR_LITERAL
    : '\'' ( '\\' . | ~['\\\r\n] ) '\''
    ;

DECIMAL_LITERAL
    : [0-9]+ '.' [0-9]+
    ;

INTEGER_LITERAL
    : [0-9]+
    ;

// ====================
// Identifiers
// ====================

IDENTIFIER
    : [a-zA-Z_$] [a-zA-Z0-9_$]*
    ;

// ====================
// Operators
// ====================

EQUAL          : '==';
NOT_EQUAL      : '!=';
LESS_EQUAL     : '<=';
GREATER_EQUAL  : '>=';

ASSIGN         : '=';
PLUS           : '+';
MINUS          : '-';
MULTIPLY       : '*';
DIVIDE         : '/';
MODULO         : '%';

LESS           : '<';
GREATER        : '>';

// ====================
// Separators
// ====================

AT       : '@';
DOT      : '.';
COMMA    : ',';
SEMI     : ';';
COLON    : ':';

LPAREN   : '(';
RPAREN   : ')';
LBRACE   : '{';
RBRACE   : '}';
LBRACK   : '[';
RBRACK   : ']';

QUESTION : '?';

// ====================
// Comments
// ====================

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

// ====================
// Whitespace
// ====================

WS
    : [ \t\r\n]+ -> skip
    ;