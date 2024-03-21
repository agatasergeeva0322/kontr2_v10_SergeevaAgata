import kotlinx.coroutines.*
suspend fun main() = runBlocking { var phoneCall = Class("","", 0.0, 0)
    var i: Int = 0
    var n: Int = 0
    try{
    do {
        print("Количество запусков: ")
        var n = readLine()!!.toInt()
    }
    while(n<1)
    do{
    launch {
            phoneCall.InputInfo()
            phoneCall.InputCost()
            phoneCall.costPhoneCall()
            phoneCall.GetInfo()
           }
            delay(5000)
            phoneCall.Oper()
        i++
    }
    while(i<n)
    }
    catch(e : Exception)
    {
        println("Формат введённого данного был неверный")
    }
}
