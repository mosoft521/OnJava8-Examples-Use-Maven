// exceptions/LoggingExceptions2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Logging caught exceptions
// {ErrorOutputExpected}

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions2 {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));//对比效果
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}
/* Output:
//注释掉效果：
三月 03, 2021 4:22:24 下午 LoggingExceptions2 logException
严重:
//打开注释效果：
三月 03, 2021 4:22:43 下午 LoggingExceptions2 logException
严重: java.lang.NullPointerException
	at LoggingExceptions2.main(LoggingExceptions2.java:24)
*/
