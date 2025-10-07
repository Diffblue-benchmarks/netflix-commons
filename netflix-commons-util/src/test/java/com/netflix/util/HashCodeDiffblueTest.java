package com.netflix.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class HashCodeDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link HashCode}
   *   <li>{@link HashCode#toString()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashCode.<init>()", "java.lang.String HashCode.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("{HashCode 17}", new HashCode().toString());
  }

  /**
   * Test {@link HashCode#addValue(boolean[])} with {@code boolean[]}.
   *
   * <p>Method under test: {@link HashCode#addValue(boolean[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(boolean[])"})
  public void testAddValueWithBoolean() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue(new boolean[] {true, false, true, false});

    // Assert
    assertEquals(31862107, actualAddValueResult);
    assertEquals(1178898024, hashCode.addValue((byte) 'A'));
    assertEquals(669553987, hashCode.addValue('A'));
    assertEquals(-2068213078, hashCode.addValue(10.0d));
    assertEquals(-1878143620, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(boolean)} with {@code boolean}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return six hundred thirty.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#addValue(boolean)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(boolean)"})
  public void testAddValueWithBoolean_whenFalse_thenReturnSixHundredThirty() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(630, hashCode.addValue(false));
    assertEquals(23375, hashCode.addValue((byte) 'A'));
    assertEquals(864940, hashCode.addValue('A'));
    assertEquals(1103909596, hashCode.addValue(10.0d));
    assertEquals(-1012401723, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(boolean)} with {@code boolean}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return six hundred twenty-nine.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#addValue(boolean)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(boolean)"})
  public void testAddValueWithBoolean_whenTrue_thenReturnSixHundredTwentyNine() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(629, hashCode.addValue(true));
    assertEquals(23338, hashCode.addValue((byte) 'A'));
    assertEquals(863571, hashCode.addValue('A'));
    assertEquals(1103334655, hashCode.addValue(10.0d));
    assertEquals(-1033674542, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(byte)} with {@code byte}.
   *
   * <p>Method under test: {@link HashCode#addValue(byte)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(byte)"})
  public void testAddValueWithByte() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(694, hashCode.addValue((byte) 'A'));
    assertEquals(25743, hashCode.addValue('A'));
    assertEquals(1076529323, hashCode.addValue(10.0d));
    assertEquals(-2025471810, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(byte[])} with {@code byte[]}.
   *
   * <p>Method under test: {@link HashCode#addValue(byte[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(byte[])"})
  public void testAddValueWithByte2() throws UnsupportedEncodingException {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(750759236, actualAddValueResult);
    assertEquals(2008288019, hashCode.addValue((byte) 'A'));
    assertEquals(1292212753, hashCode.addValue('A'));
    assertEquals(1642808446, hashCode.addValue(10.0d));
    assertEquals(1746986552, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(char)} with {@code char}.
   *
   * <p>Method under test: {@link HashCode#addValue(char)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(char)"})
  public void testAddValueWithChar() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(694, hashCode.addValue('A'));
    assertEquals(25743, hashCode.addValue((byte) 'A'));
    assertEquals(1076529323, hashCode.addValue(10.0d));
    assertEquals(-2025471810, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(char[])} with {@code char[]}.
   *
   * <p>Method under test: {@link HashCode#addValue(char[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(char[])"})
  public void testAddValueWithChar2() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue("A A ".toCharArray());

    // Assert
    assertEquals(35199427, actualAddValueResult);
    assertEquals(1302378864, hashCode.addValue((byte) 'A'));
    assertEquals(943377786, hashCode.addValue('A'));
    assertEquals(1616622250, hashCode.addValue(10.0d));
    assertEquals(778097308, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(double)} with {@code double}.
   *
   * <p>Method under test: {@link HashCode#addValue(double)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(double)"})
  public void testAddValueWithDouble() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(1076101749, hashCode.addValue(10.0d));
    assertEquals(1161059107, hashCode.addValue((byte) 'A'));
    assertEquals(9514074, hashCode.addValue('A'));
    assertEquals(1444636930, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(double[])} with {@code double[]}.
   *
   * <p>Method under test: {@link HashCode#addValue(double[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(double[])"})
  public void testAddValueWithDouble2() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(-1437465160, actualAddValueResult);
    assertEquals(1646603306, hashCode.addValue((byte) 'A'));
    assertEquals(794780253, hashCode.addValue('A'));
    assertEquals(-1729284233, hashCode.addValue(10.0d));
    assertEquals(-1533609022, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(float)} with {@code float}.
   *
   * <p>Method under test: {@link HashCode#addValue(float)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(float)"})
  public void testAddValueWithFloat() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(1092616821, hashCode.addValue(10.0f));
    assertEquals(1772116771, hashCode.addValue((byte) 'A'));
    assertEquals(1143811167, hashCode.addValue('A'));
    assertEquals(-1700566606, hashCode.addValue(10.0d));
  }

  /**
   * Test {@link HashCode#addValue(float[])} with {@code float[]}.
   *
   * <p>Method under test: {@link HashCode#addValue(float[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(float[])"})
  public void testAddValueWithFloat2() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue(new float[] {10.0f, 0.5f, 10.0f, 0.5f});

    // Assert
    assertEquals(333055537, actualAddValueResult);
    assertEquals(-561846956, hashCode.addValue((byte) 'A'));
    assertEquals(-686499170, hashCode.addValue('A'));
    assertEquals(1444964140, hashCode.addValue(10.0d));
    assertEquals(-1278285488, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(int)} with {@code int}.
   *
   * <p>Method under test: {@link HashCode#addValue(int)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(int)"})
  public void testAddValueWithInt() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(631, hashCode.addValue(2));
    assertEquals(23412, hashCode.addValue((byte) 'A'));
    assertEquals(866309, hashCode.addValue('A'));
    assertEquals(1103960249, hashCode.addValue(10.0d));
    assertEquals(-1010527564, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(int[])} with {@code int[]}.
   *
   * <p>Method under test: {@link HashCode#addValue(int[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(int[])"})
  public void testAddValueWithInt2() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue(new int[] {2, 1, 2, 1});

    // Assert
    assertEquals(31963487, actualAddValueResult);
    assertEquals(1182649084, hashCode.addValue((byte) 'A'));
    assertEquals(808343207, hashCode.addValue('A'));
    assertEquals(-1231649243, hashCode.addValue(10.0d));
    assertEquals(1528732844, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Array}.
   *   <li>Then return {@code 63538350}.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#addValue(Object[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(Object[])"})
  public void testAddValueWithObject_whenArrayOfObjectWithArray_thenReturn63538350() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue(new Object[] {"Array"});

    // Assert
    assertEquals(63538350, actualAddValueResult);
    assertEquals(-1944048281, hashCode.addValue((byte) 'A'));
    assertEquals(-1084657717, hashCode.addValue('A'));
    assertEquals(-405874783, hashCode.addValue(10.0d));
    assertEquals(1039848889, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.
   *   <li>Then return six hundred twenty-nine.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#addValue(Object[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(Object[])"})
  public void testAddValueWithObject_whenArrayOfObjectWithNull_thenReturnSixHundredTwentyNine() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue(new Object[] {null});

    // Assert
    assertEquals(629, actualAddValueResult);
    assertEquals(23338, hashCode.addValue((byte) 'A'));
    assertEquals(863571, hashCode.addValue('A'));
    assertEquals(1103334655, hashCode.addValue(10.0d));
    assertEquals(-1033674542, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return six hundred twenty-nine.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#addValue(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(Object)"})
  public void testAddValueWithObject_whenNull_thenReturnSixHundredTwentyNine() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(629, hashCode.addValue((Object) null));
    assertEquals(23338, hashCode.addValue((byte) 'A'));
    assertEquals(863571, hashCode.addValue('A'));
    assertEquals(1103334655, hashCode.addValue(10.0d));
    assertEquals(-1033674542, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(Object)} with {@code Object}.
   *
   * <ul>
   *   <li>When {@code Obj}.
   *   <li>Then return {@code 79692}.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#addValue(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(Object)"})
  public void testAddValueWithObject_whenObj_thenReturn79692() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(79692, hashCode.addValue("Obj"));
    assertEquals(2948669, hashCode.addValue((byte) 'A'));
    assertEquals(109100818, hashCode.addValue('A'));
    assertEquals(-1329619558, hashCode.addValue(10.0d));
    assertEquals(858667190, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(short)} with {@code short}.
   *
   * <p>Method under test: {@link HashCode#addValue(short)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(short)"})
  public void testAddValueWithShort() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(630, hashCode.addValue((short) 1));
    assertEquals(23375, hashCode.addValue((byte) 'A'));
    assertEquals(864940, hashCode.addValue('A'));
    assertEquals(1103909596, hashCode.addValue(10.0d));
    assertEquals(-1012401723, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#addValue(short[])} with {@code short[]}.
   *
   * <p>Method under test: {@link HashCode#addValue(short[])}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"int HashCode.addValue(short[])"})
  public void testAddValueWithShort2() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act
    int actualAddValueResult = hashCode.addValue(new short[] {1, 17, 1, 17});

    // Assert
    assertEquals(31934717, actualAddValueResult);
    assertEquals(1181584594, hashCode.addValue((byte) 'A'));
    assertEquals(768957073, hashCode.addValue('A'));
    assertEquals(-537782541, hashCode.addValue(10.0d));
    assertEquals(1625468644, hashCode.addValue(10.0f));
  }

  /**
   * Test {@link HashCode#equalObjects(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equalObjects(Object, Object)"})
  public void testEqualObjects_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(HashCode.equalObjects(null, null));
  }

  /**
   * Test {@link HashCode#equalObjects(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code O1}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equalObjects(Object, Object)"})
  public void testEqualObjects_whenO1_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(HashCode.equalObjects("O1", "O2"));
  }

  /**
   * Test {@link HashCode#equalObjects(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code O1}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equalObjects(Object, Object)"})
  public void testEqualObjects_whenO1_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(HashCode.equalObjects("O1", null));
  }

  /**
   * Test {@link HashCode#equalObjects(Object, Object)}.
   *
   * <ul>
   *   <li>When {@code O2}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#equalObjects(Object, Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equalObjects(Object, Object)"})
  public void testEqualObjects_whenO2_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(HashCode.equalObjects(null, "O2"));
  }

  /**
   * Test {@link HashCode#equals(Object)}, and {@link HashCode#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HashCode#equals(Object)}
   *   <li>{@link HashCode#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equals(Object)", "int HashCode.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashCode hashCode = new HashCode();
    HashCode hashCode2 = new HashCode();

    // Act and Assert
    assertEquals(hashCode, hashCode2);
    assertEquals(hashCode.hashCode(), hashCode2.hashCode());
  }

  /**
   * Test {@link HashCode#equals(Object)}, and {@link HashCode#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HashCode#equals(Object)}
   *   <li>{@link HashCode#hashCode()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equals(Object)", "int HashCode.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashCode hashCode = new HashCode();

    // Act and Assert
    assertEquals(hashCode, hashCode);
    int expectedHashCodeResult = hashCode.hashCode();
    assertEquals(expectedHashCodeResult, hashCode.hashCode());
  }

  /**
   * Test {@link HashCode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equals(Object)", "int HashCode.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashCode hashCode = new HashCode();
    hashCode.addValue("Obj");

    // Act and Assert
    assertNotEquals(hashCode, new HashCode());
  }

  /**
   * Test {@link HashCode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equals(Object)", "int HashCode.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new HashCode(), null);
  }

  /**
   * Test {@link HashCode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HashCode#equals(Object)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HashCode.equals(Object)", "int HashCode.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new HashCode(), "Different type to HashCode");
  }
}
