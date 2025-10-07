package com.netflix.eventbus.spi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.lang.reflect.Method;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SubscriberInfoDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SubscriberInfo#SubscriberInfo(Method, Object)}
   *   <li>{@link SubscriberInfo#getSubscriberInstance()}
   *   <li>{@link SubscriberInfo#getSubscriberMethod()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SubscriberInfo.<init>(Method, Object)",
    "Object SubscriberInfo.getSubscriberInstance()",
    "Method SubscriberInfo.getSubscriberMethod()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    SubscriberInfo actualSubscriberInfo = new SubscriberInfo(null, "Sub Instance");
    Object actualSubscriberInstance = actualSubscriberInfo.getSubscriberInstance();

    // Assert
    assertEquals("Sub Instance", actualSubscriberInstance);
    assertNull(actualSubscriberInfo.getSubscriberMethod());
  }
}
