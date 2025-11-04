package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class NullValuePredicateDiffblueTest {
  /**
   * Test {@link NullValuePredicate#apply(Object)}.
   * <ul>
   *   <li>When {@code Input}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullValuePredicate#apply(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullValuePredicate.apply(Object)"})
  public void testApply_whenInput_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(NullValuePredicate.INSTANCE.apply("Input"));
  }

  /**
   * Test {@link NullValuePredicate#apply(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullValuePredicate#apply(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullValuePredicate.apply(Object)"})
  public void testApply_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(NullValuePredicate.INSTANCE.apply(null));
  }

  /**
   * Test {@link NullValuePredicate#toString()}.
   * <p>
   * Method under test: {@link NullValuePredicate#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String NullValuePredicate.toString()"})
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NullValuePredicate []", NullValuePredicate.INSTANCE.toString());
  }

  /**
   * Test {@link NullValuePredicate#equals(Object)}, and {@link NullValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link NullValuePredicate#equals(Object)}
   *   <li>{@link NullValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullValuePredicate.equals(Object)", "int NullValuePredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NullValuePredicate nullValuePredicate = NullValuePredicate.INSTANCE;
    NullValuePredicate nullValuePredicate2 = NullValuePredicate.INSTANCE;

    // Act and Assert
    assertEquals(nullValuePredicate, nullValuePredicate2);
    int expectedHashCodeResult = nullValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, nullValuePredicate2.hashCode());
  }

  /**
   * Test {@link NullValuePredicate#equals(Object)}, and {@link NullValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link NullValuePredicate#equals(Object)}
   *   <li>{@link NullValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullValuePredicate.equals(Object)", "int NullValuePredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NullValuePredicate nullValuePredicate = NullValuePredicate.INSTANCE;

    // Act and Assert
    assertEquals(nullValuePredicate, nullValuePredicate);
    int expectedHashCodeResult = nullValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, nullValuePredicate.hashCode());
  }

  /**
   * Test {@link NullValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullValuePredicate.equals(Object)", "int NullValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, 3);
  }

  /**
   * Test {@link NullValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullValuePredicate.equals(Object)", "int NullValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, null);
  }

  /**
   * Test {@link NullValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean NullValuePredicate.equals(Object)", "int NullValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NullValuePredicate.INSTANCE, "Different type to NullValuePredicate");
  }
}
