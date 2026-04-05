package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.component.utils.se;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
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
public class my {
    private static volatile my jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final Context f19992jd;
    private com.bytedance.sdk.component.xyk.xyk my;
    private final AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: cm, reason: collision with root package name */
    private final List<wqx> f19991cm = Collections.synchronizedList(new ArrayList());

    /* renamed from: jj, reason: collision with root package name */
    private final se.jpo f19993jj = new se.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.2
        @Override // com.bytedance.sdk.component.utils.se.jpo
        public void jpo(Context context, Intent intent, boolean z10, int i10) {
            if (z10) {
                if (my.this.my == null) {
                    my myVar = my.this;
                    myVar.my = new com.bytedance.sdk.openadsdk.component.reward.jd("fsv net connect task", myVar.f19991cm);
                }
                com.bytedance.sdk.component.utils.zz.jpo().post(my.this.my);
            }
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements PAGInterstitialAdLoadListener {

        /* renamed from: cm, reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.core.model.jpo f20007cm;

        /* renamed from: jd, reason: collision with root package name */
        private final AtomicBoolean f20008jd;
        private final PAGInterstitialAdLoadListener jpo;
        private final AtomicInteger wqx;

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            if (this.wqx.decrementAndGet() > 0 || !this.f20008jd.compareAndSet(false, true)) {
                return;
            }
            this.jpo.onError(i10, str);
            com.bytedance.sdk.openadsdk.prr.wqx.jpo("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.jd.1
                @Override // com.bytedance.sdk.openadsdk.prr.jd
                public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", jd.this.f20007cm.jd());
                    return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("choose_ad_load_error").jd(jSONObject.toString());
                }
            });
        }

        private jd(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
            this.f20008jd = new AtomicBoolean(false);
            this.jpo = pAGInterstitialAdLoadListener;
            this.f20007cm = jpoVar;
            this.wqx = new AtomicInteger(jpo());
        }

        private int jpo() {
            if (!this.f20007cm.my()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.f20007cm.cm().size(); i11++) {
                dt dtVar = this.f20007cm.cm().get(i11);
                if (dtVar != null && !rv.wqx(dtVar) && dtVar.ww() != null) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.wqx.decrementAndGet();
            if (this.jpo == null || !this.f20008jd.compareAndSet(false, true)) {
                return;
            }
            this.jpo.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements PAGInterstitialAdLoadListener {

        /* renamed from: cm, reason: collision with root package name */
        private final PAGInterstitialAdLoadListener f20009cm;

        /* renamed from: jd, reason: collision with root package name */
        private final AdSlot f20010jd;
        private final Context jpo;
        private final boolean my;
        private final com.bytedance.sdk.openadsdk.core.model.jpo wqx;

        public jpo(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z10) {
            this.jpo = context;
            this.f20010jd = adSlot;
            this.wqx = jpoVar;
            this.f20009cm = pAGInterstitialAdLoadListener;
            this.my = z10;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            my.jpo(this.jpo).jpo(this.f20010jd, this.wqx, this.f20009cm, pAGInterstitialAd, this.my);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.f20009cm;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i10, str);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx extends com.bytedance.sdk.component.xyk.xyk {

        /* renamed from: jd, reason: collision with root package name */
        final AdSlot f20011jd;
        final dt jpo;
        final com.bytedance.sdk.openadsdk.core.model.jpo wqx;

        public wqx(dt dtVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
            super("Fullscreen Task");
            this.jpo = dtVar;
            this.f20011jd = adSlot;
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
            jdVarJpo.jpo("ad_slot", this.f20011jd);
            com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, new com.bykv.vk.openvk.jpo.jpo.jpo.my.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.wqx.1
                @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10, String str) {
                }

                @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) {
                    cm cmVarJpo = cm.jpo(sq.jpo());
                    wqx wqxVar2 = wqx.this;
                    cmVarJpo.jpo(wqxVar2.f20011jd, wqxVar2.wqx);
                }
            });
        }
    }

    private my(Context context) {
        this.f19992jd = context == null ? sq.jpo() : context.getApplicationContext();
        wqx();
    }

    private void cm(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hx hxVar = new hx();
        hxVar.wqx = 1;
        if (sq.cm().ju(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hxVar.zz = 2;
        }
        sq.wqx().jpo(adSlot, hxVar, 8, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.8
            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                com.bytedance.sdk.openadsdk.core.model.jpo jpoVar2;
                if (jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
                    oya oyaVar = new oya(my.this.f19992jd, jpoVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.nmd.jpo.cm.jpo().jpo(jpoVar.cm().isEmpty() ? null : jpoVar.cm().get(0));
                        com.bytedance.sdk.openadsdk.prr.wqx.jpo(jpoVar.jj(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || sq.cm().sq() != 0) {
                        jpoVar2 = jpoVar;
                    } else {
                        my.this.jpo(adSlot, jpoVar, pAGInterstitialAdLoadListener, (PAGInterstitialAd) oyaVar.jpo(), false);
                        jpoVar2 = jpoVar;
                    }
                    my.this.jpo(jpoVar2, oyaVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.xyk.jpo(-3));
                    wqxVar.jpo(-3);
                    wqxVar.wqx(5);
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
        cm();
    }

    private void jd(final AdSlot adSlot) {
        hx hxVar = new hx();
        hxVar.wqx = 2;
        if (sq.cm().ju(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hxVar.zz = 2;
        }
        sq.wqx().jpo(adSlot, hxVar, 8, (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.1
            boolean jpo = false;

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public String jpo() {
                return cm.jpo(my.this.f19992jd).jpo(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
                boolean zJpo = cm.jpo(my.this.f19992jd).jpo(jpoVar);
                this.jpo = zJpo;
                return zJpo;
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                if (this.jpo || jpoVar.cm() == null || jpoVar.cm().isEmpty()) {
                    return;
                }
                my.this.jpo(jpoVar, new oya(my.this.f19992jd, jpoVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    private void wqx(final AdSlot adSlot) {
        if (cm.jpo(this.f19992jd).jd(adSlot.getCodeId(), false) != null) {
            return;
        }
        hx hxVar = new hx();
        hxVar.wqx = 2;
        if (sq.cm().ju(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hxVar.zz = 2;
        }
        sq.wqx().jpo(adSlot, hxVar, 8, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.3
            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                if (jpoVar.cm() == null || jpoVar.cm().isEmpty()) {
                    return;
                }
                my.this.jpo(jpoVar, new oya(my.this.f19992jd, jpoVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    public static my jpo(Context context) {
        if (jpo == null) {
            synchronized (my.class) {
                try {
                    if (jpo == null) {
                        jpo = new my(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm(AdSlot adSlot) {
        if (jd() != 2) {
            return;
        }
        cm.jpo(this.f19992jd).jpo(adSlot.getCodeId());
    }

    private void jd(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hx hxVar = new hx();
        hxVar.wqx = 1;
        if (sq.cm().ju(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hxVar.zz = 2;
        }
        sq.wqx().jpo(adSlot, hxVar, 8, (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.4
            boolean jpo = false;

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i10, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                com.bytedance.sdk.openadsdk.core.model.jpo jpoVar2;
                if (jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
                    oya oyaVar = new oya(my.this.f19992jd, jpoVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.nmd.jpo.cm.jpo().jpo(jpoVar.cm().isEmpty() ? null : jpoVar.cm().get(0));
                        com.bytedance.sdk.openadsdk.prr.wqx.jpo(jpoVar.jj(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener == null || sq.cm().sq() != 0) {
                        jpoVar2 = jpoVar;
                    } else {
                        my.this.jpo(adSlot, jpoVar, pAGInterstitialAdLoadListener, oyaVar.jpo(), this.jpo);
                        jpoVar2 = jpoVar;
                    }
                    my.this.jpo(jpoVar2, oyaVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.xyk.jpo(-3));
                    wqxVar.jpo(-3);
                    wqxVar.wqx(5);
                    com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public String jpo() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strJpo = cm.jpo(my.this.f19992jd).jpo(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(strJpo)) {
                    return null;
                }
                return strJpo;
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
                boolean zJpo = cm.jpo(my.this.f19992jd).jpo(jpoVar);
                this.jpo = zJpo;
                return zJpo;
            }
        });
    }

    private void wqx(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarJd;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (jpoVarJd = cm.jpo(this.f19992jd).jd(adSlot.getCodeId(), true)) != null && jpoVarJd.my()) {
            jpo(adSlot, jpoVarJd, pAGInterstitialAdLoadListener);
        } else {
            cm(adSlot, pAGInterstitialAdLoadListener);
        }
    }

    private void cm() {
        if (this.wqx.get()) {
            this.wqx.set(false);
            try {
                se.jpo(this.f19993jj);
            } catch (Exception unused) {
            }
        }
    }

    public void jpo() {
        try {
            cm.jpo(this.f19992jd).jpo();
        } catch (Throwable unused) {
        }
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
            return;
        }
        this.wqx.set(true);
        se.jpo(this.f19993jj, this.f19992jd);
    }

    public static int jd() {
        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("ivrv_load_ad_cache_strategy", 0);
    }

    public void jpo(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) throws Throwable {
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            jd(adSlot, pAGInterstitialAdLoadListener);
        } else {
            wqx(adSlot, pAGInterstitialAdLoadListener);
        }
    }

    private void jpo(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) throws Throwable {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar2;
        my myVar;
        AdSlot adSlot2;
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar3;
        PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2;
        dt dtVarJj = jpoVar.jj();
        for (dt dtVar : jpoVar.cm()) {
            if (dtVar.gmx() == null) {
                dtVar.jpo(adSlot);
            }
        }
        oya oyaVar = new oya(this.f19992jd, jpoVar);
        if (!rv.wqx(dtVarJj)) {
            oyaVar.jd();
        }
        if (pAGInterstitialAdLoadListener != null) {
            com.bytedance.sdk.openadsdk.core.p000if.wqx.cm.jpo(jpoVar);
            if (sq.cm().sq() == 0) {
                myVar = this;
                adSlot2 = adSlot;
                jpoVar3 = jpoVar;
                pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                myVar.jpo(adSlot2, jpoVar3, pAGInterstitialAdLoadListener2, (PAGInterstitialAd) oyaVar.jpo(), true);
            } else {
                myVar = this;
                adSlot2 = adSlot;
                jpoVar3 = jpoVar;
                pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
            }
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener3 = pAGInterstitialAdLoadListener2;
            AdSlot adSlot3 = adSlot2;
            com.bytedance.sdk.openadsdk.core.model.jpo jpoVar4 = jpoVar3;
            jpoVar2 = jpoVar4;
            jd jdVar = new jd(new jpo(myVar.f19992jd, adSlot3, jpoVar4, pAGInterstitialAdLoadListener3, true), jpoVar2);
            for (int i10 = 0; i10 < jpoVar2.cm().size(); i10++) {
                jpo(jpoVar2.cm().get(i10), adSlot3, jdVar, oyaVar);
                if (jpoVar2.yd()) {
                    break;
                }
            }
        } else {
            jpoVar2 = jpoVar;
        }
        for (int i11 = 0; i11 < jpoVar2.cm().size(); i11++) {
            com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(jpoVar2.cm().get(i11), new jpo.InterfaceC0113jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.5
                @Override // com.bytedance.sdk.openadsdk.core.au.wqx.jpo.InterfaceC0113jpo
                public void jpo(boolean z10) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z10) {
        com.bytedance.sdk.openadsdk.core.oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.6
            @Override // java.lang.Runnable
            public void run() {
                int iJd = my.jd();
                if (!z10) {
                    if (iJd == 2) {
                        cm.jpo(my.this.f19992jd).jpo(adSlot, jpoVar);
                        my.this.cm(adSlot);
                        return;
                    }
                    return;
                }
                if (iJd == 2) {
                    my.this.cm(adSlot);
                } else if (iJd == 1) {
                    cm.jpo(my.this.f19992jd).jpo(adSlot.getCodeId(), (dt) null);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(com.bytedance.sdk.openadsdk.core.model.dt r4, com.bytedance.sdk.openadsdk.AdSlot r5, final com.bytedance.sdk.openadsdk.component.reward.my.jd r6, final com.bytedance.sdk.openadsdk.component.reward.oya r7) {
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
            if (r1 != 0) goto L3f
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.dt.my(r4)
            if (r1 == 0) goto L3f
            int r1 = r4.ew()
            com.bykv.vk.openvk.jpo.jpo.jpo.jpo.jd r1 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r1)
            java.lang.String r1 = r1.jpo()
            com.bytedance.sdk.openadsdk.core.au.jpo.jd r1 = com.bytedance.sdk.openadsdk.core.model.dt.jpo(r1, r4)
            java.lang.String r2 = "material_meta"
            r1.jpo(r2, r4)
            java.lang.String r4 = "ad_slot"
            r1.jpo(r4, r5)
            com.bytedance.sdk.openadsdk.component.reward.my$7 r4 = new com.bytedance.sdk.openadsdk.component.reward.my$7
            r4.<init>()
            com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(r1, r4)
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L49
            com.bytedance.sdk.openadsdk.component.reward.jj r4 = r7.jpo()
            r6.onAdLoaded(r4)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.my.jpo(com.bytedance.sdk.openadsdk.core.model.dt, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.component.reward.my$jd, com.bytedance.sdk.openadsdk.component.reward.oya):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, oya oyaVar, AdSlot adSlot, boolean z10, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z10) {
            com.bytedance.sdk.openadsdk.au.jpo.jpo().jpo(jpoVar.jj());
        }
        AdSlot adSlot2 = adSlot;
        jd jdVar = new jd(new jpo(this.f19992jd, adSlot2, jpoVar, pAGInterstitialAdLoadListener, false), jpoVar);
        jpo(jpoVar);
        int i10 = 0;
        while (i10 < jpoVar.cm().size()) {
            dt dtVar = jpoVar.cm().get(i10);
            int iJkt = dtVar.jkt();
            if (i10 == 0 && iJkt == 43) {
                dtVar.ww().jj(0);
            }
            oya oyaVar2 = oyaVar;
            boolean z11 = z10;
            AdSlot adSlot3 = adSlot2;
            jpo(jpoVar, dtVar, oyaVar2, adSlot3, z11, jdVar);
            adSlot2 = adSlot3;
            if (jpoVar.yd() && dtVar.jkt() != 43) {
                return;
            }
            i10++;
            oyaVar = oyaVar2;
            z10 = z11;
        }
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        nq nqVarM472if = jpoVar.m472if();
        int iHna = jpoVar.yd() ? 10 : 1;
        if (nqVarM472if != null) {
            iHna = nqVarM472if.hna();
        }
        for (final int i10 = 0; i10 < jpoVar.cm().size() && i10 < iHna; i10++) {
            com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(jpoVar.cm().get(i10), new jpo.InterfaceC0113jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.9
                @Override // com.bytedance.sdk.openadsdk.core.au.wqx.jpo.InterfaceC0113jpo
                public void jpo(boolean z10) {
                    com.bytedance.sdk.component.utils.nmd.jpo("ScreenVideoLoadM", "onCachedResponse: i=" + i10 + ", isSuccess=" + z10);
                }
            });
        }
    }

    private void jpo(final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, dt dtVar, oya oyaVar, final AdSlot adSlot, final boolean z10, jd jdVar) {
        final oya oyaVar2;
        final jd jdVar2;
        if (z10 && !rv.wqx(dtVar) && dt.my(dtVar) && sq.cm().nq(adSlot.getCodeId()).f20864cm == 1 && !opi.cm(this.f19992jd)) {
            jpo(new wqx(dtVar, adSlot, jpoVar));
            return;
        }
        boolean z11 = false;
        boolean z12 = jdVar != null && sq.cm().sq() == 1;
        if (rv.wqx(dtVar)) {
            oyaVar2 = oyaVar;
            jdVar2 = jdVar;
            if (z10) {
                cm.jpo(this.f19992jd).jpo(adSlot, jpoVar);
            }
        } else if (dt.my(dtVar)) {
            if (dtVar.ww() != null) {
                com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(dtVar.ew()).jpo(), dtVar);
                jdVarJpo.jpo("material_meta", dtVar);
                jdVarJpo.jpo("ad_slot", adSlot);
                oyaVar2 = oyaVar;
                jdVar2 = jdVar;
                com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, new com.bykv.vk.openvk.jpo.jpo.jpo.my.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.my.10
                    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) {
                        oyaVar2.jd();
                        if (z10) {
                            cm.jpo(my.this.f19992jd).jpo(adSlot, jpoVar);
                        } else {
                            if (jdVar2 == null || sq.cm().sq() != 1) {
                                return;
                            }
                            jdVar2.onAdLoaded(oyaVar2.jpo());
                        }
                    }

                    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
                    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10, String str) {
                        if (jdVar2 == null || sq.cm().sq() != 1) {
                            return;
                        }
                        jdVar2.onError(i10, str);
                    }
                });
            } else {
                oyaVar2 = oyaVar;
                jdVar2 = jdVar;
                z11 = z12;
            }
            z12 = z11;
        } else {
            oyaVar2 = oyaVar;
            jdVar2 = jdVar;
            if (z10) {
                cm.jpo(this.f19992jd).jpo(adSlot, jpoVar);
            }
        }
        if (z12) {
            jdVar2.onAdLoaded(oyaVar2.jpo());
        }
    }

    private void jpo(wqx wqxVar) {
        if (wqxVar == null) {
            return;
        }
        if (this.f19991cm.size() > 0) {
            this.f19991cm.remove(0);
        }
        this.f19991cm.add(wqxVar);
    }

    public void jpo(String str, dt dtVar) {
        cm.jpo(this.f19992jd).jpo(str, dtVar);
    }
}
