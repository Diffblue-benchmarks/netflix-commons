package com.netflix.eventbus.filter.lang.infix;

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

public class InfixEventFilterDiffblueTest {
  /**
   * Method under test: {@link InfixEventFilter#apply(Object)}
   */
  @Test
  public void testApply() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualApplyResult = (new InfixEventFilter(predicate, "Original")).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualApplyResult);
  }

  /**
   * Method under test: {@link InfixEventFilter#apply(Object)}
   */
  @Test
  public void testApply2() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualApplyResult = (new InfixEventFilter(predicate, "Original")).apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertFalse(actualApplyResult);
  }

  /**
   * Method under test: {@link InfixEventFilter#serialize()}
   */
  @Test
  public void testSerialize() {
    // Arrange, Act and Assert
    assertEquals("Original", (new InfixEventFilter(mock(Predicate.class), "Original")).serialize());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link InfixEventFilter#equals(Object)}
   *   <li>{@link InfixEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(null, "Original");
    InfixEventFilter infixEventFilter2 = new InfixEventFilter(null, "Original");

    // Act and Assert
    assertEquals(infixEventFilter, infixEventFilter2);
    int expectedHashCodeResult = infixEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, infixEventFilter2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link InfixEventFilter#equals(Object)}
   *   <li>{@link InfixEventFilter#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(mock(Predicate.class), "Original");

    // Act and Assert
    assertEquals(infixEventFilter, infixEventFilter);
    int expectedHashCodeResult = infixEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, infixEventFilter.hashCode());
  }

  /**
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(mock(Predicate.class), "Original");

    // Act and Assert
    assertNotEquals(infixEventFilter, new InfixEventFilter(mock(Predicate.class), "Original"));
  }

  /**
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(null, "Original");

    // Act and Assert
    assertNotEquals(infixEventFilter, new InfixEventFilter(mock(Predicate.class), "Original"));
  }

  /**
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(new InfixEventFilter(mock(Predicate.class)), "Original");

    // Act and Assert
    assertNotEquals(infixEventFilter, new InfixEventFilter(mock(Predicate.class), "Original"));
  }

  /**
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InfixEventFilter(mock(Predicate.class), "Original"), null);
  }

  /**
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InfixEventFilter(mock(Predicate.class), "Original"), "Different type to InfixEventFilter");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link InfixEventFilter#InfixEventFilter(Predicate)}
   *   <li>{@link InfixEventFilter#toString()}
   *   <li>{@link InfixEventFilter#getLanguage()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    InfixEventFilter actualInfixEventFilter = new InfixEventFilter(mock(Predicate.class));
    String actualToStringResult = actualInfixEventFilter.toString();

    // Assert
    assertEquals("InfixEventFilter{input=null}", actualToStringResult);
    assertEquals(InfixEventFilter.INFIX_LANGUAGE_NAME, actualInfixEventFilter.getLanguage());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link InfixEventFilter#InfixEventFilter(Predicate, String)}
   *   <li>{@link InfixEventFilter#toString()}
   *   <li>{@link InfixEventFilter#getLanguage()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters2() {
    // Arrange and Act
    InfixEventFilter actualInfixEventFilter = new InfixEventFilter(mock(Predicate.class), "Original");
    String actualToStringResult = actualInfixEventFilter.toString();

    // Assert
    assertEquals("InfixEventFilter{input=Original}", actualToStringResult);
    assertEquals(InfixEventFilter.INFIX_LANGUAGE_NAME, actualInfixEventFilter.getLanguage());
  }
}
