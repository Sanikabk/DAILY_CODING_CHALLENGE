import java.util.*;

public class longestSybstringWithoutRepetition {
    public static int longest(String s)
    {
        int i=0;
        int j=0;
        int maxlen=0;
        Set<Character> l1= new HashSet<>();

        while(i<s.length())
        {
            if(!l1.contains(s.charAt(i)))
            {
                l1.add(s.charAt(i));
                i++;
                maxlen=Math.max(maxlen, l1.size());
            }
            else{
                l1.remove(s.charAt(j));              
                j++;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s= sc.nextLine();
        System.out.println("Longest Substring without repetiting the characters: "+longest(s));
        
    }
}
