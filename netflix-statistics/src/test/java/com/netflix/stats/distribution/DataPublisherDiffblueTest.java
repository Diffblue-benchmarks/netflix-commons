package com.netflix.stats.distribution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DataPublisherDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link DataPublisher#DataPublisher(DataAccumulator, long)}
   *   <li>{@link DataPublisher#handleException(Exception)}
   *   <li>{@link DataPublisher#getDataAccumulator()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    DataDistribution accumulator = new DataDistribution(3, new double[]{10.0d, 1.0d, 10.0d, 1.0d});

    // Act
    DataPublisher actualDataPublisher = new DataPublisher(accumulator, 1L);
    actualDataPublisher.handleException(new Exception("foo"));

    // Assert that nothing has changed
    assertSame(accumulator, actualDataPublisher.getDataAccumulator());
  }

  /**
   * Method under test: {@link DataPublisher#isRunning()}
   */
  @Test
  public void testIsRunning() {
    // Arrange, Act and Assert
    assertFalse((new DataPublisher(new DataDistribution(3, new double[]{10.0d, 1.0d, 10.0d, 1.0d}), 1L)).isRunning());
  }
}
