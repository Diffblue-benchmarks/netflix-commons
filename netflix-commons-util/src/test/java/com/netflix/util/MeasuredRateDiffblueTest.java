package com.netflix.util;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MeasuredRateDiffblueTest {
  /**
   * Test {@link MeasuredRate#MeasuredRate(long)}.
   *
   * <p>Method under test: {@link MeasuredRate#MeasuredRate(long)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void MeasuredRate.<init>(long)"})
  public void testNewMeasuredRate() {
    // Arrange and Act
    MeasuredRate actualMeasuredRate = new MeasuredRate(42L);

    // Assert
    assertEquals(0L, actualMeasuredRate.getCount());
    assertEquals(0L, actualMeasuredRate.getCurrentCount());
  }

  /**
   * Test {@link MeasuredRate#getCount()}.
   *
   * <ul>
   *   <li>Given {@link MeasuredRate#MeasuredRate(long)} with sampleInterval is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MeasuredRate#getCount()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long MeasuredRate.getCount()"})
  public void testGetCount_givenMeasuredRateWithSampleIntervalIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(0L, new MeasuredRate(42L).getCount());
  }

  /**
   * Test {@link MeasuredRate#getCount()}.
   *
   * <ul>
   *   <li>Given {@link MeasuredRate#MeasuredRate(long)} with sampleInterval is minus one.
   * </ul>
   *
   * <p>Method under test: {@link MeasuredRate#getCount()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long MeasuredRate.getCount()"})
  public void testGetCount_givenMeasuredRateWithSampleIntervalIsMinusOne() {
    // Arrange, Act and Assert
    assertEquals(0L, new MeasuredRate(-1L).getCount());
  }

  /**
   * Test {@link MeasuredRate#getCurrentCount()}.
   *
   * <ul>
   *   <li>Given {@link MeasuredRate#MeasuredRate(long)} with sampleInterval is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link MeasuredRate#getCurrentCount()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long MeasuredRate.getCurrentCount()"})
  public void testGetCurrentCount_givenMeasuredRateWithSampleIntervalIsFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(0L, new MeasuredRate(42L).getCurrentCount());
  }

  /**
   * Test {@link MeasuredRate#getCurrentCount()}.
   *
   * <ul>
   *   <li>Given {@link MeasuredRate#MeasuredRate(long)} with sampleInterval is minus one.
   * </ul>
   *
   * <p>Method under test: {@link MeasuredRate#getCurrentCount()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long MeasuredRate.getCurrentCount()"})
  public void testGetCurrentCount_givenMeasuredRateWithSampleIntervalIsMinusOne() {
    // Arrange, Act and Assert
    assertEquals(0L, new MeasuredRate(-1L).getCurrentCount());
  }

  /**
   * Test {@link MeasuredRate#toString()}.
   *
   * <p>Method under test: {@link MeasuredRate#toString()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String MeasuredRate.toString()"})
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("count:0currentCount:0", new MeasuredRate(42L).toString());
  }
}
