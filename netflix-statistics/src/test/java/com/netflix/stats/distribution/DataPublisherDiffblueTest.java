package com.netflix.stats.distribution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DataPublisherDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DataPublisher#DataPublisher(DataAccumulator, long)}
   *   <li>{@link DataPublisher#handleException(Exception)}
   *   <li>{@link DataPublisher#getDataAccumulator()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void DataPublisher.<init>(DataAccumulator, long)",
      "DataAccumulator DataPublisher.getDataAccumulator()", "void DataPublisher.handleException(Exception)"})
  public void testGettersAndSetters() {
    // Arrange
    DataDistribution accumulator = new DataDistribution(3, new double[]{10.0d, 1.0d, 10.0d, 1.0d});

    // Act
    DataPublisher actualDataPublisher = new DataPublisher(accumulator, 1L);
    actualDataPublisher.handleException(new Exception("foo"));

    // Assert
    assertSame(accumulator, actualDataPublisher.getDataAccumulator());
  }

  /**
   * Test {@link DataPublisher#isRunning()}.
   * <p>
   * Method under test: {@link DataPublisher#isRunning()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean DataPublisher.isRunning()"})
  public void testIsRunning() {
    // Arrange, Act and Assert
    assertFalse((new DataPublisher(new DataDistribution(3, new double[]{10.0d, 1.0d, 10.0d, 1.0d}), 1L)).isRunning());
  }
}
