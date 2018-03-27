package com.zqf.mytimelineview;

/**
 * -----------------------------
 * Created by zqf on 2018/3/27.
 * ---------------------------
 */

public class Bean {
   String date;
   String title;
   String description;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bean(String date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }
}
