package com.ruichen.managementSystem.service;

import com.ruichen.managementSystem.pojo.entity.Department;
import com.ruichen.managementSystem.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Resource
    DepartmentRepository departmentRepository;

    @Override
    public Department insertDp(Department dp){
        return departmentRepository.save(dp);
    }

    @Override
    public void deleteDp(Integer id){
        departmentRepository.deleteById(id);
    }

    @Override
    public void deleteDpIn(Integer[] ids){

    }

    @Override
    public Department updateDp(Department dp){
        return departmentRepository.save(dp);
    }

    @Override
    public Department findDpById(Integer id){
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Department> findAllDp(){
        return departmentRepository.findAll();
    }
}
