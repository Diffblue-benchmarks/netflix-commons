package com.netflix.stats.distribution;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HistogramDiffblueTest {
  /**
   * Method under test: {@link Histogram#noteValue(double)}
   */
  @Test
  public void testNoteValue() {
    // Arrange
    Histogram histogram = new Histogram(10.0d, 10.0d, 10.0d);

    // Act
    histogram.noteValue(10.0d);

    // Assert
    assertEquals(10.0d, histogram.getMaximum(), 0.0);
    assertEquals(10.0d, histogram.getMean(), 0.0);
    assertEquals(10.0d, histogram.getMinimum(), 0.0);
    assertEquals(10.0d, histogram.getMedian(), 0.0);
    double[] bucketMaximums = histogram.getBucketMaximums();
    assertEquals(10.0d, bucketMaximums[1], 0.0);
    assertEquals(1L, histogram.getNumValues());
    long[] bucketCounts = histogram.getBucketCounts();
    assertEquals(1L, bucketCounts[1]);
    assertEquals(2, bucketCounts.length);
    assertEquals(2, bucketMaximums.length);
  }

  /**
   * Method under test: {@link Histogram#noteValue(double)}
   */
  @Test
  public void testNoteValue2() {
    // Arrange
    Histogram histogram = new Histogram(10.0d, 10.0d, 10.0d);

    // Act
    histogram.noteValue(Double.MAX_VALUE);

    // Assert
    assertEquals(1L, histogram.getNumValues());
    long[] bucketCounts = histogram.getBucketCounts();
    assertEquals(1L, bucketCounts[1]);
    assertEquals(2, bucketCounts.length);
    double[] bucketMaximums = histogram.getBucketMaximums();
    assertEquals(2, bucketMaximums.length);
    assertEquals(Double.MAX_VALUE, histogram.getMaximum(), 0.0);
    assertEquals(Double.MAX_VALUE, histogram.getMean(), 0.0);
    assertEquals(Double.MAX_VALUE, histogram.getMinimum(), 0.0);
    assertEquals(Double.MAX_VALUE, histogram.getMedian(), 0.0);
    assertEquals(Double.MAX_VALUE, bucketMaximums[1], 0.0);
  }

  /**
   * Method under test: {@link Histogram#getNumBuckets()}
   */
  @Test
  public void testGetNumBuckets() {
    // Arrange, Act and Assert
    assertEquals(2, (new Histogram(10.0d, 10.0d, 10.0d)).getNumBuckets());
  }

  /**
   * Method under test: {@link Histogram#getBucketCount(int)}
   */
  @Test
  public void testGetBucketCount() {
    // Arrange, Act and Assert
    assertEquals(0L, (new Histogram(-0.5d, 10.0d, 10.0d)).getBucketCount(3));
  }

  /**
   * Method under test: {@link Histogram#getBucketMinimum(int)}
   */
  @Test
  public void testGetBucketMinimum() {
    // Arrange, Act and Assert
    assertEquals(10.0d, (new Histogram(10.0d, 10.0d, 10.0d)).getBucketMinimum(1), 0.0);
    assertEquals(Double.MIN_VALUE, (new Histogram(10.0d, 10.0d, 10.0d)).getBucketMinimum(0), 0.0);
  }

  /**
   * Method under test: {@link Histogram#getBucketMaximum(int)}
   */
  @Test
  public void testGetBucketMaximum() {
    // Arrange, Act and Assert
    assertEquals(Double.MAX_VALUE, (new Histogram(10.0d, 10.0d, 10.0d)).getBucketMaximum(1), 0.0);
    assertEquals(11.0d, (new Histogram(1.0d, 10.0d, 10.0d)).getBucketMaximum(1), 0.0);
  }

  /**
   * Method under test: {@link Histogram#getBucketCounts()}
   */
  @Test
  public void testGetBucketCounts() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[]{0L, 0L}, (new Histogram(10.0d, 10.0d, 10.0d)).getBucketCounts());
  }

  /**
   * Method under test: {@link Histogram#getBucketMinimums()}
   */
  @Test
  public void testGetBucketMinimums() {
    // Arrange, Act and Assert
    assertArrayEquals(new double[]{Double.MIN_VALUE, 10.0d}, (new Histogram(10.0d, 10.0d, 10.0d)).getBucketMinimums(),
        0.0);
  }

  /**
   * Method under test: {@link Histogram#getBucketMaximums()}
   */
  @Test
  public void testGetBucketMaximums() {
    // Arrange, Act and Assert
    assertArrayEquals(new double[]{10.0d, Double.MAX_VALUE}, (new Histogram(10.0d, 10.0d, 10.0d)).getBucketMaximums(),
        0.0);
  }

  /**
   * Method under test: {@link Histogram#getMedian()}
   */
  @Test
  public void testGetMedian() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new Histogram(10.0d, 10.0d, 10.0d)).getMedian(), 0.0);
  }

  /**
   * Method under test: {@link Histogram#getPercentile(int)}
   */
  @Test
  public void testGetPercentile() {
    // Arrange, Act and Assert
    assertEquals(0.0d, (new Histogram(10.0d, 10.0d, 10.0d)).getPercentile(1), 0.0);
  }

  /**
   * Method under test: {@link Histogram#getPercentileRank(double)}
   */
  @Test
  public void testGetPercentileRank() {
    // Arrange, Act and Assert
    assertEquals(50L, (new Histogram(10.0d, 10.0d, 10.0d)).getPercentileRank(10.0d));
  }

  /**
   * Method under test: {@link Histogram#Histogram(double, double, double)}
   */
  @Test
  public void testNewHistogram() {
    // Arrange and Act
    Histogram actualHistogram = new Histogram(10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualHistogram.getMaximum(), 0.0);
    assertEquals(0.0d, actualHistogram.getMean(), 0.0);
    assertEquals(0.0d, actualHistogram.getMinimum(), 0.0);
    assertEquals(0.0d, actualHistogram.getStdDev(), 0.0);
    assertEquals(0.0d, actualHistogram.getVariance(), 0.0);
    assertEquals(0.0d, actualHistogram.getMedian(), 0.0);
    assertEquals(0L, actualHistogram.getNumValues());
    assertEquals(2, actualHistogram.getNumBuckets());
    assertArrayEquals(new double[]{10.0d, Double.MAX_VALUE}, actualHistogram.getBucketMaximums(), 0.0);
    assertArrayEquals(new double[]{Double.MIN_VALUE, 10.0d}, actualHistogram.getBucketMinimums(), 0.0);
    assertArrayEquals(new long[]{0L, 0L}, actualHistogram.getBucketCounts());
  }

  /**
   * Method under test: {@link Histogram#Histogram(double, double, double)}
   */
  @Test
  public void testNewHistogram2() {
    // Arrange and Act
    Histogram actualHistogram = new Histogram(0.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualHistogram.getMaximum(), 0.0);
    assertEquals(0.0d, actualHistogram.getMean(), 0.0);
    assertEquals(0.0d, actualHistogram.getMinimum(), 0.0);
    assertEquals(0.0d, actualHistogram.getStdDev(), 0.0);
    assertEquals(0.0d, actualHistogram.getVariance(), 0.0);
    assertEquals(0.0d, actualHistogram.getMedian(), 0.0);
    assertEquals(0L, actualHistogram.getNumValues());
    assertEquals(3, actualHistogram.getNumBuckets());
    assertArrayEquals(new double[]{0.0d, 10.0d, Double.MAX_VALUE}, actualHistogram.getBucketMaximums(), 0.0);
    assertArrayEquals(new double[]{Double.MIN_VALUE, 0.0d, 10.0d}, actualHistogram.getBucketMinimums(), 0.0);
    assertArrayEquals(new long[]{0L, 0L, 0L}, actualHistogram.getBucketCounts());
  }

  /**
   * Method under test: {@link Histogram#Histogram(double[])}
   */
  @Test
  public void testNewHistogram3() {
    // Arrange and Act
    Histogram actualHistogram = new Histogram(new double[]{10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertEquals(0.0d, actualHistogram.getMaximum(), 0.0);
    assertEquals(0.0d, actualHistogram.getMean(), 0.0);
    assertEquals(0.0d, actualHistogram.getMinimum(), 0.0);
    assertEquals(0.0d, actualHistogram.getStdDev(), 0.0);
    assertEquals(0.0d, actualHistogram.getVariance(), 0.0);
    assertEquals(0.0d, actualHistogram.getMedian(), 0.0);
    assertEquals(0L, actualHistogram.getNumValues());
    assertEquals(5, actualHistogram.getNumBuckets());
    assertArrayEquals(new double[]{10.0d, 1.0d, 10.0d, 1.0d, Double.MAX_VALUE}, actualHistogram.getBucketMaximums(),
        0.0);
    assertArrayEquals(new double[]{Double.MIN_VALUE, 10.0d, 1.0d, 10.0d, 1.0d}, actualHistogram.getBucketMinimums(),
        0.0);
    assertArrayEquals(new long[]{0L, 0L, 0L, 0L, 0L}, actualHistogram.getBucketCounts());
  }
}
