# graphql-dgs-getting-started
Sample HelloWorld GraphQL App using Netflix DGS

## Getting Started
1. Run to install dependencies: `mvn install`
2. Run the DgsGraphqlWithSpringbootApplication.java
   * Server starts at 8181 port
3. GraphiQL (GraphQL IDE) accessible at http://localhost:8181/graphiql
4. Sample curl commands as follows
   * Sample 1

      `curl --location 'http://localhost:8181/graphql' \
      --header 'Content-Type: application/json' \
      --data '{"query":"query {\n  helloWorld \n}","variables":{}}'`

   * Sample 2

      `curl --location 'http://localhost:8181/graphql' \
      --header 'Content-Type: application/json' \
      --data '{"query":"query shows {\n  shows(titleFilter: \"The\") {\n    title\n    releaseYear\n  }\n}","variables":{}}'`
