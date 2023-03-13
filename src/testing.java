import java.util.Arrays;

public class testing {



    public static void main(String[] args) {
        String a = "";
       String b = a.concat(Arrays.toString(args));
        System.out.println(b);
        int i = 0;
        int j = 5;
        int k = 10;

        int loopIterations = 0;

        while ((i++ < j) || (j < --k)) {

            loopIterations++;
        }
        System.out.println(loopIterations);
    }
}
