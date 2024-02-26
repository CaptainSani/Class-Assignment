package Week5.Activity_3.Excercise_2A;

import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {
        Book book1 = new Book(01,"A Song of Ice and Fire","Segun Osiki",10);
        Book book2 = new Book(02,"House of Dragons","Master Shifu",10);
        Book book3 = new Book(03,"PYTHON","Isi Nwobi",10);
        Book book4 = new Book(04,"REACT NATIVE","Eva Gbaje",10);
        Book book5 = new Book(05,"FOREX COMPLETE","Sani Dogo",10);

        HashSet<Book>Books = new HashSet<>();
        Books.add(book1);
        Books.add(book2);
        Books.add(book3);
        Books.add(book4);
        Books.add(book5);

        for(Book b : Books){
            System.out.println(b);
        }
    }
}
