package com.netflix.eventbus.filter.lang.infix;

import static org.junit.Assert.assertThrows;
import com.netflix.eventbus.filter.lang.InvalidFilterException;
import org.junit.Test;

public class InfixFilterLanguageSupportDiffblueTest {
  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   * <ul>
   *   <li>When empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  public void testConvertWithString_whenEmptyString() throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert(""));
  }

  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   * <ul>
   *   <li>When {@code Filter}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  public void testConvertWithString_whenFilter() throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert("Filter"));
  }

  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   * <ul>
   *   <li>When space.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  public void testConvertWithString_whenSpace() throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert(" "));
  }
}
