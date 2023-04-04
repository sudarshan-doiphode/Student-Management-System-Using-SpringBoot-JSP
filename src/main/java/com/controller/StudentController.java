package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.StudentDto;
import com.service.StudentService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addStudent(HttpServletRequest request, Model model) {
		StudentDto student = new StudentDto(Integer.parseInt(request.getParameter("rollnumber")),
				request.getParameter("firstname"), request.getParameter("lastname"), request.getParameter("address"));
		studentService.createStudent(student);
		return "index.jsp";
	}

	@RequestMapping(value = "delete/{rollnumber}")
	public ModelAndView deleteUsers(@PathVariable int rollnumber) {
		studentService.deletebyid(rollnumber);
		return new ModelAndView("redirect:/index.jsp");
	}

	@RequestMapping("/getStudents")
	public ModelAndView displayStudents() {
		System.out.println("inside display..");
		List<StudentDto> studentlist = studentService.getAllStudents();
		ModelAndView mv = new ModelAndView();
		mv.addObject("studentlist", studentlist);
		mv.setViewName("list.jsp");
		System.out.println("end of  display.." + studentlist);
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateform(HttpServletRequest request) {
		Integer rollno = Integer.parseInt(request.getParameter("rollnumber"));
		StudentDto student = studentService.findById(rollno);
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
		mv.setViewName("update.jsp");
		return mv;
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public String updateStudent(HttpServletRequest request) {
		StudentDto student = new StudentDto();
		student.setRollnumber(Integer.parseInt(request.getParameter("rollnumber")));
		student.setFirstname(request.getParameter("firstname"));
		student.setLastname(request.getParameter("lastname"));
		student.setAddress(request.getParameter("address"));
		studentService.updateStudent(student);
		return "list.jsp";
	}

}
