package com.netflix.eventbus.bridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class ImmutableEventBusBridgeStatsDiffblueTest {
  /**
   * Method under test: {@link ImmutableEventBusBridgeStats#getConsumeCount()}
   */
  @Test
  public void testGetConsumeCount() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())).getConsumeCount());
    assertEquals(0L,
        (new ImmutableEventBusBridgeStats(new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())))
            .getConsumeCount());
  }

  /**
   * Method under test:
   * {@link ImmutableEventBusBridgeStats#getConsumeErrorCount()}
   */
  @Test
  public void testGetConsumeErrorCount() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())).getConsumeErrorCount());
    assertEquals(0L,
        (new ImmutableEventBusBridgeStats(new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())))
            .getConsumeErrorCount());
  }

  /**
   * Method under test: {@link ImmutableEventBusBridgeStats#incConsumeCount()}
   */
  @Test
  public void testIncConsumeCount() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> (new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())).incConsumeCount());
  }

  /**
   * Method under test:
   * {@link ImmutableEventBusBridgeStats#incConsumeErrorCount(Exception)}
   */
  @Test
  public void testIncConsumeErrorCount() {
    // Arrange
    ImmutableEventBusBridgeStats immutableEventBusBridgeStats = new ImmutableEventBusBridgeStats(
        new SimpleEventBusBridgeStats());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> immutableEventBusBridgeStats.incConsumeErrorCount(new Exception("foo")));
  }

  /**
   * Method under test:
   * {@link ImmutableEventBusBridgeStats#getLastConsumeException()}
   */
  @Test
  public void testGetLastConsumeException() {
    // Arrange, Act and Assert
    assertNull((new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())).getLastConsumeException());
    assertNull((new ImmutableEventBusBridgeStats(new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())))
        .getLastConsumeException());
  }

  /**
   * Method under test:
   * {@link ImmutableEventBusBridgeStats#ImmutableEventBusBridgeStats(EventBusBridgeStats)}
   */
  @Test
  public void testNewImmutableEventBusBridgeStats() {
    // Arrange and Act
    ImmutableEventBusBridgeStats actualImmutableEventBusBridgeStats = new ImmutableEventBusBridgeStats(
        new SimpleEventBusBridgeStats());

    // Assert
    assertNull(actualImmutableEventBusBridgeStats.getLastConsumeException());
    assertEquals(0L, actualImmutableEventBusBridgeStats.getConsumeCount());
    assertEquals(0L, actualImmutableEventBusBridgeStats.getConsumeErrorCount());
  }
}
