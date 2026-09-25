public class HollowSquare extends Square implements Hollow {
    private double bWidth;

    public HollowSquare(double x, double y, double side, double bWidth) {
        super(x, y, side);
        this.bWidth = bWidth;
    }

    @Override
    public double boundaryWidth() {
        return bWidth;
    }

    @Override
    public double perimeter() {
        double inner = getSide() - 2 * bWidth;
        return 4 * getSide() + 4 * inner;
    }

    @Override
    public double area() {
        double inner = getSide() - 2 * bWidth;
        return getSide() * getSide() - inner * inner;
    }
}
