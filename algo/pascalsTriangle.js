const pascalsTriangle = num => {
    let arr = []
    let temp = [1]
    for(let i=0;i<num;i++){
        if(i==0){
            arr.push(temp)
            temp = [1]
        }
        else {
            for(j=1;j<=i;j++){
                if(j==i){
                    temp.push(1)
                    arr.push(temp)
                    temp = [1]
                }
                else{
                    let sum = arr[i-1][j-1] + arr[i-1][j]
                    temp.push(sum)
                }
            }
        }
    }
    return arr
}
console.log(pascalsTriangle(9))
console.log(pascalsTriangle(10))
console.log(pascalsTriangle(11))
console.log(pascalsTriangle(12))
console.log(pascalsTriangle(50))

