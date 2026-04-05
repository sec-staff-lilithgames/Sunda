package com.bytedance.sdk.component.adexpress.cm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.dt;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {
    private static float cm(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int jd(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jd();
        }
        float fCm = cm(context);
        if (fCm <= 0.0f) {
            fCm = 1.0f;
        }
        return (int) ((f10 / fCm) + 0.5f);
    }

    public static int jpo(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static float wqx(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jd();
        }
        return f10 * cm(context);
    }

    public static float jpo(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jd();
        }
        return (f10 * cm(context)) + 0.5f;
    }

    public static int jd(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jd();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String wqx(Context context) {
        String language;
        try {
            Locale locale = dt.jd(context).getConfiguration().getLocales().get(0);
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return jpo(language);
    }

    public static int jpo(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jd();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String jpo(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
