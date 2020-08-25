import jdk.nashorn.internal.ir.IfNode;

import java.util.List;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/27
 */
public class File implements IFile {
    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void dispaly() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile file) {
        return false;
    }

    @Override
    public boolean remove(IFile file) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }
}
