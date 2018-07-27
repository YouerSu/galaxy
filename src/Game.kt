import java.util.concurrent.TimeUnit
import javax.swing.JFrame

fun main(args:Array<String>) {
    val galaxy = Galaxy(50,50)
    val view = View(galaxy)
    val frame = JFrame()
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.title = "Galaxy"
    frame.add(view)
    frame.pack()
    frame.isVisible = true
    while (true) {
        TimeUnit.MILLISECONDS.sleep(100)
        frame.repaint()
    }
}

