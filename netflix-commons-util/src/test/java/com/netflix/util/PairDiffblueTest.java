package com.netflix.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class PairDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pair#Pair(Object, Object)}
   *   <li>{@link Pair#setFirst(Object)}
   *   <li>{@link Pair#setSecond(Object)}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    Pair<Object, Object> actualPair = new Pair<>("First", "Second");
    actualPair.setFirst("First");
    actualPair.setSecond("Second");

    // Assert
    assertEquals("First", actualPair.first());
    assertEquals("Second", actualPair.second());
  }

  /**
   * Test {@link Pair#first()}.
   *
   * <p>Method under test: {@link Pair#first()}
   */
  @Test
  public void testFirst() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertEquals("First", pair.first());
  }

  /**
   * Test {@link Pair#second()}.
   *
   * <p>Method under test: {@link Pair#second()}
   */
  @Test
  public void testSecond() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertEquals("Second", pair.second());
  }

  /**
   * Test {@link Pair#equals(Object)}, and {@link Pair#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pair#equals(Object)}
   *   <li>{@link Pair#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");
    Pair<Object, Object> pair2 = new Pair<>("First", "Second");

    // Act and Assert
    assertEquals(pair, pair2);
    int expectedHashCodeResult = pair.hashCode();
    assertEquals(expectedHashCodeResult, pair2.hashCode());
  }

  /**
   * Test {@link Pair#equals(Object)}, and {@link Pair#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pair#equals(Object)}
   *   <li>{@link Pair#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertEquals(pair, pair);
    int expectedHashCodeResult = pair.hashCode();
    assertEquals(expectedHashCodeResult, pair.hashCode());
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>(1, "Second");

    // Act and Assert
    assertNotEquals(pair, new Pair<>("First", "Second"));
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>(new Pair<>("First", "Second"), "Second");

    // Act and Assert
    assertNotEquals(pair, new Pair<>("First", "Second"));
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", 1);

    // Act and Assert
    assertNotEquals(pair, new Pair<>("First", "Second"));
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", new Pair<>("First", "Second"));

    // Act and Assert
    assertNotEquals(pair, new Pair<>("First", "Second"));
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertNotEquals(pair, null);
  }

  /**
   * Test {@link Pair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertNotEquals(pair, "Different type to Pair");
  }
}
