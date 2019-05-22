package com.shuhler.graphqlhack.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.shuhler.graphqlhack.model.Book;

public class MutationResolver implements GraphQLMutationResolver {

    public Book newBook(String title, String author) {
        Book book = new Book(title, author);
        System.out.println("Saving to pretend database: " + book);
        return book;
    }

}
