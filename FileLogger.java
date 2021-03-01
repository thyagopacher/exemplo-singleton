package br.com.padrao;

/*Classe modified for have Design Pattern Singleton*/
public class FileLogger {

    public void writeLog() {
    }

    private static FileLogger singleton;

    private FileLogger() {
    }

    /*Method Singleton for return one instance unique*/
    public static FileLogger getInstance() {
        if (singleton == null) {
            singleton = new FileLogger();
        }
        return singleton;
    }

    private static FileLogger singleton;

    /*Method Singleton for return one instance unique*/
    public static FileLogger getInstance() {
        if (singleton == null) {
            singleton = new FileLogger();
        }
        return singleton;
    }
}
