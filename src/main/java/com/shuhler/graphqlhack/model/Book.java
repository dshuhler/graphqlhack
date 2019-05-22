package com.shuhler.graphqlhack.model;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private List<String> genre = new ArrayList<>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void addGenre(String genre) {
        this.genre.add(genre);
    }


    @Override
    public String toString() {
        return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", genre=" + genre +
            '}';
    }
}
