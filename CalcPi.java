// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	    int n = Integer.parseInt(args[0]);
	    double sum = 0.0;
	    for (int k = 0; k < n; k++) {
	        double term = 1.0 / (2 * k + 1);
	        if (k % 2 == 0) {
	            sum += term; // positive
	        } else {
	            sum -= term; // negative
	        }
	    }

	    double approxPi = 4.0 * sum;
	    System.out.println("pi according to Java: " + Math.PI + "\npi, approximated:     " + approxPi);
	}
}
