/**
 * 
 */
$(document).ready(populate);

function populate() {
	var firstName = $('#firstName');
	firstName.change(order);
	
}

function order(){
	var person = $('#firstName option');
	
//	$('#firstName').val(person);
//	alert("here it goes");
	
//	var options = $("#list option");                    // Collect options         
	person.detach().sort(function(a,b) {               // Detach from select, then Sort
	    var at = $(a).text();
	    var bt = $(b).text();         
	    return (at > bt)?1:((at < bt)?-1:0);            // Tell the sort function how to order
	});
	person.appendTo('#firstName');                          
}



