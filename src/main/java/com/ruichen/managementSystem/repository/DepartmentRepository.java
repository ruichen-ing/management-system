package com.ruichen.managementSystem.repository;

import com.ruichen.managementSystem.pojo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentRepository extends JpaRepository<Department, Integer>, JpaSpecificationExecutor<Department> {

}
