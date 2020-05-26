grammar csce322assignment01part01;

/*
    Lexer Rules 
 */
fragment NUMBER            : ('0'..'9') ;
fragment M                 : 'm';
fragment O                 : 'o';
fragment V                 : 'v';
fragment E                 : 'e';
fragment S                 : 's';
fragment G                 : 'g';
fragment A                 : 'a';
fragment SLASH             : '/';
fragment STAR              : '*';
fragment RIGHT_BRACKET     : '}';
fragment LEFT_BRACKET      : '{';
fragment RIGHT_BRACE       : ']';
fragment LEFT_BRACE        : '[';
fragment ROW               : '|';
fragment MINUS             : '-';
fragment LEFT_PARENT       : '(';
fragment RIGHT_PARENT      : ')';
fragment POUND             : '#';
fragment EXCLAIM           : '!';
fragment ARROW             : '>';
fragment QUESTION          : '?';
fragment BACKSLASH         :'\\';
fragment UNDERSCORE        :'_';

ROW_ENDING          :             ROW ;
MOVES_ENDING        :   RIGHT_BRACKET ;
MOVES_BEGINNING     :     LEFT_BRACKET;
GAME_ENDING         :     RIGHT_BRACE ;
GAME_BEGINNING      :      LEFT_BRACE ;
SECTION_BEGINNING   :      SLASH STAR ;
SECTION_ENDING      :      STAR SLASH ;
MOVE_TITLE          :       M O V E S ;
GAME_TITLE          :         G A M E ;
MOVE_SYMBOL         :       (NUMBER)+ ;   
GAME_SYMBOL         :       (NUMBER)+ ;
EMPTY               :           MINUS ;
UNDER               :           UNDERSCORE ;
WHITESPACE          :(' '| '\t' | '\n')+ -> skip;
SYMANTIC_ERROR      : (BACKSLASH | ARROW | EXCLAIM | RIGHT_PARENT | LEFT_PARENT
                    | POUND | SLASH SLASH | QUESTION);
ANYTHING            :               . ;

/* 
    Parser Rules
 */

connectFour:(SECTION_BEGINNING {System.out.println("Beginning of Section");}
            | SECTION_ENDING {System.out.println("End of Section");}
            | MOVE_TITLE {System.out.println("Moves Section");}
            | UNDER
            | GAME_TITLE {System.out.println("Game Section");}
            | MOVES_ENDING {System.out.println("End of List");} 
            | MOVES_BEGINNING {System.out.println("Beginning of List");}
            | GAME_ENDING {System.out.println("End of Game");}
            | GAME_BEGINNING {System.out.println("Start of Game");}
            | ROW_ENDING {System.out.println("End of Row");}
            | MOVE_SYMBOL {System.out.println("Number: "+$MOVE_SYMBOL.text);}
            | GAME_SYMBOL {System.out.println("Number: "+$GAME_SYMBOL.text);}
            | EMPTY {System.out.println("Space: Empty");}
            | WHITESPACE | (SYMANTIC_ERROR {System.out.println("SYNTAX PROBLEM ON LINE "+$SYMANTIC_ERROR.line); System.exit(0);}))+     
            EOF {System.out.println("End of File");}
            ;
