package com.netflix.eventbus.filter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class AlwaysFalseEventFilterDiffblueTest {
  /**
   * Test {@link AlwaysFalseEventFilter#apply(Object)}.
   *
   * <p>Method under test: {@link AlwaysFalseEventFilter#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertFalse(AlwaysFalseEventFilter.INSTANCE.apply("Input"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
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

  /**
   * Test {@link AlwaysFalseEventFilter#serialize()}.
   *
   * <p>Method under test: {@link AlwaysFalseEventFilter#serialize()}
   */
  @Test
  public void testSerialize() {
    // Arrange and Act
    String actualSerializeResult = AlwaysFalseEventFilter.INSTANCE.serialize();

    // Assert
    assertEquals(Boolean.FALSE.toString(), actualSerializeResult);
  }

  /**
   * Test {@link AlwaysFalseEventFilter#equals(Object)}, and {@link
   * AlwaysFalseEventFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
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
   * Test {@link AlwaysFalseEventFilter#equals(Object)}, and {@link
   * AlwaysFalseEventFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
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
   * Test {@link AlwaysFalseEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AlwaysFalseEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalseEventFilter.INSTANCE, 3);
  }

  /**
   * Test {@link AlwaysFalseEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AlwaysFalseEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalseEventFilter.INSTANCE, null);
  }

  /**
   * Test {@link AlwaysFalseEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AlwaysFalseEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysFalseEventFilter.INSTANCE, "Different type to AlwaysFalseEventFilter");
  }
}
