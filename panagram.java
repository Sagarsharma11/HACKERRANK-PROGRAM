import java.util.HashSet;

public class panagram{
    public static void main(String[] args) {
       String str = " We promptly judged ntique ivory bckles for the next prize";
       str = str.replace(" ","");
       HashSet<Character> hs = new HashSet<>();

       for (int i = 0; i < str.length(); i++) {
           hs.add(str.charAt(i));
       }
       if(hs.size()==26)
       {
           System.out.println("Pangram");
       }else{
           System.out.println("Not Pangram");
       }
 
    }
}