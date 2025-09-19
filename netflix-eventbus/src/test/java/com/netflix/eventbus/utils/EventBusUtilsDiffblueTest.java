package com.netflix.eventbus.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.netflix.eventbus.spi.DynamicSubscriber;
import com.netflix.eventbus.spi.EventFilter;
import com.netflix.eventbus.spi.SubscriberConfigProvider;
import com.netflix.eventbus.spi.SubscriberConfigProvider.SubscriberConfig;
import com.netflix.servo.monitor.StatsTimer;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.helpers.SubstituteLogger;

public class EventBusUtilsDiffblueTest {
  /**
   * Test {@link EventBusUtils#getQueueSize(SubscriberConfig)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    SubscriberConfig subscribe = mock(SubscriberConfig.class);
    when(subscribe.getQueueSize()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EventBusUtils.getQueueSize(subscribe));
    verify(subscribe).getQueueSize();
  }

  /**
   * Test {@link EventBusUtils#getQueueSize(SubscriberConfig)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link
   * EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize_givenOne_thenReturnOne() {
    // Arrange
    SubscriberConfig subscribe = mock(SubscriberConfig.class);
    when(subscribe.getQueueSize()).thenReturn(1);

    // Act
    int actualQueueSize = EventBusUtils.getQueueSize(subscribe);

    // Assert
    verify(subscribe).getQueueSize();
    assertEquals(1, actualQueueSize);
  }

  /**
   * Test {@link EventBusUtils#getQueueSize(SubscriberConfig)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return one thousand.
   * </ul>
   *
   * <p>Method under test: {@link
   * EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize_givenZero_thenReturnOneThousand() {
    // Arrange
    SubscriberConfig subscribe = mock(SubscriberConfig.class);
    when(subscribe.getQueueSize()).thenReturn(0);

    // Act
    int actualQueueSize = EventBusUtils.getQueueSize(subscribe);

    // Assert
    verify(subscribe).getQueueSize();
    assertEquals(1000, actualQueueSize);
  }

  /**
   * Test {@link EventBusUtils#isAnEventBatch(Object)}.
   *
   * <p>Method under test: {@link EventBusUtils#isAnEventBatch(Object)}
   */
  @Test
  public void testIsAnEventBatch() {
    // Arrange, Act and Assert
    assertFalse(EventBusUtils.isAnEventBatch("Event"));
  }

  /**
   * Test {@link EventBusUtils#getInterestedEventType(Object, Method)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link EventBusUtils#getInterestedEventType(Object, Method)}
   */
  @Test
  public void testGetInterestedEventType_thenThrowIllegalArgumentException() {
    // Arrange
    DynamicSubscriber dynamicSubscriber = mock(DynamicSubscriber.class);
    org.mockito.Mockito.<Class<?>>when(dynamicSubscriber.getEventType())
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> EventBusUtils.getInterestedEventType(dynamicSubscriber, null));
    verify(dynamicSubscriber).getEventType();
  }

  /**
   * Test {@link EventBusUtils#applyFilters(Object, Set, StatsTimer, String, Logger)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link EventBusUtils#applyFilters(Object, Set, StatsTimer, String,
   * Logger)}
   */
  @Test
  public void testApplyFilters_whenHashSet_thenReturnTrue() {
    // Arrange
    HashSet<EventFilter> filters = new HashSet<>();
    SubstituteLogger logger = new SubstituteLogger("Name", new LinkedList<>(), true);

    // Act
    boolean actualApplyFiltersResult =
        EventBusUtils.applyFilters("Event", filters, null, "Invoker Desc", logger);

    // Assert
    assertTrue(actualApplyFiltersResult);
  }
}
