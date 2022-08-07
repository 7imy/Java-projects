public class TestBook {
    public static void main(String[] args) {
        Author[] person =new Author[2];
        person[0]=new Author("Anas","tommyCh@gmail.com",'m');
        person[1]=new Author("taraf","alecMo@hotmail.com",'f');
        Book book = new Book("learn programming",person,5.6,5);
        System.out.println(book.toString());
    }
}
