package com.netflix.infix;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.junit.Test;
import org.mockito.Mockito;

public class PredicatesDiffblueTest {
  /**
   * Test {@link Predicates#alwaysTrue()}.
   * <p>
   * Method under test: {@link Predicates#alwaysTrue()}
   */
  @Test
  public void testAlwaysTrue() {
    // Arrange and Act
    Predicate<Object> actualAlwaysTrueResult = Predicates.alwaysTrue();

    // Assert
    assertTrue(actualAlwaysTrueResult instanceof AlwaysTruePredicate);
    assertTrue(actualAlwaysTrueResult.apply("42"));
    assertTrue(actualAlwaysTrueResult.apply("Input"));
    assertTrue(actualAlwaysTrueResult.test("Input"));
  }

  /**
   * Test {@link Predicates#alwaysFalse()}.
   * <p>
   * Method under test: {@link Predicates#alwaysFalse()}
   */
  @Test
  public void testAlwaysFalse() {
    // Arrange and Act
    Predicate<Object> actualAlwaysFalseResult = Predicates.alwaysFalse();

    // Assert
    assertTrue(actualAlwaysFalseResult instanceof AlwaysFalsePredicate);
    assertFalse(actualAlwaysFalseResult.apply("42"));
    assertFalse(actualAlwaysFalseResult.apply("Input"));
    assertFalse(actualAlwaysFalseResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>Given {@link AndPredicate#AndPredicate(Iterable)} with predicates is
   * {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenAndPredicateWithPredicatesIsArrayList() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(new AndPredicate(new ArrayList<>()));

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);

    // Assert
    assertTrue(actualOrResult instanceof OrPredicate);
    assertTrue(actualOrResult.apply("42"));
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>Given {@link NotPredicate#NotPredicate(Predicate)} with
   * {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenNotPredicateWithPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    NotPredicate notPredicate = new NotPredicate(predicate);

    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(notPredicate);

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualOrResult instanceof OrPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>Given {@link OrPredicate#OrPredicate(Iterable)} with filters is
   * {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenOrPredicateWithFiltersIsArrayList() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(new OrPredicate(new ArrayList<>()));

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);

    // Assert
    assertTrue(actualOrResult instanceof OrPredicate);
    assertFalse(actualOrResult.apply("42"));
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return not apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_whenArrayList_thenReturnNotApply42() {
    // Arrange and Act
    Predicate<Object> actualOrResult = Predicates.or(new ArrayList<>());

    // Assert
    assertTrue(actualOrResult instanceof OrPredicate);
    assertFalse(actualOrResult.apply("42"));
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link Predicate}.</li>
   *   <li>Then return apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_whenLinkedHashSetAddPredicate_thenReturnApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(predicate);

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualOrResult instanceof OrPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#or(Predicate[])}
   */
  @Test
  public void testOrWithPredicate_givenFalse_thenReturnNotApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualOrResult = Predicates.or(predicate);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualOrResult instanceof OrPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return
   * {@code true}.</li>
   *   <li>Then return apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#or(Predicate[])}
   */
  @Test
  public void testOrWithPredicate_givenTrue_whenPredicateApplyReturnTrue_thenReturnApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualOrResult = Predicates.or(predicate);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualOrResult instanceof OrPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>Given {@link AndPredicate#AndPredicate(Iterable)} with predicates is
   * {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenAndPredicateWithPredicatesIsArrayList() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(new AndPredicate(new ArrayList<>()));

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualAndResult.apply("42"));
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>Given {@link OrPredicate#OrPredicate(Iterable)} with filters is
   * {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenOrPredicateWithFiltersIsArrayList() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(new OrPredicate(new ArrayList<>()));

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertFalse(actualAndResult.apply("42"));
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return
   * {@code false}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenPredicateApplyReturnFalse_whenLinkedHashSetAddPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(predicate);

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return
   * {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenPredicateApplyReturnTrue() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    NotPredicate notPredicate = new NotPredicate(predicate);

    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(notPredicate);

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_whenArrayList_thenReturnApply42() {
    // Arrange and Act
    Predicate<Object> actualAndResult = Predicates.and(new ArrayList<>());

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualAndResult.apply("42"));
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_givenFalse_thenReturnNotApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualAndResult = Predicates.and(predicate);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return
   * {@code true}.</li>
   *   <li>Then return apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_givenTrue_whenPredicateApplyReturnTrue_thenReturnApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualAndResult = Predicates.and(predicate);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return
   * {@code false}.</li>
   *   <li>Then return apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_givenFalse_whenPredicateApplyReturnFalse_thenReturnApply42() {
    // Arrange
    Predicate<Object> filter = mock(Predicate.class);
    when(filter.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualNotResult = Predicates.not(filter);
    boolean actualApplyResult = actualNotResult.apply("42");

    // Assert
    verify(filter).apply(isA(Object.class));
    assertTrue(actualNotResult instanceof NotPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualNotResult.apply("Input"));
    assertTrue(actualNotResult.test("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with
   * {@link Predicate}.</li>
   *   <li>Then return apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_givenTrue_whenNotPredicateWithPredicate_thenReturnApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNotResult = Predicates.not(new NotPredicate(predicate));
    boolean actualApplyResult = actualNotResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualNotResult instanceof NotPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualNotResult.apply("Input"));
    assertTrue(actualNotResult.test("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return
   * {@code true}.</li>
   *   <li>Then return not apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_givenTrue_whenPredicateApplyReturnTrue_thenReturnNotApply42() {
    // Arrange
    Predicate<Object> filter = mock(Predicate.class);
    when(filter.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualNotResult = Predicates.not(filter);
    boolean actualApplyResult = actualNotResult.apply("42");

    // Assert
    verify(filter).apply(isA(Object.class));
    assertTrue(actualNotResult instanceof NotPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualNotResult.apply("Input"));
    assertFalse(actualNotResult.test("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   * <ul>
   *   <li>When {@link AndPredicate#AndPredicate(Iterable)} with predicates is
   * {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return not apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_whenAndPredicateWithPredicatesIsArrayList_thenReturnNotApply42() {
    // Arrange and Act
    Predicate<Object> actualNotResult = Predicates.not(new AndPredicate(new ArrayList<>()));

    // Assert
    assertTrue(actualNotResult instanceof NotPredicate);
    assertFalse(actualNotResult.apply("42"));
    assertFalse(actualNotResult.apply("Input"));
    assertFalse(actualNotResult.test("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   * <ul>
   *   <li>When {@link OrPredicate#OrPredicate(Iterable)} with filters is
   * {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return apply {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_whenOrPredicateWithFiltersIsArrayList_thenReturnApply42() {
    // Arrange and Act
    Predicate<Object> actualNotResult = Predicates.not(new OrPredicate(new ArrayList<>()));

    // Assert
    assertTrue(actualNotResult instanceof NotPredicate);
    assertTrue(actualNotResult.apply("42"));
    assertTrue(actualNotResult.apply("Input"));
    assertTrue(actualNotResult.test("Input"));
  }
}
