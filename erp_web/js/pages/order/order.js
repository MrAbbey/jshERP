    //初始化界面
    $(function() {
        initTableData();
        ininPager();
        bindEvent();
    });

    //初始化表格数据
    function initTableData() {
        //改变宽度和高度
        $("#searchPanel").panel({width:webW-2});
        $("#tablePanel").panel({width:webW-2});
        $('#tableData').datagrid({
            //title:'单位列表',
            //iconCls:'icon-save',
            //width:700,
            height:heightInfo,
            nowrap: false,
            rownumbers: false,
            //动画效果
            animate:false,
            //选中单行
            singleSelect : true,
            collapsible:false,
            selectOnCheck:false,
            //fitColumns:true,
            //单击行是否选中
            checkOnSelect : false,
            //交替出现背景
            striped : true,
            pagination: true,
            //自动截取数据
            //nowrap : true,
            //loadFilter: pagerFilter,
            pageSize: initPageSize,
            pageList: initPageNum,
            columns:[[
                { field: 'id',width:35,align:"center",checkbox:true},
                { title: '操作',field: 'op',align:"center",width:60,formatter:function(value,rec)
                    {
                        var str = '';
                        var rowInfo = rec.id + 'AaBb' + rec.ordertimeStr +'AaBb' + rec.bookingunit + 'AaBb'+ rec.vehicletype + 'AaBb'+ rec.model + 'AaBb'+ rec.chassissupplier + 'AaBb'+ rec.chassisnumber + 'AaBb' + rec.chassisconfig + 'AaBb' + rec.chassisamount+ 'AaBb' + rec.chassispayment + 'AaBb' + rec.chassistaxticket + 'AaBb' + rec.modifiedvehicle + 'AaBb' + rec.modificationfee + 'AaBb' + rec.modificationdesc + 'AaBb' + rec.addconfig + 'AaBb' + rec.taxticket + 'AaBb' + rec.vehicledeliverycost + 'AaBb' + rec.freight + 'AaBb' + rec.driver + 'AaBb' + rec.freightsettlement + 'AaBb' + rec.departuretimeStr + 'AaBb' + rec.deliverytimeStr + 'AaBb' + rec.totalcost + 'AaBb' + rec.sellingprice + 'AaBb' + rec.contractprice + 'AaBb' + rec.rebate + 'AaBb' + rec.repaymentstatus + 'AaBb' + rec.stillowing + 'AaBb' + rec.vehicletaxreceipt;
                        str += '<img title="编辑" src="/js/easyui/themes/icons/pencil.png" style="cursor: pointer;" onclick="editSupplier(\'' + rowInfo + '\');"/>&nbsp;&nbsp;&nbsp;';
                        str += '<img title="删除" src="/js/easyui/themes/icons/edit_remove.png" style="cursor: pointer;" onclick="deleteSupplier(\'' + rowInfo + '\');"/>';
                        return str;
                    }
                },
                { title: '订单时间',field: 'ordertimeStr',width:150},
                { title: '订车单位', field: 'bookingunit',width:100,align:"center"},
                { title: '车型', field: 'vehicletype',width:100,align:"center"},
                { title: '型号',field: 'model',width:80,align:"center"},
                { title: '底盘供应商', field: 'chassissupplier',width:100,align:"center"},
                { title: '底盘号', field: 'chassisnumber',width:100,align:"center"},
                { title: '底盘配置',field: 'chassisconfig',width:100,align:"center"},
                { title: '底盘金额',field: 'chassisamount',width:100,align:"center"},
                { title: '底盘付款情况',field: 'chassispayment',width:100,align:"center"},
                { title: '底盘税票',field: 'chassistaxticket',width:100,align:"center"},
                { title: '改装厂',field: 'modifiedvehicle',width:100,align:"center"},
                { title: '改装费', field: 'modificationfee',width:100,align:"center"},
                { title: '改装备注', field: 'modificationdesc',width:100,align:"center"},
                { title: '额外配置', field: 'addconfig',width:100,align:"center"},
                { title: '税票', field: 'taxticket',width:100,align:"center"},
                { title: '整车出厂成本', field: 'vehicledeliverycost',width:100,align:"center"},
                { title: '运费', field: 'freight',width:100,align:"center"},
                { title: '司机', field: 'driver',width:100,align:"center"},
                { title: '运费结算情况', field: 'freightsettlement',width:100,align:"center"},
                { title: '发车时间', field: 'departuretimeStr',width:150,align:"center"},
                { title: '交车时间', field: 'deliverytimeStr',width:150,align:"center"},
                { title: '总成本', field: 'totalcost',width:100,align:"center"},
                { title: '销售价格', field: 'sellingprice',width:100,align:"center"},
                { title: '合同价格', field: 'contractprice',width:100,align:"center"},
                { title: '返利', field: 'rebate',width:100,align:"center"},
                { title: '回款情况', field: 'repaymentstatus',width:100,align:"center"},
                { title: '有无下欠', field: 'stillowing',width:100,align:"center"},
                { title: '整车税票', field: 'vehicletaxreceipt',width:100,align:"center"}
            ]],
            toolbar:[
                {
                    id:'addOrder',
                    text:'增加',
                    iconCls:'icon-add',
                    handler:function() {
                        addOrder();
                    }
                },'-',
                {
                    id:'batDeleteOrder',
                    text:'删除',
                    iconCls:'icon-remove',
                    handler:function() {
                        batDeleteOrder();
                    }
                }
            ],
            onLoadError:function() {
                $.messager.alert('页面加载提示','页面加载异常，请稍后再试！','error');
                return;
            }
        });
        dgResize();
        showSupplierDetails(1,initPageSize);
    }


    //分页信息处理
    function ininPager() {
        try {
            var opts = $("#tableData").datagrid('options');
            var pager = $("#tableData").datagrid('getPager');
            pager.pagination({
                onSelectPage:function(pageNum, pageSize)
                {
                    opts.pageNumber = pageNum;
                    opts.pageSize = pageSize;
                    pager.pagination('refresh', {
                        pageNumber:pageNum,
                        pageSize:pageSize
                    });
                    showSupplierDetails(pageNum,pageSize);
                }
            });
        }
        catch (e) {
            $.messager.alert('异常处理提示',"分页信息异常 :  " + e.name + ": " + e.message,'error');
        }
    }

    //删除信息
    function deleteSupplier(supplierInfo) {
        $.messager.confirm('删除确认','确定要删除此条信息吗？',function(r) {
            if (r) {
                var supplierTotalInfo = supplierInfo.split("AaBb");
                $.ajax({
                    type:"post",
                    url: "/order/batchDeleteOrderByIds",
                    dataType: "json",
                    data: ({
                        ids : supplierTotalInfo[0]
                    }),
                    success: function (res) {
                        if(res && res.code == 200) {
                            $("#searchBtn").click();
                        } else {
                            if(res && res.code == 601){
                                var jsondata={};
                                jsondata.ids=supplierTotalInfo[0];
                                jsondata.deleteType='2';
                                var type='single';
                                batDeleteSupplierForceConfirm(res,"/supplier/batchDeleteOrderByIds",jsondata,type);
                            }else if(res && res.code == 600){
                                $.messager.alert('删除提示', res.msg, 'error');
                            }else{
                                $.messager.alert('删除提示', '删除信息失败，请稍后再试！', 'error');
                            }
                        }
                    },
                    //此处添加错误处理
                    error:function() {
                        $.messager.alert('删除提示','删除信息异常，请稍后再试！','error');
                        return;
                    }
                });
            }
        });
    }

    //批量删除单位
    function batDeleteOrder() {
        var row = $('#tableData').datagrid('getChecked');
        if(row.length == 0) {
            $.messager.alert('删除提示','没有记录被选中！','info');
            return;
        }
        if(row.length > 0) {
            $.messager.confirm('删除确认','确定要删除选中的' + row.length + '条信息吗？',function(r) {
                if (r) {
                    var ids = "";
                    for(var i = 0;i < row.length; i ++) {
                        if(i == row.length-1)
                        {
                            ids += row[i].id;
                            break;
                        }
                        ids += row[i].id + ",";
                    }
                    $.ajax({
                        type:"post",
                        url: "/order/batchDeleteOrderByIds",
                        dataType: "json",
                        async :  false,
                        data: ({
                            ids : ids
                        }),
                        success: function (res) {
                            if(res && res.code === 200) {
                                $("#searchBtn").click();
                                $(":checkbox").attr("checked", false);
                            } else {
                                if(res && res.code == 601){
                                    var jsondata={};
                                    jsondata.ids=ids;
                                    jsondata.deleteType='2';
                                    var type='batch';
                                    batDeleteSupplierForceConfirm(res,"/order/batchDeleteOrderByIds",jsondata,type);
                                }else if(res && res.code == 600){
                                    $.messager.alert('删除提示', res.msg, 'error');
                                }else{
                                    $.messager.alert('删除提示', '删除信息失败，请稍后再试！', 'error');
                                }
                            }
                        },
                        //此处添加错误处理
                        error:function() {
                            $.messager.alert('删除提示','删除信息异常，请稍后再试！','error');
                            return;
                        }
                    });
                }
            });
        }
    }
    /**
     * 确认强制删除
     * */
    function batDeleteSupplierForceConfirm(res,url,jsondata) {
        $.messager.confirm('删除确认', res.msg, function (r) {
            if (r) {
                $.ajax({
                    type: "post",
                    url: url,
                    dataType: "json",
                    data: (jsondata),
                    success: function (res) {
                        if(res && res.code == 200) {
                            $("#searchBtn").click();
                            if(type=='batch'){
                                $(":checkbox").attr("checked", false);
                            }
                        }else if(res && res.code == 600){
                            $.messager.alert('删除提示', res.msg, 'error');
                        }else {
                            $.messager.alert('删除提示', '删除信息失败，请稍后再试！', 'error');
                        }
                    },
                    //此处添加错误处理
                    error: function () {
                        $.messager.alert('删除提示', '删除信息失败，请稍后再试！', 'error');
                        return;
                    }
                });
            }
        });
    }

    //增加单位
    var url;
    var supplierID = 0;
    //保存编辑前的名称
    var oldSupplier = "";

    function addOrder() {
        if(checkPower()){
            return;
        }
        $('#orderDlg').dialog('open').dialog('setTitle','<img src="/js/easyui/themes/icons/edit_add.png"/>&nbsp;增加订单信息');
        $(".window-mask").css({ width: webW ,height: webH});
        $("#ordertime").focus();
        $('#orderFM').form('clear');
        oldSupplier = "";
        supplierID = 0;
        url = '/order/add';
    }

    function bindEvent(){
        //导入excel对话框
        $('#importExcelDlg').dialog({
            width: 400,
            closed: true,
            cache: false,
            modal: true,
            collapsible:false,
            closable: true,
            buttons:'#dlg-buttons5'
        });
        //保存信息
        $("#saveSupplier").off("click").on("click", function () {
            var obj = $("#orderFM").serializeObject();
            $.ajax({
                url: url,
                type:"post",
                dataType: "json",
                data:{
                    info: JSON.stringify(obj)
                },
                success: function(res) {
                    if(res && res.code === 200) {
                        $('#orderDlg').dialog('close');
                        //加载完以后重新初始化
                        var opts = $("#tableData").datagrid('options');
                        showSupplierDetails(opts.pageNumber, opts.pageSize);
                    }
                }
            });
        });

        //初始化键盘enter事件
        $(document).keydown(function(event) {
            //兼容 IE和firefox 事件
            var e = window.event || event;
            var k = e.keyCode||e.which||e.charCode;
            //兼容 IE,firefox 兼容
            var obj = e.srcElement ? e.srcElement : e.target;
            //绑定键盘事件为 id是指定的输入框才可以触发键盘事件 13键盘事件
            if(k == "13"&&(obj.id=="supplier" || obj.id=="contacts"|| obj.id=="phonenum"
                || obj.id=="email" || obj.id=="description" ))
            {
                $("#saveSupplier").click();
            }

            //搜索按钮添加快捷键
            if(k == "13"&&(obj.id=="searchSupplier" || obj.id=="searchContacts"|| obj.id=="searchPhonenum"
                || obj.id=="searchEmail" || obj.id=="searchDesc" ))
            {
                $("#searchBtn").click();
            }
        });

        //搜索处理
        $("#searchBtn").unbind().bind({
            click:function() {
                showSupplierDetails(1,initPageSize);
                var opts = $("#tableData").datagrid('options');
                var pager = $("#tableData").datagrid('getPager');
                opts.pageNumber = 1;
                opts.pageSize = initPageSize;
                pager.pagination('refresh', {
                    pageNumber:1,
                    pageSize:initPageSize
                });
            }
        });

        $("#searchBtn").click();

        //重置按钮
        $("#searchResetBtn").unbind().bind({
            click:function(){
                $("#searchSupplier").textbox("clear");
                $("#searchPhonenum").textbox("clear");
                $("#searchTelephone").textbox("clear");
                $("#searchDesc").textbox("clear");
                //加载完以后重新初始化
                $("#searchBtn").click();
            }
        });

    }


    //编辑信息
    function editSupplier(supplierTotalInfo) {
        console.info(supplierTotalInfo);
        var supplierInfo = supplierTotalInfo.split("AaBb");
        console.info(supplierInfo);
        var row = {
            ordertime : supplierInfo[1].replace("undefined",""),
            bookingunit : supplierInfo[2].replace("undefined",""),
            vehicletype : supplierInfo[3].replace("undefined",""),
            model : supplierInfo[4].replace("undefined",""),
            chassissupplier : supplierInfo[5].replace("undefined",""),
            chassisnumber : supplierInfo[6].replace("undefined",""),
            chassisconfig : supplierInfo[7].replace("undefined",""),
            chassisamount : supplierInfo[8].replace("undefined",""),
            chassispayment : supplierInfo[9].replace("undefined",""),
            chassistaxticket : supplierInfo[10].replace("undefined",""),
            modifiedvehicle : supplierInfo[11].replace("undefined",""),
            modificationfee : supplierInfo[12].replace("undefined",""),
            modificationdesc : supplierInfo[13].replace("undefined",""),
            addconfig : supplierInfo[14].replace("undefined",""),
            taxticket : supplierInfo[15].replace("undefined",""),
            vehicledeliverycost : supplierInfo[16].replace("undefined",""),
            freight : supplierInfo[17].replace("undefined",""),
            driver : supplierInfo[18].replace("undefined",""),
            freightsettlement : supplierInfo[19].replace("undefined",""),
            departuretime : supplierInfo[20].replace("undefined",""),
            deliverytime : supplierInfo[21].replace("undefined",""),
            totalcost : supplierInfo[22].replace("undefined",""),
            sellingprice : supplierInfo[23].replace("undefined",""),
            contractprice : supplierInfo[24].replace("undefined",""),
            rebate : supplierInfo[25].replace("undefined",""),
            repaymentstatus : supplierInfo[26].replace("undefined",""),
            stillowing : supplierInfo[27].replace("undefined",""),
            vehicletaxreceipt : supplierInfo[28].replace("undefined","")
        };
        oldSupplier = supplierInfo[1];
        $('#orderDlg').dialog('open').dialog('setTitle','<img src="/js/easyui/themes/icons/pencil.png"/>&nbsp;编辑订单信息');
        $(".window-mask").css({ width: webW ,height: webH});
        $('#orderFM').form('load',row);
        supplierID = supplierInfo[0];
        //焦点在名称输入框==定焦在输入文字后面
        $("#ordertime").val("").focus().val(supplierInfo[1]);
        url = '/order/update?id=' + supplierInfo[0];
    }

    function showSupplierDetails(pageNo,pageSize) {
        var searchBeginTime = $.trim($("#searchBeginTime").val());
        var searchEndTime = $.trim($("#searchEndTime").val());
        $.ajax({
            type:"get",
            url: "/order/list",
            dataType: "json",
            data: ({
                search: JSON.stringify({
                    searchBeginTime: searchBeginTime,
                    searchEndTime: searchEndTime
                }),
                currentPage: pageNo,
                pageSize: pageSize
            }),
            success: function (res) {
                if(res && res.code === 200){
                    if(res.data && res.data.page) {
                        $("#tableData").datagrid('loadData', res.data.page);
                    }
                }
            },
            //此处添加错误处理
            error:function() {
                $.messager.alert('查询提示','查询数据后台异常，请稍后再试！','error');
                return;
            }
        });
    }

