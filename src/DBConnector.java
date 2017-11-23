public abstract class DBConnector implements IDBConnector {
    private boolean isConnected;

    public DBConnector() {
        this.isConnected = false;
    }

    public String status() {
        return isConnected ? "Connected!" : "Disconnected";
    }

    public void open() {
        this.isConnected = true;
    }

    public void open(String params) {
        this.isConnected = true;
    }

    public void close() {
        this.isConnected = false;
    }

    public String query(String params) {
        return "Результат: " + params;
    }
}
