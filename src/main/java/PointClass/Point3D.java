package PointClass;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
       super.setX(x);
       super.setX(y);
       this.z = z;
    }
    public String getXYZ(){
        float[]arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        String result ="{ ";
        for (float x: arr) {
            result += x + " ";
        }
        result +=" }";
        return result;
    }

    @Override
    public String toString() {
        return "POINT 3D has:"
                +"\n   - x: "+getX()
                + "\n  - y: "+getY()
                + "\n  - z: "+getZ()
                + "\n  - (x;y;z)= "+getXYZ();
    }
}
