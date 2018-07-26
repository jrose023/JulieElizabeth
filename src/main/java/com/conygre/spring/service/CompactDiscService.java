package com.conygre.spring.service;

import com.conygre.spring.entities.CompactDisc;

import java.util.Collection;

public interface CompactDiscService {
    Iterable<CompactDisc> getCatalog();
}
