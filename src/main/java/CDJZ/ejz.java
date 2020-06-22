package CDJZ;

import java.util.Scanner;

public class ejz {
    public static int numOfOne(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int n = num.nextInt();

        System.out.print("结果：");
        System.out.print(numOfOne(n));
    }
}
