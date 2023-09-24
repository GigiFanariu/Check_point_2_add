public class Apple implements Eatable{
    @Override
    public void onEat(Person person) {
        person.setHunger(3);
    }

    @Override
    public boolean isPoisoned() {
        return false;
    }
}
