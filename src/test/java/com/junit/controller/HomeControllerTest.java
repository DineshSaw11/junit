//package com.junit.controller;
//
//import com.junit.entity.Department;
//import com.junit.service.DepartmentService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(HomeControllerTest.class)
//public class HomeControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private DepartmentService departmentService;
//
//    @Test
//    public void getDeptByDeptNo() throws Exception {
//        Department department=new Department(1,"abc","delhi");
//        Mockito.when(departmentService.getDeptByDeptno(1)).thenReturn(new ResponseEntity<>(department, HttpStatus.OK));
//
//        MockHttpServletRequestBuilder requestBuilders= MockMvcRequestBuilders.get("/dept/getDeptById/{deptNo}",1);
//
//        MockHttpServletResponse response=mockMvc.perform(requestBuilders)
//                .andReturn().getResponse();
//        Assertions.assertEquals(200,response.getStatus());
//
//        // here i m getting exception check it
//    }
//
//    @Test
//    public  void addDepartmentTest() throws Exception {
//        Department department=new Department(1,"abc","delhi");
//
//        Mockito.when(departmentService.saveDepartment(department)).thenReturn(new ResponseEntity<>(department,HttpStatus.CREATED));
//
//        MockHttpServletResponse response=mockMvc.perform(post("/addDept",department))
//                .andReturn().getResponse();
//        Assertions.assertEquals(201,response.getStatus());
//    }
//}
