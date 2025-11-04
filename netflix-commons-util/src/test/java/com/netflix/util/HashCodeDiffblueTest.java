package com.netflix.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HashCodeDiffblueTest {
  /**
   * Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  public void testEqualObjects() {
    // Arrange, Act and Assert
    assertFalse(HashCode.equalObjects("O1", "O2"));
    assertTrue(HashCode.equalObjects("O2", "O2"));
    assertFalse(HashCode.equalObjects(null, "O2"));
    assertFalse(HashCode.equalObjects("O1", null));
    assertTrue(HashCode.equalObjects(null, null));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link HashCode#equals(Object)}
   *   <li>{@link HashCode#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashCode hashCode = new HashCode();
    HashCode hashCode2 = new HashCode();

    // Act and Assert
    assertEquals(hashCode, hashCode2);
    int expectedHashCodeResult = hashCode.hashCode();
    assertEquals(expectedHashCodeResult, hashCode2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link HashCode#equals(Object)}
   *   <li>{@link HashCode#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(hashCode, hashCode);
    int expectedHashCodeResult = hashCode.hashCode();
    assertEquals(expectedHashCodeResult, hashCode.hashCode());
  }

  /**
   * Method under test: {@link HashCode#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashCode hashCode = new HashCode();
    hashCode.addValue("Obj");

    // Act and Assert
    assertNotEquals(hashCode, new HashCode());
  }

  /**
   * Method under test: {@link HashCode#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new HashCode(), null);
  }

  /**
   * Method under test: {@link HashCode#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new HashCode(), "Different type to HashCode");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link HashCode}
   *   <li>{@link HashCode#toString()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("{HashCode 17}", (new HashCode()).toString());
  }
}
