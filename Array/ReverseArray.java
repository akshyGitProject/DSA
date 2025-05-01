package Array;

public class ReverseArray {

    public static int[] reverseArray(int array[]){

//        for(int i=0;i<array.length/2;i++){
//            int temp=array[i];
//            array[i]=array[array.length-1-i];
//            array[array.length-i-1]=temp;
//        }

        int temp[]=new int[array.length];

        for(int i=array.length-1;i>=0;i--){

            temp[temp.length-1-i]=array[i];
        }
        array=temp;
        return temp;

    }
    public static void main(String[] args) {

        int arr[]={12,23,45,56,89};

        int[] ints = reverseArray(arr);

        for(int x:ints){
            System.out.print(x+" ");
        }

    }
}
