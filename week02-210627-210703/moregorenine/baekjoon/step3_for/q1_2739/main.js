const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `2`
)

const number = parseInt(stdin)

function displayMultiplicationTable(number, count) {
    for (let i = 1; i <= count; i++) {
        console.log(`${number} * ${i} = ${number * i}`);
    }
}

displayMultiplicationTable(number, 9)
