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

public class NumberTreeNodeDiffblueTest {
  /**
   * Method under test: {@link NumberTreeNode#getValue()}
   */
  @Test
  public void testGetValue() {
    // Arrange
    Token t = mock(Token.class);
    when(t.getText()).thenReturn("42");

    // Act
    Number actualValue = (new NumberTreeNode(t)).getValue();

    // Assert
    verify(t).getText();
    assertEquals(42.0d, actualValue.doubleValue(), 0.0);
  }

  /**
   * Method under test: {@link NumberTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NumberTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NumberTreeNode);
    assertEquals("null<NumberTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NumberTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((NumberTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link NumberTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new NumberTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NumberTreeNode);
    assertEquals("null<NumberTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NumberTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link NumberTreeNode#NumberTreeNode(Token)}
   */
  @Test
  public void testNewNumberTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NumberTreeNode actualNumberTreeNode = new NumberTreeNode(t);

    // Assert
    assertNull(actualNumberTreeNode.getChildren());
    assertNull(actualNumberTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNumberTreeNode.getChildIndex());
    assertSame(t, actualNumberTreeNode.getToken());
  }

  /**
   * Method under test: {@link NumberTreeNode#NumberTreeNode(NumberTreeNode)}
   */
  @Test
  public void testNewNumberTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NumberTreeNode actualNumberTreeNode = new NumberTreeNode(new NumberTreeNode(t));

    // Assert
    assertEquals("null<NumberTreeNode>", actualNumberTreeNode.toStringTree());
    assertNull(actualNumberTreeNode.getText());
    assertNull(actualNumberTreeNode.getChildren());
    assertNull(actualNumberTreeNode.getAncestors());
    assertNull(actualNumberTreeNode.getParent());
    assertEquals(0, actualNumberTreeNode.getChildCount());
    assertEquals(0, actualNumberTreeNode.getCharPositionInLine());
    assertEquals(0, actualNumberTreeNode.getLine());
    assertEquals(0, actualNumberTreeNode.getTokenStartIndex());
    assertEquals(0, actualNumberTreeNode.getTokenStopIndex());
    assertEquals(1, actualNumberTreeNode.getType());
    assertFalse(actualNumberTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNumberTreeNode.getChildIndex());
    assertSame(t, actualNumberTreeNode.getToken());
  }

  /**
   * Method under test: {@link NumberTreeNode#NumberTreeNode(NumberTreeNode)}
   */
  @Test
  public void testNewNumberTreeNode3() {
    // Arrange and Act
    NumberTreeNode actualNumberTreeNode = new NumberTreeNode(new NumberTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<NumberTreeNode>", actualNumberTreeNode.toStringTree());
    assertNull(actualNumberTreeNode.getText());
    assertNull(actualNumberTreeNode.getChildren());
    assertNull(actualNumberTreeNode.getAncestors());
    assertNull(actualNumberTreeNode.getParent());
    assertEquals(0, actualNumberTreeNode.getChildCount());
    assertEquals(0, actualNumberTreeNode.getCharPositionInLine());
    assertEquals(0, actualNumberTreeNode.getLine());
    assertEquals(0, actualNumberTreeNode.getTokenStartIndex());
    assertEquals(0, actualNumberTreeNode.getTokenStopIndex());
    assertEquals(0, actualNumberTreeNode.getType());
    assertFalse(actualNumberTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNumberTreeNode.getChildIndex());
  }
}
