package com.example.eam.domain;

import javax.persistence.*;

@Table(name = "department")
public class Department {
    /**
     * &部门编号
     */
    @Id
    @Column(name = "department_id")
    private Long departmentId;

    /**
     * 部门名称
     */
    @Column(name = "department_name")
    private String departmentName;

    /**
     * 部门描述
     */
    @Column(name = "department_describe")
    private String departmentDescribe;

    /**
     * 获取&部门编号
     *
     * @return department_id - &部门编号
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置&部门编号
     *
     * @param departmentId &部门编号
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取部门名称
     *
     * @return department_name - 部门名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 设置部门名称
     *
     * @param departmentName 部门名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * 获取部门描述
     *
     * @return department_describe - 部门描述
     */
    public String getDepartmentDescribe() {
        return departmentDescribe;
    }

    /**
     * 设置部门描述
     *
     * @param departmentDescribe 部门描述
     */
    public void setDepartmentDescribe(String departmentDescribe) {
        this.departmentDescribe = departmentDescribe;
    }
}