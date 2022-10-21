package com.KotlinClassExamples

class SerialMain(type: TypeOfFilm, private val name : String, private val YearFirstS : Int,
                 private val YearLastS : Int, private val season : Int, private val series : Int,
                 private val genre : String) : Serial(type), Video {
    //FeatureFilm
    override fun NameOfFilm() {
        super.NameOfFilm()
        println(name)
    }

    override fun YearOfRelease(): Int {
        return YearFirstS
    }

    override fun YearOfReleaseLastSeries(): Int {
        return YearLastS
    }

    override fun NumOfSeason() : Int {
        return season
    }

    override fun NumOfSeries() {
        println("Series : $series")
    }

    override fun ShortDescription() {
        println("Something inform about serial")
    }

    override fun Genre(): String {
       return genre
    }

    override fun AboutSerial() {
        super.AboutSerial()
    }

    override fun Trailer() {
        println("watch the trailer '$name'")
    }

    override fun WatchTheMovie() {
        println("watch the '$name'")
    }
}