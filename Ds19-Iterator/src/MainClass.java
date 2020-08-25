import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/4/03
 */
/*
迭代器模式
优点：
1.实现功能分离，简化容器接口 把迭代功能委让给外部类实现
2.隐藏容器的实现细节
3.为容器或子容器提供了一个统一的接口，方便调用，使调用者不用关注迭代器的实现细节
4.可以为容器或其子容器实现不同的迭代方法或多个迭代方法
 */
public class MainClass {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Book book1 = new Book("001", "java初级书籍", 90);
        Book book2 = new Book("002", "java中级书籍", 40);

        bookList.addBook(book1);
        bookList.addBook(book2);

        //第一种 容器内部实现遍历
//        while (bookList.hasNext()){
//            Book book = bookList.getNext();
//            book.display();
//        }

//        //第二种 调用者自己实现遍历 直接暴露数据细节给外部
//        List<Book> bookDatalist = bookList.getBookList();
//        for(int i=0; i<bookDatalist.size(); i++){
//            Book book = bookDatalist.get(i);
//            book.display();
//        }

        //第三种  内部类实现迭代器
        Iterator iter = bookList.Iterator();
        while ( iter.hasNext()){
            Book book = (Book) iter.next();
            book.display();
        }

    }
}
