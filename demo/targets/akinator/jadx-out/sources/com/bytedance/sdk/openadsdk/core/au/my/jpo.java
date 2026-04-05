package com.bytedance.sdk.openadsdk.core.au.my;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo;
import com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx;
import com.bytedance.sdk.component.jd.jpo.qk;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.cm.my.jd.Cif;
import com.bytedance.sdk.openadsdk.cm.my.jd.ju;
import com.bytedance.sdk.openadsdk.cm.my.jd.yd;
import com.bytedance.sdk.openadsdk.cm.my.jd.zz;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static final com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo jpo = new com.bykv.vk.openvk.jpo.jpo.jd.jpo.jd.jpo();

    private static void jd(wqx wqxVar, dt dtVar, AdSlot adSlot) {
        if (jpo(wqxVar)) {
            com.bytedance.sdk.openadsdk.prr.wqx.jpo("load_video_start", new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVar, tic.wqx(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(dtVar, (String) null, -1, wqxVar), new ju(wqxVar.hna(), wqxVar.au() ? wqxVar.m376if() : wqxVar.jj())));
        }
    }

    private static boolean jpo(wqx wqxVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wqx(wqx wqxVar, dt dtVar, AdSlot adSlot) {
        if (jpo(wqxVar)) {
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jd((com.bytedance.sdk.openadsdk.cm.my.jd.jpo<zz>) new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVar, tic.wqx(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(dtVar, (String) null, -1, wqxVar), new zz(wqxVar.hna(), wqxVar.jj())));
        }
    }

    public static void jpo(final wqx wqxVar, final jpo.InterfaceC0054jpo interfaceC0054jpo) {
        dt dtVar;
        AdSlot adSlot;
        if ((wqxVar.jj() > 0 || wqxVar.au()) && wqxVar.opi() != -2) {
            if (wqxVar.opi() != 1) {
                wqxVar.my(6000);
                wqxVar.jj(6000);
                wqxVar.qk(6000);
                boolean z10 = wqxVar.my("material_meta") != null && (wqxVar.my("material_meta") instanceof dt);
                boolean z11 = wqxVar.my("ad_slot") != null && (wqxVar.my("ad_slot") instanceof AdSlot);
                if (z10 && z11) {
                    dt dtVar2 = (dt) wqxVar.my("material_meta");
                    AdSlot adSlot2 = (AdSlot) wqxVar.my("ad_slot");
                    jd(wqxVar, dtVar2, adSlot2);
                    dtVar = dtVar2;
                    adSlot = adSlot2;
                } else {
                    dtVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final dt dtVar3 = dtVar;
                final jpo.InterfaceC0054jpo interfaceC0054jpo2 = new jpo.InterfaceC0054jpo() { // from class: com.bytedance.sdk.openadsdk.core.au.my.jpo.1
                    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                    public void jd(wqx wqxVar2, int i10) {
                        AdSlot adSlot4;
                        jpo.InterfaceC0054jpo interfaceC0054jpo3 = interfaceC0054jpo;
                        if (interfaceC0054jpo3 != null) {
                            interfaceC0054jpo3.jpo(wqxVar2, i10);
                        }
                        dt dtVar4 = dtVar3;
                        if (dtVar4 != null && (adSlot4 = adSlot3) != null) {
                            jpo.wqx(wqxVar, dtVar4, adSlot4);
                        }
                        wqxVar.sq();
                    }

                    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                    public void jpo(wqx wqxVar2, int i10) throws JSONException {
                        jpo.InterfaceC0054jpo interfaceC0054jpo3 = interfaceC0054jpo;
                        if (interfaceC0054jpo3 != null) {
                            interfaceC0054jpo3.jpo(wqxVar2, i10);
                        }
                        if (dtVar3 == null || adSlot3 == null) {
                            return;
                        }
                        jpo.jd(wqxVar, dtVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                    public void jpo(wqx wqxVar2, int i10, String str) throws JSONException {
                        jpo.InterfaceC0054jpo interfaceC0054jpo3 = interfaceC0054jpo;
                        if (interfaceC0054jpo3 != null) {
                            interfaceC0054jpo3.jpo(wqxVar2, i10, str);
                        }
                        if (dtVar3 == null || adSlot3 == null) {
                            return;
                        }
                        jpo.jd(wqxVar, dtVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i10, str);
                    }
                };
                if (!jpo(wqxVar.hna())) {
                    if (interfaceC0054jpo != null) {
                        interfaceC0054jpo.jpo(wqxVar, 404, "unexpected url: " + wqxVar.hna());
                    }
                    jd(wqxVar, dtVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                xyk xykVar = new xyk("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.au.my.jpo.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            jpo.jpo.jpo(sq.jpo(), wqxVar, interfaceC0054jpo2);
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                    }
                };
                if (duq.jj()) {
                    duq.jd(xykVar);
                    return;
                } else {
                    xykVar.run();
                    return;
                }
            }
        }
        if (interfaceC0054jpo != null) {
            interfaceC0054jpo.jpo(wqxVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(wqx wqxVar, dt dtVar, AdSlot adSlot, long j10, int i10, String str) throws JSONException {
        if (jpo(wqxVar)) {
            String strWqx = tic.wqx(adSlot.getDurationSlotType());
            JSONObject jSONObjectJpo = com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(dtVar, (String) null, -1, wqxVar);
            yd ydVar = new yd();
            ydVar.jpo(wqxVar.hna());
            ydVar.jpo(wqxVar.jj());
            ydVar.jd(j10);
            ydVar.jpo(i10);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            ydVar.jd(str);
            ydVar.wqx("");
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo((com.bytedance.sdk.openadsdk.cm.my.jd.jpo<yd>) new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVar, strWqx, jSONObjectJpo, ydVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(wqx wqxVar, dt dtVar, AdSlot adSlot, long j10) throws JSONException {
        if (jpo(wqxVar)) {
            String strWqx = tic.wqx(adSlot.getDurationSlotType());
            JSONObject jSONObjectJpo = com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(dtVar, (String) null, -1, wqxVar);
            Cif cif = new Cif();
            cif.jpo(wqxVar.hna());
            cif.jpo(wqxVar.jj());
            cif.jd(j10);
            if (wqxVar.tu() == 1) {
                cif.wqx(1L);
            } else {
                cif.wqx(0L);
            }
            com.bytedance.sdk.openadsdk.prr.wqx.jpo("load_video_success", new com.bytedance.sdk.openadsdk.cm.my.jd.jpo(dtVar, strWqx, jSONObjectJpo, cif));
        }
    }

    public static boolean jpo(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        return qk.wqx(str2) != null;
    }
}
