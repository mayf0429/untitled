package CDJZ.N23;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("请输入");
        String str = num.nextLine();
        String[] s = str.split(",");
        String str1 = "";
        for(int i=0;i<s.length;i++){
            str1 +=s[i];
        }
        int num1 = Integer.parseInt(str1);
        num1 += 1;
        String str2 = String.valueOf(num1);
        char[] s1 = str2.toCharArray();
        for(int i=0;i<s1.length;i++){
            if(i!=s1.length-1){
                System.out.print(s1[i]+",");
            }else{
                System.out.print(s1[i]);
            }
        }
    }
}
