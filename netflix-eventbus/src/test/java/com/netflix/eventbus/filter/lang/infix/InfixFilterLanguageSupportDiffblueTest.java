package com.netflix.eventbus.filter.lang.infix;

import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.netflix.eventbus.filter.lang.InvalidFilterException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class InfixFilterLanguageSupportDiffblueTest {
  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   * <ul>
   *   <li>When empty string.</li>
   *   <li>Then throw {@link InvalidFilterException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"com.netflix.eventbus.spi.EventFilter InfixFilterLanguageSupport.convert(String)"})
  public void testConvertWithString_whenEmptyString_thenThrowInvalidFilterException() throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert(""));
  }

  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   * <ul>
   *   <li>When {@code Filter}.</li>
   *   <li>Then throw {@link InvalidFilterException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"com.netflix.eventbus.spi.EventFilter InfixFilterLanguageSupport.convert(String)"})
  public void testConvertWithString_whenFilter_thenThrowInvalidFilterException() throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert("Filter"));
  }

  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   * <ul>
   *   <li>When space.</li>
   *   <li>Then throw {@link InvalidFilterException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"com.netflix.eventbus.spi.EventFilter InfixFilterLanguageSupport.convert(String)"})
  public void testConvertWithString_whenSpace_thenThrowInvalidFilterException() throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert(" "));
  }
}
