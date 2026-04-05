package com.bytedance.sdk.openadsdk.component.jd;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.hx;
import com.bytedance.sdk.openadsdk.core.model.wqx;
import com.bytedance.sdk.openadsdk.core.nmd;
import com.bytedance.sdk.openadsdk.core.rq;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.core.xyk;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.dm;
import com.bytedance.sdk.openadsdk.utils.jd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private static volatile jpo jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final tu f19763jd = sq.wqx();

    private jpo() {
    }

    public static jpo jpo() {
        if (jpo == null) {
            synchronized (jpo.class) {
                try {
                    if (jpo == null) {
                        jpo = new jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public void jpo(final Context context, final AdSlot adSlot, final jj jjVar) {
        final dm dmVarJd = dm.jd();
        if (jd.jpo()) {
            this.f19763jd.jpo(adSlot, new hx(), 5, (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.component.jd.jpo.1
                @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(int i10, String str) {
                    jjVar.onError(i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, wqx wqxVar) {
                    jpo.this.jpo(jpoVar, wqxVar, context, adSlot, jjVar, dmVarJd);
                }
            });
        } else {
            this.f19763jd.jpo(adSlot, new hx(), 5, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.component.jd.jpo.2
                @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(int i10, String str) {
                    jjVar.onError(i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, wqx wqxVar) {
                    jpo.this.jpo(jpoVar, wqxVar, context, adSlot, jjVar, dmVarJd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, wqx wqxVar, Context context, AdSlot adSlot, jj jjVar, dm dmVar) {
        if (jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
            List<dt> listCm = jpoVar.cm();
            ArrayList arrayList = new ArrayList(listCm.size());
            for (dt dtVar : listCm) {
                if (dt.my(dtVar) || (dtVar != null && dtVar.zpa())) {
                    PAGNativeAd pAGNativeAdJpo = jpo(context, dtVar, adSlot);
                    if (jjVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(pAGNativeAdJpo);
                    }
                }
                if (dt.my(dtVar) && dtVar.ww() != null && dtVar.ww().ju() != null) {
                    if (sq.cm().cm(String.valueOf(dtVar.jl())) && sq.cm().fy()) {
                        if (dtVar.ww() != null) {
                            dtVar.ww().jj(1);
                        }
                        if (dtVar.rqu() != null) {
                            dtVar.rqu().jj(1);
                        }
                        com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(dtVar.ew()).wqx(), dtVar);
                        jdVarJpo.jpo("material_meta", dtVar);
                        jdVarJpo.jpo("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, null);
                    }
                    IPMiBroadcastReceiver.jpo(context, dtVar);
                }
            }
            boolean z10 = jjVar instanceof PAGNativeAdLoadListener;
            if (z10 && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.prr.wqx.jpo(listCm.get(0), dmVar.cm());
                }
                if (z10) {
                    ((PAGNativeAdLoadListener) jjVar).onAdLoaded(arrayList.get(0));
                }
                if (wqxVar.my() == null || wqxVar.my().isEmpty()) {
                    return;
                }
                wqxVar.wqx(4);
                wqx.jpo(wqxVar);
                return;
            }
            jjVar.onError(-4, xyk.jpo(-4));
            wqxVar.jpo(-4);
            wqxVar.wqx(4);
            wqx.jpo(wqxVar);
            return;
        }
        jjVar.onError(-3, xyk.jpo(-3));
        wqxVar.jpo(-3);
        wqxVar.wqx(4);
        wqx.jpo(wqxVar);
    }

    private PAGNativeAd jpo(Context context, dt dtVar, AdSlot adSlot) {
        if (dtVar.cql() != 2) {
            return new com.bytedance.sdk.openadsdk.jpo.jd.jd(context, dtVar, 5, adSlot);
        }
        if (dtVar.ww() != null) {
            return new com.bytedance.sdk.openadsdk.jpo.jd.jpo.jd(context, dtVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx(context, dtVar, adSlot);
    }
}
