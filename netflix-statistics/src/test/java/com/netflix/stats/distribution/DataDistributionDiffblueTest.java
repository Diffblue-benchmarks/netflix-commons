package com.netflix.stats.distribution;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class DataDistributionDiffblueTest {
  /**
   * Test {@link DataDistribution#DataDistribution(int, double[])}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then return SampleSize is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link DataDistribution#DataDistribution(int, double[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DataDistribution.<init>(int, double[])"})
  public void testNewDataDistribution_whenThree_thenReturnSampleSizeIsZero() {
    // Arrange and Act
    DataDistribution actualDataDistribution = new DataDistribution(3, new double[]{10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertEquals(0, actualDataDistribution.getSampleSize());
    assertEquals(0.0d, actualDataDistribution.getMaximum(), 0.0);
    assertEquals(0.0d, actualDataDistribution.getMean(), 0.0);
    assertEquals(0.0d, actualDataDistribution.getMinimum(), 0.0);
    assertEquals(0.0d, actualDataDistribution.getStdDev(), 0.0);
    assertEquals(0.0d, actualDataDistribution.getVariance(), 0.0);
    assertEquals(0L, actualDataDistribution.getNumValues());
    assertEquals(0L, actualDataDistribution.getSampleIntervalMillis());
    assertEquals(0L, actualDataDistribution.getTimestampMillis());
    assertArrayEquals(new double[]{0.0d, 0.0d, 0.0d, 0.0d}, actualDataDistribution.getPercentiles(), 0.0);
    assertArrayEquals(new double[]{10.0d, 1.0d, 10.0d, 1.0d}, actualDataDistribution.getPercents(), 0.0);
  }

  /**
   * Test {@link DataDistribution#publish(DataBuffer)} with {@code DataBuffer}.
   * <p>
   * Method under test: {@link DataDistribution#publish(DataBuffer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DataDistribution.publish(DataBuffer)"})
  public void testPublishWithDataBuffer() {
    // Arrange
    DataDistribution dataDistribution = new DataDistribution(3, new double[]{10.0d, 1.0d, 10.0d, 1.0d});

    // Act
    dataDistribution.publish(new DataBuffer(3));

    // Assert that nothing has changed
    assertEquals(0, dataDistribution.getSampleSize());
    assertEquals(0.0d, dataDistribution.getMaximum(), 0.0);
    assertEquals(0.0d, dataDistribution.getMean(), 0.0);
    assertEquals(0.0d, dataDistribution.getMinimum(), 0.0);
    assertEquals(0.0d, dataDistribution.getStdDev(), 0.0);
    assertEquals(0.0d, dataDistribution.getVariance(), 0.0);
    assertEquals(0L, dataDistribution.getNumValues());
    assertEquals(0L, dataDistribution.getSampleIntervalMillis());
  }

  /**
   * Test {@link DataDistribution#publish(DataBuffer)} with {@code DataBuffer}.
   * <p>
   * Method under test: {@link DataDistribution#publish(DataBuffer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DataDistribution.publish(DataBuffer)"})
  public void testPublishWithDataBuffer2() {
    // Arrange
    DataDistribution dataDistribution = new DataDistribution(3, new double[]{10.0d, 1.0d, 10.0d, 1.0d});
    DataBuffer buf = mock(DataBuffer.class);
    when(buf.getMaximum()).thenReturn(10.0d);
    when(buf.getMean()).thenReturn(10.0d);
    when(buf.getMinimum()).thenReturn(10.0d);
    when(buf.getStdDev()).thenReturn(10.0d);
    when(buf.getVariance()).thenReturn(10.0d);
    when(buf.getPercentiles(Mockito.<double[]>any(), Mockito.<double[]>any()))
        .thenReturn(new double[]{10.0d, 1.0d, 10.0d, 1.0d});
    when(buf.getSampleSize()).thenReturn(3);
    when(buf.getSampleIntervalMillis()).thenReturn(42L);
    when(buf.getNumValues()).thenReturn(42L);

    // Act
    dataDistribution.publish(buf);

    // Assert
    verify(buf).getPercentiles(isA(double[].class), isA(double[].class));
    verify(buf).getSampleIntervalMillis();
    verify(buf).getSampleSize();
    verify(buf).getMaximum();
    verify(buf).getMean();
    verify(buf).getMinimum();
    verify(buf).getNumValues();
    verify(buf).getStdDev();
    verify(buf).getVariance();
    assertEquals(10.0d, dataDistribution.getMaximum(), 0.0);
    assertEquals(10.0d, dataDistribution.getMean(), 0.0);
    assertEquals(10.0d, dataDistribution.getMinimum(), 0.0);
    assertEquals(10.0d, dataDistribution.getStdDev(), 0.0);
    assertEquals(10.0d, dataDistribution.getVariance(), 0.0);
    assertEquals(3, dataDistribution.getSampleSize());
    assertEquals(42L, dataDistribution.getNumValues());
    assertEquals(42L, dataDistribution.getSampleIntervalMillis());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DataDistribution#getMaximum()}
   *   <li>{@link DataDistribution#getMean()}
   *   <li>{@link DataDistribution#getMinimum()}
   *   <li>{@link DataDistribution#getNumValues()}
   *   <li>{@link DataDistribution#getPercentiles()}
   *   <li>{@link DataDistribution#getPercents()}
   *   <li>{@link DataDistribution#getSampleIntervalMillis()}
   *   <li>{@link DataDistribution#getSampleSize()}
   *   <li>{@link DataDistribution#getStdDev()}
   *   <li>{@link DataDistribution#getTimestampMillis()}
   *   <li>{@link DataDistribution#getVariance()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"double DataDistribution.getMaximum()", "double DataDistribution.getMean()",
      "double DataDistribution.getMinimum()", "long DataDistribution.getNumValues()",
      "double[] DataDistribution.getPercentiles()", "double[] DataDistribution.getPercents()",
      "long DataDistribution.getSampleIntervalMillis()", "int DataDistribution.getSampleSize()",
      "double DataDistribution.getStdDev()", "long DataDistribution.getTimestampMillis()",
      "double DataDistribution.getVariance()"})
  public void testGettersAndSetters() {
    // Arrange
    DataDistribution dataDistribution = new DataDistribution(3, new double[]{10.0d, 1.0d, 10.0d, 1.0d});

    // Act
    double actualMaximum = dataDistribution.getMaximum();
    double actualMean = dataDistribution.getMean();
    double actualMinimum = dataDistribution.getMinimum();
    long actualNumValues = dataDistribution.getNumValues();
    double[] actualPercentiles = dataDistribution.getPercentiles();
    double[] actualPercents = dataDistribution.getPercents();
    long actualSampleIntervalMillis = dataDistribution.getSampleIntervalMillis();
    int actualSampleSize = dataDistribution.getSampleSize();
    double actualStdDev = dataDistribution.getStdDev();
    long actualTimestampMillis = dataDistribution.getTimestampMillis();

    // Assert
    assertEquals(0, actualSampleSize);
    assertEquals(0.0d, actualMaximum, 0.0);
    assertEquals(0.0d, actualMean, 0.0);
    assertEquals(0.0d, actualMinimum, 0.0);
    assertEquals(0.0d, actualStdDev, 0.0);
    assertEquals(0.0d, dataDistribution.getVariance(), 0.0);
    assertEquals(0L, actualNumValues);
    assertEquals(0L, actualSampleIntervalMillis);
    assertEquals(0L, actualTimestampMillis);
    assertArrayEquals(new double[]{0.0d, 0.0d, 0.0d, 0.0d}, actualPercentiles, 0.0);
    assertArrayEquals(new double[]{10.0d, 1.0d, 10.0d, 1.0d}, actualPercents, 0.0);
  }
}
