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
   * Method under test:
   * {@link EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize() {
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
   * Method under test:
   * {@link EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize2() {
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
   * Method under test:
   * {@link EventBusUtils#getQueueSize(SubscriberConfigProvider.SubscriberConfig)}
   */
  @Test
  public void testGetQueueSize3() {
    // Arrange
    SubscriberConfigProvider.SubscriberConfig subscribe = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscribe.getQueueSize()).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EventBusUtils.getQueueSize(subscribe));
    verify(subscribe).getQueueSize();
  }

  /**
   * Method under test: {@link EventBusUtils#isAnEventBatch(Object)}
   */
  @Test
  public void testIsAnEventBatch() {
    // Arrange, Act and Assert
    assertFalse(EventBusUtils.isAnEventBatch("Event"));
  }

  /**
   * Method under test:
   * {@link EventBusUtils#getInterestedEventType(Object, Method)}
   */
  @Test
  public void testGetInterestedEventType() {
    // Arrange
    DynamicSubscriber dynamicSubscriber = mock(DynamicSubscriber.class);
    Mockito.<Class<?>>when(dynamicSubscriber.getEventType()).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> EventBusUtils.getInterestedEventType(dynamicSubscriber, null));
    verify(dynamicSubscriber).getEventType();
  }

  /**
   * Method under test:
   * {@link EventBusUtils#applyFilters(Object, Set, StatsTimer, String, Logger)}
   */
  @Test
  public void testApplyFilters() {
    // Arrange
    HashSet<EventFilter> filters = new HashSet<>();

    // Act and Assert
    assertTrue(EventBusUtils.applyFilters("Event", filters, null, "Invoker Desc",
        new SubstituteLogger("Name", new LinkedList<>(), true)));
  }
}
