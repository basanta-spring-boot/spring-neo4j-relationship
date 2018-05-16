package com.basant.spring.boot.neo4j.api.dao;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.basant.spring.boot.neo4j.api.node.Customer;

public interface CustomerRepository extends Neo4jRepository<Customer, Integer> {

}
