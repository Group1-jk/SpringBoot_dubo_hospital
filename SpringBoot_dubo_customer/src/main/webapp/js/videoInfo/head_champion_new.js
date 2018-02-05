try
  {	if(typeof _paq == 'undefined')
	{
		var strDomain= document.domain;
		var _paq = _paq || []; 
		_paq.push(['trackPageView']); 
		_paq.push(['setDocumentTitle', document.title]); 
		_paq.push(['enableLinkTracking']); 
		(function() { 
		var u="//"+strDomain+"/js/analysis/"; 
		_paq.push(['setTrackerUrl', 'http://'+strDomain+'/images/analytics/'+'analytics.ico']); 
		_paq.push(['setSiteId', 'www.med66.com']); 
		var d=document, g=d.createElement('script'), s=d.getElementsByTagName('script')[0]; 
		g.type='text/javascript'; g.async=true; g.defer=true; g.src=u+'analytics.js'; s.parentNode.insertBefore(g,s); 
		})(); 
	}
}
catch(err)
  {
  }

