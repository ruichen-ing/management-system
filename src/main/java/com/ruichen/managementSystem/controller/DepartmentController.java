package com.ruichen.managementSystem.controller;

import com.ruichen.managementSystem.pojo.entity.Department;
import com.ruichen.managementSystem.service.DepartmentService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dep")
public class DepartmentController {
    @Resource
    DepartmentService departmentService;

    @PostMapping("")
    public Department insert(@RequestBody @Validated Department dp){
        return departmentService.insertDp(dp);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        departmentService.deleteDp(id);
    }

    @DeleteMapping("")
    public void deleteIn(Integer[] ids){
        departmentService.deleteDpIn(ids);
    }

    @PutMapping("")
    public Department update(@RequestBody @Validated Department dp){
        return departmentService.updateDp(dp);
    }

    @GetMapping("/{id}")
    public Department find(@PathVariable Integer id){
        return departmentService.findDpById(id);
    }

    @GetMapping("")
    public List<Department> findAll(){
        return departmentService.findAllDp();
    }
}
