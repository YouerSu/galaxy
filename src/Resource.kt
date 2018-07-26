import java.awt.Color
import java.awt.Graphics

class Resource: Grid{

    var count = 0
    var food = 100
    var cells = mutableListOf<Cell>()

    override fun draw(g: Graphics, x:Int, y:Int, size:Int) {
        when{
            food>80 -> g.color =Color.GREEN
            food>60 -> g.color = Color.BLUE
            food>40 -> g.color = Color.YELLOW
            else -> g.color = Color.RED
        }
        g.fillRect(x,y,size,size)
        for (cell in cells)
            cell.draw(g,x,y,size)
    }

    fun newCell(){
        cells.add(Cell(Color(0,0,0,0)))
    }

}