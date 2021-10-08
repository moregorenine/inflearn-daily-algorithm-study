const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync('0', "utf8") :
        `150
266
427`
).split("\n")

const multiple = parseInt(stdin[0]) * parseInt(stdin[1]) * parseInt(stdin[2]);

const strMultiple = String(multiple);

let result = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

for (let i = 0; i < strMultiple.length; i++) {
    result[parseInt(strMultiple.charAt(i))]++
}

for (let i = 0; i < result.length; i++) {
    console.log(result[i])
}
