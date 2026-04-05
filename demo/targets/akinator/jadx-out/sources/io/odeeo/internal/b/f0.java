package io.odeeo.internal.b;

import android.os.Handler;
import io.odeeo.internal.a0.f0;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.a0.u;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.f.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public final d f62687d;

    /* renamed from: e, reason: collision with root package name */
    public final u.a f62688e;

    /* renamed from: f, reason: collision with root package name */
    public final g.a f62689f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap<c, b> f62690g;

    /* renamed from: h, reason: collision with root package name */
    public final Set<c> f62691h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f62693j;

    /* renamed from: k, reason: collision with root package name */
    public io.odeeo.internal.p0.b0 f62694k;

    /* renamed from: i, reason: collision with root package name */
    public io.odeeo.internal.a0.f0 f62692i = new f0.a(0);

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap<io.odeeo.internal.a0.r, c> f62685b = new IdentityHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final Map<Object, c> f62686c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f62684a = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements io.odeeo.internal.a0.u, io.odeeo.internal.f.g {

        /* renamed from: a, reason: collision with root package name */
        public final c f62695a;

        /* renamed from: b, reason: collision with root package name */
        public u.a f62696b;

        /* renamed from: c, reason: collision with root package name */
        public g.a f62697c;

        public a(c cVar) {
            this.f62696b = f0.this.f62688e;
            this.f62697c = f0.this.f62689f;
            this.f62695a = cVar;
        }

        public final boolean a(int i10, t.a aVar) {
            t.a aVarB;
            if (aVar != null) {
                aVarB = f0.b(this.f62695a, aVar);
                if (aVarB == null) {
                    return false;
                }
            } else {
                aVarB = null;
            }
            int iB = f0.b(this.f62695a, i10);
            u.a aVar2 = this.f62696b;
            if (aVar2.f62452a != iB || !io.odeeo.internal.q0.g0.areEqual(aVar2.f62453b, aVarB)) {
                this.f62696b = f0.this.f62688e.withParameters(iB, aVarB, 0L);
            }
            g.a aVar3 = this.f62697c;
            if (aVar3.f63918a == iB && io.odeeo.internal.q0.g0.areEqual(aVar3.f63919b, aVarB)) {
                return true;
            }
            this.f62697c = f0.this.f62689f.withParameters(iB, aVarB);
            return true;
        }

        @Override // io.odeeo.internal.a0.u
        public void onDownstreamFormatChanged(int i10, t.a aVar, io.odeeo.internal.a0.q qVar) {
            if (a(i10, aVar)) {
                this.f62696b.downstreamFormatChanged(qVar);
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmKeysLoaded(int i10, t.a aVar) {
            if (a(i10, aVar)) {
                this.f62697c.drmKeysLoaded();
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmKeysRemoved(int i10, t.a aVar) {
            if (a(i10, aVar)) {
                this.f62697c.drmKeysRemoved();
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmKeysRestored(int i10, t.a aVar) {
            if (a(i10, aVar)) {
                this.f62697c.drmKeysRestored();
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
                this.f62697c.drmSessionManagerError(exc);
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmSessionReleased(int i10, t.a aVar) {
            if (a(i10, aVar)) {
                this.f62697c.drmSessionReleased();
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onLoadCanceled(int i10, t.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar) {
            if (a(i10, aVar)) {
                this.f62696b.loadCanceled(nVar, qVar);
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onLoadCompleted(int i10, t.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar) {
            if (a(i10, aVar)) {
                this.f62696b.loadCompleted(nVar, qVar);
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onLoadError(int i10, t.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f62696b.loadError(nVar, qVar, iOException, z10);
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onLoadStarted(int i10, t.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar) {
            if (a(i10, aVar)) {
                this.f62696b.loadStarted(nVar, qVar);
            }
        }

        @Override // io.odeeo.internal.a0.u
        public void onUpstreamDiscarded(int i10, t.a aVar, io.odeeo.internal.a0.q qVar) {
            if (a(i10, aVar)) {
                this.f62696b.upstreamDiscarded(qVar);
            }
        }

        @Override // io.odeeo.internal.f.g
        public void onDrmSessionAcquired(int i10, t.a aVar, int i11) {
            if (a(i10, aVar)) {
                this.f62697c.drmSessionAcquired(i11);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.a0.t f62699a;

        /* renamed from: b, reason: collision with root package name */
        public final t.b f62700b;

        /* renamed from: c, reason: collision with root package name */
        public final a f62701c;

        public b(io.odeeo.internal.a0.t tVar, t.b bVar, a aVar) {
            this.f62699a = tVar;
            this.f62700b = bVar;
            this.f62701c = aVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.a0.p f62702a;

        /* renamed from: d, reason: collision with root package name */
        public int f62705d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f62706e;

        /* renamed from: c, reason: collision with root package name */
        public final List<t.a> f62704c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f62703b = new Object();

        public c(io.odeeo.internal.a0.t tVar, boolean z10) {
            this.f62702a = new io.odeeo.internal.a0.p(tVar, z10);
        }

        @Override // io.odeeo.internal.b.e0
        public y0 getTimeline() {
            return this.f62702a.getTimeline();
        }

        @Override // io.odeeo.internal.b.e0
        public Object getUid() {
            return this.f62703b;
        }

        public void reset(int i10) {
            this.f62705d = i10;
            this.f62706e = false;
            this.f62704c.clear();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        void onPlaylistUpdateRequested();
    }

    public f0(d dVar, io.odeeo.internal.c.a aVar, Handler handler) {
        this.f62687d = dVar;
        u.a aVar2 = new u.a();
        this.f62688e = aVar2;
        g.a aVar3 = new g.a();
        this.f62689f = aVar3;
        this.f62690g = new HashMap<>();
        this.f62691h = new HashSet();
        if (aVar != null) {
            aVar2.addEventListener(handler, aVar);
            aVar3.addEventListener(handler, aVar);
        }
    }

    public y0 addMediaSources(int i10, List<c> list, io.odeeo.internal.a0.f0 f0Var) {
        if (!list.isEmpty()) {
            this.f62692i = f0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f62684a.get(i11 - 1);
                    cVar.reset(cVar2.f62702a.getTimeline().getWindowCount() + cVar2.f62705d);
                } else {
                    cVar.reset(0);
                }
                a(i11, cVar.f62702a.getTimeline().getWindowCount());
                this.f62684a.add(i11, cVar);
                this.f62686c.put(cVar.f62703b, cVar);
                if (this.f62693j) {
                    d(cVar);
                    if (this.f62685b.isEmpty()) {
                        this.f62691h.add(cVar);
                    } else {
                        a(cVar);
                    }
                }
            }
        }
        return createTimeline();
    }

    public final void c(c cVar) {
        if (cVar.f62706e && cVar.f62704c.isEmpty()) {
            b bVar = (b) io.odeeo.internal.q0.a.checkNotNull(this.f62690g.remove(cVar));
            bVar.f62699a.releaseSource(bVar.f62700b);
            bVar.f62699a.removeEventListener(bVar.f62701c);
            bVar.f62699a.removeDrmEventListener(bVar.f62701c);
            this.f62691h.remove(cVar);
        }
    }

    public y0 clear(io.odeeo.internal.a0.f0 f0Var) {
        if (f0Var == null) {
            f0Var = this.f62692i.cloneAndClear();
        }
        this.f62692i = f0Var;
        b(0, getSize());
        return createTimeline();
    }

    public io.odeeo.internal.a0.r createPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
        Object objB = b(aVar.f62447a);
        t.a aVarCopyWithPeriodUid = aVar.copyWithPeriodUid(a(aVar.f62447a));
        c cVar = (c) io.odeeo.internal.q0.a.checkNotNull(this.f62686c.get(objB));
        b(cVar);
        cVar.f62704c.add(aVarCopyWithPeriodUid);
        io.odeeo.internal.a0.o oVarCreatePeriod = cVar.f62702a.createPeriod(aVarCopyWithPeriodUid, bVar, j10);
        this.f62685b.put(oVarCreatePeriod, cVar);
        a();
        return oVarCreatePeriod;
    }

    public y0 createTimeline() {
        if (this.f62684a.isEmpty()) {
            return y0.f63072a;
        }
        int windowCount = 0;
        for (int i10 = 0; i10 < this.f62684a.size(); i10++) {
            c cVar = this.f62684a.get(i10);
            cVar.f62705d = windowCount;
            windowCount += cVar.f62702a.getTimeline().getWindowCount();
        }
        return new n0(this.f62684a, this.f62692i);
    }

    public final void d(c cVar) {
        io.odeeo.internal.a0.p pVar = cVar.f62702a;
        t.b bVar = new t.b() { // from class: is.a
            @Override // io.odeeo.internal.a0.t.b
            public final void onSourceInfoRefreshed(t tVar, y0 y0Var) {
                this.f68376a.a(tVar, y0Var);
            }
        };
        a aVar = new a(cVar);
        this.f62690g.put(cVar, new b(pVar, bVar, aVar));
        pVar.addEventListener(io.odeeo.internal.q0.g0.createHandlerForCurrentOrMainLooper(), aVar);
        pVar.addDrmEventListener(io.odeeo.internal.q0.g0.createHandlerForCurrentOrMainLooper(), aVar);
        pVar.prepareSource(bVar, this.f62694k);
    }

    public int getSize() {
        return this.f62684a.size();
    }

    public boolean isPrepared() {
        return this.f62693j;
    }

    public y0 moveMediaSource(int i10, int i11, io.odeeo.internal.a0.f0 f0Var) {
        return moveMediaSourceRange(i10, i10 + 1, i11, f0Var);
    }

    public y0 moveMediaSourceRange(int i10, int i11, int i12, io.odeeo.internal.a0.f0 f0Var) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize() && i12 >= 0);
        this.f62692i = f0Var;
        if (i10 == i11 || i10 == i12) {
            return createTimeline();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int windowCount = this.f62684a.get(iMin).f62705d;
        io.odeeo.internal.q0.g0.moveItems(this.f62684a, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f62684a.get(iMin);
            cVar.f62705d = windowCount;
            windowCount += cVar.f62702a.getTimeline().getWindowCount();
            iMin++;
        }
        return createTimeline();
    }

    public void prepare(io.odeeo.internal.p0.b0 b0Var) {
        io.odeeo.internal.q0.a.checkState(!this.f62693j);
        this.f62694k = b0Var;
        for (int i10 = 0; i10 < this.f62684a.size(); i10++) {
            c cVar = this.f62684a.get(i10);
            d(cVar);
            this.f62691h.add(cVar);
        }
        this.f62693j = true;
    }

    public void release() {
        for (b bVar : this.f62690g.values()) {
            try {
                bVar.f62699a.releaseSource(bVar.f62700b);
            } catch (RuntimeException e10) {
                io.odeeo.internal.q0.p.e("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f62699a.removeEventListener(bVar.f62701c);
            bVar.f62699a.removeDrmEventListener(bVar.f62701c);
        }
        this.f62690g.clear();
        this.f62691h.clear();
        this.f62693j = false;
    }

    public void releasePeriod(io.odeeo.internal.a0.r rVar) {
        c cVar = (c) io.odeeo.internal.q0.a.checkNotNull(this.f62685b.remove(rVar));
        cVar.f62702a.releasePeriod(rVar);
        cVar.f62704c.remove(((io.odeeo.internal.a0.o) rVar).f62418a);
        if (!this.f62685b.isEmpty()) {
            a();
        }
        c(cVar);
    }

    public y0 removeMediaSourceRange(int i10, int i11, io.odeeo.internal.a0.f0 f0Var) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize());
        this.f62692i = f0Var;
        b(i10, i11);
        return createTimeline();
    }

    public y0 setMediaSources(List<c> list, io.odeeo.internal.a0.f0 f0Var) {
        b(0, this.f62684a.size());
        return addMediaSources(this.f62684a.size(), list, f0Var);
    }

    public y0 setShuffleOrder(io.odeeo.internal.a0.f0 f0Var) {
        int size = getSize();
        if (f0Var.getLength() != size) {
            f0Var = f0Var.cloneAndClear().cloneAndInsert(0, size);
        }
        this.f62692i = f0Var;
        return createTimeline();
    }

    public final void b(c cVar) {
        this.f62691h.add(cVar);
        b bVar = this.f62690g.get(cVar);
        if (bVar != null) {
            bVar.f62699a.enable(bVar.f62700b);
        }
    }

    public final void a() {
        Iterator<c> it = this.f62691h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f62704c.isEmpty()) {
                a(next);
                it.remove();
            }
        }
    }

    public final void b(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f62684a.remove(i12);
            this.f62686c.remove(cVarRemove.f62703b);
            a(i12, -cVarRemove.f62702a.getTimeline().getWindowCount());
            cVarRemove.f62706e = true;
            if (this.f62693j) {
                c(cVarRemove);
            }
        }
    }

    public final void a(c cVar) {
        b bVar = this.f62690g.get(cVar);
        if (bVar != null) {
            bVar.f62699a.disable(bVar.f62700b);
        }
    }

    public static t.a b(c cVar, t.a aVar) {
        for (int i10 = 0; i10 < cVar.f62704c.size(); i10++) {
            if (cVar.f62704c.get(i10).f62450d == aVar.f62450d) {
                return aVar.copyWithPeriodUid(a(cVar, aVar.f62447a));
            }
        }
        return null;
    }

    public final void a(int i10, int i11) {
        while (i10 < this.f62684a.size()) {
            this.f62684a.get(i10).f62705d += i11;
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(io.odeeo.internal.a0.t tVar, y0 y0Var) {
        this.f62687d.onPlaylistUpdateRequested();
    }

    public static Object a(Object obj) {
        return io.odeeo.internal.b.a.getChildPeriodUidFromConcatenatedUid(obj);
    }

    public static int b(c cVar, int i10) {
        return i10 + cVar.f62705d;
    }

    public static Object a(c cVar, Object obj) {
        return io.odeeo.internal.b.a.getConcatenatedUid(cVar.f62703b, obj);
    }

    public static Object b(Object obj) {
        return io.odeeo.internal.b.a.getChildTimelineUidFromConcatenatedUid(obj);
    }
}
