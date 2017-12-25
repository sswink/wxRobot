function  deletebath(actions) {
    if(confirm("确认删除吗？")) {
        mainForm.action = "http://www.zziheng.xin/weChatRobot/deleteServlets?action=" + actions;
        mainForm.submit();
    }
}
function deletes(id,actions) {
    if(confirm("确认删除吗？")){
        mainForm.action = "http://www.zziheng.xin/weChatRobot/deleteServlets?id="+id+"&action="+actions;
        mainForm.submit();
    }
}
function openWin(){
    //获得窗口的垂直位置
    var iWidth=400;                          //弹出窗口的宽度;
    var iHeight=350;
    var iTop = (window.screen.availHeight - 30 - iHeight) / 2;
    //获得窗口的水平位置
    var iLeft = (window.screen.availWidth - 10 - iWidth) / 2;
    // window.open("http://localhost:8080/insert.jsp",window,'width='+400+'height'+400);
    window.open("http://www.zziheng.xin/weChatRobot/insert.jsp", window, 'height=' + iHeight + ','+ ',width=' + iWidth + ',' + ',top=' + iTop + ',left=' + iLeft);
}
function btn() {
    var btns=document.getElementById("contends");
    var inputs=document.createElement("input");
    inputs.setAttribute("type","text");
    inputs.setAttribute("name","contenti");
    btns.appendChild(inputs);
}
function btnDown() {
    var btns=document.getElementById("contends");
    var inputs=document.createElement("input");
    inputs.setAttribute("type","text");
    inputs.setAttribute("name","contenti");
    if(btns.childElementCount>0){
        btns.removeChild(btns.childNodes[btns.childElementCount-1]);
    }
}
function sumsf() {
    console.log("dsa");
    var command=document.getElementById("command").value;
    var description=document.getElementById("description").value;
    var els =document.getElementsByName("contenti");
    var str='';
    if(description==null||command==null){
        alert("请输入内容");
        return false;
    }
    for (var i = 0; i < els.length; i++){
        if(els[i].value!="") {
            str += els[i].value + ",";
        }
        if(str==''){
            alert("请输入内容");
            return false;
        }
    }
    console.log(command);
    console.log(description);
    console.log(str);
    insertForms.action="http://www.zziheng.xin/weChatRobot/insertServlets?command="+command+"&description="+description+"&contends="+str;
    insertForms.submit();
}
function openWin3(ids){
    //获得窗口的垂直位置
    var iWidth=400;                          //弹出窗口的宽度;
    var iHeight=350;
    var iTop = (window.screen.availHeight - 30 - iHeight) / 2;
    //获得窗口的水平位置
    var iLeft = (window.screen.availWidth - 10 - iWidth) / 2;
    // window.open("http://localhost:8080/insert.jsp",window,'width='+400+'height'+400);
    window.open('http://www.zziheng.xin/weChatRobot/updatewinServlets?ids='+ids, window, 'height=' + iHeight + ','+ ',width=' + iWidth + ',' + ',top=' + iTop + ',left=' + iLeft);
}
function updatecontent(ids) {
    var els=document.getElementsByName("contenti");
    var str='';
    for (var i = 0; i < els.length; i++){
        if(els[i].value!=""){
            str+=els[i].value+",";
        }
        if(str==''){
            alert("请输入内容");
            return false;
        }
    }
    console.log(ids);
    console.log(str);
    updateForms.action="http://www.zziheng.xin/weChatRobot/updateServlets?action=insert&ids="+ids+'&contend='+str;
    updateForms.submit();

}
