public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = peg.getWidth() * Math.sqrt(2) / 2;
        return result;
    }
}
