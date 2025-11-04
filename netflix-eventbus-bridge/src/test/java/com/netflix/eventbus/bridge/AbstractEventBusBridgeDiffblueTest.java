package com.netflix.eventbus.bridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.netflix.eventbus.DummyEventBusBridge;
import com.netflix.eventbus.filter.lang.infix.InfixEventFilter;
import com.netflix.eventbus.spi.EventBus;
import com.netflix.eventbus.spi.EventFilter;
import org.junit.Test;

public class AbstractEventBusBridgeDiffblueTest {
  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withAutoStart(Boolean)}
   */
  @Test
  public void testBuilderWithAutoStart() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.withAutoStart(true));
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withAutoStart(Boolean)}
   */
  @Test
  public void testBuilderWithAutoStart2() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();
    builderResult.withFilter(new InfixEventFilter(mock(Predicate.class), "Original"));

    // Act and Assert
    assertSame(builderResult, builderResult.withAutoStart(true));
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withEventBus(EventBus)}
   */
  @Test
  public void testBuilderWithEventBus() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.withEventBus(null));
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withEventType(Class)}
   */
  @Test
  public void testBuilderWithEventType() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();
    Class<Object> eventType = Object.class;

    // Act
    DummyEventBusBridge.Builder actualWithEventTypeResult = builderResult.withEventType(eventType);

    // Assert
    Class<Object> expectedResultClass = Object.class;
    assertEquals(expectedResultClass, builderResult.eventType);
    assertSame(builderResult, actualWithEventTypeResult);
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withEventType(Class)}
   */
  @Test
  public void testBuilderWithEventType2() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();
    builderResult.withFilter(new InfixEventFilter(mock(Predicate.class), "Original"));
    Class<Object> eventType = Object.class;

    // Act
    DummyEventBusBridge.Builder actualWithEventTypeResult = builderResult.withEventType(eventType);

    // Assert
    Class<Object> expectedResultClass = Object.class;
    assertEquals(expectedResultClass, builderResult.eventType);
    assertSame(builderResult, actualWithEventTypeResult);
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withFilter(EventFilter)}
   */
  @Test
  public void testBuilderWithFilter() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act
    DummyEventBusBridge.Builder actualWithFilterResult = builderResult
        .withFilter(new InfixEventFilter(mock(Predicate.class), "Original"));

    // Assert
    EventFilter eventFilter = builderResult.filter;
    assertTrue(eventFilter instanceof InfixEventFilter);
    assertEquals("Infix", eventFilter.getLanguage());
    assertSame(builderResult, actualWithFilterResult);
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withStats(EventBusBridgeStats)}
   */
  @Test
  public void testBuilderWithStats() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.withStats(new SimpleEventBusBridgeStats()));
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withStats(EventBusBridgeStats)}
   */
  @Test
  public void testBuilderWithStats2() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.withStats(null));
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withStats(EventBusBridgeStats)}
   */
  @Test
  public void testBuilderWithStats3() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();
    builderResult.withFilter(new InfixEventFilter(mock(Predicate.class), "Original"));

    // Act and Assert
    assertSame(builderResult, builderResult.withStats(new SimpleEventBusBridgeStats()));
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withStatsSupplier(Supplier)}
   */
  @Test
  public void testBuilderWithStatsSupplier() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.withStatsSupplier(mock(Supplier.class)));
  }

  /**
   * Method under test:
   * {@link AbstractEventBusBridge.Builder#withStatsSupplier(Supplier)}
   */
  @Test
  public void testBuilderWithStatsSupplier2() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act and Assert
    assertSame(builderResult, builderResult.withStatsSupplier(null));
  }
}
