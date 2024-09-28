import java.util.ArrayList;
import java.util.List;

public class WildCardUnBounded {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
        printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        printList(numbers);

        List<Double> number1 = new ArrayList<>();
        number1.add(1.3);
        number1.add(2.2);
        number1.add(3.7);
        printList(number1);


    }
    //UnBounded WildCard used in this Method..
    public static void printList(List<?> names){
        System.out.println(names);
        //names.add("Foo"); We Can not used any specific Object bcz it is unknown Object..
    }
}
