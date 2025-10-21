package com.netflix.eventbus.spi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class InvalidSubscriberExceptionDiffblueTest {
  /**
   * Test {@link InvalidSubscriberException#InvalidSubscriberException(Class, Map)}.
   *
   * <p>Method under test: {@link InvalidSubscriberException#InvalidSubscriberException(Class, Map)}
   */
  @Test
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
  }
}
