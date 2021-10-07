const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync('0', "utf8") :
        `3
29
38
12
57
74
40
85
61`
).split("\n")

// printMaxNum(stdin);
//
// function printMaxNum(numbers) {
//     let maxNumber = 0, maxNumberIndex = 0;
//
//     numbers.forEach((number, index) => {
//         if (parseInt(number) > maxNumber) {
//             maxNumber = parseInt(number);
//             maxNumberIndex = index + 1;
//         }
//     })
//     console.log(`${maxNumber}\n${maxNumberIndex}`)
// }
const numbers = stdin.map(Number)
const max = Math.max(...numbers)
console.log(max)
console.log(numbers.indexOf(max) + 1)