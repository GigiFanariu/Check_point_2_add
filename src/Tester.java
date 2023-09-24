import java.util.HashMap;
import java.util.HashSet;

public class Tester {
    public static void main(String[] args) {
        Person person = new Person("Gigi");

        HashSet<Eatable> foods = new HashSet<>();
        foods.add(new Apple());
        foods.add(new Yogurt());

        HashMap<String, Drinkable> drinks = new HashMap<>();
        drinks.put("Coke", new Cola());
        drinks.put("Yogurt", new Yogurt());

        person.haveLunch(drinks.values(), foods);
    }
}
