package com.bytedance.sdk.openadsdk.component.cm;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.sz;
import com.bytedance.sdk.openadsdk.prr.jd;
import com.bytedance.sdk.openadsdk.prr.jpo.cm;
import com.bytedance.sdk.openadsdk.utils.dm;
import com.ironsource.C3352n2;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import io.ktor.http.ContentDisposition;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo {
    public static void jd(dt dtVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", dt.my(dtVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e10) {
            nmd.jpo("TTAppOpenAdReport", "reportCacheLoss json error", e10);
        }
        wqx.wqx(dtVar, "cache_loss", jSONObject);
    }

    public static void jpo(final int i10, final int i11) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("openad_load_ad_timeout", false, new jd() { // from class: com.bytedance.sdk.openadsdk.component.cm.jpo.1
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i10);
                jSONObject.put("user_timeout_time", i11);
                return cm.jd().jpo("openad_load_ad_timeout").jd(jSONObject.toString());
            }
        });
    }

    public static void jpo(dt dtVar, int i10, int i11, float f10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jpo(jSONObject, dtVar);
            jSONObject.put("openad_creative_type", dt.my(dtVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f10);
            wqx.jpo(jSONObject, i11, i10);
        } catch (JSONException e10) {
            nmd.jpo("TTAppOpenAdReport", "reportSkip json error", e10);
        }
        wqx.jpo(dtVar, "skip", i10, jSONObject);
    }

    public static void jd(dt dtVar, long j10, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ContentDisposition.Parameters.Size, dtVar.ww().my());
            jSONObject.put("video_duration", dtVar.ww().jj());
            jSONObject.put(C3352n2.f37927u, z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        wqx.jpo(dtVar, "download_video_duration", j10, jSONObject);
    }

    public static void jpo(dt dtVar, long j10, float f10, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jpo(jSONObject, dtVar);
            jSONObject.put(QGjYBESwAiCc.ZfoRHKEFDAhqzr, dt.my(dtVar) ? "video_normal_ad" : "image_normal_ad");
            if (z10) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put(QFzuMMDfrzagDN.ftY, (int) (((j10 * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e10) {
            nmd.jpo("TTAppOpenAdReport", "reportDestroy json error", e10);
        }
        wqx.wqx(dtVar, "destroy", jSONObject);
    }

    public static void jpo(dt dtVar) {
        wqx.wqx(dtVar, "cache_expire", (JSONObject) null);
    }

    public static void jpo(dt dtVar, long j10, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C3352n2.f37927u, z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        wqx.jpo(dtVar, "download_image_duration", j10, jSONObject);
    }

    public static void jpo(dt dtVar, int i10, sz szVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long jJj = 0;
        try {
            jSONObject.put("openad_creative_type", dt.my(dtVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i10);
            if (szVar != null) {
                szVar.jd(dm.jd());
                jpo(jSONObject, dtVar);
                jSONObject.put("client_start_time", szVar.jd());
                jSONObject.put("sever_time", szVar.cm());
                jSONObject.put("network_time", szVar.wqx());
                jSONObject.put("client_end_time", szVar.my());
                jSONObject.put("download_resource_duration", szVar.qk());
                jSONObject.put("resource_source", szVar.xyk());
                jSONObject.put("is_bidding", szVar.jpo ? 1 : 0);
                if (szVar.jpo) {
                    jSONObject.put("load_wait_time", szVar.f20791jd);
                }
                jJj = szVar.jj();
            }
        } catch (JSONException e10) {
            nmd.jpo("TTAppOpenAdReport", "reportLoadNetDuration json error", e10);
        }
        wqx.jpo(dtVar, "load_net_duration", jJj, jSONObject);
    }

    public static void jpo(dt dtVar, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jpo(jSONObject, dtVar);
            jSONObject.put("openad_creative_type", dt.my(dtVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            nmd.wqx("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        wqx.jpo(dtVar, "load_cache_duration", j10, jSONObject);
    }

    public static void jpo(final sz szVar, final int i10, final int i11) {
        if (szVar != null) {
            com.bytedance.sdk.openadsdk.prr.wqx.jpo("app_running_time", false, new jd() { // from class: com.bytedance.sdk.openadsdk.component.cm.jpo.2
                @Override // com.bytedance.sdk.openadsdk.prr.jd
                public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_running_time", szVar.zz());
                    jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.qk.jpo.jd());
                    jSONObject.put("load_time", szVar.jpo().cm());
                    jSONObject.put("load_index", szVar.yd());
                    jSONObject.put("load_from", i10);
                    jSONObject.put("load_result", i11);
                    return cm.jd().jpo("app_running_time").jd(jSONObject.toString());
                }
            });
        }
    }

    public static void jpo(JSONObject jSONObject, int i10) {
        if (jSONObject == null || i10 != 3) {
            return;
        }
        try {
            jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.qk.jpo.jd());
        } catch (JSONException e10) {
            nmd.wqx("TTAppOpenAdReport", e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void jpo(org.json.JSONObject r1, com.bytedance.sdk.openadsdk.core.model.dt r2) throws org.json.JSONException {
        /*
            java.lang.String r0 = "is_icon_only"
            if (r2 == 0) goto Lc
            boolean r2 = r2.se()     // Catch: org.json.JSONException -> L11
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.String r2 = "TTAppOpenAdReport"
            java.lang.String r1 = r1.getMessage()
            com.bytedance.sdk.component.utils.nmd.wqx(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.model.dt):void");
    }
}
