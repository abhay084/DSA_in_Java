package DSA_JAVA.array;

public class LC2535 {

    public static int element_sum(int[] arr){
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        return  sum;
    }

    public static int digit_sum(int[] arr){
        int sum =0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            int sum1=0;
            int x = arr[i];
            while(x>0){
                int rem = x%10;
                x = x/10;
                sum1 = sum1 + rem;
            }
            sum = sum + sum1;
        }
        return  sum;
    }

    public static void  main(String[] args){
        int[] myarr = {1,15,6,3};

        int ele = element_sum(myarr);
        int dig = digit_sum(myarr);

        System.out.println(ele - dig);
    }
}
