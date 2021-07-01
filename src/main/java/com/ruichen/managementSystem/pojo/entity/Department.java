package com.ruichen.managementSystem.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruichen.managementSystem.model.DpStatus;
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
@Table(name="department_info")
@org.hibernate.annotations.Table(appliesTo = "department_info", comment = "部门表")
@EntityListeners(AuditingEntityListener.class)
public class Department {
    @Id
    @Column(name="id", columnDefinition = "int(4) COMMENT '部门id'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(cascade = CascadeType.ALL)
    private Integer id;

    @Column(name="name", nullable = false, columnDefinition = "varchar(30) COMMENT '部门名称'")
    @NotBlank(message = "部门名称不能为空")
    private String name;

    @Column(name = "location", columnDefinition = "varchar(50) COMMENT '部门地理位置'")
    private String location;

    @Column(name = "office", columnDefinition = "varchar(50) COMMENT '部门办公室'")
    private String office;

    @Column(name = "head_id", nullable = false, columnDefinition = "int(6) COMMENT '部门负责人id'")
    @NotNull(message = "部门负责人不能为空")
    private Long headId;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status", nullable = false, columnDefinition = "tinyint(1) COMMENT '账户状态(1: 筹备中; 2: 运营中; 3: 已解散)'")
    @NotNull(message = "部门状态不能为空")
    private DpStatus status;

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
}
