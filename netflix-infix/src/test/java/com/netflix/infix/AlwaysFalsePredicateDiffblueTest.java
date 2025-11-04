package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class AlwaysFalsePredicateDiffblueTest {
  /**
   * Method under test: {@link AlwaysFalsePredicate#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertFalse(AlwaysFalsePredicate.INSTANCE.apply("Input"));
  }

  /**
   * Method under test: {@link AlwaysFalsePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalsePredicate.INSTANCE, 3);
  }

  /**
   * Method under test: {@link AlwaysFalsePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalsePredicate.INSTANCE, null);
  }

  /**
   * Method under test: {@link AlwaysFalsePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalsePredicate.INSTANCE, "Different type to AlwaysFalsePredicate");
  }

  /**
   * Method under test: {@link AlwaysFalsePredicate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("AlwaysFalsePredicate []", AlwaysFalsePredicate.INSTANCE.toString());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysFalsePredicate#equals(Object)}
   *   <li>{@link AlwaysFalsePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AlwaysFalsePredicate alwaysFalsePredicate = AlwaysFalsePredicate.INSTANCE;
    AlwaysFalsePredicate alwaysFalsePredicate2 = AlwaysFalsePredicate.INSTANCE;

    // Act and Assert
    assertEquals(alwaysFalsePredicate, alwaysFalsePredicate2);
    int expectedHashCodeResult = alwaysFalsePredicate.hashCode();
    assertEquals(expectedHashCodeResult, alwaysFalsePredicate2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysFalsePredicate#equals(Object)}
   *   <li>{@link AlwaysFalsePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AlwaysFalsePredicate alwaysFalsePredicate = AlwaysFalsePredicate.INSTANCE;

    // Act and Assert
    assertEquals(alwaysFalsePredicate, alwaysFalsePredicate);
    int expectedHashCodeResult = alwaysFalsePredicate.hashCode();
    assertEquals(expectedHashCodeResult, alwaysFalsePredicate.hashCode());
  }
}
