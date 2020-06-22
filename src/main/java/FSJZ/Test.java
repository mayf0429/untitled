package FSJZ;



public class Test {
    public static void main(String[] args) {
       try{
           Class c = Class.forName("FSJZ.B");
           A b = (A)c.newInstance();
           b.ss();
           b.dd();
       }catch (Exception e ){
            e.printStackTrace();
       }
    }
}
class A{
    public void ss(){
        System.out.println("A");
        }

        public void dd(){
            System.out.println("AAA");
        }
}
class B extends A{
    public void ss(){
        System.out.println("B");
    }
}