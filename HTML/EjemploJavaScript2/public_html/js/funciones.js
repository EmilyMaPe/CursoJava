/*
 * @author Emily Madrigal
 */

/*Al cargar la pagina HTML se mandara llamar la funcion inicia Datos*/
window.onload = iniciaDatos;

function iniciaDatos(){
    //Cuando se de click en el link se llamara la funcion validaSalir
    document.getElementById("link").onclick = validaSalir;
    document.getElementById("linkSearch").onclick = busqueda;
}
//Valida si el usuario quiere salir del sitio o no
function validaSalir(){
    if(confirm("¿Desea salir del sitio?")){
        alert("Nos vamos a google");
        return true;
    }else{
        alert("Nos quedamos en eeste sitio");
        return false;
    }
}
//Pide una cadena a buscar en google
function busqueda(){
    //Con la funcion prompt capturamos unformacion del usuario
    var respuesta = prompt("Escribe la cadena a buscar:", "");
    //Si hubo una respuesta concatenamos la cadena a buscar al link de google
    if(respuesta){
        alert("Tu respuesta fue: " + respuesta);
        //El operador this nos sirve para referenciar al elemento
        //que provoco el evento, en este caso el elemento con
        //el identificador "linkSearch" y concatenamos la respuesta
        //como parametro de una peticion get
        var nuevoLink = this + "search?q=" + respuesta;
        alert("Nuevo Link: " + nuevoLink);
        //Cambiar la ventana poe el link proporcionado
        window.location = nuevoLink;
        //Regresamos false para no cargar el link original de linkSearch
        return false;
    }else{
        alert("No proporcionaste ninguna cadena a buscar");
        return false;
    }
}