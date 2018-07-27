import java.awt.Color
import java.awt.Graphics

var r = 0
var g = 0
var b = 0
var m = 1

class Resource(var cells:MutableList<Cell> = mutableListOf()): Grid{

    var count = 0
    var food = 100

    override fun draw(g: Graphics, x:Int, y:Int, size:Int) {
        g.color = Color.BLACK
        g.fillRect(x,y,size,size)
        for (cell in cells)
            cell.draw(g,x,y,size)
        count++
    }

    fun newCell(grids: Array<Resource>){
        for (grid in grids) {
            if (Math.random()*grid.food < 80) return
        }
        cells.add(Cell(Color(r,g,b)))
        if (m>0)
            when{
                b ==255 -> m=-m
                g ==255 -> b+=m
                r ==255 -> g+=m
                else -> r+=m
            }
        else
            when{
                b ==0 -> m=-m
                g ==0 -> b+=m
                r ==0 -> g+=m
                else -> r+=m
            }
    }


    fun proceed(resources: Array<Resource>){
        var index = 0
        while (index<cells.size) {
            with(cells[index]) {
                evolution()
                if (grow(this@Resource)||
                    move(resources, this@Resource)||
                    fight(this@Resource))
                index++
            }
            index++
        }
        if (count>=10) {
            food += food/8
            count=0
        }
        newCell(resources)
    }




}