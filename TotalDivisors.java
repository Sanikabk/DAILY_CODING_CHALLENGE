import java.util.Scanner;

public class TotalDivisors {
//     public static int Total(int N)              //Brute Force approach : but time complexity is O(N) so, it will be inefficient for bigger number so we use recursion
//     {
//         int count=1;
//         for(int i=1;i<=(N/2);i++)
//         {
//             if(N%i==0)
//             {
//                 count++;
//             }
//         }
//         return count;
//     }

public static int TotalDiv(int N,int i)
{
    if(i*i>N)
    {
        return 0;
    }
    if(N%i==0)
    {
        if(i==N/i)
        {
            return 1+TotalDiv(N,i+1);
        }
        else{
            return 2+TotalDiv(N,i+1);
        }
    }
    else{
        return TotalDiv(N,i+1);
    }
    
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("N : ");
        int N=sc.nextInt();
        System.out.println(TotalDiv(N,1));
    }
}
