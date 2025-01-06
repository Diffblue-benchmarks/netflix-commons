package com.netflix.eventbus.impl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.netflix.eventbus.spi.Subscribe;
import com.netflix.eventbus.spi.SubscriberConfigProvider;
import com.netflix.eventbus.spi.SubscriberConfigProvider.SubscriberConfig;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.Test;

public class DefaultConsumerQueueSupplierDiffblueTest {
  /**
   * Test
   * {@link DefaultConsumerQueueSupplier#get(Method, SubscriberConfig, AtomicLong)}.
   * <ul>
   *   <li>Given three.</li>
   *   <li>When {@link SubscriberConfig} {@link SubscriberConfig#getQueueSize()}
   * return three.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link DefaultConsumerQueueSupplier#get(Method, SubscriberConfigProvider.SubscriberConfig, AtomicLong)}
   */
  @Test
  public void testGet_givenThree_whenSubscriberConfigGetQueueSizeReturnThree() {
    // Arrange
    DefaultConsumerQueueSupplier defaultConsumerQueueSupplier = new DefaultConsumerQueueSupplier();
    SubscriberConfigProvider.SubscriberConfig subscriberConfig = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscriberConfig.getQueueSize()).thenReturn(3);
    when(subscriberConfig.getBatchingStrategy()).thenReturn(Subscribe.BatchingStrategy.None);

    // Act
    defaultConsumerQueueSupplier.get(null, subscriberConfig, new AtomicLong(1L));

    // Assert
    verify(subscriberConfig).getBatchingStrategy();
    verify(subscriberConfig).getQueueSize();
  }

  /**
   * Test
   * {@link DefaultConsumerQueueSupplier#get(Method, SubscriberConfig, AtomicLong)}.
   * <ul>
   *   <li>Given zero.</li>
   *   <li>When {@link SubscriberConfig} {@link SubscriberConfig#getQueueSize()}
   * return zero.</li>
   * </ul>
   * <p>
   * Method under test:
   * {@link DefaultConsumerQueueSupplier#get(Method, SubscriberConfigProvider.SubscriberConfig, AtomicLong)}
   */
  @Test
  public void testGet_givenZero_whenSubscriberConfigGetQueueSizeReturnZero() {
    // Arrange
    DefaultConsumerQueueSupplier defaultConsumerQueueSupplier = new DefaultConsumerQueueSupplier();
    SubscriberConfigProvider.SubscriberConfig subscriberConfig = mock(SubscriberConfigProvider.SubscriberConfig.class);
    when(subscriberConfig.getQueueSize()).thenReturn(0);
    when(subscriberConfig.getBatchingStrategy()).thenReturn(Subscribe.BatchingStrategy.None);

    // Act
    defaultConsumerQueueSupplier.get(null, subscriberConfig, new AtomicLong(1L));

    // Assert
    verify(subscriberConfig).getBatchingStrategy();
    verify(subscriberConfig).getQueueSize();
  }
}
