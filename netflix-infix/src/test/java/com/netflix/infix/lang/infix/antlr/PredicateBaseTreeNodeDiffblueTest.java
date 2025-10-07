package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.Token;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PredicateBaseTreeNodeDiffblueTest {
  /**
   * Test {@link PredicateBaseTreeNode#toString()}.
   *
   * <ul>
   *   <li>Given {@link AndTreeNode#AndTreeNode(Token)} with t is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PredicateBaseTreeNode#toString()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String PredicateBaseTreeNode.toString()"})
  public void testToString_givenAndTreeNodeWithTIsNull() {
    // Arrange, Act and Assert
    assertEquals("null<AndTreeNode>", new AndTreeNode((Token) null).toString());
  }

  /**
   * Test {@link PredicateBaseTreeNode#toString()}.
   *
   * <ul>
   *   <li>Given {@link ClassicToken#ClassicToken(int)} with type is one.
   * </ul>
   *
   * <p>Method under test: {@link PredicateBaseTreeNode#toString()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String PredicateBaseTreeNode.toString()"})
  public void testToString_givenClassicTokenWithTypeIsOne() {
    // Arrange, Act and Assert
    assertEquals("null<AndTreeNode>", new AndTreeNode(new ClassicToken(1)).toString());
  }
}
