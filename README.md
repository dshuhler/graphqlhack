### GraphQL hackathon

Goals:
  1. be able to give high level overview of GraphQL and why you would use it
  1. set up a demo spring boot service that uses GraphQL

GraphQL is usually sent via HTTP to a single server endpoint
  - use GET for queries
  - use POST for "mutations"


- spring boot
  - graphql-spring-boot-starter is not an official plugin. Is being updated but does not seem 
    widely used
  - no good library to assist with integration tests. should be able to abstract a lot away for
    cleaner tests
    
    
- graphiQL tool
  - basically postman for just graphQL
  
  
  
  
- best resource: https://www.pluralsight.com/guides/building-a-graphql-server-with-spring-boot

good for: need flexible interface that allows client to specify what data they need and client needs
to query in a lot of different ways

bad for: business process driven transactional system where the server side needs a lot of control
