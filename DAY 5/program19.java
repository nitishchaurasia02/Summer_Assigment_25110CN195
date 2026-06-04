import java.util.*;
public class program19 {
    public static void main (String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();  
        System.out.println("THE FACTORS OF THE GIVEN NUMBER ARE:") ;
for (int i=1;i*i<=n;i++)
{
    if(n%i==0)
    {
  System.out.println(i);
if(i*i!=n)
{
    System.out.println(n/i);
}
}
}
    }
}
