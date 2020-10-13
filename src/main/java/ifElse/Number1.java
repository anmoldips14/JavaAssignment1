package ifElse;

import java.util.Scanner;

public class Number1 {
   public void number() {
        int a = 300;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();
        if (n < a) {
            System.out.println("no is less than 300");
        } else if (n == a) {
            System.out.println("no is equal to 300");
        } else {
            System.out.println("no is greater than 300");
        }
    }
        public static void main(String[] args){
        Number1 num=new Number1();
        num.number();
    }
}
