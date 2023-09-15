package org.example.controller;
import org.example.common.AjaxResult;
import org.example.domain.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * show list
     *
     * @return ajax result
     */
    @GetMapping("/list")
    public AjaxResult list() {
        List<Student> list = studentService.list();
        AjaxResult result = new AjaxResult();
        result.setData(list);
        return result;
    }

    /**
     * Add a new student
     *
     * @param student The student to add
     * @return ajax result
     */
    @PostMapping("/add")
    public AjaxResult addStudent (@RequestBody Student student){
        studentService.addStudent(student);
        AjaxResult result = new AjaxResult();
        result.setMsg("Student add successfully");
        return result;
    }


}

