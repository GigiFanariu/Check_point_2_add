public class Yogurt implements Eatable, Drinkable{
    @Override
    public void onEat(Person person) {
        person.setHunger(5);
    }

    @Override
    public boolean isPoisoned() {
        return false;
    }

    @Override
    public void onDrink(Person person) {
        person.setThirst(7);
    }
}
