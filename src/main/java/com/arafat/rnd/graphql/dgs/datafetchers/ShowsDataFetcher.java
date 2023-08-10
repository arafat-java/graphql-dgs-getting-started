package com.arafat.rnd.graphql.dgs.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;

@DgsComponent
public class ShowsDataFetcher {

    private final List<Show> shows = List.of(
            new Show("Stranger Things", 2016),
            new Show("Ozark", 2017),
            new Show("The Crown", 2016),
            new Show("Dead to Me", 2019),
            new Show("Orange Is The New Black", 2013)
    );

    @DgsQuery
    public String helloWorld() {
        return "Hello World... Welcome to Graphql with DGS";
    }

    @DgsQuery
    public List<Show> shows(@InputArgument String titleFilter) {
        if(titleFilter == null) {
            return shows;
        }
        return shows.stream().filter(s -> s.title().contains(titleFilter)).toList();
    }
}

