class Node {
    constructor(value) {
        this.value = value
        this.left = null
        this.right = null
    }

    lookAtMe() {
        if(this.left) {
            console.log(this)
            this.left.lookAtMe()
        }
        console.log(this.value)
        if(this.right) {
            console.log(this)
            this.right.lookAtMe()
        }
    }
}
class BinarySearchTree {
    constructor(){
        this.root = null
    }
    insert(value){
        let newNode = new Node(value)
        if(this.root == null){
            this.root = newNode
        }else{
            let add = (newNode ,runner=this.root) => {
                if(newNode == runner && runner.left == null && runner.right==null){
                    return runner
                }
                else if(newNode < runner && runner.left != null){
                    return add(newNode, runner=runner.left)
                }
                else if(newNode < runner && runner.left == null){
                    runner.left = newNode
                    return add(newNode, runner=runner.left)
                }
                else if(newNode >= runner && runner.right != null){
                    return add(newNode, runner=runner.right)
                }
                else if(newNode >= runner && runner.right == null){
                    runner.right = newNode
                    
                    return add(newNode, runner=runner.right)
                }
            }
            return add(newNode)
        }
    }
    display(){
        if(this.root) {
            this.root.lookAtMe()
        }
    }
    findMin(){
        let runner = this.root
        while(runner.left != null){
            console.log(runner)
            runner = runner.left
        }
        return runner
    }
}

let bst1 = new BinarySearchTree()
bst1.insert(5)
bst1.display()
bst1.insert(6)
bst1.display()
bst1.insert(11)
bst1.display()
bst1.insert(2)
bst1.display()
bst1.insert(3)
bst1.display()
bst1.findMin()





