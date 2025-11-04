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

public class NumericInTreeNodeDiffblueTest {
  /**
   * Method under test: {@link NumericInTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NumericInTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NumericInTreeNode);
    assertEquals("null<NumericInTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NumericInTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((NumericInTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link NumericInTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new NumericInTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NumericInTreeNode);
    assertEquals("null<NumericInTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NumericInTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link NumericInTreeNode#NumericInTreeNode(Token)}
   */
  @Test
  public void testNewNumericInTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NumericInTreeNode actualNumericInTreeNode = new NumericInTreeNode(t);

    // Assert
    assertNull(actualNumericInTreeNode.getChildren());
    assertNull(actualNumericInTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNumericInTreeNode.getChildIndex());
    assertSame(t, actualNumericInTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link NumericInTreeNode#NumericInTreeNode(NumericInTreeNode)}
   */
  @Test
  public void testNewNumericInTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NumericInTreeNode actualNumericInTreeNode = new NumericInTreeNode(new NumericInTreeNode(t));

    // Assert
    assertEquals("null<NumericInTreeNode>", actualNumericInTreeNode.toStringTree());
    assertNull(actualNumericInTreeNode.getText());
    assertNull(actualNumericInTreeNode.getChildren());
    assertNull(actualNumericInTreeNode.getAncestors());
    assertNull(actualNumericInTreeNode.getParent());
    assertEquals(0, actualNumericInTreeNode.getChildCount());
    assertEquals(0, actualNumericInTreeNode.getCharPositionInLine());
    assertEquals(0, actualNumericInTreeNode.getLine());
    assertEquals(0, actualNumericInTreeNode.getTokenStartIndex());
    assertEquals(0, actualNumericInTreeNode.getTokenStopIndex());
    assertEquals(1, actualNumericInTreeNode.getType());
    assertFalse(actualNumericInTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNumericInTreeNode.getChildIndex());
    assertSame(t, actualNumericInTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link NumericInTreeNode#NumericInTreeNode(NumericInTreeNode)}
   */
  @Test
  public void testNewNumericInTreeNode3() {
    // Arrange and Act
    NumericInTreeNode actualNumericInTreeNode = new NumericInTreeNode(new NumericInTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<NumericInTreeNode>", actualNumericInTreeNode.toStringTree());
    assertNull(actualNumericInTreeNode.getText());
    assertNull(actualNumericInTreeNode.getChildren());
    assertNull(actualNumericInTreeNode.getAncestors());
    assertNull(actualNumericInTreeNode.getParent());
    assertEquals(0, actualNumericInTreeNode.getChildCount());
    assertEquals(0, actualNumericInTreeNode.getCharPositionInLine());
    assertEquals(0, actualNumericInTreeNode.getLine());
    assertEquals(0, actualNumericInTreeNode.getTokenStartIndex());
    assertEquals(0, actualNumericInTreeNode.getTokenStopIndex());
    assertEquals(0, actualNumericInTreeNode.getType());
    assertFalse(actualNumericInTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNumericInTreeNode.getChildIndex());
  }
}
