package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AlwaysTruePredicateDiffblueTest {
  /**
   * Method under test: {@link AlwaysTruePredicate#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertTrue(AlwaysTruePredicate.INSTANCE.apply("Input"));
  }

  /**
   * Method under test: {@link AlwaysTruePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTruePredicate.INSTANCE, 3);
  }

  /**
   * Method under test: {@link AlwaysTruePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTruePredicate.INSTANCE, null);
  }

  /**
   * Method under test: {@link AlwaysTruePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTruePredicate.INSTANCE, "Different type to AlwaysTruePredicate");
  }

  /**
   * Method under test: {@link AlwaysTruePredicate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("AlwaysTruePredicate []", AlwaysTruePredicate.INSTANCE.toString());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysTruePredicate#equals(Object)}
   *   <li>{@link AlwaysTruePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AlwaysTruePredicate alwaysTruePredicate = AlwaysTruePredicate.INSTANCE;
    AlwaysTruePredicate alwaysTruePredicate2 = AlwaysTruePredicate.INSTANCE;

    // Act and Assert
    assertEquals(alwaysTruePredicate, alwaysTruePredicate2);
    int expectedHashCodeResult = alwaysTruePredicate.hashCode();
    assertEquals(expectedHashCodeResult, alwaysTruePredicate2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysTruePredicate#equals(Object)}
   *   <li>{@link AlwaysTruePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AlwaysTruePredicate alwaysTruePredicate = AlwaysTruePredicate.INSTANCE;

    // Act and Assert
    assertEquals(alwaysTruePredicate, alwaysTruePredicate);
    int expectedHashCodeResult = alwaysTruePredicate.hashCode();
    assertEquals(expectedHashCodeResult, alwaysTruePredicate.hashCode());
  }
}
