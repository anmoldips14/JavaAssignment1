package ifElse;

import java.util.Scanner;

public class TaxOnBill {


        float bill, total;
        public void calculateBill ()
        {
            System.out.println("enter a bill");
            Scanner sc = new Scanner(System.in);
            bill = sc.nextFloat();

            if (bill <= 300) {
                total = bill + 50;

            } else if (bill <= 500) {
                total = bill + 20;
            } else if (bill <= 1000) {
                total = bill + 10;
            } else {
                total = bill;
            }
            System.out.println("Total bill amount is" + total);
        }

    public static void main(String[] args)
    {
        TaxOnBill tax=new TaxOnBill();
        tax.calculateBill();
    }
}
