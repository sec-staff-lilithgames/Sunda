package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import com.applovin.impl.c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final on.f0 f61253a;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f61257e;

    /* renamed from: h, reason: collision with root package name */
    public final on.a f61260h;

    /* renamed from: i, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.v f61261i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f61263k;

    /* renamed from: l, reason: collision with root package name */
    public ln.g0 f61264l;

    /* renamed from: j, reason: collision with root package name */
    public ao.s1 f61262j = new ao.r1(0);

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f61255c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f61256d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f61254b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f61258f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f61259g = new HashSet();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements ao.s0, sn.r {

        /* renamed from: b, reason: collision with root package name */
        public final c f61265b;

        public a(c cVar) {
            this.f61265b = cVar;
        }

        public final Pair a(int i10, ao.k0 k0Var) {
            ao.k0 k0VarCopyWithPeriodUid;
            c cVar = this.f61265b;
            ao.k0 k0Var2 = null;
            if (k0Var != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f61272c.size()) {
                        k0VarCopyWithPeriodUid = null;
                        break;
                    }
                    if (((ao.k0) cVar.f61272c.get(i11)).f7721d == k0Var.f7721d) {
                        k0VarCopyWithPeriodUid = k0Var.copyWithPeriodUid(io.bidmachine.media3.exoplayer.a.getConcatenatedUid(cVar.f61271b, k0Var.f7718a));
                        break;
                    }
                    i11++;
                }
                if (k0VarCopyWithPeriodUid == null) {
                    return null;
                }
                k0Var2 = k0VarCopyWithPeriodUid;
            }
            return Pair.create(Integer.valueOf(i10 + cVar.f61273d), k0Var2);
        }

        @Override // ao.s0
        public void onDownstreamFormatChanged(int i10, ao.k0 k0Var, ao.g0 g0Var) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new h1(this, pairA, g0Var, 0));
            }
        }

        @Override // sn.r
        public void onDrmKeysLoaded(int i10, ao.k0 k0Var) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new f1(this, pairA, 1));
            }
        }

        @Override // sn.r
        public void onDrmKeysRemoved(int i10, ao.k0 k0Var) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new f1(this, pairA, 0));
            }
        }

        @Override // sn.r
        public void onDrmKeysRestored(int i10, ao.k0 k0Var) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new f1(this, pairA, 3));
            }
        }

        @Override // sn.r
        public void onDrmSessionAcquired(int i10, ao.k0 k0Var, int i11) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new androidx.browser.customtabs.h(this, pairA, i11, 9));
            }
        }

        @Override // sn.r
        public void onDrmSessionManagerError(int i10, ao.k0 k0Var, Exception exc) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new b1(this, 1, pairA, exc));
            }
        }

        @Override // sn.r
        public void onDrmSessionReleased(int i10, ao.k0 k0Var) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new f1(this, pairA, 2));
            }
        }

        @Override // ao.s0
        public void onLoadCanceled(int i10, ao.k0 k0Var, ao.b0 b0Var, ao.g0 g0Var) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new g1(this, pairA, b0Var, g0Var, 0));
            }
        }

        @Override // ao.s0
        public void onLoadCompleted(int i10, ao.k0 k0Var, ao.b0 b0Var, ao.g0 g0Var) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new g1(this, pairA, b0Var, g0Var, 1));
            }
        }

        @Override // ao.s0
        public void onLoadError(int i10, ao.k0 k0Var, ao.b0 b0Var, ao.g0 g0Var, IOException iOException, boolean z10) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new bf.h0(this, pairA, b0Var, g0Var, iOException, z10, 3));
            }
        }

        @Override // ao.s0
        public void onLoadStarted(int i10, ao.k0 k0Var, ao.b0 b0Var, ao.g0 g0Var, int i11) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new c9(this, pairA, b0Var, g0Var, i11));
            }
        }

        @Override // ao.s0
        public void onUpstreamDiscarded(int i10, ao.k0 k0Var, ao.g0 g0Var) {
            Pair pairA = a(i10, k0Var);
            if (pairA != null) {
                i1.this.f61261i.post(new h1(this, pairA, g0Var, 1));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ao.m0 f61267a;

        /* renamed from: b, reason: collision with root package name */
        public final ao.l0 f61268b;

        /* renamed from: c, reason: collision with root package name */
        public final a f61269c;

        public b(ao.m0 m0Var, ao.l0 l0Var, a aVar) {
            this.f61267a = m0Var;
            this.f61268b = l0Var;
            this.f61269c = aVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements d1 {

        /* renamed from: a, reason: collision with root package name */
        public final ao.f0 f61270a;

        /* renamed from: d, reason: collision with root package name */
        public int f61273d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f61274e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f61272c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f61271b = new Object();

        public c(ao.m0 m0Var, boolean z10) {
            this.f61270a = new ao.f0(m0Var, z10);
        }

        @Override // io.bidmachine.media3.exoplayer.d1
        public gn.u1 getTimeline() {
            return this.f61270a.getTimeline();
        }

        @Override // io.bidmachine.media3.exoplayer.d1
        public Object getUid() {
            return this.f61271b;
        }

        public void reset(int i10) {
            this.f61273d = i10;
            this.f61274e = false;
            this.f61272c.clear();
        }
    }

    public i1(j1 j1Var, on.a aVar, io.bidmachine.media3.common.util.v vVar, on.f0 f0Var) {
        this.f61253a = f0Var;
        this.f61257e = j1Var;
        this.f61260h = aVar;
        this.f61261i = vVar;
    }

    public final void a() {
        Iterator it = this.f61259g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f61272c.isEmpty()) {
                b bVar = (b) this.f61258f.get(cVar);
                if (bVar != null) {
                    bVar.f61267a.disable(bVar.f61268b);
                }
                it.remove();
            }
        }
    }

    public gn.u1 addMediaSources(int i10, List<c> list, ao.s1 s1Var) {
        if (!list.isEmpty()) {
            this.f61262j = s1Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                ArrayList arrayList = this.f61254b;
                if (i11 > 0) {
                    c cVar2 = (c) arrayList.get(i11 - 1);
                    cVar.reset(cVar2.f61270a.getTimeline().getWindowCount() + cVar2.f61273d);
                } else {
                    cVar.reset(0);
                }
                int windowCount = cVar.f61270a.getTimeline().getWindowCount();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((c) arrayList.get(i12)).f61273d += windowCount;
                }
                arrayList.add(i11, cVar);
                this.f61256d.put(cVar.f61271b, cVar);
                if (this.f61263k) {
                    c(cVar);
                    if (this.f61255c.isEmpty()) {
                        this.f61259g.add(cVar);
                    } else {
                        b bVar = (b) this.f61258f.get(cVar);
                        if (bVar != null) {
                            bVar.f61267a.disable(bVar.f61268b);
                        }
                    }
                }
            }
        }
        return createTimeline();
    }

    public final void b(c cVar) {
        if (cVar.f61274e && cVar.f61272c.isEmpty()) {
            b bVar = (b) io.bidmachine.media3.common.util.a.checkNotNull((b) this.f61258f.remove(cVar));
            ao.m0 m0Var = bVar.f61267a;
            a aVar = bVar.f61269c;
            m0Var.releaseSource(bVar.f61268b);
            m0Var.removeEventListener(aVar);
            m0Var.removeDrmEventListener(aVar);
            this.f61259g.remove(cVar);
        }
    }

    public final void c(c cVar) {
        ao.f0 f0Var = cVar.f61270a;
        ao.l0 l0Var = new ao.l0() { // from class: io.bidmachine.media3.exoplayer.e1
            @Override // ao.l0
            public final void onSourceInfoRefreshed(ao.m0 m0Var, gn.u1 u1Var) {
                this.f61187a.f61257e.onPlaylistUpdateRequested();
            }
        };
        a aVar = new a(cVar);
        this.f61258f.put(cVar, new b(f0Var, l0Var, aVar));
        f0Var.addEventListener(io.bidmachine.media3.common.util.a1.createHandlerForCurrentOrMainLooper(), aVar);
        f0Var.addDrmEventListener(io.bidmachine.media3.common.util.a1.createHandlerForCurrentOrMainLooper(), aVar);
        f0Var.prepareSource(l0Var, this.f61264l, this.f61253a);
    }

    public gn.u1 clear(ao.s1 s1Var) {
        if (s1Var == null) {
            s1Var = this.f61262j.cloneAndClear();
        }
        this.f61262j = s1Var;
        d(0, getSize());
        return createTimeline();
    }

    public ao.i0 createPeriod(ao.k0 k0Var, go.c cVar, long j10) {
        Object childTimelineUidFromConcatenatedUid = io.bidmachine.media3.exoplayer.a.getChildTimelineUidFromConcatenatedUid(k0Var.f7718a);
        ao.k0 k0VarCopyWithPeriodUid = k0Var.copyWithPeriodUid(io.bidmachine.media3.exoplayer.a.getChildPeriodUidFromConcatenatedUid(k0Var.f7718a));
        c cVar2 = (c) io.bidmachine.media3.common.util.a.checkNotNull((c) this.f61256d.get(childTimelineUidFromConcatenatedUid));
        this.f61259g.add(cVar2);
        b bVar = (b) this.f61258f.get(cVar2);
        if (bVar != null) {
            bVar.f61267a.enable(bVar.f61268b);
        }
        cVar2.f61272c.add(k0VarCopyWithPeriodUid);
        ao.d0 d0VarCreatePeriod = cVar2.f61270a.createPeriod(k0VarCopyWithPeriodUid, cVar, j10);
        this.f61255c.put(d0VarCreatePeriod, cVar2);
        a();
        return d0VarCreatePeriod;
    }

    public gn.u1 createTimeline() {
        ArrayList arrayList = this.f61254b;
        if (arrayList.isEmpty()) {
            return gn.u1.f58195a;
        }
        int windowCount = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f61273d = windowCount;
            windowCount += cVar.f61270a.getTimeline().getWindowCount();
        }
        return new q1(arrayList, this.f61262j);
    }

    public final void d(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f61254b;
            c cVar = (c) arrayList.remove(i12);
            this.f61256d.remove(cVar.f61271b);
            int i13 = -cVar.f61270a.getTimeline().getWindowCount();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f61273d += i13;
            }
            cVar.f61274e = true;
            if (this.f61263k) {
                b(cVar);
            }
        }
    }

    public ao.s1 getShuffleOrder() {
        return this.f61262j;
    }

    public int getSize() {
        return this.f61254b.size();
    }

    public boolean isPrepared() {
        return this.f61263k;
    }

    public gn.u1 moveMediaSource(int i10, int i11, ao.s1 s1Var) {
        return moveMediaSourceRange(i10, i10 + 1, i11, s1Var);
    }

    public gn.u1 moveMediaSourceRange(int i10, int i11, int i12, ao.s1 s1Var) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize() && i12 >= 0);
        this.f61262j = s1Var;
        if (i10 == i11 || i10 == i12) {
            return createTimeline();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        ArrayList arrayList = this.f61254b;
        int windowCount = ((c) arrayList.get(iMin)).f61273d;
        io.bidmachine.media3.common.util.a1.moveItems(arrayList, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = (c) arrayList.get(iMin);
            cVar.f61273d = windowCount;
            windowCount += cVar.f61270a.getTimeline().getWindowCount();
            iMin++;
        }
        return createTimeline();
    }

    public void prepare(ln.g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkState(!this.f61263k);
        this.f61264l = g0Var;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f61254b;
            if (i10 >= arrayList.size()) {
                this.f61263k = true;
                return;
            }
            c cVar = (c) arrayList.get(i10);
            c(cVar);
            this.f61259g.add(cVar);
            i10++;
        }
    }

    public void release() {
        HashMap map = this.f61258f;
        for (b bVar : map.values()) {
            try {
                bVar.f61267a.releaseSource(bVar.f61268b);
            } catch (RuntimeException e10) {
                io.bidmachine.media3.common.util.b0.e("MediaSourceList", "Failed to release child source.", e10);
            }
            ao.m0 m0Var = bVar.f61267a;
            a aVar = bVar.f61269c;
            m0Var.removeEventListener(aVar);
            bVar.f61267a.removeDrmEventListener(aVar);
        }
        map.clear();
        this.f61259g.clear();
        this.f61263k = false;
    }

    public void releasePeriod(ao.i0 i0Var) {
        IdentityHashMap identityHashMap = this.f61255c;
        c cVar = (c) io.bidmachine.media3.common.util.a.checkNotNull((c) identityHashMap.remove(i0Var));
        cVar.f61270a.releasePeriod(i0Var);
        cVar.f61272c.remove(((ao.d0) i0Var).f7605b);
        if (!identityHashMap.isEmpty()) {
            a();
        }
        b(cVar);
    }

    public gn.u1 removeMediaSourceRange(int i10, int i11, ao.s1 s1Var) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize());
        this.f61262j = s1Var;
        d(i10, i11);
        return createTimeline();
    }

    public gn.u1 setMediaSources(List<c> list, ao.s1 s1Var) {
        ArrayList arrayList = this.f61254b;
        d(0, arrayList.size());
        return addMediaSources(arrayList.size(), list, s1Var);
    }

    public gn.u1 setShuffleOrder(ao.s1 s1Var) {
        int size = getSize();
        if (s1Var.getLength() != size) {
            s1Var = s1Var.cloneAndClear().cloneAndInsert(0, size);
        }
        this.f61262j = s1Var;
        return createTimeline();
    }

    public gn.u1 updateMediaSourcesWithMediaItems(int i10, int i11, List<gn.p0> list) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize());
        io.bidmachine.media3.common.util.a.checkArgument(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((c) this.f61254b.get(i12)).f61270a.updateMediaItem(list.get(i12 - i10));
        }
        return createTimeline();
    }
}
