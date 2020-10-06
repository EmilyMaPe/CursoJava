function sumar() {
    //Envolvemos todo el codigo en un bloque try catch
    //para procesar la excepcion en caso de que ocurra una
    try {
        //Pedimos valor de a y b
        //promt("lo que ve el usuario", "valor por default")
        var a = prompt("Valor a:", "");
        //validamos parametro a
        //!a revisa si la cadena es vacia o nula
        //NaN Not a Number
        if (!a || isNaN(a)) {
            throw new Error("Valor invalido de a:" + a);
        }
        var b = prompt("Valor b:", "");
        if (!b || isNaN(a)) {
            throw new Error("Valor invalido de b:" + b);
        }
        //Si no hay problema realizamos la suma
        //Necesitamos convertir los parametros
        var c = parseFloat(a) + parseFloat(b);
        alert("La suma es: " + c);
    } catch (e) {
        alert("El error es: " + e.message);
    }
}



