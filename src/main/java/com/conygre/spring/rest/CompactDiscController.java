package com.conygre.spring.rest;

import com.conygre.spring.service.CompactDiscService;
import com.conygre.spring.entities.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compactdiscs")
public class CompactDiscController {

    @Autowired
    private CompactDiscService svc;

    @RequestMapping(method = RequestMethod.GET)
    Iterable<CompactDisc> findAll(){
        return svc.getCatalog();
    }
}
