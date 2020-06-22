package CDJZ.N23;

import java.util.Scanner;

public class saveMoney {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("请输入");
        String str = num.nextLine();
        String[] s = str.split(",");
        int[] param = new int[s.length];
        for(int i=0;i<s.length;i++){
            param[i] = Integer.parseInt(s[i]);
        }
        resultMoney(param);
    }
    public static void resultMoney(int[] param){
        boolean carry = false;
        for(int i = param.length -1;i>=0;i--){
            if(i == param.length -1 || carry == true){
                param[i] += 1;
            }
            if(param[i] == 10){
                param[i] = 0;
                carry = true;
            }else{
                carry = false;
            }
        }
        for(int i=0;i<param.length;i++){
            if(i!=param.length-1){
                System.out.print(param[i]+",");
            }else{
                System.out.print(param[i]);

            }
        }
    }

}
