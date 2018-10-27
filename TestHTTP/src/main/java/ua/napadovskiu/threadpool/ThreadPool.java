package ua.napadovskiu.threadpool;

import ua.napadovskiu.settings.Settings;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class ThreadPool {

    /**
     *
     * @param key
     * @return
     */
    private String getValueFromProperties(String key) {
        String value = "";

        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();

        try (InputStream is = loader.getResourceAsStream("app.properties")) {
            settings.load(is);

        } catch (Exception ex) {
            ex.getStackTrace();
        }
        value = settings.getValue(key);
        return value;
    }

    /**
     *
     */
    public ThreadPool() {
        int count = Integer.parseInt(getValueFromProperties("count"));
        String url = getValueFromProperties("url");
        ExecutorService service  = Executors.newFixedThreadPool(count);

        for (int i = 0; i < count; i++) {
            service.submit(new Connect(url, i));
        }
        service.shutdown();
    }

    /**
     * Main method.
     * @param args string of args.
     */
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool();
   }
}
