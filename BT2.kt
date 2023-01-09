/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun Triangle(a:Int, b:Int, c:Int)
{
    val StringArray:MutableList<String> = mutableListOf()
    
    // 1
    if (a > 0 && b > 0 && c > 0 )
    	{
           if(a+b>c && b+c>a && c+a>b)
           println("valid Triangle")
           else
            println("invalid Triangle")
        }
        else
    println("No Triangle")
    
    
}
fun main() {
    Triangle( 1, 4, 4)
    Triangle( 1, 3, 4)
}
