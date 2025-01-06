package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class AlwaysFalsePredicateDiffblueTest {
  /**
   * Test {@link AlwaysFalsePredicate#apply(Object)}.
   * <p>
   * Method under test: {@link AlwaysFalsePredicate#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertFalse(AlwaysFalsePredicate.INSTANCE.apply("Input"));
  }

  /**
   * Test {@link AlwaysFalsePredicate#toString()}.
   * <p>
   * Method under test: {@link AlwaysFalsePredicate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("AlwaysFalsePredicate []", AlwaysFalsePredicate.INSTANCE.toString());
  }

  /**
   * Test {@link AlwaysFalsePredicate#equals(Object)}, and
   * {@link AlwaysFalsePredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
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
   * Test {@link AlwaysFalsePredicate#equals(Object)}, and
   * {@link AlwaysFalsePredicate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
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

  /**
   * Test {@link AlwaysFalsePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AlwaysFalsePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalsePredicate.INSTANCE, 3);
  }

  /**
   * Test {@link AlwaysFalsePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AlwaysFalsePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalsePredicate.INSTANCE, null);
  }

  /**
   * Test {@link AlwaysFalsePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AlwaysFalsePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalsePredicate.INSTANCE, "Different type to AlwaysFalsePredicate");
  }
}
