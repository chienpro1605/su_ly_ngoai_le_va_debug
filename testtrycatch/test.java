package testtrycatch;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int a= 10;
        int b= 0;
        try {
            double res = div(a,b);
            System.out.println(a + "/" + b + "= " + res);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("abc");
        String str = null;
        showLength(str);
        int[] arr = new int[]{1,2,3,4};

        System.out.println("arr[5]= " + arr[2] );

        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên");

        try {
            x= scanner.nextInt();
            System.out.println("x = "+x);
        }catch (Exception e){
           e.printStackTrace();
        }
    }
    static double div(int a, int b){
        if (b == 0){
            throw new ArithmeticException("phép chia không thể thực hiện do mẫu bằng 0");
        }
        return a/b;
    }
    static void showLength(String str){
        if (str != null){
            System.out.println("chiều dài của mảng là: "+ str.length());
        }else {
            System.out.println("chiều dài của mảng là: null");
        }

    }
}
