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

public class AndTreeNodeDiffblueTest {
  /**
   * Method under test: {@link AndTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new AndTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof AndTreeNode);
    assertEquals("null<AndTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((AndTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((AndTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link AndTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new AndTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof AndTreeNode);
    assertEquals("null<AndTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((AndTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link AndTreeNode#AndTreeNode(Token)}
   */
  @Test
  public void testNewAndTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    AndTreeNode actualAndTreeNode = new AndTreeNode(t);

    // Assert
    assertNull(actualAndTreeNode.getChildren());
    assertNull(actualAndTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualAndTreeNode.getChildIndex());
    assertSame(t, actualAndTreeNode.getToken());
  }

  /**
   * Method under test: {@link AndTreeNode#AndTreeNode(AndTreeNode)}
   */
  @Test
  public void testNewAndTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    AndTreeNode actualAndTreeNode = new AndTreeNode(new AndTreeNode(t));

    // Assert
    assertEquals("null<AndTreeNode>", actualAndTreeNode.toStringTree());
    assertNull(actualAndTreeNode.getText());
    assertNull(actualAndTreeNode.getChildren());
    assertNull(actualAndTreeNode.getAncestors());
    assertNull(actualAndTreeNode.getParent());
    assertEquals(0, actualAndTreeNode.getChildCount());
    assertEquals(0, actualAndTreeNode.getCharPositionInLine());
    assertEquals(0, actualAndTreeNode.getLine());
    assertEquals(0, actualAndTreeNode.getTokenStartIndex());
    assertEquals(0, actualAndTreeNode.getTokenStopIndex());
    assertEquals(1, actualAndTreeNode.getType());
    assertFalse(actualAndTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualAndTreeNode.getChildIndex());
    assertSame(t, actualAndTreeNode.getToken());
  }

  /**
   * Method under test: {@link AndTreeNode#AndTreeNode(AndTreeNode)}
   */
  @Test
  public void testNewAndTreeNode3() {
    // Arrange and Act
    AndTreeNode actualAndTreeNode = new AndTreeNode(new AndTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<AndTreeNode>", actualAndTreeNode.toStringTree());
    assertNull(actualAndTreeNode.getText());
    assertNull(actualAndTreeNode.getChildren());
    assertNull(actualAndTreeNode.getAncestors());
    assertNull(actualAndTreeNode.getParent());
    assertEquals(0, actualAndTreeNode.getChildCount());
    assertEquals(0, actualAndTreeNode.getCharPositionInLine());
    assertEquals(0, actualAndTreeNode.getLine());
    assertEquals(0, actualAndTreeNode.getTokenStartIndex());
    assertEquals(0, actualAndTreeNode.getTokenStopIndex());
    assertEquals(0, actualAndTreeNode.getType());
    assertFalse(actualAndTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualAndTreeNode.getChildIndex());
  }
}
