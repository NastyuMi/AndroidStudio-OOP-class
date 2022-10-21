package com.KotlinClassExamples

abstract class CinematicWorkOfArt (val type: TypeOfFilm) {

    open fun NameOfFilm()
    {
        print("Title of a ($type) ")
    }

    abstract fun YearOfRelease() : Int

    abstract fun  ShortDescription()

    abstract fun  Genre() : String

    enum class TypeOfFilm
    {
        FeatureFilm, DocumentaryCinema, PopularScienceFilm, AnimatedFilm
    }
}