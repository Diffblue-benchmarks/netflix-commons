package com.netflix.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MeasuredRateDiffblueTest {
  /**
   * Method under test: {@link MeasuredRate#getCount()}
   */
  @Test
  public void testGetCount() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MeasuredRate(42L)).getCount());
    assertEquals(0L, (new MeasuredRate(-1L)).getCount());
  }

  /**
   * Method under test: {@link MeasuredRate#getCurrentCount()}
   */
  @Test
  public void testGetCurrentCount() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MeasuredRate(42L)).getCurrentCount());
    assertEquals(0L, (new MeasuredRate(-1L)).getCurrentCount());
  }

  /**
   * Method under test: {@link MeasuredRate#MeasuredRate(long)}
   */
  @Test
  public void testNewMeasuredRate() {
    // Arrange and Act
    MeasuredRate actualMeasuredRate = new MeasuredRate(42L);

    // Assert
    assertEquals(0L, actualMeasuredRate.getCount());
    assertEquals(0L, actualMeasuredRate.getCurrentCount());
  }

  /**
   * Method under test: {@link MeasuredRate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("count:0currentCount:0", (new MeasuredRate(42L)).toString());
  }
}
