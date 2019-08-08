package com.elk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "employees", type = "emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
    private String id;
    private String name;
    private String designation;
	
}
