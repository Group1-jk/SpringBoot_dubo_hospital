// 播放页面
define(['jquery', 'common/controller', 'analysis/zhuge.util'],
		function($, Controller, Zutil) {
	$(function(){
		var DemoList = Controller.create({
			zhuge : function(eduName, subjectName, cwareName, teacherName){
				Zutil.pcList(eduName, subjectName, cwareName, teacherName);
			}
		});
		DemoList = new DemoList({el: $("body")});
		return window.demoList = DemoList;
	})
})