package com.netflix.stats.distribution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.junit.Test;
import org.junit.experimental.categories.Category;

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
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DataPublisher.<init>(DataAccumulator, long)",
    "DataAccumulator DataPublisher.getDataAccumulator()",
    "void DataPublisher.handleException(Exception)"
  })
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
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DataPublisher.isRunning()"})
  public void testIsRunning() {
    // Arrange
    DataDistribution accumulator = new DataDistribution(3, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Act and Assert
    assertFalse(new DataPublisher(accumulator, 1L).isRunning());
  }

  /**
   * Test {@link DataPublisher#getExecutor()}.
   *
   * <p>Method under test: {@link DataPublisher#getExecutor()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"ScheduledExecutorService DataPublisher.getExecutor()"})
  public void testGetExecutor() {
    // Arrange
    DataDistribution accumulator = new DataDistribution(3, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Act
    ScheduledExecutorService actualExecutor = new DataPublisher(accumulator, 1L).getExecutor();

    // Assert
    assertTrue(actualExecutor instanceof ScheduledThreadPoolExecutor);
    assertEquals(0, ((ScheduledThreadPoolExecutor) actualExecutor).getActiveCount());
    assertEquals(0, ((ScheduledThreadPoolExecutor) actualExecutor).getLargestPoolSize());
    assertEquals(0, ((ScheduledThreadPoolExecutor) actualExecutor).getPoolSize());
    assertEquals(0L, ((ScheduledThreadPoolExecutor) actualExecutor).getCompletedTaskCount());
    assertEquals(0L, ((ScheduledThreadPoolExecutor) actualExecutor).getTaskCount());
    assertEquals(1, ((ScheduledThreadPoolExecutor) actualExecutor).getCorePoolSize());
    assertFalse(
        ((ScheduledThreadPoolExecutor) actualExecutor)
            .getContinueExistingPeriodicTasksAfterShutdownPolicy());
    assertFalse(((ScheduledThreadPoolExecutor) actualExecutor).getRemoveOnCancelPolicy());
    assertTrue(((ScheduledThreadPoolExecutor) actualExecutor).getQueue().isEmpty());
    assertTrue(
        ((ScheduledThreadPoolExecutor) actualExecutor)
            .getExecuteExistingDelayedTasksAfterShutdownPolicy());
    assertEquals(
        Integer.MAX_VALUE, ((ScheduledThreadPoolExecutor) actualExecutor).getMaximumPoolSize());
  }
}
