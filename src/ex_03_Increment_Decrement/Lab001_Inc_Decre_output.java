package ex_03_Increment_Decrement;

public class Lab001_Inc_Decre_output {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + a++ + a++);  // 11+11+12=34
        System.out.println(a);   //a= 13


        int b = 20;
        System.out.println(--b + b++ + b--); //19+19+20=58
        System.out.println(b); //19
    }
}
