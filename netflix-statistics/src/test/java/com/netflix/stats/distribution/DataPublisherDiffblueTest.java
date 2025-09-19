package com.netflix.stats.distribution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DataPublisherDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DataPublisher#DataPublisher(DataAccumulator, long)}
   *   <li>{@link DataPublisher#handleException(Exception)}
   *   <li>{@link DataPublisher#getDataAccumulator()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    DataDistribution accumulator = new DataDistribution(3, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Act
    DataPublisher actualDataPublisher = new DataPublisher(accumulator, 1L);
    actualDataPublisher.handleException(new Exception());

    // Assert
    assertSame(accumulator, actualDataPublisher.getDataAccumulator());
  }

  /**
   * Test {@link DataPublisher#isRunning()}.
   *
   * <p>Method under test: {@link DataPublisher#isRunning()}
   */
  @Test
  public void testIsRunning() {
    // Arrange
    DataDistribution accumulator = new DataDistribution(3, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Act and Assert
    assertFalse(new DataPublisher(accumulator, 1L).isRunning());
  }
}
