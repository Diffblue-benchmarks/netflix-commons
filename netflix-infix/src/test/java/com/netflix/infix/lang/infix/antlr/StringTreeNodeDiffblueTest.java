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

public class StringTreeNodeDiffblueTest {
  /**
   * Test {@link StringTreeNode#getValue()}.
   *
   * <ul>
   *   <li>Given {@link ClassicToken#ClassicToken(int)} with type is one.
   * </ul>
   *
   * <p>Method under test: {@link StringTreeNode#getValue()}
   */
  @Test
  public void testGetValue_givenClassicTokenWithTypeIsOne() {
    // Arrange, Act and Assert
    assertNull(new StringTreeNode(new ClassicToken(1)).getValue());
  }

  /**
   * Test {@link StringTreeNode#getValue()}.
   *
   * <ul>
   *   <li>Given {@link StringTreeNode#StringTreeNode(Token)} with t is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StringTreeNode#getValue()}
   */
  @Test
  public void testGetValue_givenStringTreeNodeWithTIsNull() {
    // Arrange, Act and Assert
    assertNull(new StringTreeNode((Token) null).getValue());
  }

  /**
   * Test {@link StringTreeNode#StringTreeNode(Token)}.
   *
   * <p>Method under test: {@link StringTreeNode#StringTreeNode(Token)}
   */
  @Test
  public void testNewStringTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    StringTreeNode actualStringTreeNode = new StringTreeNode(t);

    // Assert
    assertNull(actualStringTreeNode.getChildren());
    assertNull(actualStringTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualStringTreeNode.getChildIndex());
    assertSame(t, actualStringTreeNode.getToken());
  }

  /**
   * Test {@link StringTreeNode#StringTreeNode(StringTreeNode)}.
   *
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link StringTreeNode#StringTreeNode(StringTreeNode)}
   */
  @Test
  public void testNewStringTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    StringTreeNode node = new StringTreeNode(t);

    // Act
    StringTreeNode actualStringTreeNode = new StringTreeNode(node);

    // Assert
    Token token = actualStringTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<StringTreeNode>", actualStringTreeNode.toStringTree());
    assertNull(actualStringTreeNode.getValue());
    assertNull(actualStringTreeNode.getText());
    assertNull(actualStringTreeNode.getChildren());
    assertNull(actualStringTreeNode.getAncestors());
    assertNull(actualStringTreeNode.getParent());
    assertEquals(0, actualStringTreeNode.getChildCount());
    assertEquals(0, actualStringTreeNode.getCharPositionInLine());
    assertEquals(0, actualStringTreeNode.getLine());
    assertEquals(0, actualStringTreeNode.getTokenStartIndex());
    assertEquals(0, actualStringTreeNode.getTokenStopIndex());
    assertEquals(1, actualStringTreeNode.getType());
    assertFalse(actualStringTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualStringTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link StringTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link StringTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new StringTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof StringTreeNode);
    Token token = ((StringTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<StringTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(((StringTreeNode) actualDupNodeResult).getValue());
    assertNull(actualDupNodeResult.getText());
    assertNull(((StringTreeNode) actualDupNodeResult).getChildren());
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
