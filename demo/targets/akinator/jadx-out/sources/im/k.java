package im;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import ao.k0;
import br.h0;
import com.google.android.gms.ads.AdValue;
import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentPayload;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import dq.d0;
import gn.k2;
import gn.r1;
import gn.u1;
import io.bidmachine.Debugger;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.SessionManager;
import io.bidmachine.e3;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.audio.p;
import io.bidmachine.media3.exoplayer.audio.s;
import io.bidmachine.media3.exoplayer.audio.z0;
import io.bidmachine.media3.exoplayer.j0;
import io.bidmachine.media3.exoplayer.k1;
import io.bidmachine.media3.exoplayer.l0;
import io.bidmachine.media3.exoplayer.o0;
import io.bidmachine.media3.exoplayer.q1;
import io.bidmachine.media3.exoplayer.t;
import io.bidmachine.media3.exoplayer.u;
import io.bidmachine.media3.exoplayer.y;
import io.bidmachine.media3.ui.c0;
import io.bidmachine.n1;
import io.f0;
import io.g0;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.m0;
import io.odeeo.internal.b.q;
import io.odeeo.internal.b0.c;
import io.odeeo.internal.d.g;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import jb.c;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerContext;
import kq.c.a;
import md.x;
import o5.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59748c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f59749e;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f59747b = i10;
        this.f59748c = obj;
        this.f59749e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioManager audioManager;
        long j10;
        boolean z10;
        long positionInWindowUs;
        switch (this.f59747b) {
            case 0:
                ((l) this.f59748c).f59750a.onPaidEvent(o.b((AdValue) this.f59749e));
                return;
            case 1:
                io.d dVar = (io.d) this.f59748c;
                k2 k2Var = (k2) this.f59749e;
                io.e eVar = dVar.f62090b;
                eVar.f62103i.onVideoSizeChanged(eVar, k2Var);
                return;
            case 2:
                ((j0) ((g0) a1.castNonNull(((f0) this.f59748c).f62123b))).onVideoCodecError((Exception) this.f59749e);
                return;
            case 3:
                ((j0) ((g0) a1.castNonNull(((f0) this.f59748c).f62123b))).onVideoDecoderReleased((String) this.f59749e);
                return;
            case 4:
                ((j0) ((g0) a1.castNonNull(((f0) this.f59748c).f62123b))).onVideoSizeChanged((k2) this.f59749e);
                return;
            case 5:
                n1 n1Var = (n1) this.f59748c;
                final Context context = (Context) this.f59749e;
                try {
                    Debugger.setup(context);
                    n1Var.f61928k.initialize(context);
                    n1Var.f61931n.updateIfv(context);
                    n1Var.f61942y.c();
                    if (n1Var.f61941x == 0) {
                        SharedPreferences sharedPreferencesE = jh.i.E(context);
                        long jOptLong = pr.m.optLong(sharedPreferencesE, "first_app_launch_ms", 0L);
                        if (jOptLong == 0) {
                            jOptLong = System.currentTimeMillis();
                            pr.m.putLong(sharedPreferencesE, "first_app_launch_ms", Long.valueOf(jOptLong));
                        }
                        n1Var.f61941x = jOptLong;
                    }
                    AtomicLong atomicLong = e3.f60347a;
                    new Thread(new cn.a() { // from class: io.bidmachine.a3
                        @Override // cn.a, pr.l
                        public final void onRun() {
                            new d3(context).b();
                        }
                    }).start();
                    NetworkRegistry.registerCoreNetworks();
                    NetworkRegistry.initializeNetworksAsync(context, null);
                    n1Var.c();
                    n1Var.f61942y.b();
                    bn.b.init();
                    return;
                } catch (Throwable th2) {
                    nm.a.w(th2);
                    return;
                }
            case 6:
                ((SessionManager) this.f59748c).lambda$saveCurrentSessionDuration$1((Context) this.f59749e);
                return;
            case 7:
                u uVar = (u) this.f59748c;
                Context context2 = (Context) this.f59749e;
                io.bidmachine.media3.common.util.a.checkNotNull(uVar.f61571c);
                if (a1.isWear(context2) && (audioManager = (AudioManager) context2.getSystemService("audio")) != null) {
                    uVar.f61569a = audioManager;
                    t tVar = new t(uVar);
                    uVar.f61570b = tVar;
                    audioManager.registerAudioDeviceCallback(tVar, new Handler((Looper) io.bidmachine.media3.common.util.a.checkNotNull(Looper.myLooper())));
                    uVar.f61571c.setStateInBackground(Boolean.valueOf(uVar.a()));
                    return;
                }
                return;
            case 8:
                y.b((y) this.f59748c, (Context) this.f59749e);
                return;
            case 9:
                l0 l0Var = (l0) this.f59748c;
                o0.c cVar = (o0.c) this.f59749e;
                int i10 = l0Var.K - cVar.f61476c;
                l0Var.K = i10;
                boolean z11 = true;
                if (cVar.f61477d) {
                    l0Var.L = cVar.f61478e;
                    l0Var.M = true;
                }
                if (i10 == 0) {
                    u1 u1Var = cVar.f61475b.f61303a;
                    if (!l0Var.f61382x0.f61303a.isEmpty() && u1Var.isEmpty()) {
                        l0Var.f61384y0 = -1;
                        l0Var.f61386z0 = 0L;
                    }
                    if (!u1Var.isEmpty()) {
                        List listAsList = Arrays.asList(((q1) u1Var).f61528l);
                        io.bidmachine.media3.common.util.a.checkState(listAsList.size() == l0Var.f61365p.size());
                        for (int i11 = 0; i11 < listAsList.size(); i11++) {
                            ((l0.a) l0Var.f61365p.get(i11)).updateTimeline((u1) listAsList.get(i11));
                        }
                    }
                    boolean z12 = l0Var.M;
                    long j11 = C.TIME_UNSET;
                    if (z12) {
                        if (cVar.f61475b.f61304b.equals(l0Var.f61382x0.f61304b) && cVar.f61475b.f61306d == l0Var.f61382x0.f61321s) {
                            z11 = false;
                        }
                        if (z11) {
                            if (u1Var.isEmpty() || cVar.f61475b.f61304b.isAd()) {
                                positionInWindowUs = cVar.f61475b.f61306d;
                            } else {
                                k1 k1Var = cVar.f61475b;
                                k0 k0Var = k1Var.f61304b;
                                long j12 = k1Var.f61306d;
                                Object obj = k0Var.f7718a;
                                r1 r1Var = l0Var.f61363o;
                                u1Var.getPeriodByUid(obj, r1Var);
                                positionInWindowUs = r1Var.getPositionInWindowUs() + j12;
                            }
                            j11 = positionInWindowUs;
                        }
                        j10 = j11;
                        z10 = z11;
                    } else {
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    l0Var.M = false;
                    l0Var.B(cVar.f61475b, 1, z10, l0Var.L, j10, -1, false);
                    return;
                }
                return;
            case 10:
                ((j0) ((io.bidmachine.media3.exoplayer.audio.o) a1.castNonNull(((io.bidmachine.media3.exoplayer.audio.n) this.f59748c).f60991b))).onAudioDecoderReleased((String) this.f59749e);
                return;
            case 11:
                ((z0) ((s) this.f59748c)).onAudioTrackReleased((p) this.f59749e);
                return;
            case 12:
                c0.a((c0) this.f59748c, (Bitmap) this.f59749e);
                return;
            case 13:
                ((io.odeeo.internal.b.p) this.f59748c).b((q.e) this.f59749e);
                return;
            case 14:
                ((q) this.f59748c).b((m0) this.f59749e);
                return;
            case 15:
                jb.c cVar2 = (jb.c) this.f59748c;
                jb.b bVar = (jb.b) this.f59749e;
                c.a aVar = jb.c.f69226m;
                if (cVar2.b()) {
                    if (bVar != null) {
                        bVar.onAnalyticsPushResponse();
                        return;
                    }
                    return;
                } else {
                    if (bVar != null) {
                        bVar.onAnalyticsPushError();
                        return;
                    }
                    return;
                }
            case 16:
                jb.c cVar3 = (jb.c) this.f59748c;
                Context context3 = (Context) this.f59749e;
                c.a aVar2 = jb.c.f69226m;
                if (!cVar3.a(context3)) {
                    throw null;
                }
                throw null;
            case 17:
                ji.u uVar2 = (ji.u) this.f59748c;
                uVar2.f69618a.writeRolloutState(uVar2.f69620c, (List) this.f59749e);
                return;
            case 18:
                jo.k kVar = (jo.k) this.f59748c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f59749e;
                SurfaceTexture surfaceTexture2 = kVar.f69874i;
                Surface surface = kVar.f69875j;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.f69874i = surfaceTexture;
                kVar.f69875j = surface2;
                Iterator it = kVar.f69868b.iterator();
                while (it.hasNext()) {
                    ((j0) ((jo.l) it.next())).onVideoSurfaceCreated(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 19:
                ((c.C0592c) this.f59748c).a((t.a) this.f59749e);
                return;
            case 20:
                ((c.d) this.f59748c).a((io.odeeo.internal.b0.a) this.f59749e);
                return;
            case 21:
                HandlerContext.scheduleResumeAfterDelay$lambda$1((CancellableContinuation) this.f59748c, (HandlerContext) this.f59749e);
                return;
            case 22:
                kq.c this$0 = (kq.c) this.f59748c;
                ar.g gVar = this$0.f71946s;
                String str = (String) this.f59749e;
                int i12 = kq.c.f71945u;
                e0.checkNotNullParameter(this$0, "this$0");
                try {
                    lq.b bVarA = lq.c.a(this$0.t(), str);
                    bVarA.a(this$0.new a());
                    if (gVar != null) {
                        gVar.onViewCreated(bVarA.n());
                    }
                    this$0.f71947t = bVarA;
                    return;
                } catch (Throwable th3) {
                    d0.b(th3);
                    h0 h0VarCreate = h0.f9867b.create(th3);
                    if (gVar != null) {
                        gVar.onError(h0VarCreate);
                    }
                    this$0.f54991g.c(this$0, h0VarCreate);
                    return;
                }
            case 23:
                kq.c this$02 = (kq.c) this.f59748c;
                Uri uri = (Uri) this.f59749e;
                e0.checkNotNullParameter(this$02, "this$0");
                e0.checkNotNullParameter(uri, "$uri");
                try {
                    lq.b bVar2 = this$02.f71947t;
                    if (bVar2 != null) {
                        bVar2.a(uri);
                        bVar2.prepare();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    d0.b(th4);
                    kq.c.a(this$02, h0.f9867b.create(th4));
                    return;
                }
            case 24:
                ((g.a) this.f59748c).a((String) this.f59749e);
                return;
            case 25:
                ((n3.n) this.f59748c).onFontRetrieved((Typeface) this.f59749e);
                return;
            case 26:
                nj.a aVar3 = (nj.a) this.f59748c;
                ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload = (ExperimentPayloadProto$ExperimentPayload) this.f59749e;
                aVar3.getClass();
                try {
                    nj.j0.logd("Updating active experiment: " + experimentPayloadProto$ExperimentPayload.toString());
                    aVar3.f76854a.reportActiveExperiment(new vh.b(experimentPayloadProto$ExperimentPayload.getExperimentId(), experimentPayloadProto$ExperimentPayload.getVariantId(), experimentPayloadProto$ExperimentPayload.getTriggerEvent(), new Date(experimentPayloadProto$ExperimentPayload.getExperimentStartTimeMillis()), experimentPayloadProto$ExperimentPayload.getTriggerTimeoutMillis(), experimentPayloadProto$ExperimentPayload.getTimeToLiveMillis()));
                    return;
                } catch (vh.a e10) {
                    nj.j0.loge("Unable to set experiment as active with ABT, missing analytics?\n" + e10.getMessage());
                    return;
                }
            case 27:
                Runnable runnable = (Runnable) this.f59748c;
                e2 e2Var = (e2) this.f59749e;
                try {
                    runnable.run();
                    return;
                } finally {
                    e2Var.scheduleNext();
                }
            case 28:
                o6.p pVar = (o6.p) this.f59748c;
                v6.s sVar = (v6.s) this.f59749e;
                synchronized (pVar.f77962k) {
                    try {
                        Iterator it2 = pVar.f77961j.iterator();
                        while (it2.hasNext()) {
                            ((o6.e) it2.next()).onExecuted(sVar, false);
                        }
                    } finally {
                    }
                }
                return;
            default:
                oi.c cVar4 = (oi.c) this.f59748c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f59749e;
                cVar4.getClass();
                try {
                    x.sendBlocking(cVar4.f79413h, jd.h.f69504e);
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
        }
    }
}
