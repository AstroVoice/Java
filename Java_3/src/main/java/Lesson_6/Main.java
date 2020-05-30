package Lesson_6;

import java.io.IOException;
import java.util.logging.*;

public class Main {

    private static final Logger logger = Logger.getLogger("");

    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.ALL);
        logger.getHandlers()[0].setLevel(Level.ALL);

       // LogManager.getLogManager().readConfiguration(new FileInputStream("log.properties"));

        logger.getHandlers()[0].setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + "\t" + record.getMessage() + "\t" + record.getMillis() + "\n";
            }
        });

        logger.getHandlers()[0].setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getMessage().startsWith("Java");
            }
        });

        Handler handler = new FileHandler("mylog.log", true);
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);

        logger.log(Level.SEVERE, "Java SEVERE");
        logger.log(Level.INFO, "C# INFO");
        logger.log(Level.CONFIG, "Java CONFIG");
        logger.log(Level.FINE, "Java FINE");
    }
}
