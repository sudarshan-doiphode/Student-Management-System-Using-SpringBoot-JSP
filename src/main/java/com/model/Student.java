package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String rollNumber;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String address;

}
