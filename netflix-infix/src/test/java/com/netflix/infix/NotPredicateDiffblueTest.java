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
import org.junit.Test;
import org.mockito.Mockito;

public class NotPredicateDiffblueTest {
  /**
   * Method under test: {@link NotPredicate#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualApplyResult = (new NotPredicate(predicate)).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertFalse(actualApplyResult);
  }

  /**
   * Method under test: {@link NotPredicate#apply(Object)}
   */
  @Test
  public void testApply2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualApplyResult = (new NotPredicate(predicate)).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualApplyResult);
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link NotPredicate#equals(Object)}
   *   <li>{@link NotPredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NotPredicate notPredicate = new NotPredicate(AlwaysFalsePredicate.INSTANCE);
    NotPredicate notPredicate2 = new NotPredicate(AlwaysFalsePredicate.INSTANCE);

    // Act and Assert
    assertEquals(notPredicate, notPredicate2);
    int expectedHashCodeResult = notPredicate.hashCode();
    assertEquals(expectedHashCodeResult, notPredicate2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link NotPredicate#equals(Object)}
   *   <li>{@link NotPredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NotPredicate notPredicate = new NotPredicate(mock(Predicate.class));

    // Act and Assert
    assertEquals(notPredicate, notPredicate);
    int expectedHashCodeResult = notPredicate.hashCode();
    assertEquals(expectedHashCodeResult, notPredicate.hashCode());
  }

  /**
   * Method under test: {@link NotPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    NotPredicate notPredicate = new NotPredicate(mock(Predicate.class));

    // Act and Assert
    assertNotEquals(notPredicate, new NotPredicate(mock(Predicate.class)));
  }

  /**
   * Method under test: {@link NotPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    NotPredicate notPredicate = new NotPredicate(new NotPredicate(mock(Predicate.class)));

    // Act and Assert
    assertNotEquals(notPredicate, new NotPredicate(mock(Predicate.class)));
  }

  /**
   * Method under test: {@link NotPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NotPredicate(mock(Predicate.class)), null);
  }

  /**
   * Method under test: {@link NotPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NotPredicate(mock(Predicate.class)), "Different type to NotPredicate");
  }

  /**
   * Method under test: {@link NotPredicate#NotPredicate(Predicate)}
   */
  @Test
  public void testNewNotPredicate() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    NotPredicate actualNotPredicate = new NotPredicate(predicate);
    boolean actualApplyResult = actualNotPredicate.apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertFalse(actualNotPredicate.test("Input"));
    assertFalse(actualApplyResult);
  }

  /**
   * Method under test: {@link NotPredicate#NotPredicate(Predicate)}
   */
  @Test
  public void testNewNotPredicate2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    NotPredicate actualNotPredicate = new NotPredicate(predicate);
    boolean actualApplyResult = actualNotPredicate.apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualNotPredicate.test("Input"));
    assertTrue(actualApplyResult);
  }

  /**
   * Method under test: {@link NotPredicate#NotPredicate(Predicate)}
   */
  @Test
  public void testNewNotPredicate3() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);
    NotPredicate predicate2 = new NotPredicate(predicate);

    // Act
    NotPredicate actualNotPredicate = new NotPredicate(predicate2);
    boolean actualApplyResult = actualNotPredicate.apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertFalse(predicate2.test("Input"));
    assertTrue(actualNotPredicate.test("Input"));
    assertTrue(actualApplyResult);
  }
}
