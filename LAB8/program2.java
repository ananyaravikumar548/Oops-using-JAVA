import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Playlist Menu ---");
            System.out.println("1. Add song at beginning");
            System.out.println("2. Add song at end");
            System.out.println("3. Remove first song");
            System.out.println("4. Remove last song");
            System.out.println("5. Replace song at index");
            System.out.println("6. Display playlist");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter song: ");
                    playlist.addFirst(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter song: ");
                    playlist.addLast(sc.nextLine());
                    break;
                case 3:
                    playlist.removeFirst();
                    break;
                case 4:
                    playlist.removeLast();
                    break;
                case 5:
                    System.out.print("Enter index and new song: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    playlist.set(index, sc.nextLine());
                    break;
                case 6:
                    System.out.println("Playlist: " + playlist);
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
