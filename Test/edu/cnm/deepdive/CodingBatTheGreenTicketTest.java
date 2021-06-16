package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheGreenTicketTest {

  private static int[][] greenParams = {
      {1, 2, 3},
      {2, 2, 2},
      {1, 1, 2},
      {2, 1, 1},
      {1, 2, 1},
      {3, 2, 1},
      {0, 0, 0},
      {2, 0, 0},
      {0, 9, 10},
      {0, 10, 0},
      {9, 9, 9},
      {9, 0, 9}
  };

  private static int[] greenExpected = {0, 20, 10, 10, 10, 0, 20, 10, 0, 10, 20, 10};


  @Test
  void greenTicket() {
    for (int i = 0; i < greenExpected.length; i++) {
      int actual = CodingBatTheGreenTicket
          .greenTicket(greenParams[i][0], greenParams[i][1], greenParams[i][2]);
      Assertions.assertEquals(greenExpected[i], actual);
    }
  }

}