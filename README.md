# graphql-dgs-getting-started
Sample HelloWorld Graphql App using Netflix DGS

## Getting Started
1. Run to install dependencies: `mvn install`
2. Run the DgsGraphqlWithSpringbootApplication.java
3. Graphiql accessible at http://localhost:8181/graphiql
4. Sample curl command to access a query is as follows

   `curl --location 'http://localhost:8181/graphql' \
   --header 'Content-Type: application/json' \
   --data '{"query":"query shows {\n  shows(titleFilter: \"The\") {\n    title\n    releaseYear\n  }\n}","variables":{}}'`
