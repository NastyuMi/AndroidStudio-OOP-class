package KotlinClassExamples_DataEnumSealed

data class Figure(val width : Int, val height : Int){

    val area : Int
    get() = this.width * this.height

}
