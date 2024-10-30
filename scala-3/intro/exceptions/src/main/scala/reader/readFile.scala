package cl.ravenhill
package reader

import java.io.{File, FileReader, IOException}
import scala.io.Source

def readFile(filePath: String): Unit =
    var source: Option[Source] = None
    try
        val file = File(filePath)
        source = Some(Source.fromFile(file))
        val content = source.get.mkString
        println(s"Contenido del archivo:\n$content")
    catch
        case e: IOException =>
            println(s"Ocurrió un error al leer el archivo: ${e.getMessage}")
    finally
        try
            source.foreach(_.close())
        catch
            case e: IOException =>
                println(s"Error al cerrar el archivo: ${e.getMessage}")
