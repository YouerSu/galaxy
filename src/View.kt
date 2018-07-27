import java.awt.Dimension
import java.awt.Graphics
import javax.swing.JPanel

val GRID_SIZE = 16

class View(val galaxy: Galaxy): JPanel() {

    override fun paint(g: Graphics) {
        super.paint(g)
        for (x in 0 until galaxy.height)
            for (y in 0 until galaxy.width) {
                galaxy.getResource(x, y)?.let { it.draw(g, x * GRID_SIZE, y * GRID_SIZE, GRID_SIZE) }
                galaxy.getResource(x,y).proceed(galaxy.getNeighbour(x,y))
            }
    }


    override fun getPreferredSize(): Dimension {
        return Dimension(galaxy.width * GRID_SIZE + 1, galaxy.height * GRID_SIZE + 1)
    }

}