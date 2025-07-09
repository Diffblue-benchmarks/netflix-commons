package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class EventFilterParsingExceptionDiffblueTest {
  /**
   * Test {@link EventFilterParsingException#EventFilterParsingException(String, Throwable)}.
   *
   * <p>Method under test: {@link EventFilterParsingException#EventFilterParsingException(String,
   * Throwable)}
   */
  @Test
  public void testNewEventFilterParsingException() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    EventFilterParsingException actualEventFilterParsingException =
        new EventFilterParsingException("Msg", cause);

    // Assert
    assertEquals("Msg", actualEventFilterParsingException.getMessage());
    assertEquals(0, actualEventFilterParsingException.getSuppressed().length);
    assertSame(cause, actualEventFilterParsingException.getCause());
  }
}
