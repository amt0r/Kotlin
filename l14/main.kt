package l14

fun main() {
    val ship1 = SpaceShip("ship1", 500)
    ship1.runSystemDiagnostic()
    ship1.switchToWarpMode()
    val ship2 = Scout("dsa", 21, 123, 321)
    val ship3 = Industrial("dsa", 312)
    ship3.runSystemDiagnostic()

}