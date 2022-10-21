package com.KotlinClassExamples

class FilmMain(type: TypeOfFilm, private val name : String, private val Year : Int,
               private val genre : String) : Film(type), Video {
    override fun NameOfFilm() {
        super.NameOfFilm()
        println(name)
    }

    override fun YearOfRelease(): Int {
        return Year
    }

    override fun ShortDescription() {
        println("Something inform about movie")
    }

    override fun Genre(): String {
        return genre
    }

    override fun AboutFilm() {
        super.AboutFilm()
    }

    override fun Trailer() {
        println("watch the trailer '$name'")
    }

    override fun WatchTheMovie() {
        println("watch the '$name'")
    }
}