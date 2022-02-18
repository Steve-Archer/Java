class Node {
    constructor(value) {
        this.value = value
        this.next = null
        this.prev = null
    }
}
class DoublyLinkedList {
    constructor() {
        this.head = null
        this.tail = null
    }
    push(value){
        let pushedNode = new Node(value)
        if (this.head == null){
            this.head = pushedNode
            this.tail = pushedNode
        }
        else if(this.head == this.tail){
            this.head.next = pushedNode
            pushedNode.prev = this.head
            this.tail = pushedNode
        }else{
            this.tail.next = pushedNode
            pushedNode.prev = this.tail
            this.tail = pushedNode
        }
    }
    shift(value){
        let shiftNode = new Node(value)
        if (this.head == null){
            this.head = shiftNode
            this.tail = shiftNode
        }
        else if(this.head==this.tail){
            this.tail.prev = shiftNode
            shiftNode.next = this.tail
            this.head = shiftNode
        }
        else{
            this.head.prev = shiftNode
            shiftNode.next = this.head
            this.head = shiftNode
        }
    }
    pop(){
        let newTail = this.tail.prev
        newTail.next = null
        this.tail = newTail
    }
    unshift(){
        let newHead = this.head.next
        newHead.prev = null
        this.head = newHead
    }

    displayList(){
        let doublyLinkedList = ""
        let runner = this.head
        while (runner != null) {
            doublyLinkedList += runner.value + "-"
            runner = runner.next
        }
        console.log(doublyLinkedList)
    }
    reverse(){
        let runner = this.head
        let prev = runner
        while(runner!=null){
            let newNode = runner.next
            if(runner==this.head){
                runner.next = null
            }
            else{
                prev.prev = runner
                runner.next = prev
            }
            prev=runner
            runner=newNode
        }
    }




}
let DLL1 = new DoublyLinkedList()
DLL1.push(5)
DLL1.push(6)
DLL1.push(7)
DLL1.displayList()
DLL1.shift(4)
DLL1.shift(3)
DLL1.shift(2)
DLL1.shift(1)
DLL1.displayList()
DLL1.pop()
DLL1.displayList()
DLL1.unshift()
DLL1.displayList()
DLL1.reverse()
DLL1.displayList()


