function get_domain() {
    var host = window.location.href.split('/')[2];
    var topLevel = ['com', 'net', 'org', 'gov', 'edu', 'mil', 'biz', 'name', 'info', 'mobi', 'pro', 'travel', 'museum', 'int', 'areo', 'post', 'rec'];
    var domains = host.split('.');
    if (domains.length <= 1) return str;
    if (!isNaN(domains[domains.length - 1])) return str;
    var i = 0;
    while (i < topLevel.length && topLevel[i] != domains[domains.length - 1]) i++;
    if (i != topLevel.length) return domains[domains.length - 2] + '.' + domains[domains.length - 1];
    else {
        i = 0;
        while (i < topLevel.length && topLevel[i] != domains[domains.length - 2]) i++;
        if (i == topLevel.length) return domains[domains.length - 2] + '.' + domains[domains.length - 1];
        else return domains[domains.length - 3] + '.' + domains[domains.length - 2] + '.' + domains[domains.length - 1];
    }
}
function set_uuid() {
    $.ajax({
        type: "GET",
        url: "http://data.cdeledu.com/bdp/get/uuid/?jsoncallback=?",
        dataType: "jsonp",
        success: function(data) {
            uuid = data.uuid;
            var exp = new Date();
            exp.setTime(exp.getTime() + 10 * 365 * 24 * 3600 * 1000);
            document.cookie = "bdp_uuid=" + uuid + ";expires=" + exp.toGMTString() + ";path=/;domain=" + get_domain();
        }
    });
}
var bdp_uuid = document.cookie.match(new RegExp("(^| )bdp_uuid=([^;]*)(;|$)"));

if (bdp_uuid == null) {
    set_uuid();
}
