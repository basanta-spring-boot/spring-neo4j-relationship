package com.basant.spring.boot.neo4j.api.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private int pId;
	private String pName;
	private int qty;
	private double amount;

}
