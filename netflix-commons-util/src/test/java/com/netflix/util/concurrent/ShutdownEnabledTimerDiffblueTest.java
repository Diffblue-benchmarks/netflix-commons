package com.netflix.util.concurrent;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShutdownEnabledTimerDiffblueTest {
  /**
   * Test {@link ShutdownEnabledTimer#ShutdownEnabledTimer(String, boolean)}.
   *
   * <p>Method under test: {@link ShutdownEnabledTimer#ShutdownEnabledTimer(String, boolean)}
   */
  @Test
  public void testNewShutdownEnabledTimer() {
    // Arrange, Act and Assert
    assertEquals(0, new ShutdownEnabledTimer("Name", true).purge());
  }
}
