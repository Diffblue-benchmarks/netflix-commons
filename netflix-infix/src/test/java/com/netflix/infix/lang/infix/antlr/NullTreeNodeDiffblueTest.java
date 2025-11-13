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

public class NullTreeNodeDiffblueTest {
  /**
   * Test {@link NullTreeNode#NullTreeNode(Token)}.
   *
   * <p>Method under test: {@link NullTreeNode#NullTreeNode(Token)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void NullTreeNode.<init>(Token)"})
  public void testNewNullTreeNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NullTreeNode actualNullTreeNode = new NullTreeNode(t);

    // Assert
    assertNull(actualNullTreeNode.getChildren());
    assertNull(actualNullTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNullTreeNode.getChildIndex());
    assertSame(t, actualNullTreeNode.getToken());
  }

  /**
   * Test {@link NullTreeNode#NullTreeNode(NullTreeNode)}.
   *
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link NullTreeNode#NullTreeNode(NullTreeNode)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void NullTreeNode.<init>(NullTreeNode)"})
  public void testNewNullTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    NullTreeNode node = new NullTreeNode(t);

    // Act
    NullTreeNode actualNullTreeNode = new NullTreeNode(node);

    // Assert
    Token token = actualNullTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NullTreeNode>", actualNullTreeNode.toStringTree());
    assertNull(actualNullTreeNode.getText());
    assertNull(actualNullTreeNode.getChildren());
    assertNull(actualNullTreeNode.getAncestors());
    assertNull(actualNullTreeNode.getParent());
    assertEquals(0, actualNullTreeNode.getChildCount());
    assertEquals(0, actualNullTreeNode.getCharPositionInLine());
    assertEquals(0, actualNullTreeNode.getLine());
    assertEquals(0, actualNullTreeNode.getTokenStartIndex());
    assertEquals(0, actualNullTreeNode.getTokenStopIndex());
    assertEquals(1, actualNullTreeNode.getType());
    assertFalse(actualNullTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNullTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link NullTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link NullTreeNode#dupNode()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Tree NullTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new NullTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NullTreeNode);
    Token token = ((NullTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NullTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NullTreeNode) actualDupNodeResult).getChildren());
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
