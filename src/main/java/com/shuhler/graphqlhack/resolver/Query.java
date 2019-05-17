package com.shuhler.graphqlhack.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.shuhler.graphqlhack.model.Book;
import java.util.ArrayList;
import java.util.List;

public class Query implements GraphQLQueryResolver {


    //"query" : "query {findAllBooks { title } }"
    public List<Book> findAllBooks() { // can be list?

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Grapes of Wrath", "John Steinbeck"));
        books.add(new Book("The Sun Also Rises", "Ernest Hemingway"));
        return books;
    }


}
