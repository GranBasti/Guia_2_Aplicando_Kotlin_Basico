fun main() {
//Definición de variables a y b
    val a: Int = 34
    val b: Double = 7.0

//Operaciones básicas con variables a y b
    val suma = a + b
    val resta = a - b
    val mult = a * b
    val div = a / b

//Mostrar resultados por consola
    println("Suma = $suma \nResta = $resta \nMultiplicacion = $mult \nDivisión = $div")


//Contando longitud de una variable string que puede ser de tipo null
    val objeto: String? = "Motorola Edge 40" //puede ser null
    //1) Safe call = Llamada segura -> solo si no es null
    println("\n1) Safe call")
    println(objeto?.length)

    var objetoNull: String? = objeto
    null.also { objetoNull = it }

    //3) NNA Non Null Assertion (!!) -> Aseguración, es decir estoy asegurando que este dato no va a ser null
    // NPE NullPointerException
    //try catch para que no se crashee
    println("2) NNA !!")
    try {
        //Cambiar objeto x objetoNull para que objeto tome el valor de null y se aplique el manejo de error NPE
        println(objetoNull!!.length) //Asegurando que el dato no es null NPE
    } catch (e: NullPointerException) {
        println("NPE para controlar errores de tipo null\n")
    }

    //Preguntas de reflexión
    print("\nPregunta de reflexión: En un comentario en tu código, explica brevemente cómo \n" +
            "se realizaría una verificación equivalente en Java para evitar un NullPointerException\n" +
            "\nRespuesta:\n" +
            "Se realizaría similar solo que en vez de utilizar println para mostrar por consola debemos utilizar\n" +
            "System.out.println y de la misma manera manera especificar el try/catch y el evento de tipo NPE\n\n")


    //Case When para mostrar los días de la semana en orden ordinal
    val dias = 1..7

    for(i in dias)

    when (i) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Seleccione un número del 1 al 7")
    }

//preguntas de reflexión
    println("\nPreguntas de Reflexion\n" +
            "\uF0B7 ¿Qué diferencias y similitudes clave observaste entre Kotlin y Java en esta \n" +
            "actividad? \n\n"+
            "Puedo decir que en Kotlin declaro una variable de rango de números Int y recorrerlos como si fueran una lista,\n" +
            "lo que en Java debería iterar la variable de tipo Int e ir recorriendola con una operación ++\n\n"+
            "\uF0B7 ¿Cómo podrías aplicar lo aprendido sobre la seguridad ante nulos (Null Safety) y la expresión when en futuros proyectos de desarrollo de aplicaciones \n" +
            "móviles?\n\n" +
            "Creo que podría aplicar la seguridad de valores nulos en una condición when para validar si lo que estoy iterando\n" +
            "puede ser de tipo null convertirlo a un valor por defecto o bien manejarlo con un evento de excepcion como NPE")
}