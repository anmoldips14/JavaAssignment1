package string;

public class ConvertUpperO {
    String str="The compiled code of java can run on mac linux or windows if jre is available on the operating system";
    String temp;
    String[] arr=str.split("");
    public ConvertUpperO() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == 'o') {
                temp = arr[i].toUpperCase();
                arr[i] = temp;
            }
            System.out.println(arr[i] + ""+"");

        }}



            public static void main(String[] args)
            {
                ConvertUpperO co=new ConvertUpperO();

            }
        }

