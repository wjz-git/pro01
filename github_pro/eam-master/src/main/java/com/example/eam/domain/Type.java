package com.example.eam.domain;

import javax.persistence.*;

@Table(name = "type")
public class Type {
    /**
     * 类别id
     */
    @Id
    @Column(name = "type_id")
    private Long typeId;

    /**
     * 类别名字
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 获取类别id
     *
     * @return type_id - 类别id
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置类别id
     *
     * @param typeId 类别id
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取类别名字
     *
     * @return type_name - 类别名字
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类别名字
     *
     * @param typeName 类别名字
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}