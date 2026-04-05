package com.bytedance.sdk.openadsdk.cm;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.nmd;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: cm, reason: collision with root package name */
    private static Method f19699cm = null;

    /* renamed from: jd, reason: collision with root package name */
    private static Class<?> f19700jd = null;
    private static Method jpo = null;
    private static boolean my = false;
    private static Method wqx;

    static {
        jd();
    }

    private static void jd() {
        int i10;
        if (my || (i10 = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (wqx()) {
                jpo = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                f19700jd = cls;
                f19699cm = cls.getMethod("getReason", null);
                if (i10 >= 36) {
                    wqx = f19700jd.getMethod("getStartComponent", null);
                }
                my = true;
            }
        } catch (Throwable th2) {
            nmd.wqx(th2.getMessage(), new Object[0]);
        }
    }

    public static JSONObject jpo() {
        JSONObject jSONObject;
        Method method;
        List list;
        Method method2;
        Method method3;
        int i10 = Build.VERSION.SDK_INT;
        JSONObject jSONObject2 = null;
        if (i10 >= 35 && wqx()) {
            jd();
            try {
                jSONObject = new JSONObject();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.sq.jpo().getSystemService(ActivityManager.class);
                if (activityManager != null && (method = jpo) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                    Object obj = list.get(0);
                    if (i10 >= 36 && obj != null && (method3 = wqx) != null) {
                        jSONObject.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                    }
                    if (obj != null && (method2 = f19699cm) != null) {
                        jSONObject.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                    }
                }
                return jSONObject;
            } catch (Throwable th3) {
                th = th3;
                jSONObject2 = jSONObject;
                nmd.wqx(th.getMessage(), new Object[0]);
                return jSONObject2;
            }
        }
        return jSONObject2;
    }

    private static boolean wqx() {
        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("s_i_e", 0) == 1;
    }
}
