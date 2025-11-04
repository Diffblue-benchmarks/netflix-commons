package com.netflix.infix.lang.infix.antlr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedNotSetException;
import org.antlr.runtime.MismatchedRangeException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.junit.Test;

public class EventFilterLexerDiffblueTest {
  /**
   * Method under test: {@link EventFilterLexer.DFA11#getDescription()}
   */
  @Test
  public void testDFA11GetDescription() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();

    // Act and Assert
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        (eventFilterLexer.new DFA11(new EventFilterLexer())).getDescription());
  }

  /**
   * Method under test:
   * {@link EventFilterLexer.DFA11#DFA11(EventFilterLexer, BaseRecognizer)}
   */
  @Test
  public void testDFA11NewDfa11() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();

    // Act and Assert
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        (eventFilterLexer.new DFA11(new EventFilterLexer())).getDescription());
  }

  /**
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new RecognitionException()));
  }

  /**
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError2() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new EarlyExitException()));
  }

  /**
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError3() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new EarlyExitException(EventFilterLexer.EXPONENT, new ANTLRInputStream())));
  }

  /**
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError4() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new FailedPredicateException()));
  }

  /**
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError5() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.reportError(new MismatchedNotSetException()));
  }

  /**
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError6() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new MismatchedRangeException()));
  }

  /**
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError7() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new MismatchedSetException()));
  }

  /**
   * Method under test: {@link EventFilterLexer#reportError(RecognitionException)}
   */
  @Test
  public void testReportError8() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.reportError(new MismatchedTokenException()));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new RecognitionException()));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException2() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new EarlyExitException()));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException3() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class, () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"},
        new EarlyExitException(EventFilterLexer.EXPONENT, new ANTLRInputStream())));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException4() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new FailedPredicateException()));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException5() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedNotSetException()));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException6() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedRangeException()));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException7() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedSetException()));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException8() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedTokenException()));
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#throwLexerException(String[], RecognitionException)}
   */
  @Test
  public void testThrowLexerException9() {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer(new ANTLRInputStream());

    // Act and Assert
    assertThrows(EventFilterParsingException.class,
        () -> eventFilterLexer.throwLexerException(new String[]{"ABC123"}, new MismatchedTreeNodeException()));
  }

  /**
   * Method under test: {@link EventFilterLexer#getDelegates()}
   */
  @Test
  public void testGetDelegates() {
    // Arrange, Act and Assert
    assertEquals(0, (new EventFilterLexer()).getDelegates().length);
  }

  /**
   * Method under test: {@link EventFilterLexer#getGrammarFileName()}
   */
  @Test
  public void testGetGrammarFileName() {
    // Arrange, Act and Assert
    assertEquals("EventFilter.g", (new EventFilterLexer()).getGrammarFileName());
  }

  /**
   * Method under test: {@link EventFilterLexer#mAND()}
   */
  @Test
  public void testMAND() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("and"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mAND();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(3, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(3, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(3, eventFilterLexer.getCharIndex());
    assertEquals(3, eventFilterLexer.getCharPositionInLine());
    assertEquals(3, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mBETWEEN()}
   */
  @Test
  public void testMBETWEEN() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("between"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mBETWEEN();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(7, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(7, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(7, eventFilterLexer.getCharIndex());
    assertEquals(7, eventFilterLexer.getCharPositionInLine());
    assertEquals(7, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mEQUALS()}
   */
  @Test
  public void testMEQUALS() throws RecognitionException {
    // Arrange
    ANTLRFileStream input = mock(ANTLRFileStream.class);
    when(input.LA(anyInt())).thenReturn(61);
    doNothing().when(input).consume();

    // Act
    (new EventFilterLexer(input)).mEQUALS();

    // Assert
    verify(input).LA(eq(1));
    verify(input).consume();
  }

  /**
   * Method under test: {@link EventFilterLexer#mEXISTS()}
   */
  @Test
  public void testMEXISTS() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("exists"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mEXISTS();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(6, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(6, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(6, eventFilterLexer.getCharIndex());
    assertEquals(6, eventFilterLexer.getCharPositionInLine());
    assertEquals(6, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mFALSE()}
   */
  @Test
  public void testMFALSE() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader(Boolean.FALSE.toString()));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mFALSE();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(5, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(5, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(5, eventFilterLexer.getCharIndex());
    assertEquals(5, eventFilterLexer.getCharPositionInLine());
    assertEquals(5, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mGE()}
   */
  @Test
  public void testMGE() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader(">="));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mGE();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mGT()}
   */
  @Test
  public void testMGT() throws RecognitionException {
    // Arrange
    ANTLRFileStream input = mock(ANTLRFileStream.class);
    when(input.LA(anyInt())).thenReturn(62);
    doNothing().when(input).consume();

    // Act
    (new EventFilterLexer(input)).mGT();

    // Assert
    verify(input).LA(eq(1));
    verify(input).consume();
  }

  /**
   * Method under test: {@link EventFilterLexer#mIN()}
   */
  @Test
  public void testMIN() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("in"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mIN();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mIS()}
   */
  @Test
  public void testMIS() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("is"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mIS();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mLE()}
   */
  @Test
  public void testMLE() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("<="));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mLE();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mLT()}
   */
  @Test
  public void testMLT() throws RecognitionException {
    // Arrange
    ANTLRFileStream input = mock(ANTLRFileStream.class);
    when(input.LA(anyInt())).thenReturn(60);
    doNothing().when(input).consume();

    // Act
    (new EventFilterLexer(input)).mLT();

    // Assert
    verify(input).LA(eq(1));
    verify(input).consume();
  }

  /**
   * Method under test: {@link EventFilterLexer#mMATCHES()}
   */
  @Test
  public void testMMATCHES() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("=~"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mMATCHES();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mNOT()}
   */
  @Test
  public void testMNOT() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("not"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mNOT();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(3, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(3, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(3, eventFilterLexer.getCharIndex());
    assertEquals(3, eventFilterLexer.getCharPositionInLine());
    assertEquals(3, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mNOT_EQUALS()}
   */
  @Test
  public void testMNOT_EQUALS() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("!="));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mNOT_EQUALS();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mNULL()}
   */
  @Test
  public void testMNULL() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("null"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mNULL();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(4, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(4, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(4, eventFilterLexer.getCharIndex());
    assertEquals(4, eventFilterLexer.getCharPositionInLine());
    assertEquals(4, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mOR()}
   */
  @Test
  public void testMOR() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("or"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mOR();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(2, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(2, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(2, eventFilterLexer.getCharIndex());
    assertEquals(2, eventFilterLexer.getCharPositionInLine());
    assertEquals(2, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mTIME_MILLIS_FUN_NAME()}
   */
  @Test
  public void testMTIME_MILLIS_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("time-millis"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mTIME_MILLIS_FUN_NAME();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(EventFilterLexer.FALSE, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(EventFilterLexer.FALSE, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(EventFilterLexer.FALSE, eventFilterLexer.getCharIndex());
    assertEquals(EventFilterLexer.FALSE, eventFilterLexer.getCharPositionInLine());
    assertEquals(EventFilterLexer.FALSE, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mTIME_STRING_FUN_NAME()}
   */
  @Test
  public void testMTIME_STRING_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("time-string"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mTIME_STRING_FUN_NAME();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(EventFilterLexer.FALSE, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(EventFilterLexer.FALSE, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(EventFilterLexer.FALSE, eventFilterLexer.getCharIndex());
    assertEquals(EventFilterLexer.FALSE, eventFilterLexer.getCharPositionInLine());
    assertEquals(EventFilterLexer.FALSE, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mTRUE()}
   */
  @Test
  public void testMTRUE() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader(Boolean.TRUE.toString()));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mTRUE();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(4, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(4, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(4, eventFilterLexer.getCharIndex());
    assertEquals(4, eventFilterLexer.getCharPositionInLine());
    assertEquals(4, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mXPATH_FUN_NAME()}
   */
  @Test
  public void testMXPATH_FUN_NAME() throws IOException, RecognitionException {
    // Arrange
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("xpath"));
    EventFilterLexer eventFilterLexer = new EventFilterLexer(input);

    // Act
    eventFilterLexer.mXPATH_FUN_NAME();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals(5, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(5, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(5, eventFilterLexer.getCharIndex());
    assertEquals(5, eventFilterLexer.getCharPositionInLine());
    assertEquals(5, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mT__33()}
   */
  @Test
  public void testMT__33() throws RecognitionException {
    // Arrange
    ANTLRFileStream input = mock(ANTLRFileStream.class);
    when(input.LA(anyInt())).thenReturn(40);
    doNothing().when(input).consume();

    // Act
    (new EventFilterLexer(input)).mT__33();

    // Assert
    verify(input).LA(eq(1));
    verify(input).consume();
  }

  /**
   * Method under test: {@link EventFilterLexer#mT__34()}
   */
  @Test
  public void testMT__34() throws RecognitionException {
    // Arrange
    ANTLRFileStream input = mock(ANTLRFileStream.class);
    when(input.LA(anyInt())).thenReturn(41);
    doNothing().when(input).consume();

    // Act
    (new EventFilterLexer(input)).mT__34();

    // Assert
    verify(input).LA(eq(1));
    verify(input).consume();
  }

  /**
   * Method under test: {@link EventFilterLexer#mT__35()}
   */
  @Test
  public void testMT__35() throws RecognitionException {
    // Arrange
    ANTLRFileStream input = mock(ANTLRFileStream.class);
    when(input.LA(anyInt())).thenReturn(44);
    doNothing().when(input).consume();

    // Act
    (new EventFilterLexer(input)).mT__35();

    // Assert
    verify(input).LA(eq(1));
    verify(input).consume();
  }

  /**
   * Method under test: {@link EventFilterLexer#mNUMBER()}
   */
  @Test
  public void testMNUMBER() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );"));
    eventFilterLexer.setCharStream(input);

    // Act
    eventFilterLexer.mNUMBER();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals(":", eOFToken.getText());
    assertEquals(3, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(3, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(3, eventFilterLexer.getCharIndex());
    assertEquals(3, eventFilterLexer.getCharPositionInLine());
    assertEquals(3, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mCOMMENT()}
   */
  @Test
  public void testMCOMMENT() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mCOMMENT());
  }

  /**
   * Method under test: {@link EventFilterLexer#mWS()}
   */
  @Test
  public void testMWS() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mWS());
  }

  /**
   * Method under test: {@link EventFilterLexer#mWS()}
   */
  @Test
  public void testMWS2() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer
        .setCharStream(new ANTLRInputStream(new ByteArrayInputStream(new byte[]{'A', 31, 'A', 31, 'A', 31, 'A', 31})));

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mWS());
  }

  /**
   * Method under test: {@link EventFilterLexer#mSTRING()}
   */
  @Test
  public void testMSTRING() throws RecognitionException {
    // Arrange
    ANTLRFileStream input = mock(ANTLRFileStream.class);
    when(input.substring(anyInt(), anyInt())).thenReturn("Substring");
    when(input.LA(anyInt())).thenReturn(EventFilterLexer.T__34);
    when(input.index()).thenReturn(1);
    doNothing().when(input).consume();

    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(input);

    // Act
    eventFilterLexer.mSTRING();

    // Assert
    verify(input, atLeast(1)).LA(eq(1));
    verify(input, atLeast(1)).consume();
    verify(input, atLeast(1)).index();
    verify(input, atLeast(1)).substring(eq(-1), eq(0));
    assertEquals("ubstrin", eventFilterLexer.getText());
  }

  /**
   * Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  public void testMHEX_DIGIT() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mHEX_DIGIT());
  }

  /**
   * Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  public void testMHEX_DIGIT2() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(new byte[]{'A', 1, 'A', 1, 'A', 1, 'A', 1}));
    eventFilterLexer.setCharStream(input);

    // Act
    eventFilterLexer.mHEX_DIGIT();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("\u0001", eOFToken.getText());
    assertEquals(1, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(1, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(1, eventFilterLexer.getCharIndex());
    assertEquals(1, eventFilterLexer.getCharPositionInLine());
    assertEquals(1, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mHEX_DIGIT()}
   */
  @Test
  public void testMHEX_DIGIT3() throws IOException, RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    ANTLRReaderStream input = new ANTLRReaderStream(new StringReader("foo"));
    eventFilterLexer.setCharStream(input);

    // Act
    eventFilterLexer.mHEX_DIGIT();

    // Assert
    Token eOFToken = eventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals("o", eOFToken.getText());
    assertEquals(1, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(1, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(1, eventFilterLexer.getCharIndex());
    assertEquals(1, eventFilterLexer.getCharPositionInLine());
    assertEquals(1, eOFToken.getCharPositionInLine());
    assertSame(input, eventFilterLexer.getCharStream());
  }

  /**
   * Method under test: {@link EventFilterLexer#mESC_SEQ()}
   */
  @Test
  public void testMESC_SEQ() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mESC_SEQ());
  }

  /**
   * Method under test: {@link EventFilterLexer#mOCTAL_ESC()}
   */
  @Test
  public void testMOCTAL_ESC() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mOCTAL_ESC());
  }

  /**
   * Method under test: {@link EventFilterLexer#mEXPONENT()}
   */
  @Test
  public void testMEXPONENT() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(MismatchedSetException.class, () -> eventFilterLexer.mEXPONENT());
  }

  /**
   * Method under test: {@link EventFilterLexer#mTokens()}
   */
  @Test
  public void testMTokens() throws RecognitionException {
    // Arrange
    EventFilterLexer eventFilterLexer = new EventFilterLexer();
    eventFilterLexer.setCharStream(new ANTLRInputStream());

    // Act and Assert
    assertThrows(NoViableAltException.class, () -> eventFilterLexer.mTokens());
  }

  /**
   * Method under test: {@link EventFilterLexer#EventFilterLexer()}
   */
  @Test
  public void testNewEventFilterLexer() {
    // Arrange and Act
    EventFilterLexer actualEventFilterLexer = new EventFilterLexer();

    // Assert
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        actualEventFilterLexer.dfa11.getDescription());
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertNull(actualEventFilterLexer.getCharStream());
    assertEquals(0, actualEventFilterLexer.getBacktrackingLevel());
    assertEquals(0, actualEventFilterLexer.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterLexer.getRuleMemoizationCacheSize());
    assertEquals(0, actualEventFilterLexer.getDelegates().length);
    assertTrue(actualEventFilterLexer.getRuleInvocationStack().isEmpty());
  }

  /**
   * Method under test: {@link EventFilterLexer#EventFilterLexer(CharStream)}
   */
  @Test
  public void testNewEventFilterLexer2() {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();

    // Act
    EventFilterLexer actualEventFilterLexer = new EventFilterLexer(input);

    // Assert
    Token eOFToken = actualEventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        actualEventFilterLexer.dfa11.getDescription());
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertNull(actualEventFilterLexer.getSourceName());
    assertEquals(0, actualEventFilterLexer.getBacktrackingLevel());
    assertEquals(0, actualEventFilterLexer.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterLexer.getRuleMemoizationCacheSize());
    assertEquals(0, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(0, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(0, actualEventFilterLexer.getCharIndex());
    assertEquals(0, actualEventFilterLexer.getCharPositionInLine());
    assertEquals(0, eOFToken.getChannel());
    assertEquals(0, eOFToken.getCharPositionInLine());
    assertEquals(0, actualEventFilterLexer.getDelegates().length);
    assertEquals(1, actualEventFilterLexer.getLine());
    assertEquals(1, eOFToken.getLine());
    assertTrue(actualEventFilterLexer.getRuleInvocationStack().isEmpty());
    assertEquals(EventFilterLexer.EOF, eOFToken.getTokenIndex());
    assertEquals(EventFilterLexer.EOF, eOFToken.getType());
    assertSame(input, actualEventFilterLexer.getCharStream());
    assertSame(input, eOFToken.getInputStream());
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#EventFilterLexer(CharStream, RecognizerSharedState)}
   */
  @Test
  public void testNewEventFilterLexer3() {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();

    // Act
    EventFilterLexer actualEventFilterLexer = new EventFilterLexer(input, new RecognizerSharedState());

    // Assert
    Token eOFToken = actualEventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        actualEventFilterLexer.dfa11.getDescription());
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertNull(actualEventFilterLexer.getSourceName());
    assertEquals(0, actualEventFilterLexer.getBacktrackingLevel());
    assertEquals(0, actualEventFilterLexer.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterLexer.getRuleMemoizationCacheSize());
    assertEquals(0, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(0, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(0, actualEventFilterLexer.getCharIndex());
    assertEquals(0, actualEventFilterLexer.getCharPositionInLine());
    assertEquals(0, eOFToken.getChannel());
    assertEquals(0, eOFToken.getCharPositionInLine());
    assertEquals(0, actualEventFilterLexer.getDelegates().length);
    assertEquals(1, actualEventFilterLexer.getLine());
    assertEquals(1, eOFToken.getLine());
    assertTrue(actualEventFilterLexer.getRuleInvocationStack().isEmpty());
    assertEquals(EventFilterLexer.EOF, eOFToken.getTokenIndex());
    assertEquals(EventFilterLexer.EOF, eOFToken.getType());
    assertSame(input, actualEventFilterLexer.getCharStream());
    assertSame(input, eOFToken.getInputStream());
  }

  /**
   * Method under test:
   * {@link EventFilterLexer#EventFilterLexer(CharStream, RecognizerSharedState)}
   */
  @Test
  public void testNewEventFilterLexer4() {
    // Arrange
    ANTLRInputStream input = new ANTLRInputStream();

    // Act
    EventFilterLexer actualEventFilterLexer = new EventFilterLexer(input, null);

    // Assert
    Token eOFToken = actualEventFilterLexer.getEOFToken();
    assertTrue(eOFToken instanceof CommonToken);
    assertEquals(
        "197:1: NUMBER : ( ( '+' | '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? )? | ( '+' | '-'"
            + " )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );",
        actualEventFilterLexer.dfa11.getDescription());
    assertEquals("<EOF>", eOFToken.getText());
    assertEquals("EventFilter.g", actualEventFilterLexer.getGrammarFileName());
    assertNull(actualEventFilterLexer.getTokenNames());
    assertNull(actualEventFilterLexer.getSourceName());
    assertEquals(0, actualEventFilterLexer.getBacktrackingLevel());
    assertEquals(0, actualEventFilterLexer.getNumberOfSyntaxErrors());
    assertEquals(0, actualEventFilterLexer.getRuleMemoizationCacheSize());
    assertEquals(0, ((CommonToken) eOFToken).getStartIndex());
    assertEquals(0, ((CommonToken) eOFToken).getStopIndex());
    assertEquals(0, actualEventFilterLexer.getCharIndex());
    assertEquals(0, actualEventFilterLexer.getCharPositionInLine());
    assertEquals(0, eOFToken.getChannel());
    assertEquals(0, eOFToken.getCharPositionInLine());
    assertEquals(0, actualEventFilterLexer.getDelegates().length);
    assertEquals(1, actualEventFilterLexer.getLine());
    assertEquals(1, eOFToken.getLine());
    assertTrue(actualEventFilterLexer.getRuleInvocationStack().isEmpty());
    assertEquals(EventFilterLexer.EOF, eOFToken.getTokenIndex());
    assertEquals(EventFilterLexer.EOF, eOFToken.getType());
    assertSame(input, actualEventFilterLexer.getCharStream());
    assertSame(input, eOFToken.getInputStream());
  }
}
