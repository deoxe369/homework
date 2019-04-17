package com.wongnai.interview.movie;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface MovieSearchService {
	List<Movie> search(String queryText) throws ExecutionException, InterruptedException;
}
