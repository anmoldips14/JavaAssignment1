package array;

public class ReverseArray {

    int[] arr = {12, 13, 14, 15};
    int i;
    public void ReverseArray1()
    {
        System.out.println("original array");
        for(i=0;i<arr.length;i++)

    {
        System.out.println(arr[i] + "");
    }
        System.out.println("reverse array");
        for(i=arr.length-1;i>=0;i--)

    {
        System.out.println(arr[i] + "");
    }

}
    public static void main(String[] args)
    {

        ReverseArray reverse=new ReverseArray();
        reverse.ReverseArray1();
    }
}
