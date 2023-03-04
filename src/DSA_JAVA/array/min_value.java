package DSA_JAVA.array;

public class min_value {
    public  static void find_min_value(int[] arr){

        if (arr == null || arr.length ==0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int n = arr.length;
        int min_val = arr[0];

        for(int i=0;i<n;i++){
            if(min_val>=arr[i]){
                min_val = arr[i];
            }
        }

        System.out.println("minimum value of the array is : " + min_val);
    }
    public static void main(String[] args){
        int[] myarr = {2,45,6,0,-2,55};

        find_min_value(myarr);
    }
}
