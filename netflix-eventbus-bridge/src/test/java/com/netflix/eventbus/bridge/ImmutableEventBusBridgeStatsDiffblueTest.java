package com.netflix.eventbus.bridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ImmutableEventBusBridgeStatsDiffblueTest {
  /**
   * Test {@link ImmutableEventBusBridgeStats#ImmutableEventBusBridgeStats(EventBusBridgeStats)}.
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#ImmutableEventBusBridgeStats(EventBusBridgeStats)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ImmutableEventBusBridgeStats.<init>(EventBusBridgeStats)"})
  public void testNewImmutableEventBusBridgeStats() {
    // Arrange and Act
    ImmutableEventBusBridgeStats actualImmutableEventBusBridgeStats = new ImmutableEventBusBridgeStats(
        new SimpleEventBusBridgeStats());

    // Assert
    assertNull(actualImmutableEventBusBridgeStats.getLastConsumeException());
    assertEquals(0L, actualImmutableEventBusBridgeStats.getConsumeCount());
    assertEquals(0L, actualImmutableEventBusBridgeStats.getConsumeErrorCount());
  }

  /**
   * Test {@link ImmutableEventBusBridgeStats#getConsumeCount()}.
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#getConsumeCount()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long ImmutableEventBusBridgeStats.getConsumeCount()"})
  public void testGetConsumeCount() {
    // Arrange, Act and Assert
    assertEquals(0L,
        (new ImmutableEventBusBridgeStats(new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())))
            .getConsumeCount());
  }

  /**
   * Test {@link ImmutableEventBusBridgeStats#getConsumeCount()}.
   * <ul>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#getConsumeCount()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long ImmutableEventBusBridgeStats.getConsumeCount()"})
  public void testGetConsumeCount_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())).getConsumeCount());
  }

  /**
   * Test {@link ImmutableEventBusBridgeStats#getConsumeErrorCount()}.
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#getConsumeErrorCount()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long ImmutableEventBusBridgeStats.getConsumeErrorCount()"})
  public void testGetConsumeErrorCount() {
    // Arrange, Act and Assert
    assertEquals(0L,
        (new ImmutableEventBusBridgeStats(new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())))
            .getConsumeErrorCount());
  }

  /**
   * Test {@link ImmutableEventBusBridgeStats#getConsumeErrorCount()}.
   * <ul>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#getConsumeErrorCount()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long ImmutableEventBusBridgeStats.getConsumeErrorCount()"})
  public void testGetConsumeErrorCount_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())).getConsumeErrorCount());
  }

  /**
   * Test {@link ImmutableEventBusBridgeStats#incConsumeCount()}.
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#incConsumeCount()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long ImmutableEventBusBridgeStats.incConsumeCount()"})
  public void testIncConsumeCount() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> (new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())).incConsumeCount());
  }

  /**
   * Test {@link ImmutableEventBusBridgeStats#incConsumeErrorCount(Exception)}.
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#incConsumeErrorCount(Exception)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"long ImmutableEventBusBridgeStats.incConsumeErrorCount(Exception)"})
  public void testIncConsumeErrorCount() {
    // Arrange
    ImmutableEventBusBridgeStats immutableEventBusBridgeStats = new ImmutableEventBusBridgeStats(
        new SimpleEventBusBridgeStats());

    // Act and Assert
    assertThrows(UnsupportedOperationException.class,
        () -> immutableEventBusBridgeStats.incConsumeErrorCount(new Exception("foo")));
  }

  /**
   * Test {@link ImmutableEventBusBridgeStats#getLastConsumeException()}.
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#getLastConsumeException()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Exception ImmutableEventBusBridgeStats.getLastConsumeException()"})
  public void testGetLastConsumeException() {
    // Arrange, Act and Assert
    assertNull((new ImmutableEventBusBridgeStats(new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())))
        .getLastConsumeException());
  }

  /**
   * Test {@link ImmutableEventBusBridgeStats#getLastConsumeException()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ImmutableEventBusBridgeStats#getLastConsumeException()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Exception ImmutableEventBusBridgeStats.getLastConsumeException()"})
  public void testGetLastConsumeException_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull((new ImmutableEventBusBridgeStats(new SimpleEventBusBridgeStats())).getLastConsumeException());
  }
}
