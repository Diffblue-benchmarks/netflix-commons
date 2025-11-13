package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
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

public class AndPredicateDiffblueTest {
  /**
   * Test {@link AndPredicate#AndPredicate(Predicate[])}.
   *
   * <ul>
   *   <li>Then first element {@link AlwaysTruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#AndPredicate(Predicate[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void AndPredicate.<init>(Predicate[])"})
  public void testNewAndPredicate_thenFirstElementAlwaysTruePredicate() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());
    Predicate<Object>[] predicates = new Predicate[] {AlwaysTruePredicate.INSTANCE, andPredicate};

    // Act
    AndPredicate actualAndPredicate = new AndPredicate(predicates);
    boolean actualApplyResult = actualAndPredicate.apply("Input");

    // Assert
    Predicate<Object> predicate = predicates[0];
    assertTrue(predicate instanceof AlwaysTruePredicate);
    Predicate<Object> predicate2 = predicates[1];
    assertTrue(predicate2 instanceof AndPredicate);
    assertEquals(2, predicates.length);
    assertTrue(predicate.apply("Input"));
    assertTrue(actualAndPredicate.test("Input"));
    assertTrue(predicate.test("Input"));
    assertTrue(predicate2.test("Input"));
    assertTrue(actualApplyResult);
    assertSame(andPredicate, predicate2);
  }

  /**
   * Test {@link AndPredicate#AndPredicate(Predicate[])}.
   *
   * <ul>
   *   <li>Then first element {@link AndPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#AndPredicate(Predicate[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void AndPredicate.<init>(Predicate[])"})
  public void testNewAndPredicate_thenFirstElementAndPredicate() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());
    AndPredicate andPredicate2 = new AndPredicate(new ArrayList<>());
    Predicate<Object>[] predicates = new Predicate[] {andPredicate, andPredicate2};

    // Act
    AndPredicate actualAndPredicate = new AndPredicate(predicates);
    boolean actualApplyResult = actualAndPredicate.apply("Input");

    // Assert
    Predicate<Object> predicate = predicates[0];
    assertTrue(predicate instanceof AndPredicate);
    assertEquals(2, predicates.length);
    assertTrue(actualAndPredicate.test("Input"));
    assertTrue(predicate.test("Input"));
    assertTrue(actualApplyResult);
    assertSame(andPredicate, predicate);
    assertSame(andPredicate2, predicates[1]);
  }

  /**
   * Test {@link AndPredicate#AndPredicate(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#AndPredicate(Iterable)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void AndPredicate.<init>(Iterable)"})
  public void testNewAndPredicate_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Predicate<Object>> predicates = new ArrayList<>();

    // Act
    AndPredicate actualAndPredicate = new AndPredicate(predicates);
    boolean actualApplyResult = actualAndPredicate.apply("Input");

    // Assert
    assertTrue(actualAndPredicate.test("Input"));
    assertTrue(actualApplyResult);
    assertTrue(predicates.isEmpty());
  }

  /**
   * Test {@link AndPredicate#AndPredicate(Predicate[])}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#AndPredicate(Predicate[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void AndPredicate.<init>(Predicate[])"})
  public void testNewAndPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<Object>[] predicates = new Predicate[] {mock(Predicate.class)};

    // Act
    AndPredicate actualAndPredicate = new AndPredicate(predicates);

    // Assert
    assertEquals(1, predicates.length);
    assertFalse(actualAndPredicate.test("Input"));
    assertFalse(actualAndPredicate.apply("Input"));
  }

  /**
   * Test {@link AndPredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link AndPredicate#AndPredicate(Iterable)} with predicates is {@link
   *       ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.apply(Object)"})
  public void testApply_givenAndPredicateWithPredicatesIsArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new AndPredicate(new ArrayList<>()).apply("Input"));
  }

  /**
   * Test {@link AndPredicate#apply(Object)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#apply(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.apply(Object)"})
  public void testApply_givenPredicateApplyReturnFalse_thenReturnFalse() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualApplyResult = new AndPredicate(predicate).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertFalse(actualApplyResult);
  }

  /**
   * Test {@link AndPredicate#equals(Object)}, and {@link AndPredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AndPredicate#equals(Object)}
   *   <li>{@link AndPredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.equals(Object)", "int AndPredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());
    AndPredicate andPredicate2 = new AndPredicate(new ArrayList<>());

    // Act and Assert
    assertEquals(andPredicate, andPredicate2);
    assertEquals(andPredicate.hashCode(), andPredicate2.hashCode());
  }

  /**
   * Test {@link AndPredicate#equals(Object)}, and {@link AndPredicate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AndPredicate#equals(Object)}
   *   <li>{@link AndPredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.equals(Object)", "int AndPredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());

    // Act and Assert
    assertEquals(andPredicate, andPredicate);
    int expectedHashCodeResult = andPredicate.hashCode();
    assertEquals(expectedHashCodeResult, andPredicate.hashCode());
  }

  /**
   * Test {@link AndPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.equals(Object)", "int AndPredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(mock(Predicate.class));

    // Act and Assert
    assertNotEquals(andPredicate, new AndPredicate(new ArrayList<>()));
  }

  /**
   * Test {@link AndPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.equals(Object)", "int AndPredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(new AndPredicate(new ArrayList<>()));

    // Act and Assert
    assertNotEquals(andPredicate, new AndPredicate(mock(Predicate.class)));
  }

  /**
   * Test {@link AndPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.equals(Object)", "int AndPredicate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AndPredicate(new ArrayList<>()), null);
  }

  /**
   * Test {@link AndPredicate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AndPredicate#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AndPredicate.equals(Object)", "int AndPredicate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AndPredicate(new ArrayList<>()), "Different type to AndPredicate");
  }

  /**
   * Test {@link AndPredicate#toString()}.
   *
   * <p>Method under test: {@link AndPredicate#toString()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String AndPredicate.toString()"})
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "AndEventFilter{andPredicate=Predicates.and()}",
        new AndPredicate(new ArrayList<>()).toString());
  }
}
