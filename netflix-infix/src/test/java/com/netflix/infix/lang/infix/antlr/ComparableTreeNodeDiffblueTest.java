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

public class ComparableTreeNodeDiffblueTest {
  /**
   * Method under test: {@link ComparableTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new ComparableTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof ComparableTreeNode);
    assertEquals("null<ComparableTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((ComparableTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((ComparableTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link ComparableTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new ComparableTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof ComparableTreeNode);
    assertEquals("null<ComparableTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((ComparableTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link ComparableTreeNode#ComparableTreeNode(Token)}
   */
  @Test
  public void testNewComparableTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    ComparableTreeNode actualComparableTreeNode = new ComparableTreeNode(t);

    // Assert
    assertNull(actualComparableTreeNode.getChildren());
    assertNull(actualComparableTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualComparableTreeNode.getChildIndex());
    assertSame(t, actualComparableTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link ComparableTreeNode#ComparableTreeNode(ComparableTreeNode)}
   */
  @Test
  public void testNewComparableTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    ComparableTreeNode actualComparableTreeNode = new ComparableTreeNode(new ComparableTreeNode(t));

    // Assert
    assertEquals("null<ComparableTreeNode>", actualComparableTreeNode.toStringTree());
    assertNull(actualComparableTreeNode.getText());
    assertNull(actualComparableTreeNode.getChildren());
    assertNull(actualComparableTreeNode.getAncestors());
    assertNull(actualComparableTreeNode.getParent());
    assertEquals(0, actualComparableTreeNode.getChildCount());
    assertEquals(0, actualComparableTreeNode.getCharPositionInLine());
    assertEquals(0, actualComparableTreeNode.getLine());
    assertEquals(0, actualComparableTreeNode.getTokenStartIndex());
    assertEquals(0, actualComparableTreeNode.getTokenStopIndex());
    assertEquals(1, actualComparableTreeNode.getType());
    assertFalse(actualComparableTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualComparableTreeNode.getChildIndex());
    assertSame(t, actualComparableTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link ComparableTreeNode#ComparableTreeNode(ComparableTreeNode)}
   */
  @Test
  public void testNewComparableTreeNode3() {
    // Arrange and Act
    ComparableTreeNode actualComparableTreeNode = new ComparableTreeNode(new ComparableTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<ComparableTreeNode>", actualComparableTreeNode.toStringTree());
    assertNull(actualComparableTreeNode.getText());
    assertNull(actualComparableTreeNode.getChildren());
    assertNull(actualComparableTreeNode.getAncestors());
    assertNull(actualComparableTreeNode.getParent());
    assertEquals(0, actualComparableTreeNode.getChildCount());
    assertEquals(0, actualComparableTreeNode.getCharPositionInLine());
    assertEquals(0, actualComparableTreeNode.getLine());
    assertEquals(0, actualComparableTreeNode.getTokenStartIndex());
    assertEquals(0, actualComparableTreeNode.getTokenStopIndex());
    assertEquals(0, actualComparableTreeNode.getType());
    assertFalse(actualComparableTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualComparableTreeNode.getChildIndex());
  }
}
