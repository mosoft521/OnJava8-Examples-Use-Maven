// exceptions/LoggingExceptions.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// An exception that reports through a Logger
// {ErrorOutputExpected}

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");

    LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));//对比效果
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}
/* Output:
//注释掉效果：
三月 03, 2021 4:18:27 下午 LoggingException <init>
严重:
Caught LoggingException
三月 03, 2021 4:18:28 下午 LoggingException <init>
严重:
Caught LoggingException
//打开注释效果：
三月 03, 2021 4:18:55 下午 LoggingException <init>
严重: LoggingException
	at LoggingExceptions.main(LoggingExceptions.java:26)

Caught LoggingException
三月 03, 2021 4:18:55 下午 LoggingException <init>
严重: LoggingException
	at LoggingExceptions.main(LoggingExceptions.java:31)

Caught LoggingException
*/
