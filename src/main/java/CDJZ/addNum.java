package CDJZ;

import java.util.Scanner;

import static java.lang.System.out;

public class addNum {
    public static void main(String[] args) {
        long d = 2;
        //程序的入口
        Scanner num = new Scanner(System.in);
        System.out.println("请输入第一个数");
        String str = num.nextLine();
        char[] char1 = str.toCharArray();

        System.out.println("请输入第二个数");
        String str1 = num.nextLine();
        char[] char2 = str1.toCharArray();

        getNum(char1,char2);

    }
    public static  void getNum(char[] char1,char[] char2){

        char[] c;
        char[] c1;
        //比较两个数字的长度 ，取出最长的进行遍历
        if(char1.length>char2.length){
             c = char1;
            c1 = char2;
        }else {
            c = char2;
            c1 = char1;
        }
        int [] resultC = new int[c.length];
        int [] resultC1 = new int[c1.length];
        int [] resultNum = new int[c.length];
            //flag表示前一位运算有没有进位
            boolean flag = false;
            //存放两个数字相加的值
            int resultM;
            //遍历应从后往前，从个位数字开始
            for(int i = c.length -1; i>=0;i--){
                resultC[i] = Integer.parseInt(c[i]+"");
                //此为较短的数字的遍历
                int x = i - (c.length-c1.length);
                if(x>=0){
                    // 当x大于零时进行此操作不然会报错
                    resultC1[x] = Integer.parseInt(c1[x]+"");

                    //flag表示前一位运算有没有进位，进位多加一
                    if(flag){
                        resultM =   resultC1[x] + resultC[i] + 1;
                    }else{
                        resultM =   resultC1[x] + resultC[i];
                    }
                    //大于十需要进位并减去十位数字
                    if(resultM >=10 ){
                        resultNum[i] = resultM - 10;
                        flag = true;
                    }else{
                        resultNum[i] = resultM ;
                        flag = false;
                    }
                }else{
                    if(flag){
                        resultM =  resultC[i] + 1;
                        if(resultM >=10 ){
                            resultNum[i] = resultM - 10;
                            flag = true;
                        }else{
                            resultNum[i] = resultM ;
                            flag = false;
                        }
                    }else{
                        resultNum[i] =  resultC[i];
                    }
                }
            }
        if(flag == true){
            System.out.print("1");
            for(int j =  0; j<resultNum.length;j++){
                System.out.print(resultNum[j]);
            }
        }else{
            for(int j =  0; j<resultNum.length;j++){
                System.out.print(resultNum[j]);
            }
        }
    }
}
