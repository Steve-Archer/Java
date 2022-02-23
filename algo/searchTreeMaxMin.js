class Node{
    constructor(valueInput){
        this.value = valueInput;
        this.left = null;
        this.right = null;
    }
}


class BST{
    constructor(){
        this.root = null;
    }


    insert(valueInput){
        //create a node with thee value input and insert it into the tree using the rules of a bst
        let newNode = new Node(valueInput)
        //if the root is null we want to insert a new node and make it the valueInput.
        if(this.root == null){
            //make root equal to new node
            this.root = newNode
            return this
        }
        else {
            let current = this.root
            while(current != null){
                if(valueInput > current.value){
                    if(current.right == null){
                        current.right = newNode
                        return this
                    }else{
                        current = current.right
                    }
                }
                else{
                    if(current.left == null){
                        current.left = newNode
                        return this
                    }else{
                        current = current.left
                    }
                }
            }
        }
        return this
    }
    findMin(){
        let runner = this.root
        while(runner.left != null){
            console.log("*** "+runner.value)
            runner = runner.left
        }
        console.log("the minvalue is "+runner.value) 
    }
    findMax(){
        let runner = this.root
        while(runner.right != null){
            runner = runner.right
        }
        console.log("the maxvalue is "+runner.value)
    }
}


let bst1 = new BST()

bst1.insert(5).insert(3).insert(12).insert(10).insert(1).insert(4).insert(7).insert(14).insert(2).findMin()
bst1.findMax()
