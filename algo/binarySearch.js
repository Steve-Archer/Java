const binarySearch = (arr, value, start = 0, end = arr.length-1) => {
    let mid = Math.floor((start+end)/2)
    if(value == arr[mid]) return true
    if(start==end && value != arr[mid]) return false
    if(value < arr[mid]) return binarySearch(arr, value, start, mid-1)
    if(value > arr[mid]) return binarySearch(arr, value, mid+1, end)
}
x = [2,4,5,7,8,12,22,24,27,45,55,56,58,66,67,68,90,100]
console.log(binarySearch(x, 68)) // true
console.log(binarySearch(x, 51)) // false
