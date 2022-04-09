package com.example.codelab4.myapp

/*abstract class AquariumFish {
    abstract val color: String
}

interface FishAction  {
    fun eat()
}*/
/*interface FishAction  {
    fun eat()
}

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

interface FishColor {
    val color: String
}*/
interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
