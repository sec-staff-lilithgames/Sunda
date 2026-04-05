package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.ironsource.C3352n2;
import com.ironsource.C3533xd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3019u6 extends Ve {

    /* renamed from: o, reason: collision with root package name */
    private C2985s6 f33445o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33446p;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3019u6 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        F5 f5P = this$0.p();
        if (f5P != null) {
            ((G5) f5P).a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(info);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3019u6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f5P = this$0.p();
        if (f5P != null) {
            ((G5) f5P).a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDisplayFailed();
        }
        F5 f5P2 = this$0.p();
        if (f5P2 != null) {
            ((G5) f5P2).a();
        }
        this$0.y();
    }

    private final void e(AdMetaInfo adMetaInfo) {
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).c("InterstitialUnifiedAdManager", C3533xd.f39228f);
        }
        super.c(adMetaInfo);
        F5 f5P2 = p();
        if (f5P2 != null) {
            ((G5) f5P2).d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        a((byte) 2);
        s().post(new zk.z0(this, adMetaInfo, 1));
    }

    public boolean C() {
        return this.f33445o != null;
    }

    public final void D() throws IllegalStateException {
        U0 u0J;
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).a("InterstitialUnifiedAdManager", "render");
        }
        C2985s6 c2985s6 = this.f33445o;
        if (c2985s6 == null) {
            throw new IllegalStateException(Ve.f32404m);
        }
        if (c2985s6.I0() && n() != null) {
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfoN = n();
            kotlin.jvm.internal.e0.checkNotNull(adMetaInfoN);
            e(adMetaInfoN);
            return;
        }
        if (this.f33446p) {
            F5 f5P3 = p();
            if (f5P3 != null) {
                ((G5) f5P3).b("InMobi", Ve.f32402k);
            }
            AbstractC2902n7.a((byte) 1, "InMobi", Ve.f32402k);
            b(this.f33445o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2985s6 c2985s62 = this.f33445o;
            if (c2985s62 != null) {
                c2985s62.b((short) 2128);
                return;
            }
            return;
        }
        C2985s6 c2985s63 = this.f33445o;
        C2793h c2793hM = c2985s63 != null ? c2985s63.m() : null;
        C2985s6 c2985s64 = this.f33445o;
        boolean zA = a("InMobi", String.valueOf(c2985s64 != null ? c2985s64.J() : null));
        if (c2793hM == null) {
            F5 f5P4 = p();
            if (f5P4 != null) {
                ((G5) f5P4).b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.f33445o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2985s6 c2985s65 = this.f33445o;
            if (c2985s65 != null) {
                c2985s65.a((short) 2166);
            }
        }
        if (n() == null) {
            F5 f5P5 = p();
            if (f5P5 != null) {
                ((G5) f5P5).b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.f33445o, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2985s6 c2985s66 = this.f33445o;
            if (c2985s66 != null) {
                c2985s66.a((short) 2167);
            }
        }
        if (c2793hM == null || !zA) {
            return;
        }
        if (v() && (u0J = j()) != null) {
            u0J.e((byte) 1);
        }
        F5 f5P6 = p();
        if (f5P6 != null) {
            ((G5) f5P6).d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        a((byte) 8);
        C2985s6 c2985s67 = this.f33445o;
        if (c2985s67 != null) {
            c2985s67.k0();
        }
    }

    public final void E() {
        C2985s6 c2985s6;
        C2892me c2892meH0;
        C2985s6 c2985s62 = this.f33445o;
        if ((c2985s62 == null || (c2892meH0 = c2985s62.H0()) == null || !c2892meH0.f33104b) && (c2985s6 = this.f33445o) != null) {
            c2985s6.L0();
        }
    }

    public final void a(C2985s6 c2985s6) {
        this.f33445o = c2985s6;
    }

    @Override // com.inmobi.media.H0
    public void d() {
        s().post(new zk.a1(this, 0));
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        a((byte) 6);
        C2985s6 c2985s6 = this.f33445o;
        if (c2985s6 != null) {
            c2985s6.g();
        }
        F5 f5P2 = p();
        if (f5P2 != null) {
            ((G5) f5P2).a();
        }
    }

    @Override // com.inmobi.media.H0
    public void g() {
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        U0 u0J = j();
        if (u0J != null) {
            if (u0J.R() == 6 || u0J.R() == 7) {
                u0J.a(this);
            } else {
                a(true, (short) 2159);
            }
        }
    }

    @Override // com.inmobi.media.Ve
    public U0 j() {
        return this.f33445o;
    }

    public static /* synthetic */ void A() {
    }

    private final void a(boolean z10, short s10) {
        C2985s6 c2985s6;
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s10 != 0 && (c2985s6 = this.f33445o) != null) {
            c2985s6.c(s10);
        }
        s().post(new zk.a1(this, 2));
        if (z10) {
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            a((byte) 6);
            C2985s6 c2985s62 = this.f33445o;
            if (c2985s62 != null) {
                c2985s62.g();
            }
        }
        F5 f5P3 = p();
        if (f5P3 != null) {
            ((G5) f5P3).a();
        }
    }

    private final boolean x() {
        byte bQ = q();
        if (bQ == 1) {
            F5 f5P = p();
            if (f5P != null) {
                ((G5) f5P).b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            AbstractC2902n7.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (bQ == 7) {
            AbstractC2902n7.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (bQ != 5) {
            if (!this.f33446p) {
                return true;
            }
            C2985s6 c2985s6 = this.f33445o;
            if (c2985s6 != null) {
                c2985s6.c((short) 2149);
            }
            AbstractC2902n7.a((byte) 1, "InMobi", Ve.f32402k);
            F5 f5P3 = p();
            if (f5P3 != null) {
                ((G5) f5P3).b("InMobi", Ve.f32402k);
            }
            return false;
        }
        if (this.f33445o != null) {
            StringBuilder sb2 = new StringBuilder(Ve.f32401j);
            C2985s6 c2985s62 = this.f33445o;
            sb2.append(c2985s62 != null ? c2985s62.J() : null);
            AbstractC2902n7.a((byte) 1, "InMobi", sb2.toString());
            F5 f5P4 = p();
            if (f5P4 != null) {
                StringBuilder sb3 = new StringBuilder(Ve.f32401j);
                C2985s6 c2985s63 = this.f33445o;
                sb3.append(c2985s63 != null ? c2985s63.J() : null);
                ((G5) f5P4).b("InMobi", sb3.toString());
            }
            a(false, (short) 2148);
        }
        return false;
    }

    private final void y() {
        C2985s6 c2985s6 = this.f33445o;
        if (c2985s6 != null) {
            c2985s6.b((byte) 4);
        }
    }

    public final boolean B() {
        C2985s6 c2985s6 = this.f33445o;
        if (c2985s6 != null && 2 == q()) {
            return c2985s6.I0();
        }
        return false;
    }

    public final C2985s6 z() {
        return this.f33445o;
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void b(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        d(info);
        if (this.f33445o == null) {
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((U0) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        s().post(new zk.z0(this, info, 0));
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.f33445o == null) {
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).b("InterstitialUnifiedAdManager", "adUnit is null");
            }
            c(null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        e(info);
    }

    public static /* synthetic */ void a(C3019u6 c3019u6, C2788gb c2788gb, Context context, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str = "intHtml";
        }
        c3019u6.a(c2788gb, context, z10, str);
    }

    public final void a(C2788gb pubSettings, Context context, boolean z10, String logType) {
        C2985s6 c2985s6;
        C2985s6 c2985s62;
        kotlin.jvm.internal.e0.checkNotNullParameter(pubSettings, "pubSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(logType, "logType");
        if (this.f33445o == null) {
            this.f33445o = new C2985s6(context, new Y("int").a(pubSettings.f32882a).c(pubSettings.f32883b).a(pubSettings.f32884c).e(pubSettings.f32886e).b(pubSettings.f32887f).a(), this);
        }
        if (z10) {
            w();
        }
        String str = pubSettings.f32886e;
        if (str != null) {
            F5 f5P = p();
            if (f5P != null) {
                ((G5) f5P).a();
            }
            a(Wb.a(logType, str, false));
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            F5 f5P3 = p();
            if (f5P3 != null && (c2985s62 = this.f33445o) != null) {
                c2985s62.a(f5P3);
            }
            F5 f5P4 = p();
            if (f5P4 != null) {
                ((G5) f5P4).a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C2985s6 c2985s63 = this.f33445o;
            kotlin.jvm.internal.e0.checkNotNull(c2985s63);
            Wb.a(c2985s63, p());
        }
        C2985s6 c2985s64 = this.f33445o;
        if (c2985s64 != null) {
            c2985s64.a(context);
        }
        C2985s6 c2985s65 = this.f33445o;
        if (c2985s65 != null) {
            c2985s65.a(pubSettings.f32884c);
        }
        C2985s6 c2985s66 = this.f33445o;
        if (c2985s66 != null) {
            c2985s66.c("activity");
        }
        if (pubSettings.f32885d && (c2985s6 = this.f33445o) != null) {
            c2985s6.G0();
        }
        WatermarkData watermarkDataT = t();
        if (watermarkDataT != null) {
            C2985s6 c2985s67 = this.f33445o;
            if (c2985s67 != null) {
                c2985s67.a(watermarkDataT);
            }
            F5 f5P5 = p();
            if (f5P5 != null) {
                ((G5) f5P5).c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    public final void c(PublisherCallbacks callbacks) {
        C2985s6 c2985s6;
        kotlin.jvm.internal.e0.checkNotNullParameter(callbacks, "callbacks");
        if (l() == null) {
            b(callbacks);
        }
        if (kotlin.jvm.internal.e0.areEqual(u(), Boolean.FALSE)) {
            C2985s6 c2985s62 = this.f33445o;
            if (c2985s62 != null) {
                c2985s62.a((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            F5 f5P = p();
            if (f5P != null) {
                ((G5) f5P).b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            AbstractC2902n7.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.f33446p) {
            C2985s6 c2985s63 = this.f33445o;
            if (c2985s63 != null) {
                c2985s63.a((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).b("InMobi", Ve.f32402k);
            }
            AbstractC2902n7.a((byte) 1, "InMobi", Ve.f32402k);
            return;
        }
        a(Boolean.TRUE);
        C2985s6 c2985s64 = this.f33445o;
        if (c2985s64 == null || !a("InMobi", String.valueOf(c2985s64.J()), callbacks) || (c2985s6 = this.f33445o) == null || !c2985s6.e(o())) {
            return;
        }
        a((byte) 1);
        F5 f5P3 = p();
        if (f5P3 != null) {
            StringBuilder sb2 = new StringBuilder("Fetching an Interstitial ad for placement id: ");
            C2985s6 c2985s65 = this.f33445o;
            sb2.append(c2985s65 != null ? c2985s65.J() : null);
            ((G5) f5P3).c("InterstitialUnifiedAdManager", sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("Fetching an Interstitial ad for placement id: ");
        C2985s6 c2985s66 = this.f33445o;
        sb3.append(c2985s66 != null ? c2985s66.J() : null);
        AbstractC2902n7.a((byte) 2, "InterstitialUnifiedAdManager", sb3.toString());
        C2985s6 c2985s67 = this.f33445o;
        if (c2985s67 != null) {
            c2985s67.g(this);
        }
        C2985s6 c2985s68 = this.f33445o;
        if (c2985s68 != null) {
            c2985s68.d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3019u6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f5P = this$0.p();
        if (f5P != null) {
            ((G5) f5P).a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDisplayFailed();
        }
        this$0.y();
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void b() {
        s().post(new zk.a1(this, 1));
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        a((byte) 0);
        a((Boolean) null);
        C2985s6 c2985s6 = this.f33445o;
        if (c2985s6 != null) {
            c2985s6.g();
        }
        F5 f5P2 = p();
        if (f5P2 != null) {
            ((G5) f5P2).a();
        }
    }

    private final void c(U0 u02, InMobiAdRequestStatus inMobiAdRequestStatus) {
        byte bQ = q();
        if (bQ == 8 || bQ == 1) {
            b(u02, inMobiAdRequestStatus);
            return;
        }
        if (bQ == 2) {
            AbstractC2902n7.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            F5 f5P = p();
            if (f5P != null) {
                ((G5) f5P).b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (bQ == 5) {
            AbstractC2902n7.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
            F5 f5P2 = p();
            if (f5P2 != null) {
                ((G5) f5P2).b("InMobi", "Ad will be dismissed, Internal error");
            }
            y();
            b();
            return;
        }
        AbstractC2902n7.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
        F5 f5P3 = p();
        if (f5P3 != null) {
            ((G5) f5P3).b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3019u6 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        F5 f5P = this$0.p();
        if (f5P != null) {
            ((G5) f5P).a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(info);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3019u6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f5P = this$0.p();
        if (f5P != null) {
            ((G5) f5P).a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDismissed();
        }
    }

    public static /* synthetic */ void a(C3019u6 c3019u6, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = null;
        }
        c3019u6.a(context);
    }

    public final void a(Context context) {
        F5 f5P = p();
        if (f5P != null) {
            ((G5) f5P).a("InterstitialUnifiedAdManager", C3352n2.f37928v);
        }
        C2985s6 c2985s6 = this.f33445o;
        C2892me c2892meH0 = c2985s6 != null ? c2985s6.H0() : null;
        if (c2892meH0 != null) {
            c2892meH0.f33104b = true;
        }
        C2985s6 c2985s62 = this.f33445o;
        if (c2985s62 != null) {
            c2985s62.x0();
        }
        if (x()) {
            if (!M4.f32021a.a()) {
                if (this.f33445o != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C2985s6 c2985s63 = this.f33445o;
            if (c2985s63 == null || !c2985s63.e((byte) 4)) {
                return;
            }
            this.f33446p = true;
            C2985s6 c2985s64 = this.f33445o;
            if (c2985s64 != null) {
                c2985s64.c(this, context);
            }
        }
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void a(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        super.a(info);
        U0 u0J = j();
        if (u0J != null) {
            u0J.y0();
        }
        this.f33446p = false;
    }

    @Override // com.inmobi.media.Ve
    public void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C2985s6 c2985s6 = this.f33445o;
        if (c2985s6 != null) {
            c2985s6.a(watermarkData);
        }
    }
}
