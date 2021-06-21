const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync('/dev/stdin').toString()
        : `100`
)

const number = parseInt(stdin, 10)

function printScoreToGrades(number) {
    let grades = "";
    if (number >= 90) {
        grades = "A";
    } else if (number >= 80) {
        grades = "B";
    } else if (number >= 70) {
        grades = "C";
    } else if (number >= 60) {
        grades = "D";
    } else {
        grades = "F";
    }
    console.log(grades);
}

printScoreToGrades(number)