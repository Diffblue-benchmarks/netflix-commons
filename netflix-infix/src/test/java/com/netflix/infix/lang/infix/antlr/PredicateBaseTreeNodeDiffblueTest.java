package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.junit.Test;

public class PredicateBaseTreeNodeDiffblueTest {
  /**
   * Method under test: {@link PredicateBaseTreeNode#toString()}
   */
  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("null<AndTreeNode>", (new AndTreeNode(new ClassicToken(1))).toString());
    assertEquals("null<AndTreeNode>", (new AndTreeNode((Token) null)).toString());
  }

  /**
   * Method under test: {@link PredicateBaseTreeNode#toString()}
   */
  @Test
  public void testToString2() {
    // Arrange
    Token t = mock(Token.class);
    when(t.getText()).thenReturn("Text");

    // Act
    String actualToStringResult = (new AndTreeNode(t)).toString();

    // Assert
    verify(t).getText();
    assertEquals("Text<AndTreeNode>", actualToStringResult);
  }
}
