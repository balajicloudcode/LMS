
function search(){
var category=document.getElementById("BookId").value
var searchValue=document.getElementById("search").value

if(category == "none"){
alert("please select the category");
return 0;
}
if(searchValue == ""){
alert("please fill in search box");
return 0;
}

if(category == "BookId"){
	
	getBookId(searchValue);
	
}
if(category == "BookTitle"){
	
	getBookByTitle(searchValue);
	
}



}




function getBookId(searchValue){
	$("#filterListTable tr").remove();
	$.ajax({
		url : "/getData/" +searchValue,
		success : function(data) {
			var tr=[];
	 		tr.push('<tr style="color:#009688;margin-bottom: 12px;">');
	 		tr.push("<th>Author Name</th>");
	 		tr.push("<th>Book Title</th>");
	 		tr.push("<th>Available</th>");
	 		tr.push('</tr>');
					tr.push('<tr">');
					tr.push("<td>"+data[0]+"</td>");
					tr.push("<td>"+data[2]+"</td>");
					if(data[1] == "No" ){
						tr.push("<td><button type='button' class='btn btn-primary' style='height: 31px;' onclick='bookit("+data[3]+")' disabled>Unavailable</button></td>");	
					}
					if(data[1]  == "yes" ){
						tr.push("<td><button type='button' class='btn btn-primary' style='height: 31px;' onclick='bookit("+data[3]+")' >Procced to book</button></td>");	
					}
							
					tr.push('</tr>');
		$('table[id=filterListTable]').append($(tr.join('')));
		}
	});
} 

function getBookByTitle(searchValue){
	$("#filterListTable tr").remove();
	$.ajax({
		url : "/name/" +searchValue,
		success : function(data) {
			var tr=[];
	 		tr.push('<tr style="color:#009688;margin-bottom: 12px;">');
	 		tr.push("<th>Author Name</th>");
	 		tr.push("<th>Book Title</th>");
	 		tr.push("<th>Available</th>");
	 		tr.push('</tr>');
					tr.push('<tr">');
					tr.push("<td>"+data[0]+"</td>");
					tr.push("<td>"+data[2]+"</td>");
					if(data[1] == "No" ){
						tr.push("<td><button type='button' class='btn btn-primary' style='height: 31px;' onclick='bookit("+data[3]+")' disabled>Unavailable</button></td>");	
					}
					if(data[1]  == "yes" ){
						tr.push("<td><button type='button' class='btn btn-primary' style='height: 31px;' onclick='bookit("+data[3]+")' >Procced to book</button></td>");	
					}
							
					tr.push('</tr>');
		$('table[id=filterListTable]').append($(tr.join('')));
		
		}
	});
} 

function bookit(idValue){
	alert("hi"+idValue);
	$.ajax({
		url : "/updatedBook/" +idValue,
		success : function(data) {
		alert("data"+data)
		}
	});
}
