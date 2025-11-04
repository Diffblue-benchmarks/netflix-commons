package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TimeUtilDiffblueTest {
  /**
   * Test {@link TimeUtil#toDateTimeFormatter(String, String)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return PivotYear is {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TimeUtil#toDateTimeFormatter(String, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"DateTimeFormatter TimeUtil.toDateTimeFormatter(String, String)"})
  public void testToDateTimeFormatter_when42_thenReturnPivotYearIsNull() {
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
   * Test {@link TimeUtil#toString(long, String)} with {@code long}, {@code String}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TimeUtil#toString(long, String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String TimeUtil.toString(long, String)"})
  public void testToStringWithLongString_when42_thenReturn42() {
    // Arrange, Act and Assert
    assertEquals("42", TimeUtil.toString(1L, "42"));
  }
}
