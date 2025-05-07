package com.junit.controller;


import com.junit.entity.Department;
import com.junit.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class HomeController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/addDept")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department){
        System.out.println(department.getLoc());
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/getAllDept")
    public ResponseEntity<List<Department>> getAllDept(){
        return departmentService.getDepts();
    }
    @GetMapping("/getDept/{deptName}")
    public ResponseEntity<Department> getDept(@PathVariable String deptName){
        return departmentService.getDeptByDeptName(deptName);
    }
    @GetMapping("/getDeptById/{deptNo}")
    public ResponseEntity<Department> getByDeptNo(@PathVariable int deptNo){
        return departmentService.getDeptByDeptno(deptNo);
    }
}
