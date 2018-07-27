import java.awt.Color
import java.awt.Graphics

class Cell (val color: Color): Grid{

    var level = 1
    var food = 0

    override fun draw(g: Graphics, x: Int, y: Int, size: Int) {
        g.color = color
        g.fillRect(x,y,level,level)
    }

    fun move(grids:Array<Resource>,me: Resource):Boolean{
        for (grid in grids) {
            if (level>2&&grid.food-level*10 > me.food&&Math.random()>0.8) {
                me.cells.remove(this)
                grid.cells.add(this)
                food-=level*10
                return true
            }
        }
        return false
    }

    fun grow(me:Resource): Boolean{
        if (food<-5){
            me.cells.remove(this)
            me.food-=food
            return true
        }
        if (me.food/8>16-level) {
            food += me.food / 8
            me.food -= me.food / 8
        }
        food-=level
        return false
    }

    fun evolution(){
        if (level<16&&Math.random()>=0.8)
            level+=1
    }

    fun fight(me:Resource):Boolean{
        if (me.cells.size>1){
            for (o in me.cells) {
                if (o.level < level) {
                    me.cells.remove(o)
                    return true
                }
            }
        }
        return false
    }

}
