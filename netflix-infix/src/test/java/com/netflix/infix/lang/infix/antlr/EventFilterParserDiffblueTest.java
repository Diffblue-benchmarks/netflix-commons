package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ContributionFromDiffblue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.between_predicate_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.boolean_expr_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.boolean_factor_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.compariable_value_function_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.comparison_function_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.equality_value_function_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.exists_predicate_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.filter_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.in_predicate_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.null_predicate_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.path_function_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.predicate_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.regex_predicate_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.time_millis_function_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.time_string_function_return;
import com.netflix.infix.lang.infix.antlr.EventFilterParser.value_function_return;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.BufferedTokenStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EventFilterParserDiffblueTest {
  /**
   * Test between_predicate_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link between_predicate_return}
   *   <li>{@link between_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void between_predicate_return.<init>()",
    "Object between_predicate_return.getTree()"
  })
  public void testBetween_predicate_returnGettersAndSetters() {
    // Arrange and Act
    between_predicate_return actualBetween_predicate_return = new between_predicate_return();

    // Assert
    assertNull(actualBetween_predicate_return.getTree());
    assertNull(actualBetween_predicate_return.getStart());
    assertNull(actualBetween_predicate_return.getStop());
  }

  /**
   * Test boolean_expr_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link boolean_expr_return}
   *   <li>{@link boolean_expr_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void boolean_expr_return.<init>()", "Object boolean_expr_return.getTree()"})
  public void testBoolean_expr_returnGettersAndSetters() {
    // Arrange and Act
    boolean_expr_return actualBoolean_expr_return = new boolean_expr_return();

    // Assert
    assertNull(actualBoolean_expr_return.getTree());
    assertNull(actualBoolean_expr_return.getStart());
    assertNull(actualBoolean_expr_return.getStop());
  }

  /**
   * Test boolean_factor_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link boolean_factor_return}
   *   <li>{@link boolean_factor_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void boolean_factor_return.<init>()",
    "Object boolean_factor_return.getTree()"
  })
  public void testBoolean_factor_returnGettersAndSetters() {
    // Arrange and Act
    boolean_factor_return actualBoolean_factor_return = new boolean_factor_return();

    // Assert
    assertNull(actualBoolean_factor_return.getTree());
    assertNull(actualBoolean_factor_return.getStart());
    assertNull(actualBoolean_factor_return.getStop());
  }

  /**
   * Test compariable_value_function_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link compariable_value_function_return}
   *   <li>{@link compariable_value_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void compariable_value_function_return.<init>()",
    "Object compariable_value_function_return.getTree()"
  })
  public void testCompariable_value_function_returnGettersAndSetters() {
    // Arrange and Act
    compariable_value_function_return actualCompariable_value_function_return =
        new compariable_value_function_return();

    // Assert
    assertNull(actualCompariable_value_function_return.getTree());
    assertNull(actualCompariable_value_function_return.getStart());
    assertNull(actualCompariable_value_function_return.getStop());
  }

  /**
   * Test comparison_function_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link comparison_function_return}
   *   <li>{@link comparison_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void comparison_function_return.<init>()",
    "Object comparison_function_return.getTree()"
  })
  public void testComparison_function_returnGettersAndSetters() {
    // Arrange and Act
    comparison_function_return actualComparison_function_return = new comparison_function_return();

    // Assert
    assertNull(actualComparison_function_return.getTree());
    assertNull(actualComparison_function_return.getStart());
    assertNull(actualComparison_function_return.getStop());
  }

  /**
   * Test equality_value_function_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link equality_value_function_return}
   *   <li>{@link equality_value_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void equality_value_function_return.<init>()",
    "Object equality_value_function_return.getTree()"
  })
  public void testEquality_value_function_returnGettersAndSetters() {
    // Arrange and Act
    equality_value_function_return actualEquality_value_function_return =
        new equality_value_function_return();

    // Assert
    assertNull(actualEquality_value_function_return.getTree());
    assertNull(actualEquality_value_function_return.getStart());
    assertNull(actualEquality_value_function_return.getStop());
  }

  /**
   * Test exists_predicate_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link exists_predicate_return}
   *   <li>{@link exists_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void exists_predicate_return.<init>()",
    "Object exists_predicate_return.getTree()"
  })
  public void testExists_predicate_returnGettersAndSetters() {
    // Arrange and Act
    exists_predicate_return actualExists_predicate_return = new exists_predicate_return();

    // Assert
    assertNull(actualExists_predicate_return.getTree());
    assertNull(actualExists_predicate_return.getStart());
    assertNull(actualExists_predicate_return.getStop());
  }

  /**
   * Test filter_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link filter_return}
   *   <li>{@link filter_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void filter_return.<init>()", "Object filter_return.getTree()"})
  public void testFilter_returnGettersAndSetters() {
    // Arrange and Act
    filter_return actualFilter_return = new filter_return();

    // Assert
    assertNull(actualFilter_return.getTree());
    assertNull(actualFilter_return.getStart());
    assertNull(actualFilter_return.getStop());
  }

  /**
   * Test {@link EventFilterParser#getDelegates()}.
   *
   * <p>Method under test: {@link EventFilterParser#getDelegates()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"org.antlr.runtime.Parser[] EventFilterParser.getDelegates()"})
  public void testGetDelegates() {
    // Arrange, Act and Assert
    assertEquals(0, EventFilterParser.createParser("Input").getDelegates().length);
  }

  /**
   * Test in_predicate_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link in_predicate_return}
   *   <li>{@link in_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void in_predicate_return.<init>()", "Object in_predicate_return.getTree()"})
  public void testIn_predicate_returnGettersAndSetters() {
    // Arrange and Act
    in_predicate_return actualIn_predicate_return = new in_predicate_return();

    // Assert
    assertNull(actualIn_predicate_return.getTree());
    assertNull(actualIn_predicate_return.getStart());
    assertNull(actualIn_predicate_return.getStop());
  }

  /**
   * Test {@link EventFilterParser#EventFilterParser(TokenStream, RecognizerSharedState)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#EventFilterParser(TokenStream,
   * RecognizerSharedState)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterParser.<init>(TokenStream, RecognizerSharedState)"})
  public void testNewEventFilterParser_whenNull() {
    // Arrange
    BufferedTokenStream input = new BufferedTokenStream();

    // Act
    EventFilterParser actualEventFilterParser = new EventFilterParser(input, null);

    // Assert
    TokenStream tokenStream = actualEventFilterParser.getTokenStream();
    assertTrue(tokenStream instanceof BufferedTokenStream);
    assertTrue(actualEventFilterParser.getTreeAdaptor() instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualEventFilterParser.getGrammarFileName());
    assertEquals(0, actualEventFilterParser.getBacktrackingLevel());
    assertEquals(0, actualEventFilterParser.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterParser.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterParser.getDelegates().length);
    assertTrue(actualEventFilterParser.getRuleInvocationStack().isEmpty());
    assertSame(input, tokenStream);
    assertSame(EventFilterParser.tokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Test {@link EventFilterParser#EventFilterParser(TokenStream, RecognizerSharedState)}.
   *
   * <ul>
   *   <li>When {@link RecognizerSharedState#RecognizerSharedState()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#EventFilterParser(TokenStream,
   * RecognizerSharedState)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterParser.<init>(TokenStream, RecognizerSharedState)"})
  public void testNewEventFilterParser_whenRecognizerSharedState() {
    // Arrange
    BufferedTokenStream input = new BufferedTokenStream();

    // Act
    EventFilterParser actualEventFilterParser =
        new EventFilterParser(input, new RecognizerSharedState());

    // Assert
    TokenStream tokenStream = actualEventFilterParser.getTokenStream();
    assertTrue(tokenStream instanceof BufferedTokenStream);
    assertTrue(actualEventFilterParser.getTreeAdaptor() instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualEventFilterParser.getGrammarFileName());
    assertEquals(0, actualEventFilterParser.getBacktrackingLevel());
    assertEquals(0, actualEventFilterParser.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterParser.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterParser.getDelegates().length);
    assertTrue(actualEventFilterParser.getRuleInvocationStack().isEmpty());
    assertSame(input, tokenStream);
    assertSame(EventFilterParser.tokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EventFilterParser#setTreeAdaptor(TreeAdaptor)}
   *   <li>{@link EventFilterParser#getGrammarFileName()}
   *   <li>{@link EventFilterParser#getTokenNames()}
   *   <li>{@link EventFilterParser#getTreeAdaptor()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String EventFilterParser.getGrammarFileName()",
    "String[] EventFilterParser.getTokenNames()",
    "TreeAdaptor EventFilterParser.getTreeAdaptor()",
    "void EventFilterParser.setTreeAdaptor(TreeAdaptor)"
  })
  public void testGettersAndSetters() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");
    CommonTreeAdaptor adaptor = new CommonTreeAdaptor();

    // Act
    createParserResult.setTreeAdaptor(adaptor);
    String actualGrammarFileName = createParserResult.getGrammarFileName();
    String[] actualTokenNames = createParserResult.getTokenNames();
    TreeAdaptor actualTreeAdaptor = createParserResult.getTreeAdaptor();

    // Assert
    assertTrue(actualTreeAdaptor instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualGrammarFileName);
    assertSame(adaptor, actualTreeAdaptor);
    assertSame(EventFilterParser.tokenNames, actualTokenNames);
  }

  /**
   * Test {@link EventFilterParser#createParser(String)}.
   *
   * <p>Method under test: {@link EventFilterParser#createParser(String)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"EventFilterParser EventFilterParser.createParser(String)"})
  public void testCreateParser() {
    // Arrange and Act
    EventFilterParser actualCreateParserResult = EventFilterParser.createParser("Input");

    // Assert
    assertTrue(actualCreateParserResult.getTokenStream() instanceof CommonTokenStream);
    assertTrue(actualCreateParserResult.getTreeAdaptor() instanceof CommonTreeAdaptor);
    assertEquals("EventFilter.g", actualCreateParserResult.getGrammarFileName());
    assertNull(actualCreateParserResult.getSourceName());
    assertEquals(0, actualCreateParserResult.getBacktrackingLevel());
    assertEquals(0, actualCreateParserResult.getNumberOfSyntaxErrors());
    assertEquals(0, actualCreateParserResult.getRuleMemoizationCacheSize());
    assertEquals(0, actualCreateParserResult.getDelegates().length);
    assertTrue(actualCreateParserResult.getRuleInvocationStack().isEmpty());
    assertSame(EventFilterParser.tokenNames, actualCreateParserResult.getTokenNames());
  }

  /**
   * Test null_predicate_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link null_predicate_return}
   *   <li>{@link null_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void null_predicate_return.<init>()",
    "Object null_predicate_return.getTree()"
  })
  public void testNull_predicate_returnGettersAndSetters() {
    // Arrange and Act
    null_predicate_return actualNull_predicate_return = new null_predicate_return();

    // Assert
    assertNull(actualNull_predicate_return.getTree());
    assertNull(actualNull_predicate_return.getStart());
    assertNull(actualNull_predicate_return.getStop());
  }

  /**
   * Test path_function_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link path_function_return}
   *   <li>{@link path_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void path_function_return.<init>()", "Object path_function_return.getTree()"})
  public void testPath_function_returnGettersAndSetters() {
    // Arrange and Act
    path_function_return actualPath_function_return = new path_function_return();

    // Assert
    assertNull(actualPath_function_return.getTree());
    assertNull(actualPath_function_return.getStart());
    assertNull(actualPath_function_return.getStop());
  }

  /**
   * Test predicate_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link predicate_return}
   *   <li>{@link predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void predicate_return.<init>()", "Object predicate_return.getTree()"})
  public void testPredicate_returnGettersAndSetters() {
    // Arrange and Act
    predicate_return actualPredicate_return = new predicate_return();

    // Assert
    assertNull(actualPredicate_return.getTree());
    assertNull(actualPredicate_return.getStart());
    assertNull(actualPredicate_return.getStop());
  }

  /**
   * Test regex_predicate_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link regex_predicate_return}
   *   <li>{@link regex_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void regex_predicate_return.<init>()",
    "Object regex_predicate_return.getTree()"
  })
  public void testRegex_predicate_returnGettersAndSetters() {
    // Arrange and Act
    regex_predicate_return actualRegex_predicate_return = new regex_predicate_return();

    // Assert
    assertNull(actualRegex_predicate_return.getTree());
    assertNull(actualRegex_predicate_return.getStart());
    assertNull(actualRegex_predicate_return.getStop());
  }

  /**
   * Test {@link EventFilterParser#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link FailedPredicateException#FailedPredicateException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterParser.reportError(RecognitionException)"})
  public void testReportError_whenFailedPredicateException() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> createParserResult.reportError(new FailedPredicateException()));
  }

  /**
   * Test {@link EventFilterParser#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link MismatchedTreeNodeException#MismatchedTreeNodeException()}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterParser.reportError(RecognitionException)"})
  public void testReportError_whenMismatchedTreeNodeException() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> createParserResult.reportError(new MismatchedTreeNodeException()));
  }

  /**
   * Test {@link EventFilterParser#reportError(RecognitionException)}.
   *
   * <ul>
   *   <li>When {@link RecognitionException#RecognitionException()}.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"void EventFilterParser.reportError(RecognitionException)"})
  public void testReportError_whenRecognitionException_thenThrowEventFilterParsingException() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> createParserResult.reportError(new RecognitionException()));
  }

  /**
   * Test {@link EventFilterParser#filter()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#filter()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"filter_return EventFilterParser.filter()"})
  public void testFilter_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").filter());
  }

  /**
   * Test {@link EventFilterParser#boolean_expr()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#boolean_expr()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean_expr_return EventFilterParser.boolean_expr()"})
  public void testBoolean_expr_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").boolean_expr());
  }

  /**
   * Test {@link EventFilterParser#boolean_factor()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#boolean_factor()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean_factor_return EventFilterParser.boolean_factor()"})
  public void testBoolean_factor_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").boolean_factor());
  }

  /**
   * Test {@link EventFilterParser#predicate()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#predicate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"predicate_return EventFilterParser.predicate()"})
  public void testPredicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").predicate());
  }

  /**
   * Test {@link EventFilterParser#comparison_function()}.
   *
   * <ul>
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#comparison_function()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"comparison_function_return EventFilterParser.comparison_function()"})
  public void testComparison_function_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").comparison_function());
  }

  /**
   * Test {@link EventFilterParser#between_predicate()}.
   *
   * <ul>
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#between_predicate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"between_predicate_return EventFilterParser.between_predicate()"})
  public void testBetween_predicate_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").between_predicate());
  }

  /**
   * Test {@link EventFilterParser#in_predicate()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#in_predicate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"in_predicate_return EventFilterParser.in_predicate()"})
  public void testIn_predicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").in_predicate());
  }

  /**
   * Test {@link EventFilterParser#null_predicate()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#null_predicate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"null_predicate_return EventFilterParser.null_predicate()"})
  public void testNull_predicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").null_predicate());
  }

  /**
   * Test {@link EventFilterParser#regex_predicate()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#regex_predicate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"regex_predicate_return EventFilterParser.regex_predicate()"})
  public void testRegex_predicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").regex_predicate());
  }

  /**
   * Test {@link EventFilterParser#exists_predicate()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#exists_predicate()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"exists_predicate_return EventFilterParser.exists_predicate()"})
  public void testExists_predicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").exists_predicate());
  }

  /**
   * Test {@link EventFilterParser#path_function()}.
   *
   * <ul>
   *   <li>Given createParser space.
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#path_function()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"path_function_return EventFilterParser.path_function()"})
  public void testPath_function_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").path_function());
  }

  /**
   * Test time_millis_function_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link time_millis_function_return}
   *   <li>{@link time_millis_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void time_millis_function_return.<init>()",
    "Object time_millis_function_return.getTree()"
  })
  public void testTime_millis_function_returnGettersAndSetters() {
    // Arrange and Act
    time_millis_function_return actualTime_millis_function_return =
        new time_millis_function_return();

    // Assert
    assertNull(actualTime_millis_function_return.getTree());
    assertNull(actualTime_millis_function_return.getStart());
    assertNull(actualTime_millis_function_return.getStop());
  }

  /**
   * Test time_string_function_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link time_string_function_return}
   *   <li>{@link time_string_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void time_string_function_return.<init>()",
    "Object time_string_function_return.getTree()"
  })
  public void testTime_string_function_returnGettersAndSetters() {
    // Arrange and Act
    time_string_function_return actualTime_string_function_return =
        new time_string_function_return();

    // Assert
    assertNull(actualTime_string_function_return.getTree());
    assertNull(actualTime_string_function_return.getStart());
    assertNull(actualTime_string_function_return.getStop());
  }

  /**
   * Test value_function_return getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link value_function_return}
   *   <li>{@link value_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void value_function_return.<init>()",
    "Object value_function_return.getTree()"
  })
  public void testValue_function_returnGettersAndSetters() {
    // Arrange and Act
    value_function_return actualValue_function_return = new value_function_return();

    // Assert
    assertNull(actualValue_function_return.getTree());
    assertNull(actualValue_function_return.getStart());
    assertNull(actualValue_function_return.getStop());
  }

  /**
   * Test {@link EventFilterParser#value_function()}.
   *
   * <ul>
   *   <li>Then Start InputStream return {@link ANTLRStringStream}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"value_function_return EventFilterParser.value_function()"})
  public void testValue_function_thenStartInputStreamReturnANTLRStringStream()
      throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act
    value_function_return actualValue_functionResult = createParserResult.value_function();

    // Assert
    Object start = actualValue_functionResult.getStart();
    assertTrue(((CommonToken) start).getInputStream() instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualValue_functionResult.getTree());
    assertNull(actualValue_functionResult.getStop());
    assertNull(actualValue_functionResult.getTemplate());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, tokenStream.range());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Test {@link EventFilterParser#equality_value_function()}.
   *
   * <ul>
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#equality_value_function()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"equality_value_function_return EventFilterParser.equality_value_function()"})
  public void testEquality_value_function_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").equality_value_function());
  }

  /**
   * Test {@link EventFilterParser#compariable_value_function()}.
   *
   * <ul>
   *   <li>Then Start InputStream return {@link ANTLRStringStream}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({
    "compariable_value_function_return EventFilterParser.compariable_value_function()"
  })
  public void testCompariable_value_function_thenStartInputStreamReturnANTLRStringStream()
      throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act
    compariable_value_function_return actualCompariable_value_functionResult =
        createParserResult.compariable_value_function();

    // Assert
    Object start = actualCompariable_value_functionResult.getStart();
    assertTrue(((CommonToken) start).getInputStream() instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualCompariable_value_functionResult.getTree());
    assertNull(actualCompariable_value_functionResult.getStop());
    assertNull(actualCompariable_value_functionResult.getTemplate());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, tokenStream.range());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Test {@link EventFilterParser#time_millis_function()}.
   *
   * <ul>
   *   <li>Then Start InputStream return {@link ANTLRStringStream}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"time_millis_function_return EventFilterParser.time_millis_function()"})
  public void testTime_millis_function_thenStartInputStreamReturnANTLRStringStream()
      throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act
    time_millis_function_return actualTime_millis_functionResult =
        createParserResult.time_millis_function();

    // Assert
    Object start = actualTime_millis_functionResult.getStart();
    assertTrue(((CommonToken) start).getInputStream() instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals("<EOF>", ((CommonToken) start).getText());
    assertNull(actualTime_millis_functionResult.getTree());
    assertNull(actualTime_millis_functionResult.getStop());
    assertNull(actualTime_millis_functionResult.getTemplate());
    assertEquals(0, ((CommonToken) start).getChannel());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getStopIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, tokenStream.range());
    assertEquals(EventFilterParser.EOF, ((CommonToken) start).getType());
  }

  /**
   * Test {@link EventFilterParser#time_string_function()}.
   *
   * <ul>
   *   <li>Then throw {@link EventFilterParsingException}.
   * </ul>
   *
   * <p>Method under test: {@link EventFilterParser#time_string_function()}
   */
  @Test
  @Category(ContributionFromDiffblue.class)
  @ManagedByDiffblue
  @MethodsUnderTest({"time_string_function_return EventFilterParser.time_string_function()"})
  public void testTime_string_function_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(
        EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").time_string_function());
  }
}
