package com.netflix.eventbus.spi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CatchAllSubscriberDiffblueTest {
  /**
   * Test {@link CatchAllSubscriber#enable(BlockingQueue)}.
   * <p>
   * Method under test: {@link CatchAllSubscriber#enable(BlockingQueue)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CatchAllSubscriber.enable(BlockingQueue)"})
  public void testEnable() {
    // Arrange
    CatchAllSubscriber catchAllSubscriber = new CatchAllSubscriber();

    // Act and Assert
    assertTrue(catchAllSubscriber.enable(new DelayQueue<>()));
    assertTrue(catchAllSubscriber.isEnabled());
  }

  /**
   * Test {@link CatchAllSubscriber#isEnabled()}.
   * <p>
   * Method under test: {@link CatchAllSubscriber#isEnabled()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CatchAllSubscriber.isEnabled()"})
  public void testIsEnabled() {
    // Arrange, Act and Assert
    assertFalse((new CatchAllSubscriber()).isEnabled());
  }

  /**
   * Test new {@link CatchAllSubscriber} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link CatchAllSubscriber}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CatchAllSubscriber.<init>()"})
  public void testNewCatchAllSubscriber() {
    // Arrange, Act and Assert
    assertFalse((new CatchAllSubscriber()).isEnabled());
  }
}
