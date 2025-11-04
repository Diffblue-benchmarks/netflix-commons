package com.netflix.eventbus.filter.lang.infix;

import static org.junit.Assert.assertThrows;
import com.netflix.eventbus.filter.lang.InvalidFilterException;
import org.junit.Test;

public class InfixFilterLanguageSupportDiffblueTest {
  /**
   * Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  public void testConvert() throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert("Filter"));
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert(" "));
    assertThrows(InvalidFilterException.class, () -> (new InfixFilterLanguageSupport()).convert(""));
  }
}
