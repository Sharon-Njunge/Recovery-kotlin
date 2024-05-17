fun main() {
    val recoveryTime = DisasterRecoverySystem()
    recoveryTime.addSituation("Kikuyu", "Fire")
    recoveryTime.addSituation("Langata", "Landslides")
    println(recoveryTime.getSituation("Kikuyu"))
    println(recoveryTime.getSituation("Langata"))

}

class DisasterRecoverySystem {
    private val situations = mutableMapOf<String, MutableList<String>>()
    fun addSituation(location: String, situation: String) {
        if (!situations.containsKey(location)) {
            situations[location] = mutableListOf()
        }
        situations[location]?.add(situation)
    }
    fun getSituation(location: String): List<String>? {
        return situations[location]
    }
}

