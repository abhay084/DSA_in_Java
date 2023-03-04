package DSA_JAVA.array;

public class reverse_array {

    public static void printArray(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse_an_array(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        printArray(arr);
    }
    public static void main(String[] args){
        int[] myarr = {1,2,3,4,5,6,7,8,9};
        reverse_an_array(myarr);
    }
}
