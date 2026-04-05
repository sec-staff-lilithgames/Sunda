package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class dt {

    /* renamed from: cm, reason: collision with root package name */
    private static String f18999cm = null;

    /* renamed from: jd, reason: collision with root package name */
    private static String f19000jd = null;

    /* renamed from: jj, reason: collision with root package name */
    private static boolean f19001jj = false;
    private static Context jpo = null;
    private static boolean my = false;
    private static Resources wqx;

    private static String cm(Context context) {
        if (f18999cm == null) {
            f18999cm = context.getPackageName();
        }
        return f18999cm;
    }

    public static int jd(Context context, String str) {
        return jpo(context, str, "string");
    }

    public static int jj(Context context, String str) {
        return jpo(context, str, TtmlNode.TAG_STYLE);
    }

    public static void jpo(Context context) {
        jpo = context;
    }

    public static int my(Context context, String str) {
        return jpo(context, str, "id");
    }

    public static int qk(Context context, String str) {
        return jd(context).getColor(xyk(context, str));
    }

    public static Drawable wqx(Context context, String str) {
        try {
            return jd(context).getDrawable(cm(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int xyk(Context context, String str) {
        return jpo(context, str, "color");
    }

    public static int zz(Context context, String str) {
        return jpo(context, str, "anim");
    }

    public static Resources jd(Context context) {
        Resources resources = wqx;
        if (resources == null) {
            resources = null;
        }
        Context context2 = jpo;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static void jpo(String str) {
        f18999cm = str;
    }

    private static int jpo(Context context, String str, String str2) {
        int identifier = jd(context).getIdentifier(str, str2, cm(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!my) {
            wqx(context);
            return jd(context).getIdentifier(str, str2, cm(context));
        }
        return context.getResources().getIdentifier(str, str2, cm(context));
    }

    public static synchronized void wqx(Context context) {
        try {
            if (TextUtils.isEmpty(f19000jd)) {
                return;
            }
            my = true;
        } catch (Throwable th2) {
            Log.e("ResourceHelp", "makePluginResources failed", th2);
        }
    }

    public static int cm(Context context, String str) {
        try {
            return jpo(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String jpo(Context context, String str) {
        return jd(context).getString(jd(context, str));
    }
}
