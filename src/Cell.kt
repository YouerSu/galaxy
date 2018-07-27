import java.awt.Color
import java.awt.Graphics

class Cell (val color: Color): Grid{

    var level = 3

    override fun draw(g: Graphics, x: Int, y: Int, size: Int) {
        g.color = color
        g.fillRect(x,y,size/level,size/level)
    }

    fun move(grids:Array<Resource>,me: Resource):Boolean{
        for (grid in grids) {
            if (grid.food-level*10 > me.food) {
                grid.cells.add(this)
                return true
            }
        }
        return false
    }



}
