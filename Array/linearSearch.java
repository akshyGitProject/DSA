package Array;

public class linearSearch {

    public static int search(int arr[]){

        int index=-1;
        int target=222;
        for(int i=0;i< arr.length;i++){

            if(arr[i]==target){
            index=i;
            break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,8,9,34,4,2};
        int index = search(arr);
        if(index==-1){
            System.out.println("Index not found");
        }else {
            System.out.println("Index of Target is : " + index);
        }

    }
}
