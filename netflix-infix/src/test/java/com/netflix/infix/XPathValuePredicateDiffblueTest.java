package com.netflix.infix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class XPathValuePredicateDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link XPathValuePredicate#XPathValuePredicate(String, String)}
   *   <li>{@link XPathValuePredicate#toString()}
   *   <li>{@link XPathValuePredicate#getInputXpath()}
   *   <li>{@link XPathValuePredicate#getValueXpath()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void XPathValuePredicate.<init>(String, String)", "String XPathValuePredicate.getInputXpath()",
      "String XPathValuePredicate.getValueXpath()", "String XPathValuePredicate.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    XPathValuePredicate actualXPathValuePredicate = new XPathValuePredicate("42", "Input Xpath");
    String actualToStringResult = actualXPathValuePredicate.toString();
    String actualInputXpath = actualXPathValuePredicate.getInputXpath();

    // Assert
    assertEquals("42", actualXPathValuePredicate.getValueXpath());
    assertEquals("Input Xpath", actualInputXpath);
    assertEquals("PathValuePredicate [valueXpath=42, inputXpath=Input Xpath]", actualToStringResult);
  }

  /**
   * Test {@link XPathValuePredicate#apply(String)} with {@code String}.
   * <p>
   * Method under test: {@link XPathValuePredicate#apply(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.apply(String)"})
  public void testApplyWithString() {
    // Arrange, Act and Assert
    assertFalse((new XPathValuePredicate("42", "java.lang.String")).apply("Input"));
  }

  /**
   * Test {@link XPathValuePredicate#apply(String)} with {@code String}.
   * <p>
   * Method under test: {@link XPathValuePredicate#apply(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.apply(String)"})
  public void testApplyWithString2() {
    // Arrange, Act and Assert
    assertFalse((new XPathValuePredicate("java.lang.String", "42")).apply("Input"));
  }

  /**
   * Test {@link XPathValuePredicate#apply(String)} with {@code String}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link XPathValuePredicate#apply(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.apply(String)"})
  public void testApplyWithString_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue((new XPathValuePredicate("42", "42")).apply("Input"));
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}, and {@link XPathValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link XPathValuePredicate#equals(Object)}
   *   <li>{@link XPathValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    XPathValuePredicate xPathValuePredicate = new XPathValuePredicate("42", "Input Xpath");
    XPathValuePredicate xPathValuePredicate2 = new XPathValuePredicate("42", "Input Xpath");

    // Act and Assert
    assertEquals(xPathValuePredicate, xPathValuePredicate2);
    int expectedHashCodeResult = xPathValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, xPathValuePredicate2.hashCode());
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}, and {@link XPathValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link XPathValuePredicate#equals(Object)}
   *   <li>{@link XPathValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    XPathValuePredicate xPathValuePredicate = new XPathValuePredicate(null, "Input Xpath");
    XPathValuePredicate xPathValuePredicate2 = new XPathValuePredicate(null, "Input Xpath");

    // Act and Assert
    assertEquals(xPathValuePredicate, xPathValuePredicate2);
    int expectedHashCodeResult = xPathValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, xPathValuePredicate2.hashCode());
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}, and {@link XPathValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link XPathValuePredicate#equals(Object)}
   *   <li>{@link XPathValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    XPathValuePredicate xPathValuePredicate = new XPathValuePredicate("42", null);
    XPathValuePredicate xPathValuePredicate2 = new XPathValuePredicate("42", null);

    // Act and Assert
    assertEquals(xPathValuePredicate, xPathValuePredicate2);
    int expectedHashCodeResult = xPathValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, xPathValuePredicate2.hashCode());
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}, and {@link XPathValuePredicate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link XPathValuePredicate#equals(Object)}
   *   <li>{@link XPathValuePredicate#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    XPathValuePredicate xPathValuePredicate = new XPathValuePredicate("42", "Input Xpath");

    // Act and Assert
    assertEquals(xPathValuePredicate, xPathValuePredicate);
    int expectedHashCodeResult = xPathValuePredicate.hashCode();
    assertEquals(expectedHashCodeResult, xPathValuePredicate.hashCode());
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link XPathValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    XPathValuePredicate xPathValuePredicate = new XPathValuePredicate("Input Xpath", "Input Xpath");

    // Act and Assert
    assertNotEquals(xPathValuePredicate, new XPathValuePredicate("42", "Input Xpath"));
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link XPathValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    XPathValuePredicate xPathValuePredicate = new XPathValuePredicate(null, "Input Xpath");

    // Act and Assert
    assertNotEquals(xPathValuePredicate, new XPathValuePredicate("42", "Input Xpath"));
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link XPathValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    XPathValuePredicate xPathValuePredicate = new XPathValuePredicate("42", "42");

    // Act and Assert
    assertNotEquals(xPathValuePredicate, new XPathValuePredicate("42", "Input Xpath"));
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link XPathValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    XPathValuePredicate xPathValuePredicate = new XPathValuePredicate("42", null);

    // Act and Assert
    assertNotEquals(xPathValuePredicate, new XPathValuePredicate("42", "Input Xpath"));
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link XPathValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new XPathValuePredicate("42", "Input Xpath"), null);
  }

  /**
   * Test {@link XPathValuePredicate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link XPathValuePredicate#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean XPathValuePredicate.equals(Object)", "int XPathValuePredicate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new XPathValuePredicate("42", "Input Xpath"), "Different type to XPathValuePredicate");
  }
}
