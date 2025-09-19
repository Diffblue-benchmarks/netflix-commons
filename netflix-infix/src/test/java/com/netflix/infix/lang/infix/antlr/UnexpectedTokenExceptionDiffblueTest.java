package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class UnexpectedTokenExceptionDiffblueTest {
  /**
   * Test {@link UnexpectedTokenException#UnexpectedTokenException(Tree, String[])}.
   *
   * <p>Method under test: {@link UnexpectedTokenException#UnexpectedTokenException(Tree, String[])}
   */
  @Test
  public void testNewUnexpectedTokenException() {
    // Arrange and Act
    UnexpectedTokenException actualUnexpectedTokenException =
        new UnexpectedTokenException(new CommonTree(), "Expected");

    // Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: Expected",
        actualUnexpectedTokenException.getMessage());
    assertEquals(
        "Unexpected token null at 0:0. Expected: Expected",
        actualUnexpectedTokenException.getLocalizedMessage());
    assertNull(actualUnexpectedTokenException.getCause());
    assertEquals(0, actualUnexpectedTokenException.getSuppressed().length);
  }

  /**
   * Test {@link UnexpectedTokenException#toString()}.
   *
   * <p>Method under test: {@link UnexpectedTokenException#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: Expected",
        new UnexpectedTokenException(new CommonTree(), "Expected").toString());
  }

  /**
   * Test {@link UnexpectedTokenException#getMessage()}.
   *
   * <p>Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  public void testGetMessage() {
    // Arrange
    UnexpectedTokenException unexpectedTokenException =
        new UnexpectedTokenException(
            new CommonTree(), "Unexpected token %s at %d:%d. Expected: %s", "Expected");

    // Act and Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: Unexpected token %s at %d:%d. Expected: %s or Expected",
        unexpectedTokenException.getMessage());
  }

  /**
   * Test {@link UnexpectedTokenException#getMessage()}.
   *
   * <ul>
   *   <li>Then return {@code Unexpected token null at 0:0. Expected:}.
   * </ul>
   *
   * <p>Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  public void testGetMessage_thenReturnUnexpectedTokenNullAt00Expected() {
    // Arrange, Act and Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: ",
        new UnexpectedTokenException(new CommonTree()).getMessage());
  }

  /**
   * Test {@link UnexpectedTokenException#getMessage()}.
   *
   * <ul>
   *   <li>Then return {@code Unexpected token null at 0:0. Expected: Expected}.
   * </ul>
   *
   * <p>Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  public void testGetMessage_thenReturnUnexpectedTokenNullAt00ExpectedExpected() {
    // Arrange, Act and Assert
    assertEquals(
        "Unexpected token null at 0:0. Expected: Expected",
        new UnexpectedTokenException(new CommonTree(), "Expected").getMessage());
  }
}
