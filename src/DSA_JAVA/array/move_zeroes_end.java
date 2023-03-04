package DSA_JAVA.array;

public class move_zeroes_end {

    public static void printArray(int[] arr){
        int n= arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void move_zeroes_to_end(int[] arr){

        int n = arr.length;
        // two pointerrs method

        int j=0;

        for(int i=0;i<n;i++){

            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }

        printArray(arr);
    }

    public  static void  main(String[] args){
        int[] myarr = {0,0,0,0,1,0,-3,0,5,10};

        move_zeroes_to_end(myarr);
    }
}
