// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

	    int N = Integer.parseInt(args[0]);
	    String mode = args[1];
	    boolean verbose = mode.equals("v");

	    for (int seed = 1; seed <= N; seed++) {
			int x = seed;
			int count = 0;

			if (verbose) {
				// Print the sequence using simple prints (no StringBuilder)
				System.out.print(x + " ");
				count = 1;
				if (seed == 1) {
					// For seed 1 we still advance at least once
					do {
						if (x % 2 == 0) x = x / 2;
						else x = 3 * x + 1;
						System.out.print(x + " ");
						count++;
					} while (x != 1);
				} else {
					while (x != 1) {
						if (x % 2 == 0) x = x / 2;
						else x = 3 * x + 1;
						System.out.print(x + " ");
						count++;
					}
				}
				System.out.println("(" + count + ")");
			} else {
				// Concise mode: compute the sequence but don't print values
				count = 1;
				if (seed == 1) {
					do {
						if (x % 2 == 0) x = x / 2;
						else x = 3 * x + 1;
						count++;
					} while (x != 1);
				} else {
					while (x != 1) {
						if (x % 2 == 0) x = x / 2;
						else x = 3 * x + 1;
						count++;
					}
				}
			}
	    }

	    System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
