package KotlinBasics.InheritanceAndOverriding

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int,
) : SpaceShip(name, speed) {

}