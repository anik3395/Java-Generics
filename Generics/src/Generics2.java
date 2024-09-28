import java.util.Arrays;
import java.util.List;

public class Generics2 {
    public static void main(String[] args) {

        List<Integer> List = Arrays.asList(10, 20, 30);
        int first = List.get(0); //Un Boxing --> object to primitive....
        System.out.println(first);

    }
}
