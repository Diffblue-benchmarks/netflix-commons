package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RegexValuePredicateDiffblueTest {
  /**
   * Method under test: {@link RegexValuePredicate#apply(String)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertTrue((new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL)).apply("Input"));
    assertFalse((new RegexValuePredicate("U", RegexValuePredicate.MatchPolicy.PARTIAL)).apply("Input"));
    assertThrows(UnsupportedOperationException.class, () -> (new RegexValuePredicate(".*", null)).apply("Input"));
    assertTrue((new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.FULL)).apply("Input"));
    assertFalse((new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL)).apply(null));
  }

  /**
   * Method under test: {@link RegexValuePredicate#getPattern()}
   */
  @Test
  public void testGetPattern() {
    // Arrange, Act and Assert
    assertEquals(".*", (new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL)).getPattern());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link RegexValuePredicate#equals(Object)}
   *   <li>{@link RegexValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL);
    RegexValuePredicate regexValuePredicate2 = new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL);

    // Act and Assert
    assertEquals(regexValuePredicate, regexValuePredicate2);
    int expectedHashCodeResult = regexValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, regexValuePredicate2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link RegexValuePredicate#equals(Object)}
   *   <li>{@link RegexValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL);

    // Act and Assert
    assertEquals(regexValuePredicate, regexValuePredicate);
    int expectedHashCodeResult = regexValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, regexValuePredicate.hashCode());
  }

  /**
   * Method under test: {@link RegexValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate("Regex", RegexValuePredicate.MatchPolicy.PARTIAL);

    // Act and Assert
    assertNotEquals(regexValuePredicate, new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL));
  }

  /**
   * Method under test: {@link RegexValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate(".*", null);

    // Act and Assert
    assertNotEquals(regexValuePredicate, new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL));
  }

  /**
   * Method under test: {@link RegexValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL), null);
  }

  /**
   * Method under test: {@link RegexValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL),
        "Different type to RegexValuePredicate");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link RegexValuePredicate#toString()}
   *   <li>{@link RegexValuePredicate#getMatchPolicy()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    RegexValuePredicate regexValuePredicate = new RegexValuePredicate(".*", RegexValuePredicate.MatchPolicy.PARTIAL);

    // Act
    String actualToStringResult = regexValuePredicate.toString();

    // Assert
    assertEquals("RegexValuePredicate [pattern=.*, policy=PARTIAL]", actualToStringResult);
    assertEquals(RegexValuePredicate.MatchPolicy.PARTIAL, regexValuePredicate.getMatchPolicy());
  }

  /**
   * Method under test:
   * {@link RegexValuePredicate#RegexValuePredicate(String, RegexValuePredicate.MatchPolicy)}
   */
  @Test
  public void testNewRegexValuePredicate() {
    // Arrange and Act
    RegexValuePredicate actualRegexValuePredicate = new RegexValuePredicate(".*",
        RegexValuePredicate.MatchPolicy.PARTIAL);

    // Assert
    assertEquals(".*", actualRegexValuePredicate.getPattern());
    assertEquals(RegexValuePredicate.MatchPolicy.PARTIAL, actualRegexValuePredicate.getMatchPolicy());
  }
}
