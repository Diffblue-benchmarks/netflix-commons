package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.google.common.base.Predicate;
import java.util.ArrayList;
import org.junit.Test;
import org.mockito.Mockito;

public class OrPredicateDiffblueTest {
  /**
   * Method under test: {@link OrPredicate#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange, Act and Assert
    assertFalse((new OrPredicate(new ArrayList<>())).apply("Input"));
  }

  /**
   * Method under test: {@link OrPredicate#apply(Object)}
   */
  @Test
  public void testApply2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    ArrayList<Predicate<Object>> filters = new ArrayList<>();
    filters.add(predicate);

    // Act
    boolean actualApplyResult = (new OrPredicate(filters)).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualApplyResult);
  }

  /**
   * Method under test: {@link OrPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<Predicate<Object>> filters = new ArrayList<>();
    filters.add(mock(Predicate.class));
    OrPredicate orPredicate = new OrPredicate(filters);

    // Act and Assert
    assertNotEquals(orPredicate, new OrPredicate(new ArrayList<>()));
  }

  /**
   * Method under test: {@link OrPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new OrPredicate(new ArrayList<>()), null);
  }

  /**
   * Method under test: {@link OrPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new OrPredicate(new ArrayList<>()), "Different type to OrPredicate");
  }

  /**
   * Method under test: {@link OrPredicate#OrPredicate(Iterable)}
   */
  @Test
  public void testNewOrPredicate() {
    // Arrange and Act
    OrPredicate actualOrPredicate = new OrPredicate(new ArrayList<>());
    boolean actualApplyResult = actualOrPredicate.apply("Input");

    // Assert
    assertFalse(actualOrPredicate.test("Input"));
    assertFalse(actualApplyResult);
  }

  /**
   * Method under test: {@link OrPredicate#OrPredicate(Predicate[])}
   */
  @Test
  public void testNewOrPredicate2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    OrPredicate actualOrPredicate = new OrPredicate(predicate);
    boolean actualApplyResult = actualOrPredicate.apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualOrPredicate.test("Input"));
    assertTrue(actualApplyResult);
  }

  /**
   * Method under test: {@link OrPredicate#OrPredicate(Predicate[])}
   */
  @Test
  public void testNewOrPredicate3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    OrPredicate actualOrPredicate = new OrPredicate(predicate);
    boolean actualApplyResult = actualOrPredicate.apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertFalse(actualOrPredicate.test("Input"));
    assertFalse(actualApplyResult);
  }

  /**
   * Method under test: {@link OrPredicate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("OrEventFilter{orPredicate=Predicates.or()}", (new OrPredicate(new ArrayList<>())).toString());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link OrPredicate#equals(Object)}
   *   <li>{@link OrPredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    OrPredicate orPredicate = new OrPredicate(new ArrayList<>());
    OrPredicate orPredicate2 = new OrPredicate(new ArrayList<>());

    // Act and Assert
    assertEquals(orPredicate, orPredicate2);
    int expectedHashCodeResult = orPredicate.hashCode();
    assertEquals(expectedHashCodeResult, orPredicate2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link OrPredicate#equals(Object)}
   *   <li>{@link OrPredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    OrPredicate orPredicate = new OrPredicate(new ArrayList<>());

    // Act and Assert
    assertEquals(orPredicate, orPredicate);
    int expectedHashCodeResult = orPredicate.hashCode();
    assertEquals(expectedHashCodeResult, orPredicate.hashCode());
  }
}
