public class HW2_n3_25 {
    public static void main(String[] args) {
        Dist dist = new Dist();
        System.out.println("Distance from point to point: ");
        System.out.println(dist.toPoint(0, 0,1,1) + "\n");

        System.out.println("Distance from point toline: ");
        System.out.println(dist.toLine(3, 1, 1,0,2) + "\n");

        System.out.println("Distance from point to line crossing: ");
        System.out.println(dist.toLineCrossing(1, 1, 1, 2,4, 2,1,0));

    }
}
