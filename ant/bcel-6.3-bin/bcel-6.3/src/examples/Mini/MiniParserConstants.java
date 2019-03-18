/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
/* Generated By:JJTree&JavaCC: Do not edit this line. MiniParserConstants.java */
package Mini;

public interface MiniParserConstants {

  int EOF = 0;
  int SINGLE_LINE_COMMENT = 7;
  int GT = 16;
  int LT = 17;
  int GEQ = 18;
  int LEQ = 19;
  int EQ = 20;
  int NEQ = 21;
  int NOT = 22;
  int FALSE = 23;
  int TRUE = 24;
  int AND = 25;
  int OR = 26;
  int PLUS = 27;
  int MINUS = 28;
  int MULT = 29;
  int MOD = 30;
  int DIV = 31;
  int LPAREN = 32;
  int RPAREN = 33;
  int ASSIGN = 34;
  int COMMA = 35;
  int READ = 36;
  int WRITE = 37;
  int DIGIT = 38;
  int LETTER = 39;
  int IDENT = 40;
  int INTEGER = 41;
  int STRING = 42;

  int DEFAULT = 0;
  int SINGLE_LINE_COMMENT_STATE = 1;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"--\"",
    "<SINGLE_LINE_COMMENT>",
    "<token of kind 8>",
    "\"FUN\"",
    "\"IF\"",
    "\"THEN\"",
    "\"ELSE\"",
    "\"FI\"",
    "\"LET\"",
    "\"IN\"",
    "\">\"",
    "\"<\"",
    "\">=\"",
    "\"<=\"",
    "\"==\"",
    "\"!=\"",
    "\"!\"",
    "\"FALSE\"",
    "\"TRUE\"",
    "\"AND\"",
    "\"OR\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"%\"",
    "\"/\"",
    "\"(\"",
    "\")\"",
    "\"=\"",
    "\",\"",
    "\"READ\"",
    "\"WRITE\"",
    "<DIGIT>",
    "<LETTER>",
    "<IDENT>",
    "<INTEGER>",
    "<STRING>",
  };

}