package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BetweenTimeMillisTreeNodeDiffblueTest {
  /**
   * Test {@link BetweenTimeMillisTreeNode#BetweenTimeMillisTreeNode(Token)}.
   *
   * <p>Method under test: {@link BetweenTimeMillisTreeNode#BetweenTimeMillisTreeNode(Token)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void BetweenTimeMillisTreeNode.<init>(Token)"})
  public void testNewBetweenTimeMillisTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    BetweenTimeMillisTreeNode actualBetweenTimeMillisTreeNode = new BetweenTimeMillisTreeNode(t);

    // Assert
    assertNull(actualBetweenTimeMillisTreeNode.getChildren());
    assertNull(actualBetweenTimeMillisTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualBetweenTimeMillisTreeNode.getChildIndex());
    assertSame(t, actualBetweenTimeMillisTreeNode.getToken());
  }

  /**
   * Test {@link BetweenTimeMillisTreeNode#BetweenTimeMillisTreeNode(BetweenTimeMillisTreeNode)}.
   *
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BetweenTimeMillisTreeNode#BetweenTimeMillisTreeNode(BetweenTimeMillisTreeNode)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void BetweenTimeMillisTreeNode.<init>(BetweenTimeMillisTreeNode)"})
  public void testNewBetweenTimeMillisTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    BetweenTimeMillisTreeNode node = new BetweenTimeMillisTreeNode(t);

    // Act
    BetweenTimeMillisTreeNode actualBetweenTimeMillisTreeNode = new BetweenTimeMillisTreeNode(node);

    // Assert
    Token token = actualBetweenTimeMillisTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<BetweenTimeMillisTreeNode>", actualBetweenTimeMillisTreeNode.toStringTree());
    assertNull(actualBetweenTimeMillisTreeNode.getText());
    assertNull(actualBetweenTimeMillisTreeNode.getChildren());
    assertNull(actualBetweenTimeMillisTreeNode.getAncestors());
    assertNull(actualBetweenTimeMillisTreeNode.getParent());
    assertEquals(0, actualBetweenTimeMillisTreeNode.getChildCount());
    assertEquals(0, actualBetweenTimeMillisTreeNode.getCharPositionInLine());
    assertEquals(0, actualBetweenTimeMillisTreeNode.getLine());
    assertEquals(0, actualBetweenTimeMillisTreeNode.getTokenStartIndex());
    assertEquals(0, actualBetweenTimeMillisTreeNode.getTokenStopIndex());
    assertEquals(1, actualBetweenTimeMillisTreeNode.getType());
    assertFalse(actualBetweenTimeMillisTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualBetweenTimeMillisTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link BetweenTimeMillisTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link BetweenTimeMillisTreeNode#dupNode()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Tree BetweenTimeMillisTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new BetweenTimeMillisTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof BetweenTimeMillisTreeNode);
    Token token = ((BetweenTimeMillisTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<BetweenTimeMillisTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((BetweenTimeMillisTreeNode) actualDupNodeResult).getChildren());
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
