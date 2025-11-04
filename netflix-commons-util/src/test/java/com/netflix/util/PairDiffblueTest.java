package com.netflix.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class PairDiffblueTest {
  /**
   * Method under test: {@link Pair#first()}
   */
  @Test
  public void testFirst() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertEquals("First", pair.first());
  }

  /**
   * Method under test: {@link Pair#second()}
   */
  @Test
  public void testSecond() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertEquals("Second", pair.second());
  }

  /**
   * Methods under test:
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
   * Methods under test:
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
   * Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>(1, "Second");

    // Act and Assert
    assertNotEquals(pair, new Pair<>("First", "Second"));
  }

  /**
   * Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", 1);

    // Act and Assert
    assertNotEquals(pair, new Pair<>("First", "Second"));
  }

  /**
   * Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertNotEquals(pair, null);
  }

  /**
   * Method under test: {@link Pair#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Pair<Object, Object> pair = new Pair<>("First", "Second");

    // Act and Assert
    assertNotEquals(pair, "Different type to Pair");
  }

  /**
   * Methods under test:
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
}
