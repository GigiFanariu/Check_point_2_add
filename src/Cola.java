public class Cola implements Drinkable {
    @Override
    public void onDrink(Person person) {
        person.setThirst(4);
    }
}
