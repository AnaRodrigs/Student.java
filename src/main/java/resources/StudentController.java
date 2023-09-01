package resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entities.Student;
import com.example.student.services.StudentService;


@RestController
@RequestMapping("students")
public class StudentController {
    
    @Autowired
    private StudentService service;

    @GetMapping()
    public ResponseEntity<List<Student>> getStudents(){
       var students = this.service.getStudents();
       return ResponseEntity.ok(students);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudent(@PathVariable long id){
        var student = this.service.getStudent(id);
        return ResponseEntity.ok(student);
    }
}
