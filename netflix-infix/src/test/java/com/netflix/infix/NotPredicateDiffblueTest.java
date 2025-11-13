package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.base.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class NotPredicateDiffblueTest {
  /**
   * Test {@link NotPredicate#NotPredicate(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return test {@code Input}.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#NotPredicate(Predicate)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void NotPredicate.<init>(Predicate)"})
  public void testNewNotPredicate_whenPredicate_thenReturnTestInput() {
    // Arrange and Act
    NotPredicate actualNotPredicate = new NotPredicate(mock(Predicate.class));

    // Assert
    assertTrue(actualNotPredicate.test("Input"));
    assertTrue(actualNotPredicate.apply("Input"));
  }

  /**
   * Test {@link NotPredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code false}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.apply(Object)"})
  public void testApply_givenPredicateApplyReturnFalse_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualApplyResult = new NotPredicate(predicate).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualApplyResult);
  }

  /**
   * Test {@link NotPredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code true}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.apply(Object)"})
  public void testApply_givenPredicateApplyReturnTrue_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualApplyResult = new NotPredicate(predicate).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertFalse(actualApplyResult);
  }

  /**
   * Test {@link NotPredicate#equals(Object)}, and {@link NotPredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NotPredicate#equals(Object)}
   *   <li>{@link NotPredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.equals(Object)", "int NotPredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NotPredicate notPredicate = new NotPredicate(AlwaysFalsePredicate.INSTANCE);
    NotPredicate notPredicate2 = new NotPredicate(AlwaysFalsePredicate.INSTANCE);

    // Act and Assert
    assertEquals(notPredicate, notPredicate2);
    assertEquals(notPredicate.hashCode(), notPredicate2.hashCode());
  }

  /**
   * Test {@link NotPredicate#equals(Object)}, and {@link NotPredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NotPredicate#equals(Object)}
   *   <li>{@link NotPredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.equals(Object)", "int NotPredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NotPredicate notPredicate = new NotPredicate(mock(Predicate.class));

    // Act and Assert
    assertEquals(notPredicate, notPredicate);
    int expectedHashCodeResult = notPredicate.hashCode();
    assertEquals(expectedHashCodeResult, notPredicate.hashCode());
  }

  /**
   * Test {@link NotPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.equals(Object)", "int NotPredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    NotPredicate notPredicate = new NotPredicate(mock(Predicate.class));

    // Act and Assert
    assertNotEquals(notPredicate, new NotPredicate(mock(Predicate.class)));
  }

  /**
   * Test {@link NotPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.equals(Object)", "int NotPredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    NotPredicate predicate = new NotPredicate(mock(Predicate.class));
    NotPredicate notPredicate = new NotPredicate(predicate);

    // Act and Assert
    assertNotEquals(notPredicate, new NotPredicate(mock(Predicate.class)));
  }

  /**
   * Test {@link NotPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.equals(Object)", "int NotPredicate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NotPredicate(mock(Predicate.class)), null);
  }

  /**
   * Test {@link NotPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NotPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NotPredicate.equals(Object)", "int NotPredicate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NotPredicate(mock(Predicate.class)), "Different type to NotPredicate");
  }
}
