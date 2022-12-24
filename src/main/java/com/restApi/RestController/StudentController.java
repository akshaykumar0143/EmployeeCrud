package com.restApi.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.entity.Student;
import com.restApi.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		studentRepo.save(student);
		return "student Added";
	}
	
	@GetMapping("/getAll")
	public List<Student> getStudent() {
		List<Student> student=studentRepo.findAll();
		return student;
	}
	
	@GetMapping("/getById/{sid}")
	public Student getStudentById(@PathVariable("sid") int sid) {
	 Optional<Student> findById = studentRepo.findById(sid);
	 Student student = findById.get();
	 return student;
	}

}
