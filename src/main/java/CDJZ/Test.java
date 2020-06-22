package CDJZ;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {              //程序的入口
        Scanner num = new Scanner(System.in);
        out.println("请输入第一个数");
        String str = num.nextLine();
        char[] c = str.toCharArray();
        int [] result = new int[c.length];

        out.println("请输入第二个数");
        String str1 = num.nextLine();
        char[] c1 = str1.toCharArray();
        int [] result1 = new int[c1.length];


        if(c.length>c1.length){
            int [] resultNum = new int[c.length];
            boolean flag = false;
            for(int i = c.length -1; i>=0;i--){
                result[i] = Integer.parseInt(c[i]+"");
                int x = i - (c.length-c1.length);
                if(x>=0){
                    result1[x] = Integer.parseInt(c1[x]+"");
                    int resultum = 0;
                    if(flag){
                        resultum =   result1[x] + result[i] + 1;
                    }else{
                        resultum =   result1[x] + result[i];
                    }
                    if(resultum >=10 ){
                        resultNum[i] = resultum - 10;
                        flag = true;
                    }else{
                        resultNum[i] = resultum ;
                        flag = false;
                    }
                }else{
                    resultNum[i] =  result[i];
                }

            }
            for(int i =  0; i<resultNum.length;i++){
                System.out.print(resultNum[i]);
            }
        }
    }
}


