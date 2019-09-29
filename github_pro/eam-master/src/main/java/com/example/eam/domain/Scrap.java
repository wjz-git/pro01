package com.example.eam.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "scrap")
public class Scrap {
    /**
     * &报废编号
     */
    @Id
    @Column(name = "scrap_id")
    private Long scrapId;

    /**
     * 报废日期
     */
    @Column(name = "scrp_time")
    private Date scrpTime;

    /**
     * *资产编号
     */
    @Column(name = "assets_id")
    private Long assetsId;

    /**
     * 获取&报废编号
     *
     * @return scrap_id - &报废编号
     */
    public Long getScrapId() {
        return scrapId;
    }

    /**
     * 设置&报废编号
     *
     * @param scrapId &报废编号
     */
    public void setScrapId(Long scrapId) {
        this.scrapId = scrapId;
    }

    /**
     * 获取报废日期
     *
     * @return scrp_time - 报废日期
     */
    public Date getScrpTime() {
        return scrpTime;
    }

    /**
     * 设置报废日期
     *
     * @param scrpTime 报废日期
     */
    public void setScrpTime(Date scrpTime) {
        this.scrpTime = scrpTime;
    }

    /**
     * 获取*资产编号
     *
     * @return assets_id - *资产编号
     */
    public Long getAssetsId() {
        return assetsId;
    }

    /**
     * 设置*资产编号
     *
     * @param assetsId *资产编号
     */
    public void setAssetsId(Long assetsId) {
        this.assetsId = assetsId;
    }
}