package gn;

import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s1 extends u1 {

    /* renamed from: e, reason: collision with root package name */
    public final b5 f58161e;

    /* renamed from: f, reason: collision with root package name */
    public final b5 f58162f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f58163g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f58164h;

    public s1(b5 b5Var, b5 b5Var2, int[] iArr) {
        io.bidmachine.media3.common.util.a.checkArgument(b5Var.size() == iArr.length);
        this.f58161e = b5Var;
        this.f58162f = b5Var2;
        this.f58163g = iArr;
        this.f58164h = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f58164h[iArr[i10]] = i10;
        }
    }

    @Override // gn.u1
    public int getFirstWindowIndex(boolean z10) {
        if (isEmpty()) {
            return -1;
        }
        if (z10) {
            return this.f58163g[0];
        }
        return 0;
    }

    @Override // gn.u1
    public int getIndexOfPeriod(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // gn.u1
    public int getLastWindowIndex(boolean z10) {
        if (isEmpty()) {
            return -1;
        }
        if (!z10) {
            return getWindowCount() - 1;
        }
        return this.f58163g[getWindowCount() - 1];
    }

    @Override // gn.u1
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == getLastWindowIndex(z10)) {
            if (i11 == 2) {
                return getFirstWindowIndex(z10);
            }
            return -1;
        }
        if (!z10) {
            return i10 + 1;
        }
        return this.f58163g[this.f58164h[i10] + 1];
    }

    @Override // gn.u1
    public r1 getPeriod(int i10, r1 r1Var, boolean z10) {
        r1 r1Var2 = (r1) this.f58162f.get(i10);
        r1Var.set(r1Var2.f58108a, r1Var2.f58109b, r1Var2.f58110c, r1Var2.f58111d, r1Var2.f58112e, r1Var2.f58114g, r1Var2.f58113f);
        return r1Var;
    }

    @Override // gn.u1
    public int getPeriodCount() {
        return this.f58162f.size();
    }

    @Override // gn.u1
    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == getFirstWindowIndex(z10)) {
            if (i11 == 2) {
                return getLastWindowIndex(z10);
            }
            return -1;
        }
        if (!z10) {
            return i10 - 1;
        }
        return this.f58163g[this.f58164h[i10] - 1];
    }

    @Override // gn.u1
    public Object getUidOfPeriod(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // gn.u1
    public t1 getWindow(int i10, t1 t1Var, long j10) {
        t1 t1Var2 = (t1) this.f58161e.get(i10);
        t1Var.set(t1Var2.f58175a, t1Var2.f58177c, t1Var2.f58178d, t1Var2.f58179e, t1Var2.f58180f, t1Var2.f58181g, t1Var2.f58182h, t1Var2.f58183i, t1Var2.f58184j, t1Var2.f58186l, t1Var2.f58187m, t1Var2.f58188n, t1Var2.f58189o, t1Var2.f58190p);
        t1Var.f58185k = t1Var2.f58185k;
        return t1Var;
    }

    @Override // gn.u1
    public int getWindowCount() {
        return this.f58161e.size();
    }
}
