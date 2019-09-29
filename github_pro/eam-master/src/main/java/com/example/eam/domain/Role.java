package com.example.eam.domain;

import javax.persistence.*;

@Table(name = "role")
public class Role {
    /**
     * 角色id
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 角色名
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色状态
     */
    @Column(name = "role_status")
    private Boolean roleStatus;

    /**
     * 备注
     */
    @Column(name = "role_remarks")
    private String roleRemarks;

    /**
     * 权限id
     */
    @Column(name = "limit_id")
    private Long limitId;

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名
     *
     * @return role_name - 角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名
     *
     * @param roleName 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色状态
     *
     * @return role_status - 角色状态
     */
    public Boolean getRoleStatus() {
        return roleStatus;
    }

    /**
     * 设置角色状态
     *
     * @param roleStatus 角色状态
     */
    public void setRoleStatus(Boolean roleStatus) {
        this.roleStatus = roleStatus;
    }

    /**
     * 获取备注
     *
     * @return role_remarks - 备注
     */
    public String getRoleRemarks() {
        return roleRemarks;
    }

    /**
     * 设置备注
     *
     * @param roleRemarks 备注
     */
    public void setRoleRemarks(String roleRemarks) {
        this.roleRemarks = roleRemarks;
    }

    /**
     * 获取权限id
     *
     * @return limit_id - 权限id
     */
    public Long getLimitId() {
        return limitId;
    }

    /**
     * 设置权限id
     *
     * @param limitId 权限id
     */
    public void setLimitId(Long limitId) {
        this.limitId = limitId;
    }
}