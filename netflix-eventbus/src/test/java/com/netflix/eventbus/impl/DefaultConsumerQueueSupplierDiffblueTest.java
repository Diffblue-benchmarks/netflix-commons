package com.netflix.eventbus.impl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.netflix.eventbus.spi.Subscribe;
import com.netflix.eventbus.spi.SubscriberConfigProvider;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.Test;

public class DefaultConsumerQueueSupplierDiffblueTest {
  /**
   * Method under test:
   * {@link DefaultConsumerQueueSupplier#get(Method, SubscriberConfigProvider.SubscriberConfig, AtomicLong)}
   */
  @Test
  public void testGet() {
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
   * Method under test:
   * {@link DefaultConsumerQueueSupplier#get(Method, SubscriberConfigProvider.SubscriberConfig, AtomicLong)}
   */
  @Test
  public void testGet2() {
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
