var helpers = require( './helpers' );
var part = require( './csce322assignment02part03' );

var moves = helpers.readMovesFile('test02.moves.cnf');
var game = helpers.readGameFile('test02.game.cnf');
var beforeM = moves.slice(0);
var beforeG = game.slice(0);

var theFunction = part.manyPlayersOneMove( beforeG );
var after = theFunction( beforeM );
console.log( 'game' );
helpers.printGame( after );