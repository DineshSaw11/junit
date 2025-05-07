package com.junit.service;

import com.junit.entity.Department;
import com.junit.repo.DepartmentRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTwoTest {
    @Mock
    private DepartmentRepo departmentRepo;

    @InjectMocks
    private DepartmentService departmentService;

    @Test
    public void getDeptByDeptNoTest(){
        Mockito.when(departmentRepo.findById(1)).thenReturn(Optional.of(new Department(1,"abc","delhi")));

        ResponseEntity<Department> response=departmentService.getDeptByDeptno(1);
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
        Assertions.assertEquals("abc",response.getBody().getDeptName());

        // to verify
        Mockito.verify(departmentRepo).findById(1);
    }
}
