package Array;

public class secondLargest {
    public static int secondLarge(int arr[]){

        int largest=arr[0];
        int secLarge=arr[1];

        for(int i=0;i< arr.length;i++){

            if(arr[i]>largest){
                secLarge=largest;
                largest=arr[i];

            } else if (arr[i]>secLarge && arr[i]<largest) {
                secLarge=arr[i];
            }
        }

        return secLarge;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,2,7,33,2,77,88};

       int secondlargeElement= secondLarge(arr);
        System.out.println(secondlargeElement);


    }
}
