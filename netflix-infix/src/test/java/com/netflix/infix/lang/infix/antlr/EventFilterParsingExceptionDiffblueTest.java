package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EventFilterParsingExceptionDiffblueTest {
  /**
   * Test {@link EventFilterParsingException#EventFilterParsingException(String, Throwable)}.
   *
   * <p>Method under test: {@link EventFilterParsingException#EventFilterParsingException(String,
   * Throwable)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterParsingException.<init>(String, Throwable)"})
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
