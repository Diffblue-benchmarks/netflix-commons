package com.netflix.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HashCodeDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
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

  /**
   * Test {@link HashCode#equalObjects(Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  public void testEqualObjects_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(HashCode.equalObjects(null, "O2"));
  }

  /**
   * Test {@link HashCode#equalObjects(Object, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  public void testEqualObjects_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(HashCode.equalObjects(null, null));
  }

  /**
   * Test {@link HashCode#equalObjects(Object, Object)}.
   * <ul>
   *   <li>When {@code O1}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  public void testEqualObjects_whenO1_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(HashCode.equalObjects("O1", "O2"));
    assertFalse(HashCode.equalObjects("O1", null));
  }

  /**
   * Test {@link HashCode#equalObjects(Object, Object)}.
   * <ul>
   *   <li>When {@code O2}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  public void testEqualObjects_whenO2_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(HashCode.equalObjects("O2", "O2"));
  }

  /**
   * Test {@link HashCode#equals(Object)}, and {@link HashCode#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
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
   * Test {@link HashCode#equals(Object)}, and {@link HashCode#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
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
   * Test {@link HashCode#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
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
   * Test {@link HashCode#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashCode#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new HashCode(), null);
  }

  /**
   * Test {@link HashCode#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashCode#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new HashCode(), "Different type to HashCode");
  }
}
