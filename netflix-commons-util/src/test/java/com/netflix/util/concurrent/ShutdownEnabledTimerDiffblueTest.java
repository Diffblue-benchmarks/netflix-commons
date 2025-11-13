package com.netflix.util.concurrent;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ShutdownEnabledTimerDiffblueTest {
  /**
   * Test {@link ShutdownEnabledTimer#ShutdownEnabledTimer(String, boolean)}.
   *
   * <p>Method under test: {@link ShutdownEnabledTimer#ShutdownEnabledTimer(String, boolean)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void ShutdownEnabledTimer.<init>(String, boolean)"})
  public void testNewShutdownEnabledTimer() {
    // Arrange, Act and Assert
    assertEquals(0, new ShutdownEnabledTimer("Name", true).purge());
  }
}
