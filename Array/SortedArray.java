package Array;

public class SortedArray {

    public static boolean sorted(int arr[]){

        //Assume
        boolean isSorted=true;

        for (int i=0;i< arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                isSorted=false;
            }
        }

        return isSorted;
    }
    public static void main(String[] args) {
        int arr[]={10,3,5,6,7,8};


        boolean sorted = sorted(arr);
        System.out.println("Array is Sorted? : "+sorted);
    }
}
