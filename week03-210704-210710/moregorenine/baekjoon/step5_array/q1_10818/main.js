const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `5
20 10 35 30 7`
).split("\n")

const numbers = stdin[1].split(' ')
printMinMax(numbers);

function printMinMax(numbers) {
    let current = parseInt(numbers[0])
    let min = current, max = current;
    for (let i = 1; i <= numbers.length; i++) {
        current = parseInt(numbers[i])
        if (current > max) {
            max = current;
        }
        if (current < min) {
            min = current;
        }
    }
    console.log(`${min} ${max} `)
}
