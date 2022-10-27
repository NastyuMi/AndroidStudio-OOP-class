package com.KotlinClassExamples

abstract class Film(type: TypeOfFilm) : CinematicWorkOfArt(type) {

    override fun nameOfFilm()
    {
        super.nameOfFilm()
        print("film : ")
    }

    open fun aboutFilm()
    {
        nameOfFilm();
        println(type)
        println("Genre : " + genre())
        println("Year of release : "+ yearOfRelease())
        shortDescription()
    }
}