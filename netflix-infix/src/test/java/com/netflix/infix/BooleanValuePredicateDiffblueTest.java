package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BooleanValuePredicateDiffblueTest {
  /**
   * Method under test: {@link BooleanValuePredicate#apply(Boolean)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertFalse(BooleanValuePredicate.FALSE.apply(true));
    assertTrue(BooleanValuePredicate.TRUE.apply(true));
  }

  /**
   * Methods under test:
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
   * Methods under test:
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
   * Method under test: {@link BooleanValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanValuePredicate.TRUE, BooleanValuePredicate.FALSE);
  }

  /**
   * Method under test: {@link BooleanValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanValuePredicate.FALSE, null);
  }

  /**
   * Method under test: {@link BooleanValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BooleanValuePredicate.FALSE, "Different type to BooleanValuePredicate");
  }

  /**
   * Methods under test:
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
}
