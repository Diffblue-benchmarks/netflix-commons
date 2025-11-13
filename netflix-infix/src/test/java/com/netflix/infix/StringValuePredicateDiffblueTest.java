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

public class StringValuePredicateDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringValuePredicate#StringValuePredicate(String)}
   *   <li>{@link StringValuePredicate#toString()}
   *   <li>{@link StringValuePredicate#getValue()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void StringValuePredicate.<init>(String)",
    "String StringValuePredicate.getValue()",
    "String StringValuePredicate.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    StringValuePredicate actualStringValuePredicate = new StringValuePredicate("42");
    String actualToStringResult = actualStringValuePredicate.toString();

    // Assert
    assertEquals("42", actualStringValuePredicate.getValue());
    assertEquals("StringValuePredicate [value=42]", actualToStringResult);
  }

  /**
   * Test {@link StringValuePredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link StringValuePredicate#StringValuePredicate(String)} with value is {@code 42}.
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link StringValuePredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringValuePredicate.apply(Object)"})
  public void testApply_givenStringValuePredicateWithValueIs42_when42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new StringValuePredicate("42").apply("42"));
  }

  /**
   * Test {@link StringValuePredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link StringValuePredicate#StringValuePredicate(String)} with value is {@code 42}.
   *   <li>When {@code Input}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StringValuePredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringValuePredicate.apply(Object)"})
  public void testApply_givenStringValuePredicateWithValueIs42_whenInput_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new StringValuePredicate("42").apply("Input"));
  }

  /**
   * Test {@link StringValuePredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link StringValuePredicate#StringValuePredicate(String)} with value is {@code
   *       null}.
   *   <li>When {@code Input}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StringValuePredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringValuePredicate.apply(Object)"})
  public void testApply_givenStringValuePredicateWithValueIsNull_whenInput_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new StringValuePredicate(null).apply("Input"));
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}, and {@link StringValuePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringValuePredicate#equals(Object)}
   *   <li>{@link StringValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StringValuePredicate.equals(Object)",
    "int StringValuePredicate.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate("42");
    StringValuePredicate stringValuePredicate2 = new StringValuePredicate("42");

    // Act and Assert
    assertEquals(stringValuePredicate, stringValuePredicate2);
    assertEquals(stringValuePredicate.hashCode(), stringValuePredicate2.hashCode());
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}, and {@link StringValuePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringValuePredicate#equals(Object)}
   *   <li>{@link StringValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StringValuePredicate.equals(Object)",
    "int StringValuePredicate.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate(null);
    StringValuePredicate stringValuePredicate2 = new StringValuePredicate(null);

    // Act and Assert
    assertEquals(stringValuePredicate, stringValuePredicate2);
    assertEquals(stringValuePredicate.hashCode(), stringValuePredicate2.hashCode());
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}, and {@link StringValuePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringValuePredicate#equals(Object)}
   *   <li>{@link StringValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StringValuePredicate.equals(Object)",
    "int StringValuePredicate.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate("42");

    // Act and Assert
    assertEquals(stringValuePredicate, stringValuePredicate);
    int expectedHashCodeResult = stringValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, stringValuePredicate.hashCode());
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringValuePredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StringValuePredicate.equals(Object)",
    "int StringValuePredicate.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate("Value");

    // Act and Assert
    assertNotEquals(stringValuePredicate, new StringValuePredicate("42"));
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringValuePredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StringValuePredicate.equals(Object)",
    "int StringValuePredicate.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    StringValuePredicate stringValuePredicate = new StringValuePredicate(null);

    // Act and Assert
    assertNotEquals(stringValuePredicate, new StringValuePredicate("42"));
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringValuePredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StringValuePredicate.equals(Object)",
    "int StringValuePredicate.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringValuePredicate("42"), null);
  }

  /**
   * Test {@link StringValuePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringValuePredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StringValuePredicate.equals(Object)",
    "int StringValuePredicate.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringValuePredicate("42"), "Different type to StringValuePredicate");
  }
}
