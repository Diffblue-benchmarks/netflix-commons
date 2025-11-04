package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import org.junit.Test;

public class PathValueEventFilterDiffblueTest {
  /**
   * Method under test: {@link PathValueEventFilter#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertTrue(pathValueEventFilter.apply("Input"));
  }

  /**
   * Method under test: {@link PathValueEventFilter#apply(Object)}
   */
  @Test
  public void testApply2() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("42", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertFalse(pathValueEventFilter.apply("Input"));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PathValueEventFilter#equals(Object)}
   *   <li>{@link PathValueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);
    PathValueEventFilter<Object> pathValueEventFilter2 = new PathValueEventFilter<>("Path",
        NullValuePredicate.INSTANCE);

    // Act and Assert
    assertEquals(pathValueEventFilter, pathValueEventFilter2);
    int expectedHashCodeResult = pathValueEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, pathValueEventFilter2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PathValueEventFilter#equals(Object)}
   *   <li>{@link PathValueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>(null, NullValuePredicate.INSTANCE);
    PathValueEventFilter<Object> pathValueEventFilter2 = new PathValueEventFilter<>(null, NullValuePredicate.INSTANCE);

    // Act and Assert
    assertEquals(pathValueEventFilter, pathValueEventFilter2);
    int expectedHashCodeResult = pathValueEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, pathValueEventFilter2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PathValueEventFilter#equals(Object)}
   *   <li>{@link PathValueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", null);
    PathValueEventFilter<Object> pathValueEventFilter2 = new PathValueEventFilter<>("Path", null);

    // Act and Assert
    assertEquals(pathValueEventFilter, pathValueEventFilter2);
    int expectedHashCodeResult = pathValueEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, pathValueEventFilter2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PathValueEventFilter#equals(Object)}
   *   <li>{@link PathValueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertEquals(pathValueEventFilter, pathValueEventFilter);
    int expectedHashCodeResult = pathValueEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, pathValueEventFilter.hashCode());
  }

  /**
   * Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>(null, NullValuePredicate.INSTANCE);

    // Act and Assert
    assertNotEquals(pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("42", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertNotEquals(pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path",
        new StringValuePredicate("42"));

    // Act and Assert
    assertNotEquals(pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", null);

    // Act and Assert
    assertNotEquals(pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", mock(ValuePredicate.class));

    // Act and Assert
    assertNotEquals(pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertNotEquals(pathValueEventFilter, null);
  }

  /**
   * Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertNotEquals(pathValueEventFilter, "Different type to PathValueEventFilter");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link PathValueEventFilter#PathValueEventFilter(String, ValuePredicate)}
   *   <li>{@link PathValueEventFilter#toString()}
   *   <li>{@link PathValueEventFilter#getPredicate()}
   *   <li>{@link PathValueEventFilter#getXpath()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    PathValueEventFilter<Object> actualPathValueEventFilter = new PathValueEventFilter<>("Path",
        NullValuePredicate.INSTANCE);
    String actualToStringResult = actualPathValueEventFilter.toString();
    ValuePredicate<?> actualPredicate = actualPathValueEventFilter.getPredicate();

    // Assert
    assertTrue(actualPredicate instanceof NullValuePredicate);
    assertEquals("Path", actualPathValueEventFilter.getXpath());
    assertEquals("PathValueEventFilter [xpath=Path, predicate=NullValuePredicate []]", actualToStringResult);
  }
}
