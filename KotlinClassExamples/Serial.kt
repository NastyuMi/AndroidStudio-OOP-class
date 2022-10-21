package com.KotlinClassExamples

abstract class Serial(type: TypeOfFilm) : CinematicWorkOfArt(type) {

    override fun NameOfFilm()
    {
        super.NameOfFilm()
        print("serial : ")
    }

    abstract fun YearOfReleaseLastSeries() : Int

    abstract fun NumOfSeason() : Int

    abstract fun NumOfSeries()

    private fun AboutSeason(){
        val y = NumOfSeason()
        for (i in 1..y){
            println("In $i season about...")
        }

    }

    open fun AboutSerial()
    {
        NameOfFilm();
        println(type)
        println("Genre : " + Genre())
        NumOfSeason()
        NumOfSeries()
        println("Year of release : " + YearOfRelease() + " - " + YearOfReleaseLastSeries())
        ShortDescription()
        println("_______________")
        AboutSeason()
    }
}