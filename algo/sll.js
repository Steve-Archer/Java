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
}

let singlyLinkedList = new SinglyLinkedList()
singlyLinkedList.pushNode(3)
singlyLinkedList.pushNode(12)
singlyLinkedList.pushNode(15)
singlyLinkedList.pushNode(9)
singlyLinkedList.displayList()


