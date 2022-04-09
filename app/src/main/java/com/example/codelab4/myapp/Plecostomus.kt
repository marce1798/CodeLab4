package com.example.codelab4.myapp

/*class Plecostomus: AquariumFish() {
    override val color = "gold"
}*/

/*class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}*/

/*class Plecostomus: FishAction, FishColor {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}*/
/*class Plecostomus:  FishAction, FishColor by GoldColor {
    override fun eat() {
        println("eat algae")
    }
}*/

class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor {
    override fun eat() {
        println("eat algae")
    }
}