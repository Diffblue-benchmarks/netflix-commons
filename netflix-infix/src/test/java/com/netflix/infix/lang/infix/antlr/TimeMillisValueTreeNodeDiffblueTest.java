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

public class TimeMillisValueTreeNodeDiffblueTest {
  /**
   * Method under test: {@link TimeMillisValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new TimeMillisValueTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof TimeMillisValueTreeNode);
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
    assertSame(t, ((TimeMillisValueTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link TimeMillisValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new TimeMillisValueTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof TimeMillisValueTreeNode);
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
    assertEquals(0, actualDupNodeResult.getType());
    assertFalse(actualDupNodeResult.isNil());
    assertEquals(EventFilterLexer.EOF, actualDupNodeResult.getChildIndex());
  }

  /**
   * Method under test:
   * {@link TimeMillisValueTreeNode#TimeMillisValueTreeNode(Token)}
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
   * Method under test:
   * {@link TimeMillisValueTreeNode#TimeMillisValueTreeNode(TimeMillisValueTreeNode)}
   */
  @Test
  public void testNewTimeMillisValueTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    TimeMillisValueTreeNode actualTimeMillisValueTreeNode = new TimeMillisValueTreeNode(new TimeMillisValueTreeNode(t));

    // Assert
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
    assertSame(t, actualTimeMillisValueTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link TimeMillisValueTreeNode#TimeMillisValueTreeNode(TimeMillisValueTreeNode)}
   */
  @Test
  public void testNewTimeMillisValueTreeNode3() {
    // Arrange and Act
    TimeMillisValueTreeNode actualTimeMillisValueTreeNode = new TimeMillisValueTreeNode(
        new TimeMillisValueTreeNode(mock(Token.class)));

    // Assert
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
    assertEquals(0, actualTimeMillisValueTreeNode.getType());
    assertFalse(actualTimeMillisValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualTimeMillisValueTreeNode.getChildIndex());
  }
}
