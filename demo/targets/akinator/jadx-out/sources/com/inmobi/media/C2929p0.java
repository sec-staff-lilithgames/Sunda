package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2929p0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f33233a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f33234b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f33235c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f33236d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f33237e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f33238f;

    /* renamed from: g, reason: collision with root package name */
    public AdQualityControl f33239g;

    /* renamed from: h, reason: collision with root package name */
    public Cf f33240h;

    /* renamed from: i, reason: collision with root package name */
    public AdQualityResult f33241i;

    /* renamed from: j, reason: collision with root package name */
    public String f33242j;

    /* renamed from: k, reason: collision with root package name */
    public JSONObject f33243k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f33244l;

    public C2929p0(AdConfig.AdQualityConfig adQualityConfig, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f33233a = adQualityConfig;
        this.f33234b = f52;
        this.f33235c = new AtomicBoolean(false);
        this.f33236d = new AtomicBoolean(false);
        this.f33237e = new AtomicBoolean(false);
        this.f33238f = new CopyOnWriteArrayList();
        this.f33240h = Cf.f31716a;
        this.f33242j = "";
        this.f33243k = new JSONObject();
        this.f33244l = new AtomicBoolean(false);
    }

    public final boolean a() {
        if (this.f33235c.get()) {
            a(NyKZx.sReX);
            return false;
        }
        if (!this.f33233a.getEnabled()) {
            a("config kill switch - false. ad quality will skip");
            return false;
        }
        if (this.f33239g == null) {
            a("setup not done. skipping");
            return false;
        }
        Cf cf2 = this.f33240h;
        if (cf2 != Cf.f31716a && cf2 != Cf.f31717b) {
            return true;
        }
        a("ad view is not visible. skipping");
        return false;
    }

    public final void a(AdQualityResult adQualityResult, boolean z10) {
        if (adQualityResult.getBeaconUrl().length() == 0) {
            a("beacon is empty");
            return;
        }
        Pb process = new Pb(adQualityResult);
        C2827j0 c2827j0 = new C2827j0(this, z10);
        C2844k0 shouldProcess = C2844k0.f32993a;
        kotlin.jvm.internal.e0.checkNotNullParameter(process, "process");
        kotlin.jvm.internal.e0.checkNotNullParameter(shouldProcess, "shouldProcess");
        ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
        C2777g0.a(0L, new C2725d(shouldProcess, process, c2827j0));
    }

    public final void a(GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc, long j10, boolean z10, C2738dc c2738dc) {
        a("isCapture started - " + this.f33244l.get() + ", isReporting - " + z10);
        if (this.f33244l.get() && !z10) {
            a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            gestureDetectorOnGestureListenerC3093yc.post(new zk.q0(this, gestureDetectorOnGestureListenerC3093yc, j10, z10, c2738dc, 0));
        }
    }

    public static final void a(C2929p0 this$0, View adView, long j10, boolean z10, C2738dc c2738dc) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adView, "$adView");
        kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityManager", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("starting capture - draw", PglCryptUtils.KEY_MESSAGE);
        Log.i("AdQualityManager", "starting capture - draw");
        this$0.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(adView, "adView");
        C2857kd process = new C2857kd(adView, this$0.f33233a);
        if (!z10) {
            this$0.f33238f.add(process);
        }
        C2895n0 c2895n0 = new C2895n0(this$0, process, z10, c2738dc);
        C2912o0 shouldProcess = new C2912o0(this$0);
        kotlin.jvm.internal.e0.checkNotNullParameter(process, "process");
        kotlin.jvm.internal.e0.checkNotNullParameter(shouldProcess, "shouldProcess");
        ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
        C2777g0.a(j10, new C2725d(shouldProcess, process, c2895n0));
        this$0.f33244l.set(!z10);
    }

    public final void a(Activity activity, long j10, boolean z10, C2738dc c2738dc) {
        a("isCapture started - " + this.f33244l.get() + ", isReporting - " + z10);
        if (this.f33244l.get() && !z10) {
            a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            activity.getWindow().getDecorView().post(new zk.q0(this, activity, j10, z10, c2738dc, 1));
        }
    }

    public static final void a(C2929p0 this$0, Activity activity, long j10, boolean z10, C2738dc c2738dc) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "$activity");
        this$0.a("activity is visible");
        Window window = activity.getWindow();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(window, "getWindow(...)");
        kotlin.jvm.internal.e0.checkNotNullParameter(window, "window");
        C2686ab process = new C2686ab(window, this$0.f33233a);
        if (!z10) {
            this$0.f33238f.add(process);
        }
        C2895n0 c2895n0 = new C2895n0(this$0, process, z10, c2738dc);
        C2912o0 shouldProcess = new C2912o0(this$0);
        kotlin.jvm.internal.e0.checkNotNullParameter(process, "process");
        kotlin.jvm.internal.e0.checkNotNullParameter(shouldProcess, "shouldProcess");
        ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
        C2777g0.a(j10, new C2725d(shouldProcess, process, c2895n0));
        this$0.f33244l.set(!z10);
    }

    public final void a(String str, byte[] bArr, boolean z10) {
        Context contextD = C2925od.d();
        if (contextD != null) {
            C2723ce process = new C2723ce(contextD.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z10) {
                this.f33238f.add(process);
            }
            C2861l0 c2861l0 = new C2861l0(this, z10, process, str);
            C2878m0 shouldProcess = C2878m0.f33065a;
            kotlin.jvm.internal.e0.checkNotNullParameter(process, "process");
            kotlin.jvm.internal.e0.checkNotNullParameter(shouldProcess, "shouldProcess");
            ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
            C2777g0.a(0L, new C2725d(shouldProcess, process, c2861l0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r13) {
        /*
            r12 = this;
            java.lang.String r0 = "AdQualityManager"
            java.lang.String r1 = "tag"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r1)
            java.lang.String r2 = "checking for trigger"
            java.lang.String r3 = "message"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r3)
            android.util.Log.i(r0, r2)
            com.inmobi.adquality.models.AdQualityControl r2 = r12.f33239g
            if (r2 == 0) goto Le3
            java.lang.String r7 = r2.getBeacon()
            if (r7 == 0) goto Le3
            java.util.concurrent.CopyOnWriteArrayList r2 = r12.f33238f
            boolean r2 = r2.isEmpty()
            r11 = 1
            if (r2 == 0) goto L53
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f33236d
            boolean r2 = r2.get()
            if (r2 == 0) goto L53
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f33237e
            boolean r2 = r2.get()
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f33237e
            r13.set(r11)
            java.lang.String r13 = "session end - queuing result"
            r12.a(r13)
            com.inmobi.adquality.models.AdQualityResult r13 = r12.f33241i
            if (r13 != 0) goto L4f
            com.inmobi.adquality.models.AdQualityResult r4 = new com.inmobi.adquality.models.AdQualityResult
            r9 = 8
            r10 = 0
            java.lang.String r5 = "null"
            r6 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13 = r4
        L4f:
            r12.a(r13, r11)
            return
        L53:
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f33236d
            boolean r2 = r2.get()
            if (r2 == 0) goto La9
            if (r13 != 0) goto La9
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f33237e
            boolean r13 = r13.get()
            if (r13 != 0) goto La9
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f33237e
            r13.set(r11)
            java.lang.String r13 = "session stop - queuing result"
            r12.a(r13)
            java.util.concurrent.ScheduledExecutorService r13 = com.inmobi.media.C2777g0.f32850a
            if (r13 == 0) goto L94
            r13.shutdown()
            r13.shutdownNow()     // Catch: java.lang.InterruptedException -> L7a
            goto L94
        L7a:
            r13.shutdownNow()     // Catch: java.lang.Exception -> L7e
            goto L8d
        L7e:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = "AdQualityComponent"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "shutdown fail"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r3)
            android.util.Log.e(r0, r1, r13)
        L8d:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L94:
            com.inmobi.adquality.models.AdQualityResult r13 = r12.f33241i
            if (r13 != 0) goto La5
            com.inmobi.adquality.models.AdQualityResult r4 = new com.inmobi.adquality.models.AdQualityResult
            r9 = 8
            r10 = 0
            java.lang.String r5 = "null"
            r6 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13 = r4
        La5:
            r12.a(r13, r11)
            return
        La9:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "list size - "
            r13.<init>(r2)
            java.util.concurrent.CopyOnWriteArrayList r2 = r12.f33238f
            int r2 = r2.size()
            r13.append(r2)
            java.lang.String r2 = " session end triggered - "
            r13.append(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f33236d
            boolean r2 = r2.get()
            r13.append(r2)
            java.lang.String r2 = " queue triggered - "
            r13.append(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f33237e
            r13.append(r2)
            java.lang.String r2 = " waiting"
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r1)
            kotlin.jvm.internal.e0.checkNotNullParameter(r13, r3)
            android.util.Log.i(r0, r13)
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2929p0.a(boolean):void");
    }

    public final void a(String str) {
        F5 f52 = this.f33234b;
        if (f52 != null) {
            ((G5) f52).a("AdQualityManager", str);
        }
    }

    public final void a(Exception exc, String str) {
        tu.x0 x0Var;
        if (exc != null) {
            F5 f52 = this.f33234b;
            if (f52 != null) {
                ((G5) f52).a("AdQualityManager", str, exc);
                x0Var = tu.x0.f87415a;
            } else {
                x0Var = null;
            }
            if (x0Var != null) {
                return;
            }
        }
        F5 f53 = this.f33234b;
        if (f53 != null) {
            ((G5) f53).b("AdQualityManager", AbstractC2811i0.a("Error with null exception : ", str));
        }
    }
}
