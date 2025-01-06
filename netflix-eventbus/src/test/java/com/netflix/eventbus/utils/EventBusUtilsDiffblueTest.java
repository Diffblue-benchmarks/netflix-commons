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
import com.netflix.servo.monitor.StatsTimer;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.helpers.SubstituteLogger;

public class EventBusUtilsDiffblueTest {
  /**
   * Test {@link EventBusUtils#getQueueSize(SubscriberConfig)}.
   * <ul>
   *   <li>Given three.</li>
   *   <li>Then return three.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize_givenThree_thenReturnThree() {
    // Arrange
    SubscriberConfigProvider.SubscriberConfig subscribe = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscribe.getQueueSize()).thenReturn(3);

    // Act
    int actualQueueSize = EventBusUtils.getQueueSize(subscribe);

    // Assert
    verify(subscribe).getQueueSize();
    assertEquals(3, actualQueueSize);
  }

  /**
   * Test {@link EventBusUtils#getQueueSize(SubscriberConfig)}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>Then return one thousand.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize_givenZero_thenReturnOneThousand() {
    // Arrange
    SubscriberConfigProvider.SubscriberConfig subscribe = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscribe.getQueueSize()).thenReturn(0);

    // Act
    int actualQueueSize = EventBusUtils.getQueueSize(subscribe);

    // Assert
    verify(subscribe).getQueueSize();
    assertEquals(1000, actualQueueSize);
  }

  /**
   * Test {@link EventBusUtils#getQueueSize(SubscriberConfig)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize_thenThrowIllegalArgumentException() {
    // Arrange
    SubscriberConfigProvider.SubscriberConfig subscribe = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscribe.getQueueSize()).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EventBusUtils.getQueueSize(subscribe));
    verify(subscribe).getQueueSize();
  }

  /**
   * Test {@link EventBusUtils#isAnEventBatch(Object)}.
   * <p>
   * Method under test: {@link EventBusUtils#isAnEventBatch(Object)}
   */
  @Test
  public void testIsAnEventBatch() {
    // Arrange, Act and Assert
    assertFalse(EventBusUtils.isAnEventBatch("Event"));
  }

  /**
   * Test {@link EventBusUtils#getInterestedEventType(Object, Method)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventBusUtils#getInterestedEventType(Object, Method)}
   */
  @Test
  public void testGetInterestedEventType_thenThrowIllegalArgumentException() {
    // Arrange
    DynamicSubscriber dynamicSubscriber = mock(DynamicSubscriber.class);
    Mockito.<Class<?>>when(dynamicSubscriber.getEventType()).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EventBusUtils.getInterestedEventType(dynamicSubscriber, null));
    verify(dynamicSubscriber).getEventType();
  }

  /**
   * Test
   * {@link EventBusUtils#applyFilters(Object, Set, StatsTimer, String, Logger)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link EventBusUtils#applyFilters(Object, Set, StatsTimer, String, Logger)}
   */
  @Test
  public void testApplyFilters_whenHashSet_thenReturnTrue() {
    // Arrange
    HashSet<EventFilter> filters = new HashSet<>();

    // Act and Assert
    assertTrue(EventBusUtils.applyFilters("Event", filters, null, "Invoker Desc",
        new SubstituteLogger("Name", new LinkedList<>(), true)));
  }
}
