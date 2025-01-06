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

public class BetweenTreeNodeDiffblueTest {
  /**
   * Test {@link BetweenTreeNode#BetweenTreeNode(Token)}.
   * <p>
   * Method under test: {@link BetweenTreeNode#BetweenTreeNode(Token)}
   */
  @Test
  public void testNewBetweenTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    BetweenTreeNode actualBetweenTreeNode = new BetweenTreeNode(t);

    // Assert
    assertNull(actualBetweenTreeNode.getChildren());
    assertNull(actualBetweenTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualBetweenTreeNode.getChildIndex());
    assertSame(t, actualBetweenTreeNode.getToken());
  }

  /**
   * Test {@link BetweenTreeNode#BetweenTreeNode(BetweenTreeNode)}.
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.</li>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BetweenTreeNode#BetweenTreeNode(BetweenTreeNode)}
   */
  @Test
  public void testNewBetweenTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    BetweenTreeNode actualBetweenTreeNode = new BetweenTreeNode(new BetweenTreeNode(t));

    // Assert
    Token token = actualBetweenTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<BetweenTreeNode>", actualBetweenTreeNode.toStringTree());
    assertNull(actualBetweenTreeNode.getText());
    assertNull(actualBetweenTreeNode.getChildren());
    assertNull(actualBetweenTreeNode.getAncestors());
    assertNull(actualBetweenTreeNode.getParent());
    assertEquals(0, actualBetweenTreeNode.getChildCount());
    assertEquals(0, actualBetweenTreeNode.getCharPositionInLine());
    assertEquals(0, actualBetweenTreeNode.getLine());
    assertEquals(0, actualBetweenTreeNode.getTokenStartIndex());
    assertEquals(0, actualBetweenTreeNode.getTokenStopIndex());
    assertEquals(1, actualBetweenTreeNode.getType());
    assertFalse(actualBetweenTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualBetweenTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link BetweenTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link BetweenTreeNode#dupNode()}
   */
  @Test
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new BetweenTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof BetweenTreeNode);
    Token token = ((BetweenTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<BetweenTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((BetweenTreeNode) actualDupNodeResult).getChildren());
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
