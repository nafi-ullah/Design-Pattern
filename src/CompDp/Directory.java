package CompDp;
import java.util.ArrayList;
import java.util.List;

public class Directory implements Composite.FileSystemComponent {
    private int totalSize;
    private List<Composite.FileSystemComponent> components;

    public Directory() {
        this.totalSize = 0;
        components = new ArrayList<>();
    }

    public void add(Composite.FileSystemComponent component){
        components.add(component);
    }

    @Override
    public int calculateSize() {
        for (Composite.FileSystemComponent component : components) {
            totalSize += component.calculateSize();
        }
        return totalSize;
    }

}
