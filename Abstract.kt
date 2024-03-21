abstract class Abstract : Interface {
    abstract var phoneNumber: String
    abstract var date: String
    abstract var lon: Double
    abstract var cityCode: Int
    override fun costPhoneCall() {
        super.costPhoneCall()
    }
    override fun InputInfo() {
        super.InputInfo()
    }
    open fun GetInfo() {}
}