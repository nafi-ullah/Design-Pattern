package CompDp;

public class Client {
    public static void main(String[] args) {
        File file0 = new File(20);
        File file1 = new File(21);
        File file2 = new File(22);

        Directory dir1 = new Directory();
        Directory root = new Directory();

        root.add(dir1);
        root.add(file0);
        root.add(file1);
        dir1.add(file2);

        System.out.println(root.calculateSize());

    }
}
