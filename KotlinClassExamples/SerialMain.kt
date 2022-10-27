package com.KotlinClassExamples

class SerialMain(type: TypeOfFilm, private val name : String, private val YearFirstS : Int,
                 private val YearLastS : Int, private val season : Int, private val series : Int,
                 private val genre : String) : Serial(type), Video {
    //FeatureFilm
    override fun nameOfFilm() {
        super.nameOfFilm()
        println(name)
    }

    override fun yearOfRelease(): Int = YearFirstS

    override fun yearOfReleaseLastSeries(): Int =  YearLastS

    override fun numOfSeason() : Int = season

    override fun numOfSeries() {
        println("Series : $series")
    }

    override fun shortDescription() {
        println("Something inform about serial")
    }

    override fun genre(): String = genre

    override fun aboutSerial() {
        super.aboutSerial()
    }

    override fun trailer() {
        println("watch the trailer '$name'")
    }

    override fun watchTheMovie() {
        println("watch the '$name'")
    }
}