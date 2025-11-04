package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class StringTreeNodeDiffblueTest {
  /**
   * Method under test: {@link StringTreeNode#getValue()}
   */
  @Test
  public void testGetValue() {
    // Arrange, Act and Assert
    assertNull((new StringTreeNode(new ClassicToken(1))).getValue());
    assertNull((new StringTreeNode((Token) null)).getValue());
  }

  /**
   * Method under test: {@link StringTreeNode#getValue()}
   */
  @Test
  public void testGetValue2() {
    // Arrange
    Token t = mock(Token.class);
    when(t.getText()).thenReturn("Text");

    // Act
    String actualValue = (new StringTreeNode(t)).getValue();

    // Assert
    verify(t).getText();
    assertEquals("Text", actualValue);
  }

  /**
   * Method under test: {@link StringTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new StringTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof StringTreeNode);
    assertEquals("null<StringTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(((StringTreeNode) actualDupNodeResult).getValue());
    assertNull(actualDupNodeResult.getText());
    assertNull(((StringTreeNode) actualDupNodeResult).getChildren());
    assertNull(actualDupNodeResult.getAncestors());
    assertNull(actualDupNodeResult.getParent());
    assertEquals(0, actualDupNodeResult.getCharPositionInLine());
    assertEquals(0, actualDupNodeResult.getChildCount());
    assertEquals(0, actualDupNodeResult.getLine());
    assertEquals(0, actualDupNodeResult.getTokenStartIndex());
    assertEquals(0, actualDupNodeResult.getTokenStopIndex());
    assertEquals(1, actualDupNodeResult.getType());
    assertFalse(actualDupNodeResult.isNil());
    assertEquals(EventFilterLexer.EOF, actualDupNodeResult.getChildIndex());
    assertSame(t, ((StringTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link StringTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new StringTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof StringTreeNode);
    assertEquals("null<StringTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(((StringTreeNode) actualDupNodeResult).getValue());
    assertNull(actualDupNodeResult.getText());
    assertNull(((StringTreeNode) actualDupNodeResult).getChildren());
    assertNull(actualDupNodeResult.getAncestors());
    assertNull(actualDupNodeResult.getParent());
    assertEquals(0, actualDupNodeResult.getCharPositionInLine());
    assertEquals(0, actualDupNodeResult.getChildCount());
    assertEquals(0, actualDupNodeResult.getLine());
    assertEquals(0, actualDupNodeResult.getTokenStartIndex());
    assertEquals(0, actualDupNodeResult.getTokenStopIndex());
    assertEquals(0, actualDupNodeResult.getType());
    assertFalse(actualDupNodeResult.isNil());
    assertEquals(EventFilterLexer.EOF, actualDupNodeResult.getChildIndex());
  }

  /**
   * Method under test: {@link StringTreeNode#StringTreeNode(Token)}
   */
  @Test
  public void testNewStringTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    StringTreeNode actualStringTreeNode = new StringTreeNode(t);

    // Assert
    assertNull(actualStringTreeNode.getChildren());
    assertNull(actualStringTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualStringTreeNode.getChildIndex());
    assertSame(t, actualStringTreeNode.getToken());
  }

  /**
   * Method under test: {@link StringTreeNode#StringTreeNode(StringTreeNode)}
   */
  @Test
  public void testNewStringTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    StringTreeNode actualStringTreeNode = new StringTreeNode(new StringTreeNode(t));

    // Assert
    assertEquals("null<StringTreeNode>", actualStringTreeNode.toStringTree());
    assertNull(actualStringTreeNode.getValue());
    assertNull(actualStringTreeNode.getText());
    assertNull(actualStringTreeNode.getChildren());
    assertNull(actualStringTreeNode.getAncestors());
    assertNull(actualStringTreeNode.getParent());
    assertEquals(0, actualStringTreeNode.getChildCount());
    assertEquals(0, actualStringTreeNode.getCharPositionInLine());
    assertEquals(0, actualStringTreeNode.getLine());
    assertEquals(0, actualStringTreeNode.getTokenStartIndex());
    assertEquals(0, actualStringTreeNode.getTokenStopIndex());
    assertEquals(1, actualStringTreeNode.getType());
    assertFalse(actualStringTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualStringTreeNode.getChildIndex());
    assertSame(t, actualStringTreeNode.getToken());
  }

  /**
   * Method under test: {@link StringTreeNode#StringTreeNode(StringTreeNode)}
   */
  @Test
  public void testNewStringTreeNode3() {
    // Arrange and Act
    StringTreeNode actualStringTreeNode = new StringTreeNode(new StringTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<StringTreeNode>", actualStringTreeNode.toStringTree());
    assertNull(actualStringTreeNode.getValue());
    assertNull(actualStringTreeNode.getText());
    assertNull(actualStringTreeNode.getChildren());
    assertNull(actualStringTreeNode.getAncestors());
    assertNull(actualStringTreeNode.getParent());
    assertEquals(0, actualStringTreeNode.getChildCount());
    assertEquals(0, actualStringTreeNode.getCharPositionInLine());
    assertEquals(0, actualStringTreeNode.getLine());
    assertEquals(0, actualStringTreeNode.getTokenStartIndex());
    assertEquals(0, actualStringTreeNode.getTokenStopIndex());
    assertEquals(0, actualStringTreeNode.getType());
    assertFalse(actualStringTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualStringTreeNode.getChildIndex());
  }
}
