package com.netflix.eventbus.spi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import org.junit.Test;

public class CatchAllSubscriberDiffblueTest {
  /**
   * Method under test: {@link CatchAllSubscriber#enable(BlockingQueue)}
   */
  @Test
  public void testEnable() {
    // Arrange
    CatchAllSubscriber catchAllSubscriber = new CatchAllSubscriber();

    // Act and Assert
    assertTrue(catchAllSubscriber.enable(new DelayQueue<>()));
    assertTrue(catchAllSubscriber.isEnabled());
  }

  /**
   * Method under test: {@link CatchAllSubscriber#isEnabled()}
   */
  @Test
  public void testIsEnabled() {
    // Arrange, Act and Assert
    assertFalse((new CatchAllSubscriber()).isEnabled());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link CatchAllSubscriber}
   */
  @Test
  public void testNewCatchAllSubscriber() {
    // Arrange, Act and Assert
    assertFalse((new CatchAllSubscriber()).isEnabled());
  }
}
