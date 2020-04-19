package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("OrderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("OrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("OrderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("OrderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("OrderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("OrderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("OrderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("OrderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("OrderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("OrderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("OrderTime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andvehicletypeIsNull() {
            addCriterion(" VehicleType is null");
            return (Criteria) this;
        }

        public Criteria andvehicletypeIsNotNull() {
            addCriterion(" VehicleType is not null");
            return (Criteria) this;
        }

        public Criteria andvehicletypeEqualTo(String value) {
            addCriterion(" VehicleType =", value, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeNotEqualTo(String value) {
            addCriterion(" VehicleType <>", value, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeGreaterThan(String value) {
            addCriterion(" VehicleType >", value, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeGreaterThanOrEqualTo(String value) {
            addCriterion(" VehicleType >=", value, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeLessThan(String value) {
            addCriterion(" VehicleType <", value, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeLessThanOrEqualTo(String value) {
            addCriterion(" VehicleType <=", value, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeLike(String value) {
            addCriterion(" VehicleType like", value, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeNotLike(String value) {
            addCriterion(" VehicleType not like", value, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeIn(List<String> values) {
            addCriterion(" VehicleType in", values, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeNotIn(List<String> values) {
            addCriterion(" VehicleType not in", values, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeBetween(String value1, String value2) {
            addCriterion(" VehicleType between", value1, value2, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andvehicletypeNotBetween(String value1, String value2) {
            addCriterion(" VehicleType not between", value1, value2, " vehicletype");
            return (Criteria) this;
        }

        public Criteria andBookingunitIsNull() {
            addCriterion("BookingUnit is null");
            return (Criteria) this;
        }

        public Criteria andBookingunitIsNotNull() {
            addCriterion("BookingUnit is not null");
            return (Criteria) this;
        }

        public Criteria andBookingunitEqualTo(String value) {
            addCriterion("BookingUnit =", value, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitNotEqualTo(String value) {
            addCriterion("BookingUnit <>", value, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitGreaterThan(String value) {
            addCriterion("BookingUnit >", value, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitGreaterThanOrEqualTo(String value) {
            addCriterion("BookingUnit >=", value, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitLessThan(String value) {
            addCriterion("BookingUnit <", value, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitLessThanOrEqualTo(String value) {
            addCriterion("BookingUnit <=", value, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitLike(String value) {
            addCriterion("BookingUnit like", value, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitNotLike(String value) {
            addCriterion("BookingUnit not like", value, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitIn(List<String> values) {
            addCriterion("BookingUnit in", values, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitNotIn(List<String> values) {
            addCriterion("BookingUnit not in", values, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitBetween(String value1, String value2) {
            addCriterion("BookingUnit between", value1, value2, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andBookingunitNotBetween(String value1, String value2) {
            addCriterion("BookingUnit not between", value1, value2, "bookingunit");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("Model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("Model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("Model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("Model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("Model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("Model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("Model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("Model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("Model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("Model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("Model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("Model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("Model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("Model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andChassissupplierIsNull() {
            addCriterion("ChassisSupplier is null");
            return (Criteria) this;
        }

        public Criteria andChassissupplierIsNotNull() {
            addCriterion("ChassisSupplier is not null");
            return (Criteria) this;
        }

        public Criteria andChassissupplierEqualTo(String value) {
            addCriterion("ChassisSupplier =", value, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierNotEqualTo(String value) {
            addCriterion("ChassisSupplier <>", value, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierGreaterThan(String value) {
            addCriterion("ChassisSupplier >", value, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierGreaterThanOrEqualTo(String value) {
            addCriterion("ChassisSupplier >=", value, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierLessThan(String value) {
            addCriterion("ChassisSupplier <", value, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierLessThanOrEqualTo(String value) {
            addCriterion("ChassisSupplier <=", value, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierLike(String value) {
            addCriterion("ChassisSupplier like", value, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierNotLike(String value) {
            addCriterion("ChassisSupplier not like", value, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierIn(List<String> values) {
            addCriterion("ChassisSupplier in", values, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierNotIn(List<String> values) {
            addCriterion("ChassisSupplier not in", values, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierBetween(String value1, String value2) {
            addCriterion("ChassisSupplier between", value1, value2, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andChassissupplierNotBetween(String value1, String value2) {
            addCriterion("ChassisSupplier not between", value1, value2, "chassissupplier");
            return (Criteria) this;
        }

        public Criteria andchassisnumberIsNull() {
            addCriterion(" ChassisNumber is null");
            return (Criteria) this;
        }

        public Criteria andchassisnumberIsNotNull() {
            addCriterion(" ChassisNumber is not null");
            return (Criteria) this;
        }

        public Criteria andchassisnumberEqualTo(String value) {
            addCriterion(" ChassisNumber =", value, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberNotEqualTo(String value) {
            addCriterion(" ChassisNumber <>", value, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberGreaterThan(String value) {
            addCriterion(" ChassisNumber >", value, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberGreaterThanOrEqualTo(String value) {
            addCriterion(" ChassisNumber >=", value, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberLessThan(String value) {
            addCriterion(" ChassisNumber <", value, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberLessThanOrEqualTo(String value) {
            addCriterion(" ChassisNumber <=", value, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberLike(String value) {
            addCriterion(" ChassisNumber like", value, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberNotLike(String value) {
            addCriterion(" ChassisNumber not like", value, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberIn(List<String> values) {
            addCriterion(" ChassisNumber in", values, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberNotIn(List<String> values) {
            addCriterion(" ChassisNumber not in", values, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberBetween(String value1, String value2) {
            addCriterion(" ChassisNumber between", value1, value2, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andchassisnumberNotBetween(String value1, String value2) {
            addCriterion(" ChassisNumber not between", value1, value2, " chassisnumber");
            return (Criteria) this;
        }

        public Criteria andChassisconfigIsNull() {
            addCriterion("ChassisConfig is null");
            return (Criteria) this;
        }

        public Criteria andChassisconfigIsNotNull() {
            addCriterion("ChassisConfig is not null");
            return (Criteria) this;
        }

        public Criteria andChassisconfigEqualTo(String value) {
            addCriterion("ChassisConfig =", value, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigNotEqualTo(String value) {
            addCriterion("ChassisConfig <>", value, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigGreaterThan(String value) {
            addCriterion("ChassisConfig >", value, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigGreaterThanOrEqualTo(String value) {
            addCriterion("ChassisConfig >=", value, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigLessThan(String value) {
            addCriterion("ChassisConfig <", value, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigLessThanOrEqualTo(String value) {
            addCriterion("ChassisConfig <=", value, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigLike(String value) {
            addCriterion("ChassisConfig like", value, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigNotLike(String value) {
            addCriterion("ChassisConfig not like", value, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigIn(List<String> values) {
            addCriterion("ChassisConfig in", values, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigNotIn(List<String> values) {
            addCriterion("ChassisConfig not in", values, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigBetween(String value1, String value2) {
            addCriterion("ChassisConfig between", value1, value2, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisconfigNotBetween(String value1, String value2) {
            addCriterion("ChassisConfig not between", value1, value2, "chassisconfig");
            return (Criteria) this;
        }

        public Criteria andChassisamountIsNull() {
            addCriterion("ChassisAmount is null");
            return (Criteria) this;
        }

        public Criteria andChassisamountIsNotNull() {
            addCriterion("ChassisAmount is not null");
            return (Criteria) this;
        }

        public Criteria andChassisamountEqualTo(BigDecimal value) {
            addCriterion("ChassisAmount =", value, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountNotEqualTo(BigDecimal value) {
            addCriterion("ChassisAmount <>", value, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountGreaterThan(BigDecimal value) {
            addCriterion("ChassisAmount >", value, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChassisAmount >=", value, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountLessThan(BigDecimal value) {
            addCriterion("ChassisAmount <", value, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChassisAmount <=", value, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountIn(List<BigDecimal> values) {
            addCriterion("ChassisAmount in", values, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountNotIn(List<BigDecimal> values) {
            addCriterion("ChassisAmount not in", values, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChassisAmount between", value1, value2, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassisamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChassisAmount not between", value1, value2, "chassisamount");
            return (Criteria) this;
        }

        public Criteria andChassispaymentIsNull() {
            addCriterion("ChassisPayment is null");
            return (Criteria) this;
        }

        public Criteria andChassispaymentIsNotNull() {
            addCriterion("ChassisPayment is not null");
            return (Criteria) this;
        }

        public Criteria andChassispaymentEqualTo(String value) {
            addCriterion("ChassisPayment =", value, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentNotEqualTo(String value) {
            addCriterion("ChassisPayment <>", value, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentGreaterThan(String value) {
            addCriterion("ChassisPayment >", value, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentGreaterThanOrEqualTo(String value) {
            addCriterion("ChassisPayment >=", value, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentLessThan(String value) {
            addCriterion("ChassisPayment <", value, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentLessThanOrEqualTo(String value) {
            addCriterion("ChassisPayment <=", value, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentLike(String value) {
            addCriterion("ChassisPayment like", value, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentNotLike(String value) {
            addCriterion("ChassisPayment not like", value, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentIn(List<String> values) {
            addCriterion("ChassisPayment in", values, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentNotIn(List<String> values) {
            addCriterion("ChassisPayment not in", values, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentBetween(String value1, String value2) {
            addCriterion("ChassisPayment between", value1, value2, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassispaymentNotBetween(String value1, String value2) {
            addCriterion("ChassisPayment not between", value1, value2, "chassispayment");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketIsNull() {
            addCriterion("ChassisTaxTicket is null");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketIsNotNull() {
            addCriterion("ChassisTaxTicket is not null");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketEqualTo(String value) {
            addCriterion("ChassisTaxTicket =", value, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketNotEqualTo(String value) {
            addCriterion("ChassisTaxTicket <>", value, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketGreaterThan(String value) {
            addCriterion("ChassisTaxTicket >", value, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketGreaterThanOrEqualTo(String value) {
            addCriterion("ChassisTaxTicket >=", value, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketLessThan(String value) {
            addCriterion("ChassisTaxTicket <", value, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketLessThanOrEqualTo(String value) {
            addCriterion("ChassisTaxTicket <=", value, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketLike(String value) {
            addCriterion("ChassisTaxTicket like", value, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketNotLike(String value) {
            addCriterion("ChassisTaxTicket not like", value, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketIn(List<String> values) {
            addCriterion("ChassisTaxTicket in", values, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketNotIn(List<String> values) {
            addCriterion("ChassisTaxTicket not in", values, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketBetween(String value1, String value2) {
            addCriterion("ChassisTaxTicket between", value1, value2, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andChassistaxticketNotBetween(String value1, String value2) {
            addCriterion("ChassisTaxTicket not between", value1, value2, "chassistaxticket");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleIsNull() {
            addCriterion("ModifiedVehicle is null");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleIsNotNull() {
            addCriterion("ModifiedVehicle is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleEqualTo(String value) {
            addCriterion("ModifiedVehicle =", value, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleNotEqualTo(String value) {
            addCriterion("ModifiedVehicle <>", value, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleGreaterThan(String value) {
            addCriterion("ModifiedVehicle >", value, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleGreaterThanOrEqualTo(String value) {
            addCriterion("ModifiedVehicle >=", value, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleLessThan(String value) {
            addCriterion("ModifiedVehicle <", value, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleLessThanOrEqualTo(String value) {
            addCriterion("ModifiedVehicle <=", value, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleLike(String value) {
            addCriterion("ModifiedVehicle like", value, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleNotLike(String value) {
            addCriterion("ModifiedVehicle not like", value, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleIn(List<String> values) {
            addCriterion("ModifiedVehicle in", values, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleNotIn(List<String> values) {
            addCriterion("ModifiedVehicle not in", values, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleBetween(String value1, String value2) {
            addCriterion("ModifiedVehicle between", value1, value2, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModifiedvehicleNotBetween(String value1, String value2) {
            addCriterion("ModifiedVehicle not between", value1, value2, "modifiedvehicle");
            return (Criteria) this;
        }

        public Criteria andModificationfeeIsNull() {
            addCriterion("ModificationFee is null");
            return (Criteria) this;
        }

        public Criteria andModificationfeeIsNotNull() {
            addCriterion("ModificationFee is not null");
            return (Criteria) this;
        }

        public Criteria andModificationfeeEqualTo(BigDecimal value) {
            addCriterion("ModificationFee =", value, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeNotEqualTo(BigDecimal value) {
            addCriterion("ModificationFee <>", value, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeGreaterThan(BigDecimal value) {
            addCriterion("ModificationFee >", value, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ModificationFee >=", value, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeLessThan(BigDecimal value) {
            addCriterion("ModificationFee <", value, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ModificationFee <=", value, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeIn(List<BigDecimal> values) {
            addCriterion("ModificationFee in", values, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeNotIn(List<BigDecimal> values) {
            addCriterion("ModificationFee not in", values, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ModificationFee between", value1, value2, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ModificationFee not between", value1, value2, "modificationfee");
            return (Criteria) this;
        }

        public Criteria andModificationdescIsNull() {
            addCriterion("ModificationDesc is null");
            return (Criteria) this;
        }

        public Criteria andModificationdescIsNotNull() {
            addCriterion("ModificationDesc is not null");
            return (Criteria) this;
        }

        public Criteria andModificationdescEqualTo(String value) {
            addCriterion("ModificationDesc =", value, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescNotEqualTo(String value) {
            addCriterion("ModificationDesc <>", value, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescGreaterThan(String value) {
            addCriterion("ModificationDesc >", value, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescGreaterThanOrEqualTo(String value) {
            addCriterion("ModificationDesc >=", value, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescLessThan(String value) {
            addCriterion("ModificationDesc <", value, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescLessThanOrEqualTo(String value) {
            addCriterion("ModificationDesc <=", value, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescLike(String value) {
            addCriterion("ModificationDesc like", value, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescNotLike(String value) {
            addCriterion("ModificationDesc not like", value, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescIn(List<String> values) {
            addCriterion("ModificationDesc in", values, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescNotIn(List<String> values) {
            addCriterion("ModificationDesc not in", values, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescBetween(String value1, String value2) {
            addCriterion("ModificationDesc between", value1, value2, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andModificationdescNotBetween(String value1, String value2) {
            addCriterion("ModificationDesc not between", value1, value2, "modificationdesc");
            return (Criteria) this;
        }

        public Criteria andAddconfigIsNull() {
            addCriterion("AddConfig is null");
            return (Criteria) this;
        }

        public Criteria andAddconfigIsNotNull() {
            addCriterion("AddConfig is not null");
            return (Criteria) this;
        }

        public Criteria andAddconfigEqualTo(String value) {
            addCriterion("AddConfig =", value, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigNotEqualTo(String value) {
            addCriterion("AddConfig <>", value, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigGreaterThan(String value) {
            addCriterion("AddConfig >", value, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigGreaterThanOrEqualTo(String value) {
            addCriterion("AddConfig >=", value, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigLessThan(String value) {
            addCriterion("AddConfig <", value, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigLessThanOrEqualTo(String value) {
            addCriterion("AddConfig <=", value, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigLike(String value) {
            addCriterion("AddConfig like", value, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigNotLike(String value) {
            addCriterion("AddConfig not like", value, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigIn(List<String> values) {
            addCriterion("AddConfig in", values, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigNotIn(List<String> values) {
            addCriterion("AddConfig not in", values, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigBetween(String value1, String value2) {
            addCriterion("AddConfig between", value1, value2, "addconfig");
            return (Criteria) this;
        }

        public Criteria andAddconfigNotBetween(String value1, String value2) {
            addCriterion("AddConfig not between", value1, value2, "addconfig");
            return (Criteria) this;
        }

        public Criteria andTaxticketIsNull() {
            addCriterion("TaxTicket is null");
            return (Criteria) this;
        }

        public Criteria andTaxticketIsNotNull() {
            addCriterion("TaxTicket is not null");
            return (Criteria) this;
        }

        public Criteria andTaxticketEqualTo(String value) {
            addCriterion("TaxTicket =", value, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketNotEqualTo(String value) {
            addCriterion("TaxTicket <>", value, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketGreaterThan(String value) {
            addCriterion("TaxTicket >", value, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketGreaterThanOrEqualTo(String value) {
            addCriterion("TaxTicket >=", value, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketLessThan(String value) {
            addCriterion("TaxTicket <", value, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketLessThanOrEqualTo(String value) {
            addCriterion("TaxTicket <=", value, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketLike(String value) {
            addCriterion("TaxTicket like", value, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketNotLike(String value) {
            addCriterion("TaxTicket not like", value, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketIn(List<String> values) {
            addCriterion("TaxTicket in", values, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketNotIn(List<String> values) {
            addCriterion("TaxTicket not in", values, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketBetween(String value1, String value2) {
            addCriterion("TaxTicket between", value1, value2, "taxticket");
            return (Criteria) this;
        }

        public Criteria andTaxticketNotBetween(String value1, String value2) {
            addCriterion("TaxTicket not between", value1, value2, "taxticket");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostIsNull() {
            addCriterion("VehicleDeliveryCost is null");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostIsNotNull() {
            addCriterion("VehicleDeliveryCost is not null");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostEqualTo(BigDecimal value) {
            addCriterion("VehicleDeliveryCost =", value, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostNotEqualTo(BigDecimal value) {
            addCriterion("VehicleDeliveryCost <>", value, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostGreaterThan(BigDecimal value) {
            addCriterion("VehicleDeliveryCost >", value, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VehicleDeliveryCost >=", value, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostLessThan(BigDecimal value) {
            addCriterion("VehicleDeliveryCost <", value, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VehicleDeliveryCost <=", value, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostIn(List<BigDecimal> values) {
            addCriterion("VehicleDeliveryCost in", values, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostNotIn(List<BigDecimal> values) {
            addCriterion("VehicleDeliveryCost not in", values, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VehicleDeliveryCost between", value1, value2, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andVehicledeliverycostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VehicleDeliveryCost not between", value1, value2, "vehicledeliverycost");
            return (Criteria) this;
        }

        public Criteria andfreightIsNull() {
            addCriterion("Freight is null");
            return (Criteria) this;
        }

        public Criteria andfreightIsNotNull() {
            addCriterion(" Freight is not null");
            return (Criteria) this;
        }

        public Criteria andfreightEqualTo(BigDecimal value) {
            addCriterion("Freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andfreightNotEqualTo(BigDecimal value) {
            addCriterion("Freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andfreightGreaterThan(BigDecimal value) {
            addCriterion("Freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andfreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andfreightLessThan(BigDecimal value) {
            addCriterion("Freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andfreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andfreightIn(List<BigDecimal> values) {
            addCriterion("Freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andfreightNotIn(List<BigDecimal> values) {
            addCriterion("Freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andfreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion(" Freight between", value1, value2, " freight");
            return (Criteria) this;
        }

        public Criteria andfreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion(" Freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("Driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("Driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("Driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("Driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("Driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("Driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("Driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("Driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("Driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("Driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("Driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("Driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("Driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("Driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementIsNull() {
            addCriterion("FreightSettlement is null");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementIsNotNull() {
            addCriterion("FreightSettlement is not null");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementEqualTo(String value) {
            addCriterion("FreightSettlement =", value, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementNotEqualTo(String value) {
            addCriterion("FreightSettlement <>", value, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementGreaterThan(String value) {
            addCriterion("FreightSettlement >", value, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementGreaterThanOrEqualTo(String value) {
            addCriterion("FreightSettlement >=", value, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementLessThan(String value) {
            addCriterion("FreightSettlement <", value, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementLessThanOrEqualTo(String value) {
            addCriterion("FreightSettlement <=", value, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementLike(String value) {
            addCriterion("FreightSettlement like", value, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementNotLike(String value) {
            addCriterion("FreightSettlement not like", value, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementIn(List<String> values) {
            addCriterion("FreightSettlement in", values, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementNotIn(List<String> values) {
            addCriterion("FreightSettlement not in", values, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementBetween(String value1, String value2) {
            addCriterion("FreightSettlement between", value1, value2, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andFreightsettlementNotBetween(String value1, String value2) {
            addCriterion("FreightSettlement not between", value1, value2, "freightsettlement");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIsNull() {
            addCriterion("DepartureTime is null");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIsNotNull() {
            addCriterion("DepartureTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeEqualTo(Date value) {
            addCriterion("DepartureTime =", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotEqualTo(Date value) {
            addCriterion("DepartureTime <>", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeGreaterThan(Date value) {
            addCriterion("DepartureTime >", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DepartureTime >=", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeLessThan(Date value) {
            addCriterion("DepartureTime <", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeLessThanOrEqualTo(Date value) {
            addCriterion("DepartureTime <=", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIn(List<Date> values) {
            addCriterion("DepartureTime in", values, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotIn(List<Date> values) {
            addCriterion("DepartureTime not in", values, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeBetween(Date value1, Date value2) {
            addCriterion("DepartureTime between", value1, value2, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotBetween(Date value1, Date value2) {
            addCriterion("DepartureTime not between", value1, value2, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNull() {
            addCriterion("DeliveryTime is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNotNull() {
            addCriterion("DeliveryTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeEqualTo(Date value) {
            addCriterion("DeliveryTime =", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotEqualTo(Date value) {
            addCriterion("DeliveryTime <>", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThan(Date value) {
            addCriterion("DeliveryTime >", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DeliveryTime >=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThan(Date value) {
            addCriterion("DeliveryTime <", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThanOrEqualTo(Date value) {
            addCriterion("DeliveryTime <=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIn(List<Date> values) {
            addCriterion("DeliveryTime in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotIn(List<Date> values) {
            addCriterion("DeliveryTime not in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeBetween(Date value1, Date value2) {
            addCriterion("DeliveryTime between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotBetween(Date value1, Date value2) {
            addCriterion("DeliveryTime not between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("TotalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("TotalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(BigDecimal value) {
            addCriterion("TotalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(BigDecimal value) {
            addCriterion("TotalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(BigDecimal value) {
            addCriterion("TotalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(BigDecimal value) {
            addCriterion("TotalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<BigDecimal> values) {
            addCriterion("TotalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<BigDecimal> values) {
            addCriterion("TotalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalCost not between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNull() {
            addCriterion("SellingPrice is null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNotNull() {
            addCriterion("SellingPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceEqualTo(BigDecimal value) {
            addCriterion("SellingPrice =", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotEqualTo(BigDecimal value) {
            addCriterion("SellingPrice <>", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThan(BigDecimal value) {
            addCriterion("SellingPrice >", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SellingPrice >=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThan(BigDecimal value) {
            addCriterion("SellingPrice <", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SellingPrice <=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIn(List<BigDecimal> values) {
            addCriterion("SellingPrice in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotIn(List<BigDecimal> values) {
            addCriterion("SellingPrice not in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SellingPrice between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SellingPrice not between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceIsNull() {
            addCriterion("ContractPrice is null");
            return (Criteria) this;
        }

        public Criteria andContractpriceIsNotNull() {
            addCriterion("ContractPrice is not null");
            return (Criteria) this;
        }

        public Criteria andContractpriceEqualTo(BigDecimal value) {
            addCriterion("ContractPrice =", value, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceNotEqualTo(BigDecimal value) {
            addCriterion("ContractPrice <>", value, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceGreaterThan(BigDecimal value) {
            addCriterion("ContractPrice >", value, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ContractPrice >=", value, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceLessThan(BigDecimal value) {
            addCriterion("ContractPrice <", value, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ContractPrice <=", value, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceIn(List<BigDecimal> values) {
            addCriterion("ContractPrice in", values, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceNotIn(List<BigDecimal> values) {
            addCriterion("ContractPrice not in", values, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ContractPrice between", value1, value2, "contractprice");
            return (Criteria) this;
        }

        public Criteria andContractpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ContractPrice not between", value1, value2, "contractprice");
            return (Criteria) this;
        }

        public Criteria andRebateIsNull() {
            addCriterion("Rebate is null");
            return (Criteria) this;
        }

        public Criteria andRebateIsNotNull() {
            addCriterion("Rebate is not null");
            return (Criteria) this;
        }

        public Criteria andRebateEqualTo(BigDecimal value) {
            addCriterion("Rebate =", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotEqualTo(BigDecimal value) {
            addCriterion("Rebate <>", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThan(BigDecimal value) {
            addCriterion("Rebate >", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Rebate >=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThan(BigDecimal value) {
            addCriterion("Rebate <", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Rebate <=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateIn(List<BigDecimal> values) {
            addCriterion("Rebate in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotIn(List<BigDecimal> values) {
            addCriterion("Rebate not in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rebate between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rebate not between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusIsNull() {
            addCriterion("RepaymentStatus is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusIsNotNull() {
            addCriterion("RepaymentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusEqualTo(String value) {
            addCriterion("RepaymentStatus =", value, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusNotEqualTo(String value) {
            addCriterion("RepaymentStatus <>", value, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusGreaterThan(String value) {
            addCriterion("RepaymentStatus >", value, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusGreaterThanOrEqualTo(String value) {
            addCriterion("RepaymentStatus >=", value, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusLessThan(String value) {
            addCriterion("RepaymentStatus <", value, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusLessThanOrEqualTo(String value) {
            addCriterion("RepaymentStatus <=", value, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusLike(String value) {
            addCriterion("RepaymentStatus like", value, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusNotLike(String value) {
            addCriterion("RepaymentStatus not like", value, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusIn(List<String> values) {
            addCriterion("RepaymentStatus in", values, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusNotIn(List<String> values) {
            addCriterion("RepaymentStatus not in", values, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusBetween(String value1, String value2) {
            addCriterion("RepaymentStatus between", value1, value2, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentstatusNotBetween(String value1, String value2) {
            addCriterion("RepaymentStatus not between", value1, value2, "repaymentstatus");
            return (Criteria) this;
        }

        public Criteria andStillowingIsNull() {
            addCriterion("StillOwing is null");
            return (Criteria) this;
        }

        public Criteria andStillowingIsNotNull() {
            addCriterion("StillOwing is not null");
            return (Criteria) this;
        }

        public Criteria andStillowingEqualTo(String value) {
            addCriterion("StillOwing =", value, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingNotEqualTo(String value) {
            addCriterion("StillOwing <>", value, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingGreaterThan(String value) {
            addCriterion("StillOwing >", value, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingGreaterThanOrEqualTo(String value) {
            addCriterion("StillOwing >=", value, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingLessThan(String value) {
            addCriterion("StillOwing <", value, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingLessThanOrEqualTo(String value) {
            addCriterion("StillOwing <=", value, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingLike(String value) {
            addCriterion("StillOwing like", value, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingNotLike(String value) {
            addCriterion("StillOwing not like", value, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingIn(List<String> values) {
            addCriterion("StillOwing in", values, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingNotIn(List<String> values) {
            addCriterion("StillOwing not in", values, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingBetween(String value1, String value2) {
            addCriterion("StillOwing between", value1, value2, "stillowing");
            return (Criteria) this;
        }

        public Criteria andStillowingNotBetween(String value1, String value2) {
            addCriterion("StillOwing not between", value1, value2, "stillowing");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptIsNull() {
            addCriterion("VehicleTaxReceipt is null");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptIsNotNull() {
            addCriterion("VehicleTaxReceipt is not null");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptEqualTo(String value) {
            addCriterion("VehicleTaxReceipt =", value, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptNotEqualTo(String value) {
            addCriterion("VehicleTaxReceipt <>", value, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptGreaterThan(String value) {
            addCriterion("VehicleTaxReceipt >", value, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptGreaterThanOrEqualTo(String value) {
            addCriterion("VehicleTaxReceipt >=", value, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptLessThan(String value) {
            addCriterion("VehicleTaxReceipt <", value, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptLessThanOrEqualTo(String value) {
            addCriterion("VehicleTaxReceipt <=", value, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptLike(String value) {
            addCriterion("VehicleTaxReceipt like", value, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptNotLike(String value) {
            addCriterion("VehicleTaxReceipt not like", value, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptIn(List<String> values) {
            addCriterion("VehicleTaxReceipt in", values, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptNotIn(List<String> values) {
            addCriterion("VehicleTaxReceipt not in", values, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptBetween(String value1, String value2) {
            addCriterion("VehicleTaxReceipt between", value1, value2, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andVehicletaxreceiptNotBetween(String value1, String value2) {
            addCriterion("VehicleTaxReceipt not between", value1, value2, "vehicletaxreceipt");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_Flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("delete_Flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("delete_Flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("delete_Flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("delete_Flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("delete_Flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("delete_Flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("delete_Flag like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("delete_Flag not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("delete_Flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("delete_Flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("delete_Flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("delete_Flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Long value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Long value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Long value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Long value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Long value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Long> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Long> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Long value1, Long value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Long value1, Long value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}