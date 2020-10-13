package array;

public class OccuranceOfCharacter {
    char[] arr={'I','a','m','A','j','a','v','a','Q','A'};
    int i,count=0;
    public void findOccurance()
    {
       /* for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"");
        }*/
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]=='A' || arr[i]=='a')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        OccuranceOfCharacter oc=new OccuranceOfCharacter();
        oc.findOccurance();
    }
}
