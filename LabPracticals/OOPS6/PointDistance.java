public class PointDistance{
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2  = new ThreeDPoint(2, 4, 5);
        p2.displayCoordinates();
        System.out.println("The distance of the point from the origin is: "+ThreeDPoint.computeDistance(p1,p2));
        
    }
}
 class ThreeDPoint {
    int x;
    int y;
    int z;
    ThreeDPoint(){
        this.x = 0;
        this.y =0;
        this.z = 0;
    }
ThreeDPoint(int x, int y, int z){
    this.x = x;
    this.y = y;
    this.z = z;
}

void inputCoordinates(){
    System.out.println("Enter the x,y and z coordinates:");
    this.x = scanner.nextInt();
    this.y = scanner.nextInt();
    this.z = scanner.nextInt();
}
public void displayCoordinates() {
    System.out.println("Coordinates: (" + x + ", " + y + ", " + z + ")");
}
public static double computeDistance(ThreeDPoint p1, ThreeDPoint p2) {
    return Math.sqrt(
        Math.pow(p2.x - p1.x, 2) + 
        Math.pow(p2.y - p1.y, 2) + 
        Math.pow(p2.z - p1.z, 2)
    );
}}
