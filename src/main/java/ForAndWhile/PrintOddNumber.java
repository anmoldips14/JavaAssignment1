package ForAndWhile;
public class PrintOddNumber {


        int n=30;
       public void  PrintOddNumber1() {
            while (n >= 0) {
                if (n % 2 == 1) {
                    System.out.println(n);
                }
                n--;
            }
        }


    public static void main(String[] args)
    {

        PrintOddNumber no=new PrintOddNumber();
        no.PrintOddNumber1();
    }
}
