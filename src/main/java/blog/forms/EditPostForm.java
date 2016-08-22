package blog.forms;

import javax.xml.soap.Text;
import java.util.Date;

public class EditPostForm {
    private String title;
    private Text  body;
    private Date date;
    private Long authourid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Text getContent() {
        return body;
    }

    public void setContent(Text content) {
        body = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getAuthourid() {
        return authourid;
    }

    public void setAuthourid(Long authourid) {
        this.authourid = authourid;
    }
}
