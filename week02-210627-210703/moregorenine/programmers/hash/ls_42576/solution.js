let participants = ["leo", "kiki", "eden"]
let completions = ["eden", "kiki"]
console.log("leo" === solution(participants, completions));

participants = ["marina", "josipa", "nikola", "vinko", "filipa"]
completions = ["josipa", "filipa", "marina", "nikola"]
console.log("vinko" === solution(participants, completions));

participants = ["mislav", "stanko", "mislav", "ana"]
completions = ["stanko", "ana", "mislav"]
console.log("mislav" === solution(participants, completions));

function solution(participants, completions) {
    let answer = ""
    let hm = new Map();
    for (let i = 0; i < participants.length; i++) {
        hm.set(participants[i], (hm.get(participants[i]) || 0) + 1)
    }
    for (let i = 0; i < completions.length; i++) {
        hm.set(completions[i], (hm.get(completions[i]) || 0) - 1)
    }
    hm.forEach((value, key) => {
        if (value > 0) {
            answer = key
        }
    })
    
    return answer
}