requirejs.config(cwRequireConfig);
require([
	'jquery',							// jquery依赖
	'analysis/zhuge.util',
	'demo/demoList'
	], function($, Zutil) {
	Zutil.pcListReferrer();
});