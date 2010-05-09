
/*
* generated by Xtext
*/
lexer grammar InternalBeeLang;


@header {
package org.eclipse.b3.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}




KEYWORD_130 : 'postinputcondition';

KEYWORD_129 : 'replace-modified';

KEYWORD_128 : 'merge-modified';

KEYWORD_123 : 'fail-modified';

KEYWORD_124 : 'keep-modified';

KEYWORD_125 : 'postcondition';

KEYWORD_126 : 'select-switch';

KEYWORD_127 : 'update-policy';

KEYWORD_116 : 'max-required';

KEYWORD_117 : 'min-required';

KEYWORD_118 : 'precondition';

KEYWORD_119 : 'repositories';

KEYWORD_120 : 'requires-max';

KEYWORD_121 : 'requires-min';

KEYWORD_122 : 'select-first';

KEYWORD_114 : 'annotations';

KEYWORD_115 : 'select-best';

KEYWORD_107 : 'containers';

KEYWORD_108 : 'implements';

KEYWORD_109 : 'instanceof';

KEYWORD_110 : 'properties';

KEYWORD_111 : 'repository';

KEYWORD_112 : 'resolution';

KEYWORD_113 : 'sequential';

KEYWORD_102 : 'container';

KEYWORD_103 : 'endswitch';

KEYWORD_104 : 'no-update';

KEYWORD_105 : 'timestamp';

KEYWORD_106 : 'unit-path';

KEYWORD_95 : 'branches';

KEYWORD_96 : 'function';

KEYWORD_97 : 'parallel';

KEYWORD_98 : 'provides';

KEYWORD_99 : 'reexport';

KEYWORD_100 : 'requires';

KEYWORD_101 : 'revision';

KEYWORD_83 : 'builder';

KEYWORD_84 : 'concern';

KEYWORD_85 : 'context';

KEYWORD_86 : 'default';

KEYWORD_87 : 'exclude';

KEYWORD_88 : 'extends';

KEYWORD_89 : 'finally';

KEYWORD_90 : 'include';

KEYWORD_91 : 'mutable';

KEYWORD_92 : 'private';

KEYWORD_93 : 'proceed';

KEYWORD_94 : 'version';

KEYWORD_72 : 'cached';

KEYWORD_73 : 'elseif';

KEYWORD_74 : 'endtry';

KEYWORD_75 : 'greedy';

KEYWORD_76 : 'import';

KEYWORD_77 : 'latest';

KEYWORD_78 : 'output';

KEYWORD_79 : 'public';

KEYWORD_80 : 'remote';

KEYWORD_81 : 'source';

KEYWORD_82 : 'switch';

KEYWORD_63 : 'agent';

KEYWORD_64 : 'catch';

KEYWORD_65 : 'endif';

KEYWORD_66 : 'false';

KEYWORD_67 : 'final';

KEYWORD_68 : 'input';

KEYWORD_69 : 'local';

KEYWORD_70 : 'super';

KEYWORD_71 : 'throw';

KEYWORD_54 : 'case';

KEYWORD_55 : 'else';

KEYWORD_56 : 'null';

KEYWORD_57 : 'then';

KEYWORD_58 : 'this';

KEYWORD_59 : 'true';

KEYWORD_60 : 'unit';

KEYWORD_61 : 'when';

KEYWORD_62 : 'with';

KEYWORD_45 : '!==';

KEYWORD_46 : '...';

KEYWORD_47 : '===';

KEYWORD_48 : 'env';

KEYWORD_49 : 'new';

KEYWORD_50 : 'tag';

KEYWORD_51 : 'try';

KEYWORD_52 : 'val';

KEYWORD_53 : 'var';

KEYWORD_27 : '!=';

KEYWORD_28 : '%=';

KEYWORD_29 : '&&';

KEYWORD_30 : '*=';

KEYWORD_31 : '++';

KEYWORD_32 : '+=';

KEYWORD_33 : '--';

KEYWORD_34 : '-=';

KEYWORD_35 : '..';

KEYWORD_36 : '/=';

KEYWORD_37 : '<=';

KEYWORD_38 : '==';

KEYWORD_39 : '=>';

KEYWORD_40 : '>=';

KEYWORD_41 : 'as';

KEYWORD_42 : 'if';

KEYWORD_43 : '||';

KEYWORD_44 : '~=';

KEYWORD_1 : '!';

KEYWORD_2 : '#';

KEYWORD_3 : '$';

KEYWORD_4 : '%';

KEYWORD_5 : '&';

KEYWORD_6 : '(';

KEYWORD_7 : ')';

KEYWORD_8 : '*';

KEYWORD_9 : '+';

KEYWORD_10 : ',';

KEYWORD_11 : '-';

KEYWORD_12 : '.';

KEYWORD_13 : '/';

KEYWORD_14 : ':';

KEYWORD_15 : ';';

KEYWORD_16 : '<';

KEYWORD_17 : '=';

KEYWORD_18 : '>';

KEYWORD_19 : '?';

KEYWORD_20 : '@';

KEYWORD_21 : '[';

KEYWORD_22 : ']';

KEYWORD_23 : '_';

KEYWORD_24 : '{';

KEYWORD_25 : '|';

KEYWORD_26 : '}';



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_INT : ('0'..'9')+;

RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

RULE_ANY_OTHER : .;


