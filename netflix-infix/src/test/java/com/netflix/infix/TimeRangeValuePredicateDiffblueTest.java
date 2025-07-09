package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TimeRangeValuePredicateDiffblueTest {
  /**
   * Test {@link TimeRangeValuePredicate#TimeRangeValuePredicate(String, String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return End is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TimeRangeValuePredicate#TimeRangeValuePredicate(String, String,
   * String)}
   */
  @Test
  public void testNewTimeRangeValuePredicate_when42_thenReturnEndIs42() {
    // Arrange and Act
    TimeRangeValuePredicate actualTimeRangeValuePredicate =
        new TimeRangeValuePredicate("42", "42", "42");

    // Assert
    assertEquals("42", actualTimeRangeValuePredicate.getEnd());
    assertEquals("42", actualTimeRangeValuePredicate.getStart());
    assertEquals("42", actualTimeRangeValuePredicate.getTimeFormat());
  }
}
