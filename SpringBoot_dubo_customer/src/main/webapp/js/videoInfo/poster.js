try{
var thisUrl = top.location.href;
}catch(err){
}

var unionId = '';
var keyword = '';
if(thisUrl != null)
{
	unionId = getUrlParameterAdv( "u", thisUrl);
	keyword = getUrlParameterAdv( "k", thisUrl);

	if(unionId != '' && unionId != 'null' && unionId != null)
	{
		loadXMLDoc("/global/poster.shtm?unionId="+unionId+"&keyword="+keyword+"&rand="+Math.random());
	}
}

//global flag
var isIE = false;
// global request and XML document objects
var req;

function loadXMLDoc(url) {
	// branch for native XMLHttpRequest object
	if (window.XMLHttpRequest) {
			req = new XMLHttpRequest();
			req.open("GET", url, true);
			req.send(null);
		// branch for IE/Windows ActiveX version
	} else if (window.ActiveXObject) {
		isIE = true;
		req = new ActiveXObject("Microsoft.XMLHTTP");
		if (req) {
			req.open("GET", url, true);
			req.send();
		}
	}
}

//?js????
//para   asName   String:??????????? 
//para   lsURL   String:??????URL? 
function getUrlParameterAdv(asName,lsURL){ 

  loU = lsURL.split( "?"); 
  if(loU.length> 1){ 

    var loallPm = loU[1].split( "&"); 

    for(var i=0; i < loallPm.length; i++){ 
      var loPm = loallPm[i].split( "="); 
      if(loPm[0]==asName){ 
        if(loPm.length> 1){ 
          return loPm[1]; 
        }else{ 
          return ""; 
        } 
      } 
    } 
  }
  
  return null; 
}