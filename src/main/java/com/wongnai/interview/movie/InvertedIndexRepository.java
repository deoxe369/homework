package com.wongnai.interview.movie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvertedIndexRepository extends CrudRepository<InvertedIndex, String> {

	InvertedIndex findByTerm(String term);
}
