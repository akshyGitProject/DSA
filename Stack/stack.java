package Stack;

public class stack {

    private int[] array;
    private int maxSize;
    private int top=0;

    public stack(int size){

        this.maxSize=size;
        array=new int[maxSize];
        top=-1;
    }

    //Push Data
    public  void Push(int data){

        if(top==maxSize){
            System.out.println("Stack is full!!!");
        } else {
            top++;
            array[top]=data;
        }
    }

    //Pop Data or Delete Data
    public int Pop(){
        if(top==-1){
            System.out.println("Stack is empty ");
            return -1;
        }else {

            int popElement=array[top];
            top--;
            return popElement;
        }

    }


    //Peek
    public int  Peek(){
        if(top==-1){
            System.out.println("Stack is empty ");
            return -1;
        }else {
            return array[top];
        }
    }

    //Display Data
    public void Display(){

        if(top==-1){
            System.out.println("Stack is empty ");
        }

        for(int i=0;i<=top;i++){
            System.out.print(array[i]+" ");
        }
    }
}
