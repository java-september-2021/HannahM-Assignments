public class SinglyLinkedList {
    public Node head;

    public void setNode(){this.head = null;}

    public SinglyLinkedList() {
        setNode();
    }
    private boolean IsEmpty(){
        return setNode();
    }

    public void AddFront(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void DisplayValues() {
        if(IsEmpty()) {
            System.out.println("List is empty");
            return;
        } else{
            Node runner = this.head;
        while(runner.next != null) {
            System.out.println("$$$$$$$$");
            String s = String.format("Node Value: %d :: Next Value: %d", runner.value, runner.next.value);
            System.out.println(s);
            runner = runner.next;
        }
        System.out.println("$$$$$$$$");
        String s = String.format("Node Value: %d :: Next Value: null", runner.value);
        System.out.println(s);
        }  
        
    public Integer remove(){
        Node runner = head;
        int valRet;
        if(IsEmpty())
            return null;
        if(head.next == null) {
            valRet = head.value;
            head = null;
            return valRet;
        }
        while(runner.next.next != null){
            runner = runner.next;
        }
        valRet = runner.next.value;
        runner.next = null;
        return valRet;
    }
}
