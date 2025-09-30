class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

class TableThread extends Thread {
    Table t;
    int num;

    TableThread(Table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printTable(num);
    }
}

public class TableDemo {
    public static void main(String[] args) {
        Table t = new Table();
        TableThread t1 = new TableThread(t, 5);
        TableThread t2 = new TableThread(t, 5);
        t1.start();
        t2.start();
    }
}
