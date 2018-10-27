package ua.napadovskiu.threadpool;

import org.apache.log4j.Logger;

import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Package of  of Multithreading treads.
 *
 * @author Napadovskiy Bohdan
 * @version 1.0
 * @since 11.09.2017
 */
public class Connect implements Runnable {


    /**
     * url for test.
     */
    private final String url;

    private final int id;

    /**
     * logger
     */
    private static final Logger LOGGER = Logger.getLogger(Connect.class);

    /**
     * Constructor for class.
     * @param url for test
     */
    public Connect(String url, int id) {
        this.url = url;
        this.id = id;
    }


    /**
     * method test connect and write result in log.
     */
    @Override
    public void run() {
        HttpURLConnection connection = null;

        try {
            connection = (HttpURLConnection) new URL(this.url).openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);

            connection.connect();
            LOGGER.debug("Thread N" + this.id + " Result: " + connection.getResponseMessage());
        } catch (Throwable e) {
            LOGGER.error(e.getMessage(), e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }

        }

    }
}
