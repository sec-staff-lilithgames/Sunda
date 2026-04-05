package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import bp.oM.DwaEpyvxz;
import com.amazon.device.ads.DTBMetricReport;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2985s6 extends U0 {
    public int P;
    public boolean Q;
    public C2892me R;
    public kv.a S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2985s6(Context context, C2675a0 adPlacement, H0 h02) {
        super(context, adPlacement, h02);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adPlacement, "adPlacement");
        this.R = new C2892me();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
        adPlacement.l();
        a(context, adPlacement, h02);
        c("activity");
    }

    public static /* synthetic */ void b(C2985s6 c2985s6, H0 h02, Context context, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            context = null;
        }
        c2985s6.c(h02, context);
    }

    public static final void d(C2985s6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.b(this$0.r());
    }

    public static final /* synthetic */ String e() {
        return "s6";
    }

    public final boolean E0() {
        if (g0()) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f52).a("s6", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        H0 h0R = r();
        if (h0R == null) {
            return false;
        }
        byte bR = R();
        if (bR == 1) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).b("InMobiInterstitial", Ve.f32405n + J());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
        } else if (bR == 7 || bR == 6) {
            F5 f54 = this.f32321j;
            if (f54 != null) {
                ((G5) f54).b("InMobiInterstitial", Ve.f32401j + J());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        } else {
            if (bR != 2) {
                if (4 == R()) {
                    if (!X()) {
                        F5 f55 = this.f32321j;
                        if (f55 != null) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                            ((G5) f55).a("s6", "An ad is ready with the ad unit. Signaling ad load success ...");
                        }
                        H0 h0R2 = r();
                        if (h0R2 == null) {
                            F5 f56 = this.f32321j;
                            if (f56 != null) {
                                ((G5) f56).b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                            }
                        } else {
                            e(h0R2);
                            f(h0R2);
                        }
                        return false;
                    }
                    g();
                }
                f0();
                return true;
            }
            if (kotlin.jvm.internal.e0.areEqual("html", F()) || kotlin.jvm.internal.e0.areEqual("htmlUrl", F())) {
                F5 f57 = this.f32321j;
                if (f57 != null) {
                    ((G5) f57).b("InMobiInterstitial", Ve.f32405n + J());
                }
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
            } else {
                e(h0R);
            }
        }
        return false;
    }

    public final boolean F0() {
        F5 f52;
        C2793h c2793hM = m();
        if (c2793hM == null) {
            return false;
        }
        AdConfig adConfigJ = j();
        kotlin.jvm.internal.e0.checkNotNull(adConfigJ);
        boolean zA = c2793hM.a(adConfigJ.getCacheConfig(q()).getTimeToLive());
        if (zA && (f52 = this.f32321j) != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            ((G5) f52).b("s6", "Top ad has expired, failing show of ad.");
        }
        return !zA;
    }

    @Override // com.inmobi.media.U0
    public Integer G() {
        AdConfig adConfigJ = j();
        if (adConfigJ != null) {
            return Integer.valueOf(adConfigJ.getMinimumRefreshInterval());
        }
        return null;
    }

    public final void G0() {
        InterfaceC3063x interfaceC3063xK = k();
        if (interfaceC3063xK == null) {
            return;
        }
        this.Q = true;
        interfaceC3063xK.e();
    }

    public final C2892me H0() {
        return this.R;
    }

    public final boolean I0() {
        return R() == 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r1.equals("html") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0() {
        /*
            r6 = this;
            java.lang.String r0 = "Cannot handle markupType: "
            com.inmobi.media.F5 r1 = r6.f32321j
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "s6"
            if (r1 == 0) goto L14
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r2)
            com.inmobi.media.G5 r1 = (com.inmobi.media.G5) r1
            java.lang.String r4 = "renderAdPostInternetCheck"
            r1.a(r3, r4)
        L14:
            r6.l0()
            boolean r1 = r6.p0()     // Catch: java.lang.IllegalStateException -> L50
            if (r1 == 0) goto L1f
            goto L9d
        L1f:
            com.inmobi.media.W0 r1 = r6.s()     // Catch: java.lang.IllegalStateException -> L50
            r1.getClass()     // Catch: java.lang.IllegalStateException -> L50
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L50
            r1.f32421g = r4     // Catch: java.lang.IllegalStateException -> L50
            r6.e0()     // Catch: java.lang.IllegalStateException -> L50
            java.lang.String r1 = r6.F()     // Catch: java.lang.IllegalStateException -> L50
            int r4 = r1.hashCode()     // Catch: java.lang.IllegalStateException -> L50
            r5 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r4 == r5) goto L6a
            r5 = 3213227(0x3107ab, float:4.50269E-39)
            if (r4 == r5) goto L52
            r5 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r4 == r5) goto L47
            goto L72
        L47:
            java.lang.String r4 = "htmlUrl"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.IllegalStateException -> L50
            if (r1 != 0) goto L5a
            goto L72
        L50:
            r0 = move-exception
            goto L9e
        L52:
            java.lang.String r4 = "html"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.IllegalStateException -> L50
            if (r1 == 0) goto L72
        L5a:
            android.os.Handler r0 = r6.E()     // Catch: java.lang.IllegalStateException -> L50
            if (r0 == 0) goto L9d
            zk.x0 r1 = new zk.x0     // Catch: java.lang.IllegalStateException -> L50
            r4 = 1
            r1.<init>(r6, r4)     // Catch: java.lang.IllegalStateException -> L50
            r0.post(r1)     // Catch: java.lang.IllegalStateException -> L50
            return
        L6a:
            java.lang.String r4 = "inmobiJson"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.IllegalStateException -> L50
            if (r1 != 0) goto L8f
        L72:
            com.inmobi.media.F5 r1 = r6.f32321j     // Catch: java.lang.IllegalStateException -> L50
            if (r1 == 0) goto L9d
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r2)     // Catch: java.lang.IllegalStateException -> L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L50
            r4.<init>(r0)     // Catch: java.lang.IllegalStateException -> L50
            java.lang.String r0 = r6.F()     // Catch: java.lang.IllegalStateException -> L50
            r4.append(r0)     // Catch: java.lang.IllegalStateException -> L50
            java.lang.String r0 = r4.toString()     // Catch: java.lang.IllegalStateException -> L50
            com.inmobi.media.G5 r1 = (com.inmobi.media.G5) r1     // Catch: java.lang.IllegalStateException -> L50
            r1.a(r3, r0)     // Catch: java.lang.IllegalStateException -> L50
            return
        L8f:
            com.inmobi.media.F5 r0 = r6.f32321j     // Catch: java.lang.IllegalStateException -> L50
            if (r0 == 0) goto L9d
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r2)     // Catch: java.lang.IllegalStateException -> L50
            java.lang.String r1 = "Waiting for Vast Processing"
            com.inmobi.media.G5 r0 = (com.inmobi.media.G5) r0     // Catch: java.lang.IllegalStateException -> L50
            r0.a(r3, r1)     // Catch: java.lang.IllegalStateException -> L50
        L9d:
            return
        L9e:
            com.inmobi.media.F5 r1 = r6.f32321j
            if (r1 == 0) goto Lac
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r2)
            com.inmobi.media.G5 r1 = (com.inmobi.media.G5) r1
            java.lang.String r2 = "Exception while loading ad."
            r1.a(r3, r2, r0)
        Lac:
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            r1 = 1
            r2 = 2134(0x856, float:2.99E-42)
            r6.b(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2985s6.J0():void");
    }

    @Override // com.inmobi.media.U0
    public final byte K() {
        return (byte) 1;
    }

    public boolean K0() {
        return 2 == R();
    }

    public final void L0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).c(strE, "submitAdNotReady " + this);
        }
        C2892me c2892me = this.R;
        W0 w0S = s();
        C2793h c2793hV = v();
        String strP = c2793hV != null ? c2793hV.p() : null;
        A0 a0Z = z();
        Boolean boolO = a0Z != null ? a0Z.o() : null;
        String strF = F();
        String strS = null;
        Boolean bool = boolO;
        byte bR = R();
        C2793h c2793hV2 = v();
        if (c2793hV2 != null) {
            strS = c2793hV2.s();
        }
        X adNotReadyMetadata = new X(w0S, strP, bool, strF, bR, strS);
        c2892me.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(adNotReadyMetadata, "adNotReadyMetadata");
        HashMap map = new HashMap();
        long j10 = w0S.f32417c;
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        map.put(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(bR == 0 ? (short) 2204 : bR == 1 ? (short) 2205 : bR == 2 ? (short) 2206 : bR == 3 ? (short) 2207 : bR == 6 ? (short) 2208 : bR == 7 ? (short) 2209 : bR == 8 ? (short) 2242 : (short) 2210));
        if (strF != null) {
            map.put("markupType", strF);
        }
        if (strP != null) {
            map.put("creativeType", strP);
        }
        if (strS != null) {
            map.put("impressionId", strS);
        }
        if (bool != null) {
            map.put("isRewarded", bool);
        }
        String strA = w0S.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", w0S.f32415a.q());
        map.put("networkType", R3.x());
        map.put("plId", Long.valueOf(w0S.f32415a.J().l()));
        map.put("isAdLoaded", Boolean.valueOf(c2892me.f33103a));
        String strM = w0S.f32415a.J().m();
        if (strM != null) {
            map.put("plType", strM);
        }
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("AdNotReady", map, EnumC2993se.f33373a);
    }

    public final void M0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            ((G5) f52).a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + J());
        }
        i();
        s0();
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public void a(int i10, GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
    }

    public final void c(H0 h02, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(h02, context);
        } else {
            ((ExecutorC3020u7) F4.f31772d.getValue()).f33447a.post(new io.bidmachine.media3.exoplayer.b1(this, 28, h02, context));
        }
    }

    @Override // com.inmobi.media.U0
    public void d0() {
        if (E0()) {
            super.d0();
        }
    }

    @Override // com.inmobi.media.Ac
    public synchronized void f(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        super.f(renderView);
        Handler handlerE = E();
        if (handlerE != null) {
            handlerE.post(new zk.x0(this, 2));
        }
    }

    @Override // com.inmobi.media.U0
    public void g() {
        super.g();
        this.S = null;
    }

    @Override // com.inmobi.media.U0
    public void k0() {
        if (q0()) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f52).a("s6", "renderAd without internet check");
            }
            J0();
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            ((G5) f53).a("s6", "renderAd");
        }
        a(new C2952q6(this), new C2968r6(this));
    }

    @Override // com.inmobi.media.U0
    public void l0() {
        super.l0();
        this.P = 0;
    }

    @Override // com.inmobi.media.U0
    public void n(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc) {
        super.n(gestureDetectorOnGestureListenerC3093yc);
        if (!c0()) {
            if (R() == 2) {
                b((byte) 1);
                M0();
                return;
            }
            return;
        }
        int iIndexOf = this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc);
        if (iIndexOf < B()) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f52).a("s6", "Ignoring loaded ad with index " + iIndexOf + " as current rendering index is " + B());
                return;
            }
            return;
        }
        C().add(Integer.valueOf(iIndexOf));
        for (int i10 = 0; i10 < iIndexOf; i10++) {
            if (this.f32318g.get(i10) != null) {
                return;
            }
        }
        if (R() == 2) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).a("s6", AbstractC2803h9.a("s6", "TAG", "Providing success based on index ", iIndexOf));
            }
            b((byte) 1);
            i(iIndexOf);
            M0();
        }
    }

    @Override // com.inmobi.media.U0
    public void p(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        if (!c0() || !a(renderView)) {
            D0();
        }
        super.p(renderView);
    }

    @Override // com.inmobi.media.U0
    public String q() {
        return "int";
    }

    @Override // com.inmobi.media.U0
    public void r0() {
        H0 h0R = r();
        if (h0R != null) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f52).a("s6", "callback - onFetchSuccess");
            }
            e(h0R);
            return;
        }
        b((short) 2188);
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            ((G5) f53).b("s6", "listener is null");
        }
    }

    @Override // com.inmobi.media.U0
    public void s0() {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            ((G5) f52).d("s6", "AdUnit " + this + " state - READY");
        }
        d((byte) 4);
        W0 w0S = s();
        w0S.getClass();
        w0S.f32423i = SystemClock.elapsedRealtime();
        v0();
        A0();
        this.R.f33103a = true;
        H0 h0R = r();
        if (h0R == null || !h0R.a()) {
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            ((G5) f53).a("s6", "signaling Success");
        }
        f(h0R);
    }

    @Override // com.inmobi.media.U0
    public GestureDetectorOnGestureListenerC3093yc x() {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093ycX = super.x();
        if (this.Q && gestureDetectorOnGestureListenerC3093ycX != null) {
            gestureDetectorOnGestureListenerC3093ycX.e();
        }
        return gestureDetectorOnGestureListenerC3093ycX;
    }

    public static final void e(C2985s6 this$0) {
        LinkedList<C2793h> linkedListF;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.t0();
        if (this$0.c0()) {
            A0 a0Z = this$0.z();
            int size = (a0Z == null || (linkedListF = a0Z.f()) == null) ? 0 : linkedListF.size();
            for (int i10 = 1; i10 < size; i10++) {
                this$0.h(this$0.A() + 1);
                this$0.t0();
            }
        }
    }

    public final void b(H0 h02, Context context) {
        if (h02 == null) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                ((G5) f52).b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a(true, (short) 2151);
            return;
        }
        kv.a aVar = this.S;
        if (aVar != null) {
            aVar.invoke();
            return;
        }
        if (R() == 8) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f53).b("s6", "unload has been called on this ad. Dont show. ");
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            AbstractC2902n7.a((byte) 2, "s6", "Failed to show Ad as creative has called unload() on the Ad");
            a(true, (short) 2239);
            return;
        }
        if (!I0()) {
            String str = DwaEpyvxz.Towf;
            AbstractC2902n7.a((byte) 2, "InMobiInterstitial", str);
            F5 f54 = this.f32321j;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f54).b("s6", str);
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            AbstractC2902n7.a((byte) 1, "s6", str);
            a(true, (short) 2152);
            return;
        }
        g(h02);
        d((byte) 6);
        if (!kotlin.jvm.internal.e0.areEqual("html", F()) && !kotlin.jvm.internal.e0.areEqual("htmlUrl", F())) {
            A aW = w();
            int iHashCode = hashCode();
            C2867l6 c2867l6 = new C2867l6(this, h02);
            aW.getClass();
            A.a(iHashCode, c2867l6);
            return;
        }
        if (!X()) {
            a(h02, context);
            return;
        }
        b(h02, (short) 2153);
        InterfaceC3063x interfaceC3063xK = k();
        if (interfaceC3063xK != null) {
            interfaceC3063xK.b();
        }
    }

    public final void a(C2892me c2892me) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c2892me, "<set-?>");
        this.R = c2892me;
    }

    @Override // com.inmobi.media.U0
    public void a(byte[] bArr) {
        if (E0()) {
            super.a(bArr);
        }
    }

    public static final void c(C2985s6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.a(this$0.r());
    }

    public static final void a(C2985s6 this$0, H0 h02, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.b(h02, context);
    }

    @Override // com.inmobi.media.U0
    public void c(String monetizationContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(monetizationContext, "monetizationContext");
        super.c("activity");
    }

    @Override // com.inmobi.media.Ac
    public synchronized void e(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        super.e(renderView);
        Handler handlerE = E();
        if (handlerE != null) {
            handlerE.post(new zk.x0(this, 0));
        }
    }

    public static /* synthetic */ void a(C2985s6 c2985s6, H0 h02, Context context, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            context = null;
        }
        c2985s6.a(h02, context);
    }

    public final void a(H0 h02, Context context) {
        if (context == null) {
            context = t();
        }
        short sB = b(context);
        if (h02 == null) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                ((G5) f52).b("InMobiInterstitial", "Listener was garbage collected.Unable to give callback");
                return;
            }
            return;
        }
        if (sB != 0) {
            a(true, sB);
        } else {
            h02.e();
        }
    }

    public static final void a(C2985s6 this$0, GestureDetectorOnGestureListenerC3093yc renderView, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "$renderView");
        int iIndexOf = this$0.f32318g.indexOf(renderView);
        ArrayList list = this$0.f32318g;
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
        if (iIndexOf < 0 || iIndexOf >= list.size()) {
            return;
        }
        short sB = this$0.b(context);
        if (sB != 0) {
            this$0.g(iIndexOf);
        }
        this$0.b(iIndexOf, sB == 0);
        Handler handlerE = this$0.E();
        if (handlerE != null) {
            handlerE.post(new com.applovin.impl.adview.p(this$0, iIndexOf, 12));
        }
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public void a(GestureDetectorOnGestureListenerC3093yc renderView, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
            ((G5) f52).c(strE, "closeCurrentPodAd " + this);
        }
        if (c0()) {
            Integer numHigher = C().higher(Integer.valueOf(this.f32318g.indexOf(renderView)));
            if (numHigher != null) {
                a(numHigher.intValue(), renderView, context);
            } else {
                b();
            }
        }
    }

    public final short b(Context context) {
        int i10;
        try {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f52).a("s6", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            InterfaceC3063x container = k();
            if (container == null) {
                return (short) 2155;
            }
            if (kotlin.jvm.internal.e0.areEqual("unknown", container.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.f31591k;
            kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
            int iHashCode = container.hashCode();
            InMobiAdActivity.f31591k.put(iHashCode, container);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            F5 obj = this.f32321j;
            if (obj != null) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                HashMap map = AbstractC2984s5.f33365a;
                String key = string.toString();
                kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
                AbstractC2984s5.f33365a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", string.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String str = SFPXhf.kDcIFUjUWLxtofR;
            String strF = F();
            if (kotlin.jvm.internal.e0.areEqual(strF, "html")) {
                i10 = 200;
            } else {
                i10 = kotlin.jvm.internal.e0.areEqual(strF, "htmlUrl") ? 202 : 201;
            }
            intent.putExtra(str, i10);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (c0()) {
                if (D() == -1) {
                    a(System.currentTimeMillis());
                }
                if (A() > 0) {
                    intent.setFlags(603979776);
                }
            }
            C2925od.f33208a.a(context, intent);
            return (short) 0;
        } catch (Exception e10) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return (short) 2154;
        }
    }

    @Override // com.inmobi.media.U0
    public void a(H0 h02) {
        F5 f52 = this.f32321j;
        if (f52 != null) {
            StringBuilder sbA = N6.a("s6", "TAG", "handleAdScreenDismissed ");
            sbA.append((int) R());
            ((G5) f52).c("s6", sbA.toString());
        }
        if (R() == 7) {
            int i10 = this.P - 1;
            this.P = i10;
            if (i10 == 1) {
                d((byte) 6);
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                    ((G5) f53).d("s6", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (R() == 6 || R() == 8) {
            this.P--;
            F5 f54 = this.f32321j;
            if (f54 != null) {
                ((G5) f54).a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + J());
            }
            if (h02 != null) {
                h02.b();
                return;
            }
            F5 f55 = this.f32321j;
            if (f55 != null) {
                ((G5) f55).c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.U0
    public void a(boolean z10, InMobiAdRequestStatus status) {
        String placementType;
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        F5 f52 = this.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            ((G5) f52).c("s6", "onDidParseAfterFetch - parsingResult - " + z10);
        }
        super.a(z10, status);
        if (R() == 2) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                ((G5) f53).a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + J());
            }
            if (kotlin.jvm.internal.e0.areEqual(F(), "inmobiJson") && (placementType = J().m()) != null) {
                EnumC2784g7 enumC2784g7 = Wb.f32456a;
                F5 f54 = this.f32321j;
                kotlin.jvm.internal.e0.checkNotNullParameter("intNative", "logType");
                kotlin.jvm.internal.e0.checkNotNullParameter(placementType, "placementType");
                TelemetryConfig.LoggingConfig loggingConfig = Wb.f32459d.getLoggingConfig();
                if (f54 != null) {
                    EnumC2784g7 logLevel = Wb.a("intNative", placementType, loggingConfig);
                    double dB = Wb.b("intNative", placementType, loggingConfig);
                    E5 config = new E5(logLevel, dB);
                    kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
                    Objects.toString(config);
                    Ub ub2 = ((G5) f54).f31816a;
                    if (ub2 != null) {
                        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
                        Objects.toString(config);
                        Objects.toString(ub2.f32371i);
                        if (!ub2.f32371i.get()) {
                            C2818i7 c2818i7 = ub2.f32367e;
                            c2818i7.getClass();
                            kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
                            c2818i7.f32927a = logLevel;
                            ub2.f32368f.f32981a = dB;
                        }
                    }
                }
            }
            r0();
        }
    }

    @Override // com.inmobi.media.U0
    public void b(H0 h02) {
        if (R() == 6) {
            int i10 = this.P + 1;
            this.P = i10;
            if (i10 == 1) {
                F5 f52 = this.f32321j;
                if (f52 != null) {
                    ((G5) f52).a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + J());
                }
                if (h02 != null) {
                    b((byte) 4);
                    d(h02);
                    return;
                }
                return;
            }
            d((byte) 7);
            return;
        }
        if (R() == 7) {
            this.P++;
        }
    }

    public final void b(H0 h02, short s10) {
        a(true, s10);
        d((byte) 0);
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public void b() {
        if (c0()) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f52).a("s6", "Closing the ad as closeAll is called");
            }
            Handler handlerE = E();
            if (handlerE != null) {
                handlerE.post(new zk.x0(this, 3));
            }
        }
    }

    public static final void b(C2985s6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        F5 f52 = this$0.f32321j;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("U0", "TAG");
            ((G5) f52).a("U0", "clearAdPods " + this$0);
        }
        if (this$0.A) {
            this$0.h();
            this$0.f32318g.clear();
            this$0.f32334w = 0;
            this$0.f32335x = 0;
            this$0.f32337z.clear();
        }
        F5 f53 = this$0.f32321j;
        if (f53 != null) {
            ((G5) f53).c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this$0.J());
        }
        if (this$0.r() != null) {
            H0 h0R = this$0.r();
            if (h0R != null) {
                h0R.b();
                return;
            }
            return;
        }
        F5 f54 = this$0.f32321j;
        if (f54 != null) {
            ((G5) f54).c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2994sf
    public void a(C2793h ad2, boolean z10, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        if (!z10) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
            return;
        }
        try {
            super.a(ad2, z10, s10);
        } catch (IllegalStateException e10) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                StringBuilder sbA = N6.a("s6", "TAG", "Exception while onVastProcessCompleted : ");
                sbA.append(e10.getMessage());
                ((G5) f52).b("s6", sbA.toString());
            }
        }
        C2793h c2793hM = m();
        if (c2793hM == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
        } else if (c2793hM.G()) {
            b(true);
            W();
        } else {
            a(c2793hM);
        }
    }

    @Override // com.inmobi.media.U0
    public void a(C2675a0 placement, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        super.a(placement, z10);
        if (!z10) {
            if (kotlin.jvm.internal.e0.areEqual(J(), placement)) {
                if (2 == R() || 4 == R()) {
                    d((byte) 0);
                    F5 f52 = this.f32321j;
                    if (f52 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                        ((G5) f52).d("s6", "AdUnit " + this + " state - CREATED");
                    }
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (short) 0);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.e0.areEqual(J(), placement) && 2 == R()) {
            F5 f53 = this.f32321j;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f53).a("s6", "Asset are ready now");
            }
            if (b0()) {
                c(true);
                f();
            } else {
                s0();
            }
        }
    }

    @Override // com.inmobi.media.U0
    public void a(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, short s10) {
        super.a(gestureDetectorOnGestureListenerC3093yc, s10);
        if (c0()) {
            int iIndexOf = this.f32318g.indexOf(gestureDetectorOnGestureListenerC3093yc);
            boolean z10 = false;
            U0.a(this, iIndexOf, false, 2, null);
            int size = this.f32318g.size();
            boolean z11 = true;
            boolean z12 = true;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = z11;
                    i10 = -1;
                    break;
                }
                if (i10 != iIndexOf && this.f32318g.get(i10) != null) {
                    if (C().contains(Integer.valueOf(i10))) {
                        break;
                    }
                    z11 = false;
                    z12 = false;
                }
                i10++;
            }
            if (i10 != -1) {
                if (z12 && R() == 2) {
                    b((byte) 1);
                    i(i10);
                    F5 f52 = this.f32321j;
                    if (f52 != null) {
                        StringBuilder sbA = N6.a("s6", "TAG", "Providing success based on currIndex ");
                        sbA.append(B());
                        sbA.append(" as ");
                        sbA.append(iIndexOf);
                        sbA.append(" failed");
                        ((G5) f52).a("s6", sbA.toString());
                    }
                    M0();
                    return;
                }
                return;
            }
            if (z10 && R() == 2) {
                F5 f53 = this.f32321j;
                if (f53 != null) {
                    ((G5) f53).a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + J());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
                return;
            }
            return;
        }
        if (R() == 2) {
            F5 f54 = this.f32321j;
            if (f54 != null) {
                ((G5) f54).a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + J());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public void a(int i10, GestureDetectorOnGestureListenerC3093yc renderView, Context context) {
        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc;
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        if (!c0()) {
            F5 f52 = this.f32321j;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                ((G5) f52).a("s6", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (C().contains(Integer.valueOf(i10)) && i10 > this.f32318g.indexOf(renderView) && i10 < this.f32318g.size() && this.f32318g.get(i10) != null && ((gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) this.f32318g.get(i10)) == null || gestureDetectorOnGestureListenerC3093yc.f33661y0)) {
            if (context == null) {
                context = t();
            }
            super.a(i10, renderView, context);
            Handler handlerE = E();
            if (handlerE != null) {
                handlerE.post(new io.bidmachine.media3.exoplayer.b1(this, 27, renderView, context));
                return;
            }
            return;
        }
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            ((G5) f53).a("s6", "Cannot show an pod ad with invalid index passed");
        }
        b(this.f32318g.indexOf(renderView), false);
    }

    public static final void a(C2985s6 this$0, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.a(i10, false);
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.InterfaceC2692b0
    public boolean a(GestureDetectorOnGestureListenerC3093yc renderView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        if (c0()) {
            if (C().higher(Integer.valueOf(this.f32318g.indexOf(renderView))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.De
    public void a(byte b10) {
        if (b10 == 1) {
            if (c0()) {
                if (R() == 2) {
                    if (C().isEmpty()) {
                        F5 f52 = this.f32321j;
                        if (f52 != null) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                            ((G5) f52).b("s6", "RenderView time out, none of the ad provided success");
                        }
                        h();
                        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                        return;
                    }
                    b((byte) 1);
                    F5 f53 = this.f32321j;
                    if (f53 != null) {
                        StringBuilder sbA = N6.a("s6", "TAG", "RenderView time out, providing success based on ");
                        sbA.append(C().first());
                        ((G5) f53).a("s6", sbA.toString());
                    }
                    Integer numFirst = C().first();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(numFirst, "first(...)");
                    i(numFirst.intValue());
                    M0();
                    int size = this.f32318g.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (!C().contains(Integer.valueOf(i10))) {
                            U0.a(this, i10, false, 2, null);
                        }
                    }
                    return;
                }
                h();
                return;
            }
            super.a(b10);
            return;
        }
        super.a(b10);
    }

    @Override // com.inmobi.media.U0, com.inmobi.media.Ac
    public void a(GestureDetectorOnGestureListenerC3093yc renderView, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z10);
        byte bR = R();
        if (bR == 4) {
            this.S = new C2935p6(this, z10 ? (short) 2220 : (short) 2219);
            return;
        }
        if (bR != 6) {
            if (bR == 7) {
                short s10 = z10 ? (short) 2224 : (short) 2223;
                AbstractC2902n7.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                F5 f52 = this.f32321j;
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
                    ((G5) f52).b("s6", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z10, s10);
                renderView.n();
                a(r());
                return;
            }
            return;
        }
        short s11 = z10 ? (short) 2222 : (short) 2221;
        AbstractC2902n7.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        F5 f53 = this.f32321j;
        if (f53 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("s6", "TAG");
            ((G5) f53).b("s6", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        renderView.n();
        if (this.P == 0) {
            a(true, s11);
        } else {
            renderView.a(z10, s11);
            a(r());
        }
    }
}
