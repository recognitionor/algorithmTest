import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.temporal.ChronoUnit
import java.util.*
import kotlin.math.abs


fun main(args: Array<String>) {

    val sdf = SimpleDateFormat("yyyy mm dd HH mm ss")
    var resultdate = Date()

    println(sdf.format(resultdate))

    val ldt = LocalDateTime.ofInstant(resultdate.toInstant(), ZoneId.systemDefault())

    println(Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant()))
    val test = ldt.plusDays(3).minusMinutes(30).minusHours(4).plusSeconds(31)
    val out = Date.from(test.atZone(ZoneId.systemDefault()).toInstant())

    val testSec = LocalDateTime.now().until(test, ChronoUnit.SECONDS)
    val day = testSec / (60 * 60 * 24);
    val hour = (testSec % (60 * 60 * 24)) / (60 * 60);
    val min = (testSec % (60 * 60)) / (60);
    val sec = testSec % (60);
    println("day $day hour $hour min $min sec $sec")

}
