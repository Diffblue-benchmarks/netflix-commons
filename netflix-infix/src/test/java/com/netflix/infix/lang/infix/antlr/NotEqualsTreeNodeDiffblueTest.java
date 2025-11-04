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

public class NotEqualsTreeNodeDiffblueTest {
  /**
   * Method under test: {@link NotEqualsTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NotEqualsTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NotEqualsTreeNode);
    assertEquals("null<NotEqualsTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NotEqualsTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((NotEqualsTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link NotEqualsTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new NotEqualsTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NotEqualsTreeNode);
    assertEquals("null<NotEqualsTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NotEqualsTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link NotEqualsTreeNode#NotEqualsTreeNode(Token)}
   */
  @Test
  public void testNewNotEqualsTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NotEqualsTreeNode actualNotEqualsTreeNode = new NotEqualsTreeNode(t);

    // Assert
    assertNull(actualNotEqualsTreeNode.getChildren());
    assertNull(actualNotEqualsTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNotEqualsTreeNode.getChildIndex());
    assertSame(t, actualNotEqualsTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link NotEqualsTreeNode#NotEqualsTreeNode(NotEqualsTreeNode)}
   */
  @Test
  public void testNewNotEqualsTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NotEqualsTreeNode actualNotEqualsTreeNode = new NotEqualsTreeNode(new NotEqualsTreeNode(t));

    // Assert
    assertEquals("null<NotEqualsTreeNode>", actualNotEqualsTreeNode.toStringTree());
    assertNull(actualNotEqualsTreeNode.getText());
    assertNull(actualNotEqualsTreeNode.getChildren());
    assertNull(actualNotEqualsTreeNode.getAncestors());
    assertNull(actualNotEqualsTreeNode.getParent());
    assertEquals(0, actualNotEqualsTreeNode.getChildCount());
    assertEquals(0, actualNotEqualsTreeNode.getCharPositionInLine());
    assertEquals(0, actualNotEqualsTreeNode.getLine());
    assertEquals(0, actualNotEqualsTreeNode.getTokenStartIndex());
    assertEquals(0, actualNotEqualsTreeNode.getTokenStopIndex());
    assertEquals(1, actualNotEqualsTreeNode.getType());
    assertFalse(actualNotEqualsTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNotEqualsTreeNode.getChildIndex());
    assertSame(t, actualNotEqualsTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link NotEqualsTreeNode#NotEqualsTreeNode(NotEqualsTreeNode)}
   */
  @Test
  public void testNewNotEqualsTreeNode3() {
    // Arrange and Act
    NotEqualsTreeNode actualNotEqualsTreeNode = new NotEqualsTreeNode(new NotEqualsTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<NotEqualsTreeNode>", actualNotEqualsTreeNode.toStringTree());
    assertNull(actualNotEqualsTreeNode.getText());
    assertNull(actualNotEqualsTreeNode.getChildren());
    assertNull(actualNotEqualsTreeNode.getAncestors());
    assertNull(actualNotEqualsTreeNode.getParent());
    assertEquals(0, actualNotEqualsTreeNode.getChildCount());
    assertEquals(0, actualNotEqualsTreeNode.getCharPositionInLine());
    assertEquals(0, actualNotEqualsTreeNode.getLine());
    assertEquals(0, actualNotEqualsTreeNode.getTokenStartIndex());
    assertEquals(0, actualNotEqualsTreeNode.getTokenStopIndex());
    assertEquals(0, actualNotEqualsTreeNode.getType());
    assertFalse(actualNotEqualsTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNotEqualsTreeNode.getChildIndex());
  }
}
