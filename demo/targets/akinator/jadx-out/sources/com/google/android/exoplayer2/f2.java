package com.google.android.exoplayer2;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final zd.c0 f27465a;

    /* renamed from: e, reason: collision with root package name */
    public final g2 f27469e;

    /* renamed from: h, reason: collision with root package name */
    public final zd.a f27472h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.z f27473i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27475k;

    /* renamed from: l, reason: collision with root package name */
    public qf.c1 f27476l;

    /* renamed from: j, reason: collision with root package name */
    public bf.f1 f27474j = new bf.e1(0);

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f27467c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f27468d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27466b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f27470f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f27471g = new HashSet();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements bf.j0, de.q {

        /* renamed from: b, reason: collision with root package name */
        public final c f27477b;

        public a(c cVar) {
            this.f27477b = cVar;
        }

        public final Pair a(int i10, bf.d0 d0Var) {
            bf.d0 d0VarCopyWithPeriodUid;
            c cVar = this.f27477b;
            bf.d0 d0Var2 = null;
            if (d0Var != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f27484c.size()) {
                        d0VarCopyWithPeriodUid = null;
                        break;
                    }
                    if (((bf.d0) cVar.f27484c.get(i11)).f9196d == d0Var.f9196d) {
                        d0VarCopyWithPeriodUid = d0Var.copyWithPeriodUid(com.google.android.exoplayer2.a.getConcatenatedUid(cVar.f27483b, d0Var.f9193a));
                        break;
                    }
                    i11++;
                }
                if (d0VarCopyWithPeriodUid == null) {
                    return null;
                }
                d0Var2 = d0VarCopyWithPeriodUid;
            }
            return Pair.create(Integer.valueOf(i10 + cVar.f27485d), d0Var2);
        }

        @Override // bf.j0
        public void onDownstreamFormatChanged(int i10, bf.d0 d0Var, bf.y yVar) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new d2(this, pairA, yVar, 1));
            }
        }

        @Override // de.q
        public void onDrmKeysLoaded(int i10, bf.d0 d0Var) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new e2(this, pairA, 0));
            }
        }

        @Override // de.q
        public void onDrmKeysRemoved(int i10, bf.d0 d0Var) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new e2(this, pairA, 3));
            }
        }

        @Override // de.q
        public void onDrmKeysRestored(int i10, bf.d0 d0Var) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new e2(this, pairA, 1));
            }
        }

        @Override // de.q
        @Deprecated
        public /* bridge */ /* synthetic */ void onDrmSessionAcquired(int i10, bf.d0 d0Var) {
            super.onDrmSessionAcquired(i10, d0Var);
        }

        @Override // de.q
        public void onDrmSessionManagerError(int i10, bf.d0 d0Var, Exception exc) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new androidx.browser.customtabs.g(this, 26, pairA, exc));
            }
        }

        @Override // de.q
        public void onDrmSessionReleased(int i10, bf.d0 d0Var) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new e2(this, pairA, 2));
            }
        }

        @Override // bf.j0
        public void onLoadCanceled(int i10, bf.d0 d0Var, bf.t tVar, bf.y yVar) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new c2(this, pairA, tVar, yVar, 2));
            }
        }

        @Override // bf.j0
        public void onLoadCompleted(int i10, bf.d0 d0Var, bf.t tVar, bf.y yVar) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new c2(this, pairA, tVar, yVar, 0));
            }
        }

        @Override // bf.j0
        public void onLoadError(int i10, bf.d0 d0Var, bf.t tVar, bf.y yVar, IOException iOException, boolean z10) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new bf.h0(this, pairA, tVar, yVar, iOException, z10, 1));
            }
        }

        @Override // bf.j0
        public void onLoadStarted(int i10, bf.d0 d0Var, bf.t tVar, bf.y yVar) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new c2(this, pairA, tVar, yVar, 1));
            }
        }

        @Override // bf.j0
        public void onUpstreamDiscarded(int i10, bf.d0 d0Var, bf.y yVar) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new d2(this, pairA, yVar, 0));
            }
        }

        @Override // de.q
        public void onDrmSessionAcquired(int i10, bf.d0 d0Var, int i11) {
            Pair pairA = a(i10, d0Var);
            if (pairA != null) {
                f2.this.f27473i.post(new androidx.browser.customtabs.h(this, pairA, i11, 2));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final bf.f0 f27479a;

        /* renamed from: b, reason: collision with root package name */
        public final bf.e0 f27480b;

        /* renamed from: c, reason: collision with root package name */
        public final a f27481c;

        public b(bf.f0 f0Var, bf.e0 e0Var, a aVar) {
            this.f27479a = f0Var;
            this.f27480b = e0Var;
            this.f27481c = aVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements a2 {

        /* renamed from: a, reason: collision with root package name */
        public final bf.x f27482a;

        /* renamed from: d, reason: collision with root package name */
        public int f27485d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f27486e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f27484c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f27483b = new Object();

        public c(bf.f0 f0Var, boolean z10) {
            this.f27482a = new bf.x(f0Var, z10);
        }

        @Override // com.google.android.exoplayer2.a2
        public m3 getTimeline() {
            return this.f27482a.getTimeline();
        }

        @Override // com.google.android.exoplayer2.a2
        public Object getUid() {
            return this.f27483b;
        }

        public void reset(int i10) {
            this.f27485d = i10;
            this.f27486e = false;
            this.f27484c.clear();
        }
    }

    public f2(g2 g2Var, zd.a aVar, com.google.android.exoplayer2.util.z zVar, zd.c0 c0Var) {
        this.f27465a = c0Var;
        this.f27469e = g2Var;
        this.f27472h = aVar;
        this.f27473i = zVar;
    }

    public final void a() {
        Iterator it = this.f27471g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f27484c.isEmpty()) {
                b bVar = (b) this.f27470f.get(cVar);
                if (bVar != null) {
                    bVar.f27479a.disable(bVar.f27480b);
                }
                it.remove();
            }
        }
    }

    public m3 addMediaSources(int i10, List<c> list, bf.f1 f1Var) {
        if (!list.isEmpty()) {
            this.f27474j = f1Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                ArrayList arrayList = this.f27466b;
                if (i11 > 0) {
                    c cVar2 = (c) arrayList.get(i11 - 1);
                    cVar.reset(cVar2.f27482a.getTimeline().getWindowCount() + cVar2.f27485d);
                } else {
                    cVar.reset(0);
                }
                int windowCount = cVar.f27482a.getTimeline().getWindowCount();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((c) arrayList.get(i12)).f27485d += windowCount;
                }
                arrayList.add(i11, cVar);
                this.f27468d.put(cVar.f27483b, cVar);
                if (this.f27475k) {
                    c(cVar);
                    if (this.f27467c.isEmpty()) {
                        this.f27471g.add(cVar);
                    } else {
                        b bVar = (b) this.f27470f.get(cVar);
                        if (bVar != null) {
                            bVar.f27479a.disable(bVar.f27480b);
                        }
                    }
                }
            }
        }
        return createTimeline();
    }

    public final void b(c cVar) {
        if (cVar.f27486e && cVar.f27484c.isEmpty()) {
            b bVar = (b) com.google.android.exoplayer2.util.a.checkNotNull((b) this.f27470f.remove(cVar));
            bf.f0 f0Var = bVar.f27479a;
            a aVar = bVar.f27481c;
            f0Var.releaseSource(bVar.f27480b);
            f0Var.removeEventListener(aVar);
            f0Var.removeDrmEventListener(aVar);
            this.f27471g.remove(cVar);
        }
    }

    public final void c(c cVar) {
        bf.x xVar = cVar.f27482a;
        bf.e0 e0Var = new bf.e0() { // from class: com.google.android.exoplayer2.b2
            @Override // bf.e0
            public final void onSourceInfoRefreshed(bf.f0 f0Var, m3 m3Var) {
                this.f27339a.f27469e.onPlaylistUpdateRequested();
            }
        };
        a aVar = new a(cVar);
        this.f27470f.put(cVar, new b(xVar, e0Var, aVar));
        xVar.addEventListener(com.google.android.exoplayer2.util.n1.createHandlerForCurrentOrMainLooper(), aVar);
        xVar.addDrmEventListener(com.google.android.exoplayer2.util.n1.createHandlerForCurrentOrMainLooper(), aVar);
        xVar.prepareSource(e0Var, this.f27476l, this.f27465a);
    }

    public m3 clear(bf.f1 f1Var) {
        if (f1Var == null) {
            f1Var = this.f27474j.cloneAndClear();
        }
        this.f27474j = f1Var;
        d(0, getSize());
        return createTimeline();
    }

    public bf.a0 createPeriod(bf.d0 d0Var, qf.c cVar, long j10) {
        Object childTimelineUidFromConcatenatedUid = com.google.android.exoplayer2.a.getChildTimelineUidFromConcatenatedUid(d0Var.f9193a);
        bf.d0 d0VarCopyWithPeriodUid = d0Var.copyWithPeriodUid(com.google.android.exoplayer2.a.getChildPeriodUidFromConcatenatedUid(d0Var.f9193a));
        c cVar2 = (c) com.google.android.exoplayer2.util.a.checkNotNull((c) this.f27468d.get(childTimelineUidFromConcatenatedUid));
        this.f27471g.add(cVar2);
        b bVar = (b) this.f27470f.get(cVar2);
        if (bVar != null) {
            bVar.f27479a.enable(bVar.f27480b);
        }
        cVar2.f27484c.add(d0VarCopyWithPeriodUid);
        bf.v vVarCreatePeriod = cVar2.f27482a.createPeriod(d0VarCopyWithPeriodUid, cVar, j10);
        this.f27467c.put(vVarCreatePeriod, cVar2);
        a();
        return vVarCreatePeriod;
    }

    public m3 createTimeline() {
        ArrayList arrayList = this.f27466b;
        if (arrayList.isEmpty()) {
            return m3.f27695b;
        }
        int windowCount = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f27485d = windowCount;
            windowCount += cVar.f27482a.getTimeline().getWindowCount();
        }
        return new w2(arrayList, this.f27474j);
    }

    public final void d(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f27466b;
            c cVar = (c) arrayList.remove(i12);
            this.f27468d.remove(cVar.f27483b);
            int i13 = -cVar.f27482a.getTimeline().getWindowCount();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f27485d += i13;
            }
            cVar.f27486e = true;
            if (this.f27475k) {
                b(cVar);
            }
        }
    }

    public bf.f1 getShuffleOrder() {
        return this.f27474j;
    }

    public int getSize() {
        return this.f27466b.size();
    }

    public boolean isPrepared() {
        return this.f27475k;
    }

    public m3 moveMediaSource(int i10, int i11, bf.f1 f1Var) {
        return moveMediaSourceRange(i10, i10 + 1, i11, f1Var);
    }

    public m3 moveMediaSourceRange(int i10, int i11, int i12, bf.f1 f1Var) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize() && i12 >= 0);
        this.f27474j = f1Var;
        if (i10 == i11 || i10 == i12) {
            return createTimeline();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        ArrayList arrayList = this.f27466b;
        int windowCount = ((c) arrayList.get(iMin)).f27485d;
        com.google.android.exoplayer2.util.n1.moveItems(arrayList, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = (c) arrayList.get(iMin);
            cVar.f27485d = windowCount;
            windowCount += cVar.f27482a.getTimeline().getWindowCount();
            iMin++;
        }
        return createTimeline();
    }

    public void prepare(qf.c1 c1Var) {
        com.google.android.exoplayer2.util.a.checkState(!this.f27475k);
        this.f27476l = c1Var;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27466b;
            if (i10 >= arrayList.size()) {
                this.f27475k = true;
                return;
            }
            c cVar = (c) arrayList.get(i10);
            c(cVar);
            this.f27471g.add(cVar);
            i10++;
        }
    }

    public void release() {
        HashMap map = this.f27470f;
        for (b bVar : map.values()) {
            try {
                bVar.f27479a.releaseSource(bVar.f27480b);
            } catch (RuntimeException e10) {
                com.google.android.exoplayer2.util.f0.e("MediaSourceList", "Failed to release child source.", e10);
            }
            bf.f0 f0Var = bVar.f27479a;
            a aVar = bVar.f27481c;
            f0Var.removeEventListener(aVar);
            bVar.f27479a.removeDrmEventListener(aVar);
        }
        map.clear();
        this.f27471g.clear();
        this.f27475k = false;
    }

    public void releasePeriod(bf.a0 a0Var) {
        IdentityHashMap identityHashMap = this.f27467c;
        c cVar = (c) com.google.android.exoplayer2.util.a.checkNotNull((c) identityHashMap.remove(a0Var));
        cVar.f27482a.releasePeriod(a0Var);
        cVar.f27484c.remove(((bf.v) a0Var).f9440b);
        if (!identityHashMap.isEmpty()) {
            a();
        }
        b(cVar);
    }

    public m3 removeMediaSourceRange(int i10, int i11, bf.f1 f1Var) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= 0 && i10 <= i11 && i11 <= getSize());
        this.f27474j = f1Var;
        d(i10, i11);
        return createTimeline();
    }

    public m3 setMediaSources(List<c> list, bf.f1 f1Var) {
        ArrayList arrayList = this.f27466b;
        d(0, arrayList.size());
        return addMediaSources(arrayList.size(), list, f1Var);
    }

    public m3 setShuffleOrder(bf.f1 f1Var) {
        int size = getSize();
        if (f1Var.getLength() != size) {
            f1Var = f1Var.cloneAndClear().cloneAndInsert(0, size);
        }
        this.f27474j = f1Var;
        return createTimeline();
    }
}
