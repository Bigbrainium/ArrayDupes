import java.util.Scanner;

public class ArrayDupes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        int [] dataPoints = new int[10];
        int counter = 0;
        int current = 0;

        // Sets the random values in the array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int)((Math.random() * 10) + 1);
        }

        // Prints out the random values with a spacer between them
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        // Counts how many instances the user number appears in a random set
        for (int i = 0; i < dataPoints.length; i++) {
            counter = 0;
            for (int j = 0; j < 10; j++) {
                if (dataPoints[j] == dataPoints[i]) {
                    counter++;
                    if (counter > 1) {
                        current = dataPoints[j];
                    }
                }
            }

            insert(dataPoints, current);
            if (counter > 1 && current != 0) {
                System.out.println(" ");
                System.out.println("The number " + current + " is found " + counter + " time(s).");
            }
        }
    }

    public static int [] insert(int [] arr, int element) {
        int [] num = arr;
        for (int i = 0; i < num.length; i++) {
            if (arr[i] == element) {
                arr[i] = 0;
            }
        }
        return num;
    }
}