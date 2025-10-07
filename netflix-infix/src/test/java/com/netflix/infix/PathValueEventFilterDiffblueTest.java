package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PathValueEventFilterDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PathValueEventFilter#PathValueEventFilter(String, ValuePredicate)}
   *   <li>{@link PathValueEventFilter#toString()}
   *   <li>{@link PathValueEventFilter#getPredicate()}
   *   <li>{@link PathValueEventFilter#getXpath()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PathValueEventFilter.<init>(String, ValuePredicate)",
    "ValuePredicate PathValueEventFilter.getPredicate()",
    "String PathValueEventFilter.getXpath()",
    "String PathValueEventFilter.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    PathValueEventFilter<Object> actualPathValueEventFilter =
        new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);
    String actualToStringResult = actualPathValueEventFilter.toString();
    ValuePredicate<?> actualPredicate = actualPathValueEventFilter.getPredicate();

    // Assert
    assertTrue(actualPredicate instanceof NullValuePredicate);
    assertEquals("Path", actualPathValueEventFilter.getXpath());
    assertEquals(
        "PathValueEventFilter [xpath=Path, predicate=NullValuePredicate []]", actualToStringResult);
  }

  /**
   * Test {@link PathValueEventFilter#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link PathValueEventFilter#PathValueEventFilter(String, ValuePredicate)} with
   *       {@code Path} and predicate is {@link NullValuePredicate#INSTANCE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PathValueEventFilter#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PathValueEventFilter.apply(Object)"})
  public void testApply_givenPathValueEventFilterWithPathAndPredicateIsInstance_thenReturnTrue() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertTrue(pathValueEventFilter.apply("Input"));
  }

  /**
   * Test {@link PathValueEventFilter#apply(Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PathValueEventFilter#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PathValueEventFilter.apply(Object)"})
  public void testApply_thenReturnFalse() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>("42", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertFalse(pathValueEventFilter.apply("Input"));
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}, and {@link PathValueEventFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PathValueEventFilter#equals(Object)}
   *   <li>{@link PathValueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);
    PathValueEventFilter<Object> pathValueEventFilter2 =
        new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertEquals(pathValueEventFilter, pathValueEventFilter2);
    assertEquals(pathValueEventFilter.hashCode(), pathValueEventFilter2.hashCode());
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}, and {@link PathValueEventFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PathValueEventFilter#equals(Object)}
   *   <li>{@link PathValueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>(null, NullValuePredicate.INSTANCE);
    PathValueEventFilter<Object> pathValueEventFilter2 =
        new PathValueEventFilter<>(null, NullValuePredicate.INSTANCE);

    // Act and Assert
    assertEquals(pathValueEventFilter, pathValueEventFilter2);
    assertEquals(pathValueEventFilter.hashCode(), pathValueEventFilter2.hashCode());
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}, and {@link PathValueEventFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PathValueEventFilter#equals(Object)}
   *   <li>{@link PathValueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", null);
    PathValueEventFilter<Object> pathValueEventFilter2 = new PathValueEventFilter<>("Path", null);

    // Act and Assert
    assertEquals(pathValueEventFilter, pathValueEventFilter2);
    assertEquals(pathValueEventFilter.hashCode(), pathValueEventFilter2.hashCode());
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}, and {@link PathValueEventFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PathValueEventFilter#equals(Object)}
   *   <li>{@link PathValueEventFilter#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertEquals(pathValueEventFilter, pathValueEventFilter);
    int expectedHashCodeResult = pathValueEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, pathValueEventFilter.hashCode());
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>(null, NullValuePredicate.INSTANCE);

    // Act and Assert
    assertNotEquals(
        pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>("42", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertNotEquals(
        pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>("Path", new StringValuePredicate("42"));

    // Act and Assert
    assertNotEquals(
        pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter = new PathValueEventFilter<>("Path", null);

    // Act and Assert
    assertNotEquals(
        pathValueEventFilter, new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE));
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertNotEquals(pathValueEventFilter, null);
  }

  /**
   * Test {@link PathValueEventFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PathValueEventFilter#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PathValueEventFilter.equals(Object)",
    "int PathValueEventFilter.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    PathValueEventFilter<Object> pathValueEventFilter =
        new PathValueEventFilter<>("Path", NullValuePredicate.INSTANCE);

    // Act and Assert
    assertNotEquals(pathValueEventFilter, "Different type to PathValueEventFilter");
  }
}
