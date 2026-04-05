package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Cif;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr implements com.bytedance.sdk.openadsdk.oem.jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.component.reward.jpo.jpo f21585jd;
    private static final prr jpo = new prr();
    private static boolean wqx;

    public static void jd() {
        wqx = true;
    }

    public static void jpo(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.core.model.pdm pdmVarZwh = jpoVar.f19914jd.zwh();
        if (pdmVarZwh == null || !pdmVarZwh.qk()) {
            return;
        }
        f21585jd = jpoVar;
        IPMiBroadcastReceiver iPMiBroadcastReceiverJpo = IPMiBroadcastReceiver.jpo(jpoVar.f19920pe);
        if (iPMiBroadcastReceiverJpo != null) {
            iPMiBroadcastReceiverJpo.jpo(jpo);
        }
    }

    public static void jpo() {
        if (f21585jd == null) {
            return;
        }
        f21585jd = null;
        IPMiBroadcastReceiver iPMiBroadcastReceiverJpo = IPMiBroadcastReceiver.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo());
        if (iPMiBroadcastReceiverJpo != null) {
            iPMiBroadcastReceiverJpo.jpo();
        }
        wqx = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.jpo
    public void jpo(String str, final int i10) {
        com.bytedance.sdk.openadsdk.core.model.jj jjVarXur;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = f21585jd;
        if (jpoVar == null || (jjVarXur = jpoVar.f19914jd.xur()) == null) {
            return;
        }
        String strWqx = jjVarXur.wqx();
        if (TextUtils.isEmpty(strWqx) || !strWqx.equals(str)) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.prr.1
            @Override // java.lang.Runnable
            public void run() {
                int i11;
                if (prr.f21585jd == null || (i11 = i10) <= 0 || i11 > 5) {
                    return;
                }
                boolean z10 = true;
                boolean z11 = i11 == 1;
                if (prr.wqx) {
                    prr.f21585jd.roc.et();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo("click", prr.f21585jd.f19914jd, new Cif.jpo().jpo(), prr.f21585jd.my, true, (Map<String, Object>) map, 1);
                } else {
                    z10 = z11;
                }
                if (z10) {
                    prr.jpo();
                }
            }
        });
    }
}
