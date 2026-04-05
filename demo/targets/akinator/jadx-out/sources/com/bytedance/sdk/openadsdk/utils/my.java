package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: jd, reason: collision with root package name */
    private static long f21584jd;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.dt> jpo;
    private static boolean wqx;

    private static void jd(final long j10) {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.dt> weakReference = jpo;
        if (weakReference == null || j10 <= 0 || (dtVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, dtVar.my(), "store_duration", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.utils.my.1
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        jpo = null;
        wqx = false;
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        com.bytedance.sdk.openadsdk.core.model.jj jjVarXur = dtVar.xur();
        if (jjVarXur == null || TextUtils.isEmpty(jjVarXur.jpo())) {
            return;
        }
        jpo = new WeakReference<>(dtVar);
    }

    public static boolean wqx() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.dt> weakReference = jpo;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        wqx = true;
        return true;
    }

    public static void jpo(long j10) {
        jd(j10);
    }

    public static void jd() {
        if (jpo == null || wqx) {
            return;
        }
        f21584jd = SystemClock.elapsedRealtime();
    }

    public static void jpo() {
        if (jpo == null || wqx) {
            return;
        }
        if (f21584jd > 0) {
            jd(SystemClock.elapsedRealtime() - f21584jd);
        }
        jpo = null;
        f21584jd = 0L;
    }
}
