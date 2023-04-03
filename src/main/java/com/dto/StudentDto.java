package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StudentDto {

	private int id;

	private String firstName;

	private String lastName;

	private String address;

}
