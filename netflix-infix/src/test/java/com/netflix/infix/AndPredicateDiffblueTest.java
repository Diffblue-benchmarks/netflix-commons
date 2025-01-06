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

public class AndPredicateDiffblueTest {
  /**
   * Test {@link AndPredicate#AndPredicate(Predicate[])}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>Then return not test {@code Input}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#AndPredicate(Predicate[])}
   */
  @Test
  public void testNewAndPredicate_givenFalse_thenReturnNotTestInput() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(false);

    // Act
    AndPredicate actualAndPredicate = new AndPredicate(predicate);
    boolean actualApplyResult = actualAndPredicate.apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertFalse(actualAndPredicate.test("Input"));
    assertFalse(actualApplyResult);
  }

  /**
   * Test {@link AndPredicate#AndPredicate(Predicate[])}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#apply(Object)} return
   * {@code true}.</li>
   *   <li>Then return test {@code Input}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#AndPredicate(Predicate[])}
   */
  @Test
  public void testNewAndPredicate_givenTrue_whenPredicateApplyReturnTrue_thenReturnTestInput() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.apply(Mockito.<Object>any())).thenReturn(true);

    // Act
    AndPredicate actualAndPredicate = new AndPredicate(predicate);
    boolean actualApplyResult = actualAndPredicate.apply("Input");

    // Assert
    verify(predicate).apply(isA(Object.class));
    assertTrue(actualAndPredicate.test("Input"));
    assertTrue(actualApplyResult);
  }

  /**
   * Test {@link AndPredicate#AndPredicate(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return test {@code Input}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#AndPredicate(Iterable)}
   */
  @Test
  public void testNewAndPredicate_whenArrayList_thenReturnTestInput() {
    // Arrange and Act
    AndPredicate actualAndPredicate = new AndPredicate(new ArrayList<>());
    boolean actualApplyResult = actualAndPredicate.apply("Input");

    // Assert
    assertTrue(actualAndPredicate.test("Input"));
    assertTrue(actualApplyResult);
  }

  /**
   * Test {@link AndPredicate#apply(Object)}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#apply(Object)} return
   * {@code true}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#apply(Object)}
   */
  @Test
  public void testApply_givenPredicateApplyReturnTrue_thenReturnFalse() {
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
    Predicate<Object> predicate6 = mock(Predicate.class);
    when(predicate6.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate7 = mock(Predicate.class);
    when(predicate7.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate8 = mock(Predicate.class);
    when(predicate8.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate9 = mock(Predicate.class);
    when(predicate9.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate10 = mock(Predicate.class);
    when(predicate10.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate11 = mock(Predicate.class);
    when(predicate11.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate12 = mock(Predicate.class);
    when(predicate12.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate13 = mock(Predicate.class);
    when(predicate13.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate14 = mock(Predicate.class);
    when(predicate14.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate15 = mock(Predicate.class);
    when(predicate15.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate16 = mock(Predicate.class);
    when(predicate16.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate17 = mock(Predicate.class);
    when(predicate17.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate18 = mock(Predicate.class);
    when(predicate18.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate19 = mock(Predicate.class);
    when(predicate19.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate20 = mock(Predicate.class);
    when(predicate20.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate21 = mock(Predicate.class);
    when(predicate21.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate22 = mock(Predicate.class);
    when(predicate22.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate23 = mock(Predicate.class);
    when(predicate23.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate24 = mock(Predicate.class);
    when(predicate24.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate25 = mock(Predicate.class);
    when(predicate25.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate26 = mock(Predicate.class);
    when(predicate26.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate27 = mock(Predicate.class);
    when(predicate27.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate28 = mock(Predicate.class);
    when(predicate28.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate29 = mock(Predicate.class);
    when(predicate29.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate30 = mock(Predicate.class);
    when(predicate30.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate31 = mock(Predicate.class);
    when(predicate31.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate32 = mock(Predicate.class);
    when(predicate32.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate33 = mock(Predicate.class);
    when(predicate33.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate34 = mock(Predicate.class);
    when(predicate34.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate35 = mock(Predicate.class);
    when(predicate35.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate36 = mock(Predicate.class);
    when(predicate36.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate37 = mock(Predicate.class);
    when(predicate37.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate38 = mock(Predicate.class);
    when(predicate38.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate39 = mock(Predicate.class);
    when(predicate39.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate40 = mock(Predicate.class);
    when(predicate40.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate41 = mock(Predicate.class);
    when(predicate41.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate42 = mock(Predicate.class);
    when(predicate42.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate43 = mock(Predicate.class);
    when(predicate43.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate44 = mock(Predicate.class);
    when(predicate44.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate45 = mock(Predicate.class);
    when(predicate45.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate46 = mock(Predicate.class);
    when(predicate46.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate47 = mock(Predicate.class);
    when(predicate47.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate48 = mock(Predicate.class);
    when(predicate48.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate49 = mock(Predicate.class);
    when(predicate49.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate50 = mock(Predicate.class);
    when(predicate50.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate51 = mock(Predicate.class);
    when(predicate51.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate52 = mock(Predicate.class);
    when(predicate52.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate53 = mock(Predicate.class);
    when(predicate53.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate54 = mock(Predicate.class);
    when(predicate54.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate55 = mock(Predicate.class);
    when(predicate55.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate56 = mock(Predicate.class);
    when(predicate56.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate57 = mock(Predicate.class);
    when(predicate57.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate58 = mock(Predicate.class);
    when(predicate58.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate59 = mock(Predicate.class);
    when(predicate59.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate60 = mock(Predicate.class);
    when(predicate60.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate61 = mock(Predicate.class);
    when(predicate61.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate62 = mock(Predicate.class);
    when(predicate62.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate63 = mock(Predicate.class);
    when(predicate63.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate64 = mock(Predicate.class);
    when(predicate64.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate65 = mock(Predicate.class);
    when(predicate65.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate66 = mock(Predicate.class);
    when(predicate66.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate67 = mock(Predicate.class);
    when(predicate67.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate68 = mock(Predicate.class);
    when(predicate68.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate69 = mock(Predicate.class);
    when(predicate69.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate70 = mock(Predicate.class);
    when(predicate70.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate71 = mock(Predicate.class);
    when(predicate71.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate72 = mock(Predicate.class);
    when(predicate72.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate73 = mock(Predicate.class);
    when(predicate73.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate74 = mock(Predicate.class);
    when(predicate74.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate75 = mock(Predicate.class);
    when(predicate75.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate76 = mock(Predicate.class);
    when(predicate76.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate77 = mock(Predicate.class);
    when(predicate77.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate78 = mock(Predicate.class);
    when(predicate78.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate79 = mock(Predicate.class);
    when(predicate79.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate80 = mock(Predicate.class);
    when(predicate80.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate81 = mock(Predicate.class);
    when(predicate81.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate82 = mock(Predicate.class);
    when(predicate82.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate83 = mock(Predicate.class);
    when(predicate83.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate84 = mock(Predicate.class);
    when(predicate84.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate85 = mock(Predicate.class);
    when(predicate85.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate86 = mock(Predicate.class);
    when(predicate86.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate87 = mock(Predicate.class);
    when(predicate87.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate88 = mock(Predicate.class);
    when(predicate88.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate89 = mock(Predicate.class);
    when(predicate89.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate90 = mock(Predicate.class);
    when(predicate90.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate91 = mock(Predicate.class);
    when(predicate91.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate92 = mock(Predicate.class);
    when(predicate92.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate93 = mock(Predicate.class);
    when(predicate93.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate94 = mock(Predicate.class);
    when(predicate94.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate95 = mock(Predicate.class);
    when(predicate95.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate96 = mock(Predicate.class);
    when(predicate96.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate97 = mock(Predicate.class);
    when(predicate97.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate98 = mock(Predicate.class);
    when(predicate98.apply(Mockito.<Object>any())).thenReturn(true);
    Predicate<Object> predicate99 = mock(Predicate.class);
    when(predicate99.apply(Mockito.<Object>any())).thenReturn(false);

    ArrayList<Predicate<Object>> predicates = new ArrayList<>();
    predicates.add(predicate99);
    predicates.add(predicate98);
    predicates.add(predicate97);
    predicates.add(predicate96);
    predicates.add(predicate95);
    predicates.add(predicate94);
    predicates.add(predicate93);
    predicates.add(predicate92);
    predicates.add(predicate91);
    predicates.add(predicate90);
    predicates.add(predicate89);
    predicates.add(predicate88);
    predicates.add(predicate87);
    predicates.add(predicate86);
    predicates.add(predicate85);
    predicates.add(predicate84);
    predicates.add(predicate83);
    predicates.add(predicate82);
    predicates.add(predicate81);
    predicates.add(predicate80);
    predicates.add(predicate79);
    predicates.add(predicate78);
    predicates.add(predicate77);
    predicates.add(predicate76);
    predicates.add(predicate75);
    predicates.add(predicate74);
    predicates.add(predicate73);
    predicates.add(predicate72);
    predicates.add(predicate71);
    predicates.add(predicate70);
    predicates.add(predicate69);
    predicates.add(predicate68);
    predicates.add(predicate67);
    predicates.add(predicate66);
    predicates.add(predicate65);
    predicates.add(predicate64);
    predicates.add(predicate63);
    predicates.add(predicate62);
    predicates.add(predicate61);
    predicates.add(predicate60);
    predicates.add(predicate59);
    predicates.add(predicate58);
    predicates.add(predicate57);
    predicates.add(predicate56);
    predicates.add(predicate55);
    predicates.add(predicate54);
    predicates.add(predicate53);
    predicates.add(predicate52);
    predicates.add(predicate51);
    predicates.add(predicate50);
    predicates.add(predicate49);
    predicates.add(predicate48);
    predicates.add(predicate47);
    predicates.add(predicate46);
    predicates.add(predicate45);
    predicates.add(predicate44);
    predicates.add(predicate43);
    predicates.add(predicate42);
    predicates.add(predicate41);
    predicates.add(predicate40);
    predicates.add(predicate39);
    predicates.add(predicate38);
    predicates.add(predicate37);
    predicates.add(predicate36);
    predicates.add(predicate35);
    predicates.add(predicate34);
    predicates.add(predicate33);
    predicates.add(predicate32);
    predicates.add(predicate31);
    predicates.add(predicate30);
    predicates.add(predicate29);
    predicates.add(predicate28);
    predicates.add(predicate27);
    predicates.add(predicate26);
    predicates.add(predicate25);
    predicates.add(predicate24);
    predicates.add(predicate23);
    predicates.add(predicate22);
    predicates.add(predicate21);
    predicates.add(predicate20);
    predicates.add(predicate19);
    predicates.add(predicate18);
    predicates.add(predicate17);
    predicates.add(predicate16);
    predicates.add(predicate15);
    predicates.add(predicate14);
    predicates.add(predicate13);
    predicates.add(predicate12);
    predicates.add(predicate11);
    predicates.add(predicate10);
    predicates.add(predicate9);
    predicates.add(predicate8);
    predicates.add(predicate7);
    predicates.add(predicate6);
    predicates.add(predicate5);
    predicates.add(predicate4);
    predicates.add(predicate3);
    predicates.add(predicate2);
    predicates.add(predicate);

    // Act
    boolean actualApplyResult = (new AndPredicate(predicates)).apply("Input");

    // Assert
    verify(predicate99).apply(isA(Object.class));
    assertFalse(actualApplyResult);
  }

  /**
   * Test {@link AndPredicate#apply(Object)}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#apply(Object)}
   */
  @Test
  public void testApply_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new AndPredicate(new ArrayList<>())).apply("Input"));
  }

  /**
   * Test {@link AndPredicate#equals(Object)}, and
   * {@link AndPredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AndPredicate#equals(Object)}
   *   <li>{@link AndPredicate#hashCode()}
   * </ul>
   */
  @Test
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AndPredicate andPredicate = new AndPredicate(new ArrayList<>());
    AndPredicate andPredicate2 = new AndPredicate(new ArrayList<>());

    // Act and Assert
    assertEquals(andPredicate, andPredicate2);
    int expectedHashCodeResult = andPredicate.hashCode();
    assertEquals(expectedHashCodeResult, andPredicate2.hashCode());
  }

  /**
   * Test {@link AndPredicate#equals(Object)}, and
   * {@link AndPredicate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AndPredicate#equals(Object)}
   *   <li>{@link AndPredicate#hashCode()}
   * </ul>
   */
  @Test
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
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<Predicate<Object>> predicates = new ArrayList<>();
    predicates.add(mock(Predicate.class));
    AndPredicate andPredicate = new AndPredicate(predicates);

    // Act and Assert
    assertNotEquals(andPredicate, new AndPredicate(new ArrayList<>()));
  }

  /**
   * Test {@link AndPredicate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AndPredicate(new ArrayList<>()), null);
  }

  /**
   * Test {@link AndPredicate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AndPredicate#equals(Object)}
   */
  @Test
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AndPredicate(new ArrayList<>()), "Different type to AndPredicate");
  }

  /**
   * Test {@link AndPredicate#toString()}.
   * <p>
   * Method under test: {@link AndPredicate#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("AndEventFilter{andPredicate=Predicates.and()}", (new AndPredicate(new ArrayList<>())).toString());
  }
}
