const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync('/dev/stdin').toString()
        : `5 8 4`
).split(' ')

const number1 = parseInt(stdin[0], 10)
const number2 = parseInt(stdin[1], 10)
const number3 = parseInt(stdin[2], 10)

console.log((number1 + number2) % number3)
console.log(((number1 % number3) + (number2 % number3)) % number3)
console.log((number1 * number2) % number3)
console.log(((number1 % number3) * (number2 % number3)) % number3)