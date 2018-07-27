import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    private int width;
    private int height;
    private Grid[][] galaxy;

    public Galaxy(int width, int height) {
        this.width = width;
        this.height = height;
        galaxy = new Grid[width][height];
        for (int x =0;x<galaxy.length;x++)
            for (int y = 0;y<galaxy[x].length;y++)
                galaxy[x][y]=new Resource();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Grid[][] getGalaxy() {
        return galaxy;
    }

    public Grid getGrid(int weight,int height){
        return galaxy[weight][height];
    }

    public Grid[] getNeighbour(int row, int col) {
        List<Grid> list = new ArrayList();
        for ( int i=-1; i<2; i++ ) {
            for ( int j=-1; j<2; j++ ) {
                int r = row+i;
                int c = col+j;
                if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) ) {
                    list.add(galaxy[r][c]);
                }
            }
        }
        return (Grid[]) list.toArray();
    }

}
