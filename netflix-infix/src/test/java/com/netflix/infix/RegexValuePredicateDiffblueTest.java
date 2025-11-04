package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.netflix.infix.RegexValuePredicate.MatchPolicy;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class RegexValuePredicateDiffblueTest {
  /**
   * Test {@link RegexValuePredicate#RegexValuePredicate(String, MatchPolicy)}.
   * <ul>
   *   <li>When {@code .*}.</li>
   *   <li>Then return Pattern is {@code .*}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#RegexValuePredicate(String, MatchPolicy)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void RegexValuePredicate.<init>(String, MatchPolicy)"})
  public void testNewRegexValuePredicate_whenDotAsterisk_thenReturnPatternIsDotAsterisk() {
    // Arrange and Act
    RegexValuePredicate actualRegexValuePredicate = new RegexValuePredicate(".*", MatchPolicy.PARTIAL);

    // Assert
    assertEquals(".*", actualRegexValuePredicate.getPattern());
    assertEquals(MatchPolicy.PARTIAL, actualRegexValuePredicate.getMatchPolicy());
  }

  /**
   * Test {@link RegexValuePredicate#apply(String)} with {@code String}.
   * <p>
   * Method under test: {@link RegexValuePredicate#apply(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.apply(String)"})
  public void testApplyWithString() {
    // Arrange, Act and Assert
    assertTrue((new RegexValuePredicate(".*", MatchPolicy.FULL)).apply("Input"));
  }

  /**
   * Test {@link RegexValuePredicate#apply(String)} with {@code String}.
   * <ul>
   *   <li>Given {@link RegexValuePredicate#RegexValuePredicate(String, MatchPolicy)} with regex is {@code U} and policy is {@code PARTIAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#apply(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.apply(String)"})
  public void testApplyWithString_givenRegexValuePredicateWithRegexIsUAndPolicyIsPartial() {
    // Arrange, Act and Assert
    assertFalse((new RegexValuePredicate("U", MatchPolicy.PARTIAL)).apply("Input"));
  }

  /**
   * Test {@link RegexValuePredicate#apply(String)} with {@code String}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#apply(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.apply(String)"})
  public void testApplyWithString_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new RegexValuePredicate(".*", MatchPolicy.PARTIAL)).apply("Input"));
  }

  /**
   * Test {@link RegexValuePredicate#apply(String)} with {@code String}.
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#apply(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.apply(String)"})
  public void testApplyWithString_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> (new RegexValuePredicate(".*", null)).apply("Input"));
  }

  /**
   * Test {@link RegexValuePredicate#apply(String)} with {@code String}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#apply(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.apply(String)"})
  public void testApplyWithString_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new RegexValuePredicate(".*", MatchPolicy.PARTIAL)).apply(null));
  }

  /**
   * Test {@link RegexValuePredicate#getPattern()}.
   * <p>
   * Method under test: {@link RegexValuePredicate#getPattern()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String RegexValuePredicate.getPattern()"})
  public void testGetPattern() {
    // Arrange, Act and Assert
    assertEquals(".*", (new RegexValuePredicate(".*", MatchPolicy.PARTIAL)).getPattern());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RegexValuePredicate#toString()}
   *   <li>{@link RegexValuePredicate#getMatchPolicy()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MatchPolicy RegexValuePredicate.getMatchPolicy()", "String RegexValuePredicate.toString()"})
  public void testGettersAndSetters() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate(".*", MatchPolicy.PARTIAL);

    // Act
    String actualToStringResult = regexValuePredicate.toString();

    // Assert
    assertEquals("RegexValuePredicate [pattern=.*, policy=PARTIAL]", actualToStringResult);
    assertEquals(MatchPolicy.PARTIAL, regexValuePredicate.getMatchPolicy());
  }

  /**
   * Test {@link RegexValuePredicate#equals(Object)}, and {@link RegexValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RegexValuePredicate#equals(Object)}
   *   <li>{@link RegexValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.equals(Object)", "int RegexValuePredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate(".*", MatchPolicy.PARTIAL);
    RegexValuePredicate regexValuePredicate2 = new RegexValuePredicate(".*", MatchPolicy.PARTIAL);

    // Act and Assert
    assertEquals(regexValuePredicate, regexValuePredicate2);
    int expectedHashCodeResult = regexValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, regexValuePredicate2.hashCode());
  }

  /**
   * Test {@link RegexValuePredicate#equals(Object)}, and {@link RegexValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RegexValuePredicate#equals(Object)}
   *   <li>{@link RegexValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.equals(Object)", "int RegexValuePredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate(".*", MatchPolicy.PARTIAL);

    // Act and Assert
    assertEquals(regexValuePredicate, regexValuePredicate);
    int expectedHashCodeResult = regexValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, regexValuePredicate.hashCode());
  }

  /**
   * Test {@link RegexValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.equals(Object)", "int RegexValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate("Regex", MatchPolicy.PARTIAL);

    // Act and Assert
    assertNotEquals(regexValuePredicate, new RegexValuePredicate(".*", MatchPolicy.PARTIAL));
  }

  /**
   * Test {@link RegexValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.equals(Object)", "int RegexValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate(".*", null);

    // Act and Assert
    assertNotEquals(regexValuePredicate, new RegexValuePredicate(".*", MatchPolicy.PARTIAL));
  }

  /**
   * Test {@link RegexValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.equals(Object)", "int RegexValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RegexValuePredicate(".*", MatchPolicy.PARTIAL), null);
  }

  /**
   * Test {@link RegexValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RegexValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean RegexValuePredicate.equals(Object)", "int RegexValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RegexValuePredicate(".*", MatchPolicy.PARTIAL), "Different type to RegexValuePredicate");
  }
}
