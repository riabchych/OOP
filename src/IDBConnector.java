public interface IDBConnector {
    String status();

    void open();

    void open(String params);

    void close();

    String query(String params);
}
