$(function(){
	//二维码按钮监听事件
	$("#generateCode").on("click",function(){
		var codeNo = $("#qrCode").val();
		if(codeNo){
			var url = path + '/utils/qrcode/' + codeNo;
			$("img#qrCodeImage").attr("src",url);
		}
	});
});