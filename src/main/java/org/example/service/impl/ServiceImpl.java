package org.example.service.impl;

import org.example.domain.Student;
import org.example.mapper.StudentMapper;
import org.example.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl extends com.baomidou.mybatisplus.extension.service.impl.ServiceImpl<StudentMapper,Student> implements StudentService {

}
