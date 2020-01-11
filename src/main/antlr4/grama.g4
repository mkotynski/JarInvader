grammar grama;
begin:(installjar|listing|adding|savejar) EOF;
listing: (listpackages|listclasses|listmethods|listfields|listctors);
adding:(addpackage|addclass|addinterface|addmethod|addfield|addcons);
installjar: '--i ' filename=STH;
listpackages: '--list-packages';
listclasses: '--list-classes';
listmethods: '--list-methods ' name=STH;
listfields: '--list-fields ' name=STH;
listctors: '--list-ctors ' name=STH;

addpackage: 'add-package ' name=STH;
addclass: 'add-class ' name=STH;
addinterface: 'add-interface ' name=STH;
addmethod: 'add-method ' expr;
addfield: 'add-field ' expr;
addcons: 'add-ctor ' expr;

setmethodbody: 'set-method-body ' expr2;
addbeformethod: 'add-before-method' expr2;
addaftermethod: 'add-after-method' expr2;
setctorbody: 'set-ctor-body' expr2;

savejar: '--o ' filename=STH;

expr: name=STH declaration = DECL;

expr2: name=STH src = STH;

DECL:'[' (.|',')* ']';
WS: ('\n'|'\t'|'\r')+ -> skip;
WSO: ' ';
STH: [-.a-zA-Z0-9()_]+;