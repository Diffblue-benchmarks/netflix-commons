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

public class NullTreeNodeDiffblueTest {
  /**
   * Method under test: {@link NullTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NullTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NullTreeNode);
    assertEquals("null<NullTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NullTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((NullTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link NullTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new NullTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NullTreeNode);
    assertEquals("null<NullTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NullTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link NullTreeNode#NullTreeNode(Token)}
   */
  @Test
  public void testNewNullTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NullTreeNode actualNullTreeNode = new NullTreeNode(t);

    // Assert
    assertNull(actualNullTreeNode.getChildren());
    assertNull(actualNullTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNullTreeNode.getChildIndex());
    assertSame(t, actualNullTreeNode.getToken());
  }

  /**
   * Method under test: {@link NullTreeNode#NullTreeNode(NullTreeNode)}
   */
  @Test
  public void testNewNullTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NullTreeNode actualNullTreeNode = new NullTreeNode(new NullTreeNode(t));

    // Assert
    assertEquals("null<NullTreeNode>", actualNullTreeNode.toStringTree());
    assertNull(actualNullTreeNode.getText());
    assertNull(actualNullTreeNode.getChildren());
    assertNull(actualNullTreeNode.getAncestors());
    assertNull(actualNullTreeNode.getParent());
    assertEquals(0, actualNullTreeNode.getChildCount());
    assertEquals(0, actualNullTreeNode.getCharPositionInLine());
    assertEquals(0, actualNullTreeNode.getLine());
    assertEquals(0, actualNullTreeNode.getTokenStartIndex());
    assertEquals(0, actualNullTreeNode.getTokenStopIndex());
    assertEquals(1, actualNullTreeNode.getType());
    assertFalse(actualNullTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNullTreeNode.getChildIndex());
    assertSame(t, actualNullTreeNode.getToken());
  }

  /**
   * Method under test: {@link NullTreeNode#NullTreeNode(NullTreeNode)}
   */
  @Test
  public void testNewNullTreeNode3() {
    // Arrange and Act
    NullTreeNode actualNullTreeNode = new NullTreeNode(new NullTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<NullTreeNode>", actualNullTreeNode.toStringTree());
    assertNull(actualNullTreeNode.getText());
    assertNull(actualNullTreeNode.getChildren());
    assertNull(actualNullTreeNode.getAncestors());
    assertNull(actualNullTreeNode.getParent());
    assertEquals(0, actualNullTreeNode.getChildCount());
    assertEquals(0, actualNullTreeNode.getCharPositionInLine());
    assertEquals(0, actualNullTreeNode.getLine());
    assertEquals(0, actualNullTreeNode.getTokenStartIndex());
    assertEquals(0, actualNullTreeNode.getTokenStopIndex());
    assertEquals(0, actualNullTreeNode.getType());
    assertFalse(actualNullTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNullTreeNode.getChildIndex());
  }
}
