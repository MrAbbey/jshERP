package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.Orders;
import com.jsh.erp.datasource.entities.Supplier;
import com.jsh.erp.datasource.vo.OrdersVo4List;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface OrderMapperEx {

    List<OrdersVo4List> selectByConditionOrder(
            @Param("searchBeginTime") Date searchBeginTime,
            @Param("searchEndTime") Date searchEndTime,
            @Param("offset") Integer offset,
            @Param("rows") Integer rows);

    Long countsByOrder(
            @Param("searchBeginTime") Date searchBeginTime,
            @Param("searchEndTime") Date searchEndTime);

    List<Orders> findByAll(
            @Param("searchBeginTime") Date searchBeginTime,
            @Param("searchEndTime") Date searchEndTime);

    int batchDeleteOrderByIds(@Param("updateTime") Date updateTime, @Param("updater") Long updater, @Param("ids") String ids[]);
}