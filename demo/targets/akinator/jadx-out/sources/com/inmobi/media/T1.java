package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class T1 extends Ve {

    /* renamed from: o, reason: collision with root package name */
    private final String f32283o = "InMobi";

    /* renamed from: p, reason: collision with root package name */
    private final String f32284p = "T1";

    /* renamed from: q, reason: collision with root package name */
    private O1 f32285q;

    /* renamed from: r, reason: collision with root package name */
    private O1 f32286r;

    /* renamed from: s, reason: collision with root package name */
    private O1 f32287s;

    /* renamed from: t, reason: collision with root package name */
    private O1 f32288t;

    private final boolean I() {
        O1 o12 = this.f32287s;
        Byte bValueOf = o12 != null ? Byte.valueOf(o12.R()) : null;
        F5 f5P = p();
        if (f5P != null) {
            String TAG = this.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).c(TAG, "shouldUseForegroundUnit " + this + " state - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    private final void J() {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "submitAdShowFail ", this));
        }
        U0 u0J = j();
        if (u0J != null) {
            u0J.c((short) 2239);
        }
    }

    public final int A() {
        AdConfig adConfigJ;
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "defaultRefreshInterval ", this));
        }
        U0 u0J = j();
        if (u0J == null || (adConfigJ = u0J.j()) == null) {
            return -1;
        }
        return adConfigJ.getDefaultRefreshInterval();
    }

    public final boolean B() {
        String TAG = this.f32284p;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        kotlin.jvm.internal.e0.areEqual(this.f32287s, this.f32285q);
        String TAG2 = this.f32284p;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
        kotlin.jvm.internal.e0.areEqual(this.f32288t, this.f32285q);
        String TAG3 = this.f32284p;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
        kotlin.jvm.internal.e0.areEqual(this.f32287s, this.f32286r);
        String TAG4 = this.f32284p;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
        kotlin.jvm.internal.e0.areEqual(this.f32288t, this.f32286r);
        String TAG5 = this.f32284p;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG5, "TAG");
        O1 o12 = this.f32285q;
        if (o12 != null) {
            o12.F0();
        }
        O1 o13 = this.f32285q;
        if (o13 != null) {
            o13.R();
        }
        Objects.toString(this.f32285q);
        String TAG6 = this.f32284p;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG6, "TAG");
        O1 o14 = this.f32286r;
        if (o14 != null) {
            o14.F0();
        }
        O1 o15 = this.f32286r;
        if (o15 != null) {
            o15.R();
        }
        Objects.toString(this.f32286r);
        O1 o16 = this.f32287s;
        if (o16 != null) {
            return o16.F0();
        }
        return false;
    }

    public final boolean C() {
        C2793h c2793hM;
        O1 o12 = this.f32287s;
        if (o12 == null || (c2793hM = o12.m()) == null) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(c2793hM.p(), "audio");
    }

    public boolean D() {
        return (this.f32285q == null || this.f32286r == null) ? false : true;
    }

    public final void E() {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).a(str, S1.a(str, "TAG", "pause ", this));
        }
        O1 o12 = this.f32287s;
        if (o12 != null) {
            o12.G0();
        }
    }

    public final void F() {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        O1 o12 = this.f32285q;
        if (o12 != null) {
            o12.I0();
        }
        O1 o13 = this.f32286r;
        if (o13 != null) {
            o13.I0();
        }
    }

    public final void G() throws IllegalStateException {
        O1 o12;
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).a(str, S1.a(str, "TAG", "render ", this));
        }
        O1 o13 = this.f32288t;
        if (o13 == null) {
            throw new IllegalStateException(Ve.f32404m);
        }
        if (a(this.f32283o, o13.J().toString())) {
            if (v() && (o12 = this.f32288t) != null) {
                o12.e((byte) 1);
            }
            a((byte) 8);
            o13.k0();
        }
    }

    public final void H() {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).a(str, S1.a(str, "TAG", "resume ", this));
        }
        O1 o12 = this.f32287s;
        if (o12 != null) {
            o12.H0();
        }
    }

    public final void K() {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "swapAdUnits ", this));
        }
        O1 o12 = this.f32287s;
        if (o12 == null) {
            this.f32287s = this.f32285q;
            this.f32288t = this.f32286r;
        } else if (kotlin.jvm.internal.e0.areEqual(o12, this.f32285q)) {
            this.f32287s = this.f32286r;
            this.f32288t = this.f32285q;
        } else if (kotlin.jvm.internal.e0.areEqual(o12, this.f32286r)) {
            this.f32287s = this.f32285q;
            this.f32288t = this.f32286r;
        }
    }

    public final void L() {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        O1 o12 = this.f32285q;
        if (o12 != null) {
            o12.K0();
        }
        O1 o13 = this.f32286r;
        if (o13 != null) {
            o13.K0();
        }
    }

    public final void a(Context context, C2788gb pubSettings, String adSize, String logType) throws IllegalStateException {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(pubSettings, "pubSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(adSize, "adSize");
        kotlin.jvm.internal.e0.checkNotNullParameter(logType, "logType");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(this.f32284p, "TAG");
        Y y10 = new Y("banner");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        C2675a0 c2675a0A = y10.d(context instanceof Activity ? "activity" : "others").a(pubSettings.f32882a).c(pubSettings.f32883b).a(pubSettings.f32884c).a(adSize).a(pubSettings.f32885d).e(pubSettings.f32886e).b(pubSettings.f32887f).a();
        String str = pubSettings.f32886e;
        if (str != null) {
            F5 f5P = p();
            if (f5P != null) {
                ((G5) f5P).a();
            }
            a(Wb.a(logType, str, false));
        }
        O1 o12 = this.f32285q;
        if (o12 == null || this.f32286r == null) {
            this.f32285q = new O1(context, c2675a0A, this);
            O1 o13 = new O1(context, c2675a0A, this);
            this.f32286r = o13;
            this.f32288t = this.f32285q;
            this.f32287s = o13;
        } else {
            o12.a(context, c2675a0A, this);
            O1 o14 = this.f32286r;
            if (o14 != null) {
                o14.a(context, c2675a0A, this);
            }
        }
        F5 f5P2 = p();
        if (f5P2 != null) {
            O1 o15 = this.f32285q;
            if (o15 != null) {
                o15.a(f5P2);
            }
            O1 o16 = this.f32286r;
            if (o16 != null) {
                o16.a(f5P2);
            }
            F5 f5P3 = p();
            if (f5P3 != null) {
                String TAG = this.f32284p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f5P3).a(TAG, "adding mBannerAdUnit1 to reference tracker");
            }
            EnumC2784g7 enumC2784g7 = Wb.f32456a;
            O1 o17 = this.f32285q;
            kotlin.jvm.internal.e0.checkNotNull(o17);
            Wb.a(o17, p());
            F5 f5P4 = p();
            if (f5P4 != null) {
                String TAG2 = this.f32284p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f5P4).a(TAG2, "adding mBannerAdUnit2 to reference tracker");
            }
            O1 o18 = this.f32286r;
            kotlin.jvm.internal.e0.checkNotNull(o18);
            Wb.a(o18, p());
        }
        WatermarkData watermarkDataT = t();
        if (watermarkDataT != null) {
            O1 o19 = this.f32285q;
            if (o19 != null) {
                o19.a(watermarkDataT);
            }
            O1 o110 = this.f32286r;
            if (o110 != null) {
                o110.a(watermarkDataT);
            }
        }
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void b(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "onAdFetchSuccess ", this));
        }
        d(info);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        O1 o12 = this.f32288t;
        if ((o12 != null ? o12.m() : null) == null) {
            F5 f5P2 = p();
            if (f5P2 != null) {
                String TAG = this.f32284p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f5P2).b(TAG, "backgroundAdUnit ad object is null");
            }
            a((U0) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        F5 f5P3 = p();
        if (f5P3 != null) {
            String TAG2 = this.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f5P3).a(TAG2, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        s().post(new zk.y(this, info, 1));
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "onAdLoadSucceeded ", this));
        }
        super.c(info);
        a((byte) 0);
        F5 f5P2 = p();
        if (f5P2 != null) {
            String TAG = this.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P2).a(TAG, "Ad load successful, providing callback");
        }
        s().post(new zk.y(this, info, 0));
    }

    @Override // com.inmobi.media.Ve
    public U0 j() {
        return I() ? this.f32287s : this.f32288t;
    }

    public final boolean x() {
        O1 o12;
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "canProceedForSuccess ", this));
        }
        if (this.f32287s != null && (o12 = this.f32288t) != null) {
            o12.R();
        }
        return true;
    }

    public final boolean y() {
        O1 o12;
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "canScheduleRefresh ", this));
        }
        O1 o13 = this.f32288t;
        if (o13 == null) {
            return false;
        }
        Byte bValueOf = Byte.valueOf(o13.R());
        if (bValueOf.byteValue() != 4 && bValueOf.byteValue() != 1 && bValueOf.byteValue() != 2 && ((o12 = this.f32287s) == null || o12.R() != 7)) {
            return true;
        }
        F5 f5P2 = p();
        if (f5P2 != null) {
            String TAG = this.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P2).a(TAG, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void z() {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).a(str, S1.a(str, "TAG", "clear ", this));
        }
        L();
        O1 o12 = this.f32285q;
        if (o12 != null) {
            o12.g();
        }
        this.f32285q = null;
        O1 o13 = this.f32286r;
        if (o13 != null) {
            o13.g();
        }
        this.f32286r = null;
        a((F5) null);
        this.f32287s = null;
        this.f32288t = null;
        a((Boolean) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(T1 this$0, AdMetaInfo info) {
        tu.x0 x0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String TAG = this$0.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(info);
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            this$0.b((short) 2184);
        }
    }

    @Override // com.inmobi.media.Ve, com.inmobi.media.H0
    public void b() {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "onAdDismissed ", this));
        }
        a((byte) 0);
        F5 f5P2 = p();
        if (f5P2 != null) {
            String TAG = this.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P2).d(TAG, "AdManager state - CREATED");
        }
        super.b();
    }

    private final void b(RelativeLayout relativeLayout) {
        C2675a0 c2675a0J;
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).a(str, S1.a(str, "TAG", "displayInternal ", this));
        }
        O1 o12 = this.f32287s;
        if (o12 == null) {
            return;
        }
        InterfaceC3063x interfaceC3063xK = o12.k();
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = interfaceC3063xK instanceof GestureDetectorOnGestureListenerC3093yc ? (GestureDetectorOnGestureListenerC3093yc) interfaceC3063xK : null;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            return;
        }
        AbstractC3062wf viewableAd = gestureDetectorOnGestureListenerC3093yc.getViewableAd();
        O1 o13 = this.f32287s;
        if (o13 != null && (c2675a0J = o13.J()) != null && c2675a0J.p()) {
            gestureDetectorOnGestureListenerC3093yc.e();
        }
        View viewD = viewableAd.d();
        viewableAd.a(new HashMap());
        ViewParent parent = gestureDetectorOnGestureListenerC3093yc.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            relativeLayout.addView(viewD, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewD, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(T1 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "$info");
        F5 f5P = this$0.p();
        if (f5P != null) {
            String TAG = this$0.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P).a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(info);
            return;
        }
        F5 f5P2 = this$0.p();
        if (f5P2 != null) {
            String TAG2 = this$0.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f5P2).b(TAG2, "callback null");
        }
    }

    public final void b(short s10) {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "submitAdLoadFailed ", this));
        }
        U0 u0J = j();
        if (u0J != null) {
            u0J.b(s10);
        }
    }

    @Override // com.inmobi.media.H0
    public void a(int i10, int i11, GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        ViewParent parent;
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "onShowNextPodAd ", this));
        }
        super.a(i10, i11, gestureDetectorOnGestureListenerC3093yc);
        F5 f5P2 = p();
        if (f5P2 != null) {
            String str2 = this.f32284p;
            ((G5) f5P2).a(str2, AbstractC2803h9.a(str2, "TAG", "on Show next pod ad index: ", i10));
        }
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            try {
                parent = gestureDetectorOnGestureListenerC3093yc.getParent();
            } catch (Exception unused) {
                O1 o12 = this.f32287s;
                if (o12 != null) {
                    o12.g(i11);
                }
                O1 o13 = this.f32287s;
                if (o13 != null) {
                    o13.b(i11, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            O1 o14 = this.f32287s;
            if (o14 != null) {
                o14.b(i11, true);
            }
            b(inMobiBanner);
            s().post(new com.applovin.impl.adview.p(this, i11, 11));
            return;
        }
        O1 o15 = this.f32287s;
        if (o15 != null) {
            o15.g(i11);
        }
        O1 o16 = this.f32287s;
        if (o16 != null) {
            o16.b(i11, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(T1 this$0, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        O1 o12 = this$0.f32287s;
        if (o12 != null) {
            o12.a(i10, false);
        }
    }

    public final void a(PublisherCallbacks callbacks, String adSize, boolean z10) {
        O1 o12;
        kotlin.jvm.internal.e0.checkNotNullParameter(callbacks, "callbacks");
        kotlin.jvm.internal.e0.checkNotNullParameter(adSize, "adSize");
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "load 1 ", this));
        }
        if (kotlin.jvm.internal.e0.areEqual(u(), Boolean.FALSE)) {
            b(this.f32288t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            O1 o13 = this.f32288t;
            if (o13 != null) {
                o13.a((short) 2006);
            }
            AbstractC2902n7.a((byte) 1, this.f32283o, "Cannot call load() API after calling load(byte[])");
            F5 f5P2 = p();
            if (f5P2 != null) {
                String TAG = this.f32284p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f5P2).b(TAG, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        a(Boolean.TRUE);
        if (l() == null) {
            b(callbacks);
        }
        O1 o14 = this.f32288t;
        if (o14 == null || !a(this.f32283o, String.valueOf(o14.J()), callbacks) || (o12 = this.f32288t) == null || !o12.e(o())) {
            return;
        }
        F5 f5P3 = p();
        if (f5P3 != null) {
            String TAG2 = this.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f5P3).d(TAG2, "AdManager state - LOADING");
        }
        a((byte) 1);
        d(null);
        O1 o15 = this.f32288t;
        kotlin.jvm.internal.e0.checkNotNull(o15);
        o15.e(adSize);
        O1 o16 = this.f32288t;
        kotlin.jvm.internal.e0.checkNotNull(o16);
        o16.e(z10);
    }

    @Override // com.inmobi.media.Ve
    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        O1 o12;
        kotlin.jvm.internal.e0.checkNotNullParameter(callbacks, "callbacks");
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).a(str, S1.a(str, "TAG", "load 2 ", this));
        }
        if (kotlin.jvm.internal.e0.areEqual(u(), Boolean.TRUE)) {
            AbstractC2902n7.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            F5 f5P2 = p();
            if (f5P2 != null) {
                String TAG = this.f32284p;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f5P2).b(TAG, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        a(Boolean.FALSE);
        a((byte) 1);
        b(callbacks);
        if (this.f32288t != null) {
            O1 o13 = this.f32287s;
            if ((o13 == null || !o13.Z()) && (o12 = this.f32288t) != null && o12.e((byte) 1)) {
                F5 f5P3 = p();
                if (f5P3 != null) {
                    String TAG2 = this.f32284p;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f5P3).a(TAG2, "timer started - load banner");
                }
                O1 o14 = this.f32288t;
                if (o14 != null) {
                    o14.f0();
                }
                O1 o15 = this.f32288t;
                if (o15 != null) {
                    o15.a(bArr);
                }
            }
        }
    }

    public final void a(RelativeLayout banner) {
        C2675a0 c2675a0J;
        kotlin.jvm.internal.e0.checkNotNullParameter(banner, "banner");
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).a(str, S1.a(str, "TAG", "displayAd ", this));
        }
        O1 o12 = this.f32287s;
        InterfaceC3063x interfaceC3063xK = o12 != null ? o12.k() : null;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = interfaceC3063xK instanceof GestureDetectorOnGestureListenerC3093yc ? (GestureDetectorOnGestureListenerC3093yc) interfaceC3063xK : null;
        if (gestureDetectorOnGestureListenerC3093yc == null) {
            return;
        }
        AbstractC3062wf viewableAd = gestureDetectorOnGestureListenerC3093yc.getViewableAd();
        O1 o13 = this.f32287s;
        if (o13 != null && (c2675a0J = o13.J()) != null && c2675a0J.p()) {
            gestureDetectorOnGestureListenerC3093yc.e();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3093yc.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewD = viewableAd.d();
        viewableAd.a(new HashMap());
        O1 o14 = this.f32288t;
        if (o14 != null) {
            o14.G0();
        }
        O1 o15 = this.f32287s;
        if (o15 != null && o15.R() == 8) {
            View view = new View(banner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(-16777216);
            a(viewGroup, banner, layoutParams, view);
            J();
        } else {
            a(viewGroup, banner, layoutParams, viewD);
        }
        O1 o16 = this.f32288t;
        if (o16 != null) {
            o16.g();
        }
    }

    private static final void a(ViewGroup viewGroup, RelativeLayout relativeLayout, RelativeLayout.LayoutParams layoutParams, View view) {
        if (viewGroup == null) {
            relativeLayout.addView(view, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(view, layoutParams);
        }
    }

    @Override // com.inmobi.media.Ve
    public void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        O1 o12 = this.f32285q;
        if (o12 != null) {
            o12.a(watermarkData);
        }
        O1 o13 = this.f32286r;
        if (o13 != null) {
            o13.a(watermarkData);
        }
    }

    public final int a(int i10, int i11) {
        AdConfig adConfigJ;
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "getRefreshInterval ", this));
        }
        O1 o12 = this.f32288t;
        return (o12 == null || (adConfigJ = o12.j()) == null) ? i11 : i10 < adConfigJ.getMinimumRefreshInterval() ? adConfigJ.getMinimumRefreshInterval() : i10;
    }

    public final boolean a(long j10) {
        F5 f5P = p();
        if (f5P != null) {
            String str = this.f32284p;
            ((G5) f5P).c(str, S1.a(str, "TAG", "checkForRefreshRate ", this));
        }
        O1 o12 = this.f32288t;
        if (o12 == null) {
            return false;
        }
        AdConfig adConfigJ = o12.j();
        kotlin.jvm.internal.e0.checkNotNull(adConfigJ);
        int minimumRefreshInterval = adConfigJ.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        F5 f5P2 = p();
        if (f5P2 != null) {
            String TAG = this.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f5P2).b(TAG, "Early refresh request");
        }
        b(this.f32288t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String TAG2 = this.f32284p;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
        StringBuilder sb2 = new StringBuilder("Ad cannot be refreshed before ");
        sb2.append(minimumRefreshInterval);
        sb2.append(" seconds (AdPlacement Id = ");
        O1 o13 = this.f32288t;
        sb2.append(o13 != null ? o13.J() : null);
        sb2.append(')');
        AbstractC2902n7.a((byte) 1, TAG2, sb2.toString());
        F5 f5P3 = p();
        if (f5P3 != null) {
            String TAG3 = this.f32284p;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
            StringBuilder sb3 = new StringBuilder("Ad cannot be refreshed before ");
            sb3.append(minimumRefreshInterval);
            sb3.append(" seconds (AdPlacement Id = ");
            O1 o14 = this.f32288t;
            sb3.append(o14 != null ? o14.J() : null);
            sb3.append(')');
            ((G5) f5P3).b(TAG3, sb3.toString());
        }
        return false;
    }
}
