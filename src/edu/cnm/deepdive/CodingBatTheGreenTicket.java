package edu.cnm.deepdive;

/*

You have a green lottery ticket, with ints a, b, and c on it.
If the numbers are all different from each other, the result is 0.
If all of the numbers are the same, the result is 20.
If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */

public class CodingBatTheGreenTicket {

  public static void main(String[] args) {

    System.out.printf("with the numbers %d, %d and %d the outcome will be " + greenTicket(1, 2, 3)
    + ".\n", 1, 2, 3);
    System.out.printf("with the numbers %d, %d and %d the outcome will be " + greenTicket(2, 2, 2)
        + ".\n", 2, 2, 2);
    System.out.printf("with the numbers %d, %d and %d the outcome will be " + greenTicket(1, 1, 2)
        + ".\n", 1, 1, 2);

  }

  public static int greenTicket(int a, int b, int c) {
    if (a != b && a != c && b != c) {
      return 0;
    } else if (a == b && b == c) {
      return 20;
    } else {
      return 10;
    }
  }
}
