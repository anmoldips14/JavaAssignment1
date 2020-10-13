package string;

public class ReverseStringWord {
    String str="One two there four five six";
    String rev="";
    String [] arr=str.split(" ");
    public void ReverseStringWordFind()
    {
        for(int i=arr.length-1;i>=0;i--)
        {

            rev=rev+arr[i]+" ";
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {

         ReverseStringWord rev=new ReverseStringWord();
    rev.ReverseStringWordFind();


    }
}
