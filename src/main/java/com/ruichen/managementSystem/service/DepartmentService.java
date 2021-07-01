package com.ruichen.managementSystem.service;

import com.ruichen.managementSystem.pojo.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department insertDp(Department dp);

    void deleteDp(Integer id);

    void deleteDpIn(Integer[] ids);

    Department updateDp(Department dp);

    Department findDpById(Integer id);

    List<Department> findAllDp();
}
