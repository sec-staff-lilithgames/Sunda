package pn;

import android.net.Uri;
import ao.b0;
import ao.g0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.z0;
import go.c0;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements go.u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f81540b;

    public l(p pVar) {
        this.f81540b = pVar;
    }

    @Override // go.u
    public void onLoadCanceled(c0 c0Var, long j10, long j11, boolean z10) {
        this.f81540b.h(c0Var, j10, j11);
    }

    @Override // go.u
    public void onLoadCompleted(c0 c0Var, long j10, long j11) {
        long j12;
        p pVar = this.f81540b;
        b0 b0Var = new b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
        pVar.f81548m.onLoadTaskConcluded(c0Var.f58295a);
        pVar.f81552q.loadCompleted(b0Var, c0Var.f58297c);
        qn.c cVar = (qn.c) c0Var.getResult();
        qn.c cVar2 = pVar.H;
        int periodCount = cVar2 == null ? 0 : cVar2.getPeriodCount();
        long j13 = cVar.getPeriod(0).f83341b;
        int i10 = 0;
        while (i10 < periodCount && pVar.H.getPeriod(i10).f83341b < j13) {
            i10++;
        }
        if (cVar.f83308d) {
            if (periodCount - i10 > cVar.getPeriodCount()) {
                io.bidmachine.media3.common.util.b0.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = pVar.N;
                j12 = -9223372036854775807L;
                if (j14 == C.TIME_UNSET || cVar.f83312h * 1000 > j14) {
                    pVar.M = 0;
                } else {
                    io.bidmachine.media3.common.util.b0.w("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f83312h + ", " + pVar.N);
                }
            }
            int i11 = pVar.M;
            pVar.M = i11 + 1;
            if (i11 < pVar.f81548m.getMinimumLoadableRetryCount(c0Var.f58297c)) {
                pVar.D.postDelayed(pVar.f81557v, Math.min((pVar.M - 1) * 1000, 5000));
                return;
            } else {
                pVar.C = new d();
                return;
            }
        }
        j12 = -9223372036854775807L;
        pVar.H = cVar;
        pVar.I = cVar.f83308d & pVar.I;
        pVar.J = j10 - j11;
        pVar.K = j10;
        pVar.O += i10;
        synchronized (pVar.f81555t) {
            try {
                if (c0Var.f58296b.f73467a == pVar.F) {
                    Uri uri = pVar.H.f83315k;
                    if (uri == null) {
                        uri = c0Var.getUri();
                    }
                    pVar.F = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        qn.c cVar3 = pVar.H;
        if (!cVar3.f83308d || pVar.L != j12) {
            pVar.j(true);
            return;
        }
        qn.q qVar = cVar3.f83313i;
        if (qVar == null) {
            ho.f.initialize(pVar.A, new h(pVar));
            return;
        }
        String str = qVar.f83390a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                pVar.L = a1.parseXsDateTime(qVar.f83391b) - pVar.K;
                pVar.j(true);
                return;
            } catch (z0 e10) {
                pVar.i(e10);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            pVar.A.startLoading(new c0(pVar.f81561z, Uri.parse(qVar.f83391b), 5, new k()), new n(pVar), 1);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            pVar.A.startLoading(new c0(pVar.f81561z, Uri.parse(qVar.f83391b), 5, new o()), new n(pVar), 1);
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            ho.f.initialize(pVar.A, new h(pVar));
        } else {
            pVar.i(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // go.u
    public go.v onLoadError(c0 c0Var, long j10, long j11, IOException iOException, int i10) {
        p pVar = this.f81540b;
        pVar.getClass();
        b0 b0Var = new b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded());
        int i11 = c0Var.f58297c;
        go.s sVar = new go.s(b0Var, new g0(i11), iOException, i10);
        go.t tVar = pVar.f81548m;
        long retryDelayMsFor = tVar.getRetryDelayMsFor(sVar);
        go.v vVarCreateRetryAction = retryDelayMsFor == C.TIME_UNSET ? go.w.f58372f : go.w.createRetryAction(false, retryDelayMsFor);
        boolean zIsRetry = vVarCreateRetryAction.isRetry();
        pVar.f81552q.loadError(b0Var, i11, iOException, !zIsRetry);
        if (!zIsRetry) {
            tVar.onLoadTaskConcluded(c0Var.f58295a);
        }
        return vVarCreateRetryAction;
    }

    @Override // go.u
    public void onLoadStarted(c0 c0Var, long j10, long j11, int i10) {
        p pVar = this.f81540b;
        pVar.getClass();
        pVar.f81552q.loadStarted(i10 == 0 ? new b0(c0Var.f58295a, c0Var.f58296b, j10) : new b0(c0Var.f58295a, c0Var.f58296b, c0Var.getUri(), c0Var.getResponseHeaders(), j10, j11, c0Var.bytesLoaded()), c0Var.f58297c, i10);
    }
}
