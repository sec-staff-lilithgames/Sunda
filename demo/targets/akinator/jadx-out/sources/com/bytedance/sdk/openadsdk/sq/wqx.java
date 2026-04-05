package com.bytedance.sdk.openadsdk.sq;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.amazon.device.ads.DTBMetricReport;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.xyk;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.sq;
import com.ironsource.mediationsdk.metadata.a;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private static volatile Handler f21488cm;

    /* renamed from: jd, reason: collision with root package name */
    private static Boolean f21489jd;
    private static volatile jpo jpo;
    private static volatile HandlerThread wqx = xyk.jpo("pag__bus_monitor", 0);

    public static void jd(cm cmVar) {
        jpo().jpo(new my(cmVar, 0, 1, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler my() {
        if (wqx == null || !wqx.isAlive()) {
            synchronized (oya.class) {
                try {
                    if (wqx == null || !wqx.isAlive()) {
                        wqx = xyk.jpo("csj_init_handle", -1);
                        f21488cm = new Handler(wqx.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (f21488cm == null) {
            synchronized (oya.class) {
                try {
                    if (f21488cm == null) {
                        f21488cm = new Handler(wqx.getLooper());
                    }
                } finally {
                }
            }
        }
        return f21488cm;
    }

    public static void jd() {
        jpo().jpo(true);
    }

    public static jpo jpo() {
        if (jpo == null) {
            synchronized (wqx.class) {
                try {
                    if (jpo == null) {
                        jpo = jpo.jpo(new jd() { // from class: com.bytedance.sdk.openadsdk.sq.wqx.1
                            @Override // com.bytedance.sdk.openadsdk.sq.jd
                            public Context getContext() {
                                return sq.jpo();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sq.jd
                            public Handler getHandler() {
                                return wqx.my();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sq.jd
                            public int getOnceLogCount() {
                                int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("bus_monitor_config", "once_count", 10);
                                if (iJpo > 100 || iJpo < 5) {
                                    return 10;
                                }
                                return iJpo;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sq.jd
                            public int getOnceLogInterval() {
                                int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("bus_monitor_config", "once_interval", 10000);
                                if (iJpo < 10000) {
                                    return 10000;
                                }
                                return iJpo;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sq.jd
                            public HandlerThread getSafeHandlerThread(String str, int i10) {
                                return xyk.jpo(str, i10);
                            }

                            @Override // com.bytedance.sdk.openadsdk.sq.jd
                            public int getUploadIntervalTime() {
                                int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("bus_monitor_config", "interval", 86400000);
                                if (iJpo < 3600000) {
                                    return 86400000;
                                }
                                return iJpo;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sq.jd
                            public boolean isMonitorOpen() {
                                if (wqx.f21489jd != null) {
                                    return wqx.f21489jd.booleanValue();
                                }
                                Boolean unused = wqx.f21489jd = Boolean.valueOf(com.bytedance.sdk.openadsdk.rq.jpo.jpo("bus_monitor_config", a.f37604j, 1) == 1);
                                return wqx.f21489jd.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sq.jd
                            public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.sq.jd.jpo> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar : list) {
                                    com.bytedance.sdk.openadsdk.prr.wqx.jpo();
                                    com.bytedance.sdk.openadsdk.prr.wqx.jpo("bus_monitor", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.sq.wqx.1.1
                                        @Override // com.bytedance.sdk.openadsdk.prr.jd
                                        public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", jpoVar.jd());
                                                jSONObject.put("scene", jpoVar.wqx());
                                                jSONObject.put("start_count", jpoVar.cm());
                                                jSONObject.put("success_count", jpoVar.my());
                                                jSONObject.put("fail_count", jpoVar.jj());
                                                jSONObject.put("rit", jpoVar.qk());
                                                jSONObject.put("tag", jpoVar.xyk());
                                                jSONObject.put("label", jpoVar.zz());
                                                jSONObject.put(DTBMetricReport.ADSERVER, jpoVar.ju());
                                                jSONObject.put("is_init", jpoVar.m492if());
                                                jSONObject.put("extra", jpoVar.au());
                                                jSONObject.put("date_device", jpoVar.yd());
                                                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("bus_monitor").jd(jSONObject.toString());
                                            } catch (Exception e10) {
                                                nmd.jpo("BusMonitorUtils", "onMonitorUpload: ", e10);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public static void wqx(cm cmVar) {
        jpo().jpo(new my(cmVar, 0, 0, 1));
    }

    public static void jpo(cm cmVar) {
        jpo().jpo(new my(cmVar, 1, 0, 0));
    }
}
