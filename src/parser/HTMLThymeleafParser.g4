parser grammar HTMLThymeleafParser;

options {
    tokenVocab = HTMLThymeleafLexer;
}

@header {
    package antlr;
}

// HTML document

htmlDocument
    : htmlNode* EOF
    ;

htmlNode
    : htmlElement
    | HTML_TEXT
    ;

// HTML elements

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* TAG_CLOSE
      htmlNode*
      TAG_OPEN_SLASH TAG_NAME TAG_CLOSE
      # NormalTag

    | TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH_CLOSE
      # SelfClosingTag
    ;

// Attributes

htmlAttribute
    : thymeleafAttribute
    | standardAttribute
    ;

// Thymeleaf attributes

thymeleafAttribute
    : thymeleafAttributeName EQUALS ATTVALUE_VALUE
    ;

thymeleafAttributeName
    : TH_TEXT
    | TH_EACH
    | TH_IF
    | TH_UNLESS
    | TH_SRC
    | TH_HREF
    | TH_ACTION
    | TH_OBJECT
    | TH_FIELD
    | TH_VALUE
    | TH_OTHER_ATTR
    ;

// Standard HTML attributes

standardAttribute
    : TAG_NAME (EQUALS ATTVALUE_VALUE)?
    ;