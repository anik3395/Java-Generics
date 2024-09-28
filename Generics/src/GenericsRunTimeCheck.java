import java.util.ArrayList;
import java.util.List;

public class GenericsRunTimeCheck {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        toAddName(names,"Anik");
        toAddName(names,"kaka");
        System.out.println(names);

        incorrectAddName(names, 5);
        System.out.println(names);

    }

    private static void toAddName(List names,  String s){
     names.add(s);
    }

    private static void incorrectAddName( List list,Integer i){
    list.add(i);
    }
}
