package Inheritance;

public class TextContent extends Content{
    public TextContent(String contentTitle, String contentDescription) {
        super(contentTitle, contentDescription);
    }


    @Override
    void saveContent(Content content) {
        // save file to Sqlite.
    }
}
