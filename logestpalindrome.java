import java.util.*;
public class logestpalindrome {

    public static void longestpsub(String str)
    {
        ArrayList<String> sub = new ArrayList();

        for(int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<str.length()+1; j++)
            {
                sub.add(str.substring(i, j));
            }
        }

        String pali="";
        int log=0;;
        for(int i=0; i<sub.size();i++)
        {
            if(ispalindrome(sub.get(i))==true)
            {
                if(sub.get(i).length()>log){
                    log=sub.get(i).length();
                    pali=sub.get(i);
                }
            }
        }

        System.out.println("Longest palindromic substring: "+pali);
    }

    public static boolean ispalindrome(String s)
    {
        int st=0;
        int e=s.length()-1;
        
        if(s.length()<=1)
        {
            return true;
        }

        while(st<e)
        {
            if(s.charAt(st)==s.charAt(e))
            {
                st++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        longestpsub(s);
    }
}
