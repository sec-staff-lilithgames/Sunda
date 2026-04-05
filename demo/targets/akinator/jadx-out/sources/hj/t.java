package hj;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class t {
    public static void logd(String str) {
        if (Log.isLoggable("FIAM.Display", 3)) {
            Log.d("FIAM.Display", str);
        }
    }

    public static void logdHeader(String str) {
        logd("============ " + str + " ============");
    }

    public static void logdNumber(String str, float f10) {
        logd(str + ": " + f10);
    }

    public static void logdPair(String str, float f10, float f11) {
        logd(str + ": (" + f10 + ", " + f11 + ")");
    }

    public static void loge(String str) {
        Log.e("FIAM.Display", str);
    }

    public static void logi(String str) {
        if (Log.isLoggable("FIAM.Display", 4)) {
            Log.i("FIAM.Display", str);
        }
    }
}
