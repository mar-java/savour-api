package com.marjava.savour_api.controller;

import com.marjava.savour_api.model.Consumer;
import com.marjava.savour_api.repository.ConsumerRepository;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    ConsumerRepository repo;

    public ConsumerController(ConsumerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public Consumer getConsumer(@PathVariable int id) {
        return repo.findById(id).orElseThrow();
    }

    @PostMapping
    public Consumer createConsumer(@RequestBody Consumer cons) {
       return repo.save(cons);
    }

    @PutMapping("/{id}")
    public Consumer updateConsumer(@PathVariable int id, @RequestBody Consumer cons) {
       Consumer main = repo.findById(id).orElseThrow();
       main.update(cons);

       return repo.save(main);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WasSuccessful> deleteConsumer(@PathVariable int id) {
        Consumer cons = repo.findById(id).orElseThrow();
        repo.delete(cons);

        return new ResponseEntity<WasSuccessful>(new WasSuccessful(true), HttpStatus.OK);
    }
}
