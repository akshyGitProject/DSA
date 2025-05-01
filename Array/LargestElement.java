package Array;

public class LargestElement {

    public static int findLargest(int arr[]){

        int largest=arr[0];

        for(int i=0;i< arr.length;i++){

            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        System.out.println("Hello");

        int arr[]={20,40,50,29,88};

        int largestElement = findLargest(arr);
        System.out.println(largestElement);

    }
}
