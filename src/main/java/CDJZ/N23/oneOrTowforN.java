package CDJZ.N23;

import java.util.Scanner;

public class oneOrTowforN {
    public static void main(String[] args) {
     double a =3.5;
     double b = 1.5;
     System.out.print((int)a+b/b);



    }

    public static  int  countOfN(int n){
        int count = 0;
        while(n>0){
            if(n<=2){
                return n;
            }else{
                count=countOfN(n-1)+countOfN(n-2);
                return count;
            }
        }
        return count;
    }
}


