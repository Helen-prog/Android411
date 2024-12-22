package lesson10.animals;

public class Cat extends Animal{


    public void voice(String name) {
        System.out.println(name + " Мяу!");
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }
}
