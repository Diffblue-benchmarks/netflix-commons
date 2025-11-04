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

public class ExistsTreeNodeDiffblueTest {
  /**
   * Method under test: {@link ExistsTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new ExistsTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof ExistsTreeNode);
    assertEquals("null<ExistsTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((ExistsTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((ExistsTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link ExistsTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new ExistsTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof ExistsTreeNode);
    assertEquals("null<ExistsTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((ExistsTreeNode) actualDupNodeResult).getChildren());
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
   * Method under test: {@link ExistsTreeNode#ExistsTreeNode(Token)}
   */
  @Test
  public void testNewExistsTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    ExistsTreeNode actualExistsTreeNode = new ExistsTreeNode(t);

    // Assert
    assertNull(actualExistsTreeNode.getChildren());
    assertNull(actualExistsTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualExistsTreeNode.getChildIndex());
    assertSame(t, actualExistsTreeNode.getToken());
  }

  /**
   * Method under test: {@link ExistsTreeNode#ExistsTreeNode(ExistsTreeNode)}
   */
  @Test
  public void testNewExistsTreeNode2() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    ExistsTreeNode actualExistsTreeNode = new ExistsTreeNode(new ExistsTreeNode(t));

    // Assert
    assertEquals("null<ExistsTreeNode>", actualExistsTreeNode.toStringTree());
    assertNull(actualExistsTreeNode.getText());
    assertNull(actualExistsTreeNode.getChildren());
    assertNull(actualExistsTreeNode.getAncestors());
    assertNull(actualExistsTreeNode.getParent());
    assertEquals(0, actualExistsTreeNode.getChildCount());
    assertEquals(0, actualExistsTreeNode.getCharPositionInLine());
    assertEquals(0, actualExistsTreeNode.getLine());
    assertEquals(0, actualExistsTreeNode.getTokenStartIndex());
    assertEquals(0, actualExistsTreeNode.getTokenStopIndex());
    assertEquals(1, actualExistsTreeNode.getType());
    assertFalse(actualExistsTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualExistsTreeNode.getChildIndex());
    assertSame(t, actualExistsTreeNode.getToken());
  }

  /**
   * Method under test: {@link ExistsTreeNode#ExistsTreeNode(ExistsTreeNode)}
   */
  @Test
  public void testNewExistsTreeNode3() {
    // Arrange and Act
    ExistsTreeNode actualExistsTreeNode = new ExistsTreeNode(new ExistsTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<ExistsTreeNode>", actualExistsTreeNode.toStringTree());
    assertNull(actualExistsTreeNode.getText());
    assertNull(actualExistsTreeNode.getChildren());
    assertNull(actualExistsTreeNode.getAncestors());
    assertNull(actualExistsTreeNode.getParent());
    assertEquals(0, actualExistsTreeNode.getChildCount());
    assertEquals(0, actualExistsTreeNode.getCharPositionInLine());
    assertEquals(0, actualExistsTreeNode.getLine());
    assertEquals(0, actualExistsTreeNode.getTokenStartIndex());
    assertEquals(0, actualExistsTreeNode.getTokenStopIndex());
    assertEquals(0, actualExistsTreeNode.getType());
    assertFalse(actualExistsTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualExistsTreeNode.getChildIndex());
  }
}
