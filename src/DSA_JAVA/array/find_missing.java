package DSA_JAVA.array;

public class find_missing {

    public static int find_missing_number(int[] arr, int range){
        int missing;

        int sum = (range * (range + 1))/2;

        int arr_sum =0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            arr_sum = arr_sum + arr[i];
        }

        return  sum - arr_sum;
    }

    public static void main(String[] args){
        int[] myarr = {1,2,3,4,6};
        int range = 6;

        System.out.println(find_missing_number(myarr,range));
    }
}
