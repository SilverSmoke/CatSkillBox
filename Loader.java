/**
 * new test github
 */
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(3000.);
        Cat tom = new Cat();
        Cat murzik = new Cat();
        Cat barsik = new Cat();
        Cat kuzya = new Cat();
        Cat red = new Cat();
        Cat tuz = new Cat(2000.0);


        System.out.println(tom.getWeight() + " - " + tom.getStatus());
        tom.feed(500.0);
        System.out.println(tom.getWeight() + " - " + tom.getStatus());
        tom.defecation();
        System.out.println(tom.getWeight() + " - " + tom.getStatus());
        System.out.println(tom.getWeightFood());
        System.out.println(Cat.getCount());
        System.out.println(tuz.getWeight() + " - " + tuz.getStatus());
        tuz.feed(100.0);
        System.out.println(tuz.getWeight() + " - " + tuz.getStatus());
        tuz.defecation();
        System.out.println(tuz.getWeight() + " - " + tuz.getStatus());
        tuz.defecation();
        System.out.println(tuz.getWeight() + " - " + tuz.getStatus());
        System.out.println(tuz.getWeight());
        System.out.println(tuz.originWeight);
        cat.feed(100.0);
        System.out.println(cat.getWeight() + " - " + cat.getStatus());
        cat.defecation();
        System.out.println(cat.getWeight() + " - " + cat.getStatus());
        cat.defecation();
        cat.defecation();
        cat.defecation();
        cat.defecation();
        cat.defecation();
        cat.defecation();
        cat.defecation();
        cat.defecation();
        cat.defecation();
        cat.defecation();

        System.out.println(cat.getWeight() + " - " + cat.getStatus());
        System.out.println(Cat.getCount());
    }
}