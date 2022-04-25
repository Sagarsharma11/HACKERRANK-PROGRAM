import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class minMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        
        arr.add(0,15);
        arr.add(1,74);
        arr.add(2,7);
        arr.add(3,41);
        arr.add(4,5);

        Collections.sort(arr);
        int min = 0 , max = 0;


        for(int i = 0; i<arr.size(); i++)
        {
            

            if(i>0)
            {
                max= max+arr.get(i);
            }
            if(i<arr.size()-1)
            {
                min = min + arr.get(i);
            }

            
                        

        }
        
        System.out.println(min);
        System.out.println(max);

    }
}
