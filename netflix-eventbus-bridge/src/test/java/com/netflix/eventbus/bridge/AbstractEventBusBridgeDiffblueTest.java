package com.netflix.eventbus.bridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.netflix.eventbus.DummyEventBusBridge;
import com.netflix.eventbus.bridge.AbstractEventBusBridge.Builder;
import com.netflix.eventbus.filter.lang.infix.InfixEventFilter;
import com.netflix.eventbus.impl.EventBusImpl;
import com.netflix.eventbus.spi.EventBus;
import com.netflix.eventbus.spi.EventFilter;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractEventBusBridgeDiffblueTest {
  /**
   * Test Builder {@link Builder#validate()}.
   *
   * <ul>
   *   <li>Given builder withEventBus {@link EventBusImpl}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Builder#validate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void Builder.validate()"})
  public void testBuilderValidate_givenBuilderWithEventBusEventBusImpl_thenDoesNotThrow()
      throws Exception {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();
    Class<Object> eventType = Object.class;
    builderResult.withEventType(eventType);
    builderResult.withEventBus(mock(EventBusImpl.class));

    // Act and Assert
    builderResult.validate();
  }

  /**
   * Test Builder {@link Builder#withAutoStart(Boolean)}.
   *
   * <p>Method under test: {@link Builder#withAutoStart(Boolean)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.withAutoStart(Boolean)"})
  public void testBuilderWithAutoStart() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act
    DummyEventBusBridge.Builder actualWithAutoStartResult = builderResult.withAutoStart(true);

    // Assert
    assertSame(builderResult, actualWithAutoStartResult);
  }

  /**
   * Test Builder {@link Builder#withEventBus(EventBus)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#withEventBus(EventBus)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.withEventBus(EventBus)"})
  public void testBuilderWithEventBus_whenNull_thenReturnBuilder() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act
    DummyEventBusBridge.Builder actualWithEventBusResult = builderResult.withEventBus(null);

    // Assert
    assertSame(builderResult, actualWithEventBusResult);
  }

  /**
   * Test Builder {@link Builder#withEventType(Class)}.
   *
   * <p>Method under test: {@link Builder#withEventType(Class)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.withEventType(Class)"})
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
   * Test Builder {@link Builder#withFilter(EventFilter)}.
   *
   * <p>Method under test: {@link Builder#withFilter(EventFilter)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.withFilter(EventFilter)"})
  public void testBuilderWithFilter() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act
    DummyEventBusBridge.Builder actualWithFilterResult =
        builderResult.withFilter(new InfixEventFilter(mock(Predicate.class), "Original"));

    // Assert
    EventFilter eventFilter = builderResult.filter;
    assertTrue(eventFilter instanceof InfixEventFilter);
    assertEquals("Infix", eventFilter.getLanguage());
    assertSame(builderResult, actualWithFilterResult);
  }

  /**
   * Test Builder {@link Builder#withStatsSupplier(Supplier)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#withStatsSupplier(Supplier)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.withStatsSupplier(Supplier)"})
  public void testBuilderWithStatsSupplier_whenNull() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act
    DummyEventBusBridge.Builder actualWithStatsSupplierResult =
        builderResult.withStatsSupplier(null);

    // Assert
    assertSame(builderResult, actualWithStatsSupplierResult);
  }

  /**
   * Test Builder {@link Builder#withStatsSupplier(Supplier)}.
   *
   * <ul>
   *   <li>When {@link Supplier}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#withStatsSupplier(Supplier)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.withStatsSupplier(Supplier)"})
  public void testBuilderWithStatsSupplier_whenSupplier() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act
    DummyEventBusBridge.Builder actualWithStatsSupplierResult =
        builderResult.withStatsSupplier(mock(Supplier.class));

    // Assert
    assertSame(builderResult, actualWithStatsSupplierResult);
  }

  /**
   * Test Builder {@link Builder#withStats(EventBusBridgeStats)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#withStats(EventBusBridgeStats)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.withStats(EventBusBridgeStats)"})
  public void testBuilderWithStats_whenNull() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act
    DummyEventBusBridge.Builder actualWithStatsResult = builderResult.withStats(null);

    // Assert
    assertSame(builderResult, actualWithStatsResult);
  }

  /**
   * Test Builder {@link Builder#withStats(EventBusBridgeStats)}.
   *
   * <ul>
   *   <li>When {@link SimpleEventBusBridgeStats} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link Builder#withStats(EventBusBridgeStats)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.withStats(EventBusBridgeStats)"})
  public void testBuilderWithStats_whenSimpleEventBusBridgeStats() {
    // Arrange
    DummyEventBusBridge.Builder builderResult = DummyEventBusBridge.builder();

    // Act
    DummyEventBusBridge.Builder actualWithStatsResult =
        builderResult.withStats(new SimpleEventBusBridgeStats());

    // Assert
    assertSame(builderResult, actualWithStatsResult);
  }
}
