package DSA_JAVA.array;

public class remove_even {

    public static void fuc_remove_even(int[] arr){
        int n = arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                cnt++;
            }
        }
        int[] result = new int[cnt];
        int cur=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                result[cur] = arr[i];
                cur++;
            }
        }


        for(int i=0;i<cur;i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int[] myarr = {3,2,4,7,10,6,5,1,3,6,7,89,9,99,101};
         fuc_remove_even(myarr);
    }
}
