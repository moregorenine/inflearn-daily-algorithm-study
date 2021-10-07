const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `12
5`
).split('\n')

const positionX = parseInt(stdin[0], 10)
const positionY = parseInt(stdin[1], 10)

function printQuadrant(positionX, positionY) {

    if (positionX > 0 && positionY > 0) {
        console.log(1);
    } else if (positionX < 0 && positionY > 0) {
        console.log(2);
    } else if (positionX < 0 && positionY < 0) {
        console.log(3);
    } else {
        console.log(4);
    }
}

printQuadrant(positionX, positionY)
