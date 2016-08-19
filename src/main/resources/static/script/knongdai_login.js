
function setCookie(cname, cvalue) {
	var d = new Date();
	d.setTime(d.getTime() + (30 * 24 * 60 * 60 * 1000));
	var expires = "expires=" + d.toGMTString();
	document.cookie = cname + "=" + cvalue + "; " + expires+ ";";
			//"domain=.khmeracademy.org/;";
	alert(expires);
}
function getCookie(cname) {
	var name = cname + "=";
	var ca = document.cookie.split(';');
	for (var i = 0; i < ca.length; i++) {
		var c = ca[i];
		while (c.charAt(0) == ' ') {
			c = c.substring(1);
		}
		if (c.indexOf(name) == 0) {
			return c.substring(name.length, c.length);
		}
	}
	return "";
}

function checkCookie(path) {
	var email = getCookie("ka_user_id");
	if (email != "") {
//		alert("Welcome again " + email);

		location.href = path+"/auto-login?email="+ email+"&continuePage="+window.location.href;

	}
}