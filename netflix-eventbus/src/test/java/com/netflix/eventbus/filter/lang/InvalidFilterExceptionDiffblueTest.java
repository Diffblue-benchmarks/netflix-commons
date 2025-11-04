package com.netflix.eventbus.filter.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class InvalidFilterExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link InvalidFilterException#InvalidFilterException(String, Throwable, Object)}
   */
  @Test
  public void testNewInvalidFilterException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InvalidFilterException actualInvalidFilterException = new InvalidFilterException("An error occurred", cause,
        "Filter");

    // Assert
    assertEquals("Invalid filter Filter. Error: An error occurred", actualInvalidFilterException.getLocalizedMessage());
    assertEquals("Invalid filter Filter. Error: An error occurred", actualInvalidFilterException.getMessage());
    assertEquals(0, actualInvalidFilterException.getSuppressed().length);
    assertSame(cause, actualInvalidFilterException.getCause());
  }

  /**
   * Method under test:
   * {@link InvalidFilterException#InvalidFilterException(Throwable, Object)}
   */
  @Test
  public void testNewInvalidFilterException2() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    InvalidFilterException actualInvalidFilterException = new InvalidFilterException(cause, "Filter");

    // Assert
    assertEquals("Invalid filter Filter.", actualInvalidFilterException.getLocalizedMessage());
    assertEquals("Invalid filter Filter.", actualInvalidFilterException.getMessage());
    assertEquals(0, actualInvalidFilterException.getSuppressed().length);
    assertSame(cause, actualInvalidFilterException.getCause());
  }
}
