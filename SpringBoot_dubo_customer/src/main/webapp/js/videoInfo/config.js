var cwRequireConfig = {
		baseUrl: pageData.basePath + pageData.statPath + '/js/app',
		waitSeconds: 0,
		paths: {
			lib : '../lib',
			main : '../main',
			jquery : '../lib/jquery-1.9.1.min'
		},
		urlArgs: "bust=" + pageData.jsVersion,
		shim: {
			'lib/jquery.slimscroll' : {
				deps : ['jquery']
			},
			'lib/jQuery-selectPlus.tipxw.min' : {
				deps : ['jquery']
			},
			'lib/jquery.cookie' : {
				deps : ['jquery']
			},
			'pub/pages' : {
				deps : ['jquery', 'lib/jQuery-selectPlus.tipxw.min', 'video/videoPlay/global']
			},
			'video/videoPlay/global' : {
				deps : ['jquery', 'lib/jquery.slimscroll']
			},
			'video/videoPlay/audio' : {
				deps : ['jquery', 'video/videoPlay/global']
			},
			'video/videoPlay/three/split' : {
				deps : ['jquery', 'video/videoPlay/global']
			},
			'downloadCenter/downloadCenter' : {
				deps : ['jquery', 'video/videoPlay/global', 'lib/jQuery-selectPlus.tipxw.min']
			},
			'playCheck/swfobject' : {
				deps : ['jquery'],
				exports: 'swfobject'
			}
		}
	};