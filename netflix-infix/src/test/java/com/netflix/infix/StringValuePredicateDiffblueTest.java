package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringValuePredicateDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StringValuePredicate#StringValuePredicate(String)}
   *   <li>{@link StringValuePredicate#toString()}
   *   <li>{@link StringValuePredicate#getValue()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    StringValuePredicate actualStringValuePredicate = new StringValuePredicate("42");
    String actualToStringResult = actualStringValuePredicate.toString();

    // Assert
    assertEquals("42", actualStringValuePredicate.getValue());
    assertEquals("StringValuePredicate [value=42]", actualToStringResult);
  }

  /**
   * Test {@link StringValuePredicate#apply(Object)}.
   * <ul>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringValuePredicate#apply(Object)}
   */
  @Test
  public void testApply_when42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new StringValuePredicate("42")).apply("42"));
  }

  /**
   * Test {@link StringValuePredicate#apply(Object)}.
   * <ul>
   *   <li>When {@code Input}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringValuePredicate#apply(Object)}
   */
  @Test
  public void testApply_whenInput_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse((new StringValuePredicate("42")).apply("Input"));
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}, and
   * {@link StringValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StringValuePredicate#equals(Object)}
   *   <li>{@link StringValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate("42");
    StringValuePredicate stringValuePredicate2 = new StringValuePredicate("42");

    // Act and Assert
    assertEquals(stringValuePredicate, stringValuePredicate2);
    int expectedHashCodeResult = stringValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, stringValuePredicate2.hashCode());
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}, and
   * {@link StringValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StringValuePredicate#equals(Object)}
   *   <li>{@link StringValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate(null);
    StringValuePredicate stringValuePredicate2 = new StringValuePredicate(null);

    // Act and Assert
    assertEquals(stringValuePredicate, stringValuePredicate2);
    int expectedHashCodeResult = stringValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, stringValuePredicate2.hashCode());
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}, and
   * {@link StringValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StringValuePredicate#equals(Object)}
   *   <li>{@link StringValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate("42");

    // Act and Assert
    assertEquals(stringValuePredicate, stringValuePredicate);
    int expectedHashCodeResult = stringValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, stringValuePredicate.hashCode());
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate("Value");

    // Act and Assert
    assertNotEquals(stringValuePredicate, new StringValuePredicate("42"));
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate(null);

    // Act and Assert
    assertNotEquals(stringValuePredicate, new StringValuePredicate("42"));
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringValuePredicate("42"), null);
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringValuePredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringValuePredicate("42"), "Different type to StringValuePredicate");
  }
}
