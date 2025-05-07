package com.junit.service;


import com.junit.entity.Department;
import com.junit.execption.DuplicateDepartment;
import com.junit.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo){
       this.departmentRepo=departmentRepo;
    }
    public ResponseEntity<Department> saveDepartment(Department department) {
        System.out.println("result"+department.getDeptName());
        Optional<Department> optionalDepartment= Optional.ofNullable(departmentRepo.findByDeptName(department.getDeptName()));
        if(optionalDepartment.isPresent()){
            throw new DuplicateDepartment("ept already existD");
        }else{
            return new ResponseEntity<>(departmentRepo.save(department), HttpStatus.CREATED);
        }

//        return new ResponseEntity<>(departmentRepo.save(department), HttpStatus.CREATED);

    }
    public ResponseEntity<List<Department>> getDepts() {
        List<Department> departments= departmentRepo.findAll();
        if(departments.isEmpty()){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(departments,HttpStatus.FOUND);
        }
    }

    public ResponseEntity<Department> getDeptByDeptName(String deptName) {
        return new ResponseEntity<>(departmentRepo.findByDeptName(deptName),HttpStatus.FOUND);
    }

    public ResponseEntity<Department> getDeptByDeptno(int deptNo) {
        Optional<Department> optionalDepartment=departmentRepo.findById(deptNo);
        if(optionalDepartment.isPresent()){
            return new ResponseEntity<>(optionalDepartment.get(),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
}
