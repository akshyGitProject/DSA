package Singly;

public class LinkedList {

    Node head=null;

    //Insert At Begining:
        public void InsertAtBegining(int item){

            Node newNode=new Node(item);

            //if no node is present
            if(head==null){
                head=newNode;
                return;
            }
            //if already nodes are present
            newNode.next=head.next;
            head=newNode;



        }
    //Insert at Last
    public void InsertAtLast(int item){
        Node newNode=new Node(item);

        //if no node is present
        if(head==null){
            head=newNode;
            return;
        }

        //travesr till got last node
        Node temp=head;

        while(temp.next!=null){
        temp=temp.next;
        }

        temp.next=newNode;

    }


    //Insert At Specific Position 2:

}
