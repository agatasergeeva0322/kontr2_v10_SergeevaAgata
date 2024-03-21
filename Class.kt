import java.time.LocalDate
import java.time.format.DateTimeParseException

open class Class(override var phoneNumber: String, override var date: String, override var lon: Double,
                 override var cityCode: Int) : Abstract()
{
    var cost: Double = 0.0
    var TF: Boolean = false
    fun InputCost()
    {
        do {
            print("Стоимость 1-ой минуты звонка: ")
            cost = readLine()!!.toDouble()
        }
        while(cost<0)
    }
    fun Oper()
    {
        println("Барабарабара")
    }
    override fun InputInfo() {
        try{
            do {
                print("Номер телефона:")
                phoneNumber = readLine()!!.toString()
            }
            while(phoneNumber.length<11)
            do {
                print("Дата звонка(yyyy-mm-dd):")
                date = readLine()!!.toString()
                var date_today = LocalDate.now()
                try {
                    var date_your = LocalDate.parse(date)
                    if(date_your<=date_today ) TF=true
                    else TF=false
                }
                catch(e : DateTimeParseException)
                {
                    TF=false
                }
            }
            while (TF==false)
            do{
                print("Продолжительность звонка:")
                lon = readLine()!!.toDouble()
            }
            while(lon<0.0)
            do{
                print("Код города:")
                cityCode = readLine()!!.toInt()
            }
            while (cityCode<0 && cityCode.toString().length<3 && cityCode.toString().length>4)
        }
        catch (e : Exception)
        {
            println("Формат введённый данных был неверный")
        }
    }
    override fun GetInfo()
    {
        println("\nНомер телефона:${phoneNumber}\nДата и продолжительность звонка: ${date} | ${lon} мин.\nКод города: ${cityCode}")
    }

    override fun costPhoneCall() {
        var totalcost: Double = 0.0
        if(lon>70.0) totalcost = 0.7*(100*cost*lon)
        else totalcost = cost*lon
        println("\nСтоимость разговора: ${String.format("%2f",totalcost)}")
    }
}