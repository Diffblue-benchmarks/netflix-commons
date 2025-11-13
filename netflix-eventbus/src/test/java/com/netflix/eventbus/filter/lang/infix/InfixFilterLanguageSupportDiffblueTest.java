package com.netflix.eventbus.filter.lang.infix;

import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.netflix.eventbus.filter.lang.InvalidFilterException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class InfixFilterLanguageSupportDiffblueTest {
  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link InvalidFilterException}.
   * </ul>
   *
   * <p>Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.netflix.eventbus.spi.EventFilter InfixFilterLanguageSupport.convert(String)"
  })
  public void testConvertWithString_whenEmptyString_thenThrowInvalidFilterException()
      throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(InvalidFilterException.class, () -> new InfixFilterLanguageSupport().convert(""));
  }

  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code exists}.
   *   <li>Then throw {@link InvalidFilterException}.
   * </ul>
   *
   * <p>Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.netflix.eventbus.spi.EventFilter InfixFilterLanguageSupport.convert(String)"
  })
  public void testConvertWithString_whenExists_thenThrowInvalidFilterException()
      throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(
        InvalidFilterException.class, () -> new InfixFilterLanguageSupport().convert("exists"));
  }

  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Filter}.
   *   <li>Then throw {@link InvalidFilterException}.
   * </ul>
   *
   * <p>Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.netflix.eventbus.spi.EventFilter InfixFilterLanguageSupport.convert(String)"
  })
  public void testConvertWithString_whenFilter_thenThrowInvalidFilterException()
      throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(
        InvalidFilterException.class, () -> new InfixFilterLanguageSupport().convert("Filter"));
  }

  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code not empty}.
   *   <li>Then throw {@link InvalidFilterException}.
   * </ul>
   *
   * <p>Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.netflix.eventbus.spi.EventFilter InfixFilterLanguageSupport.convert(String)"
  })
  public void testConvertWithString_whenNotEmpty_thenThrowInvalidFilterException()
      throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(
        InvalidFilterException.class, () -> new InfixFilterLanguageSupport().convert("not empty"));
  }

  /**
   * Test {@link InfixFilterLanguageSupport#convert(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code not}.
   *   <li>Then throw {@link InvalidFilterException}.
   * </ul>
   *
   * <p>Method under test: {@link InfixFilterLanguageSupport#convert(String)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.netflix.eventbus.spi.EventFilter InfixFilterLanguageSupport.convert(String)"
  })
  public void testConvertWithString_whenNot_thenThrowInvalidFilterException()
      throws InvalidFilterException {
    // Arrange, Act and Assert
    assertThrows(
        InvalidFilterException.class, () -> new InfixFilterLanguageSupport().convert("not"));
  }
}
