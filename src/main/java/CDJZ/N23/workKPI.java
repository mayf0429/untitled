package CDJZ.N23;

import java.util.*;

public class workKPI {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("请输入");
        String str = num.nextLine();
        String[] s = str.split(" ");
        int[] param = new int[s.length];
        Map<Integer,String> map = new  HashMap<Integer,String>();
        for(int i=0;i<s.length;i++){
            String[] s1 = s[i].split(":");
            map.put(Integer.parseInt(s1[1]),s1[0]);
            param[i] = Integer.parseInt(s1[1]);
        }
        sort(param,map);
    }

    public  static void sort(int[] param,Map<Integer,String> map){
        List<Integer>  newlist = new ArrayList<Integer>();
        for (int i=0;i<param.length-1;i++) {
            for (int j=0;j<param.length-1;j++) {
                if(param[j]<param[j+1]){
                    int temp=param[j];
                    param[j]=param[j+1];
                    param[j+1]=temp;
                }
            }
        }
        for(int i=0;i<param.length;i++){
            System.out.print(map.get(param[i])+":"+param[i]+" ");
        }
    }
}
