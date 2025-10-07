package com.netflix.stats.distribution;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DataBufferDiffblueTest {
  /**
   * Test {@link DataBuffer#DataBuffer(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then Lock return {@link ReentrantLock}.
   * </ul>
   *
   * <p>Method under test: {@link DataBuffer#DataBuffer(int)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void DataBuffer.<init>(int)"})
  public void testNewDataBuffer_whenThree_thenLockReturnReentrantLock() {
    // Arrange and Act
    DataBuffer actualDataBuffer = new DataBuffer(3);

    // Assert
    assertTrue(actualDataBuffer.getLock() instanceof ReentrantLock);
    assertEquals(0, actualDataBuffer.getSampleSize());
    assertEquals(0.0d, actualDataBuffer.getMaximum(), 0.0);
    assertEquals(0.0d, actualDataBuffer.getMean(), 0.0);
    assertEquals(0.0d, actualDataBuffer.getMinimum(), 0.0);
    assertEquals(0.0d, actualDataBuffer.getStdDev(), 0.0);
    assertEquals(0.0d, actualDataBuffer.getVariance(), 0.0);
    assertEquals(0L, actualDataBuffer.getSampleIntervalMillis());
    assertEquals(0L, actualDataBuffer.getNumValues());
    assertEquals(3, actualDataBuffer.getCapacity());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DataBuffer#getLock()}
   *   <li>{@link DataBuffer#getSampleSize()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Lock DataBuffer.getLock()", "int DataBuffer.getSampleSize()"})
  public void testGettersAndSetters() {
    // Arrange
    DataBuffer dataBuffer = new DataBuffer(3);

    // Act
    Lock actualLock = dataBuffer.getLock();

    // Assert
    assertTrue(actualLock instanceof ReentrantLock);
    assertEquals(0, dataBuffer.getSampleSize());
  }

  /**
   * Test {@link DataBuffer#getCapacity()}.
   *
   * <p>Method under test: {@link DataBuffer#getCapacity()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int DataBuffer.getCapacity()"})
  public void testGetCapacity() {
    // Arrange, Act and Assert
    assertEquals(3, new DataBuffer(3).getCapacity());
  }

  /**
   * Test {@link DataBuffer#getSampleIntervalMillis()}.
   *
   * <p>Method under test: {@link DataBuffer#getSampleIntervalMillis()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long DataBuffer.getSampleIntervalMillis()"})
  public void testGetSampleIntervalMillis() {
    // Arrange, Act and Assert
    assertEquals(0L, new DataBuffer(3).getSampleIntervalMillis());
  }

  /**
   * Test {@link DataBuffer#noteValue(double)}.
   *
   * <ul>
   *   <li>Then {@link DataBuffer#DataBuffer(int)} with capacity is one SampleSize is one.
   * </ul>
   *
   * <p>Method under test: {@link DataBuffer#noteValue(double)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void DataBuffer.noteValue(double)"})
  public void testNoteValue_thenDataBufferWithCapacityIsOneSampleSizeIsOne() {
    // Arrange
    DataBuffer dataBuffer = new DataBuffer(1);

    // Act
    dataBuffer.noteValue(10.0d);

    // Assert
    assertEquals(1, dataBuffer.getSampleSize());
    assertEquals(10.0d, dataBuffer.getMaximum(), 0.0);
    assertEquals(10.0d, dataBuffer.getMean(), 0.0);
    assertEquals(10.0d, dataBuffer.getMinimum(), 0.0);
    assertEquals(1L, dataBuffer.getNumValues());
  }

  /**
   * Test {@link DataBuffer#noteValue(double)}.
   *
   * <ul>
   *   <li>Then {@link DataBuffer#DataBuffer(int)} with capacity is three SampleSize is one.
   * </ul>
   *
   * <p>Method under test: {@link DataBuffer#noteValue(double)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void DataBuffer.noteValue(double)"})
  public void testNoteValue_thenDataBufferWithCapacityIsThreeSampleSizeIsOne() {
    // Arrange
    DataBuffer dataBuffer = new DataBuffer(3);

    // Act
    dataBuffer.noteValue(10.0d);

    // Assert
    assertEquals(1, dataBuffer.getSampleSize());
    assertEquals(10.0d, dataBuffer.getMaximum(), 0.0);
    assertEquals(10.0d, dataBuffer.getMean(), 0.0);
    assertEquals(10.0d, dataBuffer.getMinimum(), 0.0);
    assertEquals(1L, dataBuffer.getNumValues());
  }

  /**
   * Test {@link DataBuffer#getPercentiles(double[], double[])}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with zero and zero.
   * </ul>
   *
   * <p>Method under test: {@link DataBuffer#getPercentiles(double[], double[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DataBuffer.getPercentiles(double[], double[])"})
  public void testGetPercentiles_thenReturnArrayOfDoubleWithZeroAndZero() {
    // Arrange and Act
    double[] actualPercentiles =
        new DataBuffer(3)
            .getPercentiles(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, actualPercentiles, 0.0);
  }
}
