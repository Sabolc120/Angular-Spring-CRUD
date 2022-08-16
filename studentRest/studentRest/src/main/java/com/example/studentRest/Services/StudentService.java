package com.example.studentRest.Services;

import com.example.studentRest.Models.Student;
import com.example.studentRest.Repositories.StudentRepo;
import com.example.studentRest.StudentRestApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student registerStudent(Student student){
        return studentRepo.save(student);
    }
    public List<Student> getStudentsService(){
        return studentRepo.findAll();
    }
    public void deleteStudent(Long id){
        studentRepo.deleteById(id);
    }
    public Student updateStudent(Student student){
        long Id = student.getId();
        Student st = studentRepo.findById(Id).get();
        st.setName(student.getName());
        st.setAddress(student.getAddress());
        st.setPercentage(student.getPercentage());
        return studentRepo.save(st);
    }
}
