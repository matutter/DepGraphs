// from https://github.com/antlr/grammars-v4/blob/master/java8/Java8.g4

grammar JavaDirective;
@header {
	package lang;
}

lang_source		:	(l_package* l_directive*) .+? ;

l_target		:	Identifier (SEP Identifier)* ;
l_package		:	KeyWordPackage l_target END ;
l_directive		:	KeyWorkImport Identifier* l_target END ;

KeyWorkImport	:	'import' ;
KeyWordPackage	:	'package' ;

SEP				:	'.' ;
END				:	';' ;
S				:	[ \t\r\n] -> skip;
Identifier		:	[a-zA-Z][a-zA-Z0-9]* ;

COMMENT			:	'/*' .*? '*/' -> skip ;
LINE_COMMENT	:	'//' ~[\r\n]* -> skip ;
WS				:	[ \t\r\n\u000C]+ -> skip ;
EXTRA			:	'\u0000'..'\uFFFF' -> skip ;