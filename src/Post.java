public class Post extends Entity {
    private String title;
    private String author;
    private String slug;
    private String text;

    public Post() {
        super();
        this.title = "";
        this.author = "";
        this.slug = "";
        this.text = "";
    }

    public Post(String title, String author, String slug, String text) {
        super();
        this.title = title;
        this.author = author;
        this.slug = slug;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.save();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        this.save();
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
        this.save();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.save();
    }

    @Override
    public void delete() {
        super.delete();
        System.out.println("Объект Post успешно удалён!");
    }

    @Override
    public void save() {
        super.save();
        System.out.println("Объект Post успешно изменён!");
    }
}
