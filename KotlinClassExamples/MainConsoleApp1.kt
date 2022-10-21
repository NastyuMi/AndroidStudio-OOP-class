package com.KotlinClassExamples

import com.KotlinClassExamples.CinematicWorkOfArt.TypeOfFilm
import com.KotlinClassExamples.FilmMain
import com.KotlinClassExamples.SerialMain

fun main(){

    val Friends = SerialMain(TypeOfFilm.FeatureFilm,"Friends",
        1994,2004,10,236,"situation comedy(sitcom)")
    val Marilyn = FilmMain(TypeOfFilm.DocumentaryCinema,"The Mystery of Marilyn Monroe: The Unheard Tapes",
        2022,"documentary")
    val Peppa = SerialMain(TypeOfFilm.AnimatedFilm,"Peppa Pig",
        2004,2022,9,368,"cartoon")
    val HB = SerialMain(TypeOfFilm.PopularScienceFilm,"BBC:Inside the Human Body",
        2011,2011,1,4,"documentary")
    val Me = FilmMain(TypeOfFilm.FeatureFilm,"Me Before You",2016,"melodrama")

    val MovieList = listOf(Friends,Marilyn,Peppa,HB,Me)
    val FilmList = listOf(Marilyn,Me)
    var x = FilmList.size

    MovieList.forEach(){
        it.Trailer()
    }

    while (x != 0){
        FilmList[x-1].AboutFilm()
        x--
    }

}

