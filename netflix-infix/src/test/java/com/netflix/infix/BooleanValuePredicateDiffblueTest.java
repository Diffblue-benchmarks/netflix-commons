package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BooleanValuePredicateDiffblueTest {
  /**
   * Test {@link BooleanValuePredicate#apply(Boolean)} with {@code Boolean}.
   *
   * <ul>
   *   <li>Given {@link BooleanValuePredicate#FALSE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BooleanValuePredicate#apply(Boolean)}
   */
  @Test
  public void testApplyWithBoolean_givenFalse_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BooleanValuePredicate.FALSE.apply(true));
  }

  /**
   * Test {@link BooleanValuePredicate#apply(Boolean)} with {@code Boolean}.
   *
   * <ul>
   *   <li>Given {@link BooleanValuePredicate#TRUE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BooleanValuePredicate#apply(Boolean)}
   */
  @Test
  public void testApplyWithBoolean_givenTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BooleanValuePredicate.TRUE.apply(true));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BooleanValuePredicate#toString()}
   *   <li>{@link BooleanValuePredicate#getValue()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    BooleanValuePredicate booleanValuePredicate = BooleanValuePredicate.FALSE;

    // Act
    String actualToStringResult = booleanValuePredicate.toString();

    // Assert
    assertEquals("BooleanValuePredicate [value=false]", actualToStringResult);
    assertFalse(booleanValuePredicate.getValue());
  }

  /**
   * Test {@link BooleanValuePredicate#equals(Object)}, and {@link
   * BooleanValuePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BooleanValuePredicate#equals(Object)}
   *   <li>{@link BooleanValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BooleanValuePredicate booleanValuePredicate = BooleanValuePredicate.FALSE;
    BooleanValuePredicate booleanValuePredicate2 = BooleanValuePredicate.FALSE;

    // Act and Assert
    assertEquals(booleanValuePredicate, booleanValuePredicate2);
    int expectedHashCodeResult = booleanValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, booleanValuePredicate2.hashCode());
  }

  /**
   * Test {@link BooleanValuePredicate#equals(Object)}, and {@link
   * BooleanValuePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BooleanValuePredicate#equals(Object)}
   *   <li>{@link BooleanValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BooleanValuePredicate booleanValuePredicate = BooleanValuePredicate.FALSE;

    // Act and Assert
    assertEquals(booleanValuePredicate, booleanValuePredicate);
    int expectedHashCodeResult = booleanValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, booleanValuePredicate.hashCode());
  }

  /**
   * Test {@link BooleanValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BooleanValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanValuePredicate.TRUE, BooleanValuePredicate.FALSE);
  }

  /**
   * Test {@link BooleanValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BooleanValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanValuePredicate.FALSE, null);
  }

  /**
   * Test {@link BooleanValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BooleanValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanValuePredicate.FALSE, "Different type to BooleanValuePredicate");
  }
}
