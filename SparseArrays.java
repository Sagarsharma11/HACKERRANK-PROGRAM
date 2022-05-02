import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {
        List<String> li1 = new ArrayList<>();
        
        li1.add("4");
        li1.add("aba");
        li1.add("baba");
        li1.add("aba");
        li1.add("xzxb");

        List<String> li2 = new ArrayList<>();

        li2.add("3");
        li2.add("aba");
        li2.add("xzxb");
        li2.add("ab");

        List<Integer> in = new ArrayList<>();


        for (int i = 0; i < li2.size(); i++) {
            int count = 0;
            for (int j = 0; j < li1.size(); j++) {
                if(li1.get(j).equals(li2.get(i)))
                {
                    count+=1;
                    // System.out.println("count"+ li1.get(i)+ " : "+li2.get());
                }
            }
            in.add(i, count);
        }

        System.out.println(in);

    }
}
