fun main() {
    //ejercicio1()
    //ejercicio2()
    //ejercicio3()
    //ejercicio4()
    //ejercicio5()
    //ejercicio6()
    //ejercicio7()
    //ejercicio8()
    //ejercicio9()
    //ejercicio10()
    //ejercicio11()
    //ejercicio12()
    //ejercicio13()
    //ejercicio14()
    //ejercicio15()
    //ejercicio16()
    //ejercicio17()
    ejercicio18()

}
fun ejercicio1() {
    println("\n1. Suma de los n primeros números\n")
    var numero: Int = 0
    var suma: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

    for (i in 1..numero) {
        suma += i
    }
    println("La Suma de los primeros $numero numeros es: $suma")
}

fun ejercicio2() {
    println("\n2. Digite un número, si el numero supera a 10, multiplique los 10 primeros números, sino, súmelos (Propuesto)\n")
    var numero: Int = 0
    var multiplicacion: Int = 1
    var suma: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toInt()
    if (numero > 10) {
        for (i in 1..10) {
            multiplicacion *= i // multiplicacion = multiplicacion * i
        }
        println("La multiplicacion de los $numero primeros numeros es: $multiplicacion")
    } else {
        for (i in 1..numero) {
            suma += i
        }
        println("La Suma de los primeros $numero numeros es: $suma")
    }
}

fun ejercicio3() {
    println("\n3. Múltiplos de 3 desde 1 hasta n\n")
    var numero: Int = 0
    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

    for (i in 3..numero step 3) {
        println("Los numeros multiplos de 3 son: $i")
    }
}
fun ejercicio4() {
    println("\n4. Múltiplos de 5 desde 1 hasta n (Propuesto)\n")
    var numero: Int = 0
    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

    for (i in 5..numero step 5) {
        println("Los numeros multiplos de 5 son: $i")
    }
}
fun ejercicio5() {
    println("\n5. Sumar 1-2+3-4...\n")
    var numero: Int = 0
    var suma: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toInt()
    for (i in 1..numero) {
        var b: Int = i
        if (b % 2 == 0) {
            b *= -1
        }
        suma += b
    }
    println("La Suma es: $suma")
}
fun ejercicio6() {
    println("\n6. Sumar pares desde n hasta m (Propuesto)\n")
    var numeroN: Int = 0
    var numeroM: Int = 0
    var suma: Int = 0

    print("Ingrese numero inicial: ")
    numeroN = readLine()!!.toInt()
    print("Ingrese numero final: ")
    numeroM = readLine()!!.toInt()

    for (i in numeroN..numeroM) {
        if (i % 2 == 0) {
            suma += i
        }
    }
    println("La Suma es: $suma")
}
fun ejercicio7() {
    println("\n7. Numeros Primos\n") // Sólo divisibles por 1 y por sí mismo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
    var numero: Int = 0
    print("Ingrese numero: ")
    numero= readLine()!!.toInt()

    for (i in 1..numero){
        if (i == 1 || i == 2){
            println("$i es primo")
        } else {
            // Para pares
            if (i % 2 == 0){
                println("$i no es primo")
            } else {
                // Para divisibles por 1 y por sí mismo
                var contador: Int = 0
                for (j in 1..i) {
                    if (i % j == 0){
                        contador++
                    }
                }
                if (contador > 2){
                    println("$i no es primo")
                } else {
                    println("$i es primo")
                }
            }
        }
    }


}

fun ejercicio8() {
    println("\n8. Factorial de un número\n") // 4! = 1*2*3*4 = 4*3*2*1
    var numero: Int = 0
    var factorial: Int = 1
    print("Ingrese numero: ")
    numero = readLine()!!.toInt()
    for (i in numero downTo 1) { // (i in 1..numero)
        factorial *= i
    }
    println("El factorial de $numero es: $factorial")
}
fun ejercicio9() {
    println("\n9. Suma de Factoriales (Propuesto)\n") // 1!+2!+3!+...+n! (Sin 0!=1)
    var numero: Int = 0
    var factorial: Int = 1
    var suma: Int = 0
    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

    for (i in 1..numero) {
        factorial *= i
        if (i==numero) print("$i!=")
        else print("$i!+")
        suma += factorial
    }
    println(" $suma")
}
fun ejercicio10() {
    println("\n10. Serie Fibonacci\n") // 0, 1, 1, 2, 3, 5, 8, 13, 21...
    var numero: Int = 0
    var t1: Int = 0
    var t2: Int = 1
    var suma: Int = 0
    do {
        print("Ingrese cantidad de valores: ")
        numero = readLine()!!.toInt()
    } while (numero <= 1)

    print("Fibonacci: $t1, $t2")
    for (i in 1 .. numero-2) {
        suma = t1 + t2
        print(", $suma")
        t1 = t2
        t2 = suma
    }
}
fun ejercicio11() {
    println("\n11. Hacer un programa que imprima la suma de todos los números pares que hay desde 1 hasta n, y diga cuantos números hay.\n")
    var numero: Int = 0
    var suma: Int = 0
    var contador: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

    for (i in 1..numero) {
        if (i % 2 == 0) {
            suma += i
            contador++
        }
    }
    println("La suma es: $suma")
    println("La cantidad de pares es: $contador")
}
fun ejercicio12() {
    println("\n12. Hacer un programa que imprima la suma de todos los números impares que hay desde n hasta m, y diga cuantos números hay (Propuesto).\n")
    var numero1: Int = 0
    var numero2: Int = 0
    var suma: Int = 0
    var contador: Int = 0

    print("Ingrese primer numero: ")
    numero1 = readLine()!!.toInt()
    print("Ingrese segundo numero: ")
    numero2 = readLine()!!.toInt()

    for (i in numero1..numero2) {
        if (i % 2 == 1) {
            suma += i
            contador++
        }
    }
    println("La suma es: $suma")
    println("La cantidad de impares es: $contador")
}
fun ejercicio13() {
    println("\n13. Hacer un programa que pida dos números y muestre todos los números que van desde el primero al segundo. Se debe controlar que los valores son correctos.\n")
    var numero1: Int = 0
    var numero2: Int = 0

    print("Ingrese primer numero: ")
    numero1 = readLine()!!.toInt()
    print("Ingrese segundo numero: ")
    numero2 = readLine()!!.toInt()

    print("Los numeros son:")
    for (i in numero1..numero2)
        print(" $i")
}
fun ejercicio14() {
    println("\n14. Hacer un programa que pida dos números y sume todos los números que van desde el primero al segundo. Se debe controlar que los valores son correctos. (Propuesto).\n")
    var numero1: Int = 0
    var numero2: Int = 0
    var suma: Int = 0

    print("Ingrese primer numero: ")
    numero1 = readLine()!!.toInt()
    print("Ingrese segundo numero: ")
    numero2 = readLine()!!.toInt()

    for (i in numero1..numero2) {
        suma += i
    }
    println("La suma desde $numero1 hasta $numero2 es: $suma")
}
fun ejercicio15 () {
    println("\n15. Hacer un programa que haga un menú del tipo “desea salir (S/N)” y el programa no termine hasta que el usuario teclee “S”.\n")
    var letra: String =""
    do {
        print("Desea salir (S/N): ")
        letra = readLine()!!
    } while (!letra.uppercase().equals("S"))
}
fun ejercicio16() {
    println("\n16. Hacer un programa que calcule la suma de los cuadrados de los 100 primeros numeros. (Propuesta)\n")
    var suma: Int = 0

    for (i in 1..100) {
        suma += i*i
    }
    println("La suma es: $suma")
}
fun ejercicio17() {
    println("\n17. Hacer un programa que calcule la media de números.\n")
    var cantidadDeNumeros: Int = 0
    var numero: Int = 0
    var suma: Int = 0

    print("Cantidad de numeros: ")
    cantidadDeNumeros = readLine()!!.toInt()

    for (i in 1..cantidadDeNumeros){
        print("Ingrese numero $i: ")
        numero = readLine()!!.toInt()
        suma += numero
    }
    //println("La media de $cantidadDeNumeros numeros es: ${(suma/cantidadDeNumeros).toDouble()}")
    println("La media de $cantidadDeNumeros numeros es: ${suma.toDouble()/cantidadDeNumeros.toDouble()}")
}
fun ejercicio18() {
    println("\n18. Hacer un programa que calcule la media de X números, se dejarán de solicitar números hasta que se introduzca el cero. (Propuesto)\n")
    var contador: Int = 0
    var numero: Int = 0
    var suma: Int = 0

    do {
        contador++
        print("Ingrese numero $contador: ")
        numero = readLine()!!.toInt()
        suma += numero
    } while (numero != 0)

    println("La media de ${contador-1} numeros es: ${suma.toDouble()/(contador-1).toDouble()}")
}









