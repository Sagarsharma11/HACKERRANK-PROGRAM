import java.util.*;
import java.util.ArrayList;

public class gradesproblem {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> li = new ArrayList<>();

       
        int rem = 0;
       

        for (int i = 0; i < grades.size(); i++) {
           
            if(grades.get(i)<38)
            {
                li.add(grades.get(i));

            }else if(grades.get(i)%5 == 0)
            {
                li.add(grades.get(i));
            }else{
                
                
               rem = grades.get(i)%5;
                
               rem = 5-rem;

               if(rem<3)
               {
                   li.add(grades.get(i)+rem);
               }else{
                li.add(grades.get(i));
               }
               
            
               
               

             

            }
           
            
        }
        System.out.println(li);

    }
}
