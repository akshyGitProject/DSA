public class LinearTime {


    static void linear(){
        int arr[]={1,4,3,56,2,4,5};

        for(int i=0;i<arr.length;i++){
            System.out.println((i+1)+"Times");
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        linear();

    }
}
