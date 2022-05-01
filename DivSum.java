import java.util.*;

public class DivSum
{
    public static void main(String[] args) {
       List<Integer> ar = new ArrayList<>();
       ar.add(1);
       ar.add(2);
       ar.add(3);
       ar.add(4);
       ar.add(5);
       ar.add(6);

       int n = 6;
       int k = 3;
       int pair = 0;
       int sum = 0;

       for (int i = 0; i < ar.size(); i++) {

           for (int j = i+1; j < ar.size(); j++) {

                sum =  ar.get(i)+ar.get(j);
            
                if(0==sum%3 )
                {
                    pair+=1;
                }
           }
       }
       System.out.println(pair);

    
    }
}
