import java.util.ArrayList;
import java.util.List;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/27
 */
public class Folder implements IFile {

    private String name;
    private List<IFile> children;

    public Folder(String name){
        this.name = name;
        children = new ArrayList<IFile>();
    }
    @Override
    public void dispaly() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile file) {
        return children.add(file);
    }

    @Override
    public boolean remove(IFile file) {
        return children.remove(file);
    }

    @Override
    public List<IFile> getChild() {
        return children;
    }
}
