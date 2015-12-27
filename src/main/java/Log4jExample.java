import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;

public class Log4jExample {

    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(Log4jExample.class.getName());

    public static void main(String[] args)throws IOException,SQLException{

        //optional. sets minimum level for logging
        log.setLevel(Level.WARN);

        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }

}
