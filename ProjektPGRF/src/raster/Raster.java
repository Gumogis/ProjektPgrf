package raster;

public interface Raster {

    // setPixel
    // getPixel
    // getWidth
    // getHeight
    // clear

    public void setPixel(int x, int y, int value);
    public int getPixel(int x, int y);
    public int getWidth();
    public int getHeight();
    public void clear();
}
