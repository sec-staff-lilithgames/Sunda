package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.m8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2886m8 extends U0 {
    public static final /* synthetic */ int S = 0;
    public WeakReference P;
    public boolean Q;
    public int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2886m8(Context context, C2675a0 placement, C2769f9 c2769f9) {
        super(context, placement, c2769f9);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
        placement.l();
        a(context, placement, c2769f9);
    }

    public final void E0() {
        try {
            super.g();
        } catch (Exception e10) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                ((G5) f52).b("m8", Qf.a(e10, N6.a("m8", "TAG", "SDK encountered unexpected error in destroying native ad unit; ")));
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void F0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).a("m8", "renderAdPostInternetCheck");
        }
        l0();
        try {
            if (!p0()) {
                W0 w0S = s();
                w0S.getClass();
                w0S.f32421g = SystemClock.elapsedRealtime();
                e0();
                return;
            }
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f53).b("m8", "render ad is blocked");
            }
        } catch (IllegalStateException e10) {
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f54).a("m8", "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.U0
    public final byte K() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public final void a(int i10, GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public final void b() {
    }

    @Override // com.inmobi.media.U0
    public final void d0() {
        if (a0()) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f52).b("m8", "Ad unit is already destroyed! Returning ...");
                return;
            }
            return;
        }
        H0 h0R = r();
        if (g0()) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f53).b("m8", "Some of the dependency libraries for InMobiNative not found");
            }
            if (h0R != null) {
                h0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return;
            }
            return;
        }
        if (1 == R() || 2 == R()) {
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f54).b("m8", "An ad load is already in progress");
                return;
            }
            return;
        }
        F5 f55 = this.f32321j;
        if (f55 != null) {
            StringBuilder sbA = N6.a("m8", "TAG", "Fetching a Native ad for placement id: ");
            sbA.append(J());
            ((G5) f55).a("m8", sbA.toString());
        }
        if (4 == R()) {
            if (!X()) {
                F5 f56 = this.f32321j;
                if (f56 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f56).a("m8", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                if (h0R != null) {
                    Context contextT = t();
                    F5 f57 = this.f32321j;
                    if (f57 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f57).c("m8", "setContainerContext");
                    }
                    InterfaceC3063x interfaceC3063xK = k();
                    if (interfaceC3063xK instanceof C2734d8) {
                        ((C2734d8) interfaceC3063xK).a(contextT);
                    }
                    F5 f58 = this.f32321j;
                    if (f58 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f58).a("m8", "callback - onFetchSuccess");
                    }
                    F5 f59 = this.f32321j;
                    if (f59 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f59).a("m8", "callback - onLoadSuccess");
                    }
                    e(h0R);
                    f(h0R);
                    return;
                }
                return;
            }
            F5 f510 = this.f32321j;
            if (f510 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f510).b("m8", "ad is expired - destroy");
            }
            E0();
        }
        f0();
        super.d0();
    }

    @Override // com.inmobi.media.U0
    public final void k0() {
        if (q0()) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f52).a("m8", "renderAd without internet check");
            }
            F0();
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f53).a("m8", "renderAd");
        }
        a(new C2852k8(this), new C2869l8(this));
    }

    @Override // com.inmobi.media.U0
    public final HashMap o() {
        HashMap map = new HashMap();
        map.put("a-parentViewWidth", String.valueOf(AbstractC2679a4.d().f32674a));
        map.put("a-productVersion", "NS-1.0.0-20160411");
        map.put("trackerType", "url_ping");
        return map;
    }

    @Override // com.inmobi.media.U0
    public final String q() {
        return "native";
    }

    @Override // com.inmobi.media.U0
    public final void s0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "signalSuccess");
        }
        A aW = w();
        int iHashCode = hashCode();
        O8 o82 = new O8(this);
        aW.getClass();
        A.a(iHashCode, o82);
    }

    @Override // com.inmobi.media.U0
    public final void a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        super.a(context);
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "setContainerContext");
        }
        InterfaceC3063x interfaceC3063xK = k();
        if (interfaceC3063xK instanceof C2734d8) {
            ((C2734d8) interfaceC3063xK).a(context);
        }
    }

    @Override // com.inmobi.media.U0
    public final void b(H0 h02) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "handleAdScreenDisplayed");
        }
        if (R() == 4) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f53).d("m8", "AdUnit " + this + " state change - RENDERED");
            }
            d((byte) 6);
        } else if (R() == 6) {
            this.R++;
        }
        F5 f54 = this.f32321j;
        if (f54 != null) {
            ((G5) f54).a("InMobi", "Successfully displayed fullscreen for placement id: " + J());
        }
        if (this.R == 0) {
            if (h02 != null) {
                F5 f55 = this.f32321j;
                if (f55 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f55).a("m8", "callback - onAdDisplayed");
                }
                d(h02);
                return;
            }
            F5 f56 = this.f32321j;
            if (f56 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f56).b("m8", "listener is null. cannot give AdDisplayed callback");
            }
        }
    }

    public final View a(View view, ViewGroup parent, int i10) {
        View view2;
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "getAdView");
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!M4.f32021a.a()) {
                E0();
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f53).b("m8", "dropping because of GDPR");
                    return null;
                }
            } else {
                if (X()) {
                    F5 f54 = this.f32321j;
                    if (f54 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f54).a("m8", "Ad has expired.");
                    }
                    E0();
                    return null;
                }
                if (R() != 4 && R() != 6) {
                    F5 f55 = this.f32321j;
                    if (f55 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f55).b("m8", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                    }
                    AbstractC2902n7.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                    F5 f56 = this.f32321j;
                    if (f56 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f56).b("m8", "Ad Load is not complete");
                    }
                    WeakReference weakReference = this.P;
                    if (weakReference != null && (view2 = (View) weakReference.get()) != null) {
                        View view3 = new View(C2925od.d());
                        view3.setLayoutParams(view2.getLayoutParams());
                        return view3;
                    }
                } else {
                    C2734d8 c2734d8H = H();
                    if (c2734d8H != null) {
                        boolean z10 = this.Q;
                        F5 f57 = c2734d8H.f32749j;
                        if (f57 != null) {
                            String TAG = c2734d8H.f32752m;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                            ((G5) f57).c(TAG, "showOnLockScreen - " + z10);
                        }
                        c2734d8H.D = z10;
                        c2734d8H.B = i10;
                        AbstractC3062wf viewableAd = c2734d8H.getViewableAd();
                        viewA = viewableAd != null ? viewableAd.a(view, parent, true) : null;
                        this.P = new WeakReference(viewA);
                        Handler handlerE = E();
                        if (handlerE != null) {
                            handlerE.post(new zk.n(27, this, viewableAd));
                        }
                    }
                }
            }
            return viewA;
        }
        F5 f58 = this.f32321j;
        if (f58 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f58).b("m8", "getPrimaryView called on background thread");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (short) 2150);
        return null;
    }

    public static final void a(C2886m8 this$0, AbstractC3062wf abstractC3062wf) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f52 = this$0.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).a("m8", "start tracking for impression");
        }
        if (abstractC3062wf != null) {
            abstractC3062wf.a((Map) null);
        }
    }

    @Override // com.inmobi.media.U0
    public final void a(A0 adSet) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSet, "adSet");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "handleAdFetchSuccessful");
        }
        if (R() == 1) {
            e(adSet);
        }
        if (!kotlin.jvm.internal.e0.areEqual("html", F()) && !kotlin.jvm.internal.e0.areEqual("htmlUrl", F()) && !kotlin.jvm.internal.e0.areEqual("unknown", F())) {
            super.a(adSet);
            return;
        }
        a(J(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 57);
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f53).b("m8", "invalid markup. fetch failed");
        }
    }

    @Override // com.inmobi.media.U0
    public final void a(H0 h02) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "handleAdScreenDismissed");
        }
        if (R() == 6) {
            int i10 = this.R;
            if (i10 > 0) {
                this.R = i10 - 1;
            } else {
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f53).d("m8", "AdUnit " + this + " state - READY");
                }
                d((byte) 4);
            }
        }
        F5 f54 = this.f32321j;
        if (f54 != null) {
            ((G5) f54).a("InMobi", "Successfully dismissed fullscreen for placement id: " + J());
        }
        if (this.R == 0 && R() == 4) {
            if (h02 != null) {
                F5 f55 = this.f32321j;
                if (f55 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f55).a("m8", "callback - onAdDismissed");
                }
                h02.b();
            } else {
                F5 f56 = this.f32321j;
                if (f56 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f56).b("m8", "Listener was garbage collected. Unable to give callback");
                }
            }
            F5 f57 = this.f32321j;
            if (f57 != null) {
                ((G5) f57).a();
            }
        }
    }

    @Override // com.inmobi.media.U0
    public final void a(C2675a0 placement, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "handleAssetAvailabilityChanged");
        }
        super.a(placement, z10);
        if (!z10) {
            if (kotlin.jvm.internal.e0.areEqual(J(), placement)) {
                if (2 == R() || 4 == R()) {
                    d((byte) 0);
                    F5 f53 = this.f32321j;
                    if (f53 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f53).d("m8", "AdUnit " + this + " state - CREATED");
                    }
                    H0 h0R = r();
                    if (h0R != null) {
                        h0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.e0.areEqual(J(), placement) || 2 != R() || r() == null || t() == null) {
            return;
        }
        if (b0()) {
            c(true);
            f();
        } else {
            s0();
        }
    }

    @Override // com.inmobi.media.U0
    public final void a(boolean z10, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "onDidParseAfterFetch");
        }
        super.a(z10, status);
        if (R() == 2) {
            H0 h0R = r();
            if (h0R != null) {
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f53).a("m8", "callback - onFetchSuccess");
                }
                e(h0R);
                return;
            }
            return;
        }
        F5 f54 = this.f32321j;
        if (f54 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f54).b("m8", "invalid state - ignore parse callback");
        }
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2994sf
    public final void a(C2793h ad2, boolean z10, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
            ((G5) f52).c("m8", "onVastProcessCompleted");
        }
        try {
            if (!z10) {
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    ((G5) f53).b("m8", AbstractC2803h9.a("m8", "TAG", "VAST processing failed - ", s10));
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
                return;
            }
            try {
                super.a(ad2, z10, s10);
            } catch (IllegalStateException e10) {
                F5 f54 = this.f32321j;
                if (f54 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f54).b("m8", "Exception while onVastProcessCompleted : " + e10.getMessage());
                }
            }
            C2793h c2793hM = m();
            if (c2793hM == null) {
                F5 f55 = this.f32321j;
                if (f55 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f55).b("m8", "current ad is null. failing");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
                return;
            }
            if (U() == 0) {
                if (!c2793hM.G()) {
                    F5 f56 = this.f32321j;
                    if (f56 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                        ((G5) f56).c("m8", "start OMID session for HTML ad");
                    }
                    a(true, (GestureDetectorOnGestureListenerC3093yc) null);
                }
            } else {
                F5 f57 = this.f32321j;
                if (f57 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f57).c("m8", "start OMID session for current AD");
                }
                a(c2793hM);
            }
            if (c2793hM.G()) {
                b(true);
                F5 f58 = this.f32321j;
                if (f58 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                    ((G5) f58).c("m8", "handleInterActive");
                }
                W();
            }
        } catch (Exception e11) {
            F5 f59 = this.f32321j;
            if (f59 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("m8", "TAG");
                ((G5) f59).a("m8", "Exception while loading ad.", e11);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 13);
        }
    }
}
