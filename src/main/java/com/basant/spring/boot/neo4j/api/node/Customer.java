package com.basant.spring.boot.neo4j.api.node;

import java.util.List;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	private int id;
	private String name;
	private String[] address;
	@Relationship(type = "PURCHASE", direction = Relationship.OUTGOING)
	private List<Product> products;

}
