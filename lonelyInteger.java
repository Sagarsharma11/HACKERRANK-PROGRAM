import java.util.ArrayList;
import java.util.List;

public class lonelyInteger {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(3);
        li.add(2);
        li.add(1);

        int r=0 ; 

        for(int n : li)
        {
            r = r ^ n;

            // System.out.println("n value "+n + "r vaue : : "+r);
            

        }
        System.out.println(r);

    }
}
