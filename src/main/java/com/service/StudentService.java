package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.ResourceNotFoundException;
import com.dto.StudentDto;
import com.model.Student;
import com.repository.StudentRepository;

public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	ModelMapper modelMapper;

	public List<StudentDto> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students.stream().map(student -> modelMapper.map(student, StudentDto.class))
				.collect(Collectors.toList());
	}

	public StudentDto findById(Integer id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
		return modelMapper.map(student, StudentDto.class);
	}

	public StudentDto createStudent(StudentDto studentDTO) {
		Student student = modelMapper.map(studentDTO, Student.class);
		Student savedStudent = studentRepository.save(student);
		return modelMapper.map(savedStudent, StudentDto.class);
	}

	public StudentDto updateStudent(Integer id, StudentDto studentDto) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
		student.setFirstName(studentDto.getFirstName());
		student.setLastName(studentDto.getLastName());
		student.setAddress(studentDto.getAddress());
		Student updatedStudent = studentRepository.save(student);
		return modelMapper.map(updatedStudent, StudentDto.class);
	}

	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}

}
