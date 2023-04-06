package DSA_JAVA.StriverA2Z_Sheet.BasicMaths;

import java.util.Scanner;

public class CountDigits {
    public void IntTOString(int N){
        String s = Integer.toString(N);
        System.out.println(s.length());
    }

    public int totalNUmbers(int N){
        int count=0;
        int num = N;

        while (num > 0){
            num = num/10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        CountDigits cd = new CountDigits();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("Number of Digits in a number " + N + " is : ");
        cd.IntTOString(N);
        System.out.println();

        int cnt = cd.totalNUmbers(N);
        System.out.println(cnt);



    }
}
