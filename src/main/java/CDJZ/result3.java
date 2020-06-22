package CDJZ;

import java.text.DecimalFormat;
import java.util.Scanner;

public class result3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        endNum(num1,num2,num3);
    }
    public static  void endNum(int num1,int num2,int num3){

        double reusltN = (double)num1;
        double n;
        //获得余数
        int n1 = (num3-1)%3;
        //获得商
        int n2 = (num3-1)/3;
        if(n1 == 1){
            n = n2*6 + 1;
        }else{
            n =  n2*6 + 3;
        }
        n = (double)(num1 - num2) / (double)n;
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println(n);
        if(num3<=1){
            System.out.print(0);
        }
        for(int i = 1;i <= num3;i++){
            if(i<num3){
                if(i%3 == 1 ){
                    System.out.print(df.format(reusltN)+",");
                    reusltN = reusltN - n;
                }else if(i%3 ==2 ){
                    System.out.print(df.format(reusltN)+",");
                    reusltN = reusltN -  n*(double)2;
                }else{
                    System.out.print(df.format(reusltN)+",");
                    reusltN = reusltN -  n*(double)3;
                }

            }else {
                System.out.print(df.format(reusltN));
            }

        }
    }
}
