package pr;

import android.content.SharedPreferences;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m {
    public static void clear(SharedPreferences sharedPreferences) {
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            sharedPreferences.edit().remove(it.next()).apply();
        }
    }

    public static int optInt(SharedPreferences sharedPreferences, String str, int i10) {
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getInt(str, i10);
            }
        } catch (Exception unused) {
        }
        return i10;
    }

    public static long optLong(SharedPreferences sharedPreferences, String str, long j10) {
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getLong(str, j10);
            }
        } catch (Exception unused) {
        }
        return j10;
    }

    public static String optString(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            if (sharedPreferences.contains(str)) {
                String string = sharedPreferences.getString(str, str2);
                if (string != null) {
                    return string;
                }
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public static void putInt(SharedPreferences sharedPreferences, String str, Integer num) {
        if (num == null) {
            remove(sharedPreferences, str);
        } else {
            sharedPreferences.edit().putInt(str, num.intValue()).apply();
        }
    }

    public static void putLong(SharedPreferences sharedPreferences, String str, Long l9) {
        if (l9 == null) {
            remove(sharedPreferences, str);
        } else {
            sharedPreferences.edit().putLong(str, l9.longValue()).apply();
        }
    }

    public static void putString(SharedPreferences sharedPreferences, String str, String str2) {
        if (str2 == null) {
            remove(sharedPreferences, str);
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public static void remove(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.edit().remove(str).apply();
    }

    public static void remove(SharedPreferences sharedPreferences, String... strArr) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : strArr) {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }
}
