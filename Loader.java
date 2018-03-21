
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat tom = new Cat();
        Cat murzik = new Cat();
        Cat barsik = new Cat();
        Cat kuzya = new Cat();
        Cat red = new Cat();
        Cat tuz = new Cat();

/*
        cat.feed(9000.0);
        for(int i = 0; i < 100000; i++) {

            cat.meow();
            System.out.println(cat.getStatus());
            if (cat.getStatus().equals("Dead"))break;
        }*/

        System.out.println(tom.getWeight() + " - " + tom.getStatus());
        tom.feed(500.0);
        System.out.println(tom.getWeight() + " - " + tom.getStatus());
        tom.defecation();
        System.out.println(tom.getWeight() + " - " + tom.getStatus());
        System.out.println(tom.getWeightFood());
    }
}