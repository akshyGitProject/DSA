package Array;

public class moveZerosToEnd {

    public static void moveZeros(int arr[]){

        //for non zero element
        int index=0;
        for (int i=0;i< arr.length;i++){

            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }

        }

        //Filling the blanck index by zero
        while(index<arr.length){
            arr[index]=0;
            index++;
        }

    }

    public static void main(String[] args) {

        int arr[]={1,3,0,5,0,2,1,8};
        moveZeros(arr);

        for(int val:arr){
            System.out.println(val+" ");
        }
    }
}
