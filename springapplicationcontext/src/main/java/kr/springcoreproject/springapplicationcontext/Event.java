package kr.springcoreproject.springapplicationcontext;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Event {
    private Integer id;
    private String title;

    public Event(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    //    @NotEmpty
//    String title;
//
//    @NotNull @Min(0)
//    Integer limit;
//
//    @Email
//    String email;
//
//    public String getTitle() {
//        return title;
//    }
//
//
//    public void setLimit(Integer limit) {
//        this.limit = limit;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
}
