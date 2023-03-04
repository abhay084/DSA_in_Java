package DSA_JAVA.array;

public class resize_array {

    public static int[] new_size(int[] arr,int size){

        int[] temp = new int[size];
        int n = arr.length;
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
        }

        arr = temp;

        return arr;

    }

    public static void main(String[] args){

        int[] myarr={1,2,3,4};

        int capacity = 10;
        System.out.println(myarr.length);

        myarr =  new_size(myarr,capacity);

        System.out.println(myarr.length);
    }
}
