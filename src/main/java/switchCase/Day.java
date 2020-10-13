package switchCase;

import java.util.Scanner;

public class Day {

        int n;
        public void printDay()
        {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch (n) {

            case 1:
                System.out.println(" Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println(" Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println(" Friday");
                break;
            case 6:
                System.out.println(" Saturday");
                break;
            case 7:
                System.out.println(" Sunday");
                break;
            default:
                System.out.println("default case");
                break;

        }

    }
    public static void main(String[] args)
    {
        Day print=new Day();
        print.printDay();
    }
}
