const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync('/dev/stdin').toString()
        : `1 2`
).split(' ')

const number1 = parseInt(stdin[0], 10)
const number2 = parseInt(stdin[1], 10)

if (number1 > number2) {
    console.log(">");
} else if (number1 < number2) {
    console.log("<");
} else {
    console.log("==");
}
