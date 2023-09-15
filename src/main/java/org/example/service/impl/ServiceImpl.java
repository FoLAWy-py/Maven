package org.example.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.domain.Student;
import org.example.mapper.StudentMapper;
import org.example.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl extends com.baomidou.mybatisplus.extension.service.impl.ServiceImpl<StudentMapper,Student> implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) {
        // Use the insert method inherited from ServiceImpl
        this.save(student);
    }

}
