package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import be.nVUQ.UupKET;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class O1 extends U0 implements Application.ActivityLifecycleCallbacks {
    public final String P;
    public final String Q;
    public boolean R;
    public int S;
    public final P1 T;

    public static final void c(O1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f52 = this$0.f32321j;
        if (f52 != null) {
            String TAG = this$0.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "start loading html ad");
        }
        this$0.t0();
    }

    public static final void d(O1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.R() == 7) {
                int i10 = this$0.S - 1;
                this$0.S = i10;
                if (i10 == 0) {
                    this$0.d((byte) 6);
                    H0 h0R = this$0.r();
                    if (h0R != null) {
                        h0R.b();
                    }
                }
            }
        } catch (Exception e10) {
            F5 f52 = this$0.f32321j;
            if (f52 != null) {
                String str = this$0.P;
                ((G5) f52).b(str, Qf.a(e10, N6.a(str, "TAG", "BannerAdUnit.onAdScreenDismissed threw unexpected error: ")));
            }
        }
    }

    public static final void e(O1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.R() != 6) {
                if (this$0.R() == 7) {
                    this$0.S++;
                    return;
                }
                return;
            }
            this$0.S++;
            this$0.d((byte) 7);
            F5 f52 = this$0.f32321j;
            if (f52 != null) {
                String TAG = this$0.P;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).d(TAG, "AdUnit " + this$0 + " state - ACTIVE");
            }
            F5 f53 = this$0.f32321j;
            if (f53 != null) {
                ((G5) f53).c(this$0.Q, "Successfully displayed banner ad for placement Id : " + this$0.J());
            }
            H0 h0R = this$0.r();
            if (h0R != null) {
                this$0.d(h0R);
            }
        } catch (Exception e10) {
            F5 f54 = this$0.f32321j;
            if (f54 != null) {
                String str = this$0.P;
                ((G5) f54).b(str, Qf.a(e10, N6.a(str, "TAG", "BannerAdUnit.onAdScreenDisplayed threw unexpected error: ")));
            }
        }
    }

    public static final void f(O1 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.R() == 4) {
                this$0.d((byte) 6);
                F5 f52 = this$0.f32321j;
                if (f52 != null) {
                    String TAG = this$0.P;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).d(TAG, "AdUnit " + this$0 + " state - RENDERED");
                }
            }
        } catch (Exception e10) {
            F5 f53 = this$0.f32321j;
            if (f53 != null) {
                String str = this$0.P;
                ((G5) f53).b(str, Qf.a(e10, N6.a(str, "TAG", "BannerAdUnit.onRenderViewVisible threw unexpected error: ")));
            }
        }
    }

    public static final void g(O1 this$0) {
        LinkedList<C2793h> linkedListF;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (this$0.c0()) {
            this$0.a(System.currentTimeMillis());
            A0 a0Z = this$0.z();
            if (a0Z != null && (linkedListF = a0Z.f()) != null) {
                int i10 = 0;
                for (Object obj : linkedListF) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        uu.p0.throwIndexOverflow();
                    }
                    this$0.C().add(Integer.valueOf(i10));
                    i10 = i11;
                }
            }
        }
        this$0.t0();
    }

    public boolean E0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "canProceedToLoad ", this));
        }
        if (g0()) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                String TAG = this.P;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f53).b(TAG, "Some of the dependency libraries for Banner not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        if (1 == R() || 2 == R()) {
            AbstractC2902n7.a((byte) 1, this.Q, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            F5 f54 = this.f32321j;
            if (f54 != null) {
                String TAG2 = this.P;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f54).b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == R()) {
                a((short) 2008);
            } else {
                a((short) 2011);
            }
            return false;
        }
        if (7 == R()) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            F5 f55 = this.f32321j;
            if (f55 != null) {
                String str2 = this.P;
                StringBuilder sbA = N6.a(str2, "TAG", Ve.f32401j);
                sbA.append(J().l());
                ((G5) f55).b(str2, sbA.toString());
            }
            return false;
        }
        F5 f56 = this.f32321j;
        if (f56 != null) {
            ((G5) f56).c(this.Q, "Fetching a Banner ad for placement id: " + J());
        }
        f0();
        return true;
    }

    public final boolean F0() {
        return R() == 7;
    }

    public final void G0() {
        AbstractC3062wf viewableAd;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).a(str, L1.a(str, "TAG", "onPause ", this));
        }
        byte bR = R();
        if (bR == 4 || bR == 6 || bR == 7) {
            InterfaceC3063x interfaceC3063xK = k();
            Context contextT = t();
            if (interfaceC3063xK == null || contextT == null || (viewableAd = interfaceC3063xK.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextT, (byte) 1);
        }
    }

    public final void H0() {
        AbstractC3062wf viewableAd;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).a(str, L1.a(str, "TAG", "onResume ", this));
        }
        byte bR = R();
        if (bR == 4 || bR == 6 || bR == 7) {
            InterfaceC3063x interfaceC3063xK = k();
            Context contextT = t();
            if (interfaceC3063xK == null || contextT == null || (viewableAd = interfaceC3063xK.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextT, (byte) 0);
        }
    }

    public final void I0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        Context contextT = t();
        if (contextT != null) {
            C2925od.a(contextT, this);
        }
    }

    public final void J0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String TAG = this.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (p0()) {
                return;
            }
            W0 w0S = s();
            w0S.getClass();
            w0S.f32421g = SystemClock.elapsedRealtime();
            e0();
            Handler handlerE = E();
            if (handlerE != null) {
                handlerE.post(new zk.v(this, 3));
            }
        } catch (IllegalStateException e10) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                String TAG2 = this.P;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).a(TAG2, "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.U0
    public final byte K() {
        return (byte) 0;
    }

    public final void K0() {
        Application application;
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        Context contextT = t();
        Activity activity = contextT instanceof Activity ? (Activity) contextT : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.U0
    public void d0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).a(str, L1.a(str, "TAG", "load ", this));
        }
        if (E0()) {
            super.d0();
        }
    }

    @Override // com.inmobi.media.U0
    public boolean g0() {
        F5 f52 = this.f32321j;
        if (f52 == null) {
            return false;
        }
        String str = this.P;
        ((G5) f52).c(str, L1.a(str, "TAG", "missingPrerequisitesForAd ", this));
        return false;
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.Ac
    public void j(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onRenderViewVisible ", this));
        }
        super.j(renderView);
        Handler handlerE = E();
        if (handlerE != null) {
            handlerE.post(new zk.v(this, 4));
        }
    }

    @Override // com.inmobi.media.U0
    public void k0() {
        if (q0()) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                String TAG = this.P;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).a(TAG, "renderAd without internet check");
            }
            J0();
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            String TAG2 = this.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "renderAd");
        }
        a(new M1(this), new N1(this));
    }

    @Override // com.inmobi.media.U0
    public final HashMap o() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "adSpecificRequestParams getter ", this));
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.R ? "1" : "0");
        map.put("mk-ad-slot", J().a());
        return map;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onActivityCreated ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onActivityDestroyed ", this));
        }
        Context contextT = t();
        if (kotlin.jvm.internal.e0.areEqual(contextT, activity)) {
            kotlin.jvm.internal.e0.checkNotNull(contextT, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextT).getApplication().unregisterActivityLifecycleCallbacks(this);
            g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onActivityPaused ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onActivityResumed ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(outState, "outState");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onActivitySaveInstanceState ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onActivityStarted ", this));
        }
        if (kotlin.jvm.internal.e0.areEqual(t(), activity)) {
            H0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onActivityStopped ", this));
        }
        if (kotlin.jvm.internal.e0.areEqual(t(), activity)) {
            G0();
        }
    }

    @Override // com.inmobi.media.U0
    public void p(GestureDetectorOnGestureListenerC3093yc renderView) {
        int iIndexOf;
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        if (c0() && (iIndexOf = this.f32318g.indexOf(renderView)) > B() && renderView.G != Cf.f31718c) {
            C().remove(Integer.valueOf(iIndexOf));
        } else {
            D0();
            super.p(renderView);
        }
    }

    @Override // com.inmobi.media.U0
    public String q() {
        return "banner";
    }

    @Override // com.inmobi.media.U0
    public GestureDetectorOnGestureListenerC3093yc x() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "htmlAdContainer getter ", this));
        }
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycX = super.x();
        if (J().p() && gestureDetectorOnGestureListenerC3093ycX != null) {
            gestureDetectorOnGestureListenerC3093ycX.e();
        }
        return gestureDetectorOnGestureListenerC3093ycX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(Context context, C2675a0 c2675a0, H0 h02) {
        super(context, c2675a0, h02);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(c2675a0, QFzuMMDfrzagDN.AtxVzpYzgEVZUQ);
        this.P = "O1";
        this.Q = "InMobi";
        this.T = new P1();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("O1", "TAG");
        c2675a0.l();
        a(context, c2675a0, h02);
    }

    @Override // com.inmobi.media.U0
    public void a(boolean z10, InMobiAdRequestStatus status) {
        H0 h0R;
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        super.a(z10, status);
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).c(str, L1.a(str, "TAG", "onDidParseAfterFetch ", this));
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            ((G5) f53).c(this.Q, "Banner ad fetch successful for placement id: " + J());
        }
        if (R() != 2 || (h0R = r()) == null) {
            return;
        }
        e(h0R);
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public void b() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).a(str, L1.a(str, "TAG", "closeAll ", this));
        }
    }

    @Override // com.inmobi.media.U0
    public final void n(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).a(str, L1.a(str, "TAG", "handleRenderViewSignaledAdReady ", this));
        }
        super.n(gestureDetectorOnGestureListenerC3093yc);
        if (c0() && this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc) > 0 && R() == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(B());
            if (gestureDetectorOnGestureListenerC3093yc2 != null) {
                gestureDetectorOnGestureListenerC3093yc2.a(true);
                return;
            }
            return;
        }
        if (R() != 2) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                String str2 = this.P;
                StringBuilder sbA = N6.a(str2, "TAG", "AdUnit is not in available state, ignoring the ad ready signal - ");
                sbA.append((int) R());
                ((G5) f53).a(str2, sbA.toString());
                return;
            }
            return;
        }
        b((byte) 1);
        d((byte) 4);
        F5 f54 = this.f32321j;
        if (f54 != null) {
            String TAG = this.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f54).d(TAG, UupKET.wiXoukrfyED + this + " state - READY");
        }
        W0 w0S = s();
        w0S.getClass();
        w0S.f32423i = SystemClock.elapsedRealtime();
        v0();
        A0();
        F5 f55 = this.f32321j;
        if (f55 != null) {
            ((G5) f55).c(this.Q, "Successfully loaded Banner ad markup in the WebView for placement id: " + J());
        }
        H0 h0R = r();
        if (h0R != null) {
            f(h0R);
        } else {
            F5 f56 = this.f32321j;
            if (f56 != null) {
                String TAG2 = this.P;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f56).b(TAG2, "AdUnit listener is null");
            }
        }
        i();
    }

    @Override // com.inmobi.media.U0
    public void g() {
        this.T.f32119a = false;
        super.g();
    }

    @Override // com.inmobi.media.Ac
    public synchronized void f(GestureDetectorOnGestureListenerC3093yc renderView) {
        try {
            kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
            F5 f52 = this.f32321j;
            if (f52 != null) {
                String str = this.P;
                ((G5) f52).a(str, L1.a(str, "TAG", "onAdScreenDisplayed ", this));
            }
            super.f(renderView);
            Handler handlerE = E();
            if (handlerE != null) {
                handlerE.post(new zk.v(this, 2));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final void a(O1 this$0, GestureDetectorOnGestureListenerC3093yc renderView, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "$renderView");
        int iIndexOf = this$0.f32318g.indexOf(renderView);
        try {
            H0 h0R = this$0.r();
            F5 f52 = this$0.f32321j;
            if (f52 != null) {
                String TAG = this$0.P;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).c(TAG, "callback onShowNextPodAd");
            }
            if (h0R != null) {
                h0R.a(i10, iIndexOf, renderView);
            }
        } catch (Exception unused) {
            this$0.b(iIndexOf, false);
            this$0.g(iIndexOf);
        }
    }

    public final void e(boolean z10) {
        F5 f52;
        F5 f53 = this.f32321j;
        if (f53 != null) {
            String str = this.P;
            ((G5) f53).a(str, L1.a(str, "TAG", "load ", this));
        }
        if (z10 && (f52 = this.f32321j) != null) {
            ((G5) f52).c(this.Q, "Initiating Banner refresh for placement id: " + J());
        }
        this.R = z10;
        d0();
    }

    @Override // com.inmobi.media.U0
    public final void a(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, short s10) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).a(str, L1.a(str, "TAG", "handleRenderViewSignaledAdFailed ", this));
        }
        super.a(gestureDetectorOnGestureListenerC3093yc, s10);
        if (c0()) {
            int iIndexOf = this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc);
            U0.a(this, iIndexOf, false, 2, null);
            if (iIndexOf > 0 && R() == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(B());
                if (gestureDetectorOnGestureListenerC3093yc2 != null) {
                    gestureDetectorOnGestureListenerC3093yc2.a(false);
                }
            }
        }
        if (R() == 2) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).c(this.Q, "Failed to load the Banner markup in the WebView for placement id: " + J());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.Ac
    public synchronized void e(GestureDetectorOnGestureListenerC3093yc renderView) {
        try {
            kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
            F5 f52 = this.f32321j;
            if (f52 != null) {
                String str = this.P;
                ((G5) f52).a(str, L1.a(str, "TAG", "onAdScreenDismissed ", this));
            }
            super.e(renderView);
            Handler handlerE = E();
            if (handlerE != null) {
                handlerE.post(new zk.v(this, 0));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e(String str) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str2 = this.P;
            ((G5) f52).c(str2, L1.a(str2, "TAG", "setAdSize ", this));
        }
        C2675a0 c2675a0J = J();
        kotlin.jvm.internal.e0.checkNotNull(str);
        c2675a0J.a(str);
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public void a(int i10, GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String str = this.P;
            ((G5) f52).a(str, L1.a(str, "TAG", "loadPodAd ", this));
        }
        if (C().contains(Integer.valueOf(i10)) && i10 > this.f32318g.indexOf(renderView)) {
            h(i10);
            Handler handlerE = E();
            if (handlerE != null) {
                handlerE.post(new zk.v(this, 1));
                return;
            }
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            String TAG = this.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).a(TAG, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.f32318g;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) arrayList.get(arrayList.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC3093yc != null) {
            gestureDetectorOnGestureListenerC3093yc.a(false);
        }
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public void a(int i10, GestureDetectorOnGestureListenerC3093yc renderView, Context context) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String TAG = this.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "showPodAdAtIndex " + this + " index - " + i10);
        }
        if (!c0()) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                String TAG2 = this.P;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                ((G5) f53).b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.f32318g;
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = (GestureDetectorOnGestureListenerC3093yc) arrayList.get(arrayList.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC3093yc2 != null) {
                gestureDetectorOnGestureListenerC3093yc2.b(false);
                return;
            }
            return;
        }
        F5 f54 = this.f32321j;
        if (f54 != null) {
            String TAG3 = this.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
            ((G5) f54).c(TAG3, "isInValidShowPodIndex " + i10 + ' ' + C() + ' ' + this.f32318g.indexOf(renderView) + ' ' + this + ' ');
        }
        if (C().contains(Integer.valueOf(i10)) && i10 > this.f32318g.indexOf(renderView) && this.f32318g.get(i10) != null && ((gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(i10)) == null || gestureDetectorOnGestureListenerC3093yc.f33661y0)) {
            super.a(i10, renderView, context);
            Handler handlerE = E();
            if (handlerE != null) {
                handlerE.post(new androidx.browser.customtabs.h(this, renderView, i10, 15));
                return;
            }
            return;
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            String TAG4 = this.P;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
            ((G5) f55).b(TAG4, "Cannot show an pod ad with invalid index passed");
        }
        ArrayList arrayList2 = this.f32318g;
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc3 = (GestureDetectorOnGestureListenerC3093yc) arrayList2.get(arrayList2.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC3093yc3 != null) {
            gestureDetectorOnGestureListenerC3093yc3.b(false);
        }
    }

    @Override // com.inmobi.media.Ac
    public void a(F1 audioStatusInternal) {
        kotlin.jvm.internal.e0.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        H0 h0R = r();
        if (h0R != null) {
            h0R.a(audioStatusInternal);
        }
        P1 p12 = this.T;
        p12.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!p12.f32119a && audioStatusInternal == F1.f31764e) {
            p12.f32119a = true;
            B5 b52 = B5.f31649c;
            b52.f32338a = System.currentTimeMillis();
            b52.f32339b++;
        }
    }

    @Override // com.inmobi.media.Ac
    public void a(boolean z10) {
        B5 b52 = B5.f31649c;
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6 i6A = H6.a(contextD, "banner_audio_pref_file");
        kotlin.jvm.internal.e0.checkNotNullParameter("user_mute_count", C3191e4.h.W);
        int i10 = i6A.f31866a.getInt("user_mute_count", 0);
        I6.a(i6A, "user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false, 4, (Object) null);
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.Ac
    public void a(GestureDetectorOnGestureListenerC3093yc renderView, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z10);
        byte bR = R();
        if (bR != 4 && bR != 6) {
            if (bR == 7) {
                renderView.a(z10, R() == 7 ? z10 ? (short) 2224 : (short) 2223 : (short) 2227);
                return;
            }
            return;
        }
        byte bR2 = R();
        if (bR2 == 4) {
            s = z10 ? (short) 2220 : (short) 2219;
        } else if (bR2 == 6) {
            s = z10 ? (short) 2222 : (short) 2221;
        }
        n0();
        renderView.a(z10, s);
    }
}
