package com.junit.service;

import com.junit.entity.Department;
import com.junit.repo.DepartmentRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class DepartmentServiceOneTest {

    //creating object manually
    @Test
    public void getDeptByDeptnoTest(){
       //mocking dao
        DepartmentRepo departmentRepo= Mockito.mock(DepartmentRepo.class);
       // defining behavior
        Mockito.when(departmentRepo.findById(1)).thenReturn(Optional.of(new Department(1,"abc","agra")));
        //passing departmentRepo to DepartmentService constructor and initializing repo because autowired work
        //only when spring context created
        DepartmentService departmentService=new DepartmentService(departmentRepo);
        //call method
        ResponseEntity<Department> response=departmentService.getDeptByDeptno(1);
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
        Assertions.assertEquals(1,response.getBody().getDeptNo());
        Assertions.assertEquals("abc",response.getBody().getDeptName());
        Assertions.assertEquals("agra",response.getBody().getLoc());

        //this will verify whether  findById gets called or not
        Mockito.verify(departmentRepo).findById(1);
    }


}
