package org.example.service;
import org.example.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import org.example.domain.Student;
import org.springframework.stereotype.Service;

public interface StudentService extends IService<Student> {
    void addStudent(Student student);
}



