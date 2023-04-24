public class App {
    public static void main(String[] args) throws Exception {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
        // hole.fits(small_sqpeg); // Won't compile. ( incompatible types: SquarePeg
        // cannot be converted to RoundPeg )

        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);

        if (hole.fits(small_sqpeg_adapter)) {
            System.out.println("Square peg w5 fits round hole r5.");
        }

        if (!hole.fits(large_sqpeg_adapter)) {
            System.out.println("Square peg w10 does not fit into round hole r5.");
        }

    }
}
