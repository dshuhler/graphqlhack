package com.shuhler.graphqlhack.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.shuhler.graphqlhack.model.Book;
import java.util.ArrayList;
import java.util.List;

public class Query implements GraphQLQueryResolver {


    //"query" : "query {findAllBooks { title } }"
    public List<Book> findAllBooks() { // can be list?

        List<Book> books = new ArrayList<>();


        Book grapesOfWrath = new Book("The Grapes of Wrath", "John Steinbeck");
        grapesOfWrath.addGenre("Fiction");
        grapesOfWrath.addGenre("Depressing");

        Book sunAlsoRises = new Book("The Sun Also Rises", "Ernest Hemingway");
        sunAlsoRises.addGenre("Fiction");
        sunAlsoRises.addGenre("Everyone Is Drunk All The Time");

        books.add(grapesOfWrath);
        books.add(sunAlsoRises);

        return books;
    }


}
