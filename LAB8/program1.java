import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student List Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Insert Student at Index");
            System.out.println("3. Update Student Name");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    students.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter index and name: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    students.add(idx, sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter index to update: ");
                    int i = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    students.set(i, sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter name to remove: ");
                    students.remove(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Student List: " + students);
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
