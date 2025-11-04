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

public class MatchesTreeNodeDiffblueTest {
  /**
   * Method under test: {@link MatchesTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new MatchesTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof MatchesTreeNode);
    assertEquals("null<MatchesTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((MatchesTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((MatchesTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link MatchesTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new MatchesTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof MatchesTreeNode);
    assertEquals("null<MatchesTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((MatchesTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link MatchesTreeNode#MatchesTreeNode(Token)}
   */
  @Test
  public void testNewMatchesTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    MatchesTreeNode actualMatchesTreeNode = new MatchesTreeNode(t);

    // Assert
    assertNull(actualMatchesTreeNode.getChildren());
    assertNull(actualMatchesTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualMatchesTreeNode.getChildIndex());
    assertSame(t, actualMatchesTreeNode.getToken());
  }

  /**
   * Method under test: {@link MatchesTreeNode#MatchesTreeNode(MatchesTreeNode)}
   */
  @Test
  public void testNewMatchesTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    MatchesTreeNode actualMatchesTreeNode = new MatchesTreeNode(new MatchesTreeNode(t));

    // Assert
    assertEquals("null<MatchesTreeNode>", actualMatchesTreeNode.toStringTree());
    assertNull(actualMatchesTreeNode.getText());
    assertNull(actualMatchesTreeNode.getChildren());
    assertNull(actualMatchesTreeNode.getAncestors());
    assertNull(actualMatchesTreeNode.getParent());
    assertEquals(0, actualMatchesTreeNode.getChildCount());
    assertEquals(0, actualMatchesTreeNode.getCharPositionInLine());
    assertEquals(0, actualMatchesTreeNode.getLine());
    assertEquals(0, actualMatchesTreeNode.getTokenStartIndex());
    assertEquals(0, actualMatchesTreeNode.getTokenStopIndex());
    assertEquals(1, actualMatchesTreeNode.getType());
    assertFalse(actualMatchesTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualMatchesTreeNode.getChildIndex());
    assertSame(t, actualMatchesTreeNode.getToken());
  }

  /**
   * Method under test: {@link MatchesTreeNode#MatchesTreeNode(MatchesTreeNode)}
   */
  @Test
  public void testNewMatchesTreeNode3() {
    // Arrange and Act
    MatchesTreeNode actualMatchesTreeNode = new MatchesTreeNode(new MatchesTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<MatchesTreeNode>", actualMatchesTreeNode.toStringTree());
    assertNull(actualMatchesTreeNode.getText());
    assertNull(actualMatchesTreeNode.getChildren());
    assertNull(actualMatchesTreeNode.getAncestors());
    assertNull(actualMatchesTreeNode.getParent());
    assertEquals(0, actualMatchesTreeNode.getChildCount());
    assertEquals(0, actualMatchesTreeNode.getCharPositionInLine());
    assertEquals(0, actualMatchesTreeNode.getLine());
    assertEquals(0, actualMatchesTreeNode.getTokenStartIndex());
    assertEquals(0, actualMatchesTreeNode.getTokenStopIndex());
    assertEquals(0, actualMatchesTreeNode.getType());
    assertFalse(actualMatchesTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualMatchesTreeNode.getChildIndex());
  }
}
