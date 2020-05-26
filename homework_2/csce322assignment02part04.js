module.exports = {
    manyPlayersManyMoves: manyPlayersManyMoves
}

var helpers = require( './helpers' );

function checkCol(game, player) {
    const str = player.toString();
    for (let row = game.length-1; row >= 0; row--) {
        let count = 0;
        for(let col=game[0].length-1; col>=0; col--) {
            if(game[row][col] == str) {
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

function checkRow(game, player) {
    const str = player.toString();
    for (let col = game[0].length-1; col >= 0; col--) {
        let count = 0;
        for(let row=game.length-1; row>=0; row--) {
            if(game[row][col] == str) {
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

function diagonal(game, player) {
    // top left to bottom right
    const str = player.toString();
    for(let col = 0; col < game[0].length-3; col++) {
        for(let row=3; row <= game.length-1; row++) {
            if(game[row][col] == str && game[row-1][col+1] == str 
                && game[row-2][col+2] == str && game[row-3][col+3] == str) {
                return true; 
            }
        }
    }
    // top right to bottom left
    for(let column = 0; column < game[0].length-3; column++) {
        for(let rows=0; rows <= game.length-3; rows++) {
            try {
                if(game[rows][column] == str && game[rows+1][column+1] == str 
                && game[rows+2][column+2] == str && game[rows+3][column+3] == str) {
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

function manyPlayersManyMoves( game ){
    
    function whatever( moves ){
        let max=0;
        for(let j=0; j<=game.length-1; j++) {
            for(let k=0; k<=game[0].length-1; k++) {
                if(game[j][k] == '-') {
                    continue;
                } else {
                    let num = parseInt(game[j][k]);
                    if(num > max) {
                        max = num;
                    }
                }
            }
        }
        let player = 1;
        for(let i = 0; i<=moves.length-1; i++) {
            const move = moves[i];
            let changed = false;
            for (let row = game.length-1; row >= 0; row--) {
                if(!changed) {
                    if(game[row][move-1]=='-') {
                        game[row][move-1] = player.toString();
                        changed = true;
                    }
                }
            }
            if(checkCol(game, player)) {
                return game;
            }
            if(checkRow(game, player)) {
                return game;
            }
            if(diagonal(game, player)) {
                return game;
            }
            if(player==max) {
                player=1;
            } else {
                player++;
            }
        }
        return game;
        }

    return whatever;
}