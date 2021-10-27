const fs = require('fs')
const stdin = fs.readFileSync('0', 'utf8').trim().split('\n')

let result = [];

for (let i = 0; i < stdin.length; i++) {
    result.push(parseInt(stdin[i]) % 42);
}

let setResult = new Set(result);

console.log(setResult.size)
