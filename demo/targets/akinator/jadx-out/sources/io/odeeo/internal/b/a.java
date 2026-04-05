package io.odeeo.internal.b;

import android.util.Pair;
import io.odeeo.internal.b.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f62552c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.a0.f0 f62553d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f62554e;

    public a(boolean z10, io.odeeo.internal.a0.f0 f0Var) {
        this.f62554e = z10;
        this.f62553d = f0Var;
        this.f62552c = f0Var.getLength();
    }

    public static Object getChildPeriodUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object getChildTimelineUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object getConcatenatedUid(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public final int a(int i10, boolean z10) {
        if (z10) {
            return this.f62553d.getNextIndex(i10);
        }
        if (i10 < this.f62552c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract int a(Object obj);

    public final int b(int i10, boolean z10) {
        if (z10) {
            return this.f62553d.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract int c(int i10);

    public abstract int d(int i10);

    public abstract Object e(int i10);

    public abstract int f(int i10);

    public abstract int g(int i10);

    @Override // io.odeeo.internal.b.y0
    public int getFirstWindowIndex(boolean z10) {
        if (this.f62552c == 0) {
            return -1;
        }
        if (this.f62554e) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f62553d.getFirstIndex() : 0;
        while (h(firstIndex).isEmpty()) {
            firstIndex = a(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return h(firstIndex).getFirstWindowIndex(z10) + g(firstIndex);
    }

    @Override // io.odeeo.internal.b.y0
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int iA = a(childTimelineUidFromConcatenatedUid);
        if (iA == -1 || (indexOfPeriod = h(iA).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) == -1) {
            return -1;
        }
        return f(iA) + indexOfPeriod;
    }

    @Override // io.odeeo.internal.b.y0
    public int getLastWindowIndex(boolean z10) {
        int i10 = this.f62552c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f62554e) {
            z10 = false;
        }
        int lastIndex = z10 ? this.f62553d.getLastIndex() : i10 - 1;
        while (h(lastIndex).isEmpty()) {
            lastIndex = b(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return h(lastIndex).getLastWindowIndex(z10) + g(lastIndex);
    }

    @Override // io.odeeo.internal.b.y0
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (this.f62554e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iD = d(i10);
        int iG = g(iD);
        int nextWindowIndex = h(iD).getNextWindowIndex(i10 - iG, i11 != 2 ? i11 : 0, z10);
        if (nextWindowIndex != -1) {
            return iG + nextWindowIndex;
        }
        int iA = a(iD, z10);
        while (iA != -1 && h(iA).isEmpty()) {
            iA = a(iA, z10);
        }
        if (iA != -1) {
            return h(iA).getFirstWindowIndex(z10) + g(iA);
        }
        if (i11 == 2) {
            return getFirstWindowIndex(z10);
        }
        return -1;
    }

    @Override // io.odeeo.internal.b.y0
    public final y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
        int iC = c(i10);
        int iG = g(iC);
        h(iC).getPeriod(i10 - f(iC), bVar, z10);
        bVar.f63077c += iG;
        if (z10) {
            bVar.f63076b = getConcatenatedUid(e(iC), io.odeeo.internal.q0.a.checkNotNull(bVar.f63076b));
        }
        return bVar;
    }

    @Override // io.odeeo.internal.b.y0
    public final y0.b getPeriodByUid(Object obj, y0.b bVar) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int iA = a(childTimelineUidFromConcatenatedUid);
        int iG = g(iA);
        h(iA).getPeriodByUid(childPeriodUidFromConcatenatedUid, bVar);
        bVar.f63077c += iG;
        bVar.f63076b = obj;
        return bVar;
    }

    @Override // io.odeeo.internal.b.y0
    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        if (this.f62554e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iD = d(i10);
        int iG = g(iD);
        int previousWindowIndex = h(iD).getPreviousWindowIndex(i10 - iG, i11 != 2 ? i11 : 0, z10);
        if (previousWindowIndex != -1) {
            return iG + previousWindowIndex;
        }
        int iB = b(iD, z10);
        while (iB != -1 && h(iB).isEmpty()) {
            iB = b(iB, z10);
        }
        if (iB != -1) {
            return h(iB).getLastWindowIndex(z10) + g(iB);
        }
        if (i11 == 2) {
            return getLastWindowIndex(z10);
        }
        return -1;
    }

    @Override // io.odeeo.internal.b.y0
    public final Object getUidOfPeriod(int i10) {
        int iC = c(i10);
        return getConcatenatedUid(e(iC), h(iC).getUidOfPeriod(i10 - f(iC)));
    }

    @Override // io.odeeo.internal.b.y0
    public final y0.d getWindow(int i10, y0.d dVar, long j10) {
        int iD = d(i10);
        int iG = g(iD);
        int iF = f(iD);
        h(iD).getWindow(i10 - iG, dVar, j10);
        Object objE = e(iD);
        if (!y0.d.f63086r.equals(dVar.f63090a)) {
            objE = getConcatenatedUid(objE, dVar.f63090a);
        }
        dVar.f63090a = objE;
        dVar.f63104o += iF;
        dVar.f63105p += iF;
        return dVar;
    }

    public abstract y0 h(int i10);
}
