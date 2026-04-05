package com.bytedance.sdk.openadsdk.prr;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.prr.jpo.cm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.C3191e4;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    private static volatile wqx jpo;

    private wqx() {
    }

    public static void cm() {
        jpo("disk_log", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.10
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j10 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long jJpo = wqx.jpo(file2);
                        j10 += jJpo;
                        jSONObject.put(file2.getName(), jJpo);
                    }
                }
                if (j10 < 524288000) {
                    return null;
                }
                return cm.jd().jpo("disk_log").jd(jSONObject.toString());
            }
        });
    }

    public static void jd(final dt dtVar) {
        if (tic.jpo(dtVar) == null || TextUtils.isEmpty(dtVar.afh())) {
            return;
        }
        jpo("download_gecko_start", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.17
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", dtVar.iwg());
                jSONObject.put("channel_name", dtVar.afh());
                return cm.jd().jpo("download_gecko_start").jpo(dtVar.jp()).jd(jSONObject.toString());
            }
        });
    }

    public static wqx jpo() {
        if (jpo == null) {
            synchronized (wqx.class) {
                try {
                    if (jpo == null) {
                        jpo = new wqx();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    private boolean wqx(cm cmVar) {
        return cmVar == null;
    }

    public void wqx() {
        jpo("blind_mode_status", true, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.8
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                return cm.jd().jpo("blind_mode_status");
            }
        });
    }

    public void jd(final cm cmVar) {
        if (wqx(cmVar)) {
            return;
        }
        cmVar.jpo("show_backup_endcard");
        sq.my().jpo(new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.20
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                return cmVar;
            }
        });
    }

    public static void jd() {
        duq.wqx(new xyk("showFailLog") { // from class: com.bytedance.sdk.openadsdk.prr.wqx.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    wqx.jpo().jpo("show_fail_log", new JSONObject());
                } catch (Throwable th2) {
                    nmd.wqx("StatsLogManager", th2.getMessage());
                }
            }
        });
    }

    public static void jpo(final dt dtVar) {
        if (dtVar == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        jpo("bidding_receive", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.1
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", jCurrentTimeMillis);
                if (dtVar.jp() == 3) {
                    jSONObject.put("is_icon_only", dtVar.se() ? 1 : 0);
                }
                return cm.jd().jpo("bidding_receive").jd(jSONObject.toString());
            }
        });
    }

    public static void jd(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final cm cmVarJd = cm.jd().jpo(str).jd(str2);
                sq.my().jpo(new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.12
                    @Override // com.bytedance.sdk.openadsdk.prr.jd
                    public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                        return cmVarJd;
                    }
                }, false);
            }
        } catch (Throwable th2) {
            nmd.wqx("StatsLogManager", th2.getMessage());
        }
    }

    public static void jpo(dt dtVar, final long j10) {
        if (dtVar == null) {
            return;
        }
        jpo("bidding_load", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.11
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                return cm.jd().jpo("bidding_load").jd(jSONObject.toString());
            }
        });
    }

    public static void jpo(final String str, final com.bytedance.sdk.openadsdk.cm.my.jd.jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        jpo(str, false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.16
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObjectWqx = jpoVar.wqx();
                if (jSONObjectWqx == null) {
                    jSONObjectWqx = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.cm.my.jd.wqx wqxVarCm = jpoVar.cm();
                if (wqxVarCm != null) {
                    wqxVarCm.jpo(jSONObjectWqx);
                }
                return cm.jd().jpo(str).jpo(jpoVar.jpo().jp()).jd(jSONObjectWqx.toString());
            }
        });
    }

    public static void jpo(final dt dtVar, final JSONObject jSONObject) {
        if (tic.jpo(dtVar) == null || TextUtils.isEmpty(dtVar.afh())) {
            return;
        }
        jpo("download_gecko_end", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.18
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", dtVar.iwg());
                jSONObject2.put("channel_name", dtVar.afh());
                jSONObject2.put("data", jSONObject);
                return cm.jd().jpo("download_gecko_end").jpo(dtVar.jp()).jd(jSONObject2.toString());
            }
        });
    }

    public void jpo(final cm cmVar) {
        if (wqx(cmVar)) {
            return;
        }
        cmVar.jpo("express_ad_render");
        sq.my().jpo(new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.19
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                return cmVar;
            }
        });
    }

    public void jpo(final String str) {
        jpo("click_playable_test_tool", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.2
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return cm.jd().jpo("click_playable_test_tool").jd(jSONObject.toString());
            }
        });
    }

    public void jpo(final String str, final int i10, final String str2) {
        jpo("use_playable_test_tool_error", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.3
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return cm.jd().jpo("use_playable_test_tool_error").jd(jSONObject.toString());
            }
        });
    }

    public void jpo(final long j10, final long j11) {
        final long j12 = j11 - j10;
        jpo("general_label", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.4
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                int i10 = !oya.f20821jd.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j10);
                    jSONObject.put("endtime", j11);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                return cm.jd().jpo("general_label").xyk(String.valueOf(j12)).jd(jSONObject.toString());
            }
        });
    }

    public void jpo(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        jpo(str, false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.6
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                return cm.jd().jpo(str).jd(jSONObject.toString());
            }
        });
    }

    public void jpo(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        jpo(str, false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.7
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                return cm.jd().jpo(str).jd(str2);
            }
        });
    }

    public void jpo(final JSONObject jSONObject) {
        if (jSONObject == null) {
            nmd.jpo("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object objOpt = jSONObject.opt("device_ad_mediation_platform");
        if (!(objOpt instanceof String) || TextUtils.isEmpty((String) objOpt)) {
            nmd.jpo("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            nmd.jpo("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            jpo("ad_revenue", true, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.9
                @Override // com.bytedance.sdk.openadsdk.prr.jd
                public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                    try {
                        jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                        jSONObject.put("uuid", Cif.wqx(sq.jpo()));
                        String strJpo = "";
                        try {
                            if (Cif.jpo(sq.jpo()) != null) {
                                strJpo = Cif.jpo(sq.jpo());
                            }
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                        jSONObject.put("device_id", strJpo);
                        jSONObject.put(Q6.H, "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th3) {
                        th3.getMessage();
                    }
                    return cm.jd().jpo("ad_revenue").jd(jSONObject.toString());
                }
            });
        }
    }

    public static long jpo(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long jJpo = 0;
        for (File file2 : file.listFiles()) {
            jJpo += jpo(file2);
        }
        return jJpo;
    }

    public static void jpo(String str, boolean z10, jd jdVar) {
        jpo(str, z10, 100, jdVar);
    }

    public static void jpo(String str, boolean z10, int i10, jd jdVar) {
        int iJpo = au.jrx().jpo(str, i10);
        if (TextUtils.isEmpty(str) || iJpo == 0 || jdVar == null) {
            return;
        }
        boolean z11 = iJpo == 100;
        if (!z11) {
            z11 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= iJpo;
        }
        if (z11) {
            sq.my().jpo(jdVar, z10);
        }
    }

    public static void jpo(long j10, long j11, final String str, final int i10) {
        if (j10 == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final long j12 = jElapsedRealtime - j10;
        final long j13 = jElapsedRealtime - j11;
        final long j14 = j11 - j10;
        jpo("ad_show_cost_time", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.13
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j12);
                jSONObject.put("renderDuration", j13);
                jSONObject.put("showToRenderDuration", j14);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i10);
                return cm.jd().jpo("ad_show_cost_time").jd(jSONObject.toString());
            }
        });
    }

    public static void jpo(int i10, String str) {
        jpo(i10, str, 0, (String) null);
    }

    public static void jpo(final int i10, final String str, final int i11, final String str2) {
        jpo("ipv6_req", false, (jd) new jd<com.bytedance.sdk.openadsdk.prr.jpo.wqx>() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.14
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = C3191e4.f.f36439e;
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return cm.jd().jpo("ipv6_req").jd(jSONObject.toString());
            }
        });
    }

    public static void jpo(final String str, final boolean z10) {
        jpo("img_error_param", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.wqx.15
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                } catch (Throwable unused) {
                }
                return cm.jd().jpo("img_error_param").jd(jSONObject.toString());
            }
        });
    }
}
