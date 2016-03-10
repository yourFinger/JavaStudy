package Hello;

/**
 * Created by yourfinger on 16/1/16.
 */
public class Animal {

    @Override
    public String toString(){
        return "Animal";
    }

    public static void main(String[] args){
        ShowAnimal(new Animal());
        ShowAnimal(new Cat());
    }

    private static void ShowAnimal(Animal animal){
        String name;

        if (animal instanceof Cat)
            name = ((Cat)animal).toString();
        else
            name = animal.toString();

        System.out.println(name);
    }
}

class Cat extends Animal{

    @Override
    public String toString(){
        return "Cat";
    }

}
