import java.util.concurrent.TimeUnit
import javax.swing.JFrame
import javax.swing.JLabel


fun main(args:Array<String>) {
    val jFrame = JFrame("YouerSu's World")
    val jLabel = JLabel("LALALA")
    jFrame.add(jLabel)
    jFrame.setSize(100, 100)
    jFrame.isVisible = true
    TimeUnit.SECONDS.sleep(1)
    jLabel.text = "00"
}

