function createRequest() {
	try {
		request = new XMLHttpRequest();
	} catch (tryMS) {
		try {
			request = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (otherMS) {
			try {
				request = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (failed) {
				request = null;
			}
		}
	}
	return request;
}

function getDetails(itemName) {
	request = createRequest();
	if (request == null) {
		alert("Unable to create request");
		return;
	}
	console.log("In getDetails");
	var url = "getItem?t1=" + escape(itemName);
	request.open("GET", url, true);
	request.onreadystatechange = displayDetails;
	request.send(null);
}

function displayDetails() {
	if (request.readyState == 4) {
		if (request.status == 200) {
			document.getElementById("t2").value=request.responseText;
		}
	}
}