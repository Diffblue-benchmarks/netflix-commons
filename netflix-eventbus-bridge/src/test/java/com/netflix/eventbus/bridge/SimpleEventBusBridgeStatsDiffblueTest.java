package com.netflix.eventbus.bridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SimpleEventBusBridgeStatsDiffblueTest {
  /**
   * Test {@link SimpleEventBusBridgeStats#getConsumeCount()}.
   *
   * <p>Method under test: {@link SimpleEventBusBridgeStats#getConsumeCount()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long SimpleEventBusBridgeStats.getConsumeCount()"})
  public void testGetConsumeCount() {
    // Arrange, Act and Assert
    assertEquals(0L, new SimpleEventBusBridgeStats().getConsumeCount());
  }

  /**
   * Test {@link SimpleEventBusBridgeStats#getConsumeErrorCount()}.
   *
   * <p>Method under test: {@link SimpleEventBusBridgeStats#getConsumeErrorCount()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long SimpleEventBusBridgeStats.getConsumeErrorCount()"})
  public void testGetConsumeErrorCount() {
    // Arrange, Act and Assert
    assertEquals(0L, new SimpleEventBusBridgeStats().getConsumeErrorCount());
  }

  /**
   * Test {@link SimpleEventBusBridgeStats#incConsumeCount()}.
   *
   * <p>Method under test: {@link SimpleEventBusBridgeStats#incConsumeCount()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long SimpleEventBusBridgeStats.incConsumeCount()"})
  public void testIncConsumeCount() {
    // Arrange
    SimpleEventBusBridgeStats simpleEventBusBridgeStats = new SimpleEventBusBridgeStats();

    // Act
    long actualIncConsumeCountResult = simpleEventBusBridgeStats.incConsumeCount();

    // Assert
    assertEquals(1L, simpleEventBusBridgeStats.getConsumeCount());
    assertEquals(1L, actualIncConsumeCountResult);
  }

  /**
   * Test {@link SimpleEventBusBridgeStats#incConsumeErrorCount(Exception)}.
   *
   * <p>Method under test: {@link SimpleEventBusBridgeStats#incConsumeErrorCount(Exception)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"long SimpleEventBusBridgeStats.incConsumeErrorCount(Exception)"})
  public void testIncConsumeErrorCount() {
    // Arrange
    SimpleEventBusBridgeStats simpleEventBusBridgeStats = new SimpleEventBusBridgeStats();
    Exception e = new Exception();

    // Act
    long actualIncConsumeErrorCountResult = simpleEventBusBridgeStats.incConsumeErrorCount(e);

    // Assert
    assertEquals(1L, simpleEventBusBridgeStats.getConsumeErrorCount());
    assertEquals(1L, actualIncConsumeErrorCountResult);
    assertSame(e, simpleEventBusBridgeStats.getLastConsumeException());
  }

  /**
   * Test {@link SimpleEventBusBridgeStats#getLastConsumeException()}.
   *
   * <p>Method under test: {@link SimpleEventBusBridgeStats#getLastConsumeException()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Exception SimpleEventBusBridgeStats.getLastConsumeException()"})
  public void testGetLastConsumeException() {
    // Arrange, Act and Assert
    assertNull(new SimpleEventBusBridgeStats().getLastConsumeException());
  }

  /**
   * Test new {@link SimpleEventBusBridgeStats} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link SimpleEventBusBridgeStats}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void SimpleEventBusBridgeStats.<init>()"})
  public void testNewSimpleEventBusBridgeStats() {
    // Arrange and Act
    SimpleEventBusBridgeStats actualSimpleEventBusBridgeStats = new SimpleEventBusBridgeStats();

    // Assert
    assertNull(actualSimpleEventBusBridgeStats.getLastConsumeException());
    assertEquals(0L, actualSimpleEventBusBridgeStats.getConsumeCount());
    assertEquals(0L, actualSimpleEventBusBridgeStats.getConsumeErrorCount());
  }
}
