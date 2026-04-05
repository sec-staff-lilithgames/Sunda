package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private static Context f50513a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            aa.b(z.b());
            com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, z.b(), null);
        }
    }

    @DungeonFlag
    private static String a(Throwable th2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 3);
            jSONObject.put("exception", th2.toString());
            jSONObject.put("stacktrace", Arrays.toString(th2.getStackTrace()));
            jSONObject.put("cause", String.valueOf(th2.getCause()));
            return Base64.encodeToString(jSONObject.toString().getBytes(C.UTF8_NAME), 0);
        } catch (Throwable unused) {
            return "eyJzdGF0dXMiOjN9";
        }
    }

    public static Context b() {
        return f50513a;
    }

    public static void c(Context context) {
        f50513a = context;
    }

    @DungeonFlag
    public static String b(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 0);
            jSONObject.put("envcode", ((Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue());
            jSONObject.put("bootcount", w.a(context));
            jSONObject.put("usb_debug", w.d(context));
            JSONArray[] jSONArrayArrC = w.c(context);
            if (jSONArrayArrC != null) {
                jSONObject.put("sdata", jSONArrayArrC[0]);
                jSONObject.put("sdmta", jSONArrayArrC[1]);
                jSONObject.put("curtime", System.currentTimeMillis() / 1000);
            }
            jSONObject.put("camera_count", x.a());
            jSONObject.put("sim", x.c(context));
            jSONObject.put("virtual_display", aa.a(context));
            jSONObject.put("acbs", u.b(context));
            jSONObject.put("bl_unlock", w.b(context));
            y.a(jSONObject);
            String strE = v.e();
            jSONObject.put("romtype", w.c());
            jSONObject.put("root", w.e());
            if (!TextUtils.isEmpty(strE)) {
                jSONObject.put("sign", strE);
            }
            return (String) com.pgl.ssdk.ces.a.meta(227, context, jSONObject.toString());
        } catch (Throwable th2) {
            return a(th2);
        }
    }

    public static String c() {
        String strB = b(b());
        a();
        return strB;
    }

    public static long a(Context context) {
        try {
            return ((Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @DungeonFlag
    public static void a() {
        ar.b(new a());
    }
}
