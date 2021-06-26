const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `5
1 1
2 3
3 4
9 8
5 2`
).split('\n')

const count = parseInt(stdin[0])
let twoNumbers = setTwoNumbersUntilCount(count);
showTwoNumbers(twoNumbers);

function setTwoNumbersUntilCount(count) {
    let twoNumbers = new Array(count)
    for (let i = 0; i < count; i++) {
        twoNumbers[i] = stdin[i + 1];
    }
    return twoNumbers;
}

function showTwoNumbers(twoNumbers) {
    for (let key in twoNumbers) {
        let twoNumber = twoNumbers[key].split(" ");
        console.log(`${parseInt(twoNumber[0]) + parseInt(twoNumber[1])}`);
    }
}