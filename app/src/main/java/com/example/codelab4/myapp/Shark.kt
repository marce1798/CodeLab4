package com.example.codelab4.myapp

/*class Shark: AquariumFish() {
    override val color = "grey"
}*/
/*class Shark: AquariumFish(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}*/
class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}