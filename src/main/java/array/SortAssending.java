package array;

public class SortAssending {
    int[] arr={20,14,48,9,5,3,25,7};
    int temp;
    public void sortArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("sorted arry by assending order is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }
    }
        public static void main (String[]args)
        {
            SortAssending sort = new SortAssending();
            sort.sortArray();

        }
    }