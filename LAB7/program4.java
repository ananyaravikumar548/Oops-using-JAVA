public class WrapperExample {
    public static void main(String[] args) {
        // Wrapper Class Example
        int num = 10;
        Integer obj = Integer.valueOf(num); 
        System.out.println("Wrapper Class Example: " + obj);

    
        Integer autoObj = num;
        System.out.println("Autoboxing Example: " + autoObj);

        // Auto-unboxing
        int newNum = autoObj; 
        System.out.println("Auto-unboxing Example: " + newNum);
    }
}
