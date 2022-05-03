import java.util.*;
public class digonal {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(11);
        arr.add(2);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(10);
        arr.add(8);
        arr.add(-12);

        int d1 = arr.get(0)+arr.get(4)+arr.get(8);
        int d2 = arr.get(2)+arr.get(4)+arr.get(6);

        int diff = 0;

        if(d1>d2)
        {
            diff = d1-d2;
        }else{
            diff = d2-d1;
        }
        System.out.println(diff);

    }
}
