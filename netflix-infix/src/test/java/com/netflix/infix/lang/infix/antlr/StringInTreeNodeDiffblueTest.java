package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class StringInTreeNodeDiffblueTest {
  /**
   * Method under test: {@link StringInTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new StringInTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof StringInTreeNode);
    assertEquals("null<StringInTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((StringInTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((StringInTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link StringInTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new StringInTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof StringInTreeNode);
    assertEquals("null<StringInTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((StringInTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link StringInTreeNode#StringInTreeNode(Token)}
   */
  @Test
  public void testNewStringInTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    StringInTreeNode actualStringInTreeNode = new StringInTreeNode(t);

    // Assert
    assertNull(actualStringInTreeNode.getChildren());
    assertNull(actualStringInTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualStringInTreeNode.getChildIndex());
    assertSame(t, actualStringInTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link StringInTreeNode#StringInTreeNode(StringInTreeNode)}
   */
  @Test
  public void testNewStringInTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    StringInTreeNode actualStringInTreeNode = new StringInTreeNode(new StringInTreeNode(t));

    // Assert
    assertEquals("null<StringInTreeNode>", actualStringInTreeNode.toStringTree());
    assertNull(actualStringInTreeNode.getText());
    assertNull(actualStringInTreeNode.getChildren());
    assertNull(actualStringInTreeNode.getAncestors());
    assertNull(actualStringInTreeNode.getParent());
    assertEquals(0, actualStringInTreeNode.getChildCount());
    assertEquals(0, actualStringInTreeNode.getCharPositionInLine());
    assertEquals(0, actualStringInTreeNode.getLine());
    assertEquals(0, actualStringInTreeNode.getTokenStartIndex());
    assertEquals(0, actualStringInTreeNode.getTokenStopIndex());
    assertEquals(1, actualStringInTreeNode.getType());
    assertFalse(actualStringInTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualStringInTreeNode.getChildIndex());
    assertSame(t, actualStringInTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link StringInTreeNode#StringInTreeNode(StringInTreeNode)}
   */
  @Test
  public void testNewStringInTreeNode3() {
    // Arrange and Act
    StringInTreeNode actualStringInTreeNode = new StringInTreeNode(new StringInTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<StringInTreeNode>", actualStringInTreeNode.toStringTree());
    assertNull(actualStringInTreeNode.getText());
    assertNull(actualStringInTreeNode.getChildren());
    assertNull(actualStringInTreeNode.getAncestors());
    assertNull(actualStringInTreeNode.getParent());
    assertEquals(0, actualStringInTreeNode.getChildCount());
    assertEquals(0, actualStringInTreeNode.getCharPositionInLine());
    assertEquals(0, actualStringInTreeNode.getLine());
    assertEquals(0, actualStringInTreeNode.getTokenStartIndex());
    assertEquals(0, actualStringInTreeNode.getTokenStopIndex());
    assertEquals(0, actualStringInTreeNode.getType());
    assertFalse(actualStringInTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualStringInTreeNode.getChildIndex());
  }
}
