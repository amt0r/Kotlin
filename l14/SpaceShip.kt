package l14

open class SpaceShip (
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode() {
        println("To WARP!")
    }

    open fun runSystemDiagnostic() {
        println("DIAGNOSTIC...")
    }
}