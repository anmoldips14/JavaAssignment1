package string;

public class RemoveAllSpecialCharacters {
    String str="#%$#%$!!Hellothere *&&%$%$";
    char[] arr=str.toCharArray();
    int len=arr.length;

    public RemoveAllSpecialCharacters()
    {
        for(int i=0;i<len;i++)
        {
            if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))
            {
                if(arr[i]=='o')
                {
                    System.out.print(arr[i]+" ");
                }
                else
                {
                    System.out.print(arr[i]);
                }
            }

        }


    }

    public static void main(String[] args) {
       
        RemoveAllSpecialCharacters r=new RemoveAllSpecialCharacters();

    }
}
