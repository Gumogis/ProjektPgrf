package Rasterize;

import Models.Polygon;

public class PolygonRasterizer {
    private LineRasterizer lineRasterizer;

    public PolygonRasterizer(LineRasterizer lineRasterizer) {
        this.lineRasterizer = lineRasterizer;
    }
    public void rasterize(Polygon polygon) {
        // podmínka, jestli size < 3
        if(polygon.size() < 3)
            return;
        //
        // cyklus, který projde points
        // {
        // načtu indexa = i
        // načtu indexb = i + 1
        // pokud indexB = size -> indexB = 0
        // načtu indexA
        // načtu indexB
        // line rasterizer
        // }
    }

    public void setLineRasterizer(LineRasterizer lineRasterizer) {
        this.lineRasterizer = lineRasterizer;
    }
}
