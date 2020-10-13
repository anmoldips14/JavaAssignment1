package array;

public class CountPrimeNumbers {
    int flag=0;
    int count=0;
    //int i;
    CountPrimeNumbers() {
        int[] arr = {2, 5, 6, 8, 11, 14, 17, 18,19, 20};

        for (int i = 0; i < arr.length; i++)
        {

            for (int j = 2; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag++;
                    //break;
                }
            }
//loop increase only one time for prime no so flag value is 1 for prime no.i.e
                if (flag == 1) {
                    System.out.println(arr[i]);
                    flag=0;
                    count++;
                }

            else {
                flag=0;
            }
        }
        System.out.println("no of prime no is"+""+count);


            //System.out.println("count of prime numbers in the given array is= " + count);
        }



    public static void main(String[] args) {
        CountPrimeNumbers pr=new  CountPrimeNumbers();





    }

}












