const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync('/dev/stdin').toString()
        : `2000`
)

const year = parseInt(stdin, 10)

function isLeapYear(year) {
    if ((year % 4 == 0 && year % 100 != 0)
        || year % 400 == 0) {
        console.log(1);
    } else {
        console.log(0);
    }
}

isLeapYear(year)
