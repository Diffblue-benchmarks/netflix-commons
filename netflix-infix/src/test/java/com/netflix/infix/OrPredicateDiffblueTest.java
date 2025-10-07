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
import java.util.ArrayList;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class OrPredicateDiffblueTest {
  /**
   * Test {@link OrPredicate#OrPredicate(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#OrPredicate(Iterable)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void OrPredicate.<init>(Iterable)"})
  public void testNewOrPredicate_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Predicate<Object>> filters = new ArrayList<>();

    // Act
    OrPredicate actualOrPredicate = new OrPredicate(filters);
    boolean actualApplyResult = actualOrPredicate.apply("Input");

    // Assert
    assertFalse(actualOrPredicate.test("Input"));
    assertFalse(actualApplyResult);
    assertTrue(filters.isEmpty());
  }

  /**
   * Test {@link OrPredicate#OrPredicate(Predicate[])}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return not test {@code Input}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#OrPredicate(Predicate[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void OrPredicate.<init>(Predicate[])"})
  public void testNewOrPredicate_whenPredicate_thenReturnNotTestInput() {
    // Arrange
    Predicate<Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    OrPredicate actualOrPredicate = new OrPredicate(predicates);

    // Assert
    assertEquals(1, predicates.length);
    assertFalse(actualOrPredicate.test("Input"));
    assertFalse(actualOrPredicate.apply("Input"));
  }

  /**
   * Test {@link OrPredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link OrPredicate#OrPredicate(Iterable)} with filters is {@link
   *       ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.apply(Object)"})
  public void testApply_givenOrPredicateWithFiltersIsArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new OrPredicate(new ArrayList<>()).apply("Input"));
  }

  /**
   * Test {@link OrPredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.apply(Object)"})
  public void testApply_givenPredicateApplyReturnTrue_thenReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualApplyResult = new OrPredicate(predicate).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualApplyResult);
  }

  /**
   * Test {@link OrPredicate#toString()}.
   *
   * <p>Method under test: {@link OrPredicate#toString()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String OrPredicate.toString()"})
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "OrEventFilter{orPredicate=Predicates.or()}",
        new OrPredicate(new ArrayList<>()).toString());
  }

  /**
   * Test {@link OrPredicate#equals(Object)}, and {@link OrPredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OrPredicate#equals(Object)}
   *   <li>{@link OrPredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.equals(Object)", "int OrPredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    OrPredicate orPredicate = new OrPredicate(new ArrayList<>());
    OrPredicate orPredicate2 = new OrPredicate(new ArrayList<>());

    // Act and Assert
    assertEquals(orPredicate, orPredicate2);
    assertEquals(orPredicate.hashCode(), orPredicate2.hashCode());
  }

  /**
   * Test {@link OrPredicate#equals(Object)}, and {@link OrPredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OrPredicate#equals(Object)}
   *   <li>{@link OrPredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.equals(Object)", "int OrPredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    OrPredicate orPredicate = new OrPredicate(new ArrayList<>());

    // Act and Assert
    assertEquals(orPredicate, orPredicate);
    int expectedHashCodeResult = orPredicate.hashCode();
    assertEquals(expectedHashCodeResult, orPredicate.hashCode());
  }

  /**
   * Test {@link OrPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.equals(Object)", "int OrPredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    OrPredicate orPredicate = new OrPredicate(mock(Predicate.class));

    // Act and Assert
    assertNotEquals(orPredicate, new OrPredicate(new ArrayList<>()));
  }

  /**
   * Test {@link OrPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.equals(Object)", "int OrPredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    OrPredicate orPredicate = new OrPredicate(new OrPredicate(new ArrayList<>()));

    // Act and Assert
    assertNotEquals(orPredicate, new OrPredicate(mock(Predicate.class)));
  }

  /**
   * Test {@link OrPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.equals(Object)", "int OrPredicate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new OrPredicate(new ArrayList<>()), null);
  }

  /**
   * Test {@link OrPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OrPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OrPredicate.equals(Object)", "int OrPredicate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new OrPredicate(new ArrayList<>()), "Different type to OrPredicate");
  }
}
