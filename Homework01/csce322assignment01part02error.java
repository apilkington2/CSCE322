import java.io.IOException;
import org.antlr.v4.runtime.*;

class csce322assignment01part02error extends BaseErrorListener{
    @Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
				int position, String msg, RecognitionException e) {
	
	System.out.println( "SYNTAX PROBLEM ON LINE " + line );
    }	
}