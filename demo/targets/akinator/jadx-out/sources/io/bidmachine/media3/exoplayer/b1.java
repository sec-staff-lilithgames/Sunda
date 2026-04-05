package io.bidmachine.media3.exoplayer;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.work.WorkerParameters;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.B6;
import com.inmobi.media.C2;
import com.inmobi.media.C2897n2;
import com.inmobi.media.C2926oe;
import com.inmobi.media.C2985s6;
import com.inmobi.media.C2998t2;
import com.inmobi.media.EnumC2784g7;
import com.inmobi.media.EnumC2993se;
import com.inmobi.media.GestureDetectorOnGestureListenerC3093yc;
import com.inmobi.media.H0;
import com.inmobi.media.Ja;
import com.inmobi.media.N8;
import com.inmobi.media.Of;
import com.inmobi.media.Pa;
import com.inmobi.media.T8;
import com.inmobi.media.U0;
import com.inmobi.media.Ub;
import com.inmobi.media.Ve;
import com.inmobi.media.Ye;
import com.inmobi.media.ag;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import io.bidmachine.media3.exoplayer.i1;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b0.c;
import io.odeeo.internal.d.g;
import io.odeeo.internal.f.g;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.w1.j;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.AdUnit$getActivityLifecycleListener$1;
import io.odeeo.sdk.AdUnitBase;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import nh.x4;
import org.json.JSONObject;
import r9.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61119c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f61120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f61121f;

    public /* synthetic */ b1(Object obj, int i10, Object obj2, Object obj3) {
        this.f61118b = i10;
        this.f61119c = obj;
        this.f61120e = obj2;
        this.f61121f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f61118b) {
            case 0:
                ((c1) this.f61119c).f61131c.updateMediaPeriodQueueInfo(((x4) this.f61120e).build(), (ao.k0) this.f61121f);
                return;
            case 1:
                i1.a aVar = (i1.a) this.f61119c;
                Pair pair = (Pair) this.f61120e;
                i1.this.f61260h.onDrmSessionManagerError(((Integer) pair.first).intValue(), (ao.k0) pair.second, (Exception) this.f61121f);
                return;
            case 2:
                ((j0) ((io.bidmachine.media3.exoplayer.audio.o) io.bidmachine.media3.common.util.a1.castNonNull(((io.bidmachine.media3.exoplayer.audio.n) this.f61119c).f60991b))).onAudioInputFormatChanged((io.bidmachine.media3.common.b) this.f61120e, (k) this.f61121f);
                return;
            case 3:
                io.bidmachine.media3.ui.f0.a((io.bidmachine.media3.ui.f0) this.f61119c, (SurfaceView) this.f61120e, (Runnable) this.f61121f);
                return;
            case 4:
                AdUnit.a((j.a) this.f61119c, (AdUnit) this.f61120e, (AdUnitBase) this.f61121f);
                return;
            case 5:
                AdUnit$getActivityLifecycleListener$1.a((AdUnit) this.f61119c, (Activity) this.f61120e, (AdUnit$getActivityLifecycleListener$1) this.f61121f);
                return;
            case 6:
                Context applicationContext = (Context) this.f61119c;
                String str = (String) this.f61120e;
                ir.d dVar = (ir.d) this.f61121f;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
                ir.h.openUrlWithPostback(applicationContext, lr.a.findEndpoint$default(str, 0, 2, null), dVar);
                return;
            case 7:
                ((io.odeeo.internal.b.d0) this.f61119c).a((h1.a) this.f61120e, (t.a) this.f61121f);
                return;
            case 8:
                ((c.C0592c) this.f61119c).a((t.a) this.f61120e, (IOException) this.f61121f);
                return;
            case 9:
                ((g.a) this.f61119c).a((io.odeeo.internal.b.t) this.f61120e, (io.odeeo.internal.e.i) this.f61121f);
                return;
            case 10:
                o6.p pVar = (o6.p) this.f61119c;
                sh.n1 n1Var = (sh.n1) this.f61120e;
                o6.h1 h1Var = (o6.h1) this.f61121f;
                String str2 = o6.p.f77951l;
                try {
                    zBooleanValue = ((Boolean) n1Var.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (pVar.f77962k) {
                    try {
                        v6.s workGenerationalId = h1Var.getWorkGenerationalId();
                        String workSpecId = workGenerationalId.getWorkSpecId();
                        if (pVar.b(workSpecId) == h1Var) {
                            pVar.a(workSpecId);
                        }
                        n6.c0.get().debug(o6.p.f77951l, pVar.getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + zBooleanValue);
                        Iterator it = pVar.f77961j.iterator();
                        while (it.hasNext()) {
                            ((o6.e) it.next()).onExecuted(workGenerationalId, zBooleanValue);
                        }
                    } finally {
                    }
                }
                return;
            case 11:
                ((o6.u0) this.f61119c).f77973a.startWork((o6.u) this.f61120e, (WorkerParameters.a) this.f61121f);
                return;
            case 12:
                ((g.a) this.f61119c).a((io.odeeo.internal.f.g) this.f61120e, (Exception) this.f61121f);
                return;
            case 13:
                r9.b bVar = (r9.b) this.f61119c;
                lb.d dVar2 = (lb.d) this.f61120e;
                String str3 = (String) this.f61121f;
                b.a aVar2 = r9.b.f84049h;
                try {
                    lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                    kotlin.jvm.internal.e0.checkNotNull(currentSession);
                    currentSession.addAnswerQuestionToAsk(bVar.f84052f.getIdBase(), String.valueOf(dVar2.f72794a), str3);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 14:
                s4.w wVar = (s4.w) this.f61119c;
                s4.q qVar = (s4.q) this.f61120e;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f61121f;
                try {
                    s4.f0 f0VarCreate = s4.f.create(wVar.f85468a);
                    if (f0VarCreate == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    f0VarCreate.setLoadingExecutor(threadPoolExecutor);
                    f0VarCreate.f85410a.load(new s4.v(qVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    qVar.onFailed(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 15:
                sf.v vVar = (sf.v) this.f61119c;
                com.google.android.exoplayer2.z0 z0Var = (com.google.android.exoplayer2.z0) this.f61120e;
                ce.k kVar = (ce.k) this.f61121f;
                sf.w wVar2 = vVar.f85733b;
                ((com.google.android.exoplayer2.p0) ((sf.w) com.google.android.exoplayer2.util.n1.castNonNull(wVar2))).onVideoInputFormatChanged(z0Var);
                ((com.google.android.exoplayer2.p0) ((sf.w) com.google.android.exoplayer2.util.n1.castNonNull(wVar2))).onVideoInputFormatChanged(z0Var, kVar);
                return;
            case 16:
                sn.q qVar2 = (sn.q) this.f61119c;
                ((sn.r) this.f61120e).onDrmSessionManagerError(qVar2.f86034a, qVar2.f86035b, (Exception) this.f61121f);
                return;
            case 17:
                B6.a((GestureDetectorOnGestureListenerC3093yc) this.f61119c, (B6) this.f61120e, (String) this.f61121f);
                return;
            case 18:
                C2.a((C2) this.f61119c, (ViewGroup) this.f61120e, (ag) this.f61121f);
                return;
            case 19:
                N8.a((N8) this.f61119c, (T8) this.f61120e, (ViewGroup) this.f61121f);
                return;
            case 20:
                Of.a((AdConfig.WebAssetCacheConfig) this.f61119c, (Of) this.f61120e, (Context) this.f61121f);
                return;
            case 21:
                Pa.a((kv.l) this.f61119c, (Pa) this.f61120e, (Ja) this.f61121f);
                return;
            case 22:
                U0.a((U0) this.f61119c, (kv.a) this.f61120e, (kv.l) this.f61121f);
                return;
            case 23:
                Ub.a((Ub) this.f61119c, (EnumC2784g7) this.f61120e, (JSONObject) this.f61121f);
                return;
            case 24:
                Ve.a((U0) this.f61119c, (Ve) this.f61120e, (InMobiAdRequestStatus) this.f61121f);
                return;
            case 25:
                Ye.b((InMobiUnifiedIdInterface) this.f61119c, (JSONObject) this.f61120e, (Error) this.f61121f);
                return;
            case 26:
                C2926oe.c((String) this.f61119c, (Map) this.f61120e, (EnumC2993se) this.f61121f);
                return;
            case 27:
                C2985s6.a((C2985s6) this.f61119c, (GestureDetectorOnGestureListenerC3093yc) this.f61120e, (Context) this.f61121f);
                return;
            case 28:
                C2985s6.a((C2985s6) this.f61119c, (H0) this.f61120e, (Context) this.f61121f);
                return;
            default:
                C2998t2.a((C2897n2) this.f61119c, (C2998t2) this.f61120e, (Handler) this.f61121f);
                return;
        }
    }
}
