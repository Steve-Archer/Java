const balanceIndex = (arr, sum=0, index=0) => {
    if(index>=arr.length) return -1
    for(let i=0;i<arr.length;i++){
        sum += arr[i]
    }
    let total = 0
    let i = 0
    sum-=arr[index]
    while(i<index){
        total += arr[i]
        i++
    }
    if(total == sum/2)return index
    else {
        index +=1
        return balanceIndex(arr, sum = 0, index)
    }
}
console.log(balanceIndex([1,2,4,9,20])) // -1
console.log(balanceIndex([4,1,2,4,9,-20,18])) // 3
console.log(balanceIndex([-2,5,7,0,3])) // 2
