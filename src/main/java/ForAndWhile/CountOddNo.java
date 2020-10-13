package ForAndWhile;

public class CountOddNo {
    int i, count = 0;

    public void countNo() {

        for (i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                count = count + 1;

            }
            // System.out.println("count"+count);
        }
        System.out.println("total odd no from zero to twenty is" + count);
    }

    public static void main(String[] args) {

        CountOddNo count=new CountOddNo();
        count.countNo();
    }
}

