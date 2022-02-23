package com.davidglez.kotlinbasics

import android.util.Log

/*En kotlin todo en un objeto
    no hay tipos basicos y no existe void. si algo no devuelve nada, esta devolviendo UNit object.
    las variables pueden ser mutables o inmutables
    mutables: pueden cambiar su valor
    inmutables: no cambia su valor, como static final de java
    usaremos inmutables siempre que sea posible, var = mutables val = inmutables
    Los tipos son definidos despues del nombre de la variable con dos puntos y espacio, var nombre: tipo*/

class Variables {
    /*Kotlin tiene un sistema de inferencia de tipos, es decir le podemos no decir que tipo de de variable es y por si solo lo sabe,
    pero en algunos casos es bueno ponerlo para codigo un poco mas claro*/
    private var variable0 = 1
    private var variable1: Int = 2
    private var variable3 = 1.toByte()
    private var variable4 = -123
    private var variable5 = 2147483648
    private var variable6 = 1.1.toFloat()
    private var variable7 = 1.9
    private var variable8 = 'a'
    private var variable9 = "a"
    private var variable10 = true
    private var variable11 = arrayOf(1,2,3,4,5)
    private var variable12 = arrayOfNulls<Int>(10) //[null, null] solo acepta entero
    private val variable13 = "Esta variable es read-only/inmutable/constante" //static final de java

    //show case para byte
    private fun showCase1(){
        Log.w("VARIABLE-0", "Es variable0 un Integer? --> " + (variable0 is Int) + "por que no un byte?")
        Log.w("VARIABLE-3", "Es variable0 un Integer? --> " + (variable3 is Byte))
    }

    //show case para Int
    private fun showCase2(){
        Log.w("VARIABLE-4", "Es un valor Integer")
        variable4 = Int.MAX_VALUE
    }

    //show case para long
    private fun showCase3(){
        Log.w("VARIABLE-5", "Es variable5 es un long? --> " + (variable5 is Long))
    }

    //show case para float
    private fun showCase4(){
        Log.w("VARIABLE-6", "Es variable6 es un float? --> " + (variable6 is Float))
    }

    //show case para double
    private fun showCase5(){
        Log.w("VARIABLE-7", "Es variable7 es un double? --> " + (variable7 is Double))
    }

    //show case para char
    private fun showCase6(){
        Log.w("VARIABLE-8", "Es variable8 es un char? --> " + (variable8 is Char))
    }

    //show case para String
    private fun showCase7(){
        Log.w("VARIABLE-9", "Es variable8 es un String? --> " + (variable9 is String))
        //String literals
        variable9 = "Hola Mundo!\nAdios Mundo!" //Java, sigue funcionando aun en kotlin
        variable9 = """
            Hola Mundo!
            Adios Mundo!
        """ //Kotlin Style

        //String templates
        var points = 9
        var maxPoints = 10
        variable9 = "Hola, tengo " + points + " puntos de " + maxPoints // java
        variable9 = "Hola, tengo $points puntos de $maxPoints" //kotlin
        variable9 = "Hola, tengo ${points * 10} puntos de $maxPoints" //kotlin
    }

    //show case para boolean
    private fun showCase8(){
        Log.w("VARIABLE-10", "Es variable8 es un Booleano? --> " + (variable10 is Boolean))
    }

    //show case para array de enteros, Array<Int>
    private fun showCase9(){
        Log.w("VARIABLE-11", "Es variable8 es un Array<Int>? --> " + (variable11 is Array<Int>))
    }

    //show case para array de enteros, Array<Int?>
    private fun showCase10(){
        Log.w("VARIABLE-12", "Es variable12 es un Array<Int?>? --> " + (variable12 is Array<Int?>))

        variable12 = arrayOfNulls(3)
        variable12 = arrayOf(1,2,3,4,5)

        variable12[0]?.toFloat() //safe calls -- en caso de ser null devuelve null
        variable12[0]?.toFloat() ?: "Error" //Elvis Operator -- en caso de ser null devuelve "Error"
        variable12[0]!!.toFloat() //!! operador -- cuando estamos seguros que no es null al 100%, si lo fuera lanza un null pointer
    }

    fun showCases(){
        showCase1()
        showCase2()
        showCase3()
        showCase4()
        showCase5()
        showCase6()
        showCase7()
        showCase8()
        showCase9()
        showCase10()
    }


    //metodo sin ningun parametro
    private fun methodOne(){}

    //metodo con parametros
    private fun methodTwo(name: String, lastName: String, age: Int){}

    //metodo con parametros de salida, return
    private fun methodThree(numberOne: Int, numberTwo: Int) : Int{ return numberOne + numberTwo }
    //kotlin tambien nos permite hacer algo como esto en caso de tener un retorno sencillo
    private fun methodFour(numberOne: Int, numberTwo: Int) : Int = numberOne + numberTwo
}