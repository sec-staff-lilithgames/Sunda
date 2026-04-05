package io.odeeo.internal.b0;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import im.k;
import io.bidmachine.media3.exoplayer.b1;
import io.odeeo.internal.a0.f;
import io.odeeo.internal.a0.n;
import io.odeeo.internal.a0.o;
import io.odeeo.internal.a0.r;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.a0.v;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.b0.a;
import io.odeeo.internal.b0.b;
import io.odeeo.internal.p0.b0;
import io.odeeo.internal.p0.m;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends f<t.a> {

    /* renamed from: v, reason: collision with root package name */
    public static final t.a f63222v = new t.a(new Object());

    /* renamed from: j, reason: collision with root package name */
    public final t f63223j;

    /* renamed from: k, reason: collision with root package name */
    public final v f63224k;

    /* renamed from: l, reason: collision with root package name */
    public final io.odeeo.internal.b0.b f63225l;

    /* renamed from: m, reason: collision with root package name */
    public final io.odeeo.internal.o0.a f63226m;

    /* renamed from: n, reason: collision with root package name */
    public final m f63227n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f63228o;

    /* renamed from: r, reason: collision with root package name */
    public d f63231r;

    /* renamed from: s, reason: collision with root package name */
    public y0 f63232s;

    /* renamed from: t, reason: collision with root package name */
    public io.odeeo.internal.b0.a f63233t;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f63229p = new Handler(Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public final y0.b f63230q = new y0.b();

    /* renamed from: u, reason: collision with root package name */
    public b[][] f63234u = new b[0][];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f63235a;

        public a(int i10, Exception exc) {
            super(exc);
            this.f63235a = i10;
        }

        public static a createForAd(Exception exc) {
            return new a(0, exc);
        }

        public static a createForAdGroup(Exception exc, int i10) {
            return new a(1, new IOException(a.b.e(i10, "Failed to load ad group "), exc));
        }

        public static a createForAllAds(Exception exc) {
            return new a(2, exc);
        }

        public static a createForUnexpected(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            io.odeeo.internal.q0.a.checkState(this.f63235a == 3);
            return (RuntimeException) io.odeeo.internal.q0.a.checkNotNull(getCause());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public final t.a f63236a;

        /* renamed from: b, reason: collision with root package name */
        public final List<o> f63237b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public Uri f63238c;

        /* renamed from: d, reason: collision with root package name */
        public t f63239d;

        /* renamed from: e, reason: collision with root package name */
        public y0 f63240e;

        public b(t.a aVar) {
            this.f63236a = aVar;
        }

        public r createMediaPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
            o oVar = new o(aVar, bVar, j10);
            this.f63237b.add(oVar);
            t tVar = this.f63239d;
            if (tVar != null) {
                oVar.setMediaSource(tVar);
                oVar.setPrepareListener(c.this.new C0592c((Uri) io.odeeo.internal.q0.a.checkNotNull(this.f63238c)));
            }
            y0 y0Var = this.f63240e;
            if (y0Var != null) {
                oVar.createPeriod(new t.a(y0Var.getUidOfPeriod(0), aVar.f62450d));
            }
            return oVar;
        }

        public long getDurationUs() {
            y0 y0Var = this.f63240e;
            return y0Var == null ? C.TIME_UNSET : y0Var.getPeriod(0, c.this.f63230q).getDurationUs();
        }

        public void handleSourceInfoRefresh(y0 y0Var) {
            io.odeeo.internal.q0.a.checkArgument(y0Var.getPeriodCount() == 1);
            if (this.f63240e == null) {
                Object uidOfPeriod = y0Var.getUidOfPeriod(0);
                for (int i10 = 0; i10 < this.f63237b.size(); i10++) {
                    o oVar = this.f63237b.get(i10);
                    oVar.createPeriod(new t.a(uidOfPeriod, oVar.f62418a.f62450d));
                }
            }
            this.f63240e = y0Var;
        }

        public boolean hasMediaSource() {
            return this.f63239d != null;
        }

        public void initializeWithMediaSource(t tVar, Uri uri) {
            this.f63239d = tVar;
            this.f63238c = uri;
            for (int i10 = 0; i10 < this.f63237b.size(); i10++) {
                o oVar = this.f63237b.get(i10);
                oVar.setMediaSource(tVar);
                oVar.setPrepareListener(c.this.new C0592c(uri));
            }
            c.this.a((c) this.f63236a, tVar);
        }

        public boolean isInactive() {
            return this.f63237b.isEmpty();
        }

        public void release() {
            if (hasMediaSource()) {
                c.this.a((c) this.f63236a);
            }
        }

        public void releaseMediaPeriod(o oVar) {
            this.f63237b.remove(oVar);
            oVar.releasePeriod();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.b0.c$c, reason: collision with other inner class name */
    public final class C0592c implements o.a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f63242a;

        public C0592c(Uri uri) {
            this.f63242a = uri;
        }

        @Override // io.odeeo.internal.a0.o.a
        public void onPrepareComplete(t.a aVar) {
            c.this.f63229p.post(new k(19, this, aVar));
        }

        @Override // io.odeeo.internal.a0.o.a
        public void onPrepareError(t.a aVar, IOException iOException) {
            c.this.b(aVar).loadError(new n(n.getNewId(), new m(this.f63242a), SystemClock.elapsedRealtime()), 6, (IOException) a.createForAd(iOException), true);
            c.this.f63229p.post(new b1(this, 8, aVar, iOException));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(t.a aVar) {
            c.this.f63225l.handlePrepareComplete(c.this, aVar.f62448b, aVar.f62449c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(t.a aVar, IOException iOException) {
            c.this.f63225l.handlePrepareError(c.this, aVar.f62448b, aVar.f62449c, iOException);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f63244a = g0.createHandlerForCurrentLooper();

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f63245b;

        public d() {
        }

        @Override // io.odeeo.internal.b0.b.a
        public /* bridge */ /* synthetic */ void onAdClicked() {
            super.onAdClicked();
        }

        @Override // io.odeeo.internal.b0.b.a
        public void onAdLoadError(a aVar, m mVar) {
            if (this.f63245b) {
                return;
            }
            c.this.b((t.a) null).loadError(new n(n.getNewId(), mVar, SystemClock.elapsedRealtime()), 6, (IOException) aVar, true);
        }

        @Override // io.odeeo.internal.b0.b.a
        public void onAdPlaybackState(io.odeeo.internal.b0.a aVar) {
            if (this.f63245b) {
                return;
            }
            this.f63244a.post(new k(20, this, aVar));
        }

        @Override // io.odeeo.internal.b0.b.a
        public /* bridge */ /* synthetic */ void onAdTapped() {
            super.onAdTapped();
        }

        public void stop() {
            this.f63245b = true;
            this.f63244a.removeCallbacksAndMessages(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(io.odeeo.internal.b0.a aVar) {
            if (this.f63245b) {
                return;
            }
            c.this.a(aVar);
        }
    }

    public c(t tVar, m mVar, Object obj, v vVar, io.odeeo.internal.b0.b bVar, io.odeeo.internal.o0.a aVar) {
        this.f63223j = tVar;
        this.f63224k = vVar;
        this.f63225l = bVar;
        this.f63226m = aVar;
        this.f63227n = mVar;
        this.f63228o = obj;
        bVar.setSupportedContentTypes(vVar.getSupportedTypes());
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public r createPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
        if (((io.odeeo.internal.b0.a) io.odeeo.internal.q0.a.checkNotNull(this.f63233t)).f63209b <= 0 || !aVar.isAd()) {
            o oVar = new o(aVar, bVar, j10);
            oVar.setMediaSource(this.f63223j);
            oVar.createPeriod(aVar);
            return oVar;
        }
        int i10 = aVar.f62448b;
        int i11 = aVar.f62449c;
        b[][] bVarArr = this.f63234u;
        b[] bVarArr2 = bVarArr[i10];
        if (bVarArr2.length <= i11) {
            bVarArr[i10] = (b[]) Arrays.copyOf(bVarArr2, i11 + 1);
        }
        b bVar2 = this.f63234u[i10][i11];
        if (bVar2 == null) {
            bVar2 = new b(aVar);
            this.f63234u[i10][i11] = bVar2;
            e();
        }
        return bVar2.createMediaPeriod(aVar, bVar, j10);
    }

    public final long[][] d() {
        long[][] jArr = new long[this.f63234u.length][];
        int i10 = 0;
        while (true) {
            b[][] bVarArr = this.f63234u;
            if (i10 >= bVarArr.length) {
                return jArr;
            }
            jArr[i10] = new long[bVarArr[i10].length];
            int i11 = 0;
            while (true) {
                b[] bVarArr2 = this.f63234u[i10];
                if (i11 < bVarArr2.length) {
                    b bVar = bVarArr2[i11];
                    jArr[i10][i11] = bVar == null ? C.TIME_UNSET : bVar.getDurationUs();
                    i11++;
                }
            }
            i10++;
        }
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public z getMediaItem() {
        return this.f63223j.getMediaItem();
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a
    public void prepareSourceInternal(b0 b0Var) {
        super.prepareSourceInternal(b0Var);
        d dVar = new d();
        this.f63231r = dVar;
        a((c) f63222v, this.f63223j);
        this.f63229p.post(new js.a(this, dVar, 0));
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void releasePeriod(r rVar) {
        o oVar = (o) rVar;
        t.a aVar = oVar.f62418a;
        if (!aVar.isAd()) {
            oVar.releasePeriod();
            return;
        }
        b bVar = (b) io.odeeo.internal.q0.a.checkNotNull(this.f63234u[aVar.f62448b][aVar.f62449c]);
        bVar.releaseMediaPeriod(oVar);
        if (bVar.isInactive()) {
            bVar.release();
            this.f63234u[aVar.f62448b][aVar.f62449c] = null;
        }
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        d dVar = (d) io.odeeo.internal.q0.a.checkNotNull(this.f63231r);
        this.f63231r = null;
        dVar.stop();
        this.f63232s = null;
        this.f63233t = null;
        this.f63234u = new b[0][];
        this.f63229p.post(new js.a(this, dVar, 1));
    }

    public final void e() {
        Uri uri;
        io.odeeo.internal.b0.a aVar = this.f63233t;
        if (aVar == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f63234u.length; i10++) {
            int i11 = 0;
            while (true) {
                b[] bVarArr = this.f63234u[i10];
                if (i11 < bVarArr.length) {
                    b bVar = bVarArr[i11];
                    a.C0591a adGroup = aVar.getAdGroup(i10);
                    if (bVar != null && !bVar.hasMediaSource()) {
                        Uri[] uriArr = adGroup.f63217c;
                        if (i11 < uriArr.length && (uri = uriArr[i11]) != null) {
                            z.c uri2 = new z.c().setUri(uri);
                            z.h hVar = this.f63223j.getMediaItem().f63110b;
                            if (hVar != null) {
                                uri2.setDrmConfiguration(hVar.f63178c);
                            }
                            bVar.initializeWithMediaSource(this.f63224k.createMediaSource(uri2.build()), uri);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    public final void f() {
        y0 y0Var = this.f63232s;
        io.odeeo.internal.b0.a aVar = this.f63233t;
        if (aVar == null || y0Var == null) {
            return;
        }
        if (aVar.f63209b == 0) {
            a(y0Var);
        } else {
            this.f63233t = aVar.withAdDurationsUs(d());
            a((y0) new io.odeeo.internal.b0.d(y0Var, this.f63233t));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar) {
        this.f63225l.stop(this, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.f63225l.start(this, this.f63227n, this.f63228o, this.f63226m, dVar);
    }

    @Override // io.odeeo.internal.a0.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void a(t.a aVar, t tVar, y0 y0Var) {
        if (aVar.isAd()) {
            ((b) io.odeeo.internal.q0.a.checkNotNull(this.f63234u[aVar.f62448b][aVar.f62449c])).handleSourceInfoRefresh(y0Var);
        } else {
            io.odeeo.internal.q0.a.checkArgument(y0Var.getPeriodCount() == 1);
            this.f63232s = y0Var;
        }
        f();
    }

    @Override // io.odeeo.internal.a0.f
    public t.a a(t.a aVar, t.a aVar2) {
        return aVar.isAd() ? aVar : aVar2;
    }

    public final void a(io.odeeo.internal.b0.a aVar) {
        io.odeeo.internal.b0.a aVar2 = this.f63233t;
        if (aVar2 == null) {
            b[][] bVarArr = new b[aVar.f63209b][];
            this.f63234u = bVarArr;
            Arrays.fill(bVarArr, new b[0]);
        } else {
            io.odeeo.internal.q0.a.checkState(aVar.f63209b == aVar2.f63209b);
        }
        this.f63233t = aVar;
        e();
        f();
    }
}
