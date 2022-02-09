const removeDuplicate = arr => {
    let memo = {}
    let count = 0
    for(let i = 0; i < arr.length; i++){
        console.log(i)
        if(arr[i] in memo){
            let j = i + 1
            while(arr[i] == arr[j]){
                j++
            }
            arr[i] = arr[j]
            i--
            count++
            console.log("***" + arr,count,memo)
        }else{
            memo[arr[i]] = true
        }
        console.log(memo, count, arr)
    }
    return arr
}
console.log(removeDuplicate([1,2,2,3,4,5,5,5,6,7,7,8,10]))