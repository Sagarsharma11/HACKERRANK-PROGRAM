import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class plusminus{
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<Integer>();
        DecimalFormat df = new DecimalFormat("#.00000");
        mylist.add(0,15);
        mylist.add(1,74);
        mylist.add(2,-1);
        mylist.add(3,-14);
        mylist.add(4,0);
        // System.out.println(mylist);

        double pos=0;
        double neg = 0;
        double zero = 0;

        for (int i = 0; i < mylist.size(); i++) 
        {
            if(mylist.get(i)<0)
            {
                neg++;
            }else if(mylist.get(i)>0)
            {
                pos++;
            }else{
                zero++;
            }
        }

        double len = mylist.size();
        // System.out.println(len);
       
        // pos = (double)Math.round(pos * 100000d) / 100000d;
        // neg = (double)Math.round(pos * 100000d) / 100000d;
        // zero = (double)Math.round(pos * 100000d) / 100000d;


        System.out.println("positive : "+df.format(pos));
        System.out.println("zero:"+df.format(zero));
        System.out.println("Negative : "+df.format(neg));

    }
}