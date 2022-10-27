package KotlinClassExamples_DataEnumSealed

import KotlinClassExamples_DataEnumSealed.Figure
import KotlinClassExamples_DataEnumSealed.Shape

fun main(){

    val fig1 = Figure(2,5)
    val fig2 = Figure(5,12)
    val fig3 = Figure(11,4)
    val fig4 = Figure(7,9)

    val figuresList = listOf(fig1,fig2,fig3,fig4)

    var sum = 0

    figuresList.forEach(){
        sum += it.area
    }

    println("Total sum of area ${figuresList.size} figures $sum\n*****************")

    val shape1 = Shape.Rectangle(2,3)
    val shape2 = Shape.Rectangle(6,7)
    val shape3 = Shape.Rectangle(54,2)
    val shape4 = Shape.Line(34)
    val shape5 = Shape.Oval(65,69)
    val shape6 = Shape.Line(5)
    val shape7 = Shape.Parallelepiped(7,13,21)
    val shape8 = Shape.Rectangle(12,36)
    val shape9 = Shape.Parallelepiped(11,12,2001)
    val shape10 = Shape.Oval(4,44)
    val shape11 = Shape.Rectangle(11,12)

    val shapesMutList = mutableListOf(shape1,shape2,shape3,shape4,shape5,shape6,shape7,shape8,shape9,shape10,shape11)

    var rectangles = shapesMutList.filterIsInstance<Shape.Rectangle>().count()
    var parallelepipeds = shapesMutList.filterIsInstance<Shape.Parallelepiped>().count()
    var ovals = shapesMutList.filterIsInstance<Shape.Oval>().count()
    var lines = shapesMutList.filterIsInstance<Shape.Line>().count()

    println("rectangles = $rectangles")
    println("parallelepipeds = $parallelepipeds")
    println("ovals = $ovals")
    println("lines = $lines\n*****************")

    rectangles = 0
    parallelepipeds = 0
    ovals = 0
    lines = 0

    shapesMutList.forEach {
        when(it) {
            is Shape.Line -> lines++
            is Shape.Oval -> ovals++
            is Shape.Rectangle -> rectangles++
        }
    }

    println("rectangles = $rectangles")
    //println("parallelepipeds = $parallelepipeds")
    println("ovals = $ovals")
    println("lines = $lines\n*****************")
}
