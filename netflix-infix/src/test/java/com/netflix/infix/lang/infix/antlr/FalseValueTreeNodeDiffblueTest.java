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
import com.netflix.infix.AlwaysFalsePredicate;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FalseValueTreeNodeDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FalseValueTreeNode#FalseValueTreeNode(Token)}
   *   <li>{@link FalseValueTreeNode#getValue()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FalseValueTreeNode.<init>(Token)",
    "Object FalseValueTreeNode.getValue()"
  })
  public void testGettersAndSetters() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    FalseValueTreeNode actualFalseValueTreeNode = new FalseValueTreeNode(t);
    Object actualValue = actualFalseValueTreeNode.getValue();

    // Assert
    assertNull(actualFalseValueTreeNode.getChildren());
    assertNull(actualFalseValueTreeNode.getParent());
    assertFalse((Boolean) actualValue);
    assertEquals(EventFilterLexer.EOF, actualFalseValueTreeNode.getChildIndex());
    assertSame(t, actualFalseValueTreeNode.getToken());
  }

  /**
   * Test {@link FalseValueTreeNode#FalseValueTreeNode(FalseValueTreeNode)}.
   *
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link FalseValueTreeNode#FalseValueTreeNode(FalseValueTreeNode)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void FalseValueTreeNode.<init>(FalseValueTreeNode)"})
  public void testNewFalseValueTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    FalseValueTreeNode node = new FalseValueTreeNode(t);

    // Act
    FalseValueTreeNode actualFalseValueTreeNode = new FalseValueTreeNode(node);

    // Assert
    Token token = actualFalseValueTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<FalseValueTreeNode>", actualFalseValueTreeNode.toStringTree());
    assertNull(actualFalseValueTreeNode.getText());
    assertNull(actualFalseValueTreeNode.getChildren());
    assertNull(actualFalseValueTreeNode.getAncestors());
    assertNull(actualFalseValueTreeNode.getParent());
    assertEquals(0, actualFalseValueTreeNode.getChildCount());
    assertEquals(0, actualFalseValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualFalseValueTreeNode.getLine());
    assertEquals(0, actualFalseValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualFalseValueTreeNode.getTokenStopIndex());
    assertEquals(1, actualFalseValueTreeNode.getType());
    assertFalse(actualFalseValueTreeNode.isNil());
    assertFalse((Boolean) actualFalseValueTreeNode.getValue());
    assertEquals(EventFilterLexer.EOF, actualFalseValueTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link FalseValueTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link FalseValueTreeNode#dupNode()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Tree FalseValueTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new FalseValueTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof FalseValueTreeNode);
    Token token = ((FalseValueTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<FalseValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((FalseValueTreeNode) actualDupNodeResult).getChildren());
    assertNull(actualDupNodeResult.getAncestors());
    assertNull(actualDupNodeResult.getParent());
    assertEquals(0, actualDupNodeResult.getCharPositionInLine());
    assertEquals(0, actualDupNodeResult.getChildCount());
    assertEquals(0, actualDupNodeResult.getLine());
    assertEquals(0, actualDupNodeResult.getTokenStartIndex());
    assertEquals(0, actualDupNodeResult.getTokenStopIndex());
    assertEquals(1, actualDupNodeResult.getType());
    assertFalse(actualDupNodeResult.isNil());
    assertFalse((Boolean) ((FalseValueTreeNode) actualDupNodeResult).getValue());
    assertEquals(EventFilterLexer.EOF, actualDupNodeResult.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link FalseValueTreeNode#translate()}.
   *
   * <p>Method under test: {@link FalseValueTreeNode#translate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate FalseValueTreeNode.translate()"})
  public void testTranslate() {
    // Arrange and Act
    Predicate<Object> actualTranslateResult =
        new FalseValueTreeNode(new ClassicToken(1)).translate();
    boolean actualApplyResult = actualTranslateResult.apply("42");

    // Assert
    assertTrue(actualTranslateResult instanceof AlwaysFalsePredicate);
    assertFalse(actualApplyResult);
    assertFalse(actualTranslateResult.apply("Input"));
    assertFalse(actualTranslateResult.test("Input"));
  }
}
