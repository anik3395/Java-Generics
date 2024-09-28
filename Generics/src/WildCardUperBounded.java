import java.util.ArrayList;
import java.util.List;

public class WildCardUperBounded {
    public static void main(String[] args) {

//        List<String> names = new ArrayList<>();
//        names.add("Name 1");
//        names.add("Name 2");
//        printList(names);

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

        List<Long> number2 = new ArrayList<>();
        number2.add((long) 18776);
        number2.add((long) 2.2);
        number2.add((long) 3.7);
        printList(number2);


    }

    //UpperBounded WildCard used in this Method..
    public static void printList(List<? extends Number> numbers){
        System.out.println(numbers);

    }
}
