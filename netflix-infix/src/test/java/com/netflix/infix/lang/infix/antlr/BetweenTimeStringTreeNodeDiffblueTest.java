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

public class BetweenTimeStringTreeNodeDiffblueTest {
  /**
   * Test {@link BetweenTimeStringTreeNode#BetweenTimeStringTreeNode(Token)}.
   *
   * <p>Method under test: {@link BetweenTimeStringTreeNode#BetweenTimeStringTreeNode(Token)}
   */
  @Test
  public void testNewBetweenTimeStringTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    BetweenTimeStringTreeNode actualBetweenTimeStringTreeNode = new BetweenTimeStringTreeNode(t);

    // Assert
    assertNull(actualBetweenTimeStringTreeNode.getChildren());
    assertNull(actualBetweenTimeStringTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualBetweenTimeStringTreeNode.getChildIndex());
    assertSame(t, actualBetweenTimeStringTreeNode.getToken());
  }

  /**
   * Test {@link BetweenTimeStringTreeNode#BetweenTimeStringTreeNode(BetweenTimeStringTreeNode)}.
   *
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BetweenTimeStringTreeNode#BetweenTimeStringTreeNode(BetweenTimeStringTreeNode)}
   */
  @Test
  public void testNewBetweenTimeStringTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    BetweenTimeStringTreeNode node = new BetweenTimeStringTreeNode(t);

    // Act
    BetweenTimeStringTreeNode actualBetweenTimeStringTreeNode = new BetweenTimeStringTreeNode(node);

    // Assert
    Token token = actualBetweenTimeStringTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<BetweenTimeStringTreeNode>", actualBetweenTimeStringTreeNode.toStringTree());
    assertNull(actualBetweenTimeStringTreeNode.getText());
    assertNull(actualBetweenTimeStringTreeNode.getChildren());
    assertNull(actualBetweenTimeStringTreeNode.getAncestors());
    assertNull(actualBetweenTimeStringTreeNode.getParent());
    assertEquals(0, actualBetweenTimeStringTreeNode.getChildCount());
    assertEquals(0, actualBetweenTimeStringTreeNode.getCharPositionInLine());
    assertEquals(0, actualBetweenTimeStringTreeNode.getLine());
    assertEquals(0, actualBetweenTimeStringTreeNode.getTokenStartIndex());
    assertEquals(0, actualBetweenTimeStringTreeNode.getTokenStopIndex());
    assertEquals(1, actualBetweenTimeStringTreeNode.getType());
    assertFalse(actualBetweenTimeStringTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualBetweenTimeStringTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link BetweenTimeStringTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link BetweenTimeStringTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new BetweenTimeStringTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof BetweenTimeStringTreeNode);
    Token token = ((BetweenTimeStringTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<BetweenTimeStringTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((BetweenTimeStringTreeNode) actualDupNodeResult).getChildren());
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
