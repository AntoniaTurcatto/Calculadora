
import kotlin.math.sqrt

fun main() {
    println(sum(2.0, 3.0, 4.0, 5.0))
    println(dim(10.0, 5.0, 1.0))
    println(multiplicacao(2.0, 3.0, 5.0))
    println(divisao(10.0, 2.0, 2.0))

    println(potenciacao(3.0, 2))
    println(potenciacao(3.0, -2))
    println(potenciacao(3.0, 1))
    println(potenciacao(3.0, 0))

    println(raizQuadrada(9.0))
}
fun sum(vararg numbers:Double):Double{
    var sum=0.0
    for(number in numbers){
        sum+=number
    }
    return sum
}

fun dim(number1:Double,vararg numbers:Double):Double{
    var sub=number1
    for(number in numbers){
        sub-=number
    }
    return sub
}

fun multiplicacao(vararg numbers:Double):Double{
    var result=1.0
    for(number in numbers){
        result*=number
    }
    return result
}

fun divisao(number1: Double, vararg numbers:Double):Double{
    var result=number1
    for(number in numbers){
        result/=number
    }
    return result
}

fun potenciacao(base: Double, expoente:Int):Double{
    var result=base
    if(expoente>0){
        for(i in 2..expoente){
            result*=result
        }
    }else if (expoente==0){
        result=1.0
    } else {
        for(i in 2..-(expoente)){
            result*=result
        }
        result=1/result
    }
    return result
}

fun raizQuadrada(base:Double):Double{
    var result= sqrt(base)
    return result
}