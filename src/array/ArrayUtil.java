package array;

public class ArrayUtil {

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void PrintstringArray(String[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public  void arrayDemo(){
//        int[] myArr = new int[5];
//        //printArray(myArr);
//        myArr[0] = 5;
//        myArr[1] = 1;
//        myArr[2] = 4;
//        myArr[3] = 3;
//        myArr[4] = 2;
//        printArray(myArr);
//       // myArr[5] = 55;
//        System.out.println(myArr.length);


        String[] myarr = new String[5];
        myarr[0] = "A";
//        myarr[1] = "Abhay";
//        myarr[2] = "Atul";
//        myarr[3] = "Anand";
//        myarr[4] = "Ayush";
//        myarr[5] = "None";

        PrintstringArray(myarr);


    }

    public  static  void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
}
