package switchCase;

import java.util.Scanner;

public class Number2{


            int n;
            public void numberDisplay()
            {
            System.out.println("Enter the number");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            switch(n)
            {
                case 0:
                    System.out.println(" zero");
                    break;
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" Two");
                    break;
                case 3:
                    System.out.println(" Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println(" Five");
                    break;
                case 6:
                    System.out.println(" Six");
                    break;
                case 7:
                    System.out.println(" Seven");
                    break;
                case 8:
                    System.out.println(" Eight");
                    break;
                case 9:
                    System.out.println(" Nine");
                    break;
                default:
                    System.out.println("default case");
                    break;

            }


        }
    public static void main(String[] args)
    {
        Number2 num=new Number2();
        num.numberDisplay();
    }
    }


