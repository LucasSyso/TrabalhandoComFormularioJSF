/**
 * Lucas da Silva Barbosa
 */

function validaFormulario(){
	var nome = document.getElementById("form:nome").value;
	
	var senha1 = document.getElementById("form:senha1").value; //Esta é a convernção que o JSF utiliza, de outra forma não funcionará.
	var senha2 = document.getElementById("form:senha2").value;
	
	var email = document.getElementById("form:email").value;
	//Uma das mandeiras de utilizar expressões regulares
		//var myRe = new RegExp("\\w+@\\w+.com");
		var myRe = /\w+@\w+.com/;
	//-------------------------------------------------//

	if(nome == ""){
		document.getElementById("form:erroNome").style.visibility = "visible";
		return false;
	}else if(senha1 != senha2 | senha1 == "" | senha2 == ""){
		document.getElementById("form:erroSenhas").style.visibility = "visible";
		return false;
	}else if(!myRe.test(email)){
		document.getElementById("form:erroEmail").style.visibility = "visible";
		return false;
	}
	
	
	return true;
}