package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NullValuePredicateDiffblueTest {
  /**
   * Method under test: {@link NullValuePredicate#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertFalse(NullValuePredicate.INSTANCE.apply("Input"));
    assertTrue(NullValuePredicate.INSTANCE.apply(null));
  }

  /**
   * Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, 3);
  }

  /**
   * Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, null);
  }

  /**
   * Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, "Different type to NullValuePredicate");
  }

  /**
   * Method under test: {@link NullValuePredicate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NullValuePredicate []", NullValuePredicate.INSTANCE.toString());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link NullValuePredicate#equals(Object)}
   *   <li>{@link NullValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NullValuePredicate nullValuePredicate = NullValuePredicate.INSTANCE;
    NullValuePredicate nullValuePredicate2 = NullValuePredicate.INSTANCE;

    // Act and Assert
    assertEquals(nullValuePredicate, nullValuePredicate2);
    int expectedHashCodeResult = nullValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, nullValuePredicate2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link NullValuePredicate#equals(Object)}
   *   <li>{@link NullValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NullValuePredicate nullValuePredicate = NullValuePredicate.INSTANCE;

    // Act and Assert
    assertEquals(nullValuePredicate, nullValuePredicate);
    int expectedHashCodeResult = nullValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, nullValuePredicate.hashCode());
  }
}
