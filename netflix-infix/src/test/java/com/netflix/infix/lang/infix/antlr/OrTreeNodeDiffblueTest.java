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

public class OrTreeNodeDiffblueTest {
  /**
   * Method under test: {@link OrTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new OrTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof OrTreeNode);
    assertEquals("null<OrTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((OrTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((OrTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link OrTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new OrTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof OrTreeNode);
    assertEquals("null<OrTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((OrTreeNode) actualDupNodeResult).getChildren());
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
   * Methods under test:
   * <ul>
   *   <li>{@link OrTreeNode#OrTreeNode(Token)}
   *   <li>{@link OrTreeNode#toString()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    OrTreeNode actualOrTreeNode = new OrTreeNode(t);

    // Assert
    assertEquals("null<OrTreeNode>", actualOrTreeNode.toString());
    assertNull(actualOrTreeNode.getChildren());
    assertNull(actualOrTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualOrTreeNode.getChildIndex());
    assertSame(t, actualOrTreeNode.getToken());
  }

  /**
   * Method under test: {@link OrTreeNode#OrTreeNode(OrTreeNode)}
   */
  @Test
  public void testNewOrTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    OrTreeNode actualOrTreeNode = new OrTreeNode(new OrTreeNode(t));

    // Assert
    assertEquals("null<OrTreeNode>", actualOrTreeNode.toStringTree());
    assertNull(actualOrTreeNode.getText());
    assertNull(actualOrTreeNode.getChildren());
    assertNull(actualOrTreeNode.getAncestors());
    assertNull(actualOrTreeNode.getParent());
    assertEquals(0, actualOrTreeNode.getChildCount());
    assertEquals(0, actualOrTreeNode.getCharPositionInLine());
    assertEquals(0, actualOrTreeNode.getLine());
    assertEquals(0, actualOrTreeNode.getTokenStartIndex());
    assertEquals(0, actualOrTreeNode.getTokenStopIndex());
    assertEquals(1, actualOrTreeNode.getType());
    assertFalse(actualOrTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualOrTreeNode.getChildIndex());
    assertSame(t, actualOrTreeNode.getToken());
  }

  /**
   * Method under test: {@link OrTreeNode#OrTreeNode(OrTreeNode)}
   */
  @Test
  public void testNewOrTreeNode2() {
    // Arrange and Act
    OrTreeNode actualOrTreeNode = new OrTreeNode(new OrTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<OrTreeNode>", actualOrTreeNode.toStringTree());
    assertNull(actualOrTreeNode.getText());
    assertNull(actualOrTreeNode.getChildren());
    assertNull(actualOrTreeNode.getAncestors());
    assertNull(actualOrTreeNode.getParent());
    assertEquals(0, actualOrTreeNode.getChildCount());
    assertEquals(0, actualOrTreeNode.getCharPositionInLine());
    assertEquals(0, actualOrTreeNode.getLine());
    assertEquals(0, actualOrTreeNode.getTokenStartIndex());
    assertEquals(0, actualOrTreeNode.getTokenStopIndex());
    assertEquals(0, actualOrTreeNode.getType());
    assertFalse(actualOrTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualOrTreeNode.getChildIndex());
  }
}
