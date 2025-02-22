package KotlinBasics.CustomSettersAndGetters

class BubleFish(
    private  val coefficient: Int?
) {

    var isTransleted = false

    var nervousSignalLevel = 2
        get() = if (coefficient != null) field * coefficient else field
        set(value) {
            field = value
            if (value>300) {
                isTransleted = true
            }
        }

}