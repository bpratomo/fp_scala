import scala.annotation.tailrec
def isSorted[A](arr:Array[A], ordered: (A,A)=> Boolean): Boolean = {
    @tailrec
    def go(i:Int):Boolean = {
        if (i == arr.length -1) true
        else if (ordered(arr(i),arr(i+1))) go(i+1)
        else false

    }

    go(0)
}


val testArr1 = Array(1,2,3,4,5,6)
val testArr2 = Array(6,5,4,3,2,1)

def isAscending(a:Int, b:Int):Boolean = {
    if(b >= a) true 
    else false
}

def isDescending(a:Int, b:Int):Boolean = {
    if(b <= a) true 
    else false
}

val checkAscending1 = isSorted(testArr1,isAscending)
val checkAscending2 = isSorted(testArr2,isAscending)

Console.println(checkAscending1)
Console.println(checkAscending2)