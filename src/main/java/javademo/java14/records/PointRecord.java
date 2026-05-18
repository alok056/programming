package javademo.java14.records;

public record PointRecord(int x, int y) {
    public double distanceFromOrigin() {
        return Math.hypot(x, y);
    }
}
