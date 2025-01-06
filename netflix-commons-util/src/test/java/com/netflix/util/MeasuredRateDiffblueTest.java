package com.netflix.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MeasuredRateDiffblueTest {
  /**
   * Test {@link MeasuredRate#MeasuredRate(long)}.
   * <p>
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
   * Test {@link MeasuredRate#getCount()}.
   * <ul>
   *   <li>Given {@link MeasuredRate#MeasuredRate(long)} with sampleInterval is
   * {@code -84894203}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MeasuredRate#getCount()}
   */
  @Test
  public void testGetCount_givenMeasuredRateWithSampleIntervalIs84894203() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MeasuredRate(-84894203L)).getCount());
  }

  /**
   * Test {@link MeasuredRate#getCount()}.
   * <ul>
   *   <li>Given {@link MeasuredRate#MeasuredRate(long)} with sampleInterval is
   * forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MeasuredRate#getCount()}
   */
  @Test
  public void testGetCount_givenMeasuredRateWithSampleIntervalIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MeasuredRate(42L)).getCount());
  }

  /**
   * Test {@link MeasuredRate#getCurrentCount()}.
   * <ul>
   *   <li>Given {@link MeasuredRate#MeasuredRate(long)} with sampleInterval is
   * {@code -84893071}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MeasuredRate#getCurrentCount()}
   */
  @Test
  public void testGetCurrentCount_givenMeasuredRateWithSampleIntervalIs84893071() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MeasuredRate(-84893071L)).getCurrentCount());
  }

  /**
   * Test {@link MeasuredRate#getCurrentCount()}.
   * <ul>
   *   <li>Given {@link MeasuredRate#MeasuredRate(long)} with sampleInterval is
   * forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MeasuredRate#getCurrentCount()}
   */
  @Test
  public void testGetCurrentCount_givenMeasuredRateWithSampleIntervalIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(0L, (new MeasuredRate(42L)).getCurrentCount());
  }

  /**
   * Test {@link MeasuredRate#toString()}.
   * <p>
   * Method under test: {@link MeasuredRate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("count:0currentCount:0", (new MeasuredRate(42L)).toString());
  }
}
