import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr1 = new int[n/2];
            int[] arr2 = new int[n/2];

            for(int i=0;i<n/2;i++){
                arr1[i] = i;
            }
            for(int i=n/2;i<n;i++){
                arr2[i] = i;
            }

            int[] P = new int[n];

            for(int i=0;i<n/2;i++){
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
            for(int i=0;i<n/2;i++){
                System.out.print(arr2[i] + " ");
            }
        }
    }
}