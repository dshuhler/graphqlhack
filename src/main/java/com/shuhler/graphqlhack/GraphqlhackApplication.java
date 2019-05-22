package com.shuhler.graphqlhack;

import com.shuhler.graphqlhack.resolver.MutationResolver;
import com.shuhler.graphqlhack.resolver.QueryResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlhackApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlhackApplication.class, args);
	}

	@Bean
	public QueryResolver query() {
		return new QueryResolver();
	}

	@Bean
	public MutationResolver mutate() {
		return new MutationResolver();
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
