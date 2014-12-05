appender("stdout", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d [%thread] [%level] %logger - %msg%n"
    }
}

appender("ROLLING", RollingFileAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d [%thread] [%level] %logger - %msg%n"
    }
    rollingPolicy(TimeBasedRollingPolicy) {
        FileNamePattern = "log-%d{yyyy.MM.dd}.txt"
    }
}

logger("org.springframework", INFO)
logger("example", DEBUG)

root(WARN, ["stdout", "ROLLING"])