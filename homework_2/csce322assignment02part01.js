module.exports = {
    onePlayerOneMove: onePlayerOneMove
}

var helpers = require( './helpers' );

function onePlayerOneMove( game ){
    
    function whatever( move ){
    // the move is the index of the array 
    // loop throught the rows starting from the last row 
    // when come across character - then replace that with a 1
    // return game
    for (let row = game.length-1; row >= 0; row--) {
        if(game[row][move-1]=='-') {
            game[row][move-1] = '1';
            return game;
        }
    }
	return game;
    }

    return whatever;
}