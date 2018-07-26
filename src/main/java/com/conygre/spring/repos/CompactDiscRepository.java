package com.conygre.spring.repos;

import com.conygre.spring.entities.CompactDisc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompactDiscRepository
        extends CrudRepository<CompactDisc, Integer> {
    }
