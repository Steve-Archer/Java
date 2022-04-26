
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return;
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    public Integer remove(){
        Node runner = head;
        int valueToReturn;
        while(runner.next.next != null){
            runner = runner.next;
        }
        valueToReturn = runner.next.value;
        runner.next = null;
        return valueToReturn;
    }
    public void printValues(){
        Node runner = this.head;
        while(runner.next != null){
            System.out.print(runner.value + " - ");
            runner = runner.next;
        }
    }
}