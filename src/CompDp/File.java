package CompDp;

public class File implements Composite.FileSystemComponent {
    private int fileSize;

    public File(int size) {
        this.fileSize = size;
    }


    @Override
    public int calculateSize() {
        return fileSize;
    }

}
