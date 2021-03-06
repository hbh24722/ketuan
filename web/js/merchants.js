$(function(){

    $("#loading-example-btn").on("click",function (e){
        getAllMerchants();
    })

    $("#searchBtn").on("click",function (e){
        var key = $("#searchKey")[0].value;
        if(key==""||key==undefined){
            getAllMerchants();
            return
        }
        $.ajax({
            url:"http://localhost:8080/ketuan/backmanage/merchantsearch?key="+key,
            type:"GET",
            dataType: "json",
            success:function (data) {
                console.info(JSON.stringify(data));
                if(data["failed"]){
                    alert("搜索商家失败！"+data["failedMessage"]);
                }
                else{
                    var merchants = data["data"]["merchants"];
                        $("#merchantsList tbody").html("");
                    for(var i=0;i<merchants.length;i++){
                        appendTr(merchants[i]);
                    }
                }
            },
            error:function (e) {
                console.error(JSON.stringify(e));
                alert("搜索商家失败！"+JSON.stringify(e));
            }
        })
    })

    function getAllMerchants() {
        $.ajax({
            url:"http://localhost:8080/ketuan/backmanage/merchantlistall",
            type:"GET",
            dataType: "json",
            success:function (data) {
                console.info(JSON.stringify(data));
                if(data["failed"]){
                    alert("获取商家失败！"+data["failedMessage"]);
                }
                else{
                    var merchants = data["data"]["merchants"];
                    $("#merchantsList tbody").html("");
                    for(var i=0;i<merchants.length;i++){
                        appendTr(merchants[i]);
                    }
                }
            },
            error:function (e) {
                console.error(JSON.stringify(e));
                alert("获取商家失败！"+JSON.stringify(e));
            }
        })
    }

    function appendTr(merchant){
        var s = '<tr id="'+merchant["id"]+'">'
            +'          <td class="project-status">'
            + '             <span class="label label-primary">@'
            +'          </td>'
            +'          <td class="project-title">'
            +'              <a href="merchant_detail.html?merchantid='+merchant["id"]+'">'+merchant["name"]
            +'              </a>'
            +'          </td>'
            +'          <td class="project-completion">'
            +'              <small>联系电话：</small>'+merchant["phone"]
            +'          </td>'
            + '         <td class="project-people">'
            +'          </td>'
            +'          <td class="project-actions">'
            +'              <a href="projects.html#" class="btn btn-white btn-sm"><i class="fa fa-folder"></i> 查看 </a>'
            +'              <button class="btn btn-white btn-sm" id="delete_merchant"><i class="fa fa-pencil"></i>编辑信息</button>'
            +'          </td>'
            +'      </tr>'

        $("#merchantsList tbody").append(s);


        /*//进行删除操作
                       for (var i=0;i<$("#expressagesList tbody tr").length;i++) {
                    $("#expressagesList tbody tr").eq(i).children('td').last().children('button').on("click", function (e){
                        alert("确定要删除该商品吗？");
                        var merchantId =$(this).parent('.project-actions').parent('tr').attr("id");

                $.ajax(
                    {
                        url:"http://localhost:8080/ketuan/backmanage/expressageChange",
                        data:{
                            merchantId:merchantId
                        },
                        type:"GET",
                        dataType:"json",
                        success:function(data){
                            if(data="1"){
                                alert("添加成功")
                            }else {
                                alert("添加失败")
                            }
                        }
                    }
                )
            })
        }*/





    }
    getAllMerchants();

})
