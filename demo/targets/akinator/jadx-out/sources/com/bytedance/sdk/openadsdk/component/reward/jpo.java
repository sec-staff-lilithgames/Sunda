package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.sq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static void jpo(final dt dtVar, final boolean z10, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                dt dtVar2 = dtVar;
                if (dtVar2 == null || dtVar2.rf()) {
                    return;
                }
                try {
                    Context contextJpo = sq.jpo();
                    AdSlot adSlotGmx = dtVar.gmx();
                    if (adSlotGmx != null) {
                        int iJd = my.jd();
                        if (iJd == 0 || iJd == 2) {
                            if (z11) {
                                au.jpo(contextJpo).jpo(adSlotGmx.getCodeId(), dtVar);
                            } else {
                                my.jpo(contextJpo).jpo(adSlotGmx.getCodeId(), dtVar);
                            }
                        }
                        if (z10) {
                            if (z11) {
                                au.jpo(contextJpo).jpo(adSlotGmx);
                            } else {
                                my.jpo(contextJpo).jpo(adSlotGmx);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean jpo(final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.activity.jd jdVarXk;
        int iPdm = 0;
        if (jpoVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = jpoVar.ux;
        if (xykVar == null || xykVar.xk() == null) {
            jdVarXk = null;
        } else {
            jdVarXk = jpoVar.ux.xk();
            if (jdVarXk != null) {
                iPdm = jdVarXk.pdm();
            }
        }
        boolean zJpo = duq.jpo(jpoVar.vrc, jpoVar.f19914jd, jpoVar.my, jpoVar.f19905cm ? 7 : 5, iPdm);
        if (zJpo) {
            if (jpoVar.f19914jd != null) {
                pdm.jpo().jpo(jpoVar.f19914jd, new pdm.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.2
                    @Override // com.bytedance.sdk.openadsdk.core.pdm.jpo
                    public void jpo() {
                        com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar;
                        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = jpoVar;
                        if (jpoVar2 == null || (jdVar = jpoVar2.roc) == null) {
                            return;
                        }
                        jdVar.et();
                    }
                });
            }
            if (jdVarXk != null && jdVarXk.tu()) {
                jdVarXk.nq();
            }
        }
        return zJpo;
    }
}
