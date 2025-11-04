package com.netflix.eventbus.filter.lang.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.base.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class InfixEventFilterDiffblueTest {
  /**
   * Test getters and setters.
   * <ul>
   *   <li>Then return toString is {@code InfixEventFilter{input=null}}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link InfixEventFilter#InfixEventFilter(Predicate)}
   *   <li>{@link InfixEventFilter#toString()}
   *   <li>{@link InfixEventFilter#getLanguage()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void InfixEventFilter.<init>(Predicate)", "void InfixEventFilter.<init>(Predicate, String)",
      "String InfixEventFilter.getLanguage()", "String InfixEventFilter.toString()"})
  public void testGettersAndSetters_thenReturnToStringIsInfixEventFilterInputNull() {
    // Arrange and Act
    InfixEventFilter actualInfixEventFilter = new InfixEventFilter(mock(Predicate.class));
    String actualToStringResult = actualInfixEventFilter.toString();

    // Assert
    assertEquals("InfixEventFilter{input=null}", actualToStringResult);
    assertEquals(InfixEventFilter.INFIX_LANGUAGE_NAME, actualInfixEventFilter.getLanguage());
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>Then return toString is {@code InfixEventFilter{input=Original}}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link InfixEventFilter#InfixEventFilter(Predicate, String)}
   *   <li>{@link InfixEventFilter#toString()}
   *   <li>{@link InfixEventFilter#getLanguage()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void InfixEventFilter.<init>(Predicate)", "void InfixEventFilter.<init>(Predicate, String)",
      "String InfixEventFilter.getLanguage()", "String InfixEventFilter.toString()"})
  public void testGettersAndSetters_thenReturnToStringIsInfixEventFilterInputOriginal() {
    // Arrange and Act
    InfixEventFilter actualInfixEventFilter = new InfixEventFilter(mock(Predicate.class), "Original");
    String actualToStringResult = actualInfixEventFilter.toString();

    // Assert
    assertEquals("InfixEventFilter{input=Original}", actualToStringResult);
    assertEquals(InfixEventFilter.INFIX_LANGUAGE_NAME, actualInfixEventFilter.getLanguage());
  }

  /**
   * Test {@link InfixEventFilter#apply(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixEventFilter#apply(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.apply(Object)"})
  public void testApply_givenPredicateApplyReturnFalse_thenReturnFalse() {
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
   * Test {@link InfixEventFilter#apply(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixEventFilter#apply(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.apply(Object)"})
  public void testApply_givenPredicateApplyReturnTrue_thenReturnTrue() {
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
   * Test {@link InfixEventFilter#serialize()}.
   * <p>
   * Method under test: {@link InfixEventFilter#serialize()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String InfixEventFilter.serialize()"})
  public void testSerialize() {
    // Arrange, Act and Assert
    assertEquals("Original", (new InfixEventFilter(mock(Predicate.class), "Original")).serialize());
  }

  /**
   * Test {@link InfixEventFilter#equals(Object)}, and {@link InfixEventFilter#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link InfixEventFilter#equals(Object)}
   *   <li>{@link InfixEventFilter#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.equals(Object)", "int InfixEventFilter.hashCode()"})
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
   * Test {@link InfixEventFilter#equals(Object)}, and {@link InfixEventFilter#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link InfixEventFilter#equals(Object)}
   *   <li>{@link InfixEventFilter#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.equals(Object)", "int InfixEventFilter.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(mock(Predicate.class), "Original");

    // Act and Assert
    assertEquals(infixEventFilter, infixEventFilter);
    int expectedHashCodeResult = infixEventFilter.hashCode();
    assertEquals(expectedHashCodeResult, infixEventFilter.hashCode());
  }

  /**
   * Test {@link InfixEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.equals(Object)", "int InfixEventFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(mock(Predicate.class), "Original");

    // Act and Assert
    assertNotEquals(infixEventFilter, new InfixEventFilter(mock(Predicate.class), "Original"));
  }

  /**
   * Test {@link InfixEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.equals(Object)", "int InfixEventFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(null, "Original");

    // Act and Assert
    assertNotEquals(infixEventFilter, new InfixEventFilter(mock(Predicate.class), "Original"));
  }

  /**
   * Test {@link InfixEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.equals(Object)", "int InfixEventFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    InfixEventFilter infixEventFilter = new InfixEventFilter(new InfixEventFilter(mock(Predicate.class)), "Original");

    // Act and Assert
    assertNotEquals(infixEventFilter, new InfixEventFilter(mock(Predicate.class), "Original"));
  }

  /**
   * Test {@link InfixEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.equals(Object)", "int InfixEventFilter.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InfixEventFilter(mock(Predicate.class), "Original"), null);
  }

  /**
   * Test {@link InfixEventFilter#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link InfixEventFilter#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean InfixEventFilter.equals(Object)", "int InfixEventFilter.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new InfixEventFilter(mock(Predicate.class), "Original"), "Different type to InfixEventFilter");
  }
}
