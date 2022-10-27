package com.KotlinClassExamples

class FilmMain(type: TypeOfFilm, private val name : String, private val Year : Int,
               private val genre : String) : Film(type), Video {
    override fun nameOfFilm() {
        super.nameOfFilm()
        println(name)
    }

    override fun yearOfRelease(): Int = Year

    override fun shortDescription() {
        println("Something inform about movie")
    }

    override fun genre(): String = genre

    override fun aboutFilm() {
        super.aboutFilm()
    }

    override fun trailer() {
        println("watch the trailer '$name'")
    }

    override fun watchTheMovie() {
        println("watch the '$name'")
    }
}