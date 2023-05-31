package be.intecbrussel;

import java.time.LocalDate;

public class Book {
    public String title;
    public  Person author;
    public LocalDate releaseDate;
    public String genre;



    //Constructor


    public Book() {

    }

    public Book(String title, Person author, LocalDate releaseDate, String genre) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }


    //getters

    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }

    public LocalDate getReleaseDate() {


        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }
}
