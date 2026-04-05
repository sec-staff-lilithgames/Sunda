package com.bytedance.sdk.openadsdk.cm.my.jpo;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.cm.my.jd.au;
import com.bytedance.sdk.openadsdk.cm.my.jd.cm;
import com.bytedance.sdk.openadsdk.cm.my.jd.jd;
import com.bytedance.sdk.openadsdk.cm.my.jd.jj;
import com.bytedance.sdk.openadsdk.cm.my.jd.my;
import com.bytedance.sdk.openadsdk.cm.my.jd.oya;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.cm.my.jd.xyk;
import com.bytedance.sdk.openadsdk.cm.my.jd.yd;
import com.bytedance.sdk.openadsdk.cm.my.jd.zz;
import com.bytedance.sdk.openadsdk.cm.qk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo {
    private static final Map<com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo, prr> jpo = Collections.synchronizedMap(new WeakHashMap());

    public static void cm(com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, prr.jpo jpoVar2) throws JSONException {
        prr prrVar;
        if (jpoVar == null || jpoVar2 == null || (prrVar = jpo.get(jpoVar)) == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        long jJd = jpoVar2.jd();
        long jCm = jpoVar2.cm();
        jd jdVar = new jd();
        jdVar.jpo(jpoVar2.wqx());
        jdVar.jd(jCm);
        jdVar.jpo(jpoVar2.my());
        jdVar.jd(jpoVar2.jj());
        com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm), jdVar);
        jpoVar3.jpo(jpoVar2.ju());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jJd);
            jSONObject.put("percent", jpoVar2.qk());
            jpo(jpoVar3, "endcard_skip", jSONObject);
        } catch (JSONException e10) {
            nmd.jpo("TTAD.VideoEventManager", "", e10);
        }
        jpo.remove(jpoVar);
    }

    public static void my(com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, prr.jpo jpoVar2) throws JSONException {
        prr prrVar;
        if (jpoVar == null || jpoVar2 == null || jpoVar2.yd() <= 0 || (prrVar = jpo.get(jpoVar)) == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        long jCm = jpoVar2.cm();
        au auVar = new au();
        auVar.jpo(jpoVar2.wqx());
        auVar.jd(jCm);
        auVar.jpo(jpoVar2.yd());
        JSONObject jSONObjectJpo = jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm);
        int i10 = wqxVarCm.my;
        if (i10 > 0) {
            try {
                jSONObjectJpo.put("play_time", i10);
            } catch (JSONException e10) {
                nmd.jpo("TTAD.VideoEventManager", "", e10);
            }
        }
        com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jSONObjectJpo, auVar);
        jpoVar3.jpo(jpoVar2.ju());
        jpo(jpoVar3, "play_buffer");
    }

    public static void wqx(com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, prr.jpo jpoVar2) throws JSONException {
        prr prrVar;
        if (jpoVar == null || jpoVar2 == null || (prrVar = jpo.get(jpoVar)) == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        long jJd = jpoVar2.jd();
        long jCm = jpoVar2.cm();
        oya oyaVar = new oya(jpoVar2.au());
        oyaVar.jpo(jpoVar2.wqx());
        oyaVar.jd(jCm);
        JSONObject jSONObjectJpo = jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm);
        int i10 = wqxVarCm.my;
        if (i10 > 0) {
            try {
                jSONObjectJpo.put("play_time", i10);
            } catch (JSONException e10) {
                nmd.jpo("TTAD.VideoEventManager", "", e10);
            }
        }
        com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jSONObjectJpo, oyaVar);
        jpoVar3.jpo(jpoVar2.ju());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jJd);
            jSONObject.put("percent", jpoVar2.qk());
            jpo(jpoVar3, "play_error", jSONObject);
        } catch (JSONException e11) {
            nmd.jpo("TTAD.VideoEventManager", "", e11);
        }
    }

    public static void jd(com.bytedance.sdk.openadsdk.cm.my.jd.jpo<zz> jpoVar) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("load_video_cancel", jpoVar);
    }

    public static JSONObject jpo(dt dtVar, String str, int i10, wqx wqxVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i10 > 0) {
                jSONObject.put("play_type", String.valueOf(i10));
            }
            if (dtVar != null) {
                com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = dtVar.ww();
                if (jdVarWw != null) {
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, jdVarWw.zz());
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(jdVarWw.my()));
                    jSONObject.put("video_url", jdVarWw.ju());
                    jSONObject.put("player_type", wqxVar.opi());
                    jSONObject.put("video_encode_type", wqxVar.oya() ? 1 : 0);
                }
                if (wqxVar.jpo()) {
                    jSONObject.put("pag_json_data", new JSONObject(wqxVar.wqx().toString()).toString());
                }
                jSONObject.put(QFzuMMDfrzagDN.cAvJVJFtTKoJ, dtVar.tda());
            }
            return jSONObject;
        } catch (JSONException e10) {
            nmd.jpo("TTAD.VideoEventManager", "", e10);
            return jSONObject;
        }
    }

    public static void jd(com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, prr.jpo jpoVar2) throws JSONException {
        prr prrVar;
        if (jpoVar == null || jpoVar2 == null || (prrVar = jpo.get(jpoVar)) == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        long jJd = jpoVar2.jd();
        long jCm = jpoVar2.cm();
        if (jCm <= 0 || jJd <= 0) {
            return;
        }
        my myVar = new my();
        myVar.jpo(jpoVar2.wqx());
        myVar.jd(jCm);
        JSONObject jSONObjectJpo = jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm);
        int i10 = wqxVarCm.my;
        if (i10 > 0) {
            try {
                jSONObjectJpo.put("play_time", i10);
            } catch (JSONException e10) {
                nmd.jpo("TTAD.VideoEventManager", "", e10);
            }
        }
        com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jSONObjectJpo, myVar);
        jpoVar3.jpo(jpoVar2.ju());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jJd);
            jSONObject.put("percent", jpoVar2.qk());
            jpo(jpoVar3, "feed_continue", jSONObject);
        } catch (JSONException e11) {
            nmd.jpo("TTAD.VideoEventManager", "", e11);
        }
    }

    public static void jpo(com.bytedance.sdk.openadsdk.cm.my.jd.jpo<yd> jpoVar) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("load_video_error", jpoVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(1:8)(2:10|(10:12|14|29|15|(1:17)|20|23|(1:26)|27|28)(1:13))|9|14|29|15|(0)|20|23|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        com.bytedance.sdk.component.utils.nmd.jpo("TTAD.VideoEventManager", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: JSONException -> 0x004a, TryCatch #0 {JSONException -> 0x004a, blocks: (B:15:0x0040, B:17:0x0044, B:20:0x004d), top: B:29:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt r8, com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo r9, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx r10) throws org.json.JSONException {
        /*
            if (r8 == 0) goto L75
            if (r9 == 0) goto L75
            if (r10 != 0) goto L8
            goto L75
        L8:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.nq.jpo()
            boolean r0 = r10.nq()
            r7 = 1
            if (r0 == 0) goto L16
            r0 = 3
        L14:
            r4 = r0
            goto L28
        L16:
            int r0 = r8.ew()
            com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            boolean r0 = r0.jpo(r10)
            if (r0 == 0) goto L26
            r4 = r7
            goto L28
        L26:
            r0 = 2
            goto L14
        L28:
            com.bytedance.sdk.openadsdk.cm.my.jd.prr r0 = new com.bytedance.sdk.openadsdk.cm.my.jd.prr
            long r1 = android.os.SystemClock.elapsedRealtime()
            r6 = r8
            r5 = r10
            r0.<init>(r1, r3, r4, r5, r6)
            java.util.Map<com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo, com.bytedance.sdk.openadsdk.cm.my.jd.prr> r8 = com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo
            r8.put(r9, r0)
            org.json.JSONObject r8 = jpo(r6, r3, r4, r5)
            java.lang.String r9 = com.bytedance.sdk.openadsdk.utils.tic.jpo(r6)
            int r10 = r5.my     // Catch: org.json.JSONException -> L4a
            if (r10 <= 0) goto L4d
            java.lang.String r0 = "play_time"
            r8.put(r0, r10)     // Catch: org.json.JSONException -> L4a
            goto L4d
        L4a:
            r0 = move-exception
            r10 = r0
            goto L57
        L4d:
            java.lang.String r10 = "is_mute"
            boolean r0 = r5.ju()     // Catch: org.json.JSONException -> L4a
            r8.put(r10, r0)     // Catch: org.json.JSONException -> L4a
            goto L5e
        L57:
            java.lang.String r0 = "TTAD.VideoEventManager"
            java.lang.String r1 = ""
            com.bytedance.sdk.component.utils.nmd.jpo(r0, r1, r10)
        L5e:
            com.bytedance.sdk.openadsdk.cm.my.jd.jpo r10 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo
            r0 = 0
            r10.<init>(r6, r9, r8, r0)
            int r8 = r5.opi()
            r9 = -1
            if (r8 != r9) goto L6c
            goto L6d
        L6c:
            r7 = 0
        L6d:
            r10.jpo(r7)
            java.lang.String r8 = "play_start"
            jpo(r10, r8)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(com.bytedance.sdk.openadsdk.core.model.dt, com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String cm(wqx wqxVar) {
        return new File(wqxVar.my(), wqxVar.sq()).getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long wqx(wqx wqxVar) {
        if (wqxVar == null) {
            return 0L;
        }
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarHmu = wqxVar.oya() ? wqxVar.hmu() : wqxVar.dt();
        if (jdVarHmu != null) {
            return Double.valueOf(jdVarHmu.jj() * 1000.0d).longValue();
        }
        return 0L;
    }

    public static void jd(com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, prr.jpo jpoVar2, qk qkVar) throws JSONException {
        if (jpoVar == null || jpoVar2 == null) {
            return;
        }
        my(jpoVar, jpoVar2);
        prr prrVar = jpo.get(jpoVar);
        if (prrVar == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        long jJd = jpoVar2.jd();
        long jCm = jpoVar2.cm();
        jj jjVar = new jj();
        jjVar.jd(jpoVar2.wqx());
        jjVar.jpo(jCm);
        jjVar.jpo(jpoVar2.zz());
        JSONObject jSONObjectJpo = jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm);
        int i10 = wqxVarCm.my;
        if (i10 > 0) {
            try {
                jSONObjectJpo.put("play_time", i10);
            } catch (JSONException e10) {
                nmd.jpo("TTAD.VideoEventManager", "", e10);
            }
        }
        jpo(jpoVar2, dtVarMy, jSONObjectJpo);
        com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jSONObjectJpo, jjVar);
        jpoVar3.jpo(jpoVar2.ju());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jJd);
            jSONObject.put("percent", jpoVar2.qk());
            jpo(jpoVar3, "feed_over", jSONObject, qkVar);
        } catch (JSONException e11) {
            nmd.jpo("TTAD.VideoEventManager", "", e11);
        }
        jpo.remove(jpoVar);
    }

    public static void jpo(Context context, com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, prr.jpo jpoVar2, qk qkVar) throws JSONException {
        prr prrVar;
        if (context == null || jpoVar == null || jpoVar2 == null || (prrVar = jpo.get(jpoVar)) == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        if (!jpoVar2.ju()) {
            jpo(dtVarMy, wqxVarCm, jpoVar2);
        }
        xyk xykVar = new xyk();
        xykVar.jpo(jpoVar2.m437if() ? 1 : 0);
        xykVar.jd(CacheDirFactory.getICacheDir(dtVarMy.ew()).jd(wqxVarCm));
        xykVar.jpo(SystemClock.elapsedRealtime() - prrVar.jpo());
        JSONObject jSONObjectJpo = jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm);
        int i10 = wqxVarCm.my;
        if (i10 > 0) {
            try {
                jSONObjectJpo.put("play_time", i10);
            } catch (JSONException e10) {
                nmd.jpo("TTAD.VideoEventManager", "", e10);
            }
        }
        com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jSONObjectJpo, xykVar);
        jpoVar3.jpo(jpoVar2.ju());
        jpo(jpoVar3, "feed_play", qkVar);
    }

    public static void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, prr.jpo jpoVar2) throws JSONException {
        prr prrVar;
        if (jpoVar == null || jpoVar2 == null || (prrVar = jpo.get(jpoVar)) == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        long jJd = jpoVar2.jd();
        long jCm = jpoVar2.cm();
        if (jCm <= 0 || jJd <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.my.jd.qk qkVar = new com.bytedance.sdk.openadsdk.cm.my.jd.qk();
        qkVar.jpo(jpoVar2.wqx());
        qkVar.jd(jCm);
        JSONObject jSONObjectJpo = jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm);
        int i10 = wqxVarCm.my;
        if (i10 > 0) {
            try {
                jSONObjectJpo.put("play_time", i10);
            } catch (Throwable th2) {
                nmd.jpo("TTAD.VideoEventManager", "", th2);
            }
        }
        jpo(jpoVar2, dtVarMy, jSONObjectJpo);
        com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jSONObjectJpo, qkVar);
        jpoVar3.jpo(jpoVar2.ju());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jJd);
            jSONObject.put("percent", jpoVar2.qk());
            jpo(jpoVar3, "feed_pause", jSONObject);
        } catch (JSONException e10) {
            nmd.jpo("TTAD.VideoEventManager", "", e10);
        }
    }

    private static void jpo(prr.jpo jpoVar, dt dtVar, JSONObject jSONObject) {
        if (dtVar != null) {
            try {
                if (dtVar.fmg() != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("speed_type", dtVar.fmg().jd());
                    jSONObject2.put("speed", dtVar.fmg().jpo());
                    jSONObject2.put("speed_duration", jpoVar.jpo());
                    jSONObject.put("pag_json_data", jSONObject2.toString());
                }
            } catch (Throwable th2) {
                nmd.jpo("TTAD.VideoEventManager", "", th2);
            }
        }
    }

    public static void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, prr.jpo jpoVar2, qk qkVar) {
        if (jpoVar == null || jpoVar2 == null) {
            return;
        }
        my(jpoVar, jpoVar2);
        prr prrVar = jpo.get(jpoVar);
        if (prrVar == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        long jJd = jpoVar2.jd();
        long jCm = jpoVar2.cm();
        cm cmVar = new cm();
        cmVar.jd(jpoVar2.wqx());
        cmVar.jpo(jCm);
        cmVar.jpo(jpoVar2.xyk());
        cmVar.jd(jpoVar2.zz());
        JSONObject jSONObjectJpo = jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm);
        int i10 = wqxVarCm.my;
        if (i10 > 0) {
            try {
                jSONObjectJpo.put("play_time", i10);
            } catch (JSONException e10) {
                nmd.jpo("TTAD.VideoEventManager", "", e10);
            }
        }
        jpo(jpoVar2, dtVarMy, jSONObjectJpo);
        com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jSONObjectJpo, cmVar);
        jpoVar3.jpo(jpoVar2.ju());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jJd);
            jSONObject.put("percent", jpoVar2.qk());
            jpo(jpoVar3, "feed_break", jSONObject, qkVar);
        } catch (JSONException e11) {
            nmd.jpo("TTAD.VideoEventManager", "", e11);
        }
    }

    public static void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, boolean z10, String str) throws JSONException {
        prr prrVar;
        if (jpoVar == null || (prrVar = jpo.get(jpoVar)) == null) {
            return;
        }
        wqx wqxVarCm = prrVar.cm();
        dt dtVarMy = prrVar.my();
        if (wqxVarCm == null || dtVarMy == null) {
            return;
        }
        JSONObject jSONObjectJpo = jpo(dtVarMy, prrVar.jd(), prrVar.wqx(), wqxVarCm);
        try {
            int i10 = wqxVarCm.my;
            if (i10 > 0) {
                jSONObjectJpo.put("play_time", i10);
            }
            jSONObjectJpo.put("is_mute", z10 ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", str);
            jSONObjectJpo.put("pag_json_data", jSONObject);
        } catch (JSONException e10) {
            nmd.jpo("TTAD.VideoEventManager", "", e10);
        }
        jpo(new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVarMy, tic.jpo(dtVarMy), jSONObjectJpo, null), "mute_state_change");
    }

    private static void jpo(com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar, String str) {
        jpo(jpoVar, str, (JSONObject) null, (qk) null);
    }

    private static void jpo(com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar, String str, JSONObject jSONObject) {
        jpo(jpoVar, str, jSONObject, (qk) null);
    }

    private static void jpo(com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar, String str, qk qkVar) {
        jpo(jpoVar, str, (JSONObject) null, qkVar);
    }

    private static void jpo(final com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar, String str, final JSONObject jSONObject, final qk qkVar) {
        if (jpoVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jpoVar.my() && !TextUtils.isEmpty(jpoVar.jd())) {
            String strJd = jpoVar.jd();
            strJd.getClass();
            if (strJd.equals("stream") || strJd.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), jpoVar.jpo(), jpoVar.jd(), str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.1
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                qk qkVar2;
                try {
                    JSONObject jSONObjectWqx = jpoVar.wqx();
                    if (jpoVar.cm() != null) {
                        jpoVar.cm().jpo(jSONObjectWqx);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (qkVar2 = qkVar) != null) {
                        qkVar2.jpo(jSONObjectWqx);
                    }
                    return jSONObjectWqx;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    private static void jpo(final dt dtVar, final wqx wqxVar, final prr.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo();
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.2
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", jpo.wqx(wqxVar));
                jSONObject.put("player_duration", jpoVar.cm());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", wqxVar.hna());
                jSONObject.put("path", jpo.cm(wqxVar));
                jSONObject.put("player_type", wqxVar.opi());
                com.bytedance.sdk.openadsdk.prr.jpo.cm cmVarJpo = com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("pangle_video_play_state");
                dt dtVar2 = dtVar;
                return cmVarJpo.jpo(dtVar2 != null ? dtVar2.cxb() : 0).jd(jSONObject.toString());
            }
        });
    }
}
