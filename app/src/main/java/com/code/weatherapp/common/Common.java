package com.code.weatherapp.common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static final String APP_ID="82a404c27517196cd045a256957ca1fc";
    public static Location current_location=null;





    public static String convertUnixToDate(long dt) {

        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm dd EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm ");
        String formatted = sdf.format(date);
        return formatted;

    }
}
