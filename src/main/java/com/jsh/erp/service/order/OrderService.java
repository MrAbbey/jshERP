package com.jsh.erp.service.order;

import com.alibaba.fastjson.JSONObject;
import com.jsh.erp.constants.BusinessConstants;
import com.jsh.erp.datasource.entities.Orders;
import com.jsh.erp.datasource.entities.OrdersExample;
import com.jsh.erp.datasource.entities.User;
import com.jsh.erp.datasource.mappers.OrderMapperEx;
import com.jsh.erp.datasource.mappers.OrdersMapper;
import com.jsh.erp.datasource.vo.OrdersVo4List;
import com.jsh.erp.exception.JshException;
import com.jsh.erp.service.log.LogService;
import com.jsh.erp.service.supplier.SupplierService;
import com.jsh.erp.service.user.UserService;
import com.jsh.erp.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;


/**
 * 项目描述:SSS
 * 类  描  述:
 * 创  建  人:Abbey
 * 创建时间:2020/4/19
 */
@Service
public class OrderService {
    private Logger logger = LoggerFactory.getLogger(SupplierService.class);

    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private OrderMapperEx orderMapperEx;

    @Resource
    private LogService logService;

    @Resource
    private UserService userService;

    public Orders getOrder(long id)throws Exception {
        Orders result=null;
        try{
            result=ordersMapper.selectByPrimaryKey(id);
        }catch(Exception e){
            JshException.readFail(logger, e);
        }
        return result;
    }

    public List<Orders> getSupplier()throws Exception {
        OrdersExample example = new OrdersExample();
        example.createCriteria().andDeleteFlagNotEqualTo(BusinessConstants.DELETE_FLAG_DELETED);
        List<Orders> list=null;
        try{
            list=ordersMapper.selectByExample(example);
        }catch(Exception e){
            JshException.readFail(logger, e);
        }
        return list;
    }

    public List<OrdersVo4List> select(Date searchBeginTime, Date searchEndTime, int offset, int rows) throws Exception{
        List<OrdersVo4List> resList = null;
        try{
            resList = orderMapperEx.selectByConditionOrder(searchBeginTime,searchEndTime, offset, rows);
        }catch(Exception e){
            JshException.readFail(logger, e);
        }
        return resList;
    }

    public Long countSupplier(Date searchBeginTime,Date searchEndTime) throws Exception{
        Long result=null;
        try{
            result=orderMapperEx.countsByOrder(searchBeginTime,searchEndTime);
        }catch(Exception e){
            JshException.readFail(logger, e);
        }
        return result;
    }

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public int insertSupplier(String beanJson, HttpServletRequest request)throws Exception {
        Orders order = JSONObject.parseObject(beanJson, Orders.class);
        int result=0;
        try{
            result=ordersMapper.insertSelective(order);
            logService.insertLog("商家", BusinessConstants.LOG_OPERATION_TYPE_ADD, request);
        }catch(Exception e){
            JshException.writeFail(logger, e);
        }
        return result;
    }

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public int updateOrder(String beanJson, Long id, HttpServletRequest request)throws Exception {
        Orders orders = JSONObject.parseObject(beanJson, Orders.class);
        orders.setId(id);
        int result=0;
        try{
            result=ordersMapper.updateByPrimaryKeySelective(orders);
            logService.insertLog("商家",
                    new StringBuffer(BusinessConstants.LOG_OPERATION_TYPE_EDIT).append(id).toString(), request);
        }catch(Exception e){
            JshException.writeFail(logger, e);
        }
        return result;
    }

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public int deleteOrder(Long id, HttpServletRequest request)throws Exception {
        int result=0;
        try{
            result=ordersMapper.deleteByPrimaryKey(id);
            logService.insertLog("商家",
                    new StringBuffer(BusinessConstants.LOG_OPERATION_TYPE_DELETE).append(id).toString(), request);
        }catch(Exception e){
            JshException.writeFail(logger, e);
        }
        return ordersMapper.deleteByPrimaryKey(id);
    }

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public int batchDeleteOrder(String ids, HttpServletRequest request) throws Exception{
        List<Long> idList = StringUtil.strToLongList(ids);
        OrdersExample example = new OrdersExample();
        example.createCriteria().andIdIn(idList);
        int result=0;
        try{
            result=ordersMapper.deleteByExample(example);
            logService.insertLog("商家", "批量删除,id集:" + ids, request);
        }catch(Exception e){
            JshException.writeFail(logger, e);
        }
        return result;
    }

    @Transactional(value = "transactionManager", rollbackFor = Exception.class)
    public int batchDeleteOrderByIds(String ids)throws Exception {
        logService.insertLog("商家",
                new StringBuffer(BusinessConstants.LOG_OPERATION_TYPE_DELETE).append(ids).toString(),
                ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest());
        User userInfo=userService.getCurrentUser();
        String [] idArray=ids.split(",");
        int result=0;
        try{
            result = orderMapperEx.batchDeleteOrderByIds(new Date(),userInfo==null?null:userInfo.getId(),idArray);
        }catch(Exception e){
            JshException.writeFail(logger, e);
        }
        return result;
    }

    public int checkIsNameExist(Long id, String name)throws Exception {
        return 0;
    }
}
