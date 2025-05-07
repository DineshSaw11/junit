package com.junit.repo;


import com.junit.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
    Department findByDeptName(String deptName);
}
