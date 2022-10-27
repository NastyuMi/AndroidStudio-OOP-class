package com.KotlinClassExamples

abstract class Serial(type: TypeOfFilm) : CinematicWorkOfArt(type) {

    override fun nameOfFilm()
    {
        super.nameOfFilm()
        print("serial : ")
    }

    abstract fun yearOfReleaseLastSeries() : Int

    abstract fun numOfSeason() : Int

    abstract fun numOfSeries()

    private fun aboutSeason(){
        val y = numOfSeason()
        for (i in 1..y){
            println("In $i season about...")
        }

    }

    open fun aboutSerial()
    {
        nameOfFilm();
        println(type)
        println("Genre : ${genre()}")
        // тут в println()  используется именно как функция genre(), а не как переменная
        // и при написании в коде  println("Genre : $genre()") - компилятор ругается
        // Function invocation 'genre()' expected
        numOfSeason()
        numOfSeries()
        println("Year of release : ${yearOfRelease()} - ${yearOfReleaseLastSeries()}")
        shortDescription()
        println("_______________")
        aboutSeason()
    }
}