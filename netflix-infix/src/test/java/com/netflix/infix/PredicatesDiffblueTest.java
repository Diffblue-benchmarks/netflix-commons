package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
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
   *
   * <p>Method under test: {@link Predicates#alwaysTrue()}
   */
  @Test
  public void testAlwaysTrue() {
    // Arrange and Act
    Predicate<Object> actualAlwaysTrueResult = Predicates.alwaysTrue();
    boolean actualApplyResult = actualAlwaysTrueResult.apply("42");

    // Assert
    assertTrue(actualAlwaysTrueResult instanceof AlwaysTruePredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualAlwaysTrueResult.apply("Input"));
    assertTrue(actualAlwaysTrueResult.test("Input"));
  }

  /**
   * Test {@link Predicates#alwaysFalse()}.
   *
   * <p>Method under test: {@link Predicates#alwaysFalse()}
   */
  @Test
  public void testAlwaysFalse() {
    // Arrange and Act
    Predicate<Object> actualAlwaysFalseResult = Predicates.alwaysFalse();
    boolean actualApplyResult = actualAlwaysFalseResult.apply("42");

    // Assert
    assertTrue(actualAlwaysFalseResult instanceof AlwaysFalsePredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualAlwaysFalseResult.apply("Input"));
    assertFalse(actualAlwaysFalseResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link AndPredicate#AndPredicate(Iterable)} with predicates is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenAndPredicateWithPredicatesIsArrayList() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(new AndPredicate(new ArrayList<>()));

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    assertTrue(actualOrResult instanceof OrPredicate);
    assertEquals(1, filters.size());
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenArrayListAddPredicate_thenCallsIterator() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    predicateList.add(predicate);

    Iterable<Predicate<Object>> filters = mock(Iterable.class);
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    verify(filters).iterator();
    assertTrue(actualOrResult instanceof OrPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenArrayListAddPredicate_thenCallsIterator2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    predicateList.add(predicate2);
    predicateList.add(predicate);

    Iterable<Predicate<Object>> filters = mock(Iterable.class);
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate2).apply(isA(Object.class));
    verify(filters).iterator();
    assertTrue(actualOrResult instanceof OrPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenArrayListAddPredicate_thenCallsIterator3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    predicateList.add(predicate3);
    predicateList.add(predicate2);
    predicateList.add(predicate);

    Iterable<Predicate<Object>> filters = mock(Iterable.class);
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate3).apply(isA(Object.class));
    verify(filters).iterator();
    assertTrue(actualOrResult instanceof OrPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenArrayListAddPredicate_thenCallsIterator4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate4 = mock(Predicate.class);
    when(predicate4.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    predicateList.add(predicate4);
    predicateList.add(mock(Predicate.class));
    predicateList.add(predicate3);
    predicateList.add(predicate2);
    predicateList.add(predicate);

    Iterable<Predicate<Object>> filters = mock(Iterable.class);
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate4).apply(isA(Object.class));
    verify(filters).iterator();
    assertTrue(actualOrResult instanceof OrPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   *   <li>Then return not apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenArrayListIterator_thenReturnNotApply42() {
    // Arrange
    Iterable<Predicate<Object>> filters = mock(Iterable.class);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(filters).iterator();
    assertTrue(actualOrResult instanceof OrPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
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
    assertEquals(1, filters.size());
    assertFalse(actualApplyResult);
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link OrPredicate#OrPredicate(Iterable)} with filters is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenOrPredicateWithFiltersIsArrayList() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(new OrPredicate(new ArrayList<>()));

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    assertTrue(actualOrResult instanceof OrPredicate);
    assertEquals(1, filters.size());
    assertFalse(actualApplyResult);
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link Predicate}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_givenPredicate_whenLinkedHashSetAddPredicate() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);

    // Assert
    assertTrue(actualOrResult instanceof OrPredicate);
    assertEquals(1, filters.size());
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_whenArrayListAddPredicate_thenArrayListSizeIsTwo() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> filters = new ArrayList<>();
    filters.add(predicate);
    filters.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualOrResult instanceof OrPredicate);
    assertEquals(2, filters.size());
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Predicate<Object>> filters = new ArrayList<>();

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    assertTrue(actualOrResult instanceof OrPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
    assertTrue(filters.isEmpty());
  }

  /**
   * Test {@link Predicates#or(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link Predicate}.
   *   <li>Then {@link LinkedHashSet#LinkedHashSet()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Iterable)}
   */
  @Test
  public void testOrWithIterable_whenLinkedHashSetAddPredicate_thenLinkedHashSetSizeIsOne() {
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
    assertEquals(1, filters.size());
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Predicate[])}
   */
  @Test
  public void testOrWithPredicate_givenFalse_thenReturnNotApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object>[] filters = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualOrResult instanceof OrPredicate);
    assertEquals(1, filters.length);
    assertFalse(actualApplyResult);
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return {@code true}.
   *   <li>Then return apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Predicate[])}
   */
  @Test
  public void testOrWithPredicate_givenTrue_whenPredicateApplyReturnTrue_thenReturnApply42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object>[] filters = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);
    boolean actualApplyResult = actualOrResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualOrResult instanceof OrPredicate);
    assertEquals(1, filters.length);
    assertTrue(actualApplyResult);
    assertTrue(actualOrResult.apply("Input"));
    assertTrue(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#or(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return not apply {@code Input}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#or(Predicate[])}
   */
  @Test
  public void testOrWithPredicate_whenPredicate_thenReturnNotApplyInput() {
    // Arrange
    Predicate<Object>[] filters = new Predicate[] {mock(Predicate.class)};

    // Act
    Predicate<Object> actualOrResult = Predicates.or(filters);

    // Assert
    assertTrue(actualOrResult instanceof OrPredicate);
    assertEquals(1, filters.length);
    assertFalse(actualOrResult.apply("Input"));
    assertFalse(actualOrResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link AndPredicate#AndPredicate(Iterable)} with predicates is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenAndPredicateWithPredicatesIsArrayList() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(new AndPredicate(new ArrayList<>()));

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(1, filters.size());
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenArrayListAddPredicate_thenCallsIterator() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    predicateList.add(predicate);

    Iterable<Predicate<Object>> filters = mock(Iterable.class);
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    verify(filters).iterator();
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenArrayListAddPredicate_thenCallsIterator2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    predicateList.add(predicate2);
    predicateList.add(predicate);

    Iterable<Predicate<Object>> filters = mock(Iterable.class);
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate2).apply(isA(Object.class));
    verify(predicate).apply(isA(Object.class));
    verify(filters).iterator();
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenArrayListAddPredicate_thenCallsIterator3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    predicateList.add(predicate3);
    predicateList.add(predicate2);
    predicateList.add(predicate);

    Iterable<Predicate<Object>> filters = mock(Iterable.class);
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate3).apply(isA(Object.class));
    verify(predicate2).apply(isA(Object.class));
    verify(predicate).apply(isA(Object.class));
    verify(filters).iterator();
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenArrayListAddPredicate_thenCallsIterator4() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate3 = mock(Predicate.class);
    when(predicate3.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate4 = mock(Predicate.class);
    when(predicate4.apply(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate5 = mock(Predicate.class);
    when(predicate5.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    predicateList.add(predicate5);
    predicateList.add(predicate4);
    predicateList.add(predicate3);
    predicateList.add(predicate2);
    predicateList.add(predicate);

    Iterable<Predicate<Object>> filters = mock(Iterable.class);
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate5).apply(isA(Object.class));
    verify(predicate4).apply(isA(Object.class));
    verify(predicate3).apply(isA(Object.class));
    verify(predicate2).apply(isA(Object.class));
    verify(predicate).apply(isA(Object.class));
    verify(filters).iterator();
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenArrayListIterator_thenCallsIterator() {
    // Arrange
    Iterable<Predicate<Object>> filters = mock(Iterable.class);

    ArrayList<Predicate<Object>> predicateList = new ArrayList<>();
    when(filters.iterator()).thenReturn(predicateList.iterator());

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(filters).iterator();
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenNotPredicateWithPredicate() {
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
    assertEquals(1, filters.size());
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link OrPredicate#OrPredicate(Iterable)} with filters is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenOrPredicateWithFiltersIsArrayList() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(new OrPredicate(new ArrayList<>()));

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(1, filters.size());
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code false}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
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
    assertEquals(1, filters.size());
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@link Predicate}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_givenPredicate_whenLinkedHashSetAddPredicate() {
    // Arrange
    LinkedHashSet<Predicate<Object>> filters = new LinkedHashSet<>();
    filters.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(1, filters.size());
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} add {@link Predicate}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_whenArrayListAddPredicate_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Predicate<Object>> filters = new ArrayList<>();
    filters.add(mock(Predicate.class));
    filters.add(mock(Predicate.class));

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(2, filters.size());
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_whenArrayList_thenArrayListEmpty() {
    // Arrange
    ArrayList<Predicate<Object>> filters = new ArrayList<>();

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
    assertTrue(filters.isEmpty());
  }

  /**
   * Test {@link Predicates#and(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Iterable)}
   */
  @Test
  public void testAndWithIterable_whenArrayList_thenArrayListEmpty2() {
    // Arrange
    ArrayList<Predicate<Object>> filters = new ArrayList<>();

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
    assertTrue(filters.isEmpty());
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    NotPredicate notPredicate = new NotPredicate(predicate);
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());
    Predicate<Object>[] filters = new Predicate[] {notPredicate, andPredicate};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(2, filters.length);
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
    assertSame(andPredicate, filters[1]);
    assertSame(notPredicate, filters[0]);
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_givenFalse_thenArrayLengthIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);
    Predicate<Object>[] filters = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(1, filters.length);
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return {@code true}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_givenTrue_whenPredicateApplyReturnTrue_thenArrayLengthIsOne() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object>[] filters = new Predicate[] {predicate};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(1, filters.length);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element {@link AlwaysTruePredicate}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_thenFirstElementAlwaysTruePredicate() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());
    Predicate<Object>[] filters = new Predicate[] {AlwaysTruePredicate.INSTANCE, andPredicate};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    Predicate<Object> predicate = filters[0];
    assertTrue(predicate instanceof AlwaysTruePredicate);
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(2, filters.length);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(predicate.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
    assertTrue(predicate.test("Input"));
    assertSame(andPredicate, filters[1]);
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element is {@link AndPredicate#AndPredicate(Iterable)} with predicates is
   *       {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_thenFirstElementIsAndPredicateWithPredicatesIsArrayList() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());
    AndPredicate andPredicate2 = new AndPredicate(new ArrayList<>());
    Predicate<Object>[] filters = new Predicate[] {andPredicate, andPredicate2};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(2, filters.length);
    assertTrue(actualApplyResult);
    assertTrue(actualAndResult.apply("Input"));
    assertTrue(actualAndResult.test("Input"));
    assertSame(andPredicate, filters[0]);
    assertSame(andPredicate2, filters[1]);
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then first element is {@link OrPredicate#OrPredicate(Iterable)} with filters is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_thenFirstElementIsOrPredicateWithFiltersIsArrayList() {
    // Arrange
    OrPredicate orPredicate = new OrPredicate(new ArrayList<>());
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());
    Predicate<Object>[] filters = new Predicate[] {orPredicate, andPredicate};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(2, filters.length);
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
    assertSame(andPredicate, filters[1]);
    assertSame(orPredicate, filters[0]);
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then second element is {@link NotPredicate#NotPredicate(Predicate)} with {@link
   *       Predicate}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_thenSecondElementIsNotPredicateWithPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);
    NotPredicate notPredicate = new NotPredicate(predicate);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.apply(Mockito.<Object>any())).thenReturn(true);
    NotPredicate notPredicate2 = new NotPredicate(predicate2);
    Predicate<Object>[] filters = new Predicate[] {notPredicate, notPredicate2};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    verify(predicate2).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(2, filters.length);
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
    assertSame(notPredicate, filters[0]);
    assertSame(notPredicate2, filters[1]);
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>Then second element is {@link OrPredicate#OrPredicate(Iterable)} with filters is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_thenSecondElementIsOrPredicateWithFiltersIsArrayList() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);
    NotPredicate notPredicate = new NotPredicate(predicate);
    OrPredicate orPredicate = new OrPredicate(new ArrayList<>());
    Predicate<Object>[] filters = new Predicate[] {notPredicate, orPredicate};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);
    boolean actualApplyResult = actualAndResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(2, filters.length);
    assertFalse(actualApplyResult);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
    assertSame(notPredicate, filters[0]);
    assertSame(orPredicate, filters[1]);
  }

  /**
   * Test {@link Predicates#and(Predicate[])} with {@code Predicate[]}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then array length is one.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#and(Predicate[])}
   */
  @Test
  public void testAndWithPredicate_whenPredicate_thenArrayLengthIsOne() {
    // Arrange
    Predicate<Object>[] filters = new Predicate[] {mock(Predicate.class)};

    // Act
    Predicate<Object> actualAndResult = Predicates.and(filters);

    // Assert
    assertTrue(actualAndResult instanceof AndPredicate);
    assertEquals(1, filters.length);
    assertFalse(actualAndResult.apply("Input"));
    assertFalse(actualAndResult.test("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return {@code false}.
   *   <li>Then return apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#not(Predicate)}
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
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return {@code true}.
   *   <li>Then return not apply {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#not(Predicate)}
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
   *
   * <ul>
   *   <li>Then {@link AndPredicate#AndPredicate(Iterable)} with predicates is {@link
   *       ArrayList#ArrayList()} test {@code Input}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_thenAndPredicateWithPredicatesIsArrayListTestInput() {
    // Arrange
    AndPredicate filter = new AndPredicate(new ArrayList<>());

    // Act
    Predicate<Object> actualNotResult = Predicates.not(filter);
    boolean actualApplyResult = actualNotResult.apply("42");

    // Assert
    assertTrue(actualNotResult instanceof NotPredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualNotResult.apply("Input"));
    assertFalse(actualNotResult.test("Input"));
    assertTrue(filter.test("Input"));
    assertTrue(filter.apply("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   *
   * <ul>
   *   <li>Then not {@link OrPredicate#OrPredicate(Iterable)} with filters is {@link
   *       ArrayList#ArrayList()} test {@code Input}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_thenNotOrPredicateWithFiltersIsArrayListTestInput() {
    // Arrange
    OrPredicate filter = new OrPredicate(new ArrayList<>());

    // Act
    Predicate<Object> actualNotResult = Predicates.not(filter);
    boolean actualApplyResult = actualNotResult.apply("42");

    // Assert
    assertTrue(actualNotResult instanceof NotPredicate);
    assertFalse(filter.test("Input"));
    assertFalse(filter.apply("Input"));
    assertTrue(actualApplyResult);
    assertTrue(actualNotResult.apply("Input"));
    assertTrue(actualNotResult.test("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   *
   * <ul>
   *   <li>When {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate}.
   *   <li>Then not {@link NotPredicate#NotPredicate(Predicate)} with {@link Predicate} test {@code
   *       Input}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_whenNotPredicateWithPredicate_thenNotNotPredicateWithPredicateTestInput() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    NotPredicate filter = new NotPredicate(predicate);

    // Act
    Predicate<Object> actualNotResult = Predicates.not(filter);
    boolean actualApplyResult = actualNotResult.apply("42");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualNotResult instanceof NotPredicate);
    assertFalse(filter.test("Input"));
    assertFalse(filter.apply("Input"));
    assertTrue(actualApplyResult);
    assertTrue(actualNotResult.apply("Input"));
    assertTrue(actualNotResult.test("Input"));
  }

  /**
   * Test {@link Predicates#not(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return apply {@code Input}.
   * </ul>
   *
   * <p>Method under test: {@link Predicates#not(Predicate)}
   */
  @Test
  public void testNot_whenPredicate_thenReturnApplyInput() {
    // Arrange and Act
    Predicate<Object> actualNotResult = Predicates.not(mock(Predicate.class));

    // Assert
    assertTrue(actualNotResult instanceof NotPredicate);
    assertTrue(actualNotResult.apply("Input"));
    assertTrue(actualNotResult.test("Input"));
  }
}
