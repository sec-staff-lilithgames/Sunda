package com.bytedance.sdk.openadsdk.cm.jpo;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jj {
    public static AtomicInteger jpo = new AtomicInteger(0);

    /* renamed from: jd, reason: collision with root package name */
    public static AtomicInteger f19549jd = new AtomicInteger(0);
    public static AtomicInteger wqx = new AtomicInteger(0);

    /* renamed from: cm, reason: collision with root package name */
    public static AtomicInteger f19548cm = new AtomicInteger(0);
    public static AtomicInteger my = new AtomicInteger(0);

    /* renamed from: jj, reason: collision with root package name */
    public static AtomicInteger f19550jj = new AtomicInteger(0);

    /* renamed from: qk, reason: collision with root package name */
    public static AtomicInteger f19551qk = new AtomicInteger(0);
    public static AtomicInteger xyk = new AtomicInteger(0);
    public static AtomicInteger zz = new AtomicInteger(0);

    public static JSONObject cm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", jpo.get());
            jSONObject.put("load_success", f19549jd.get());
            jSONObject.put("load_fail", wqx.get());
            jSONObject.put("load_fail_in_background", zz.get());
            jSONObject.put("load_success_and_parse_success", f19548cm.get());
            jSONObject.put("load_success_and_parse_fail", my.get());
            jSONObject.put("load_success_and_no_ad", f19550jj.get());
            jSONObject.put("load_fail_by_no_net", f19551qk.get());
            jSONObject.put("load_fail_by_io", xyk.get());
            jSONObject.put("load_get_ad_version", BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void jd() {
        try {
            com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void jpo() {
        try {
            long jJpo = com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (jJpo > 0 && System.currentTimeMillis() - jJpo >= 86400000) {
                jd();
                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (jJpo <= 0 || jJpo > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int iOptInt = jSONObject.optInt("load_get_ad_version", 0);
            if (iOptInt >= 5702 && (iOptInt < 5800 || iOptInt >= 5802)) {
                jpo.addAndGet(jSONObject.optInt("load_times"));
                f19549jd.addAndGet(jSONObject.optInt("load_success"));
                wqx.addAndGet(jSONObject.optInt("load_fail"));
                f19548cm.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                my.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                f19550jj.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                f19551qk.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                xyk.addAndGet(jSONObject.optInt(duhsDlGWdBkekB.vHfs));
                zz.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void my() {
        try {
            if (DeviceUtils.jd()) {
                return;
            }
            zz.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void wqx() {
        try {
            com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("tt_sdk_event_get_ad", "get_ad_event_key", cm().toString());
        } catch (Throwable unused) {
        }
    }

    public static void jpo(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
            com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
