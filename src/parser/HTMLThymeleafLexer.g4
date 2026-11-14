lexer grammar HTMLThymeleafLexer;

// Default mode

HTML_COMMENT
    : '<!--' .*? '-->' -> skip
    ;

DOCTYPE
    : '<!' [dD][oO][cC][tT][yY][pP][eE] .*? '>' -> skip
    ;

TAG_OPEN_SLASH
    : '</' -> pushMode(TAG_MODE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG_MODE)
    ;

HTML_TEXT
    : ~[<]+
    ;


// Tag mode

mode TAG_MODE;

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

// Thymeleaf attributes

TH_TEXT
    : 'th:text'
    ;

TH_EACH
    : 'th:each'
    ;

TH_IF
    : 'th:if'
    ;

TH_UNLESS
    : 'th:unless'
    ;

TH_SRC
    : 'th:src'
    ;

TH_HREF
    : 'th:href'
    ;

TH_ACTION
    : 'th:action'
    ;

TH_OBJECT
    : 'th:object'
    ;

TH_FIELD
    : 'th:field'
    ;

TH_VALUE
    : 'th:value'
    ;

TH_OTHER_ATTR
    : 'th:' [a-zA-Z0-9_-]+
    ;

// Attributes and values

EQUALS
    : '='
    ;

TAG_NAME
    : [a-zA-Z_:] [a-zA-Z0-9_.:-]*
    ;

ATTVALUE_VALUE
    : '"' ( '\\' . | ~["\\] )* '"'
    | '\'' ( '\\' . | ~['\\] )* '\''
    ;

TAG_WHITESPACE
    : [ \t\r\n]+ -> skip
    ;