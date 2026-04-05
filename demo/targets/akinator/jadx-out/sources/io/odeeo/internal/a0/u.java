package io.odeeo.internal.a0;

import android.os.Handler;
import com.ironsource.lh;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface u {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f62452a;

        /* renamed from: b, reason: collision with root package name */
        public final t.a f62453b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0589a> f62454c;

        /* renamed from: d, reason: collision with root package name */
        public final long f62455d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.a0.u$a$a, reason: collision with other inner class name */
        public static final class C0589a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f62456a;

            /* renamed from: b, reason: collision with root package name */
            public u f62457b;

            public C0589a(Handler handler, u uVar) {
                this.f62456a = handler;
                this.f62457b = uVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void addEventListener(Handler handler, u uVar) {
            io.odeeo.internal.q0.a.checkNotNull(handler);
            io.odeeo.internal.q0.a.checkNotNull(uVar);
            this.f62454c.add(new C0589a(handler, uVar));
        }

        public void downstreamFormatChanged(int i10, io.odeeo.internal.b.t tVar, int i11, Object obj, long j10) {
            downstreamFormatChanged(new q(1, i10, tVar, i11, obj, a(j10), C.TIME_UNSET));
        }

        public void loadCanceled(n nVar, int i10) {
            loadCanceled(nVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadCompleted(n nVar, int i10) {
            loadCompleted(nVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadError(n nVar, int i10, IOException iOException, boolean z10) {
            loadError(nVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z10);
        }

        public void loadStarted(n nVar, int i10) {
            loadStarted(nVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void removeEventListener(u uVar) {
            Iterator<C0589a> it = this.f62454c.iterator();
            while (it.hasNext()) {
                C0589a next = it.next();
                if (next.f62457b == uVar) {
                    this.f62454c.remove(next);
                }
            }
        }

        public void upstreamDiscarded(int i10, long j10, long j11) {
            upstreamDiscarded(new q(1, i10, null, 3, null, a(j10), a(j11)));
        }

        public a withParameters(int i10, t.a aVar, long j10) {
            return new a(this.f62454c, i10, aVar, j10);
        }

        public a(CopyOnWriteArrayList<C0589a> copyOnWriteArrayList, int i10, t.a aVar, long j10) {
            this.f62454c = copyOnWriteArrayList;
            this.f62452a = i10;
            this.f62453b = aVar;
            this.f62455d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(u uVar, n nVar, q qVar) {
            uVar.onLoadCanceled(this.f62452a, this.f62453b, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(u uVar, n nVar, q qVar) {
            uVar.onLoadCompleted(this.f62452a, this.f62453b, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(u uVar, n nVar, q qVar) {
            uVar.onLoadStarted(this.f62452a, this.f62453b, nVar, qVar);
        }

        public void loadCanceled(n nVar, int i10, int i11, io.odeeo.internal.b.t tVar, int i12, Object obj, long j10, long j11) {
            loadCanceled(nVar, new q(i10, i11, tVar, i12, obj, a(j10), a(j11)));
        }

        public void loadCompleted(n nVar, int i10, int i11, io.odeeo.internal.b.t tVar, int i12, Object obj, long j10, long j11) {
            loadCompleted(nVar, new q(i10, i11, tVar, i12, obj, a(j10), a(j11)));
        }

        public void loadError(n nVar, int i10, int i11, io.odeeo.internal.b.t tVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            loadError(nVar, new q(i10, i11, tVar, i12, obj, a(j10), a(j11)), iOException, z10);
        }

        public void loadStarted(n nVar, int i10, int i11, io.odeeo.internal.b.t tVar, int i12, Object obj, long j10, long j11) {
            loadStarted(nVar, new q(i10, i11, tVar, i12, obj, a(j10), a(j11)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(u uVar, n nVar, q qVar, IOException iOException, boolean z10) {
            uVar.onLoadError(this.f62452a, this.f62453b, nVar, qVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(u uVar, t.a aVar, q qVar) {
            uVar.onUpstreamDiscarded(this.f62452a, aVar, qVar);
        }

        public void downstreamFormatChanged(q qVar) {
            Iterator<C0589a> it = this.f62454c.iterator();
            while (it.hasNext()) {
                C0589a next = it.next();
                io.odeeo.internal.q0.g0.postOrRun(next.f62456a, new lh(this, 25, next.f62457b, qVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(u uVar, q qVar) {
            uVar.onDownstreamFormatChanged(this.f62452a, this.f62453b, qVar);
        }

        public void upstreamDiscarded(q qVar) {
            t.a aVar = (t.a) io.odeeo.internal.q0.a.checkNotNull(this.f62453b);
            Iterator<C0589a> it = this.f62454c.iterator();
            while (it.hasNext()) {
                C0589a next = it.next();
                io.odeeo.internal.q0.g0.postOrRun(next.f62456a, new al.a(24, this, next.f62457b, aVar, qVar));
            }
        }

        public final long a(long j10) {
            long jUsToMs = io.odeeo.internal.q0.g0.usToMs(j10);
            return jUsToMs == C.TIME_UNSET ? C.TIME_UNSET : this.f62455d + jUsToMs;
        }

        public void loadCanceled(n nVar, q qVar) {
            Iterator<C0589a> it = this.f62454c.iterator();
            while (it.hasNext()) {
                C0589a next = it.next();
                io.odeeo.internal.q0.g0.postOrRun(next.f62456a, new hs.f(this, next.f62457b, nVar, qVar, 0));
            }
        }

        public void loadCompleted(n nVar, q qVar) {
            Iterator<C0589a> it = this.f62454c.iterator();
            while (it.hasNext()) {
                C0589a next = it.next();
                io.odeeo.internal.q0.g0.postOrRun(next.f62456a, new hs.f(this, next.f62457b, nVar, qVar, 1));
            }
        }

        public void loadError(n nVar, q qVar, IOException iOException, boolean z10) {
            Iterator<C0589a> it = this.f62454c.iterator();
            while (it.hasNext()) {
                C0589a next = it.next();
                io.odeeo.internal.q0.g0.postOrRun(next.f62456a, new bf.h0(this, next.f62457b, nVar, qVar, iOException, z10, 2));
            }
        }

        public void loadStarted(n nVar, q qVar) {
            Iterator<C0589a> it = this.f62454c.iterator();
            while (it.hasNext()) {
                C0589a next = it.next();
                io.odeeo.internal.q0.g0.postOrRun(next.f62456a, new hs.f(this, next.f62457b, nVar, qVar, 2));
            }
        }
    }

    default void onDownstreamFormatChanged(int i10, t.a aVar, q qVar) {
    }

    default void onUpstreamDiscarded(int i10, t.a aVar, q qVar) {
    }

    default void onLoadCanceled(int i10, t.a aVar, n nVar, q qVar) {
    }

    default void onLoadCompleted(int i10, t.a aVar, n nVar, q qVar) {
    }

    default void onLoadStarted(int i10, t.a aVar, n nVar, q qVar) {
    }

    default void onLoadError(int i10, t.a aVar, n nVar, q qVar, IOException iOException, boolean z10) {
    }
}
