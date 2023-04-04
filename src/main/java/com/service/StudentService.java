package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ResourceNotFoundException;
import com.dto.StudentDto;
import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	ModelMapper modelMapper;

	public List<StudentDto> getAllStudents() {
		List<Student> students = (List<Student>) studentRepository.findAll();
		return students.stream().map(student -> modelMapper.map(student, StudentDto.class))
				.collect(Collectors.toList());
	}

	public StudentDto findById(Integer id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
		StudentDto dto = modelMapper.map(student, StudentDto.class);
		return dto;
	}

	public void createStudent(StudentDto studentDTO) {
		Student student = modelMapper.map(studentDTO, Student.class);
		studentRepository.save(student);
	}

	public void updateStudent(StudentDto studentDto) {
		Student student = modelMapper.map(studentDto, Student.class);
		studentRepository.save(student);
	}

	public void deletebyid(int id) {
		studentRepository.deleteById(id);
	}

}
