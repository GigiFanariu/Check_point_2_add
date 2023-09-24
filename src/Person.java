import java.util.Collection;

public class Person {
    private String name;
    private int hunger;
    private int thirst;

    public Person(String name){
        this.name = name;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
    public int getThirst() {
        return thirst;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void eat(Eatable obj){
        if (obj.isPoisoned()) {
            throw new RuntimeException();
        }else {
            obj.onEat(this);
        }
    }
    public void drink(Drinkable obj) {
        obj.onDrink(this);
    }

    public void haveLunch(Collection<Drinkable> drinkables, Collection<Eatable> eatables) {
        for (Drinkable drinkable: drinkables){
            this.drink(drinkable);
        }
        for (Eatable eatable: eatables){
            this.eat(eatable);
        }
    }
}
