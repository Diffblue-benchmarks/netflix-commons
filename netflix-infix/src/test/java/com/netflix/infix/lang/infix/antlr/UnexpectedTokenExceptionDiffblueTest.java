package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class UnexpectedTokenExceptionDiffblueTest {
  /**
   * Method under test:
   * {@link UnexpectedTokenException#UnexpectedTokenException(Tree, String[])}
   */
  @Test
  public void testNewUnexpectedTokenException() {
    // Arrange and Act
    UnexpectedTokenException actualUnexpectedTokenException = new UnexpectedTokenException(
        new AndTreeNode(new ClassicToken(1)), "Expected");

    // Assert
    assertEquals("Unexpected token null at 0:0. Expected: Expected", actualUnexpectedTokenException.getMessage());
    assertEquals("Unexpected token null at 0:0. Expected: Expected",
        actualUnexpectedTokenException.getLocalizedMessage());
    assertNull(actualUnexpectedTokenException.getCause());
    assertEquals(0, actualUnexpectedTokenException.getSuppressed().length);
  }

  /**
   * Method under test:
   * {@link UnexpectedTokenException#UnexpectedTokenException(Tree, String[])}
   */
  @Test
  public void testNewUnexpectedTokenException2() {
    // Arrange and Act
    UnexpectedTokenException actualUnexpectedTokenException = new UnexpectedTokenException(
        new AndTreeNode(mock(Token.class)), "Expected");

    // Assert
    assertEquals("Unexpected token null at 0:0. Expected: Expected", actualUnexpectedTokenException.getMessage());
    assertEquals("Unexpected token null at 0:0. Expected: Expected",
        actualUnexpectedTokenException.getLocalizedMessage());
    assertNull(actualUnexpectedTokenException.getCause());
    assertEquals(0, actualUnexpectedTokenException.getSuppressed().length);
  }

  /**
   * Method under test: {@link UnexpectedTokenException#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Unexpected token null at 0:0. Expected: Expected",
        (new UnexpectedTokenException(new AndTreeNode(new ClassicToken(1)), "Expected")).toString());
  }

  /**
   * Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  public void testGetMessage() {
    // Arrange, Act and Assert
    assertEquals("Unexpected token null at 0:0. Expected: Expected",
        (new UnexpectedTokenException(new AndTreeNode(new ClassicToken(1)), "Expected")).getMessage());
  }

  /**
   * Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  public void testGetMessage2() {
    // Arrange
    Token t = mock(Token.class);
    when(t.getCharPositionInLine()).thenReturn(2);
    when(t.getLine()).thenReturn(2);
    when(t.getText()).thenReturn("Text");

    // Act
    String actualMessage = (new UnexpectedTokenException(new AndTreeNode(t), "Expected")).getMessage();

    // Assert
    verify(t, atLeast(1)).getCharPositionInLine();
    verify(t, atLeast(1)).getLine();
    verify(t).getText();
    assertEquals("Unexpected token Text at 2:2. Expected: Expected", actualMessage);
  }

  /**
   * Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  public void testGetMessage3() {
    // Arrange
    Token t = mock(Token.class);
    when(t.getCharPositionInLine()).thenReturn(2);
    when(t.getLine()).thenReturn(2);
    when(t.getText()).thenReturn("Text");

    // Act
    String actualMessage = (new UnexpectedTokenException(new AndTreeNode(t))).getMessage();

    // Assert
    verify(t, atLeast(1)).getCharPositionInLine();
    verify(t, atLeast(1)).getLine();
    verify(t).getText();
    assertEquals("Unexpected token Text at 2:2. Expected: ", actualMessage);
  }

  /**
   * Method under test: {@link UnexpectedTokenException#getMessage()}
   */
  @Test
  public void testGetMessage4() {
    // Arrange
    Token t = mock(Token.class);
    when(t.getCharPositionInLine()).thenReturn(2);
    when(t.getLine()).thenReturn(2);
    when(t.getText()).thenReturn("Text");

    // Act
    String actualMessage = (new UnexpectedTokenException(new AndTreeNode(t),
        "Unexpected token %s at %d:%d. Expected: %s", "Expected")).getMessage();

    // Assert
    verify(t, atLeast(1)).getCharPositionInLine();
    verify(t, atLeast(1)).getLine();
    verify(t).getText();
    assertEquals("Unexpected token Text at 2:2. Expected: Unexpected token %s at %d:%d. Expected: %s or Expected",
        actualMessage);
  }
}
