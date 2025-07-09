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

public class MatchesTreeNodeDiffblueTest {
  /**
   * Test {@link MatchesTreeNode#MatchesTreeNode(Token)}.
   *
   * <p>Method under test: {@link MatchesTreeNode#MatchesTreeNode(Token)}
   */
  @Test
  public void testNewMatchesTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    MatchesTreeNode actualMatchesTreeNode = new MatchesTreeNode(t);

    // Assert
    assertNull(actualMatchesTreeNode.getChildren());
    assertNull(actualMatchesTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualMatchesTreeNode.getChildIndex());
    assertSame(t, actualMatchesTreeNode.getToken());
  }

  /**
   * Test {@link MatchesTreeNode#MatchesTreeNode(MatchesTreeNode)}.
   *
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link MatchesTreeNode#MatchesTreeNode(MatchesTreeNode)}
   */
  @Test
  public void testNewMatchesTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    MatchesTreeNode actualMatchesTreeNode = new MatchesTreeNode(new MatchesTreeNode(t));

    // Assert
    Token token = actualMatchesTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<MatchesTreeNode>", actualMatchesTreeNode.toStringTree());
    assertNull(actualMatchesTreeNode.getText());
    assertNull(actualMatchesTreeNode.getChildren());
    assertNull(actualMatchesTreeNode.getAncestors());
    assertNull(actualMatchesTreeNode.getParent());
    assertEquals(0, actualMatchesTreeNode.getChildCount());
    assertEquals(0, actualMatchesTreeNode.getCharPositionInLine());
    assertEquals(0, actualMatchesTreeNode.getLine());
    assertEquals(0, actualMatchesTreeNode.getTokenStartIndex());
    assertEquals(0, actualMatchesTreeNode.getTokenStopIndex());
    assertEquals(1, actualMatchesTreeNode.getType());
    assertFalse(actualMatchesTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualMatchesTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link MatchesTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link MatchesTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new MatchesTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof MatchesTreeNode);
    Token token = ((MatchesTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<MatchesTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((MatchesTreeNode) actualDupNodeResult).getChildren());
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
