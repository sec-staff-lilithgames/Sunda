package com.google.android.exoplayer2;

import android.util.Pair;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a extends m3 {

    /* renamed from: g, reason: collision with root package name */
    public final int f27026g;

    /* renamed from: h, reason: collision with root package name */
    public final bf.f1 f27027h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27028i;

    public a(boolean z10, bf.f1 f1Var) {
        this.f27028i = z10;
        this.f27027h = f1Var;
        this.f27026g = f1Var.getLength();
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

    public abstract int a(Object obj);

    public abstract int b(int i10);

    public abstract int c(int i10);

    public abstract Object d(int i10);

    public abstract int e(int i10);

    public abstract int f(int i10);

    public final int g(int i10, boolean z10) {
        if (z10) {
            return this.f27027h.getNextIndex(i10);
        }
        if (i10 < this.f27026g - 1) {
            return i10 + 1;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.m3
    public int getFirstWindowIndex(boolean z10) {
        if (this.f27026g == 0) {
            return -1;
        }
        if (this.f27028i) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f27027h.getFirstIndex() : 0;
        while (h(firstIndex).isEmpty()) {
            firstIndex = g(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return h(firstIndex).getFirstWindowIndex(z10) + f(firstIndex);
    }

    @Override // com.google.android.exoplayer2.m3
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
        return e(iA) + indexOfPeriod;
    }

    @Override // com.google.android.exoplayer2.m3
    public int getLastWindowIndex(boolean z10) {
        int i10 = this.f27026g;
        if (i10 != 0) {
            if (this.f27028i) {
                z10 = false;
            }
            bf.f1 f1Var = this.f27027h;
            int lastIndex = z10 ? f1Var.getLastIndex() : i10 - 1;
            while (h(lastIndex).isEmpty()) {
                lastIndex = z10 ? f1Var.getPreviousIndex(lastIndex) : lastIndex > 0 ? lastIndex - 1 : -1;
                if (lastIndex == -1) {
                }
            }
            return h(lastIndex).getLastWindowIndex(z10) + f(lastIndex);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.m3
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (this.f27028i) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iC = c(i10);
        int iF = f(iC);
        int nextWindowIndex = h(iC).getNextWindowIndex(i10 - iF, i11 != 2 ? i11 : 0, z10);
        if (nextWindowIndex != -1) {
            return iF + nextWindowIndex;
        }
        int iG = g(iC, z10);
        while (iG != -1 && h(iG).isEmpty()) {
            iG = g(iG, z10);
        }
        if (iG != -1) {
            return h(iG).getFirstWindowIndex(z10) + f(iG);
        }
        if (i11 == 2) {
            return getFirstWindowIndex(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.m3
    public final k3 getPeriod(int i10, k3 k3Var, boolean z10) {
        int iB = b(i10);
        int iF = f(iB);
        h(iB).getPeriod(i10 - e(iB), k3Var, z10);
        k3Var.f27598e += iF;
        if (z10) {
            k3Var.f27597c = getConcatenatedUid(d(iB), com.google.android.exoplayer2.util.a.checkNotNull(k3Var.f27597c));
        }
        return k3Var;
    }

    @Override // com.google.android.exoplayer2.m3
    public final k3 getPeriodByUid(Object obj, k3 k3Var) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int iA = a(childTimelineUidFromConcatenatedUid);
        int iF = f(iA);
        h(iA).getPeriodByUid(childPeriodUidFromConcatenatedUid, k3Var);
        k3Var.f27598e += iF;
        k3Var.f27597c = obj;
        return k3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        r0 = -1;
     */
    @Override // com.google.android.exoplayer2.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getPreviousWindowIndex(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f27028i
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto Lb
            if (r8 != r1) goto La
            r8 = r3
        La:
            r9 = r2
        Lb:
            int r0 = r6.c(r7)
            int r4 = r6.f(r0)
            com.google.android.exoplayer2.m3 r5 = r6.h(r0)
            int r7 = r7 - r4
            if (r8 != r3) goto L1b
            goto L1c
        L1b:
            r2 = r8
        L1c:
            int r7 = r5.getPreviousWindowIndex(r7, r2, r9)
            r2 = -1
            if (r7 == r2) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            bf.f1 r7 = r6.f27027h
            if (r9 == 0) goto L2e
            int r0 = r7.getPreviousIndex(r0)
            goto L33
        L2e:
            if (r0 <= 0) goto L32
            int r0 = r0 - r1
            goto L33
        L32:
            r0 = r2
        L33:
            if (r0 == r2) goto L4b
            com.google.android.exoplayer2.m3 r1 = r6.h(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4b
            if (r9 == 0) goto L46
            int r0 = r7.getPreviousIndex(r0)
            goto L33
        L46:
            if (r0 <= 0) goto L32
            int r0 = r0 + (-1)
            goto L33
        L4b:
            if (r0 == r2) goto L5b
            int r7 = r6.f(r0)
            com.google.android.exoplayer2.m3 r8 = r6.h(r0)
            int r8 = r8.getLastWindowIndex(r9)
            int r8 = r8 + r7
            return r8
        L5b:
            if (r8 != r3) goto L62
            int r7 = r6.getLastWindowIndex(r9)
            return r7
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.a.getPreviousWindowIndex(int, int, boolean):int");
    }

    @Override // com.google.android.exoplayer2.m3
    public final Object getUidOfPeriod(int i10) {
        int iB = b(i10);
        return getConcatenatedUid(d(iB), h(iB).getUidOfPeriod(i10 - e(iB)));
    }

    @Override // com.google.android.exoplayer2.m3
    public final l3 getWindow(int i10, l3 l3Var, long j10) {
        int iC = c(i10);
        int iF = f(iC);
        int iE = e(iC);
        h(iC).getWindow(i10 - iF, l3Var, j10);
        Object objD = d(iC);
        if (!l3.f27640t.equals(l3Var.f27647b)) {
            objD = getConcatenatedUid(objD, l3Var.f27647b);
        }
        l3Var.f27647b = objD;
        l3Var.f27661q += iE;
        l3Var.f27662r += iE;
        return l3Var;
    }

    public abstract m3 h(int i10);
}
