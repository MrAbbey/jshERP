package com.jsh.erp.service.order;

import com.jsh.erp.datasource.vo.OrdersVo4List;
import com.jsh.erp.service.ICommonQuery;
import com.jsh.erp.utils.Constants;
import com.jsh.erp.utils.QueryUtils;
import com.jsh.erp.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import static com.jsh.erp.utils.Tools.getCenternTime;


/**
 * 项目描述:SSS
 * 类  描  述:
 * 创  建  人:Abbey
 * 创建时间:2020/4/19
 */
@Service(value = "order_component")
@OrderResource
public class OrderComponent implements ICommonQuery{

    @Resource
    private OrderService orderService;

    @Override
    public Object selectOne(Long id) throws Exception {
        return orderService.getOrder(id);
    }

    @Override
    public List<?> select(Map<String, String> parameterMap) throws Exception {
        return getOrderList(parameterMap);
    }

    private List<?> getOrderList(Map<String, String> map)throws Exception {
        String search = map.get(Constants.SEARCH);
        String searchBeginTime = StringUtil.getInfo(search, "searchBeginTime");
        String searchEndTime = StringUtil.getInfo(search, "searchEndTime");
        Date searchBeginDate = null;
        Date searchEndDate = null;
        if(StringUtil.isNotEmpty(searchBeginTime)){
            searchBeginDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(searchBeginTime + " 00:00:00");
        }
        if(StringUtil.isNotEmpty(searchEndTime)){
            searchEndDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(searchBeginTime+ " 23:59:59");
        }
        List<OrdersVo4List> ordersVo4Lists = orderService.select(searchBeginDate, searchEndDate, QueryUtils.offset(map), QueryUtils.rows(map));
        for(OrdersVo4List ordersVo4List : ordersVo4Lists){
            ordersVo4List.setOrdertimeStr(ordersVo4List.getOrdertime() ==null ? "" : getCenternTime(ordersVo4List.getOrdertime()));
            ordersVo4List.setDeliverytimeStr(ordersVo4List.getDeliverytime() == null ? "" : getCenternTime(ordersVo4List.getDeliverytime()));
            ordersVo4List.setDeparturetimeStr(ordersVo4List.getDeparturetime() == null ? "" : getCenternTime(ordersVo4List.getDeparturetime()));
        }
        return ordersVo4Lists;
    }

    @Override
    public Long counts(Map<String, String> parameterMap) throws Exception {
        String search = parameterMap.get(Constants.SEARCH);
        String searchBeginTime = StringUtil.getInfo(search, "searchBeginTime");
        String searchEndTime = StringUtil.getInfo(search, "searchEndTime");
        Date searchBeginDate = null;
        Date searchEndDate = null;
        if(StringUtil.isNotEmpty(searchBeginTime)){
            searchBeginDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(searchBeginTime + " 00:00:00");
        }
        if(StringUtil.isNotEmpty(searchEndTime)){
            searchEndDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(searchEndTime+ " 23:59:59");
        }
        return orderService.countSupplier(searchBeginDate, searchEndDate);
    }

    @Override
    public int insert(String beanJson, HttpServletRequest request) throws Exception {
        return orderService.insertSupplier(beanJson,request);
    }

    @Override
    public int update(String beanJson, Long id, HttpServletRequest request) throws Exception {
        return orderService.updateOrder(beanJson, id, request);
    }

    @Override
    public int delete(Long id, HttpServletRequest request) throws Exception {
        return orderService.deleteOrder(id, request);
    }

    @Override
    public int batchDelete(String ids, HttpServletRequest request) throws Exception {
        return orderService.batchDeleteOrder(ids, request);
    }

    @Override
    public int checkIsNameExist(Long id, String name) throws Exception {
        return orderService.checkIsNameExist(id, name);
    }
}
