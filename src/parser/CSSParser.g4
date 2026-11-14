parser grammar CSSParser;

@header {
package parser;
}

options {
    tokenVocab = CSSLexer;
}

// ─── Entry ───
stylesheet
    : (styleRule | atRule)* EOF
    ;

// Entry point for parsing inline style="..." attribute content (no selector/braces)
inlineDeclarations
    : declaration* EOF
    ;

// ─── Rules ───
styleRule
    : selectorList LBRACE declaration* RBRACE
    ;

selectorList
    : selector (COMMA selector)*
    ;

selector
    : combinator simpleSelectorSeq (combinator simpleSelectorSeq)*
    ;

combinator
    : GT
    | PLUS
    | TILDE
    | /* descendant (whitespace) */
    ;

simpleSelectorSeq
    : typeSelector selectorPart*
    | selectorPart+
    ;

typeSelector
    : IDENT
    | STAR
    ;

selectorPart
    : HASH IDENT                                            # idSelector
    | DOT IDENT                                             # classSelector
    | LBRACK IDENT (EQUALS | TILDE_EQ | PIPE_EQ | CARET_EQ | DOLLAR_EQ | STAR_EQ) (STRING | IDENT) RBRACK  # attributeSelector
    | COLON COLON? FUNCTION pseudoArg? RPAREN               # functionalPseudoSelector
    | COLON COLON? IDENT                                    # pseudoSelector
    ;

pseudoArg
    : selectorList
    | selectorArg
    ;

selectorArg
    : (IDENT | NUMBER | DIMENSION | PLUS | MINUS)+
    ;

// ─── Declarations ───
declaration
    : property COLON value IMPORTANT? SEMI
    | property COLON value IMPORTANT?
    ;

property
    : IDENT
    | CUSTOM_PROPERTY_NAME
    ;

value
    : valuePart+
    ;

valuePart
    : MINUS? NUMBER
    | MINUS? PERCENTAGE
    | MINUS? DIMENSION
    | STRING
    | IDENT
    | CUSTOM_PROPERTY_NAME
    | HASH (IDENT | NUMBER | DIMENSION)
    | URI
    | FUNCTION value RPAREN
    | COMMA
    | PLUS
    | STAR
    ;

// ─── At-Rules ───
atRule
    : IMPORT_SYM (STRING | URI) SEMI                        # importRule
    | CHARSET_SYM STRING SEMI                               # charsetRule
    | FONT_FACE_SYM LBRACE declaration* RBRACE              # fontFaceRule
    | MEDIA_SYM mediaQueryList LBRACE (styleRule)* RBRACE        # mediaRule
    | KEYFRAMES_SYM IDENT LBRACE keyframeBlock* RBRACE      # keyframesRule
    | SUPPORTS_SYM featureCondition LBRACE (styleRule)* RBRACE          # supportsRule
    | CONTAINER_SYM IDENT? featureCondition LBRACE (styleRule)* RBRACE  # containerRule
    | LAYER_SYM layerNameList SEMI                                     # layerDeclaration
    | LAYER_SYM IDENT? LBRACE (styleRule | atRule)* RBRACE             # layerBlock
    ;

layerNameList
    : IDENT (COMMA IDENT)*
    ;

// Generic condition group shared by @supports and @container: a sequence of
// parenthesized feature checks or nested conditions, joined by bare words (and/or/not)
featureCondition
    : featureTerm+
    ;

featureTerm
    : LPAREN property COLON value RPAREN
    | LPAREN featureCondition RPAREN
    | IDENT
    ;

mediaQueryList
    : mediaQuery (COMMA mediaQuery)*
    ;

mediaQuery
    : IDENT
    | LPAREN IDENT COLON value RPAREN
    ;

keyframeBlock
    : keyframeSelector LBRACE declaration* RBRACE
    ;

keyframeSelector
    : (IDENT | PERCENTAGE) (COMMA (IDENT | PERCENTAGE))*
    ;
