import java.awt.Color
import java.awt.Graphics

var color = 0

class Resource(var cells:MutableList<Cell> = mutableListOf()): Grid{

    var count = 0
    var food = 100

    override fun draw(g: Graphics, x:Int, y:Int, size:Int) {
        when{
            food>80 -> g.color =Color.GREEN
            food>40 -> g.color = Color.YELLOW
            else -> g.color = Color.RED
        }
        g.fillRect(x,y,size,size)
        for (cell in cells)
            cell.draw(g,x,y,size)
    }

    fun newCell(grids: Array<Grid>){
        for (grid in grids) {
            if (grid is Resource && grid.food < 80) return
        }
        cells.add(Cell(Color(0,0,0,color++)))
    }

}