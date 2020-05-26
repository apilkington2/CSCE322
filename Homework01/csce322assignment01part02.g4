grammar csce322assignment01part02;

/*
    Lexer Rules 
 */
fragment ONE            : '1';
fragment TWO            : '2' ;
fragment THREE            : '3' ;
fragment FOUR            : '4' ;
fragment FIVE            : '5' ;
fragment SIX            : '6' ;
fragment SEVEN            : '7' ;
fragment EIGHT            : '8' ;
fragment NINE            : '9' ;
fragment ZERO           : '0';
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
fragment UNDERSCORE        : '_';

ROW_ENDING          :             ROW ;
MOVES_ENDING        :   RIGHT_BRACKET ;
MOVES_BEGINNING     :     LEFT_BRACKET;
GAME_ENDING         :     RIGHT_BRACE ;
GAME_BEGINNING      :      LEFT_BRACE ;
SECTION_BEGINNING   :      SLASH STAR ;
SECTION_ENDING      :      STAR SLASH ;
MOVE_TITLE          :       M O V E S ;
GAME_TITLE          :         G A M E ;
MOVE_SYMBOL         :       ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | ZERO;   
GAME_SYMBOL         :       ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | ZERO;
EMPTY               :           MINUS ;
UNDER               :       UNDERSCORE;
WHITESPACE          :(' '| '\t' | '\n')+ -> skip;
ANYTHING            :               . ;

connectFour : 
            ({int max = 1; int amount = 0; boolean col = false; boolean row = false; boolean one = false; boolean two = false; int columns = 0; int rows = 1;} 
            MOVE_TITLE 
            SECTION_BEGINNING
            MOVES_BEGINNING
            (MOVE_SYMBOL {if(Integer.parseInt($MOVE_SYMBOL.text) > max){max=Integer.parseInt($MOVE_SYMBOL.text);}} UNDER?)+ 
            MOVES_ENDING 
            SECTION_ENDING
            GAME_TITLE
            SECTION_BEGINNING 
            GAME_BEGINNING
            (MOVE_SYMBOL {amount++; if(Integer.parseInt($MOVE_SYMBOL.text) == 1) {one = true;} if(Integer.parseInt($MOVE_SYMBOL.text) == 2) {two = true;}}
            | EMPTY {columns++;})+ {if(columns > 10 || columns < 6){col=true;}}
            ROW_ENDING {rows++;}
            (MOVE_SYMBOL {amount++; if(Integer.parseInt($MOVE_SYMBOL.text) == 1) {one = true;} if(Integer.parseInt($MOVE_SYMBOL.text) == 2) {two = true;}}
            | EMPTY)+ 
            ROW_ENDING {rows++;}
            (MOVE_SYMBOL {amount++; if(Integer.parseInt($MOVE_SYMBOL.text) == 1) {one = true;} if(Integer.parseInt($MOVE_SYMBOL.text) == 2) {two = true;}}
            | EMPTY)+ 
            ROW_ENDING {rows++;}       
            (MOVE_SYMBOL {amount++; if(Integer.parseInt($MOVE_SYMBOL.text) == 1) {one = true;} if(Integer.parseInt($MOVE_SYMBOL.text) == 2) {two = true;}}
            | EMPTY | 
            ROW_ENDING {rows++; if(rows > 10){row=true;}})+ 
            GAME_ENDING {if(rows < 6){row=true;}}
            SECTION_ENDING {if(!two || !one){System.out.println("SEMANTIC PROBLEM 1");}if(row){System.out.println("SEMANTIC PROBLEM 2");}if(col){System.out.println("SEMANTIC PROBLEM 3");}if(max>columns){System.out.println("SEMANTIC PROBLEM 4");}else if(max <=columns && !col && !row && one && two){System.out.println(amount + " pieces have been played");}} 
            EOF)
            |
            ({int max = 1; int amount = 0; boolean col = false; boolean row = false; boolean one = false; boolean two = false; int columns = 0; int rows = 1;} 
            GAME_TITLE 
            SECTION_BEGINNING 
            GAME_BEGINNING
            (MOVE_SYMBOL {amount++; if(Integer.parseInt($MOVE_SYMBOL.text) == 1) {one = true;} if(Integer.parseInt($MOVE_SYMBOL.text) == 2) {two = true;}}
            | EMPTY {columns++;})+ {if(columns > 10 || columns < 6){col=true;}}
            ROW_ENDING {rows++;}
            (MOVE_SYMBOL {amount++; if(Integer.parseInt($MOVE_SYMBOL.text) == 1) {one = true;} if(Integer.parseInt($MOVE_SYMBOL.text) == 2) {two = true;}}
            | EMPTY)+ 
            ROW_ENDING {rows++;}
            (MOVE_SYMBOL {amount++; if(Integer.parseInt($MOVE_SYMBOL.text) == 1) {one = true;} if(Integer.parseInt($MOVE_SYMBOL.text) == 2) {two = true;}}
            | EMPTY)+ 
            ROW_ENDING {rows++;}       
            (MOVE_SYMBOL {amount++; if(Integer.parseInt($MOVE_SYMBOL.text) == 1) {one = true;} if(Integer.parseInt($MOVE_SYMBOL.text) == 2) {two = true;}}
            | EMPTY | 
            ROW_ENDING {rows++; if(rows > 10){row=true;}})+ 
            GAME_ENDING {if(rows < 6){row=true;}}
            SECTION_ENDING {if(!two || !one){System.out.println("SEMANTIC PROBLEM 1");}if(row){System.out.println("SEMANTIC PROBLEM 2");}if(col){System.out.println("SEMANTIC PROBLEM 3");}} 
            MOVE_TITLE 
            SECTION_BEGINNING 
            MOVES_BEGINNING
            (MOVE_SYMBOL {if(Integer.parseInt($MOVE_SYMBOL.text) > max){max=Integer.parseInt($MOVE_SYMBOL.text);}} UNDER?)+ 
            MOVES_ENDING 
            SECTION_ENDING {if(max > columns){System.out.println("SEMANTIC PROBLEM 4");}else if(!row && !col && (one || two)){System.out.println(amount + " pieces have been played");}}
            EOF)
       ;