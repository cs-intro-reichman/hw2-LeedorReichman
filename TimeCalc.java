public class TimeCalc {
    public static void main(String[] args) {
        // Extract hours and minutes from the input string "HH:MM"
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addedMinutes = Integer.parseInt(args[1]);

        // Calculate total minutes
        int totalMinutes = hours * 60 + minutes + addedMinutes;

        int totalHours = (totalMinutes / 60) % 24;
        int remainingMinutes = totalMinutes % 60;

        System.out.println("" + totalHours + ":" + remainingMinutes);
    }
}
