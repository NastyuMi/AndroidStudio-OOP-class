package KotlinClassExamples_DataEnumSealed

sealed class Shape{

    open class Rectangle(weight : Int, length : Int) : Shape()
    class Parallelepiped(weight : Int, length : Int, height : Int) : Rectangle(weight, length)
    class Oval(r : Int, R : Int) : Shape()
    class Line(len : Int) : Shape()

}
