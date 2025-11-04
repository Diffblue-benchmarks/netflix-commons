package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TimeRangeValuePredicateDiffblueTest {
  /**
   * Method under test:
   * {@link TimeRangeValuePredicate#TimeRangeValuePredicate(String, String, String)}
   */
  @Test
  public void testNewTimeRangeValuePredicate() {
    // Arrange and Act
    TimeRangeValuePredicate actualTimeRangeValuePredicate = new TimeRangeValuePredicate("42", "42", "42");

    // Assert
    assertEquals("42", actualTimeRangeValuePredicate.getEnd());
    assertEquals("42", actualTimeRangeValuePredicate.getStart());
    assertEquals("42", actualTimeRangeValuePredicate.getTimeFormat());
  }
}
