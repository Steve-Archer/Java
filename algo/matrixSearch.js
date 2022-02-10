const matrixSearch = (bigArr, smallArr) => {
    let found = false
    let start = []
    for(let i=0;i<smallArr.length;i++){
        for(let j=0;j<smallArr[i].length;j++){
            let x = 0
            while(x<bigArr.length){
                for(let y=0;y<bigArr[x].length;y++){
                    if(smallArr[i][j]==bigArr[x][y] && found == false){
                        start = [x, y]
                        found = true
                        console.log(start)
                    }
                }
                x++
            }
        }
        for(let i=0;i<smallArr.length;i++){
            for(let j=0;j<smallArr[i].length;j++){
                if(smallArr[i][j] == bigArr[start[0]+i][start[1]+j]){
                    found == true
                }
                else return false
            }
        }
    }
    return found
}


let x = [
    [12, 34, 45, 67],
    [98, 87, 76, 65],
    [56, 67, 78, 89],
    [54, 43, 32, 21]
]
let y = [
    [67, 78],
    [43, 32]
]
let z = [
    [67, 77],
    [43, 32]
]
const matrixSearch = (bigArr, smallArr) => {
    let found = false
    let start = []
    let x = 0
    while (x < bigArr.length) {
        for (let y = 0; y < bigArr[x].length; y++) {
            if (smallArr[0][0] == bigArr[x][y] && found == false) {
                start = [x, y]
                console.log(start)
                for (let i = 0; i < smallArr.length; i++) {
                    for (let j = 0; j < smallArr[i].length; j++) {
                        if (smallArr[i][j] == bigArr[start[0] + i][start[1] + j] && j == smallArr[i].length-1 && i == smallArr.length-1){
                            return true
                        }
                        if (smallArr[i][j] == bigArr[start[0] + i][start[1] + j]) {
                            found = true
                        }
                        else {
                            found = false
                            break
                        }
                        
                    }
                }
                
            }
        }
        x++
    }
    return false
}

console.log(matrixSearch(x, y)) //true
console.log(matrixSearch(x, z))
