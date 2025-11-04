package com.netflix.eventbus.filter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class AlwaysFalseEventFilterDiffblueTest {
  /**
   * Method under test: {@link AlwaysFalseEventFilter#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertFalse(AlwaysFalseEventFilter.INSTANCE.apply("Input"));
  }

  /**
   * Method under test: {@link AlwaysFalseEventFilter#serialize()}
   */
  @Test
  public void testSerialize() {
    // Arrange and Act
    String actualSerializeResult = AlwaysFalseEventFilter.INSTANCE.serialize();

    // Assert
    assertEquals(Boolean.FALSE.toString(), actualSerializeResult);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysFalseEventFilter#equals(Object)}
   *   <li>{@link AlwaysFalseEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AlwaysFalseEventFilter alwaysFalseEventFilter = AlwaysFalseEventFilter.INSTANCE;
    AlwaysFalseEventFilter alwaysFalseEventFilter2 = AlwaysFalseEventFilter.INSTANCE;

    // Act and Assert
    assertEquals(alwaysFalseEventFilter, alwaysFalseEventFilter2);
    int expectedHashCodeResult = alwaysFalseEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, alwaysFalseEventFilter2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysFalseEventFilter#equals(Object)}
   *   <li>{@link AlwaysFalseEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AlwaysFalseEventFilter alwaysFalseEventFilter = AlwaysFalseEventFilter.INSTANCE;

    // Act and Assert
    assertEquals(alwaysFalseEventFilter, alwaysFalseEventFilter);
    int expectedHashCodeResult = alwaysFalseEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, alwaysFalseEventFilter.hashCode());
  }

  /**
   * Method under test: {@link AlwaysFalseEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalseEventFilter.INSTANCE, 3);
  }

  /**
   * Method under test: {@link AlwaysFalseEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalseEventFilter.INSTANCE, null);
  }

  /**
   * Method under test: {@link AlwaysFalseEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalseEventFilter.INSTANCE, "Different type to AlwaysFalseEventFilter");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AlwaysFalseEventFilter#toString()}
   *   <li>{@link AlwaysFalseEventFilter#getLanguage()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    AlwaysFalseEventFilter alwaysFalseEventFilter = AlwaysFalseEventFilter.INSTANCE;

    // Act
    String actualToStringResult = alwaysFalseEventFilter.toString();

    // Assert
    assertEquals("AlwaysFalseEventFilter []", actualToStringResult);
    assertEquals("Constant", alwaysFalseEventFilter.getLanguage());
  }
}
