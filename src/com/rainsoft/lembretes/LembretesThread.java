package com.rainsoft.lembretes;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class LembretesThread extends Thread{
    int lbs = GerenciaLembretes.lembretesList.size();
    public void run() {
        while (true) {
            DateTime curTime = LocalDateTime.now().toDateTime();
            for (int i=0; i<GerenciaLembretes.lembretesList.size(); i++) {
                DateTime dt = GerenciaLembretes.lembretesList.get(i).getDate();
                if (curTime.isAfter(dt)) {
                    GerenciaLembretes.activateLembrete(i);
                }
            }
        }
    }
}
