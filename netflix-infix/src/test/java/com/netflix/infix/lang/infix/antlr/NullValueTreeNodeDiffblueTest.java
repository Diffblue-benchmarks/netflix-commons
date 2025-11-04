package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class NullValueTreeNodeDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link NullValueTreeNode#NullValueTreeNode(Token)}
   *   <li>{@link NullValueTreeNode#getValue()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NullValueTreeNode.<init>(Token)", "java.lang.Object NullValueTreeNode.getValue()"})
  public void testGettersAndSetters() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NullValueTreeNode actualNullValueTreeNode = new NullValueTreeNode(t);

    // Assert
    assertNull(actualNullValueTreeNode.getValue());
    assertNull(actualNullValueTreeNode.getChildren());
    assertNull(actualNullValueTreeNode.getParent());
    assertEquals(EventFilterLexer.EOF, actualNullValueTreeNode.getChildIndex());
    assertSame(t, actualNullValueTreeNode.getToken());
  }

  /**
   * Test {@link NullValueTreeNode#NullValueTreeNode(NullValueTreeNode)}.
   * <ul>
   *   <li>Then Token return {@link ClassicToken}.</li>
   * </ul>
   * <p>
   * Method under test: {@link NullValueTreeNode#NullValueTreeNode(NullValueTreeNode)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void NullValueTreeNode.<init>(NullValueTreeNode)"})
  public void testNewNullValueTreeNode_thenTokenReturnClassicToken() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    NullValueTreeNode actualNullValueTreeNode = new NullValueTreeNode(new NullValueTreeNode(t));

    // Assert
    Token token = actualNullValueTreeNode.getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NullValueTreeNode>", actualNullValueTreeNode.toStringTree());
    assertNull(actualNullValueTreeNode.getValue());
    assertNull(actualNullValueTreeNode.getText());
    assertNull(actualNullValueTreeNode.getChildren());
    assertNull(actualNullValueTreeNode.getAncestors());
    assertNull(actualNullValueTreeNode.getParent());
    assertEquals(0, actualNullValueTreeNode.getChildCount());
    assertEquals(0, actualNullValueTreeNode.getCharPositionInLine());
    assertEquals(0, actualNullValueTreeNode.getLine());
    assertEquals(0, actualNullValueTreeNode.getTokenStartIndex());
    assertEquals(0, actualNullValueTreeNode.getTokenStopIndex());
    assertEquals(1, actualNullValueTreeNode.getType());
    assertFalse(actualNullValueTreeNode.isNil());
    assertEquals(EventFilterLexer.EOF, actualNullValueTreeNode.getChildIndex());
    assertSame(t, token);
  }

  /**
   * Test {@link NullValueTreeNode#dupNode()}.
   * <p>
   * Method under test: {@link NullValueTreeNode#dupNode()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Tree NullValueTreeNode.dupNode()"})
  public void testDupNode() {
    // Arrange
    ClassicToken t = new ClassicToken(1);

    // Act
    Tree actualDupNodeResult = (new NullValueTreeNode(t)).dupNode();

    // Assert
    assertTrue(actualDupNodeResult instanceof NullValueTreeNode);
    Token token = ((NullValueTreeNode) actualDupNodeResult).getToken();
    assertTrue(token instanceof ClassicToken);
    assertEquals("null<NullValueTreeNode>", actualDupNodeResult.toStringTree());
    assertNull(((NullValueTreeNode) actualDupNodeResult).getValue());
    assertNull(actualDupNodeResult.getText());
    assertNull(((NullValueTreeNode) actualDupNodeResult).getChildren());
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
