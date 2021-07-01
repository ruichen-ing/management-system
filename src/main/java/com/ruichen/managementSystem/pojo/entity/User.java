package com.ruichen.managementSystem.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruichen.managementSystem.model.Gender;
import com.ruichen.managementSystem.model.Status;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name="user_info")
@org.hibernate.annotations.Table(appliesTo = "user_info", comment = "用户表")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @Column(name="id", columnDefinition = "int(6) COMMENT '用户id'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="department_id", nullable = false, columnDefinition = "int(4) COMMENT '部门id'")
    @NotNull(message = "部门id不能为空")  //@NotNull多用在基本数据类型上(Int，Integer，Double)
    private Integer depId;

    @Column(name="fullname", nullable = false, columnDefinition = "varchar(50) COMMENT '姓名'")
    @NotBlank(message = "姓名不能为空")   //@NotBlank多用在String字符串上面(String)
    private String name;

    @Column(name = "username", nullable = false, columnDefinition = "varchar(50) COMMENT '密码'")
    @NotBlank(message = "用户名不能为空")
    private String username;

    @Column(name = "password", nullable = false, columnDefinition = "varchar(50) COMMENT '密码'")
    @NotBlank(message = "密码不能为空")
    private String password;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "gender", nullable = false, columnDefinition = "tinyint(1) COMMENT '性别(1: 男; 2: 女)'")
    @NotNull(message = "性别不能为空")
    private Gender gender;

    @Column(name = "address", columnDefinition = "varchar(100) COMMENT '地址'")
    private String address;

    @Column(name = "email", columnDefinition = "varchar(50) COMMENT '邮件'")
    private String email;

    @Column(name = "mobile", columnDefinition = "varchar(15) COMMENT '手机号'")
    private String mobile;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status", nullable = false, columnDefinition = "tinyint(1) COMMENT '账户状态(1: 已激活; 2: 冻结; 3: 删除)'")
    @NotNull(message = "账户状态不能为空")
    private Status status;

    @Column(name="created_date", columnDefinition = "datetime(6) COMMENT '创建时间'")
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdDate;

    @Column(name = "created_by", columnDefinition = "varchar(50) COMMENT '创建人'")
    @CreatedBy
    private String createdBy;

    @Column(name = "modified_Date", columnDefinition = "datetime(6) COMMENT '上次修改时间'")
    @LastModifiedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastModifiedDate;

    @Column(name = "modified_by", columnDefinition = "varchar(50) COMMENT '上次修改人'")
    @LastModifiedBy
    private String lastModifiedBy;

    //@NotEmpty; 加了@NotEmpty注解的String类 ，Collection集合，Map ，数组，这些是不能为null或者长度为0的;(String ,Collection,Map的isEmpty()方法)
}
