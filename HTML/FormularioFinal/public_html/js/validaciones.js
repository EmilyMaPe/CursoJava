//Funcion para calidar los elementos requeridos
function validarForma(forma){
    //Validamos el usuario
    var usuario = forma.usuario;
    if(usuario.value === ""){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    //Validar password y que no sea menor a 3 caracteres
    var password = forma.password;
    if(password.value === "" || password.value.length < 3){
        alert("Debe proporcionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    //Validamos las tecnologias (checkbox)
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    for(i = 0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    if(!checkSeleccionado){
        alert("Debe proporciona una Tecnologia");
        return false;
    }
    
    //Validar radio Button Genero
    var generos = forma.genero;
    var radioSeleccionado = false;
    for(i = 0; i < generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    if(!radioSeleccionado){
        alert("Debe seleccionar el genero");
        return false;
    }
    //Validar ocupacion
    var ocupacion = document.getElementById("ocupacion");
    //var ocupacion = forma.ocupacion;
    if(ocupacion.value ===""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    //Si llegamos hasta aqui es valido el formulario
    alert("Formulario valido, enviando datos...");
    return true;
}


