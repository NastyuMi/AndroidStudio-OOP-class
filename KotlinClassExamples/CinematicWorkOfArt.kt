package com.KotlinClassExamples

abstract class CinematicWorkOfArt (val type: TypeOfFilm) {

    open fun nameOfFilm()
    {
        print("Title of a ($type) ")
    }

    abstract fun yearOfRelease() : Int

    abstract fun  shortDescription()

    abstract fun  genre() : String

    enum class TypeOfFilm
    {
        FeatureFilm, DocumentaryCinema, PopularScienceFilm, AnimatedFilm
    }
}
