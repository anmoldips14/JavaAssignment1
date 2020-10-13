package ForAndWhile;

public class SumOfEvenNo {

    int sum = 0, n = 15;
    public void SumOfEvenNo1()
    {
        while(n>=0) {
        if (n % 2 == 0) {
            sum = sum + n;
        }
        n--;
    }
        System.out.println(sum);
}

    public static void main(String[] args)
    {

        SumOfEvenNo sum=new SumOfEvenNo();
        sum.SumOfEvenNo1();
    }
}
