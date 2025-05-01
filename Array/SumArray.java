package Array;

public class SumArray {

    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[]={1,3,5,7};

        int sumAll = sum(arr);
        System.out.println(sumAll);
    }
}
