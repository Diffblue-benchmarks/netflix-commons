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

public class OrTreeNodeDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OrTreeNode#OrTreeNode(Token)}
   *   <li>{@link OrTreeNode#toString()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void OrTreeNode.<init>(Token)", "java.lang.String OrTreeNode.toString()"})
  public void testGettersAndSetters() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    OrTreeNode actualOrTreeNode = new OrTreeNode(t);

    // Assert
    assertEquals("null<OrTreeNode>", actualOrTreeNode.toString());
    assertNull(actualOrTreeNode.getChildren());
    assertNull(actualOrTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualOrTreeNode.getChildIndex());
    assertSame(t, actualOrTreeNode.getToken());
  }

  /**
   * Test {@link OrTreeNode#OrTreeNode(OrTreeNode)}.
   *
   * <ul>
   *   <li>When {@link ClassicToken#ClassicToken(int)} with type is one.
   *   <li>Then Token return {@link ClassicToken}.
   * </ul>
   *
   * <p>Method under test: {@link OrTreeNode#OrTreeNode(OrTreeNode)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void OrTreeNode.<init>(OrTreeNode)"})
  public void testNewOrTreeNode_whenClassicTokenWithTypeIsOne_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);
    OrTreeNode node = new OrTreeNode(t);

    // Act
    OrTreeNode actualOrTreeNode = new OrTreeNode(node);

    // Assert
    Token token = actualOrTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<OrTreeNode>", actualOrTreeNode.toStringTree());
    assertNull(actualOrTreeNode.getText());
    assertNull(actualOrTreeNode.getChildren());
    assertNull(actualOrTreeNode.getAncestors());
    assertNull(actualOrTreeNode.getParent());
    assertEquals(0, actualOrTreeNode.getChildCount());
    assertEquals(0, actualOrTreeNode.getCharPositionInLine());
    assertEquals(0, actualOrTreeNode.getLine());
    assertEquals(0, actualOrTreeNode.getTokenStartIndex());
    assertEquals(0, actualOrTreeNode.getTokenStopIndex());
    assertEquals(1, actualOrTreeNode.getType());
    assertFalse(actualOrTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualOrTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link OrTreeNode#dupNode()}.
   *
   * <p>Method under test: {@link OrTreeNode#dupNode()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"Tree OrTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = new OrTreeNode(t).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof OrTreeNode);
    Token token = ((OrTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<OrTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(actualDupNodeResult.getText());
    assertNull(((OrTreeNode) actualDupNodeResult).getChildren());
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
