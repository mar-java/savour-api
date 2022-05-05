package com.marjava.savour_api.controller;

import com.marjava.savour_api.model.Producer;
import com.marjava.savour_api.repository.ProducerRepository;
import com.marjava.savour_api.util.WasSuccessful;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private final ProducerRepository repo;

    ProducerController(ProducerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public Producer getProducer(@PathVariable int id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Producer createProducer(@RequestBody Producer prod) {
        return repo.save(prod);
    }

    @PutMapping("/{id}")
    public Producer updateProducer(@PathVariable int id, @RequestBody Producer prod) {
        Producer main = repo.findById(id).orElseThrow();
        main.update(prod);

        return repo.save(main);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WasSuccessful> deleteProducer(@PathVariable int id) {
        Producer prod = repo.findById(id).orElseThrow();
        repo.delete(prod);

       return new ResponseEntity<WasSuccessful>(new WasSuccessful(true), HttpStatus.OK);
    }
}
