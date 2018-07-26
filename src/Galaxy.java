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

}
