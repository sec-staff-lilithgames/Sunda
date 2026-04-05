package io.odeeo.internal.a0;

import android.os.Handler;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.a0.u;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.f.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f<T> extends io.odeeo.internal.a0.a {

    /* renamed from: g, reason: collision with root package name */
    public final HashMap<T, b<T>> f62304g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    public Handler f62305h;

    /* renamed from: i, reason: collision with root package name */
    public io.odeeo.internal.p0.b0 f62306i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements u, io.odeeo.internal.f.g {

        /* renamed from: a, reason: collision with root package name */
        public final T f62307a;

        /* renamed from: b, reason: collision with root package name */
        public u.a f62308b;

        /* renamed from: c, reason: collision with root package name */
        public g.a f62309c;

        public a(T t10) {
            this.f62308b = f.this.b(null);
            this.f62309c = f.this.a((t.a) null);
            this.f62307a = t10;
        }

        public final boolean a(int i10, t.a aVar) {
            t.a aVarA;
            if (aVar != null) {
                aVarA = f.this.a((f) this.f62307a, aVar);
                if (aVarA == null) {
                    return false;
                }
            } else {
                aVarA = null;
            }
            int iA = f.this.a((f) this.f62307a, i10);
            u.a aVar2 = this.f62308b;
            if (aVar2.f62452a != iA || !io.odeeo.internal.q0.g0.areEqual(aVar2.f62453b, aVarA)) {
                this.f62308b = f.this.a(iA, aVarA, 0L);
            }
            g.a aVar3 = this.f62309c;
            if (aVar3.f63918a == iA && io.odeeo.internal.q0.g0.areEqual(aVar3.f63919b, aVarA)) {
                return true;
            }
            this.f62309c = f.this.a(iA, aVarA);
            return true;
        }

        @Override // io.odeeo.internal.a0.u
        public void onDownstreamFormatChanged(int i10, t.a aVar, q qVar) {
            if (a(i10, aVar)) {
                this.f62308b.downstreamFormatChanged(a(qVar));
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmKeysLoaded(int i10, t.a aVar) {
            if (a(i10, aVar)) {
                this.f62309c.drmKeysLoaded();
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmKeysRemoved(int i10, t.a aVar) {
            if (a(i10, aVar)) {
                this.f62309c.drmKeysRemoved();
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmKeysRestored(int i10, t.a aVar) {
            if (a(i10, aVar)) {
                this.f62309c.drmKeysRestored();
            }
        }

        @Override // io.odeeo.internal.f.g
        @Deprecated
        public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i10, t.a aVar) {
            super.onDrmSessionAcquired(i10, aVar);
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmSessionManagerError(int i10, t.a aVar, Exception exc) {
            if (a(i10, aVar)) {
                this.f62309c.drmSessionManagerError(exc);
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmSessionReleased(int i10, t.a aVar) {
            if (a(i10, aVar)) {
                this.f62309c.drmSessionReleased();
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onLoadCanceled(int i10, t.a aVar, n nVar, q qVar) {
            if (a(i10, aVar)) {
                this.f62308b.loadCanceled(nVar, a(qVar));
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onLoadCompleted(int i10, t.a aVar, n nVar, q qVar) {
            if (a(i10, aVar)) {
                this.f62308b.loadCompleted(nVar, a(qVar));
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onLoadError(int i10, t.a aVar, n nVar, q qVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f62308b.loadError(nVar, a(qVar), iOException, z10);
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onLoadStarted(int i10, t.a aVar, n nVar, q qVar) {
            if (a(i10, aVar)) {
                this.f62308b.loadStarted(nVar, a(qVar));
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onUpstreamDiscarded(int i10, t.a aVar, q qVar) {
            if (a(i10, aVar)) {
                this.f62308b.upstreamDiscarded(a(qVar));
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmSessionAcquired(int i10, t.a aVar, int i11) {
            if (a(i10, aVar)) {
                this.f62309c.drmSessionAcquired(i11);
            }
        }

        public final q a(q qVar) {
            long jA = f.this.a((f) this.f62307a, qVar.f62445f);
            long jA2 = f.this.a((f) this.f62307a, qVar.f62446g);
            return (jA == qVar.f62445f && jA2 == qVar.f62446g) ? qVar : new q(qVar.f62440a, qVar.f62441b, qVar.f62442c, qVar.f62443d, qVar.f62444e, jA, jA2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final t f62311a;

        /* renamed from: b, reason: collision with root package name */
        public final t.b f62312b;

        /* renamed from: c, reason: collision with root package name */
        public final f<T>.a f62313c;

        public b(t tVar, t.b bVar, f<T>.a aVar) {
            this.f62311a = tVar;
            this.f62312b = bVar;
            this.f62313c = aVar;
        }
    }

    public int a(T t10, int i10) {
        return i10;
    }

    @Override // io.odeeo.internal.a0.a
    public void b() {
        for (b<T> bVar : this.f62304g.values()) {
            bVar.f62311a.enable(bVar.f62312b);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(T t10, t tVar, y0 y0Var);

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b<T>> it = this.f62304g.values().iterator();
        while (it.hasNext()) {
            it.next().f62311a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // io.odeeo.internal.a0.a
    public void prepareSourceInternal(io.odeeo.internal.p0.b0 b0Var) {
        this.f62306i = b0Var;
        this.f62305h = io.odeeo.internal.q0.g0.createHandlerForCurrentLooper();
    }

    @Override // io.odeeo.internal.a0.a
    public void releaseSourceInternal() {
        for (b<T> bVar : this.f62304g.values()) {
            bVar.f62311a.releaseSource(bVar.f62312b);
            bVar.f62311a.removeEventListener(bVar.f62313c);
            bVar.f62311a.removeDrmEventListener(bVar.f62313c);
        }
        this.f62304g.clear();
    }

    public long a(T t10, long j10) {
        return j10;
    }

    public t.a a(T t10, t.a aVar) {
        return aVar;
    }

    @Override // io.odeeo.internal.a0.a
    public void a() {
        for (b<T> bVar : this.f62304g.values()) {
            bVar.f62311a.disable(bVar.f62312b);
        }
    }

    public final void a(final T t10, t tVar) {
        io.odeeo.internal.q0.a.checkArgument(!this.f62304g.containsKey(t10));
        t.b bVar = new t.b() { // from class: hs.b
            @Override // io.odeeo.internal.a0.t.b
            public final void onSourceInfoRefreshed(t tVar2, y0 y0Var) {
                this.f59147a.a(t10, tVar2, y0Var);
            }
        };
        a aVar = new a(t10);
        this.f62304g.put(t10, new b<>(tVar, bVar, aVar));
        tVar.addEventListener((Handler) io.odeeo.internal.q0.a.checkNotNull(this.f62305h), aVar);
        tVar.addDrmEventListener((Handler) io.odeeo.internal.q0.a.checkNotNull(this.f62305h), aVar);
        tVar.prepareSource(bVar, this.f62306i);
        if (c()) {
            return;
        }
        tVar.disable(bVar);
    }

    public final void a(T t10) {
        b bVar = (b) io.odeeo.internal.q0.a.checkNotNull(this.f62304g.remove(t10));
        bVar.f62311a.releaseSource(bVar.f62312b);
        bVar.f62311a.removeEventListener(bVar.f62313c);
        bVar.f62311a.removeDrmEventListener(bVar.f62313c);
    }
}
