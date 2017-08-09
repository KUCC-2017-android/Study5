package kr.ac.korea.kucc.study;

import java.util.Calendar;

/**
 * Created by ffaass on 2017-08-07.
 */

public class Memo {
    private String text;
    private Calendar date;

    public Memo(String text, Calendar date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
