import java.util.*;
public class program10
{
    public static void main(String[]args)
    {
        int count=0,i,j,limit;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            limit = sc.nextInt();
            for( i=2;i<=limit;i++)
                
            {
                count=0;
                            for(j=1;j<=i;j++)
                            {
                if(i%j==0)
                    count++;
                        }
            
                    if(count==2)
        System.out.println(i );
                }
    }
}
        
        