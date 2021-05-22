package book;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/30
 * @Time: 18:18
 **/
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList(){
        books[0] = new Book("三国演义", "罗贯中",100,"小说");
        books[1] = new Book("水浒传", "施耐庵",100,"小说");
        books[2] = new Book("西游记", "吴承恩",100,"小说");
        this.usedSize = 3;
    }
    //把所以对书的操作写到这个类中，因为每一个操作都是操作books的
    public void setBooks(int pos,Book book){
        this.books[pos] = book;
    }
    public Book getBook(int pos){
        return this.books[pos];
    }
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
