package com.netflix.eventbus.impl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.netflix.eventbus.spi.Subscribe;
import com.netflix.eventbus.spi.Subscribe.BatchingStrategy;
import com.netflix.eventbus.spi.SubscriberConfigProvider;
import com.netflix.eventbus.spi.SubscriberConfigProvider.SubscriberConfig;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DefaultConsumerQueueSupplierDiffblueTest {
  /**
   * Test {@link DefaultConsumerQueueSupplier#get(Method, SubscriberConfig, AtomicLong)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link SubscriberConfigProvider.SubscriberConfig} {@link
   *       SubscriberConfigProvider.SubscriberConfig#getQueueSize()} return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultConsumerQueueSupplier#get(Method,
   * SubscriberConfigProvider.SubscriberConfig, AtomicLong)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.netflix.eventbus.impl.EventBusImpl.ConsumerQueueSupplier.ConsumerQueue DefaultConsumerQueueSupplier.get(Method, SubscriberConfigProvider.SubscriberConfig, AtomicLong)"
  })
  public void testGet_givenOne_whenSubscriberConfigGetQueueSizeReturnOne() {
    // Arrange
    DefaultConsumerQueueSupplier defaultConsumerQueueSupplier = new DefaultConsumerQueueSupplier();

    SubscriberConfig subscriberConfig = mock(SubscriberConfig.class);
    when(subscriberConfig.getQueueSize()).thenReturn(1);
    when(subscriberConfig.getBatchingStrategy()).thenReturn(BatchingStrategy.None);

    // Act
    defaultConsumerQueueSupplier.get(null, subscriberConfig, new AtomicLong());

    // Assert
    verify(subscriberConfig).getBatchingStrategy();
    verify(subscriberConfig).getQueueSize();
  }

  /**
   * Test {@link DefaultConsumerQueueSupplier#get(Method, SubscriberConfig, AtomicLong)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link SubscriberConfigProvider.SubscriberConfig} {@link
   *       SubscriberConfigProvider.SubscriberConfig#getQueueSize()} return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultConsumerQueueSupplier#get(Method,
   * SubscriberConfigProvider.SubscriberConfig, AtomicLong)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.netflix.eventbus.impl.EventBusImpl.ConsumerQueueSupplier.ConsumerQueue DefaultConsumerQueueSupplier.get(Method, SubscriberConfigProvider.SubscriberConfig, AtomicLong)"
  })
  public void testGet_givenZero_whenSubscriberConfigGetQueueSizeReturnZero() {
    // Arrange
    DefaultConsumerQueueSupplier defaultConsumerQueueSupplier = new DefaultConsumerQueueSupplier();

    SubscriberConfig subscriberConfig = mock(SubscriberConfig.class);
    when(subscriberConfig.getQueueSize()).thenReturn(0);
    when(subscriberConfig.getBatchingStrategy()).thenReturn(BatchingStrategy.None);

    // Act
    defaultConsumerQueueSupplier.get(null, subscriberConfig, new AtomicLong());

    // Assert
    verify(subscriberConfig).getBatchingStrategy();
    verify(subscriberConfig).getQueueSize();
  }
}
