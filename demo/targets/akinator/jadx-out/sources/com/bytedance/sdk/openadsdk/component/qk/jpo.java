package com.bytedance.sdk.openadsdk.component.qk;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.qk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.multipro.jd;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import j1.o2;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo {
    public static AtomicInteger jpo = new AtomicInteger(1);

    public static File jd(String str) {
        return jpo(sq.jpo(), jj.jpo(sq.jpo()).jd(), str);
    }

    public static File jpo(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CacheDirFactory.getICacheDir(0).jd());
        return new File(o2.o(sb2, File.separator, str));
    }

    public static int wqx() {
        return jpo.getAndIncrement();
    }

    public static long jd() {
        return SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
    }

    public static File jpo(Context context, String str, String str2) {
        return qk.jpo(context, jd.wqx(), str, str2);
    }

    public static void jpo(File file) {
        if (file == null) {
            return;
        }
        try {
            qk.jd(file);
        } catch (Throwable unused) {
        }
    }

    public static void jpo(Context context) {
        try {
            jj.jpo(context).jpo();
        } catch (Throwable unused) {
        }
    }

    public static String jpo() {
        return qk.jpo(sq.jpo(), jd.wqx(), jj.jpo(sq.jpo()).jd()).getAbsolutePath();
    }

    public static void jpo(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        try {
            String strXyk = zz.jd().xyk();
            int iZz = zz.jd().zz();
            JSONObject jSONObject2 = jSONObject.getJSONObject(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(duhsDlGWdBkekB.YQKBuYMxIywFuVu, strXyk);
            if (!z10) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iZz)));
            } else if (zz.jd().zz() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", sq.cm().tu(String.valueOf(i10)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e10) {
            nmd.wqx("TTAppOpenUtils", e10.getMessage());
        }
    }

    public static int jpo(dt dtVar, int i10) {
        return i10 - dtVar.kfv();
    }
}
