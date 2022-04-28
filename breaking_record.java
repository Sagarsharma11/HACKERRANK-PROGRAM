import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int minRecord = 0;
        int maxRecord = 0;
        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i) > maxScore){
                maxScore = scores.get(i);
                maxRecord++;
            }
            if(scores.get(i) < minScore){
                minScore = scores.get(i);
                minRecord++;
            }
        }
        return Arrays.asList(maxRecord,minRecord);
    }

}

public class breaking_record {
    public static void main(String[] args) throws IOException {

        List<Integer> score = new ArrayList<>();
        // 10 5 20 20 4 5 2 25 1
        score.add(0,10);
        score.add(1,5);
        score.add(2,20);
        score.add(3,20);
        score.add(4,4);
        score.add(5,5);
        score.add(6,2);
        score.add(7,25);
        score.add(8,1);

        System.out.println(Result.breakingRecords(score));



        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        // List<Integer> result = Result.breakingRecords(scores);

        // bufferedWriter.write(
        //     result.stream()
        //         .map(Object::toString)
        //         .collect(joining(" "))
        //     + "\n"
        // );

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}