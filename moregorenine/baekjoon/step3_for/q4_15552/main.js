const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `5
1 1
12 34
5 500
40 60
1000 1000`
).split('\n')

const count = parseInt(stdin[0])
showSum(count);

function showSum(count) {
    let twoNumbers
    let result = ""
    for (let i = 0; i < count; i++) {
        twoNumbers = stdin[i + 1].split(' ');
        result += (parseInt(twoNumbers[0]) + parseInt(twoNumbers[1])+'\n')
    }
    console.log(result)
}