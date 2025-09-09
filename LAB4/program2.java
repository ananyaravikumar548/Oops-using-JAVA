class Animal{
    String name;

    Animal() {
        name = "Unknown Animal";
    }
    Animal(String n) {
        name = n;
    }
    void sound() {
        System.out.println(name + " makes a sound");
    }
    void sound(String type) {
        System.out.println(name + " makes a " + type + " sound");
    }
}
class Dog extends Animal{
    Dog() {
        super("Dog");  
    }
}
public class TestAnimals {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();
        a1.sound("generic");
        
        Dog d1 = new Dog();
        d1.sound();
        d1.sound("barking");
    }
}
