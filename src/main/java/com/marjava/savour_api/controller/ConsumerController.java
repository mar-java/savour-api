package com.marjava.savour_api.controller;

import com.marjava.savour_api.model.Consumer;
import com.marjava.savour_api.repository.ConsumerRepository;
import com.marjava.savour_api.util.WasSuccessful;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    ConsumerRepository repo;

    public ConsumerController(ConsumerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public Consumer getConsumer(@PathVariable int id) {
        return repo.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @PostMapping
    public Consumer createConsumer(@RequestBody Consumer cons) {
       return repo.save(cons);
    }

    @PutMapping("/{id}")
    public Consumer updateConsumer(@PathVariable int id, @RequestBody Consumer cons) {
       Consumer main = repo.findById(id).orElseThrow(ResourceNotFoundException::new);
       main.update(cons);

       return repo.save(main);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WasSuccessful> deleteConsumer(@PathVariable int id) {
        Consumer cons = repo.findById(id).orElseThrow(ResourceNotFoundException::new);
        repo.delete(cons);

        return new ResponseEntity<WasSuccessful>(new WasSuccessful(true), HttpStatus.OK);
    }
}
