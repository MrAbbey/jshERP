package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Long id;

    private Date ordertime;//订单时间

    private String vehicletype;//车型

    private String bookingunit;//订车单位

    private String model;//型号

    private String chassissupplier;//底盘供应商

    private String chassisnumber;//底盘号

    private String chassisconfig;//底盘配置

    private BigDecimal chassisamount;//底盘金额

    private String chassispayment;//底盘付款情况

    private String chassistaxticket;//底盘税票

    private String modifiedvehicle;//改装厂

    private BigDecimal modificationfee;//改装费

    private String modificationdesc;//改装备注

    private String addconfig;//额外配置

    private String taxticket;//税票

    private BigDecimal vehicledeliverycost;//整车出厂成本

    private BigDecimal freight;//运费

    private String driver;//司机

    private String freightsettlement;//运费结算情况

    private Date departuretime;//发车时间

    private Date deliverytime;//交车时间

    private BigDecimal totalcost;//总成本

    private BigDecimal sellingprice;//销售价格

    private BigDecimal contractprice;//合同价格

    private BigDecimal rebate;//返利

    private String repaymentstatus;//回款情况

    private String stillowing;

    private String vehicletaxreceipt;

    private String deleteFlag;

    private Long tenantId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getVehicletype() {
        return 
vehicletype;
    }

    public void setVehicletype(String
vehicletype) {
        this.
vehicletype = 
vehicletype == null ? null : 
vehicletype.trim();
    }

    public String getBookingunit() {
        return bookingunit;
    }

    public void setBookingunit(String bookingunit) {
        this.bookingunit = bookingunit == null ? null : bookingunit.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getChassissupplier() {
        return chassissupplier;
    }

    public void setChassissupplier(String chassissupplier) {
        this.chassissupplier = chassissupplier == null ? null : chassissupplier.trim();
    }

    public String getChassisnumber() {
        return chassisnumber;
    }

    public void setChassisnumber(String chassisnumber) {
        this.chassisnumber = chassisnumber == null ? null : chassisnumber.trim();
    }

    public String getChassisconfig() {
        return chassisconfig;
    }

    public void setChassisconfig(String chassisconfig) {
        this.chassisconfig = chassisconfig == null ? null : chassisconfig.trim();
    }

    public BigDecimal getChassisamount() {
        return chassisamount;
    }

    public void setChassisamount(BigDecimal chassisamount) {
        this.chassisamount = chassisamount;
    }

    public String getChassispayment() {
        return chassispayment;
    }

    public void setChassispayment(String chassispayment) {
        this.chassispayment = chassispayment == null ? null : chassispayment.trim();
    }

    public String getChassistaxticket() {
        return chassistaxticket;
    }

    public void setChassistaxticket(String chassistaxticket) {
        this.chassistaxticket = chassistaxticket == null ? null : chassistaxticket.trim();
    }

    public String getModifiedvehicle() {
        return modifiedvehicle;
    }

    public void setModifiedvehicle(String modifiedvehicle) {
        this.modifiedvehicle = modifiedvehicle == null ? null : modifiedvehicle.trim();
    }

    public BigDecimal getModificationfee() {
        return modificationfee;
    }

    public void setModificationfee(BigDecimal modificationfee) {
        this.modificationfee = modificationfee;
    }

    public String getModificationdesc() {
        return modificationdesc;
    }

    public void setModificationdesc(String modificationdesc) {
        this.modificationdesc = modificationdesc == null ? null : modificationdesc.trim();
    }

    public String getAddconfig() {
        return addconfig;
    }

    public void setAddconfig(String addconfig) {
        this.addconfig = addconfig == null ? null : addconfig.trim();
    }

    public String getTaxticket() {
        return taxticket;
    }

    public void setTaxticket(String taxticket) {
        this.taxticket = taxticket == null ? null : taxticket.trim();
    }

    public BigDecimal getVehicledeliverycost() {
        return vehicledeliverycost;
    }

    public void setVehicledeliverycost(BigDecimal vehicledeliverycost) {
        this.vehicledeliverycost = vehicledeliverycost;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getFreightsettlement() {
        return freightsettlement;
    }

    public void setFreightsettlement(String freightsettlement) {
        this.freightsettlement = freightsettlement == null ? null : freightsettlement.trim();
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public BigDecimal getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(BigDecimal totalcost) {
        this.totalcost = totalcost;
    }

    public BigDecimal getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(BigDecimal sellingprice) {
        this.sellingprice = sellingprice;
    }

    public BigDecimal getContractprice() {
        return contractprice;
    }

    public void setContractprice(BigDecimal contractprice) {
        this.contractprice = contractprice;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public String getRepaymentstatus() {
        return repaymentstatus;
    }

    public void setRepaymentstatus(String repaymentstatus) {
        this.repaymentstatus = repaymentstatus == null ? null : repaymentstatus.trim();
    }

    public String getStillowing() {
        return stillowing;
    }

    public void setStillowing(String stillowing) {
        this.stillowing = stillowing == null ? null : stillowing.trim();
    }

    public String getVehicletaxreceipt() {
        return vehicletaxreceipt;
    }

    public void setVehicletaxreceipt(String vehicletaxreceipt) {
        this.vehicletaxreceipt = vehicletaxreceipt == null ? null : vehicletaxreceipt.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
}