package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AlwaysTruePredicateDiffblueTest {
  /**
   * Test {@link AlwaysTruePredicate#apply(Object)}.
   *
   * <p>Method under test: {@link AlwaysTruePredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AlwaysTruePredicate.apply(Object)"})
  public void testApply() {
    // Arrange, Act and Assert
    assertTrue(AlwaysTruePredicate.INSTANCE.apply("Input"));
  }

  /**
   * Test {@link AlwaysTruePredicate#toString()}.
   *
   * <p>Method under test: {@link AlwaysTruePredicate#toString()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AlwaysTruePredicate.toString()"})
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("AlwaysTruePredicate []", AlwaysTruePredicate.INSTANCE.toString());
  }

  /**
   * Test {@link AlwaysTruePredicate#equals(Object)}, and {@link AlwaysTruePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AlwaysTruePredicate#equals(Object)}
   *   <li>{@link AlwaysTruePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AlwaysTruePredicate.equals(Object)",
    "int AlwaysTruePredicate.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AlwaysTruePredicate alwaysTruePredicate = AlwaysTruePredicate.INSTANCE;
    AlwaysTruePredicate alwaysTruePredicate2 = AlwaysTruePredicate.INSTANCE;

    // Act and Assert
    assertEquals(alwaysTruePredicate, alwaysTruePredicate2);
    assertEquals(alwaysTruePredicate.hashCode(), alwaysTruePredicate2.hashCode());
  }

  /**
   * Test {@link AlwaysTruePredicate#equals(Object)}, and {@link AlwaysTruePredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AlwaysTruePredicate#equals(Object)}
   *   <li>{@link AlwaysTruePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AlwaysTruePredicate.equals(Object)",
    "int AlwaysTruePredicate.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AlwaysTruePredicate alwaysTruePredicate = AlwaysTruePredicate.INSTANCE;

    // Act and Assert
    assertEquals(alwaysTruePredicate, alwaysTruePredicate);
    int expectedHashCodeResult = alwaysTruePredicate.hashCode();
    assertEquals(expectedHashCodeResult, alwaysTruePredicate.hashCode());
  }

  /**
   * Test {@link AlwaysTruePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AlwaysTruePredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AlwaysTruePredicate.equals(Object)",
    "int AlwaysTruePredicate.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTruePredicate.INSTANCE, 3);
  }

  /**
   * Test {@link AlwaysTruePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AlwaysTruePredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AlwaysTruePredicate.equals(Object)",
    "int AlwaysTruePredicate.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTruePredicate.INSTANCE, null);
  }

  /**
   * Test {@link AlwaysTruePredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AlwaysTruePredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AlwaysTruePredicate.equals(Object)",
    "int AlwaysTruePredicate.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AlwaysTruePredicate.INSTANCE, "Different type to AlwaysTruePredicate");
  }
}
