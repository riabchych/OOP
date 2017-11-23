import java.util.Date;

public class Entity implements IActions {
    private int id;
    private Date createdAt;
    private Date updatedAt;
    private boolean isDeleted;
    private DBConnector db;

    public Entity() {
        this.id = 0;
        this.createdAt = new Date();
        this.updatedAt = new Date();
        this.isDeleted = false;
        this.db = new DBConnector();
    }

    public Entity(int id, Date createdAt, Date updatedAt, boolean isDeleted) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isDeleted = isDeleted;
        this.db = new DBConnector();
    }

    public DBConnector connection() {
        return this.db;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
        this.save();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        this.save();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        this.save();
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
        this.delete();
    }

    @Override
    public void delete() {
        //TODO удаляем с базы...
        this.isDeleted = true;
        System.out.println("Объект c индексом " + this.id + " успешно удалён!");
    }

    @Override
    public void save() {
        //TODO заносим изменения в базу...
        System.out.println("Объект c индексом " + this.id + " успешно изменён!");
    }
}
