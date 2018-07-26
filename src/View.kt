import java.awt.Graphics
import javax.swing.JPanel

val GRID_SIZE = 16

class View(val galaxy: Galaxy): JPanel() {

    override fun paint(g: Graphics?) {
        super.paint(g)
        for (x in 0 until galaxy.width)
            for (y in 0 until galaxy.height)
                g?.let { galaxy.getGrid(x,y).draw(it,x*GRID_SIZE,y*GRID_SIZE,GRID_SIZE) }
    }
}