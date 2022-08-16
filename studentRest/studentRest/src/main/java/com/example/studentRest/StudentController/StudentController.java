package com.example.studentRest.StudentController;

import com.example.studentRest.Models.Student;
import com.example.studentRest.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/registerStudent")
    public Student registerStudent(@RequestBody Student student){
        //Checking...
        System.out.println(student.getAddress());
       return studentService.registerStudent(student);
    }
    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudentsService();
    }
    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestParam Long id){
        studentService.deleteStudent(id);
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
}
