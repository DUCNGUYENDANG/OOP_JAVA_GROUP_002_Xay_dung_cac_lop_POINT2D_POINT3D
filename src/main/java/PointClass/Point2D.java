package PointClass;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String getXY(){
        float[]arr = new float[2];
        arr[0] = getX();
        arr[1] = getY();
        String result ="{ ";
        for (float x: arr) {
            result += x + " ";
        }
        result +=" }";
        return result;
    }
    public String toString(){
        return "POINT 2D has:"
                + "\n  - x: "+getX()
                + "\n  - y: "+getY()
                + "\n  -(x;y)= "+getXY();
    }
}
