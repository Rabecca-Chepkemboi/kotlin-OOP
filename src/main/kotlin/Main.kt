import org.w3c.dom.css.CSSStyleDeclaration
import java.util.concurrent.SubmissionPublisher

fun main() {
    var benz = car("Mercedes Benz", "E300", "KCC 153T", 0)
    println(benz.model)
    benz.start()
    println(benz.speed)
    benz.accelerate(45)
    benz.accelerate(72)
    println(benz.speed)

    benz.deccelerate(60)
    println(benz.speed)

    benz.hoop()

    benz.stop()
    println(benz.speed)

    val mybook = Book("Born a Crime", "Trever Noah", 300, "Jenherk")
    println(mybook.author)
    println(mybook.title)

    println(calculateStats(arrayOf(12, 43, 24, 12, 42, 11,31)))


}
class car(var make: String, var model: String, var registration: String, var speed: Int){
    fun start(){
        println("Vroom vroom")
    }
    fun accelerate(acceleration: Int): Int{
        speed += acceleration
        return speed
    }
    fun deccelerate(declaration: Int): Int{
        speed -= declaration
        return speed
    }
    fun hoop(){
        println("Piiip piip")
    }
    fun stop(){
        speed -=speed
    }
}
data class Book(var title: String, var author: String, var pages :Int, var publisher: String)
data class AgeStats(var maxAge: Int, var minAge: Int, var avgAge:Double)
fun calculateStats(ages:Array<Int>):AgeStats{
    val min = ages.min()
    val max = ages.max()
    val avg = ages.average()
    val stats = AgeStats(max, min, avg)
    return stats
}
