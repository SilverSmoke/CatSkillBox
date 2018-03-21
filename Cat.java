
public class Cat
{
    private Double originWeight;
    private Double weight;
    private Double weightFood;

    private Double minWeight;
    private Double maxWeight;
    private static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        weightFood = 0.0;
        count++;
    }

    public void meow()
    {
        weightFood = weightFood - 1;
        System.out.println("Meow");
    }

    //метод "Сходить в туалет"
    public void defecation(){
        weightFood -= 200.0;
        System.out.println("Furt!))");
    }

    public void feed(Double amount)
    {
        weightFood += amount;
    }

    public void drink(Double amount)
    {
        weightFood += amount;
    }

    public Double getWeight()
    {
        return weight + weightFood;
    }

    public Double getWeightFood()
    {
        return weightFood;
    }

    public String getStatus()
    {
        if(weight + weightFood < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight + weightFood > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight + weightFood > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    /**
     * Возвращает число живых кошек
     * @return count
     */
    public static int getCount(){
        return count;
    }
}