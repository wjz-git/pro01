package com.example.eam.domain;

import javax.persistence.*;

@Table(name = "limit")
public class Limit {
    /**
     * 权限id
     */
    @Id
    @Column(name = "limit_id")
    private Long limitId;

    /**
     * 权限类型
     */
    @Column(name = "limit_type")
    private Integer limitType;

    /**
     * 权限备注
     */
    @Column(name = "limit_remarks")
    private String limitRemarks;

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

    /**
     * 获取权限类型
     *
     * @return limit_type - 权限类型
     */
    public Integer getLimitType() {
        return limitType;
    }

    /**
     * 设置权限类型
     *
     * @param limitType 权限类型
     */
    public void setLimitType(Integer limitType) {
        this.limitType = limitType;
    }

    /**
     * 获取权限备注
     *
     * @return limit_remarks - 权限备注
     */
    public String getLimitRemarks() {
        return limitRemarks;
    }

    /**
     * 设置权限备注
     *
     * @param limitRemarks 权限备注
     */
    public void setLimitRemarks(String limitRemarks) {
        this.limitRemarks = limitRemarks;
    }
}