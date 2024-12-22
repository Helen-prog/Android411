package lesson10.animals;

public class Dog extends Animal{

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    public void hello(){
        System.out.println("Hello");
    }
}
