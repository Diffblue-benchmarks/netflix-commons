package com.netflix.eventbus.filter.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class InvalidFilterExceptionDiffblueTest {
  /**
   * Test {@link InvalidFilterException#InvalidFilterException(String, Throwable, Object)}.
   * <p>
   * Method under test: {@link InvalidFilterException#InvalidFilterException(String, Throwable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void InvalidFilterException.<init>(String, Throwable, Object)"})
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
   * Test {@link InvalidFilterException#InvalidFilterException(Throwable, Object)}.
   * <p>
   * Method under test: {@link InvalidFilterException#InvalidFilterException(Throwable, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void InvalidFilterException.<init>(Throwable, Object)"})
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
