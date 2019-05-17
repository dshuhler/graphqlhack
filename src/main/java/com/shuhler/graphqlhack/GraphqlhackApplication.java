package com.shuhler.graphqlhack;

import com.shuhler.graphqlhack.resolver.Query;
import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlhackApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlhackApplication.class, args);
	}

	@Bean
	public Query query() {
		return new Query();
	}

//	@Bean
//	GraphQLSchema schema() {
//		return GraphQLSchema.newSchema()
//			.query(GraphQLObjectType.newObject()
//				.name("query")
//				.field(field -> field
//					.name("test")
//					.type(Scalars.GraphQLString)
//					.dataFetcher(environment -> "response")
//				)
//				.build())
//			.build();
//	}

}
