package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class TimeUtilDiffblueTest {
  /**
   * Method under test: {@link TimeUtil#toDateTimeFormatter(String, String)}
   */
  @Test
  public void testToDateTimeFormatter() {
    // Arrange and Act
    DateTimeFormatter actualToDateTimeFormatterResult = TimeUtil.toDateTimeFormatter("Format Name", "42");

    // Assert
    assertNull(actualToDateTimeFormatterResult.getPivotYear());
    assertNull(actualToDateTimeFormatterResult.getLocale());
    assertNull(actualToDateTimeFormatterResult.getChronolgy());
    assertNull(actualToDateTimeFormatterResult.getChronology());
    assertNull(actualToDateTimeFormatterResult.getZone());
    assertEquals(2000, actualToDateTimeFormatterResult.getDefaultYear());
    assertFalse(actualToDateTimeFormatterResult.isOffsetParsed());
    assertTrue(actualToDateTimeFormatterResult.isParser());
    assertTrue(actualToDateTimeFormatterResult.isPrinter());
  }

  /**
   * Method under test: {@link TimeUtil#toString(long, String)}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("42", TimeUtil.toString(1L, "42"));
  }
}
