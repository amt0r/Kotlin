package KotlinBasics.InheritanceAndOverriding

class Industrial(
    name: String,
    speed: Int,
) : SpaceShip(name, speed, true) {
    override fun runSystemDiagnostic(){
        super.runSystemDiagnostic()
        println("dsa")
    }
}