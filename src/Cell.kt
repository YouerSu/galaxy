import java.awt.Color
import java.awt.Graphics

class Cell (val color: Color): Grid{

    override fun draw(g: Graphics, x: Int, y: Int, size: Int) {
        g.color = color
        g.fillRect(x,x,y,size)
    }

}
