class Node {
    constructor(value,) {
        this.value = value
        this.next = null
    }
}
class SinglyLinkedList {
    constructor() {
        this.head = null
    }
    pushNode(value) {
        let pushedNode = new Node(value)
        if (this.head == null) {
            this.head = pushedNode
        }
        else {
            let runner = this.head
            while (runner.next != null) {
                runner = runner.next
            }
            runner.next = pushedNode
        }
    }
    
    displayList(){
        let singlyLinkedList = ""
        let runner = this.head
        while (runner != null) {
            singlyLinkedList += runner.value + "-"
            runner = runner.next
        }
        console.log(singlyLinkedList)
    }
    reverseList(){ 
        let runner = this.head
        let previousNode = runner
        while(runner != null){
            let newNode = runner.next
            if(runner == this.head){
                runner.next = null
            }else{
                runner.next = previousNode
            }
            previousNode = runner
            if(newNode == null){
                this.head = runner
            }
            runner = newNode
        }
    }

}

let singlyLinkedList = new SinglyLinkedList()
singlyLinkedList.pushNode(3)
singlyLinkedList.pushNode(7)
singlyLinkedList.pushNode(23)
singlyLinkedList.pushNode(0)
singlyLinkedList.pushNode(12)
singlyLinkedList.pushNode(15)
singlyLinkedList.pushNode(9)
singlyLinkedList.displayList()
singlyLinkedList.reverseList()
singlyLinkedList.displayList()

