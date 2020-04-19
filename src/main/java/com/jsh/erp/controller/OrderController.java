package com.jsh.erp.controller;

import com.alibaba.fastjson.JSONObject;
import com.jsh.erp.constants.BusinessConstants;
import com.jsh.erp.constants.ExceptionConstants;
import com.jsh.erp.exception.BusinessRunTimeException;
import com.jsh.erp.service.order.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 项目描述:SSS
 * 类  描  述:
 * 创  建  人:Abbey
 * 创建时间:2020/4/19
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Resource
    private OrderService orderService;

    /**
     * create by: qiankunpingtai
     * website：https://qiankunpingtai.cn
     * description:
     *  批量删除供应商信息
     * create time: 2019/3/29 11:15
     * @Param: ids
     * @return java.lang.Object
     */
    @RequestMapping(value = "/batchDeleteOrderByIds")
    public Object batchDeleteSupplierByIds(@RequestParam("ids") String ids, @RequestParam(value="deleteType",
            required =false,defaultValue= BusinessConstants.DELETE_TYPE_NORMAL)String deleteType) throws Exception {
        JSONObject result = ExceptionConstants.standardSuccess();
        int i=0;
        i= orderService.batchDeleteOrderByIds(ids);
        if(i<1){
            logger.error("异常码[{}],异常提示[{}],参数,ids[{}]",
                    ExceptionConstants.SUPPLIER_DELETE_FAILED_CODE,ExceptionConstants.SUPPLIER_DELETE_FAILED_MSG,ids);
            throw new BusinessRunTimeException(ExceptionConstants.SUPPLIER_DELETE_FAILED_CODE,
                    ExceptionConstants.SUPPLIER_DELETE_FAILED_MSG);
        }
        return result;
    }
}
