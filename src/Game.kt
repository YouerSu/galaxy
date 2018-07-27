import java.util.concurrent.TimeUnit
import javax.swing.JFrame

fun main(args:Array<String>) {
    val view = View(Galaxy(100,100))
    val frame = JFrame()
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.title = "Galaxy"
    frame.add(view)
    frame.pack()
    frame.isVisible = true
    while (true) {
        TimeUnit.SECONDS.sleep(1)
        frame.repaint()
    }
}

