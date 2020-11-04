package kr.springcoreproject.springapplicationcontext;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Event {
    Integer id;

    @NotEmpty
    String title;

    @NotNull @Min(0)
    Integer limit;

    @Email
    String email;

    public String getTitle() {
        return title;
    }


    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
