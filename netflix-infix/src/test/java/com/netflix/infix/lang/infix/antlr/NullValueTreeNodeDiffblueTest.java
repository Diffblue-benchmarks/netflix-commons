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

public class NullValueTreeNodeDiffblueTest {
  /**
   * Method under test: {@link NullValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NullValueTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NullValueTreeNode);
    assertEquals("null<NullValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(((NullValueTreeNode) actualDupNodeResult).getValue());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NullValueTreeNode) actualDupNodeResult).getChildren());
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
    assertSame(t, ((NullValueTreeNode) actualDupNodeResult).getToken());
  }

  /**
   * Method under test: {@link NullValueTreeNode#dupNode()}
   */
  @Test
  public void testDupNode2() {
    // Arrange and Act
    Tree actualDupNodeResult = (new NullValueTreeNode(mock(Token.class))).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NullValueTreeNode);
    assertEquals("null<NullValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(((NullValueTreeNode) actualDupNodeResult).getValue());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NullValueTreeNode) actualDupNodeResult).getChildren());
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
   *   <li>{@link NullValueTreeNode#NullValueTreeNode(Token)}
   *   <li>{@link NullValueTreeNode#getValue()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NullValueTreeNode actualNullValueTreeNode = new NullValueTreeNode(t);

    // Assert
    assertNull(actualNullValueTreeNode.getValue());
    assertNull(actualNullValueTreeNode.getChildren());
    assertNull(actualNullValueTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNullValueTreeNode.getChildIndex());
    assertSame(t, actualNullValueTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link NullValueTreeNode#NullValueTreeNode(NullValueTreeNode)}
   */
  @Test
  public void testNewNullValueTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NullValueTreeNode actualNullValueTreeNode = new NullValueTreeNode(new NullValueTreeNode(t));

    // Assert
    assertEquals("null<NullValueTreeNode>", actualNullValueTreeNode.toStringTree());
    assertNull(actualNullValueTreeNode.getValue());
    assertNull(actualNullValueTreeNode.getText());
    assertNull(actualNullValueTreeNode.getChildren());
    assertNull(actualNullValueTreeNode.getAncestors());
    assertNull(actualNullValueTreeNode.getParent());
    assertEquals(0, actualNullValueTreeNode.getChildCount());
    assertEquals(0, actualNullValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualNullValueTreeNode.getLine());
    assertEquals(0, actualNullValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualNullValueTreeNode.getTokenStopIndex());
    assertEquals(1, actualNullValueTreeNode.getType());
    assertFalse(actualNullValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNullValueTreeNode.getChildIndex());
    assertSame(t, actualNullValueTreeNode.getToken());
  }

  /**
   * Method under test:
   * {@link NullValueTreeNode#NullValueTreeNode(NullValueTreeNode)}
   */
  @Test
  public void testNewNullValueTreeNode2() {
    // Arrange and Act
    NullValueTreeNode actualNullValueTreeNode = new NullValueTreeNode(new NullValueTreeNode(mock(Token.class)));

    // Assert
    assertEquals("null<NullValueTreeNode>", actualNullValueTreeNode.toStringTree());
    assertNull(actualNullValueTreeNode.getValue());
    assertNull(actualNullValueTreeNode.getText());
    assertNull(actualNullValueTreeNode.getChildren());
    assertNull(actualNullValueTreeNode.getAncestors());
    assertNull(actualNullValueTreeNode.getParent());
    assertEquals(0, actualNullValueTreeNode.getChildCount());
    assertEquals(0, actualNullValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualNullValueTreeNode.getLine());
    assertEquals(0, actualNullValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualNullValueTreeNode.getTokenStopIndex());
    assertEquals(0, actualNullValueTreeNode.getType());
    assertFalse(actualNullValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNullValueTreeNode.getChildIndex());
  }
}
