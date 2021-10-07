const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `3`
)

const number = parseInt(stdin)
showSum(number);

function showSum(number) {
    let sum = 0;
    for (let i = 1; i <= number; i++) {
        sum += i;
    }
    console.log(`${sum}`)
}
