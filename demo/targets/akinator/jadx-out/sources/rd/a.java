package rd;

import a.b;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {
    public static String a(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.k("TRuntime.", str);
        }
        String strK = b.k("TRuntime.", str);
        return strK.length() > 23 ? strK.substring(0, 23) : strK;
    }

    public static void d(String str, String str2) {
        String strA = a(str);
        if (Log.isLoggable(strA, 3)) {
            Log.d(strA, str2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        String strA = a(str);
        if (Log.isLoggable(strA, 6)) {
            Log.e(strA, str2, th2);
        }
    }

    public static void i(String str, String str2, Object obj) {
        String strA = a(str);
        if (Log.isLoggable(strA, 4)) {
            Log.i(strA, String.format(str2, obj));
        }
    }

    public static void w(String str, String str2, Object obj) {
        String strA = a(str);
        if (Log.isLoggable(strA, 5)) {
            Log.w(strA, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj) {
        String strA = a(str);
        if (Log.isLoggable(strA, 3)) {
            Log.d(strA, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        String strA = a(str);
        if (Log.isLoggable(strA, 3)) {
            Log.d(strA, String.format(str2, obj, obj2));
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        String strA = a(str);
        if (Log.isLoggable(strA, 3)) {
            Log.d(strA, String.format(str2, objArr));
        }
    }
}
