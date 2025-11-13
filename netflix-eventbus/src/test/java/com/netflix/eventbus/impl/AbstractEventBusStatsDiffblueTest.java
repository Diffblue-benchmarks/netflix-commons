package com.netflix.eventbus.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.netflix.eventbus.impl.AbstractEventBusStats.LatencyStats;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractEventBusStatsDiffblueTest {
  /**
   * Test LatencyStats {@link LatencyStats#compute()}.
   *
   * <p>Method under test: {@link LatencyStats#compute()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void LatencyStats.compute()"})
  public void testLatencyStatsCompute() {
    // Arrange
    LatencyStats latencyStats = mock(AbstractEventBusStats.class).new LatencyStats();

    // Act
    latencyStats.compute();

    // Assert that nothing has changed
    assertEquals(0, latencyStats.getSampleSize());
    assertEquals(0.0d, latencyStats.getMax(), 0.0);
    assertEquals(0.0d, latencyStats.getMean(), 0.0);
    assertEquals(0.0d, latencyStats.getMedian(), 0.0);
    assertEquals(0.0d, latencyStats.getPercentile_90(), 0.0);
    assertEquals(0.0d, latencyStats.getPercentile_99(), 0.0);
    assertEquals(0.0d, latencyStats.getPercentile_99_5(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#compute()}.
   *
   * <p>Method under test: {@link LatencyStats#compute()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void LatencyStats.compute()"})
  public void testLatencyStatsCompute2() {
    // Arrange
    LatencyStats latencyStats = mock(AbstractEventBusStats.class).new LatencyStats();
    latencyStats.addLatency(10.0d);

    // Act
    latencyStats.compute();

    // Assert
    assertEquals(1, latencyStats.getSampleSize());
    assertEquals(10.0d, latencyStats.getMax(), 0.0);
    assertEquals(10.0d, latencyStats.getMean(), 0.0);
    assertEquals(10.0d, latencyStats.getMedian(), 0.0);
    assertEquals(10.0d, latencyStats.getPercentile_90(), 0.0);
    assertEquals(10.0d, latencyStats.getPercentile_99(), 0.0);
    assertEquals(10.0d, latencyStats.getPercentile_99_5(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#compute()}.
   *
   * <p>Method under test: {@link LatencyStats#compute()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void LatencyStats.compute()"})
  public void testLatencyStatsCompute3() {
    // Arrange
    LatencyStats latencyStats = mock(AbstractEventBusStats.class).new LatencyStats();
    latencyStats.addLatency(99.0d);
    latencyStats.addLatency(10.0d);

    // Act
    latencyStats.compute();

    // Assert
    assertEquals(2, latencyStats.getSampleSize());
    assertEquals(54.5d, latencyStats.getMean(), 0.0);
    assertEquals(54.5d, latencyStats.getMedian(), 0.0);
    assertEquals(62.932503525602726d, latencyStats.getStddev(), 0.0);
    assertEquals(99.0d, latencyStats.getMax(), 0.0);
    assertEquals(99.0d, latencyStats.getPercentile_90(), 0.0);
    assertEquals(99.0d, latencyStats.getPercentile_99(), 0.0);
    assertEquals(99.0d, latencyStats.getPercentile_99_5(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#getMax()}.
   *
   * <p>Method under test: {@link LatencyStats#getMax()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double LatencyStats.getMax()"})
  public void testLatencyStatsGetMax() {
    // Arrange, Act and Assert
    assertEquals(0.0d, mock(AbstractEventBusStats.class).new LatencyStats().getMax(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#getMean()}.
   *
   * <p>Method under test: {@link LatencyStats#getMean()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double LatencyStats.getMean()"})
  public void testLatencyStatsGetMean() {
    // Arrange, Act and Assert
    assertEquals(0.0d, mock(AbstractEventBusStats.class).new LatencyStats().getMean(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#getMedian()}.
   *
   * <p>Method under test: {@link LatencyStats#getMedian()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double LatencyStats.getMedian()"})
  public void testLatencyStatsGetMedian() {
    // Arrange, Act and Assert
    assertEquals(0.0d, mock(AbstractEventBusStats.class).new LatencyStats().getMedian(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#getPercentile_90()}.
   *
   * <p>Method under test: {@link LatencyStats#getPercentile_90()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double LatencyStats.getPercentile_90()"})
  public void testLatencyStatsGetPercentile_90() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, mock(AbstractEventBusStats.class).new LatencyStats().getPercentile_90(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#getPercentile_99()}.
   *
   * <p>Method under test: {@link LatencyStats#getPercentile_99()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double LatencyStats.getPercentile_99()"})
  public void testLatencyStatsGetPercentile_99() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, mock(AbstractEventBusStats.class).new LatencyStats().getPercentile_99(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#getPercentile_99_5()}.
   *
   * <p>Method under test: {@link LatencyStats#getPercentile_99_5()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double LatencyStats.getPercentile_99_5()"})
  public void testLatencyStatsGetPercentile_99_5() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, mock(AbstractEventBusStats.class).new LatencyStats().getPercentile_99_5(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#getSampleSize()}.
   *
   * <p>Method under test: {@link LatencyStats#getSampleSize()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int LatencyStats.getSampleSize()"})
  public void testLatencyStatsGetSampleSize() {
    // Arrange, Act and Assert
    assertEquals(0, mock(AbstractEventBusStats.class).new LatencyStats().getSampleSize());
  }

  /**
   * Test LatencyStats {@link LatencyStats#getStddev()}.
   *
   * <p>Method under test: {@link LatencyStats#getStddev()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"double LatencyStats.getStddev()"})
  public void testLatencyStatsGetStddev() {
    // Arrange, Act and Assert
    assertEquals(0.0d, mock(AbstractEventBusStats.class).new LatencyStats().getStddev(), 0.0);
  }

  /**
   * Test LatencyStats {@link LatencyStats#LatencyStats(AbstractEventBusStats)}.
   *
   * <p>Method under test: {@link LatencyStats#LatencyStats(AbstractEventBusStats)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void LatencyStats.<init>(AbstractEventBusStats)"})
  public void testLatencyStatsNewLatencyStats() {
    // Arrange and Act
    LatencyStats actualLatencyStats = mock(AbstractEventBusStats.class).new LatencyStats();

    // Assert
    assertEquals(0, actualLatencyStats.getSampleSize());
    assertEquals(0.0d, actualLatencyStats.getMax(), 0.0);
    assertEquals(0.0d, actualLatencyStats.getMean(), 0.0);
    assertEquals(0.0d, actualLatencyStats.getMedian(), 0.0);
    assertEquals(0.0d, actualLatencyStats.getPercentile_90(), 0.0);
    assertEquals(0.0d, actualLatencyStats.getPercentile_99(), 0.0);
    assertEquals(0.0d, actualLatencyStats.getPercentile_99_5(), 0.0);
    assertEquals(0.0d, actualLatencyStats.getStddev(), 0.0);
  }
}
