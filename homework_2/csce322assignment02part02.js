module.exports = {
    onePlayerManyMoves: onePlayerManyMoves
}

var helpers = require( './helpers' );

function checkCol(game) {
    for (let row = game.length-1; row >= 0; row--) {
        let count = 0;
        for(let col=game[0].length-1; col>=0; col--) {
            if(game[row][col] == '1') {
                count++;
            } else {
                count = 0;
            }
            if(count >= 4) {
                return true;
            }
        }
    }
    return false;
}

function checkRow(game) {
    for (let col = game[0].length-1; col >= 0; col--) {
        let count = 0;
        for(let row=game.length-1; row>=0; row--) {
            if(game[row][col] == '1') {
                count++;
            } else {
                count = 0;
            }
            if(count >= 4) {
                return true;
            }
        }
    }
    return false;
}

function diagonal(game) {
    // top left to bottom right
    for(let col = 0; col < game[0].length-3; col++) {
        for(let row=3; row <= game.length-1; row++) {
            if(game[row][col] == '1' && game[row-1][col+1] == '1' && game[row-2][col+2] == '1' && game[row-3][col+3] == '1') {
                return true; 
            }
        }
    }
    // top right to bottom left
    for(let column = 0; column < game[0].length-3; column++) {
        for(let rows=0; rows <= game.length-3; rows++) {
            try {
                if(game[rows][column] == '1' && game[rows+1][column+1] == '1' 
                && game[rows+2][column+2] == '1' && game[rows+3][column+3] == '1') {
                    return true; 
                }
            } catch(err)
            {
                continue;``
            }
        }
    }
    return false;
}

function onePlayerManyMoves( game ){
    
    function whatever( moves ){
    for(let i = 0; i <= moves.length-1; i++) {
        const move = moves[i];
        let changed = false;
        for (let row = game.length-1; row >= 0; row--) {
            if(!changed) {
                if(game[row][move-1]=='-') {
                    game[row][move-1] = '1';
                    changed = true;
                }
            }
        }
        if(checkCol(game)) {
            return game;
        }
        if(checkRow(game)) {
            return game;
        }
        if(diagonal(game)) {
            return game;
        }
    }
	return game;
    }

    return whatever;
}