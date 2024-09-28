package zoo;

public class Zoo {
    public static void main(String[] args) {

        Cage <Monkey> cage = new Cage<Monkey>(new Monkey(),new Monkey());
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());
        Monkey animal1 = cage.getAnimal1();


        Cage <Lion> cageLion = new Cage<Lion>(new Lion(),new Lion());
        cageLion.setAnimal1(new Lion());
        cageLion.setAnimal2(new Lion());
    }
}
