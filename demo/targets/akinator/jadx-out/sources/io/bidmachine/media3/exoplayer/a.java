package io.bidmachine.media3.exoplayer;

import android.util.Pair;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a extends gn.u1 {

    /* renamed from: e, reason: collision with root package name */
    public final int f60870e;

    /* renamed from: f, reason: collision with root package name */
    public final ao.s1 f60871f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f60872g;

    public a(boolean z10, ao.s1 s1Var) {
        this.f60872g = z10;
        this.f60871f = s1Var;
        this.f60870e = s1Var.getLength();
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
            return this.f60871f.getNextIndex(i10);
        }
        if (i10 < this.f60870e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    @Override // gn.u1
    public int getFirstWindowIndex(boolean z10) {
        if (this.f60870e == 0) {
            return -1;
        }
        if (this.f60872g) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f60871f.getFirstIndex() : 0;
        while (h(firstIndex).isEmpty()) {
            firstIndex = g(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return h(firstIndex).getFirstWindowIndex(z10) + f(firstIndex);
    }

    @Override // gn.u1
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

    @Override // gn.u1
    public int getLastWindowIndex(boolean z10) {
        int i10 = this.f60870e;
        if (i10 != 0) {
            if (this.f60872g) {
                z10 = false;
            }
            ao.s1 s1Var = this.f60871f;
            int lastIndex = z10 ? s1Var.getLastIndex() : i10 - 1;
            while (h(lastIndex).isEmpty()) {
                lastIndex = z10 ? s1Var.getPreviousIndex(lastIndex) : lastIndex > 0 ? lastIndex - 1 : -1;
                if (lastIndex == -1) {
                }
            }
            return h(lastIndex).getLastWindowIndex(z10) + f(lastIndex);
        }
        return -1;
    }

    @Override // gn.u1
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (this.f60872g) {
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

    @Override // gn.u1
    public final gn.r1 getPeriod(int i10, gn.r1 r1Var, boolean z10) {
        int iB = b(i10);
        int iF = f(iB);
        h(iB).getPeriod(i10 - e(iB), r1Var, z10);
        r1Var.f58110c += iF;
        if (z10) {
            r1Var.f58109b = getConcatenatedUid(d(iB), io.bidmachine.media3.common.util.a.checkNotNull(r1Var.f58109b));
        }
        return r1Var;
    }

    @Override // gn.u1
    public final gn.r1 getPeriodByUid(Object obj, gn.r1 r1Var) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int iA = a(childTimelineUidFromConcatenatedUid);
        int iF = f(iA);
        h(iA).getPeriodByUid(childPeriodUidFromConcatenatedUid, r1Var);
        r1Var.f58110c += iF;
        r1Var.f58109b = obj;
        return r1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        r0 = -1;
     */
    @Override // gn.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getPreviousWindowIndex(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f60872g
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
            gn.u1 r5 = r6.h(r0)
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
            ao.s1 r7 = r6.f60871f
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
            gn.u1 r1 = r6.h(r0)
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
            gn.u1 r8 = r6.h(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.a.getPreviousWindowIndex(int, int, boolean):int");
    }

    @Override // gn.u1
    public final Object getUidOfPeriod(int i10) {
        int iB = b(i10);
        return getConcatenatedUid(d(iB), h(iB).getUidOfPeriod(i10 - e(iB)));
    }

    @Override // gn.u1
    public final gn.t1 getWindow(int i10, gn.t1 t1Var, long j10) {
        int iC = c(i10);
        int iF = f(iC);
        int iE = e(iC);
        h(iC).getWindow(i10 - iF, t1Var, j10);
        Object objD = d(iC);
        if (!gn.t1.f58165q.equals(t1Var.f58175a)) {
            objD = getConcatenatedUid(objD, t1Var.f58175a);
        }
        t1Var.f58175a = objD;
        t1Var.f58188n += iE;
        t1Var.f58189o += iE;
        return t1Var;
    }

    public abstract gn.u1 h(int i10);
}
