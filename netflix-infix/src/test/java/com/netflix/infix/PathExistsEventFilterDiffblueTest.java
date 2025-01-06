package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PathExistsEventFilterDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PathExistsEventFilter#PathExistsEventFilter(String)}
   *   <li>{@link PathExistsEventFilter#toString()}
   *   <li>{@link PathExistsEventFilter#getXpath()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    PathExistsEventFilter actualPathExistsEventFilter = new PathExistsEventFilter("0123456789ABCDEF");
    String actualToStringResult = actualPathExistsEventFilter.toString();

    // Assert
    assertEquals("0123456789ABCDEF", actualPathExistsEventFilter.getXpath());
    assertEquals("PathExistsEventFilter [xpath=0123456789ABCDEF]", actualToStringResult);
  }

  /**
   * Test {@link PathExistsEventFilter#apply(Object)}.
   * <ul>
   *   <li>Given {@link PathExistsEventFilter#PathExistsEventFilter(String)} with
   * path is {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PathExistsEventFilter#apply(Object)}
   */
  @Test
  public void testApply_givenPathExistsEventFilterWithPathIs42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new PathExistsEventFilter("42")).apply("Input"));
  }

  /**
   * Test {@link PathExistsEventFilter#apply(Object)}.
   * <ul>
   *   <li>Given {@link PathExistsEventFilter#PathExistsEventFilter(String)} with
   * {@code Path}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PathExistsEventFilter#apply(Object)}
   */
  @Test
  public void testApply_givenPathExistsEventFilterWithPath_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new PathExistsEventFilter("Path")).apply("Input"));
  }

  /**
   * Test {@link PathExistsEventFilter#equals(Object)}, and
   * {@link PathExistsEventFilter#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PathExistsEventFilter#equals(Object)}
   *   <li>{@link PathExistsEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PathExistsEventFilter pathExistsEventFilter = new PathExistsEventFilter("0123456789ABCDEF");
    PathExistsEventFilter pathExistsEventFilter2 = new PathExistsEventFilter("0123456789ABCDEF");

    // Act and Assert
    assertEquals(pathExistsEventFilter, pathExistsEventFilter2);
    int expectedHashCodeResult = pathExistsEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, pathExistsEventFilter2.hashCode());
  }

  /**
   * Test {@link PathExistsEventFilter#equals(Object)}, and
   * {@link PathExistsEventFilter#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PathExistsEventFilter#equals(Object)}
   *   <li>{@link PathExistsEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    PathExistsEventFilter pathExistsEventFilter = new PathExistsEventFilter(null);
    PathExistsEventFilter pathExistsEventFilter2 = new PathExistsEventFilter(null);

    // Act and Assert
    assertEquals(pathExistsEventFilter, pathExistsEventFilter2);
    int expectedHashCodeResult = pathExistsEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, pathExistsEventFilter2.hashCode());
  }

  /**
   * Test {@link PathExistsEventFilter#equals(Object)}, and
   * {@link PathExistsEventFilter#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PathExistsEventFilter#equals(Object)}
   *   <li>{@link PathExistsEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PathExistsEventFilter pathExistsEventFilter = new PathExistsEventFilter("0123456789ABCDEF");

    // Act and Assert
    assertEquals(pathExistsEventFilter, pathExistsEventFilter);
    int expectedHashCodeResult = pathExistsEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, pathExistsEventFilter.hashCode());
  }

  /**
   * Test {@link PathExistsEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PathExistsEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    PathExistsEventFilter pathExistsEventFilter = new PathExistsEventFilter("Path");

    // Act and Assert
    assertNotEquals(pathExistsEventFilter, new PathExistsEventFilter("0123456789ABCDEF"));
  }

  /**
   * Test {@link PathExistsEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PathExistsEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    PathExistsEventFilter pathExistsEventFilter = new PathExistsEventFilter(null);

    // Act and Assert
    assertNotEquals(pathExistsEventFilter, new PathExistsEventFilter("0123456789ABCDEF"));
  }

  /**
   * Test {@link PathExistsEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PathExistsEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PathExistsEventFilter("0123456789ABCDEF"), null);
  }

  /**
   * Test {@link PathExistsEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PathExistsEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PathExistsEventFilter("0123456789ABCDEF"), "Different type to PathExistsEventFilter");
  }
}
