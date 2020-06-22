package CDJZ;

public class gouzao {
    gouzao(){
        System.out.println("111111111");
    }
     public void gouzao(){
        System.out.println("11222222222222");
    }
    public void gouzao(int s){
        System.out.println(s);
    }

    public String test() {
        return "11111111";
    }
    public static void main(String[] args) {
        gouzao a = new gouzao();
        a.gouzao();
        a.gouzao(2);
    }
    }
