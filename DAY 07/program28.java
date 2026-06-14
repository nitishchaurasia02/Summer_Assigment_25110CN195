import java.util.*;
public class program28 {
    
    
      static int rd(int n)

        {
            if(n==0)
                return 0;
             System.out.print(n%10);
             return rd(n/10);
        
    }
        public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number: ");
        int n = sc.nextInt();
        
        int out = rd(n);

    }
    
        }
    
    
