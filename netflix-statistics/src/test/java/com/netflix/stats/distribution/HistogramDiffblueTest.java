package com.netflix.stats.distribution;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class HistogramDiffblueTest {
  /**
   * Test {@link Histogram#Histogram(double[])}.
   *
   * <p>Method under test: {@link Histogram#Histogram(double[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void Histogram.<init>(double[])"})
  public void testNewHistogram() {
    // Arrange and Act
    Histogram actualHistogram = new Histogram(new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertEquals(0.0d, actualHistogram.getMaximum(), 0.0);
    assertEquals(0.0d, actualHistogram.getMean(), 0.0);
    assertEquals(0.0d, actualHistogram.getMinimum(), 0.0);
    assertEquals(0.0d, actualHistogram.getStdDev(), 0.0);
    assertEquals(0.0d, actualHistogram.getVariance(), 0.0);
    assertEquals(0.0d, actualHistogram.getMedian(), 0.0);
    assertEquals(0L, actualHistogram.getNumValues());
    assertEquals(5, actualHistogram.getNumBuckets());
    assertArrayEquals(
        new double[] {10.0d, 1.0d, 10.0d, 1.0d, Double.MAX_VALUE},
        actualHistogram.getBucketMaximums(),
        0.0);
    assertArrayEquals(
        new double[] {Double.MIN_VALUE, 10.0d, 1.0d, 10.0d, 1.0d},
        actualHistogram.getBucketMinimums(),
        0.0);
    assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L}, actualHistogram.getBucketCounts());
  }

  /**
   * Test {@link Histogram#Histogram(double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return NumBuckets is two.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#Histogram(double, double, double)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void Histogram.<init>(double, double, double)"})
  public void testNewHistogram_whenTen_thenReturnNumBucketsIsTwo() {
    // Arrange and Act
    Histogram actualHistogram = new Histogram(10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(2, actualHistogram.getNumBuckets());
    assertArrayEquals(
        new double[] {10.0d, Double.MAX_VALUE}, actualHistogram.getBucketMaximums(), 0.0);
    assertArrayEquals(
        new double[] {Double.MIN_VALUE, 10.0d}, actualHistogram.getBucketMinimums(), 0.0);
    assertArrayEquals(new long[] {0L, 0L}, actualHistogram.getBucketCounts());
  }

  /**
   * Test {@link Histogram#Histogram(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return NumBuckets is three.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#Histogram(double, double, double)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void Histogram.<init>(double, double, double)"})
  public void testNewHistogram_whenZero_thenReturnNumBucketsIsThree() {
    // Arrange and Act
    Histogram actualHistogram = new Histogram(0.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(3, actualHistogram.getNumBuckets());
    assertArrayEquals(
        new double[] {0.0d, 10.0d, Double.MAX_VALUE}, actualHistogram.getBucketMaximums(), 0.0);
    assertArrayEquals(
        new double[] {Double.MIN_VALUE, 0.0d, 10.0d}, actualHistogram.getBucketMinimums(), 0.0);
    assertArrayEquals(new long[] {0L, 0L, 0L}, actualHistogram.getBucketCounts());
  }

  /**
   * Test {@link Histogram#noteValue(double)}.
   *
   * <ul>
   *   <li>Then {@link Histogram#Histogram(double, double, double)} with min is ten and max is ten
   *       and step is ten Maximum is {@link Double#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#noteValue(double)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void Histogram.noteValue(double)"})
  public void testNoteValue_thenHistogramWithMinIsTenAndMaxIsTenAndStepIsTenMaximumIsMax_value() {
    // Arrange
    Histogram histogram = new Histogram(10.0d, 10.0d, 10.0d);

    // Act
    histogram.noteValue(Double.MAX_VALUE);

    // Assert
    assertEquals(Double.MAX_VALUE, histogram.getMaximum(), 0.0);
    assertEquals(Double.MAX_VALUE, histogram.getMean(), 0.0);
    assertEquals(Double.MAX_VALUE, histogram.getMinimum(), 0.0);
    assertEquals(Double.MAX_VALUE, histogram.getMedian(), 0.0);
    assertArrayEquals(new double[] {10.0d, Double.MAX_VALUE}, histogram.getBucketMaximums(), 0.0);
    assertArrayEquals(new long[] {0L, 1L}, histogram.getBucketCounts());
  }

  /**
   * Test {@link Histogram#noteValue(double)}.
   *
   * <ul>
   *   <li>Then {@link Histogram#Histogram(double, double, double)} with min is ten and max is ten
   *       and step is ten Maximum is ten.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#noteValue(double)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void Histogram.noteValue(double)"})
  public void testNoteValue_thenHistogramWithMinIsTenAndMaxIsTenAndStepIsTenMaximumIsTen() {
    // Arrange
    Histogram histogram = new Histogram(10.0d, 10.0d, 10.0d);

    // Act
    histogram.noteValue(10.0d);

    // Assert
    assertEquals(10.0d, histogram.getMaximum(), 0.0);
    assertEquals(10.0d, histogram.getMean(), 0.0);
    assertEquals(10.0d, histogram.getMinimum(), 0.0);
    assertEquals(10.0d, histogram.getMedian(), 0.0);
    assertArrayEquals(new double[] {10.0d, 10.0d}, histogram.getBucketMaximums(), 0.0);
    assertArrayEquals(new long[] {0L, 1L}, histogram.getBucketCounts());
  }

  /**
   * Test {@link Histogram#getNumBuckets()}.
   *
   * <p>Method under test: {@link Histogram#getNumBuckets()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int Histogram.getNumBuckets()"})
  public void testGetNumBuckets() {
    // Arrange, Act and Assert
    assertEquals(2, new Histogram(10.0d, 10.0d, 10.0d).getNumBuckets());
  }

  /**
   * Test {@link Histogram#getBucketCount(int)}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#getBucketCount(int)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long Histogram.getBucketCount(int)"})
  public void testGetBucketCount_thenReturnZero() {
    // Arrange
    Histogram histogram = new Histogram(new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Act and Assert
    assertEquals(0L, histogram.getBucketCount(3));
  }

  /**
   * Test {@link Histogram#getBucketMinimum(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#getBucketMinimum(int)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double Histogram.getBucketMinimum(int)"})
  public void testGetBucketMinimum_whenOne_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new Histogram(10.0d, 10.0d, 10.0d).getBucketMinimum(1), 0.0);
  }

  /**
   * Test {@link Histogram#getBucketMinimum(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#getBucketMinimum(int)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double Histogram.getBucketMinimum(int)"})
  public void testGetBucketMinimum_whenZero_thenReturnMin_value() {
    // Arrange, Act and Assert
    assertEquals(Double.MIN_VALUE, new Histogram(10.0d, 10.0d, 10.0d).getBucketMinimum(0), 0.0);
  }

  /**
   * Test {@link Histogram#getBucketMaximum(int)}.
   *
   * <ul>
   *   <li>Then return {@link Double#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#getBucketMaximum(int)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double Histogram.getBucketMaximum(int)"})
  public void testGetBucketMaximum_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertEquals(Double.MAX_VALUE, new Histogram(10.0d, 10.0d, 10.0d).getBucketMaximum(1), 0.0);
  }

  /**
   * Test {@link Histogram#getBucketMaximum(int)}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link Histogram#getBucketMaximum(int)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double Histogram.getBucketMaximum(int)"})
  public void testGetBucketMaximum_thenReturnTen() {
    // Arrange
    Histogram histogram =
        new Histogram(new double[] {Double.MAX_VALUE, 10.0d, Double.MAX_VALUE, 10.0d});

    // Act and Assert
    assertEquals(10.0d, histogram.getBucketMaximum(1), 0.0);
  }

  /**
   * Test {@link Histogram#getBucketCounts()}.
   *
   * <p>Method under test: {@link Histogram#getBucketCounts()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] Histogram.getBucketCounts()"})
  public void testGetBucketCounts() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[] {0L, 0L}, new Histogram(10.0d, 10.0d, 10.0d).getBucketCounts());
  }

  /**
   * Test {@link Histogram#getBucketMinimums()}.
   *
   * <p>Method under test: {@link Histogram#getBucketMinimums()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] Histogram.getBucketMinimums()"})
  public void testGetBucketMinimums() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {Double.MIN_VALUE, 10.0d},
        new Histogram(10.0d, 10.0d, 10.0d).getBucketMinimums(),
        0.0);
  }

  /**
   * Test {@link Histogram#getBucketMaximums()}.
   *
   * <p>Method under test: {@link Histogram#getBucketMaximums()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] Histogram.getBucketMaximums()"})
  public void testGetBucketMaximums() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {10.0d, Double.MAX_VALUE},
        new Histogram(10.0d, 10.0d, 10.0d).getBucketMaximums(),
        0.0);
  }

  /**
   * Test {@link Histogram#getMedian()}.
   *
   * <p>Method under test: {@link Histogram#getMedian()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double Histogram.getMedian()"})
  public void testGetMedian() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new Histogram(10.0d, 10.0d, 10.0d).getMedian(), 0.0);
  }

  /**
   * Test {@link Histogram#getPercentile(int)}.
   *
   * <p>Method under test: {@link Histogram#getPercentile(int)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double Histogram.getPercentile(int)"})
  public void testGetPercentile() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new Histogram(10.0d, 10.0d, 10.0d).getPercentile(1), 0.0);
  }

  /**
   * Test {@link Histogram#getPercentileRank(double)}.
   *
   * <p>Method under test: {@link Histogram#getPercentileRank(double)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long Histogram.getPercentileRank(double)"})
  public void testGetPercentileRank() {
    // Arrange, Act and Assert
    assertEquals(50L, new Histogram(10.0d, 10.0d, 10.0d).getPercentileRank(10.0d));
  }
}
