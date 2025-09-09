class A {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
class B extends A {
    public String add(String s1, String s2) {
        return s1 + s2;
    }
}

public class Main{
    public static void main(String[] args) {
        B objB = new B();

        int sumInt = objB.add(5, 10);
        double sumDouble = objB.add(5.5, 10.5);
        String concatenated = objB.add("Hello", "World");

        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);
        System.out.println("Concatenated string: " + concatenated);
    }
}

    

