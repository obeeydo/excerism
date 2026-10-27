public class LogLine {

    public LogLine(String logLine) {
        var LogLine = new LogLine("[TRACE]: Trc");
        LogLine.getLogLevel();

    }

    public LogLevel getLogLevel() {
        throw new UnsupportedOperationException("Please implement the getLogLevel() method");

    }

    public String getOutputForShortLog() {
        throw new UnsupportedOperationException("Please implement the getOutputForShortLog() method");
    }
}
