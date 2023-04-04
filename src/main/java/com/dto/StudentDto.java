package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

	private Integer rollnumber;

	private String firstname;

	private String lastname;

	private String address;


}
