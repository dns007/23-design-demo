import java.util.List;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/27
 */
/*
文件节点抽象
 */
public interface IFile {

    public void dispaly();

    public boolean add(IFile file);

    public boolean remove(IFile file);

    public List<IFile> getChild();
}
