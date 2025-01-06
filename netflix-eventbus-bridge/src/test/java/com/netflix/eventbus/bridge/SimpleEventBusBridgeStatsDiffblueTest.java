package com.netflix.eventbus.bridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SimpleEventBusBridgeStatsDiffblueTest {
  /**
   * Test {@link SimpleEventBusBridgeStats#getConsumeCount()}.
   * <p>
   * Method under test: {@link SimpleEventBusBridgeStats#getConsumeCount()}
   */
  @Test
  public void testGetConsumeCount() {
    // Arrange, Act and Assert
    assertEquals(0L, (new SimpleEventBusBridgeStats()).getConsumeCount());
  }

  /**
   * Test {@link SimpleEventBusBridgeStats#getConsumeErrorCount()}.
   * <p>
   * Method under test: {@link SimpleEventBusBridgeStats#getConsumeErrorCount()}
   */
  @Test
  public void testGetConsumeErrorCount() {
    // Arrange, Act and Assert
    assertEquals(0L, (new SimpleEventBusBridgeStats()).getConsumeErrorCount());
  }

  /**
   * Test {@link SimpleEventBusBridgeStats#incConsumeCount()}.
   * <p>
   * Method under test: {@link SimpleEventBusBridgeStats#incConsumeCount()}
   */
  @Test
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
   * <p>
   * Method under test:
   * {@link SimpleEventBusBridgeStats#incConsumeErrorCount(Exception)}
   */
  @Test
  public void testIncConsumeErrorCount() {
    // Arrange
    SimpleEventBusBridgeStats simpleEventBusBridgeStats = new SimpleEventBusBridgeStats();
    Exception e = new Exception("foo");

    // Act
    long actualIncConsumeErrorCountResult = simpleEventBusBridgeStats.incConsumeErrorCount(e);

    // Assert
    assertEquals(1L, simpleEventBusBridgeStats.getConsumeErrorCount());
    assertEquals(1L, actualIncConsumeErrorCountResult);
    assertSame(e, simpleEventBusBridgeStats.getLastConsumeException());
  }

  /**
   * Test {@link SimpleEventBusBridgeStats#getLastConsumeException()}.
   * <p>
   * Method under test:
   * {@link SimpleEventBusBridgeStats#getLastConsumeException()}
   */
  @Test
  public void testGetLastConsumeException() {
    // Arrange, Act and Assert
    assertNull((new SimpleEventBusBridgeStats()).getLastConsumeException());
  }

  /**
   * Test new {@link SimpleEventBusBridgeStats} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of
   * {@link SimpleEventBusBridgeStats}
   */
  @Test
  public void testNewSimpleEventBusBridgeStats() {
    // Arrange and Act
    SimpleEventBusBridgeStats actualSimpleEventBusBridgeStats = new SimpleEventBusBridgeStats();

    // Assert
    assertNull(actualSimpleEventBusBridgeStats.getLastConsumeException());
    assertEquals(0L, actualSimpleEventBusBridgeStats.getConsumeCount());
    assertEquals(0L, actualSimpleEventBusBridgeStats.getConsumeErrorCount());
  }
}
