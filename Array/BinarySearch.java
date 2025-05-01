package Array;

public class BinarySearch {

    public static int binarySearch(int arr[]){
        int index=-1;
        int low=0;
        int high=arr.length-1;
        int target=1;

        while(low<=high){

            int midIndex=low+(high-low)/2;
            if(target==arr[midIndex]){
                return midIndex;

            }
            if(target<arr[midIndex]){
                high=midIndex-1;
            }

            if(target>arr[midIndex]){
                low=midIndex+1;
            }

        }


        return -1;
    }

    public static void main(String[] args) {

        int arr[]={1,4,5,6,8,9,11,22,33,44,66};

        int index = binarySearch(arr);
        System.out.println("Index of Target is : "+index);
    }
}
