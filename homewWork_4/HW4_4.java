package homewWork_4;

public class HW4_4 extends HW4_4_Basis {
    public static long hours;
    public static long minutes;
    public static long seconds;
    public static long mlsec;
    public static String returnResultHours;
    public static String returnResultMinutes;
    public static String returnResultSeconds;
    public static String returnResultMlSec;
    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat){
        if(shortFormat == true){
            if(millisecond < 1000){
                mlsec = millisecond;
                seconds  = 0;
                minutes = 0;
                hours = 0;
                if(mlsec < 10){
                    return 00+":"+00+":"+00+"."+00+millisecond;
                }
                if(mlsec >= 10 && mlsec < 100){
                    return 00+":"+00+":"+00+"."+0+millisecond;
                }
                if(mlsec >= 100 && mlsec < 1000){
                    return 00+":"+00+":"+00+"."+millisecond;
                }

            }
            if (millisecond >= 1000 && millisecond <60000){
                seconds = millisecond/1000;
                mlsec = millisecond%1000;
                minutes = 0;
                hours = 0;
                if(seconds<10) {
                    if (mlsec < 10) {
                        return 00 + ":" + 00 + ":" + 0+seconds + "." + 00 + mlsec;
                    }
                    if (mlsec >= 10 && mlsec < 100) {
                        return 00 + ":" + 00 + ":" + 0+seconds + "." + 0 + mlsec;
                    }
                    if (mlsec >= 100 && mlsec < 1000) {
                        return 00 + ":" + 00 + ":" + 0+seconds + "." + mlsec;
                    }
                }
                if(seconds >= 10){
                    if (mlsec < 10) {
                        return 00 + ":" + 00 + ":" + seconds + "." + 00 + mlsec;
                    }
                    if (mlsec >= 10 && mlsec < 100) {
                        return 00 + ":" + 00 + ":" + seconds + "." + 0 + mlsec;
                    }
                    if (mlsec >= 100 && mlsec < 1000) {
                        return 00 + ":" + 00 + ":" + seconds + "." + mlsec;
                    }
                }
            }
            if (millisecond >= 60000 && millisecond <3600000){
                minutes = millisecond/60000;
                seconds = (millisecond - 60000 * minutes)/1000;
                mlsec = (millisecond - 60000 * minutes) % 1000;
                hours = 0;
                if (minutes < 10 ){
                    if(seconds<10) {
                        if (mlsec < 10) {
                            return 00 + ":" + 0+minutes + ":" + 0+seconds + "." + 00 + mlsec;
                        }
                        if (mlsec >= 10 && mlsec < 100) {
                            return 00 + ":" + 0+minutes + ":" + 0+seconds + "." + 0 + mlsec;
                        }
                        if (mlsec >= 100 && mlsec < 1000) {
                            return 00 + ":" + 0+minutes + ":" + 0+seconds + "." + mlsec;
                        }
                    }
                    if(seconds >= 10){
                        if (mlsec < 10) {
                            return 00 + ":" + 0+minutes + ":" + seconds + "." + 00 + mlsec;
                        }
                        if (mlsec >= 10 && mlsec < 100) {
                            return 00 + ":" + 0+minutes + ":" + seconds + "." + 0 + mlsec;
                        }
                        if (mlsec >= 100 && mlsec < 1000) {
                            return 00 + ":" + 0+minutes + ":" + seconds + "." + mlsec;
                        }
                    }
                }
                if(minutes >= 10){
                    if(seconds<10) {
                        if (mlsec < 10) {
                            return 00 + ":" + minutes + ":" + 0+seconds + "." + 00 + mlsec;
                        }
                        if (mlsec >= 10 && mlsec < 100) {
                            return 00 + ":" + minutes + ":" + 0+seconds + "." + 0 + mlsec;
                        }
                        if (mlsec >= 100 && mlsec < 1000) {
                            return 00 + ":" + minutes + ":" + 0+seconds + "." + mlsec;
                        }
                    }
                    if(seconds >= 10){
                        if (mlsec < 10) {
                            return 00 + ":" + minutes + ":" + seconds + "." + 00 + mlsec;
                        }
                        if (mlsec >= 10 && mlsec < 100) {
                            return 00 + ":" + minutes + ":" + seconds + "." + 0 + mlsec;
                        }
                        if (mlsec >= 100 && mlsec < 1000) {
                            return 00 + ":" + minutes + ":" + seconds + "." + mlsec;
                        }
                    }
                }
            }
            if (millisecond >= 3600000 && millisecond <216000000L){
                hours = millisecond/3600000;
                minutes = (millisecond-3600000*hours)/60000;
                seconds = (millisecond-(3600000*hours)-60000*minutes)/1000;
                mlsec = (millisecond-(3600000*hours)-60000*minutes) % 1000;
                if(hours <= 9) {
                    if (minutes < 10) {
                        if (seconds < 10) {
                            if (mlsec < 10) {
                                return "0" + hours + ":" + 0 + minutes + ":" + 0 + seconds + "." + 00 + mlsec;
                            }
                            if (mlsec >= 10 && mlsec < 100) {
                                return "0" + hours + ":" + 0 + minutes + ":" + 0 + seconds + "." + 0 + mlsec;
                            }
                            if (mlsec >= 100 && mlsec < 1000) {
                                return "0" + hours + ":" + 0 + minutes + ":" + 0 + seconds + "." + mlsec;
                            }
                        }
                        if (seconds >= 10) {
                            if (mlsec < 10) {
                                return "0" + hours + ":" + 0 + minutes + ":" + seconds + "." + 00 + mlsec;
                            }
                            if (mlsec >= 10 && mlsec < 100) {
                                return "0" + hours + ":" + 0 + minutes + ":" + seconds + "." + 0 + mlsec;
                            }
                            if (mlsec >= 100 && mlsec < 1000) {
                                return "0" + hours + ":" + 0 + minutes + ":" + seconds + "." + mlsec;
                            }
                        }
                    }
                    if (minutes >= 10) {
                        if (seconds < 10) {
                            if (mlsec < 10) {
                                return "0" + hours + ":" + minutes + ":" + 0 + seconds + "." + 00 + mlsec;
                            }
                            if (mlsec >= 10 && mlsec < 100) {
                                return "0" + hours + ":" + minutes + ":" + 0 + seconds + "." + 0 + mlsec;
                            }
                            if (mlsec >= 100 && mlsec < 1000) {
                                return "0" + hours + ":" + minutes + ":" + 0 + seconds + "." + mlsec;
                            }
                        }
                        if (seconds >= 10) {
                            if (mlsec < 10) {
                                return "0" + hours + ":" + minutes + ":" + seconds + "." + 00 + mlsec;
                            }
                            if (mlsec >= 10 && mlsec < 100) {
                                return "0" + hours + ":" + minutes + ":" + seconds + "." + 0 + mlsec;
                            }
                            if (mlsec >= 100 && mlsec < 1000) {
                                return "0" + hours + ":" + minutes + ":" + seconds + "." + mlsec;
                            }
                        }
                    }
                }
                if(hours >= 10) {
                    if (minutes < 10) {
                        if (seconds < 10) {
                            if (mlsec < 10) {
                                return  hours + ":" + 0 + minutes + ":" + 0 + seconds + "." + 00 + mlsec;
                            }
                            if (mlsec >= 10 && mlsec < 100) {
                                return hours + ":" + 0 + minutes + ":" + 0 + seconds + "." + 0 + mlsec;
                            }
                            if (mlsec >= 100 && mlsec < 1000) {
                                return hours + ":" + 0 + minutes + ":" + 0 + seconds + "." + mlsec;
                            }
                        }
                        if (seconds >= 10) {
                            if (mlsec < 10) {
                                return hours + ":" + 0 + minutes + ":" + seconds + "." + 00 + mlsec;
                            }
                            if (mlsec >= 10 && mlsec < 100) {
                                return hours + ":" + 0 + minutes + ":" + seconds + "." + 0 + mlsec;
                            }
                            if (mlsec >= 100 && mlsec < 1000) {
                                return hours + ":" + 0 + minutes + ":" + seconds + "." + mlsec;
                            }
                        }
                    }
                    if (minutes >= 10) {
                        if (seconds < 10) {
                            if (mlsec < 10) {
                                return hours + ":" + minutes + ":" + 0 + seconds + "." + 00 + mlsec;
                            }
                            if (mlsec >= 10 && mlsec < 100) {
                                return hours + ":" + minutes + ":" + 0 + seconds + "." + 0 + mlsec;
                            }
                            if (mlsec >= 100 && mlsec < 1000) {
                                return hours + ":" + minutes + ":" + 0 + seconds + "." + mlsec;
                            }
                        }
                        if (seconds >= 10) {
                            if (mlsec < 10) {
                                return  hours + ":" + minutes + ":" + seconds + "." + 00 + mlsec;
                            }
                            if (mlsec >= 10 && mlsec < 100) {
                                return  hours + ":" + minutes + ":" + seconds + "." + 0 + mlsec;
                            }
                            if (mlsec >= 100 && mlsec < 1000) {
                                return hours + ":" + minutes + ":" + seconds + "." + mlsec;
                            }
                        }
                    }
                }
            }
        }
        if(shortFormat == false){
            if(millisecond < 1000){
                mlsec = millisecond;
                seconds  = 0;
                minutes = 0;
                hours = 0;
                if(mlsec%10 == 0 || (mlsec%10 >=5 && mlsec%10<= 9) || (mlsec%10 > 10 && mlsec%10 < 20)){
                    returnResultMlSec = mlSec56789;
                }
                if(mlsec%10 >=2 && mlsec%10 <= 4 && mlsec != 12 && mlsec != 12 && mlsec != 14){
                    returnResultMlSec = mlSec234;
                }
                if(mlsec == 1){
                    returnResultMlSec = mlSec1;
                }
                if(seconds%10 == 0 || (seconds%10 >=5 && seconds%10 <= 9)|| (seconds%10 > 10 && seconds%10 < 20)){
                    returnResultSeconds = second56789;
                }
                if(seconds%10 >=2 && seconds%10 <= 4 && seconds != 12 && seconds != 13 && seconds != 14){
                    returnResultSeconds = second234;
                }
                if(seconds == 1){
                    returnResultSeconds = second1;
                }
                if(minutes%10 == 0 || (minutes%10 >=5 && minutes%10 <= 9)|| (minutes%10 > 10 && minutes%10 < 20)){
                    returnResultMinutes = minute56789;
                }
                if(minutes%10 >=2 && minutes%10 <= 4  && minutes != 12 && minutes != 13 && minutes != 14){
                    returnResultMinutes = minute234;
                }
                if(minutes == 1){
                    returnResultMinutes = minute1;
                }
                if(hours%10 == 0 || (hours%10 >=5 && hours%10 <= 9)|| (hours%10 > 10 && hours%10 < 20)){
                    returnResultHours = hours56789;
                }
                if(hours%10 >=2 && hours%10 <= 4 && hours != 12 && hours != 13 && hours != 14){
                    returnResultHours = hours234;
                }
                if(hours == 1){
                    returnResultHours = hour1;
                }
                return  "00"+" "+hours56789+" "+"00"+" "+minute56789 +" "+ "00"+" "+ second56789 +" "+mlsec + " " + returnResultMlSec;
            }
            if (millisecond >= 1000 && millisecond <60000) {
                seconds = millisecond / 1000;
                mlsec = millisecond % 1000;
                minutes = 0;
                hours = 0;
                if(mlsec%10 == 0 || (mlsec%10 >=5 && mlsec%10<= 9)){
                    returnResultMlSec = mlSec56789;
                }
                if(mlsec%10 >=2 && mlsec%10 <= 4){
                    returnResultMlSec = mlSec234;
                }
                if(mlsec == 1){
                    returnResultMlSec = mlSec1;
                }
                if(mlsec%100 > 10 && mlsec%100 < 20){
                    returnResultMlSec = mlSec56789;
                }
                if(seconds%10 == 0 || (seconds%10 >=5 && seconds%10 <= 9)){
                    returnResultSeconds = second56789;
                }
                if(seconds%10 >=2 && seconds%10 <= 4){
                    returnResultSeconds = second234;
                }
                if(seconds == 1){
                    returnResultSeconds = second1;
                }
                if(seconds%100 > 10 && seconds%100 < 20){
                    returnResultSeconds = second56789;
                }
                if(minutes%10 == 0 || (minutes%10 >=5 && minutes%10 <= 9)){
                    returnResultMinutes = minute56789;
                }
                if(minutes%10 >=2 && minutes%10 <= 4){
                    returnResultMinutes = minute234;
                }
                if(minutes == 1){
                    returnResultMinutes = minute1;
                }
                if(minutes%100 > 10 && minutes%100 < 20){
                    returnResultMinutes = minute56789;
                }
                if(hours%10 == 0 || (hours%10 >=5 && hours%10 <= 9)){
                    returnResultHours = hours56789;
                }
                if(hours%10 >=2 && hours%10 <= 4){
                    returnResultHours = hours234;
                }
                if(hours == 1){
                    returnResultHours = hour1;
                }
                if(hours%100 > 10 && hours%100 < 20){
                    returnResultHours = hours56789;
                }
                return "00"+" "+hours56789+" "+"00"+" "+minute56789 +" "+ seconds +" "+ returnResultSeconds +" "+mlsec + " " + returnResultMlSec;
            }
            if (millisecond >= 60000 && millisecond <3600000){
                minutes = millisecond/60000;
                seconds = (millisecond - 60000 * minutes)/1000;
                mlsec = (millisecond - 60000 * minutes) % 1000;
                hours = 0;
                if(mlsec%10 == 0 || (mlsec%10 >=5 && mlsec%10<= 9)){
                    returnResultMlSec = mlSec56789;
                }
                if(mlsec%10 >=2 && mlsec%10 <= 4){
                    returnResultMlSec = mlSec234;
                }
                if(mlsec == 1){
                    returnResultMlSec = mlSec1;
                }
                if(mlsec%100 > 10 && mlsec%100 < 20){
                    returnResultMlSec = mlSec56789;
                }
                if(seconds%10 == 0 || (seconds%10 >=5 && seconds%10 <= 9)){
                    returnResultSeconds = second56789;
                }
                if(seconds%10 >=2 && seconds%10 <= 4){
                    returnResultSeconds = second234;
                }
                if(seconds == 1){
                    returnResultSeconds = second1;
                }
                if(seconds%100 > 10 && seconds%100 < 20){
                    returnResultSeconds = second56789;
                }
                if(minutes%10 == 0 || (minutes%10 >=5 && minutes%10 <= 9)){
                    returnResultMinutes = minute56789;
                }
                if(minutes%10 >=2 && minutes%10 <= 4){
                    returnResultMinutes = minute234;
                }
                if(minutes == 1){
                    returnResultMinutes = minute1;
                }
                if(minutes%100 > 10 && minutes%100 < 20){
                    returnResultMinutes = minute56789;
                }
                if(hours%10 == 0 || (hours%10 >=5 && hours%10 <= 9)){
                    returnResultHours = hours56789;
                }
                if(hours%10 >=2 && hours%10 <= 4){
                    returnResultHours = hours234;
                }
                if(hours == 1){
                    returnResultHours = hour1;
                }
                if(hours%100 > 10 && hours%100 < 20){
                    returnResultHours = hours56789;
                }
                return "00"+" "+hours56789+" "+minutes+" "+returnResultMinutes +" "+ seconds +" "+ returnResultSeconds +" "+mlsec + " " + returnResultMlSec;
            }
            if (millisecond >= 3600000 && millisecond <216000000L){
                hours = millisecond/3600000;
                minutes = (millisecond-3600000*hours)/60000;
                seconds = (millisecond-(3600000*hours)-60000*minutes)/1000;
                mlsec = (millisecond-(3600000*hours)-60000*minutes) % 1000;
                if(mlsec%10 == 0 || (mlsec%10 >=5 && mlsec%10<= 9)){
                    returnResultMlSec = mlSec56789;
                }
                if(mlsec%10 >=2 && mlsec%10 <= 4){
                    returnResultMlSec = mlSec234;
                }
                if(mlsec == 1){
                    returnResultMlSec = mlSec1;
                }
                if(mlsec%100 > 10 && mlsec%100 < 20){
                    returnResultMlSec = mlSec56789;
                }
                if(seconds%10 == 0 || (seconds%10 >=5 && seconds%10 <= 9)){
                    returnResultSeconds = second56789;
                }
                if(seconds%10 >=2 && seconds%10 <= 4){
                    returnResultSeconds = second234;
                }
                if(seconds == 1){
                    returnResultSeconds = second1;
                }
                if(seconds%100 > 10 && seconds%100 < 20){
                    returnResultSeconds = second56789;
                }
                if(minutes%10 == 0 || (minutes%10 >=5 && minutes%10 <= 9)){
                    returnResultMinutes = minute56789;
                }
                if(minutes%10 >=2 && minutes%10 <= 4){
                    returnResultMinutes = minute234;
                }
                if(minutes == 1){
                    returnResultMinutes = minute1;
                }
                if(minutes%100 > 10 && minutes%100 < 20){
                    returnResultMinutes = minute56789;
                }
                if(hours%10 == 0 || (hours%10 >=5 && hours%10 <= 9)){
                    returnResultHours = hours56789;
                }
                if(hours%10 >=2 && hours%10 <= 4){
                    returnResultHours = hours234;
                }
                if(hours == 1){
                    returnResultHours = hour1;
                }
                if(hours%100 > 10 && hours%100 < 20){
                    returnResultHours = hours56789;
                }
                return hours+" "+returnResultHours+" "+minutes+" "+returnResultMinutes +" "+ seconds +" "+ returnResultSeconds +" "+mlsec + " " + returnResultMlSec;
            }
        }
        return "fuck";
    }
}
