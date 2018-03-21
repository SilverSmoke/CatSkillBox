
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;
    private static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    /**
     * Конструктор кошки с указанием веса
     * @param weightIn
     */
    public Cat(Double weightIn)
    {
        weight = weightIn;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    //метод "Сходить в туалет"
    public void defecation(){
        weight -= 200.0;
        System.out.println("Furt!))");
    }

    public void feed(Double amount)
    {
        weight += amount;
    }

    public void drink(Double amount)
    {
        weight += amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    /**
     * Возвращает вес еды, если вес кота меньше оригинального, то 0.0
     * @return weightFood
     */
    public Double getWeightFood()
    {
        Double weightFood = weight - originWeight;
        if(weightFood > 0)return weightFood;
        return 0.0;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
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