package com.netflix.stats.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.Test;

public class DataBufferDiffblueTest {
  /**
   * Method under test: {@link DataBuffer#getCapacity()}
   */
  @Test
  public void testGetCapacity() {
    // Arrange, Act and Assert
    assertEquals(3, (new DataBuffer(3)).getCapacity());
  }

  /**
   * Method under test: {@link DataBuffer#getSampleIntervalMillis()}
   */
  @Test
  public void testGetSampleIntervalMillis() {
    // Arrange, Act and Assert
    assertEquals(0L, (new DataBuffer(3)).getSampleIntervalMillis());
  }

  /**
   * Method under test: {@link DataBuffer#noteValue(double)}
   */
  @Test
  public void testNoteValue() {
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
   * Method under test: {@link DataBuffer#noteValue(double)}
   */
  @Test
  public void testNoteValue2() {
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
   * Method under test: {@link DataBuffer#getPercentiles(double[], double[])}
   */
  @Test
  public void testGetPercentiles() {
    // Arrange
    double[] percentiles = new double[]{10.0d, 1.0d, 10.0d, 1.0d};

    // Act and Assert
    assertSame(percentiles, (new DataBuffer(3)).getPercentiles(new double[]{10.0d, 1.0d, 10.0d, 1.0d}, percentiles));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link DataBuffer#getLock()}
   *   <li>{@link DataBuffer#getSampleSize()}
   * </ul>
   */
  @Test
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
   * Method under test: {@link DataBuffer#DataBuffer(int)}
   */
  @Test
  public void testNewDataBuffer() {
    // Arrange and Act
    DataBuffer actualDataBuffer = new DataBuffer(3);

    // Assert
    Lock lock = actualDataBuffer.getLock();
    assertTrue(lock instanceof ReentrantLock);
    assertEquals(0, actualDataBuffer.getSampleSize());
    assertEquals(0, ((ReentrantLock) lock).getHoldCount());
    assertEquals(0, ((ReentrantLock) lock).getQueueLength());
    assertEquals(0.0d, actualDataBuffer.getMaximum(), 0.0);
    assertEquals(0.0d, actualDataBuffer.getMean(), 0.0);
    assertEquals(0.0d, actualDataBuffer.getMinimum(), 0.0);
    assertEquals(0.0d, actualDataBuffer.getStdDev(), 0.0);
    assertEquals(0.0d, actualDataBuffer.getVariance(), 0.0);
    assertEquals(0L, actualDataBuffer.getSampleIntervalMillis());
    assertEquals(0L, actualDataBuffer.getNumValues());
    assertEquals(3, actualDataBuffer.getCapacity());
    assertFalse(((ReentrantLock) lock).hasQueuedThreads());
    assertFalse(((ReentrantLock) lock).isFair());
    assertFalse(((ReentrantLock) lock).isHeldByCurrentThread());
    assertFalse(((ReentrantLock) lock).isLocked());
  }
}
