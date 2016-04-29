/*
 * The MIT License
 *
 * Copyright 2016 Fundacion Jala.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.fundacionjala.enforce.sonarqube.apex.api.grammar;

import org.sonar.sslr.grammar.GrammarRuleKey;

/**
 * Contains enum all the rules used in the grammar.
 */
public enum ApexGrammarRuleKey implements GrammarRuleKey {

    ARGUMENTS,
    ANNOTATION,
    APEX_GRAMMAR,
    ASSIGN_VARIABLE_INITILIZER,
    BODY_IDENTIFIER,
    BRACKETS,
    INVOKE_EXPRESSION,
    CASTING_EXPRESSION,
    CREATING_EXPRESSION,
    DML_STATEMENT,
    EQUAL,
    FIELD_DECLARATION,
    FOR_STATEMENT,
    CLASS_DECLARATION,
    CONSTRUCTOR_DECLARATION,
    CLASS_NAME,
    EXPRESSION,
    EXPRESSION_FINAL,
    EXTENDS_LIST,
    IDENTIFIER,
    IMPLEMENTS_LIST,
    INIT_IDENTIFIER,
    INC,
    KEYWORD,
    LITERAL_EXPRESSION,
    DEC,
    MODIFIER,
    METHOD_DECLARATION,
    METHOD_NAME,
    MODIFIER_KEYWORD,
    NUMERIC_EXPRESSION,
    NUMERIC_EXPRESSION_OPERATIONS,
    NUMERIC_EXPRESSION_OPERATIONS_SIMPLE,
    RETURN_STATEMENT,
    STATEMENT,
    STATEMENT_BLOCK,
    STATEMENT_ELSE,
    STATEMENT_IF,
    STRING_EXPRESSION,
    PARAMETER,
    PARAMETER_LIST,
    TESTING_EXPRESSION,
    TERMINAL_EXPRESSION,
    TERMINAL_STATEMENT,
    TRY_STATEMENT,
    TYPE_SPECIFIER,
    TYPE,
    TYPE_CLASS,
    TYPE_DECLARATION,
    VARIABLE_DECLARATION,
    VARIABLE_DECLARATOR,
    VARIABLE_DECLARATOR_ID,
    WHILE_STATEMENT,
    
    /**
     * SOQL Keys
     * 
     */
    SOQL_EXPRESSION,
    SOQL_STATEMENT,
    DATABASE_STATEMENT,
    QUERY,
    //Select Notations
    SELECT_SENTENCE,
    COUNT_EXPR,
    FIELD,
    //From Notations
    FROM_SENTENCE,
    ALIASSTATEMENT,
    //With Notations
    WITH_SENTENCE,
    //Where Notations
    WHERE_SENTENCE,
    CONDITIONAL_SOQL_EXPRESSION,
    OPERATORS,
    SIMPLE_EXPRESSION,
    AND_EXPRESSION,
    OR_EXPRESSION,
    FILTERING_EXPRESSION,
    FIELD_EXPRESSION,
    LIKE_EXPRESSION,
    //Limit Notations
    LIMIT_SENTENCE,
    //Order Notations
    ORDER_BY_SENTENCE,
    //Group Notations
    GROUP_BY_SENTENCE,
    GROUP_BY_TYPES;
}
