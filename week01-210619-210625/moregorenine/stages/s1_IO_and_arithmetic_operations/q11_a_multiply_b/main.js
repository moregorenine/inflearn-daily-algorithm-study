const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync('/dev/stdin').toString()
        : `472
385`
).split('\n')

const number1 = parseInt(stdin[0], 10)
const number2 = parseInt(stdin[1], 10)
const countTen = 1
const total = 0

printResult(number1, number2, countTen, total)

function printResult(number1, number2, countTen, total) {
    let digit = number2 % 10
    let rest = Math.floor(number2 / 10)
    if (rest >= 0) {
        let result = number1 * digit
        console.log(result)
        total += result * countTen
        countTen = countTen * 10
    }

    if (rest > 0) {
        printResult(number1, rest, countTen, total)
    } else {
        console.log(total)
    }
}