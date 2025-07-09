package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class TimeMillisValueTreeNodeDiffblueTest {
  /**
   * Test {@link TimeMillisValueTreeNode#TimeMillisValueTreeNode(Token)}.
   *
   * <p>Method under test: {@link TimeMillisValueTreeNode#TimeMillisValueTreeNode(Token)}
   */
  @Test
  public void testNewTimeMillisValueTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    TimeMillisValueTreeNode actualTimeMillisValueTreeNode = new TimeMillisValueTreeNode(t);

    // Assert
    assertNull(actualTimeMillisValueTreeNode.getChildren());
    assertNull(actualTimeMillisValueTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualTimeMillisValueTreeNode.getChildIndex());
    assertSame(t, actualTimeMillisValueTreeNode.getToken());
  }

  /**
   * Test {@link TimeMillisValueTreeNode#TimeMillisValueTreeNode(TimeMillisValueTreeNode)}.
   *
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link
   * TimeMillisValueTreeNode#TimeMillisValueTreeNode(TimeMillisValueTreeNode)}
   */
  @Test
  public void testNewTimeMillisValueTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    TimeMillisValueTreeNode actualTimeMillisValueTreeNode =
        new TimeMillisValueTreeNode(new TimeMillisValueTreeNode(t));

    // Assert
    Token token = actualTimeMillisValueTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<TimeMillisValueTreeNode>", actualTimeMillisValueTreeNode.toStringTree());
    assertNull(actualTimeMillisValueTreeNode.getText());
    assertNull(actualTimeMillisValueTreeNode.getChildren());
    assertNull(actualTimeMillisValueTreeNode.getAncestors());
    assertNull(actualTimeMillisValueTreeNode.getParent());
    assertEquals(0, actualTimeMillisValueTreeNode.getChildCount());
    assertEquals(0, actualTimeMillisValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualTimeMillisValueTreeNode.getLine());
    assertEquals(0, actualTimeMillisValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualTimeMillisValueTreeNode.getTokenStopIndex());
    assertEquals(1, actualTimeMillisValueTreeNode.getType());
    assertFalse(actualTimeMillisValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualTimeMillisValueTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link TimeMillisValueTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link TimeMillisValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new TimeMillisValueTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof TimeMillisValueTreeNode);
    Token token = ((TimeMillisValueTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<TimeMillisValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((TimeMillisValueTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, token);
  }
}
