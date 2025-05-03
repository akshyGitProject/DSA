package Stack;

public class mainLinkedList {
    public static void main(String[] args) {
        linkedList stackLinkedList = new linkedList();
        stackLinkedList.display();
        stackLinkedList.push(10);
        stackLinkedList.push(20);
        stackLinkedList.push(30);
        stackLinkedList.push(40);
        stackLinkedList.display();
        System.out.println(stackLinkedList.pop());
        stackLinkedList.display();
        System.out.println(stackLinkedList.peek());
        stackLinkedList.display();
    }
}
