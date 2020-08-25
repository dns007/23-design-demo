import java.util.List;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/27
 */
//组合模式：构造型模式的一种  通过递归手段构造树形的对象结构  并可以通过一个对象来访问整个对象树
//component 树形结构的节点抽象
//Leaf 树形结构的叶子节点
//composite 树形结构的枝节点
//使用场景：可以表示为 ‘部分-整体’的层级结构。
public class MainClass {
    public static void main(String[] args) {
        //C盘目录
        IFile rootFolder = new Folder("C:");
        //ttt目录
        Folder tttFolder = new Folder("ttt");
        //ttt文件
        IFile tttFile = new File("ttt.txt");

        //第二级
        Folder bbbFolder = new Folder("bbb");
        File bbbFile = new File("bbb.txt");
        tttFolder.add(bbbFolder);
        tttFolder.add(bbbFile);

        //第三级
        Folder cccFolder = new Folder("ccc");
        File cccFile = new File("ccc.txt");
        bbbFolder.add(cccFolder);
        bbbFolder.add(cccFile);

        rootFolder.add(tttFolder);
        rootFolder.add(tttFile);

        displayTree(rootFolder,0);
    }

    //递归  先递后归   递-向下探 归-归并
    public static void displayTree(IFile rootFolder, int deep){
        for(int i =0; i< deep; i++){
            System.out.print("--");
        }
        //显示自身的名称
        rootFolder.dispaly();
        //获取子树
        List<IFile> children = rootFolder.getChild();
        //循环遍历子树
        for(IFile file: children){
            if(file instanceof File){
                for(int i =0; i<= deep; i++){
                    System.out.print("--");
                }
                file.dispaly();
            }else{
                displayTree(file, deep+1);
            }
        }
    }
}
