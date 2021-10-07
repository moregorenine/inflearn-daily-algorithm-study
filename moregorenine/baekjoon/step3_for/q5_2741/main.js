const fs = require('fs')
const stdin = (process.platform === 'linux'
        ? fs.readFileSync(0, "utf8")
        : `5`
)

const count = parseInt(stdin)

printUntilNumber(count)

function printUntilNumber(count) {
    let result = ""
    for (let i = 1; i <= count; i++) {
        result += (i + '\n')
    }
    console.log(result)
}
