package com.netflix.eventbus.spi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class InvalidSubscriberExceptionDiffblueTest {
  /**
   * Test {@link InvalidSubscriberException#InvalidSubscriberException(Class, Map)}.
   *
   * <p>Method under test: {@link InvalidSubscriberException#InvalidSubscriberException(Class, Map)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void InvalidSubscriberException.<init>(Class, Map)"})
  public void testNewInvalidSubscriberException() {
    // Arrange
    Class<Object> subscriberClass = Object.class;

    // Act
    InvalidSubscriberException actualInvalidSubscriberException =
        new InvalidSubscriberException(subscriberClass, new HashMap<>());

    // Assert
    assertEquals(
        "Invalid subscriber class: class java.lang.Object. Errors: \n",
        actualInvalidSubscriberException.getLocalizedMessage());
    assertEquals(
        "Invalid subscriber class: class java.lang.Object. Errors: \n",
        actualInvalidSubscriberException.getMessage());
    assertNull(actualInvalidSubscriberException.getCause());
    assertEquals(0, actualInvalidSubscriberException.getSuppressed().length);
    assertTrue(actualInvalidSubscriberException.getOffendingMethods().isEmpty());
    Class<Object> expectedSubscriberClass = Object.class;
    assertEquals(expectedSubscriberClass, actualInvalidSubscriberException.getSubscriberClass());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InvalidSubscriberException#getOffendingMethods()}
   *   <li>{@link InvalidSubscriberException#getSubscriberClass()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Set InvalidSubscriberException.getOffendingMethods()",
    "Class InvalidSubscriberException.getSubscriberClass()"
  })
  public void testGettersAndSetters() {
    // Arrange
    Class<Object> subscriberClass = Object.class;
    InvalidSubscriberException invalidSubscriberException =
        new InvalidSubscriberException(subscriberClass, new HashMap<>());

    // Act
    Set<Method> actualOffendingMethods = invalidSubscriberException.getOffendingMethods();
    Class<?> actualSubscriberClass = invalidSubscriberException.getSubscriberClass();

    // Assert
    assertTrue(actualOffendingMethods.isEmpty());
    Class<Object> expectedSubscriberClass = Object.class;
    assertEquals(expectedSubscriberClass, actualSubscriberClass);
    assertSame(subscriberClass, actualSubscriberClass);
  }
}
