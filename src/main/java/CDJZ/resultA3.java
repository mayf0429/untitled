package CDJZ;

import java.util.Scanner;

public class resultA3 {

    public static void main(String[] args) {
        System.out.print("输入数组A1：");
        Scanner sc = new Scanner(System.in);
        String strA1 = sc.next().toString();
        String[] arrA1  = strA1.split(",");
        if(arrA1.length > 10){
            String[] arrA11 = new String[10];
            for(int i = 0;i<10;i++){
                arrA11[i]=arrA1[i];
            }
            arrA1 = arrA11;
        }

        System.out.print("输入数组A2：");
        String strA2 = sc.next().toString();
        String[] arrA2  = strA2.split(",");
        if(arrA2.length > 10){
            String[] arrA21 = new String[10];
            for(int i = 0;i<10;i++){
                arrA21[i] = arrA2[i];
            }
            arrA2 = arrA21;
        }
        returnA3(arrA1,arrA2);

    }

    public static  void returnA3(String[] A1,String[] A2){
        int countA1 = 0;
        int countA2 = 0;
        int countA3 = 0;
        String [] A3 = new String[A1.length+A2.length];

        while((countA1 < A1.length &&  countA2 < A2.length)){
            if(Integer.parseInt(A1[countA1]) <= Integer.parseInt(A2[countA2])){
                A3[countA3++] = A1[countA1++];
            }else{
                A3[countA3++] = A2[countA2++];
            }
        }

        if(countA1 == A1.length){
            while(countA2 < A2.length){
                A3[countA3++] = A2[countA2++];
            }
        }else{
            while(countA1 < A1.length){
                A3[countA3++] = A1[countA1++];
            }
        }
        for(int j = 0; j<A3.length;j++) {
            if( j != A3.length-1){
                System.out.print(A3[j]+",");
            }else {
                System.out.print(A3[j]);

            }
        }
    }

}
