package DSA_JAVA.array;

public class second_max {

    public static int second_max_value(int[] arr){
        int n = arr.length;
        int first_max = arr[0];
        int sec_max = first_max;

        for(int i=0;i<n;i++){
            if(first_max <=arr[i]){
                sec_max = first_max;
                first_max = arr[i];
            }
        }

        return  sec_max;
    }

    public static void main(String[] args){
        int[] myarr = {2,45,6,0,-2,55};

        System.out.println(second_max_value(myarr));
    }
}
