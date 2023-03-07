import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().filter(n->n%2 ==0).mapToInt(n->n).sum();
        System.out.println(sum);
    }



}
