package com.netflix.eventbus.spi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.junit.Test;

public class InvalidSubscriberExceptionDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link InvalidSubscriberException#getOffendingMethods()}
   *   <li>{@link InvalidSubscriberException#getSubscriberClass()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    Class<Object> subscriberClass = Object.class;
    InvalidSubscriberException invalidSubscriberException = new InvalidSubscriberException(subscriberClass,
        new HashMap<>());

    // Act
    Set<Method> actualOffendingMethods = invalidSubscriberException.getOffendingMethods();
    Class<?> actualSubscriberClass = invalidSubscriberException.getSubscriberClass();

    // Assert
    assertTrue(actualOffendingMethods.isEmpty());
    Class<Object> expectedSubscriberClass = Object.class;
    assertEquals(expectedSubscriberClass, actualSubscriberClass);
    assertSame(subscriberClass, actualSubscriberClass);
  }

  /**
   * Method under test:
   * {@link InvalidSubscriberException#InvalidSubscriberException(Class, Map)}
   */
  @Test
  public void testNewInvalidSubscriberException() {
    // Arrange
    Class<Object> subscriberClass = Object.class;

    // Act
    InvalidSubscriberException actualInvalidSubscriberException = new InvalidSubscriberException(subscriberClass,
        new HashMap<>());

    // Assert
    assertEquals("Invalid subscriber class: class java.lang.Object. Errors: \n",
        actualInvalidSubscriberException.getLocalizedMessage());
    assertEquals("Invalid subscriber class: class java.lang.Object. Errors: \n",
        actualInvalidSubscriberException.getMessage());
    assertNull(actualInvalidSubscriberException.getCause());
    assertEquals(0, actualInvalidSubscriberException.getSuppressed().length);
    assertTrue(actualInvalidSubscriberException.getOffendingMethods().isEmpty());
    Class<Object> expectedSubscriberClass = Object.class;
    Class<?> subscriberClass2 = actualInvalidSubscriberException.getSubscriberClass();
    assertEquals(expectedSubscriberClass, subscriberClass2);
    assertSame(subscriberClass, subscriberClass2);
  }

  /**
   * Method under test:
   * {@link InvalidSubscriberException#InvalidSubscriberException(Class, Map)}
   */
  @Test
  public void testNewInvalidSubscriberException2() {
    // Arrange
    Class<Object> subscriberClass = Object.class;

    HashMap<Method, String> errors = new HashMap<>();
    errors.computeIfPresent(null, mock(BiFunction.class));

    // Act
    InvalidSubscriberException actualInvalidSubscriberException = new InvalidSubscriberException(subscriberClass,
        errors);

    // Assert
    assertEquals("Invalid subscriber class: class java.lang.Object. Errors: \n",
        actualInvalidSubscriberException.getLocalizedMessage());
    assertEquals("Invalid subscriber class: class java.lang.Object. Errors: \n",
        actualInvalidSubscriberException.getMessage());
    assertNull(actualInvalidSubscriberException.getCause());
    assertEquals(0, actualInvalidSubscriberException.getSuppressed().length);
    assertTrue(actualInvalidSubscriberException.getOffendingMethods().isEmpty());
    Class<Object> expectedSubscriberClass = Object.class;
    Class<?> subscriberClass2 = actualInvalidSubscriberException.getSubscriberClass();
    assertEquals(expectedSubscriberClass, subscriberClass2);
    assertSame(subscriberClass, subscriberClass2);
  }
}
