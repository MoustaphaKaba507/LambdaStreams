package be.intecbrussel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamApp {
    public static void main(String[] args) {


       Person person = new Person();
       Person person1 =new Person("Veronica","Roth",LocalDate.of(1998, 9,12 ));
       Person person2 = new Person("Suzanne","Collins",LocalDate.of(1990,9,30));
       Person person3 = new Person("JK","Rowling",LocalDate.of(1967,11,8));
       Person person4 = new Person("Suzanne","Collins",LocalDate.of(1990,9,30));
       Person person5 = new Person("EL","James",LocalDate.of(1978,7,10));


       Book book = new Book();
       Book book1 = new Book("Divergent",person1,LocalDate.of(2011,4,25),"Fiction");
       Book book2 = new Book("Catching fire",person2,LocalDate.of(2009,6,21),"Adventure");
       Book book3 = new Book("Harry Potter",person3,LocalDate.of(1997,6,12),"Fiction");
       Book book4 = new Book("Hunger Games",person4,LocalDate.of(2008,5,12),"Fantasy");
       Book book5 = new Book("Fifty Shades",person5,LocalDate.of(2011,5,11),"Romance");

        List<String> books = new ArrayList<>();

        books.add(1,"Divergent");
        books.add(2,"Catching fire");
        books.add(3,"Harry Potter");
        books.add(4,"Hunger Games");
        books.add(5,"Fifty Shades");


        //Method

        public static Book getNewestBook(List<Book> books){

            return books.stream()
                    .sorted(books)
                    .Comparator.comparing(Book b)->book.getReleaseDate()
                    .withYear(2023)
                    




        }

        public void printyoungestWriter(List<Book> books){

            return books.stream()
                    .sorted(Book,Person)
                    .limit()


        }
        public void countBooksPerAuthor(List<Book> books){
            count
           return books.stream()
                    .forEach(k-> System.out.println(k));
        }

        public void printBooksReleasedIn2016(List books){
            return

        }

    }

}
