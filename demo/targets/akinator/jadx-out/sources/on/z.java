package on;

import android.app.job.JobParameters;
import android.graphics.SurfaceTexture;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.work.impl.WorkDatabase;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.p0;
import com.google.android.exoplayer2.util.n1;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.A8;
import com.inmobi.media.C2887m9;
import com.inmobi.media.F6;
import com.unity3d.services.store.core.api.Store;
import com.vungle.ads.internal.persistence.FilePreferences;
import io.odeeo.internal.f.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import nh.u4;
import o6.y0;
import vn.d;
import yr.r0;
import yr.v0;
import yr.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79719c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79720e;

    public /* synthetic */ z(int i10, Object obj, Object obj2) {
        this.f79718b = i10;
        this.f79719c = obj;
        this.f79720e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.z.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f79718b) {
            case 0:
                ((c0) this.f79719c).f79594d.reportNetworkEvent((NetworkEvent) this.f79720e);
                return;
            case 1:
                ((c0) this.f79719c).f79594d.reportPlaybackMetrics((PlaybackMetrics) this.f79720e);
                return;
            case 2:
                ((c0) this.f79719c).f79594d.reportTrackChangeEvent((TrackChangeEvent) this.f79720e);
                return;
            case 3:
                ((c0) this.f79719c).f79594d.reportPlaybackStateEvent((PlaybackStateEvent) this.f79720e);
                return;
            case 4:
                ((c0) this.f79719c).f79594d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f79720e);
                return;
            case 5:
                oq.a this$0 = (oq.a) this.f79719c;
                Runnable runnable = (Runnable) this.f79720e;
                kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
                this$0.f79733e.set(false);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((c.f) this.f79719c).a((io.odeeo.internal.b.t) this.f79720e);
                return;
            case 7:
                ((p6.e) this.f79719c).f80711b.stopWork((o6.u) this.f79720e, 3);
                return;
            case 8:
                ((p0) ((sf.w) n1.castNonNull(((sf.v) this.f79719c).f85733b))).onVideoSizeChanged((sf.x) this.f79720e);
                return;
            case 9:
                ((p0) ((sf.w) n1.castNonNull(((sf.v) this.f79719c).f85733b))).onVideoDecoderReleased((String) this.f79720e);
                return;
            case 10:
                ((p0) ((sf.w) n1.castNonNull(((sf.v) this.f79719c).f85733b))).onVideoCodecError((Exception) this.f79720e);
                return;
            case 11:
                ((sh.z) this.f79719c).o((u4) this.f79720e);
                return;
            case 12:
                sn.i iVar = (sn.i) this.f79719c;
                io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) this.f79720e;
                sn.l lVar = iVar.f85985f;
                if (lVar.f86006p == 0 || iVar.f85984e) {
                    return;
                }
                iVar.f85983c = lVar.a((Looper) io.bidmachine.media3.common.util.a.checkNotNull(lVar.f86010t), iVar.f85982b, bVar, false);
                lVar.f86004n.add(iVar);
                return;
            case 13:
                List list = (List) this.f79719c;
                t6.f fVar = (t6.f) this.f79720e;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s6.a) ((r6.a) it.next())).onConstraintChanged(fVar.f86396e);
                }
                return;
            case 14:
                tf.k kVar = (tf.k) this.f79719c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f79720e;
                SurfaceTexture surfaceTexture2 = kVar.f86894i;
                Surface surface = kVar.f86895j;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.f86894i = surfaceTexture;
                kVar.f86895j = surface2;
                Iterator it2 = kVar.f86888b.iterator();
                while (it2.hasNext()) {
                    ((p0) ((tf.l) it2.next())).onVideoSurfaceCreated(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 15:
                ((tn.l) ((tn.r) this.f79719c).f87281e).onPlaylistRefreshRequired(((tn.j) this.f79720e).f87220m);
                return;
            case 16:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f79719c;
                JobParameters jobParameters = (JobParameters) this.f79720e;
                int i10 = JobInfoSchedulerService.f27009b;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 17:
                Store.lambda$isFeatureSupported$0((Integer) this.f79719c, (String) this.f79720e);
                return;
            case 18:
                FilePreferences.m3623apply$lambda0((FilePreferences) this.f79719c, (HashMap) this.f79720e);
                return;
            case 19:
                d.a aVar = (d.a) this.f79719c;
                Uri uri = (Uri) this.f79720e;
                aVar.f89361k = false;
                aVar.c(uri);
                return;
            case 20:
                y0 y0Var = (y0) this.f79719c;
                String string = ((UUID) this.f79720e).toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                w6.d.a(string, y0Var);
                return;
            case 21:
                WorkDatabase workDatabase = (WorkDatabase) this.f79719c;
                y0 y0Var2 = (y0) this.f79720e;
                Iterator<String> it3 = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                while (it3.hasNext()) {
                    w6.d.a(it3.next(), y0Var2);
                }
                new w6.u(workDatabase).setLastCancelAllTimeMillis(y0Var2.getConfiguration().getClock().currentTimeMillis());
                return;
            case 22:
                String str = (String) this.f79719c;
                x4.o violation = (x4.o) this.f79720e;
                kotlin.jvm.internal.e0.checkNotNullParameter(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
                throw violation;
            case 23:
                InMobiBanner.a((InMobiBanner) this.f79719c, (kv.a) this.f79720e);
                return;
            case 24:
                yq.o oVar = (yq.o) this.f79719c;
                br.z zVar = (br.z) this.f79720e;
                yq.n nVar = oVar.f94830f;
                if (nVar != null) {
                    ((pq.f) nVar).a(zVar);
                    return;
                }
                return;
            case 25:
                r0.a aVar2 = (r0.a) this.f79719c;
                List<as.e> list2 = (List) this.f79720e;
                synchronized (aVar2.f95020t) {
                    try {
                        aVar2.f95024x.synReply(true, aVar2.f95018r, list2);
                        if (!aVar2.f95026z) {
                            aVar2.f95024x.rstStream(aVar2.f95018r, as.a.NO_ERROR);
                        }
                        aVar2.f95017q.e(aVar2.f95018r, true);
                        aVar2.complete();
                    } finally {
                    }
                }
                return;
            case 26:
                a();
                return;
            case 27:
                v0.b bVar2 = (v0.b) this.f79719c;
                w0 w0Var = (w0) this.f79720e;
                synchronized (v0.this.f95069n) {
                    try {
                        if (!w0Var.hasReceivedEndOfStream()) {
                            v0.this.f95074s.rstStream(w0Var.f95105a, as.a.NO_ERROR);
                        }
                        v0.this.e(w0Var.f95105a, true);
                    } finally {
                    }
                }
                return;
            case 28:
                A8.a(this.f79719c, (A8) this.f79720e);
                return;
            default:
                F6.a((F6) this.f79719c, (C2887m9) this.f79720e);
                return;
        }
    }
}
