package com.KotlinClassExamples

abstract class Film(type: TypeOfFilm) : CinematicWorkOfArt(type) {

    override fun NameOfFilm()
    {
        super.NameOfFilm()
        print("film : ")
    }

    open fun AboutFilm()
    {
        NameOfFilm();
        println(type)
        println("Genre : " + Genre())
        println("Year of release : "+ YearOfRelease())
        ShortDescription()
    }
}