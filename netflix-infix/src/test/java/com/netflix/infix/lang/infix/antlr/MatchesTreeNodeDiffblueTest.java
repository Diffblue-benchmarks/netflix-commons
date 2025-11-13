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

public class MatchesTreeNodeDiffblueTest {
  /**
   * Test {@link MatchesTreeNode#MatchesTreeNode(Token)}.
   *
   * <p>Method under test: {@link MatchesTreeNode#MatchesTreeNode(Token)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void MatchesTreeNode.<init>(Token)"})
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
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void MatchesTreeNode.<init>(MatchesTreeNode)"})
  public void testNewMatchesTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    MatchesTreeNode node = new MatchesTreeNode(t);

    // Act
    MatchesTreeNode actualMatchesTreeNode = new MatchesTreeNode(node);

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
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Tree MatchesTreeNode.dupNode()"})
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
