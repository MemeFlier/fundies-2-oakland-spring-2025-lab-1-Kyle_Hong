public class Vector3D {
    private double[] vector = new double[3];
    public Vector3D(double x, double y, double z) {
        vector[0] = x;
        vector[1] = y;
        vector[2] = z;
    }

    public Vector3D() {}
    public Vector3D(double[] vector) {
        for(int i = 0; i < 3; i++) {
            this.vector[i] = vector[i];
        }
    }

    public double getX(){
        return vector[0];
    }

    public double getY(){
        return vector[1];
    }

    public double getZ(){
        return vector[2];
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", vector[0], vector[1], vector[2]);
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
    }

    public Vector3D normalize() {
        double mag = getMagnitude();
        if(mag == 0){
            throw(new IllegalStateException("Magnitude is 0"));
        }
        double[] t = new double[3];
        for (int i = 0; i < 3; i++) {
            t[i] = vector[i] / mag;
        }
        return new Vector3D(t);
    }

    public Vector3D add(Vector3D v) {
        return new Vector3D(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ());
    }

    public Vector3D multiply(double d) {
        return new Vector3D(getX() * d, getY() * d, getZ() * d);
    }

    public double dotProduct(Vector3D v) {
        return getX() * v.getX() + getY() * v.getY() + getZ() * v.getZ();
    }

    public double angleBetween(Vector3D v) {
        if(getMagnitude() == 0 || v.getMagnitude() == 0){
            throw new IllegalStateException("Magnitude is 0");
        }
        return Math.acos(dotProduct(v) / (getMagnitude() * v.getMagnitude())) * 180.0 / Math.PI;
    }

    public Vector3D crossProduct(Vector3D v) {
        return new Vector3D(getY() * v.getZ() - getZ() * v.getY(), getZ() * v.getX()- getX() * v.getZ(), getX() * v.getY() - getY() * v.getX());
    }



}
