parser grammar JavaParser;

options {
    tokenVocab = JavaLexer;
}

@header {
    package parser;
}

// ====================
// Compilation Unit
// ====================

compilationUnit
    : packageDeclaration?
      importDeclaration*
      classDeclaration*
      EOF
    ;

// ====================
// Package and Imports
// ====================

packageDeclaration
    : PACKAGE qualifiedName SEMI
    ;

importDeclaration
    : IMPORT qualifiedName (DOT MULTIPLY)? SEMI
    ;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*
    ;

// ====================
// Class Declaration
// ====================

classDeclaration
    : annotation*
      modifier*
      CLASS IDENTIFIER
      (LESS typeList GREATER)?
      classBody
    ;

classBody
    : LBRACE classMember* RBRACE
    ;

classMember
    : fieldDeclaration
    | constructorDeclaration
    | methodDeclaration
    ;

// ====================
// Fields
// ====================

fieldDeclaration
    : annotation*
      modifier*
      typeType variableDeclarators SEMI
    ;

variableDeclarators
    : variableDeclarator (COMMA variableDeclarator)*
    ;

variableDeclarator
    : IDENTIFIER (ASSIGN expression)?
    ;

// ====================
// Constructors
// ====================

constructorDeclaration
    : annotation*
      modifier*
      IDENTIFIER
      LPAREN parameterList? RPAREN
      methodBody
    ;

// ====================
// Methods
// ====================

methodDeclaration
    : annotation*
      modifier*
      typeTypeOrVoid
      IDENTIFIER
      LPAREN parameterList? RPAREN
      methodBody
    ;

methodBody
    : block
    | SEMI
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : annotation*
      typeType
      IDENTIFIER
    ;

// ====================
// Types
// ====================

typeTypeOrVoid
    : VOID
    | typeType
    ;

typeType
    : primitiveType
    | qualifiedName typeArguments?
    ;

typeArguments
    : LESS typeList? GREATER
    ;

primitiveType
    : INT
    | DOUBLE
    | BOOLEAN
    | CHAR
    | BYTE
    | LONG
    | FLOAT
    | SHORT
    ;

typeList
    : typeType (COMMA typeType)*
    ;

// ====================
// Modifiers
// ====================

modifier
    : PUBLIC
    | PRIVATE
    | PROTECTED
    | STATIC
    | FINAL
    ;

// ====================
// Annotations
// ====================

annotation
    : AT qualifiedName
      (LPAREN annotationArguments? RPAREN)?
    ;

annotationArguments
    : expression (COMMA expression)*
    ;

// ====================
// Blocks and Statements
// ====================

block
    : LBRACE statement* RBRACE
    ;

statement
    : block
    | localVariableDeclaration
    | returnStatement
    | expressionStatement
    | SEMI
    ;

localVariableDeclaration
    : typeType variableDeclarators SEMI
    ;

returnStatement
    : RETURN expression? SEMI
    ;

expressionStatement
    : expression SEMI
    ;

// ====================
// Expressions
// ====================

expression
    : assignmentExpression
    ;

assignmentExpression
    : postfixExpression (ASSIGN assignmentExpression)?
    ;

postfixExpression
    : atom postfixPart*
    ;

postfixPart
    : DOT IDENTIFIER (LPAREN argumentList? RPAREN)?
    ;

atom
    : NEW typeType LPAREN argumentList? RPAREN
    | THIS
    | literal
    | IDENTIFIER
    | LPAREN expression RPAREN
    ;

argumentList
    : expression (COMMA expression)*
    ;

literal
    : STRING_LITERAL
    | CHAR_LITERAL
    | INTEGER_LITERAL
    | DECIMAL_LITERAL
    ;