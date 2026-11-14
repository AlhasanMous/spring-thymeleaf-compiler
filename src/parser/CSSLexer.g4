lexer grammar CSSLexer;

@header {
package parser;
}

// ─── At-Rules ───
IMPORT_SYM      : '@import';
MEDIA_SYM       : '@media';
CHARSET_SYM     : '@charset';
FONT_FACE_SYM   : '@font-face';
KEYFRAMES_SYM   : '@keyframes' | '@-webkit-keyframes';
SUPPORTS_SYM    : '@supports';
CONTAINER_SYM   : '@container';
LAYER_SYM       : '@layer';

// ─── Symbols ───
LBRACE          : '{';
RBRACE          : '}';
LPAREN          : '(';
RPAREN          : ')';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COLON           : ':';
COMMA           : ',';
DOT             : '.';
HASH            : '#';
GT              : '>';
PLUS            : '+';
MINUS           : '-';
TILDE           : '~';
STAR            : '*';
PIPE            : '|';
EQUALS          : '=';
TILDE_EQ        : '~=';
PIPE_EQ         : '|=';
CARET_EQ        : '^=';
DOLLAR_EQ       : '$=';
STAR_EQ         : '*=';
DCOLON          : '::';

// ─── Values ───
IMPORTANT       : '!' WS_CHARS* 'important';
NUMBER          : [0-9]+ ('.' [0-9]+)? | '.' [0-9]+;
PERCENTAGE      : NUMBER '%';
DIMENSION       : NUMBER IDENT_CHARS+;
STRING          : '"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'';
URI             : 'url(' WS_CHARS* (STRING | ~[)'"]+) WS_CHARS* ')';
UNICODE_RANGE   : 'U+' [0-9a-fA-F?]+('-'[0-9a-fA-F]+)?;

// ─── Functions ───
FUNCTION        : IDENT_CHARS+ '(';

// ─── Custom Properties ───
CUSTOM_PROPERTY_NAME : '--' IDENT_CHARS+;

// ─── Identifier ───
IDENT           : '-'? IDENT_START IDENT_CHARS*;

// ─── Whitespace & Comments ───
WS              : WS_CHARS+ -> skip;
BLOCK_COMMENT   : '/*' .*? '*/' -> skip;

// ─── Fragments ───
fragment IDENT_START  : [a-zA-Z_\u0080-\uFFFF];
fragment IDENT_CHARS  : [a-zA-Z0-9_\-\u0080-\uFFFF];
fragment WS_CHARS     : [ \t\r\n\f];
