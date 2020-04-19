package com.jsh.erp.datasource.vo;

import com.jsh.erp.datasource.entities.Orders;

/**
 * 项目描述:SSS
 * 类  描  述:
 * 创  建  人:Abbey
 * 创建时间:2020/4/19
 */
public class OrdersVo4List extends Orders {
    private String ordertimeStr;
    private String departuretimeStr;
    private String deliverytimeStr;

    public String getOrdertimeStr() {
        return ordertimeStr;
    }

    public void setOrdertimeStr(String ordertimeStr) {
        this.ordertimeStr = ordertimeStr;
    }

    public String getDeparturetimeStr() {
        return departuretimeStr;
    }

    public void setDeparturetimeStr(String departuretimeStr) {
        this.departuretimeStr = departuretimeStr;
    }

    public String getDeliverytimeStr() {
        return deliverytimeStr;
    }

    public void setDeliverytimeStr(String deliverytimeStr) {
        this.deliverytimeStr = deliverytimeStr;
    }
}
