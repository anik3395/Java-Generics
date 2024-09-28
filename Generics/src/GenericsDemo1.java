import java.util.LinkedList;

public class GenericsDemo1 {
    public static void main(String[] args) {
//        ArrayList<Date> name = new ArrayList<Date>();
//        name.add("Name1");
//        name.add("Name2");

//        String myname = name.get(0);
//        String myname2 = name.get(1);
//        System.out.println(myname);
//        System.out.println(myname2);

//        name.add(new Date());
//
//        Date foo = name.get(0);
//        System.out.println(foo);

        LinkedList<String> myString = new LinkedList<String>();
        myString.add(" a String");
//        myString.add(25);  I am not used in this line because of this is a string type of generics
//        but 25 is a int type primitive data type.
        System.out.println(myString);
        System.out.println(myString.get(0));


    }
}
