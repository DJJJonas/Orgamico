package com.rainsoft.lembretes;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Lembrete {
    private String title;
    private DateTime date;

    Lembrete (String title, DateTime date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }
    
    public String getFormattedDateTime() {
        String formattedDateTime;
        DateTimeFormatter dtf;
        dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
        formattedDateTime = date.toString(dtf);
        dtf = DateTimeFormat.forPattern("HH:mm");
        formattedDateTime += "T" + date.toString(dtf);
        return formattedDateTime;
    }
    
    public String getDateTime() {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("HH:mm");
        return date.toString(dtf);
    }

    @Override
    public String toString() {
        return "Lembrete{" + "title=" + title + ", DateTime()=" + getDateTime() + ", day=" + date.getDayOfMonth() + ", month=" + date.getMonthOfYear() + ", year=" + date.getYear() + '}';
    }
}
