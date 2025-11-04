package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
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
import java.io.IOException;
import java.io.StringReader;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.BufferedTokenStream;
import org.antlr.runtime.CharStream;
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link between_predicate_return}
   *   <li>{@link between_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void between_predicate_return.<init>()", "Object between_predicate_return.getTree()"})
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link boolean_expr_return}
   *   <li>{@link boolean_expr_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link boolean_factor_return}
   *   <li>{@link boolean_factor_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void boolean_factor_return.<init>()", "Object boolean_factor_return.getTree()"})
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link compariable_value_function_return}
   *   <li>{@link compariable_value_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void compariable_value_function_return.<init>()",
      "Object compariable_value_function_return.getTree()"})
  public void testCompariable_value_function_returnGettersAndSetters() {
    // Arrange and Act
    compariable_value_function_return actualCompariable_value_function_return = new compariable_value_function_return();

    // Assert
    assertNull(actualCompariable_value_function_return.getTree());
    assertNull(actualCompariable_value_function_return.getStart());
    assertNull(actualCompariable_value_function_return.getStop());
  }

  /**
   * Test comparison_function_return getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link comparison_function_return}
   *   <li>{@link comparison_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void comparison_function_return.<init>()", "Object comparison_function_return.getTree()"})
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link equality_value_function_return}
   *   <li>{@link equality_value_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void equality_value_function_return.<init>()", "Object equality_value_function_return.getTree()"})
  public void testEquality_value_function_returnGettersAndSetters() {
    // Arrange and Act
    equality_value_function_return actualEquality_value_function_return = new equality_value_function_return();

    // Assert
    assertNull(actualEquality_value_function_return.getTree());
    assertNull(actualEquality_value_function_return.getStart());
    assertNull(actualEquality_value_function_return.getStop());
  }

  /**
   * Test exists_predicate_return getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link exists_predicate_return}
   *   <li>{@link exists_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void exists_predicate_return.<init>()", "Object exists_predicate_return.getTree()"})
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link filter_return}
   *   <li>{@link filter_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
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
   * <p>
   * Method under test: {@link EventFilterParser#getDelegates()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"org.antlr.runtime.Parser[] EventFilterParser.getDelegates()"})
  public void testGetDelegates() {
    // Arrange, Act and Assert
    assertEquals(0, EventFilterParser.createParser("Input").getDelegates().length);
  }

  /**
   * Test in_predicate_return getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link in_predicate_return}
   *   <li>{@link in_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
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
   * Test {@link EventFilterParser#EventFilterParser(TokenStream)}.
   * <p>
   * Method under test: {@link EventFilterParser#EventFilterParser(TokenStream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EventFilterParser.<init>(TokenStream)"})
  public void testNewEventFilterParser() {
    // Arrange
    BufferedTokenStream input = new BufferedTokenStream();

    // Act
    EventFilterParser actualEventFilterParser = new EventFilterParser(input);

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
    String[] expectedTokenNames = actualEventFilterParser.tokenNames;
    assertSame(expectedTokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Test {@link EventFilterParser#EventFilterParser(TokenStream, RecognizerSharedState)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#EventFilterParser(TokenStream, RecognizerSharedState)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
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
    String[] expectedTokenNames = actualEventFilterParser.tokenNames;
    assertSame(expectedTokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Test {@link EventFilterParser#EventFilterParser(TokenStream, RecognizerSharedState)}.
   * <ul>
   *   <li>When {@link RecognizerSharedState#RecognizerSharedState()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#EventFilterParser(TokenStream, RecognizerSharedState)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EventFilterParser.<init>(TokenStream, RecognizerSharedState)"})
  public void testNewEventFilterParser_whenRecognizerSharedState() {
    // Arrange
    BufferedTokenStream input = new BufferedTokenStream();

    // Act
    EventFilterParser actualEventFilterParser = new EventFilterParser(input, new RecognizerSharedState());

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
    String[] expectedTokenNames = actualEventFilterParser.tokenNames;
    assertSame(expectedTokenNames, actualEventFilterParser.getTokenNames());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link EventFilterParser#setTreeAdaptor(TreeAdaptor)}
   *   <li>{@link EventFilterParser#getGrammarFileName()}
   *   <li>{@link EventFilterParser#getTokenNames()}
   *   <li>{@link EventFilterParser#getTreeAdaptor()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"String EventFilterParser.getGrammarFileName()", "String[] EventFilterParser.getTokenNames()",
      "TreeAdaptor EventFilterParser.getTreeAdaptor()", "void EventFilterParser.setTreeAdaptor(TreeAdaptor)"})
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
    assertSame(createParserResult.tokenNames, actualTokenNames);
  }

  /**
   * Test {@link EventFilterParser#createParser(String)}.
   * <p>
   * Method under test: {@link EventFilterParser#createParser(String)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
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
    String[] expectedTokenNames = actualCreateParserResult.tokenNames;
    assertSame(expectedTokenNames, actualCreateParserResult.getTokenNames());
  }

  /**
   * Test null_predicate_return getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link null_predicate_return}
   *   <li>{@link null_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void null_predicate_return.<init>()", "Object null_predicate_return.getTree()"})
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link path_function_return}
   *   <li>{@link path_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link predicate_return}
   *   <li>{@link predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
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
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link regex_predicate_return}
   *   <li>{@link regex_predicate_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void regex_predicate_return.<init>()", "Object regex_predicate_return.getTree()"})
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
   * <ul>
   *   <li>When {@link FailedPredicateException#FailedPredicateException()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EventFilterParser.reportError(RecognitionException)"})
  public void testReportError_whenFailedPredicateException() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> createParserResult.reportError(new FailedPredicateException()));
  }

  /**
   * Test {@link EventFilterParser#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link MismatchedTreeNodeException#MismatchedTreeNodeException()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EventFilterParser.reportError(RecognitionException)"})
  public void testReportError_whenMismatchedTreeNodeException() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> createParserResult.reportError(new MismatchedTreeNodeException()));
  }

  /**
   * Test {@link EventFilterParser#reportError(RecognitionException)}.
   * <ul>
   *   <li>When {@link RecognitionException#RecognitionException()}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#reportError(RecognitionException)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EventFilterParser.reportError(RecognitionException)"})
  public void testReportError_whenRecognitionException_thenThrowEventFilterParsingException() {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser("Input");

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> createParserResult.reportError(new RecognitionException()));
  }

  /**
   * Test {@link EventFilterParser#filter()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#filter()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"filter_return EventFilterParser.filter()"})
  public void testFilter_givenCreateParser42_thenThrowEventFilterParsingException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").filter());
  }

  /**
   * Test {@link EventFilterParser#filter()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#filter()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"filter_return EventFilterParser.filter()"})
  public void testFilter_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").filter());
  }

  /**
   * Test {@link EventFilterParser#filter()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#filter()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"filter_return EventFilterParser.filter()"})
  public void testFilter_givenCreateParserSpace_thenThrowEventFilterParsingException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").filter());
  }

  /**
   * Test {@link EventFilterParser#filter()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#filter()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"filter_return EventFilterParser.filter()"})
  public void testFilter_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream())))).filter());
  }

  /**
   * Test {@link EventFilterParser#filter()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#filter()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"filter_return EventFilterParser.filter()"})
  public void testFilter_givenStringReaderWithLf_thenThrowEventFilterParsingException()
      throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> (new EventFilterParser(
        new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n")))))).filter());
  }

  /**
   * Test {@link EventFilterParser#boolean_expr()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_expr()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_expr_return EventFilterParser.boolean_expr()"})
  public void testBoolean_expr_givenCreateParser42_thenThrowEventFilterParsingException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").boolean_expr());
  }

  /**
   * Test {@link EventFilterParser#boolean_expr()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_expr()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_expr_return EventFilterParser.boolean_expr()"})
  public void testBoolean_expr_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").boolean_expr());
  }

  /**
   * Test {@link EventFilterParser#boolean_expr()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_expr()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_expr_return EventFilterParser.boolean_expr()"})
  public void testBoolean_expr_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").boolean_expr());
  }

  /**
   * Test {@link EventFilterParser#boolean_expr()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_expr()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_expr_return EventFilterParser.boolean_expr()"})
  public void testBoolean_expr_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .boolean_expr());
  }

  /**
   * Test {@link EventFilterParser#boolean_expr()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_expr()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_expr_return EventFilterParser.boolean_expr()"})
  public void testBoolean_expr_givenStringReaderWithLf_thenThrowEventFilterParsingException()
      throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .boolean_expr());
  }

  /**
   * Test {@link EventFilterParser#boolean_factor()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_factor()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_factor_return EventFilterParser.boolean_factor()"})
  public void testBoolean_factor_givenCreateParser42_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").boolean_factor());
  }

  /**
   * Test {@link EventFilterParser#boolean_factor()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_factor()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_factor_return EventFilterParser.boolean_factor()"})
  public void testBoolean_factor_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").boolean_factor());
  }

  /**
   * Test {@link EventFilterParser#boolean_factor()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_factor()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_factor_return EventFilterParser.boolean_factor()"})
  public void testBoolean_factor_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").boolean_factor());
  }

  /**
   * Test {@link EventFilterParser#boolean_factor()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_factor()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_factor_return EventFilterParser.boolean_factor()"})
  public void testBoolean_factor_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .boolean_factor());
  }

  /**
   * Test {@link EventFilterParser#boolean_factor()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#boolean_factor()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean_factor_return EventFilterParser.boolean_factor()"})
  public void testBoolean_factor_givenStringReaderWithLf_thenThrowEventFilterParsingException()
      throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .boolean_factor());
  }

  /**
   * Test {@link EventFilterParser#predicate()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"predicate_return EventFilterParser.predicate()"})
  public void testPredicate_givenCreateParser42_thenThrowEventFilterParsingException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").predicate());
  }

  /**
   * Test {@link EventFilterParser#predicate()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"predicate_return EventFilterParser.predicate()"})
  public void testPredicate_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").predicate());
  }

  /**
   * Test {@link EventFilterParser#predicate()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"predicate_return EventFilterParser.predicate()"})
  public void testPredicate_givenCreateParserSpace_thenThrowEventFilterParsingException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").predicate());
  }

  /**
   * Test {@link EventFilterParser#predicate()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"predicate_return EventFilterParser.predicate()"})
  public void testPredicate_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .predicate());
  }

  /**
   * Test {@link EventFilterParser#predicate()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"predicate_return EventFilterParser.predicate()"})
  public void testPredicate_givenStringReaderWithLf_thenThrowEventFilterParsingException()
      throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> (new EventFilterParser(
        new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n")))))).predicate());
  }

  /**
   * Test {@link EventFilterParser#comparison_function()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#comparison_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"comparison_function_return EventFilterParser.comparison_function()"})
  public void testComparison_function_givenCreateParser42_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").comparison_function());
  }

  /**
   * Test {@link EventFilterParser#comparison_function()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#comparison_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"comparison_function_return EventFilterParser.comparison_function()"})
  public void testComparison_function_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").comparison_function());
  }

  /**
   * Test {@link EventFilterParser#comparison_function()}.
   * <ul>
   *   <li>Given createParser space.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#comparison_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"comparison_function_return EventFilterParser.comparison_function()"})
  public void testComparison_function_givenCreateParserSpace() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").comparison_function());
  }

  /**
   * Test {@link EventFilterParser#comparison_function()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#comparison_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"comparison_function_return EventFilterParser.comparison_function()"})
  public void testComparison_function_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .comparison_function());
  }

  /**
   * Test {@link EventFilterParser#comparison_function()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#comparison_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"comparison_function_return EventFilterParser.comparison_function()"})
  public void testComparison_function_givenStringReaderWithLf() throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .comparison_function());
  }

  /**
   * Test {@link EventFilterParser#between_predicate()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#between_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"between_predicate_return EventFilterParser.between_predicate()"})
  public void testBetween_predicate_givenCreateParser42_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").between_predicate());
  }

  /**
   * Test {@link EventFilterParser#between_predicate()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#between_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"between_predicate_return EventFilterParser.between_predicate()"})
  public void testBetween_predicate_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").between_predicate());
  }

  /**
   * Test {@link EventFilterParser#between_predicate()}.
   * <ul>
   *   <li>Given createParser space.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#between_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"between_predicate_return EventFilterParser.between_predicate()"})
  public void testBetween_predicate_givenCreateParserSpace() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").between_predicate());
  }

  /**
   * Test {@link EventFilterParser#between_predicate()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#between_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"between_predicate_return EventFilterParser.between_predicate()"})
  public void testBetween_predicate_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .between_predicate());
  }

  /**
   * Test {@link EventFilterParser#between_predicate()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#between_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"between_predicate_return EventFilterParser.between_predicate()"})
  public void testBetween_predicate_givenStringReaderWithLf() throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .between_predicate());
  }

  /**
   * Test {@link EventFilterParser#in_predicate()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#in_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"in_predicate_return EventFilterParser.in_predicate()"})
  public void testIn_predicate_givenCreateParser42_thenThrowEventFilterParsingException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").in_predicate());
  }

  /**
   * Test {@link EventFilterParser#in_predicate()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#in_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"in_predicate_return EventFilterParser.in_predicate()"})
  public void testIn_predicate_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").in_predicate());
  }

  /**
   * Test {@link EventFilterParser#in_predicate()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#in_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"in_predicate_return EventFilterParser.in_predicate()"})
  public void testIn_predicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").in_predicate());
  }

  /**
   * Test {@link EventFilterParser#in_predicate()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#in_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"in_predicate_return EventFilterParser.in_predicate()"})
  public void testIn_predicate_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .in_predicate());
  }

  /**
   * Test {@link EventFilterParser#in_predicate()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#in_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"in_predicate_return EventFilterParser.in_predicate()"})
  public void testIn_predicate_givenStringReaderWithLf_thenThrowEventFilterParsingException()
      throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .in_predicate());
  }

  /**
   * Test {@link EventFilterParser#null_predicate()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#null_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"null_predicate_return EventFilterParser.null_predicate()"})
  public void testNull_predicate_givenCreateParser42_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").null_predicate());
  }

  /**
   * Test {@link EventFilterParser#null_predicate()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#null_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"null_predicate_return EventFilterParser.null_predicate()"})
  public void testNull_predicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").null_predicate());
  }

  /**
   * Test {@link EventFilterParser#null_predicate()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#null_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"null_predicate_return EventFilterParser.null_predicate()"})
  public void testNull_predicate_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .null_predicate());
  }

  /**
   * Test {@link EventFilterParser#null_predicate()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#null_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"null_predicate_return EventFilterParser.null_predicate()"})
  public void testNull_predicate_givenStringReaderWithLf_thenThrowEventFilterParsingException()
      throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .null_predicate());
  }

  /**
   * Test {@link EventFilterParser#regex_predicate()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#regex_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"regex_predicate_return EventFilterParser.regex_predicate()"})
  public void testRegex_predicate_givenCreateParser42_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").regex_predicate());
  }

  /**
   * Test {@link EventFilterParser#regex_predicate()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#regex_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"regex_predicate_return EventFilterParser.regex_predicate()"})
  public void testRegex_predicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").regex_predicate());
  }

  /**
   * Test {@link EventFilterParser#regex_predicate()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#regex_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"regex_predicate_return EventFilterParser.regex_predicate()"})
  public void testRegex_predicate_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .regex_predicate());
  }

  /**
   * Test {@link EventFilterParser#regex_predicate()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#regex_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"regex_predicate_return EventFilterParser.regex_predicate()"})
  public void testRegex_predicate_givenStringReaderWithLf_thenThrowEventFilterParsingException()
      throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .regex_predicate());
  }

  /**
   * Test {@link EventFilterParser#exists_predicate()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#exists_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"exists_predicate_return EventFilterParser.exists_predicate()"})
  public void testExists_predicate_givenCreateParser42_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").exists_predicate());
  }

  /**
   * Test {@link EventFilterParser#exists_predicate()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#exists_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"exists_predicate_return EventFilterParser.exists_predicate()"})
  public void testExists_predicate_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").exists_predicate());
  }

  /**
   * Test {@link EventFilterParser#exists_predicate()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#exists_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"exists_predicate_return EventFilterParser.exists_predicate()"})
  public void testExists_predicate_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").exists_predicate());
  }

  /**
   * Test {@link EventFilterParser#exists_predicate()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#exists_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"exists_predicate_return EventFilterParser.exists_predicate()"})
  public void testExists_predicate_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .exists_predicate());
  }

  /**
   * Test {@link EventFilterParser#exists_predicate()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#exists_predicate()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"exists_predicate_return EventFilterParser.exists_predicate()"})
  public void testExists_predicate_givenStringReaderWithLf() throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .exists_predicate());
  }

  /**
   * Test {@link EventFilterParser#path_function()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#path_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"path_function_return EventFilterParser.path_function()"})
  public void testPath_function_givenCreateParser42_thenThrowEventFilterParsingException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").path_function());
  }

  /**
   * Test {@link EventFilterParser#path_function()}.
   * <ul>
   *   <li>Given createParser space.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#path_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"path_function_return EventFilterParser.path_function()"})
  public void testPath_function_givenCreateParserSpace_thenThrowEventFilterParsingException()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").path_function());
  }

  /**
   * Test {@link EventFilterParser#path_function()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#path_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"path_function_return EventFilterParser.path_function()"})
  public void testPath_function_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .path_function());
  }

  /**
   * Test {@link EventFilterParser#path_function()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#path_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"path_function_return EventFilterParser.path_function()"})
  public void testPath_function_givenStringReaderWithLf_thenThrowEventFilterParsingException()
      throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .path_function());
  }

  /**
   * Test time_millis_function_return getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link time_millis_function_return}
   *   <li>{@link time_millis_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void time_millis_function_return.<init>()", "Object time_millis_function_return.getTree()"})
  public void testTime_millis_function_returnGettersAndSetters() {
    // Arrange and Act
    time_millis_function_return actualTime_millis_function_return = new time_millis_function_return();

    // Assert
    assertNull(actualTime_millis_function_return.getTree());
    assertNull(actualTime_millis_function_return.getStart());
    assertNull(actualTime_millis_function_return.getStop());
  }

  /**
   * Test time_string_function_return getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link time_string_function_return}
   *   <li>{@link time_string_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void time_string_function_return.<init>()", "Object time_string_function_return.getTree()"})
  public void testTime_string_function_returnGettersAndSetters() {
    // Arrange and Act
    time_string_function_return actualTime_string_function_return = new time_string_function_return();

    // Assert
    assertNull(actualTime_string_function_return.getTree());
    assertNull(actualTime_string_function_return.getStart());
    assertNull(actualTime_string_function_return.getStop());
  }

  /**
   * Test {@link EventFilterParser#value_function()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then Tree return {@link NumberTreeNode}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"value_function_return EventFilterParser.value_function()"})
  public void testValue_function_givenCreateParser42_thenTreeReturnNumberTreeNode() throws RecognitionException {
    // Arrange and Act
    value_function_return actualValue_functionResult = EventFilterParser.createParser("42").value_function();

    // Assert
    assertTrue(actualValue_functionResult.getTree() instanceof NumberTreeNode);
    Object start = actualValue_functionResult.getStart();
    assertTrue(start instanceof CommonToken);
    assertSame(start, actualValue_functionResult.getStop());
  }

  /**
   * Test value_function_return getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link value_function_return}
   *   <li>{@link value_function_return#getTree()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void value_function_return.<init>()", "Object value_function_return.getTree()"})
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
   * <ul>
   *   <li>Then createParser space TokenStream {@link CommonTokenStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"value_function_return EventFilterParser.value_function()"})
  public void testValue_function_thenCreateParserSpaceTokenStreamCommonTokenStream() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act and Assert
    Object start = createParserResult.value_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals(1, inputStream.getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, inputStream.index());
    assertEquals(1, inputStream.size());
    assertEquals(1, tokenStream.range());
  }

  /**
   * Test {@link EventFilterParser#value_function()}.
   * <ul>
   *   <li>Then return Start InputStream CharPositionInLine is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"value_function_return EventFilterParser.value_function()"})
  public void testValue_function_thenReturnStartInputStreamCharPositionInLineIsZero() throws RecognitionException {
    // Arrange, Act and Assert
    Object start = EventFilterParser.createParser("").value_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    assertEquals(0, inputStream.getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, inputStream.index());
    assertEquals(0, inputStream.size());
  }

  /**
   * Test {@link EventFilterParser#value_function()}.
   * <ul>
   *   <li>Then return Start Text is {@code or}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"value_function_return EventFilterParser.value_function()"})
  public void testValue_function_thenReturnStartTextIsOr() throws RecognitionException {
    // Arrange, Act and Assert
    Object start = EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").value_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    assertEquals("or", ((CommonToken) start).getText());
    assertEquals(2, inputStream.getCharPositionInLine());
    assertEquals(2, inputStream.index());
    assertEquals(EventFilterParser.OR, ((CommonToken) start).getType());
    assertEquals(EventFilterParser.T__33, inputStream.size());
  }

  /**
   * Test {@link EventFilterParser#value_function()}.
   * <ul>
   *   <li>Then Start InputStream return {@link ANTLRInputStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"value_function_return EventFilterParser.value_function()"})
  public void testValue_function_thenStartInputStreamReturnANTLRInputStream() throws RecognitionException {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();
    EventFilterParser eventFilterParser = new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(input)));

    // Act and Assert
    Object start = eventFilterParser.value_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRInputStream);
    TokenStream tokenStream = eventFilterParser.getTokenStream();
    assertTrue(tokenStream instanceof BufferedTokenStream);
    assertTrue(start instanceof CommonToken);
    assertEquals(0, tokenStream.index());
    assertEquals(1, ((BufferedTokenStream) tokenStream).getTokens().size());
    assertEquals(1, tokenStream.size());
    assertSame(input, inputStream);
  }

  /**
   * Test {@link EventFilterParser#equality_value_function()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#equality_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"equality_value_function_return EventFilterParser.equality_value_function()"})
  public void testEquality_value_function_givenCreateParser42() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("42").equality_value_function());
  }

  /**
   * Test {@link EventFilterParser#equality_value_function()}.
   * <ul>
   *   <li>Given createParser {@code org.antlr.runtime.tree.CommonTree}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#equality_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"equality_value_function_return EventFilterParser.equality_value_function()"})
  public void testEquality_value_function_givenCreateParserOrgAntlrRuntimeTreeCommonTree() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree").equality_value_function());
  }

  /**
   * Test {@link EventFilterParser#equality_value_function()}.
   * <ul>
   *   <li>Given createParser space.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#equality_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"equality_value_function_return EventFilterParser.equality_value_function()"})
  public void testEquality_value_function_givenCreateParserSpace() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> EventFilterParser.createParser(" ").equality_value_function());
  }

  /**
   * Test {@link EventFilterParser#equality_value_function()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#equality_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"equality_value_function_return EventFilterParser.equality_value_function()"})
  public void testEquality_value_function_givenEventFilterLexerWithInputIsANTLRInputStream()
      throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .equality_value_function());
  }

  /**
   * Test {@link EventFilterParser#equality_value_function()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#equality_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"equality_value_function_return EventFilterParser.equality_value_function()"})
  public void testEquality_value_function_givenStringReaderWithLf() throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .equality_value_function());
  }

  /**
   * Test {@link EventFilterParser#compariable_value_function()}.
   * <p>
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"compariable_value_function_return EventFilterParser.compariable_value_function()"})
  public void testCompariable_value_function() throws RecognitionException {
    // Arrange, Act and Assert
    Object start = EventFilterParser.createParser("").compariable_value_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    assertEquals(0, inputStream.getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, inputStream.index());
    assertEquals(0, inputStream.size());
  }

  /**
   * Test {@link EventFilterParser#compariable_value_function()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   *   <li>Then Tree return {@link NumberTreeNode}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"compariable_value_function_return EventFilterParser.compariable_value_function()"})
  public void testCompariable_value_function_givenCreateParser42_thenTreeReturnNumberTreeNode()
      throws RecognitionException {
    // Arrange and Act
    compariable_value_function_return actualCompariable_value_functionResult = EventFilterParser.createParser("42")
        .compariable_value_function();

    // Assert
    assertTrue(actualCompariable_value_functionResult.getTree() instanceof NumberTreeNode);
    Object start = actualCompariable_value_functionResult.getStart();
    assertTrue(start instanceof CommonToken);
    assertSame(start, actualCompariable_value_functionResult.getStop());
  }

  /**
   * Test {@link EventFilterParser#compariable_value_function()}.
   * <ul>
   *   <li>Then createParser space TokenStream {@link CommonTokenStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"compariable_value_function_return EventFilterParser.compariable_value_function()"})
  public void testCompariable_value_function_thenCreateParserSpaceTokenStreamCommonTokenStream()
      throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act and Assert
    Object start = createParserResult.compariable_value_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals(1, inputStream.getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, inputStream.index());
    assertEquals(1, inputStream.size());
    assertEquals(1, tokenStream.range());
  }

  /**
   * Test {@link EventFilterParser#compariable_value_function()}.
   * <ul>
   *   <li>Then return Start Text is {@code or}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"compariable_value_function_return EventFilterParser.compariable_value_function()"})
  public void testCompariable_value_function_thenReturnStartTextIsOr() throws RecognitionException {
    // Arrange, Act and Assert
    Object start = EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree")
        .compariable_value_function()
        .getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    assertEquals("or", ((CommonToken) start).getText());
    assertEquals(2, inputStream.getCharPositionInLine());
    assertEquals(2, inputStream.index());
    assertEquals(EventFilterParser.OR, ((CommonToken) start).getType());
    assertEquals(EventFilterParser.T__33, inputStream.size());
  }

  /**
   * Test {@link EventFilterParser#compariable_value_function()}.
   * <ul>
   *   <li>Then Start InputStream return {@link ANTLRInputStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#compariable_value_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"compariable_value_function_return EventFilterParser.compariable_value_function()"})
  public void testCompariable_value_function_thenStartInputStreamReturnANTLRInputStream() throws RecognitionException {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();
    EventFilterParser eventFilterParser = new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(input)));

    // Act and Assert
    Object start = eventFilterParser.compariable_value_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRInputStream);
    TokenStream tokenStream = eventFilterParser.getTokenStream();
    assertTrue(tokenStream instanceof BufferedTokenStream);
    assertTrue(start instanceof CommonToken);
    assertEquals(0, tokenStream.index());
    assertEquals(1, ((BufferedTokenStream) tokenStream).getTokens().size());
    assertEquals(1, tokenStream.size());
    assertSame(input, inputStream);
  }

  /**
   * Test {@link EventFilterParser#time_millis_function()}.
   * <ul>
   *   <li>Then createParser space TokenStream {@link CommonTokenStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_millis_function_return EventFilterParser.time_millis_function()"})
  public void testTime_millis_function_thenCreateParserSpaceTokenStreamCommonTokenStream() throws RecognitionException {
    // Arrange
    EventFilterParser createParserResult = EventFilterParser.createParser(" ");

    // Act and Assert
    Object start = createParserResult.time_millis_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    TokenStream tokenStream = createParserResult.getTokenStream();
    assertTrue(tokenStream instanceof CommonTokenStream);
    assertEquals(1, inputStream.getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getCharPositionInLine());
    assertEquals(1, ((CommonToken) start).getStartIndex());
    assertEquals(1, ((CommonToken) start).getTokenIndex());
    assertEquals(1, inputStream.index());
    assertEquals(1, inputStream.size());
    assertEquals(1, tokenStream.range());
  }

  /**
   * Test {@link EventFilterParser#time_millis_function()}.
   * <ul>
   *   <li>Then return Start InputStream CharPositionInLine is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_millis_function_return EventFilterParser.time_millis_function()"})
  public void testTime_millis_function_thenReturnStartInputStreamCharPositionInLineIsZero()
      throws RecognitionException {
    // Arrange, Act and Assert
    Object start = EventFilterParser.createParser("").time_millis_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    assertEquals(0, inputStream.getCharPositionInLine());
    assertEquals(0, ((CommonToken) start).getStopIndex());
    assertEquals(0, inputStream.index());
    assertEquals(0, inputStream.size());
  }

  /**
   * Test {@link EventFilterParser#time_millis_function()}.
   * <ul>
   *   <li>Then return Start Text is {@code or}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_millis_function_return EventFilterParser.time_millis_function()"})
  public void testTime_millis_function_thenReturnStartTextIsOr() throws RecognitionException {
    // Arrange, Act and Assert
    Object start = EventFilterParser.createParser("org.antlr.runtime.tree.CommonTree")
        .time_millis_function()
        .getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRStringStream);
    assertTrue(start instanceof CommonToken);
    assertEquals("or", ((CommonToken) start).getText());
    assertEquals(2, inputStream.getCharPositionInLine());
    assertEquals(2, inputStream.index());
    assertEquals(EventFilterParser.OR, ((CommonToken) start).getType());
    assertEquals(EventFilterParser.T__33, inputStream.size());
  }

  /**
   * Test {@link EventFilterParser#time_millis_function()}.
   * <ul>
   *   <li>Then Start InputStream return {@link ANTLRInputStream}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_millis_function_return EventFilterParser.time_millis_function()"})
  public void testTime_millis_function_thenStartInputStreamReturnANTLRInputStream() throws RecognitionException {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();
    EventFilterParser eventFilterParser = new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(input)));

    // Act and Assert
    Object start = eventFilterParser.time_millis_function().getStart();
    CharStream inputStream = ((CommonToken) start).getInputStream();
    assertTrue(inputStream instanceof ANTLRInputStream);
    TokenStream tokenStream = eventFilterParser.getTokenStream();
    assertTrue(tokenStream instanceof BufferedTokenStream);
    assertTrue(start instanceof CommonToken);
    assertEquals(0, tokenStream.index());
    assertEquals(1, ((BufferedTokenStream) tokenStream).getTokens().size());
    assertEquals(1, tokenStream.size());
    assertSame(input, inputStream);
  }

  /**
   * Test {@link EventFilterParser#time_millis_function()}.
   * <ul>
   *   <li>Then throw {@link EventFilterParsingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_millis_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_millis_function_return EventFilterParser.time_millis_function()"})
  public void testTime_millis_function_thenThrowEventFilterParsingException() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").time_millis_function());
  }

  /**
   * Test {@link EventFilterParser#time_string_function()}.
   * <ul>
   *   <li>Given createParser {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_string_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_string_function_return EventFilterParser.time_string_function()"})
  public void testTime_string_function_givenCreateParser42() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser("42").time_string_function());
  }

  /**
   * Test {@link EventFilterParser#time_string_function()}.
   * <ul>
   *   <li>Given createParser space.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_string_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_string_function_return EventFilterParser.time_string_function()"})
  public void testTime_string_function_givenCreateParserSpace() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class, () -> EventFilterParser.createParser(" ").time_string_function());
  }

  /**
   * Test {@link EventFilterParser#time_string_function()}.
   * <ul>
   *   <li>Given {@link EventFilterLexer#EventFilterLexer(CharStream)} with input is {@link ANTLRInputStream#ANTLRInputStream()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_string_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_string_function_return EventFilterParser.time_string_function()"})
  public void testTime_string_function_givenEventFilterLexerWithInputIsANTLRInputStream() throws RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(new BufferedTokenStream(new EventFilterLexer(new ANTLRInputStream()))))
            .time_string_function());
  }

  /**
   * Test {@link EventFilterParser#time_string_function()}.
   * <ul>
   *   <li>Given {@link StringReader#StringReader(String)} with lf.</li>
   * </ul>
   * <p>
   * Method under test: {@link EventFilterParser#time_string_function()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"time_string_function_return EventFilterParser.time_string_function()"})
  public void testTime_string_function_givenStringReaderWithLf() throws IOException, RecognitionException {
    // Arrange, Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> (new EventFilterParser(
            new BufferedTokenStream(new EventFilterLexer(new ANTLRReaderStream(new StringReader("\n"))))))
            .time_string_function());
  }
}
