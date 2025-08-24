fun main() {
    val edades = listOf(15, 18, 20, 22, 17)

    //Imprimir solo edades mayores a 18 con FOR
    for (edad in edades) {
        if (edad >= 18)
            println("$edad ")
    }

        print("\n")
    //Imprimir solo edades mayores a 18 con WHILE
    var i = 0
    while (i < edades.size) { //Mientras el valor sea menor que el tamaño de la lista
        if (edades[i] >= 18)
            println("Edad prosición ${i}= ${edades[i]}") // Imprimimos por índice
        i++ //Incrementamos el contador
    }
        print("\n")
    //forEach: Indexado para imprimir en una sola línea
    edades.forEachIndexed { index, e ->
    if (index < edades.size - 1) {
        print("$e, ")
    } else {
        print("$e")
    }

    }
        print("\n")
        //LIST: admite datos duplicados, conserva el orden
        val estudiantes: List<String> = listOf("Basti", "Bastian", "Gran-Basti", "Bastian")

        //SET: No admite repetidos
        val nombresUnicos: Set<String> = estudiantes.toSet()
        println("\nLista de nombres únicos: $nombresUnicos\n")

        //MAP: Crear tipo clave valor ()JSON  //No puede tener claves repetidas
        //Nombre : Clave
        //Valor : Curso
        val cursos: Map<String, String> = mapOf(

            "Basti" to "Aplicaciones móviles",
            "Bastian" to "Machine Learning",
            "Gran-Basti" to "Base de datos",
            "Basti" to "Machine Learning" //Como se repite la clave, asignará el último valor
        )

        //Usuario si existe -> devuelve curso asignado
        println("Curso favorito de Basti: ${cursos["Basti"]}\n")

        //Usuario no exite -> decuelve null
        println("Curso favorito de Ana: ${cursos["Ana"]}\n")

//Búsqueda find
        val primeraMayor18 = edades.find { it > 18 }
        println("Primera edad mayor a 18 es: $primeraMayor18\n")

//Búsqueda any
        val hayMenores = edades.any { it < 18 } //existe algún menor de edad o el dato menor < 18 //BOOLEAN
        println("¿Hay menores?: $hayMenores\n")

//Búsqueda all
        val todosAdultos = edades.all { it >= 18 }
        println("¿Todos son mayores?: $todosAdultos\n")

//Búsqueda map
        val edadesDobles = edades.map { it * 2 }
        println("El doble de las edades son: $edadesDobles\n")

//Búsqueda filter
        val soloAdultos = edades.filter { it >= 18 }
        println("Edades de los adultos: $soloAdultos\n")

//Calcular la suma
        val suma = edades.sum()
        println("La suma de todas las edades es: $suma\n")

//Calcular el promedio
        val promedio = edades.average()
        println("El promedio de las edades: $promedio")

//Cambio a Branch gh-pages
}