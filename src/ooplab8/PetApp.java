package ooplab8;

public class PetApp {
    public static void main(String[] args) {

        Dog dog = new Dog("kaya", 2);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.makeNoise();

        Cat cat = new Cat("som", 3);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.makeNoise();

    }//maim
}//class
