package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NullValuePredicateDiffblueTest {
  /**
   * Test {@link NullValuePredicate#apply(Object)}.
   *
   * <ul>
   *   <li>When {@code Input}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NullValuePredicate#apply(Object)}
   */
  @Test
  public void testApply_whenInput_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(NullValuePredicate.INSTANCE.apply("Input"));
  }

  /**
   * Test {@link NullValuePredicate#apply(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NullValuePredicate#apply(Object)}
   */
  @Test
  public void testApply_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(NullValuePredicate.INSTANCE.apply(null));
  }

  /**
   * Test {@link NullValuePredicate#toString()}.
   *
   * <p>Method under test: {@link NullValuePredicate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NullValuePredicate []", NullValuePredicate.INSTANCE.toString());
  }

  /**
   * Test {@link NullValuePredicate#equals(Object)}, and {@link NullValuePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
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
   * Test {@link NullValuePredicate#equals(Object)}, and {@link NullValuePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
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

  /**
   * Test {@link NullValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, 3);
  }

  /**
   * Test {@link NullValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, null);
  }

  /**
   * Test {@link NullValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, "Different type to NullValuePredicate");
  }
}
