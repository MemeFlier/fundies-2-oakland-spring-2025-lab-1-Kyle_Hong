public class Main {

    public static void main(String[]args){
        Vector3D v = new Vector3D(1.1234, 2.013, 3.14159265358979323846264338);
        Vector3D u = new Vector3D(1, 1, 1);
        System.out.println("x: " + v.getX() + "\ty: " + v.getY() + "\tz: " + v.getZ() + "\n");
        System.out.println("via println: " + v + "\n");
        System.out.println("magnitude: " + v.getMagnitude() + "\n");
        System.out.println("normal: " + v.normalize() + "\n");
        System.out.println("added by " + u + ": " + v.add(u) + "\n");
        System.out.println("multiplied by 10: " + v.multiply(10) + "\n");
        System.out.println("dot product between " + u + " and " + v + ": " + v.dotProduct(u) + "\n");
        System.out.println("angle between " + u + " and " + v + ": " + v.angleBetween(u) + "\n");
        System.out.println("cross product between " + v + " and " + u + ": " + v.crossProduct(u) + "\n");
        System.out.print("trying to find angle between something with mag 0(caught): ");
        try {
            System.out.println(v.angleBetween(new Vector3D()));
        } catch (Exception e) {
            System.out.println(e + "\n");
        }
        System.out.print("trying to find normalized vector with mag 0(caught): ");
        try {
            System.out.println(new Vector3D().normalize());
        } catch (Exception e) {
            System.out.println(e + "\n");
        }
    }
}

