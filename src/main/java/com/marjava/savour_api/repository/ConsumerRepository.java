package com.marjava.savour_api.repository;

import com.marjava.savour_api.model.Consumer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends CrudRepository<Consumer, Integer> {}
