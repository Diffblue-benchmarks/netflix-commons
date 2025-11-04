package com.netflix.eventbus.filter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AlwaysTrueEventFilterDiffblueTest {
  /**
   * Method under test: {@link AlwaysTrueEventFilter#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertTrue(AlwaysTrueEventFilter.INSTANCE.apply("Input"));
  }

  /**
   * Method under test: {@link AlwaysTrueEventFilter#serialize()}
   */
  @Test
  public void testSerialize() {
    // Arrange and Act
    String actualSerializeResult = AlwaysTrueEventFilter.INSTANCE.serialize();

    // Assert
    assertEquals(Boolean.TRUE.toString(), actualSerializeResult);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysTrueEventFilter#equals(Object)}
   *   <li>{@link AlwaysTrueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AlwaysTrueEventFilter alwaysTrueEventFilter = AlwaysTrueEventFilter.INSTANCE;
    AlwaysTrueEventFilter alwaysTrueEventFilter2 = AlwaysTrueEventFilter.INSTANCE;

    // Act and Assert
    assertEquals(alwaysTrueEventFilter, alwaysTrueEventFilter2);
    int expectedHashCodeResult = alwaysTrueEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, alwaysTrueEventFilter2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysTrueEventFilter#equals(Object)}
   *   <li>{@link AlwaysTrueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AlwaysTrueEventFilter alwaysTrueEventFilter = AlwaysTrueEventFilter.INSTANCE;

    // Act and Assert
    assertEquals(alwaysTrueEventFilter, alwaysTrueEventFilter);
    int expectedHashCodeResult = alwaysTrueEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, alwaysTrueEventFilter.hashCode());
  }

  /**
   * Method under test: {@link AlwaysTrueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTrueEventFilter.INSTANCE, 3);
  }

  /**
   * Method under test: {@link AlwaysTrueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTrueEventFilter.INSTANCE, null);
  }

  /**
   * Method under test: {@link AlwaysTrueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTrueEventFilter.INSTANCE, "Different type to AlwaysTrueEventFilter");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysTrueEventFilter#toString()}
   *   <li>{@link AlwaysTrueEventFilter#getLanguage()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    AlwaysTrueEventFilter alwaysTrueEventFilter = AlwaysTrueEventFilter.INSTANCE;

    // Act
    String actualToStringResult = alwaysTrueEventFilter.toString();

    // Assert
    assertEquals("AlwaysTrueEventFilter []", actualToStringResult);
    assertEquals("Constant", alwaysTrueEventFilter.getLanguage());
  }
}
