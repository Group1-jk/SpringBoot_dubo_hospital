// 播放页面
define(['jquery', 'common/controller'],
		function($, Controller) {
	var zhugeutil = null;
	if(zhuge){
		zhugeutil = Controller.create({
			elements : {
				
			},
			events : {
				
			},
			getReferrer : function(){
				return document.referrer;
			},
			indexPic : function(){
				$('.tempWrap .bd a').on('click', function(){
					  zhuge.track('pc-点击-免费试听-轮播图', {
							'轮播图名称' : $(this).attr('title')
					  });
				})
			},
			pcListReferrer : function(){
				zhuge.track('pc-进入-免费试听列表', {
					'来源' : this.getReferrer()
				});
			},
			pcReferrer : function(){
				zhuge.track('pc-进入-免费试听页面', {
					'来源' : this.getReferrer()
				});
			},
			pcPlay : function(){
				zhuge.track('pc-视频播放', {
					'视频名称' : pageData.cwareName,
					'来源' : this.getReferrer()
				});
			},
			pcList : function(_edu, _subject, _cware, _teacher){
				zhuge.track('pc-点击-免费试听-辅导课程', {
					'所属辅导' : _edu,
					'科目' : _subject,
					'课程' : _cware,
					'辅导老师' : _teacher
				});
			},
			classList : function(_className){
				zhuge.track('pc-点击-免费试听列表-班次分类', {
					'班次名称' : _className
				});
			}
		});
		zhugeutil = new zhugeutil({el: $("body")});
	}
	return window.zhugeutil = zhugeutil;
})