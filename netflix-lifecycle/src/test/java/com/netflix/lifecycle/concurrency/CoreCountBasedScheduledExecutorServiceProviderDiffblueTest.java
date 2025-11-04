package com.netflix.lifecycle.concurrency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CoreCountBasedScheduledExecutorServiceProviderDiffblueTest {
  /**
   * Test {@link CoreCountBasedScheduledExecutorServiceProvider#get()}.
   * <p>
   * Method under test: {@link CoreCountBasedScheduledExecutorServiceProvider#get()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ScheduledExecutorService CoreCountBasedScheduledExecutorServiceProvider.get()"})
  public void testGet() {
    // Arrange and Act
    ScheduledExecutorService actualGetResult = (new CoreCountBasedScheduledExecutorServiceProvider()).get();

    // Assert
    assertTrue(actualGetResult instanceof ScheduledThreadPoolExecutor);
    assertEquals(0, ((ScheduledThreadPoolExecutor) actualGetResult).getActiveCount());
    assertEquals(0, ((ScheduledThreadPoolExecutor) actualGetResult).getLargestPoolSize());
    assertEquals(0, ((ScheduledThreadPoolExecutor) actualGetResult).getPoolSize());
    assertEquals(0L, ((ScheduledThreadPoolExecutor) actualGetResult).getCompletedTaskCount());
    assertEquals(0L, ((ScheduledThreadPoolExecutor) actualGetResult).getTaskCount());
    assertEquals(8, ((ScheduledThreadPoolExecutor) actualGetResult).getCorePoolSize());
    assertFalse(((ScheduledThreadPoolExecutor) actualGetResult).getContinueExistingPeriodicTasksAfterShutdownPolicy());
    assertFalse(((ScheduledThreadPoolExecutor) actualGetResult).getRemoveOnCancelPolicy());
    assertTrue(((ScheduledThreadPoolExecutor) actualGetResult).getQueue().isEmpty());
    assertTrue(((ScheduledThreadPoolExecutor) actualGetResult).getExecuteExistingDelayedTasksAfterShutdownPolicy());
    assertEquals(Integer.MAX_VALUE, ((ScheduledThreadPoolExecutor) actualGetResult).getMaximumPoolSize());
  }

  /**
   * Test new {@link CoreCountBasedScheduledExecutorServiceProvider} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link CoreCountBasedScheduledExecutorServiceProvider}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CoreCountBasedScheduledExecutorServiceProvider.<init>()"})
  public void testNewCoreCountBasedScheduledExecutorServiceProvider() {
    // Arrange, Act and Assert
    ScheduledExecutorService getResult = (new CoreCountBasedScheduledExecutorServiceProvider()).get();
    assertTrue(getResult instanceof ScheduledThreadPoolExecutor);
    assertEquals(0, ((ScheduledThreadPoolExecutor) getResult).getActiveCount());
    assertEquals(0, ((ScheduledThreadPoolExecutor) getResult).getLargestPoolSize());
    assertEquals(0, ((ScheduledThreadPoolExecutor) getResult).getPoolSize());
    assertEquals(0L, ((ScheduledThreadPoolExecutor) getResult).getCompletedTaskCount());
    assertEquals(0L, ((ScheduledThreadPoolExecutor) getResult).getTaskCount());
    assertEquals(8, ((ScheduledThreadPoolExecutor) getResult).getCorePoolSize());
    assertFalse(getResult.isShutdown());
    assertFalse(((ScheduledThreadPoolExecutor) getResult).getContinueExistingPeriodicTasksAfterShutdownPolicy());
    assertFalse(((ScheduledThreadPoolExecutor) getResult).getRemoveOnCancelPolicy());
    assertTrue(((ScheduledThreadPoolExecutor) getResult).getQueue().isEmpty());
    assertTrue(((ScheduledThreadPoolExecutor) getResult).getExecuteExistingDelayedTasksAfterShutdownPolicy());
    assertEquals(Integer.MAX_VALUE, ((ScheduledThreadPoolExecutor) getResult).getMaximumPoolSize());
  }
}
