package Array;

public class Occurences {

    public static int NumberofOccurences(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==3){
                count++;
            }
        }


        return count;

    }

    public static void main(String[] args) {
        int arr[]={3,5,6,7,3,7,8,3,9,3};

        int i = NumberofOccurences(arr);
        System.out.println("Number of Occurneces of 3 : "+i);

    }
}
