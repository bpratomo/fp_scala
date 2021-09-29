
package ammonite
package $file
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit,
  scalaVersion
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.compiler.CompilerExtensions.{
  CompilerInterpAPIExtensions,
  CompilerReplAPIExtensions
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.compiler.tools.{
  desugar,
  source
}
import _root_.mainargs.{
  arg,
  main
}
import _root_.ammonite.repl.tools.Util.{
  PathRead
}


object ex_2_2{
/*<script>*/import scala.annotation.tailrec
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

/*<amm>*/val res_8 = /*</amm>*/Console.println(checkAscending1)
/*<amm>*/val res_9 = /*</amm>*/Console.println(checkAscending2)/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "ex_2_2"
  /*</generated>*/
}
