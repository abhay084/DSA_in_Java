package DSA_JAVA.strings;

import java.util.Scanner;

public class Codechef {

    public int isVowel(char x){
        char arr[] = {'a','e','i','o','u'};
        for(int i=0;i<5;i++){
            if(arr[i] == x){
                return 0;
            }
        }
        return 1;
    }
    public Boolean hardPron(int N, String str){

        for (int i=0;i<N;i++){
            int cnt =0;
            for(int j=i;j<4;j++){
                int temp = isVowel(str.charAt(j));
                if(temp == 1){
                    cnt++;
                }

            }
            if(cnt == 4 && N>=4){
                return true;
            }

        }

        return  false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.nextLine();

        Codechef cd = new Codechef();
        boolean x = cd.hardPron(N,str);

        if(x == true){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }


    }
}
