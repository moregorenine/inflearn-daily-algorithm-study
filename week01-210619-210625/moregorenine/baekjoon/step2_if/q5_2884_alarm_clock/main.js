const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `10 10`
).split(' ')

const inHour = parseInt(stdin[0])
const inMinute = parseInt(stdin[1])

function setAlramTime(inHour, inMinute, beforMinute) {
    let outHour = inHour;
    let outMinute = inMinute - beforMinute;

    if (outMinute < 0) {
        outHour = (outHour - 1 < 0) ? --outHour + 24 : --outHour;
        outMinute += 60;
    }

    console.log(`${outHour} ${outMinute}`);

}

setAlramTime(inHour, inMinute, 45)
