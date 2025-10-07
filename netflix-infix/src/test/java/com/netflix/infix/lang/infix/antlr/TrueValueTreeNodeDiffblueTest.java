package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.base.Predicate;
import com.netflix.infix.AlwaysTruePredicate;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TrueValueTreeNodeDiffblueTest {
  /**
   * Test {@link TrueValueTreeNode#TrueValueTreeNode(Token)}.
   *
   * <p>Method under test: {@link TrueValueTreeNode#TrueValueTreeNode(Token)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrueValueTreeNode.<init>(Token)"})
  public void testNewTrueValueTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    TrueValueTreeNode actualTrueValueTreeNode = new TrueValueTreeNode(t);

    // Assert
    assertNull(actualTrueValueTreeNode.getChildren());
    assertNull(actualTrueValueTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualTrueValueTreeNode.getChildIndex());
    assertSame(t, actualTrueValueTreeNode.getToken());
  }

  /**
   * Test {@link TrueValueTreeNode#TrueValueTreeNode(TrueValueTreeNode)}.
   *
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link TrueValueTreeNode#TrueValueTreeNode(TrueValueTreeNode)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrueValueTreeNode.<init>(TrueValueTreeNode)"})
  public void testNewTrueValueTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    TrueValueTreeNode node = new TrueValueTreeNode(t);

    // Act
    TrueValueTreeNode actualTrueValueTreeNode = new TrueValueTreeNode(node);

    // Assert
    Token token = actualTrueValueTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<TrueValueTreeNode>", actualTrueValueTreeNode.toStringTree());
    assertNull(actualTrueValueTreeNode.getText());
    assertNull(actualTrueValueTreeNode.getChildren());
    assertNull(actualTrueValueTreeNode.getAncestors());
    assertNull(actualTrueValueTreeNode.getParent());
    assertEquals(0, actualTrueValueTreeNode.getChildCount());
    assertEquals(0, actualTrueValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualTrueValueTreeNode.getLine());
    assertEquals(0, actualTrueValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualTrueValueTreeNode.getTokenStopIndex());
    assertEquals(1, actualTrueValueTreeNode.getType());
    assertFalse(actualTrueValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualTrueValueTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link TrueValueTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link TrueValueTreeNode#dupNode()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Tree TrueValueTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new TrueValueTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof TrueValueTreeNode);
    Token token = ((TrueValueTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<TrueValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((TrueValueTreeNode) actualDupNodeResult).getChildren());
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

  /**
   * Test {@link TrueValueTreeNode#translate()}.
   *
   * <p>Method under test: {@link TrueValueTreeNode#translate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate TrueValueTreeNode.translate()"})
  public void testTranslate() {
    // Arrange and Act
    Predicate<Object> actualTranslateResult =
        new TrueValueTreeNode(new ClassicToken(1)).translate();
    boolean actualApplyResult = actualTranslateResult.apply("42");

    // Assert
    assertTrue(actualTranslateResult instanceof AlwaysTruePredicate);
    assertTrue(actualApplyResult);
    assertTrue(actualTranslateResult.apply("Input"));
    assertTrue(actualTranslateResult.test("Input"));
  }
}
