package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.component.utils.se;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.core.au.wqx.jpo;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.hx;
import com.bytedance.sdk.openadsdk.core.model.nq;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.nmd;
import com.bytedance.sdk.openadsdk.core.rq;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au {
    private static volatile au jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final Context f19816jd;
    private com.bytedance.sdk.component.xyk.xyk my;
    private final AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: cm, reason: collision with root package name */
    private final List<jd> f19815cm = Collections.synchronizedList(new ArrayList());

    /* renamed from: jj, reason: collision with root package name */
    private final se.jpo f19817jj = new se.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.2
        @Override // com.bytedance.sdk.component.utils.se.jpo
        public void jpo(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
                if (au.this.my == null) {
                    au auVar = au.this;
                    auVar.my = new com.bytedance.sdk.openadsdk.component.reward.jd("net connect task", auVar.f19815cm);
                }
                com.bytedance.sdk.component.utils.zz.jpo().post(au.this.my);
            }
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd extends com.bytedance.sdk.component.xyk.xyk {

        /* renamed from: jd, reason: collision with root package name */
        final AdSlot f19832jd;
        final dt jpo;
        final com.bytedance.sdk.openadsdk.core.model.jpo wqx;

        public jd(dt dtVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
            super("Reward Task");
            this.jpo = dtVar;
            this.f19832jd = adSlot;
            this.wqx = jpoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            dt dtVar = this.jpo;
            if (dtVar == null || dtVar.ww() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(this.jpo.ew()).jpo(), this.jpo);
            jdVarJpo.jpo("material_meta", this.jpo);
            jdVarJpo.jpo("ad_slot", this.f19832jd);
            com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, new com.bykv.vk.openvk.jpo.jpo.jpo.my.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.jd.1
                @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10, String str) {
                }

                @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) {
                    Cif cifJpo = Cif.jpo(sq.jpo());
                    jd jdVar = jd.this;
                    cifJpo.jpo(jdVar.f19832jd, jdVar.wqx);
                }
            });
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements PAGRewardedAdLoadListener {

        /* renamed from: cm, reason: collision with root package name */
        private final PAGRewardedAdLoadListener f19833cm;

        /* renamed from: jd, reason: collision with root package name */
        private final AdSlot f19834jd;
        private final Context jpo;
        private final boolean my;
        private final com.bytedance.sdk.openadsdk.core.model.jpo wqx;

        public jpo(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z10) {
            this.jpo = context;
            this.f19834jd = adSlot;
            this.wqx = jpoVar;
            this.f19833cm = pAGRewardedAdLoadListener;
            this.my = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            au.jpo(this.jpo).jpo(this.f19834jd, this.wqx, this.f19833cm, pAGRewardedAd, this.my);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.f19833cm;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i10, str);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx implements PAGRewardedAdLoadListener {

        /* renamed from: cm, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.jpo f19835cm;

        /* renamed from: jd, reason: collision with root package name */
        private final AtomicBoolean f19836jd;
        private final PAGRewardedAdLoadListener jpo;
        private final AtomicInteger wqx;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            if (this.wqx.decrementAndGet() > 0 || this.jpo == null || !this.f19836jd.compareAndSet(false, true)) {
                return;
            }
            this.jpo.onError(i10, str);
            com.bytedance.sdk.openadsdk.prr.wqx.jpo("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.wqx.1
                @Override // com.bytedance.sdk.openadsdk.prr.jd
                public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", wqx.this.f19835cm.jd());
                    return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("choose_ad_load_error").jd(jSONObject.toString());
                }
            });
        }

        private wqx(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
            this.f19836jd = new AtomicBoolean(false);
            this.jpo = pAGRewardedAdLoadListener;
            this.f19835cm = jpoVar;
            this.wqx = new AtomicInteger(jpo());
        }

        private int jpo() {
            if (!this.f19835cm.my()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.f19835cm.cm().size(); i11++) {
                dt dtVar = this.f19835cm.cm().get(i11);
                if (dtVar != null && !rv.wqx(dtVar) && dtVar.ww() != null) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.wqx.decrementAndGet();
            if (this.jpo == null || !this.f19836jd.compareAndSet(false, true)) {
                return;
            }
            this.jpo.onAdLoaded(pAGRewardedAd);
        }
    }

    private au(Context context) {
        this.f19816jd = context == null ? sq.jpo() : context.getApplicationContext();
        jd();
    }

    private void cm(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.prr.cm()) {
            com.bykv.vk.openvk.jpo.jpo.jpo.qk.jd.jpo(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hx hxVar = new hx();
        hxVar.f20666jd = 1;
        if (sq.cm().ju(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hxVar.zz = 2;
        }
        sq.wqx().jpo(adSlot, hxVar, 7, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.7
            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                com.bytedance.sdk.openadsdk.core.model.jpo jpoVar2;
                if (jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
                    prr prrVar = new prr(au.this.f19816jd, jpoVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.nmd.jpo.cm.jpo().jpo(jpoVar.cm().isEmpty() ? null : jpoVar.cm().get(0));
                        com.bytedance.sdk.openadsdk.prr.wqx.jpo(jpoVar.jj(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || sq.cm().sq() != 0) {
                        jpoVar2 = jpoVar;
                    } else {
                        au.this.jpo(adSlot, jpoVar, pAGRewardedAdLoadListener, (PAGRewardedAd) prrVar.jpo(), false);
                        jpoVar2 = jpoVar;
                    }
                    au.this.jpo(jpoVar2, prrVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.xyk.jpo(-3));
                    wqxVar.jpo(-3);
                    wqxVar.wqx(6);
                    com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
                }
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.my != null) {
            try {
                com.bytedance.sdk.component.utils.zz.jpo().removeCallbacks(this.my);
            } catch (Exception unused) {
            }
            this.my = null;
        }
        wqx();
    }

    private void jd(final AdSlot adSlot) {
        hx hxVar = new hx();
        hxVar.f20666jd = 2;
        if (sq.cm().ju(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hxVar.zz = 2;
        }
        sq.wqx().jpo(adSlot, hxVar, 7, (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.1
            boolean jpo = false;

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public String jpo() {
                return Cif.jpo(au.this.f19816jd).jpo(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
                boolean zJpo = Cif.jpo(au.this.f19816jd).jpo(jpoVar);
                this.jpo = zJpo;
                return zJpo;
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                if (this.jpo || jpoVar.cm() == null || jpoVar.cm().isEmpty()) {
                    return;
                }
                au.this.jpo(jpoVar, new prr(au.this.f19816jd, jpoVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    private void wqx(final AdSlot adSlot) {
        if (Cif.jpo(this.f19816jd).jd(adSlot.getCodeId(), false) != null) {
            return;
        }
        hx hxVar = new hx();
        hxVar.f20666jd = 2;
        if (sq.cm().ju(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hxVar.zz = 2;
        }
        sq.wqx().jpo(adSlot, hxVar, 7, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.3
            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                if (jpoVar.cm() == null || jpoVar.cm().isEmpty()) {
                    return;
                }
                au.this.jpo(jpoVar, new prr(au.this.f19816jd, jpoVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    public static au jpo(Context context) {
        if (jpo == null) {
            synchronized (au.class) {
                try {
                    if (jpo == null) {
                        jpo = new au(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    private void jd(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.prr.cm()) {
            com.bykv.vk.openvk.jpo.jpo.jpo.qk.jd.jpo(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hx hxVar = new hx();
        hxVar.f20666jd = 1;
        if (sq.cm().ju(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hxVar.zz = 2;
        }
        sq.wqx().jpo(adSlot, hxVar, 7, (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.4
            boolean jpo = false;

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                com.bytedance.sdk.openadsdk.core.model.jpo jpoVar2;
                if (jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
                    prr prrVar = new prr(au.this.f19816jd, jpoVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.nmd.jpo.cm.jpo().jpo(jpoVar.cm().isEmpty() ? null : jpoVar.cm().get(0));
                        com.bytedance.sdk.openadsdk.prr.wqx.jpo(jpoVar.jj(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener == null || sq.cm().sq() != 0) {
                        jpoVar2 = jpoVar;
                    } else {
                        au.this.jpo(adSlot, jpoVar, pAGRewardedAdLoadListener, prrVar.jpo(), this.jpo);
                        jpoVar2 = jpoVar;
                    }
                    au.this.jpo(jpoVar2, prrVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.xyk.jpo(-3));
                    wqxVar.jpo(-3);
                    wqxVar.wqx(6);
                    com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public String jpo() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strJpo = Cif.jpo(au.this.f19816jd).jpo(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strJpo)) {
                    return null;
                }
                return strJpo;
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
                boolean zJpo = Cif.jpo(au.this.f19816jd).jpo(jpoVar);
                this.jpo = zJpo;
                return zJpo;
            }
        });
    }

    private void wqx(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarJd;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (jpoVarJd = Cif.jpo(this.f19816jd).jd(adSlot.getCodeId(), true)) != null && jpoVarJd.my()) {
            jpo(jpoVarJd, adSlot, pAGRewardedAdLoadListener);
        } else {
            cm(adSlot, pAGRewardedAdLoadListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm(AdSlot adSlot) {
        if (my.jd() != 2) {
            return;
        }
        Cif.jpo(this.f19816jd).jpo(adSlot.getCodeId());
    }

    public void jpo(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            jd(adSlot);
        } else {
            wqx(adSlot);
        }
    }

    private void wqx() {
        if (this.wqx.get()) {
            this.wqx.set(false);
            try {
                se.jpo(this.f19817jj);
            } catch (Exception unused) {
            }
        }
    }

    public void jpo(String str, dt dtVar) {
        Cif.jpo(this.f19816jd).jpo(str, dtVar);
    }

    private void jd() {
        if (this.wqx.get()) {
            return;
        }
        this.wqx.set(true);
        se.jpo(this.f19817jj, this.f19816jd);
    }

    public void jpo() {
        try {
            Cif.jpo(this.f19816jd).jpo();
        } catch (Throwable unused) {
        }
    }

    public void jpo(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) throws Throwable {
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            jd(adSlot, pAGRewardedAdLoadListener);
        } else {
            wqx(adSlot, pAGRewardedAdLoadListener);
        }
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar2;
        au auVar;
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar3;
        AdSlot adSlot2;
        PAGRewardedAdLoadListener pAGRewardedAdLoadListener2;
        dt dtVarJj = jpoVar.jj();
        for (dt dtVar : jpoVar.cm()) {
            if (dtVar.gmx() == null) {
                dtVar.jpo(adSlot);
            }
        }
        prr prrVar = new prr(this.f19816jd, jpoVar, adSlot);
        if (!rv.wqx(dtVarJj)) {
            prrVar.jd();
        }
        if (pAGRewardedAdLoadListener != null) {
            com.bytedance.sdk.openadsdk.core.p000if.wqx.cm.jpo(jpoVar);
            if (sq.cm().sq() == 0) {
                auVar = this;
                jpoVar3 = jpoVar;
                adSlot2 = adSlot;
                pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                auVar.jpo(adSlot2, jpoVar3, pAGRewardedAdLoadListener2, (PAGRewardedAd) prrVar.jpo(), true);
            } else {
                auVar = this;
                jpoVar3 = jpoVar;
                adSlot2 = adSlot;
                pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
            }
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener3 = pAGRewardedAdLoadListener2;
            AdSlot adSlot3 = adSlot2;
            com.bytedance.sdk.openadsdk.core.model.jpo jpoVar4 = jpoVar3;
            jpoVar2 = jpoVar4;
            wqx wqxVar = new wqx(new jpo(auVar.f19816jd, adSlot3, jpoVar4, pAGRewardedAdLoadListener3, true), jpoVar2);
            for (int i10 = 0; i10 < jpoVar2.cm().size(); i10++) {
                jpo(jpoVar2.cm().get(i10), adSlot3, wqxVar, prrVar);
                if (jpoVar2.yd()) {
                    break;
                }
            }
        } else {
            jpoVar2 = jpoVar;
        }
        for (final int i11 = 0; i11 < jpoVar2.cm().size(); i11++) {
            com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(jpoVar2.cm().get(i11), new jpo.InterfaceC0113jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.5
                @Override // com.bytedance.sdk.openadsdk.core.au.wqx.jpo.InterfaceC0113jpo
                public void jpo(boolean z10) {
                    com.bytedance.sdk.component.utils.nmd.jpo("RewardVideoLoadManager", "onCachedResponse: i=" + i11 + ", isSuccess=" + z10);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(com.bytedance.sdk.openadsdk.core.model.dt r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.au.wqx r6, final com.bytedance.sdk.openadsdk.component.reward.prr r7) {
        /*
            r3 = this;
            r0 = 0
            if (r6 == 0) goto Lf
            com.bytedance.sdk.openadsdk.core.settings.jj r1 = com.bytedance.sdk.openadsdk.core.sq.cm()
            int r1 = r1.sq()
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.rv.wqx(r4)
            if (r1 != 0) goto L39
            int r1 = r4.ew()
            com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.jpo()
            com.bytedance.sdk.openadsdk.core.au.jpo.jd r1 = com.bytedance.sdk.openadsdk.core.model.dt.jpo(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.jpo(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.jpo(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.au$6 r4 = new com.bytedance.sdk.openadsdk.component.reward.au$6
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(r1, r4)
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 == 0) goto L43
            com.bytedance.sdk.openadsdk.component.reward.xyk r4 = r7.jpo()
            r6.onAdLoaded(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.au.jpo(com.bytedance.sdk.openadsdk.core.model.dt, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.au$wqx, com.bytedance.sdk.openadsdk.component.reward.prr):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, prr prrVar, AdSlot adSlot, boolean z10, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.au.jpo.jpo().jpo(jpoVar.jj());
        }
        AdSlot adSlot2 = adSlot;
        wqx wqxVar = new wqx(new jpo(this.f19816jd, adSlot2, jpoVar, pAGRewardedAdLoadListener, false), jpoVar);
        jpo(jpoVar);
        int i10 = 0;
        while (i10 < jpoVar.cm().size()) {
            dt dtVar = jpoVar.cm().get(i10);
            int iJkt = dtVar.jkt();
            if (i10 == 0 && iJkt == 43) {
                dtVar.ww().jj(0);
            }
            prr prrVar2 = prrVar;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            jpo(jpoVar, dtVar, prrVar2, adSlot3, z11, wqxVar);
            adSlot2 = adSlot3;
            if (jpoVar.yd() && iJkt != 43) {
                return;
            }
            i10++;
            prrVar = prrVar2;
            z10 = z11;
        }
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        nq nqVarM472if = jpoVar.m472if();
        int iHna = jpoVar.yd() ? 10 : 1;
        if (nqVarM472if != null) {
            iHna = nqVarM472if.hna();
        }
        for (final int i10 = 0; i10 < jpoVar.cm().size(); i10++) {
            dt dtVar = jpoVar.cm().get(i10);
            if (i10 >= iHna) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(dtVar, new jpo.InterfaceC0113jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.8
                @Override // com.bytedance.sdk.openadsdk.core.au.wqx.jpo.InterfaceC0113jpo
                public void jpo(boolean z10) {
                    com.bytedance.sdk.component.utils.nmd.jpo("RewardVideoLoadManager", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private void jpo(final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, dt dtVar, prr prrVar, final AdSlot adSlot, final boolean z10, wqx wqxVar) {
        final prr prrVar2;
        final wqx wqxVar2;
        if (z10 && !rv.wqx(dtVar) && sq.cm().nq(adSlot.getCodeId()).f20864cm == 1 && !opi.cm(this.f19816jd)) {
            jpo(new jd(dtVar, adSlot, jpoVar));
            return;
        }
        boolean z11 = false;
        boolean z12 = wqxVar != null && sq.cm().sq() == 1;
        if (rv.wqx(dtVar)) {
            prrVar2 = prrVar;
            wqxVar2 = wqxVar;
            if (z10) {
                Cif.jpo(this.f19816jd).jpo(adSlot, jpoVar);
            }
        } else {
            if (dtVar.ww() != null) {
                com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(dtVar.ew()).jpo(), dtVar);
                jdVarJpo.jpo("material_meta", dtVar);
                jdVarJpo.jpo("ad_slot", adSlot);
                prrVar2 = prrVar;
                wqxVar2 = wqxVar;
                com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, new com.bykv.vk.openvk.jpo.jpo.jpo.my.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.9
                    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar3, int i10) {
                        prrVar2.jd();
                        if (z10) {
                            Cif.jpo(au.this.f19816jd).jpo(adSlot, jpoVar);
                        } else {
                            if (wqxVar2 == null || sq.cm().sq() != 1) {
                                return;
                            }
                            wqxVar2.onAdLoaded(prrVar2.jpo());
                        }
                    }

                    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar3, int i10, String str) {
                        if (wqxVar2 == null || sq.cm().sq() != 1) {
                            return;
                        }
                        wqxVar2.onError(i10, str);
                    }
                });
            } else {
                prrVar2 = prrVar;
                wqxVar2 = wqxVar;
                z11 = z12;
            }
            z12 = z11;
        }
        if (z12) {
            wqxVar2.onAdLoaded(prrVar2.jpo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.au.10
            @Override // java.lang.Runnable
            public void run() {
                int iJd = my.jd();
                if (!z10) {
                    if (iJd == 2) {
                        Cif.jpo(au.this.f19816jd).jpo(adSlot, jpoVar);
                        au.this.cm(adSlot);
                        return;
                    }
                    return;
                }
                if (iJd == 2) {
                    au.this.cm(adSlot);
                } else if (iJd == 1) {
                    Cif.jpo(au.this.f19816jd).jpo(adSlot.getCodeId(), (dt) null);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    private void jpo(jd jdVar) {
        if (jdVar == null) {
            return;
        }
        if (this.f19815cm.size() > 0) {
            this.f19815cm.remove(0);
        }
        this.f19815cm.add(jdVar);
    }
}
