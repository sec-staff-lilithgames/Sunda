package j$.time.temporal;

import com.ironsource.C3191e4;

/* loaded from: classes3.dex */
public final class u implements p {

    /* renamed from: f, reason: collision with root package name */
    public static final t f68667f = t.e(1, 7);

    /* renamed from: g, reason: collision with root package name */
    public static final t f68668g = t.f(0, 4, 6);

    /* renamed from: h, reason: collision with root package name */
    public static final t f68669h = t.f(0, 52, 54);

    /* renamed from: i, reason: collision with root package name */
    public static final t f68670i = t.f(1, 52, 53);

    /* renamed from: a, reason: collision with root package name */
    public final String f68671a;

    /* renamed from: b, reason: collision with root package name */
    public final v f68672b;

    /* renamed from: c, reason: collision with root package name */
    public final r f68673c;

    /* renamed from: d, reason: collision with root package name */
    public final r f68674d;

    /* renamed from: e, reason: collision with root package name */
    public final t f68675e;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public u(String str, v vVar, r rVar, r rVar2, t tVar) {
        this.f68671a = str;
        this.f68672b = vVar;
        this.f68673c = rVar;
        this.f68674d = rVar2;
        this.f68675e = tVar;
    }

    @Override // j$.time.temporal.p
    public final long D(m mVar) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        r rVar = this.f68674d;
        if (rVar == chronoUnit) {
            iC = b(mVar);
        } else if (rVar != ChronoUnit.MONTHS) {
            if (rVar != ChronoUnit.YEARS) {
                if (rVar == v.f68677h) {
                    iC = c(mVar);
                } else {
                    if (rVar != ChronoUnit.FOREVER) {
                        throw new IllegalStateException("unreachable, rangeUnit: " + rVar + ", this: " + this);
                    }
                    int iB = b(mVar);
                    int iD = mVar.d(a.YEAR);
                    a aVar = a.DAY_OF_YEAR;
                    int iD2 = mVar.d(aVar);
                    int iF = f(iD2, iB);
                    int iA = a(iF, iD2);
                    if (iA == 0) {
                        iD--;
                    } else if (iA >= a(iF, ((int) mVar.i(aVar).f68666d) + this.f68672b.f68679b)) {
                        iD++;
                    }
                    return iD;
                }
            } else {
                int iB2 = b(mVar);
                int iD3 = mVar.d(a.DAY_OF_YEAR);
                iC = a(f(iD3, iB2), iD3);
            }
        } else {
            int iB3 = b(mVar);
            int iD4 = mVar.d(a.DAY_OF_MONTH);
            iC = a(f(iD4, iB3), iD4);
        }
        return iC;
    }

    public final int b(m mVar) {
        return Math.floorMod(mVar.d(a.DAY_OF_WEEK) - this.f68672b.f68678a.getValue(), 7) + 1;
    }

    public final int c(m mVar) {
        int iA;
        int iB = b(mVar);
        a aVar = a.DAY_OF_YEAR;
        int iD = mVar.d(aVar);
        int iF = f(iD, iB);
        int iA2 = a(iF, iD);
        if (iA2 == 0) {
            return c(j$.time.chrono.m.l(mVar).x(mVar).a(iD, (r) ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iF, ((int) mVar.i(aVar).f68666d) + this.f68672b.f68679b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int f(int i10, int i11) {
        int iFloorMod = Math.floorMod(i10 - i11, 7);
        return iFloorMod + 1 > this.f68672b.f68679b ? 7 - iFloorMod : -iFloorMod;
    }

    public static int a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    @Override // j$.time.temporal.p
    public final l G(l lVar, long j10) {
        if (this.f68675e.a(j10, this) == lVar.d(this)) {
            return lVar;
        }
        if (this.f68674d != ChronoUnit.FOREVER) {
            return lVar.j(r0 - r1, this.f68673c);
        }
        v vVar = this.f68672b;
        int iD = lVar.d(vVar.f68680c);
        int iD2 = lVar.d(vVar.f68682e);
        j$.time.chrono.b bVarQ = j$.time.chrono.m.l(lVar).q((int) j10);
        int iF = f(1, b(bVarQ));
        int i10 = iD - 1;
        return bVarQ.j(((Math.min(iD2, a(iF, bVarQ.E() + vVar.f68679b) - 1) - 1) * 7) + i10 + (-iF), (r) ChronoUnit.DAYS);
    }

    @Override // j$.time.temporal.p
    public final t range() {
        return this.f68675e;
    }

    @Override // j$.time.temporal.p
    public final boolean r(m mVar) {
        if (!mVar.e(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        r rVar = this.f68674d;
        if (rVar == chronoUnit) {
            return true;
        }
        if (rVar == ChronoUnit.MONTHS) {
            return mVar.e(a.DAY_OF_MONTH);
        }
        if (rVar == ChronoUnit.YEARS) {
            return mVar.e(a.DAY_OF_YEAR);
        }
        if (rVar == v.f68677h) {
            return mVar.e(a.DAY_OF_YEAR);
        }
        if (rVar == ChronoUnit.FOREVER) {
            return mVar.e(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.p
    public final t t(m mVar) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        r rVar = this.f68674d;
        if (rVar == chronoUnit) {
            return this.f68675e;
        }
        if (rVar == ChronoUnit.MONTHS) {
            return d(mVar, a.DAY_OF_MONTH);
        }
        if (rVar == ChronoUnit.YEARS) {
            return d(mVar, a.DAY_OF_YEAR);
        }
        if (rVar == v.f68677h) {
            return e(mVar);
        }
        if (rVar == ChronoUnit.FOREVER) {
            return a.YEAR.f68639b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + rVar + ", this: " + this);
    }

    public final t d(m mVar, a aVar) {
        int iF = f(mVar.d(aVar), b(mVar));
        t tVarI = mVar.i(aVar);
        return t.e(a(iF, (int) tVarI.f68663a), a(iF, (int) tVarI.f68666d));
    }

    public final t e(m mVar) {
        a aVar = a.DAY_OF_YEAR;
        if (!mVar.e(aVar)) {
            return f68669h;
        }
        int iB = b(mVar);
        int iD = mVar.d(aVar);
        int iF = f(iD, iB);
        int iA = a(iF, iD);
        if (iA != 0) {
            if (iA >= a(iF, this.f68672b.f68679b + ((int) mVar.i(aVar).f68666d))) {
                return e(j$.time.chrono.m.l(mVar).x(mVar).j((r0 - iD) + 8, (r) ChronoUnit.DAYS));
            }
            return t.e(1L, r1 - 1);
        }
        return e(j$.time.chrono.m.l(mVar).x(mVar).a(iD + 7, (r) ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.f68671a + C3191e4.i.f36529d + this.f68672b.toString() + C3191e4.i.f36531e;
    }
}
