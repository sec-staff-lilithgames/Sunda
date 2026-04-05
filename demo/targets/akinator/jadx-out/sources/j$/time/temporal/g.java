package j$.time.temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f68641a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f68642b;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f68642b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final t range() {
                return t.f(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.p
            public final boolean r(m mVar) {
                if (!mVar.e(a.DAY_OF_YEAR) || !mVar.e(a.MONTH_OF_YEAR) || !mVar.e(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.f68645a;
                return j$.time.chrono.m.l(mVar).equals(j$.time.chrono.t.f68512c);
            }

            @Override // j$.time.temporal.p
            public final t t(m mVar) {
                if (!r(mVar)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                long jF = mVar.f(g.QUARTER_OF_YEAR);
                if (jF == 1) {
                    return j$.time.chrono.t.f68512c.H(mVar.f(a.YEAR)) ? t.e(1L, 91L) : t.e(1L, 90L);
                }
                if (jF == 2) {
                    return t.e(1L, 91L);
                }
                if (jF == 3 || jF == 4) {
                    return t.e(1L, 92L);
                }
                return range();
            }

            @Override // j$.time.temporal.p
            public final long D(m mVar) {
                if (!r(mVar)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                return mVar.d(a.DAY_OF_YEAR) - g.f68641a[((mVar.d(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.t.f68512c.H(mVar.f(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final l G(l lVar, long j10) {
                long jD = D(lVar);
                range().b(j10, this);
                a aVar = a.DAY_OF_YEAR;
                return lVar.g((j10 - jD) + lVar.f(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final t range() {
                return t.e(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final boolean r(m mVar) {
                if (!mVar.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.f68645a;
                return j$.time.chrono.m.l(mVar).equals(j$.time.chrono.t.f68512c);
            }

            @Override // j$.time.temporal.p
            public final long D(m mVar) {
                if (!r(mVar)) {
                    throw new s("Unsupported field: QuarterOfYear");
                }
                return (mVar.f(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.p
            public final t t(m mVar) {
                if (!r(mVar)) {
                    throw new s("Unsupported field: QuarterOfYear");
                }
                return range();
            }

            @Override // j$.time.temporal.p
            public final l G(l lVar, long j10) {
                long jD = D(lVar);
                range().b(j10, this);
                a aVar = a.MONTH_OF_YEAR;
                return lVar.g(((j10 - jD) * 3) + lVar.f(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final t range() {
                return t.f(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.p
            public final boolean r(m mVar) {
                if (!mVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.f68645a;
                return j$.time.chrono.m.l(mVar).equals(j$.time.chrono.t.f68512c);
            }

            @Override // j$.time.temporal.p
            public final t t(m mVar) {
                if (!r(mVar)) {
                    throw new s("Unsupported field: WeekOfWeekBasedYear");
                }
                return t.e(1L, g.K(g.J(j$.time.h.D(mVar))));
            }

            @Override // j$.time.temporal.p
            public final long D(m mVar) {
                if (!r(mVar)) {
                    throw new s("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.I(j$.time.h.D(mVar));
            }

            @Override // j$.time.temporal.p
            public final l G(l lVar, long j10) {
                range().b(j10, this);
                return lVar.j(Math.subtractExact(j10, D(lVar)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final t range() {
                return a.YEAR.f68639b;
            }

            @Override // j$.time.temporal.p
            public final boolean r(m mVar) {
                if (!mVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.f68645a;
                return j$.time.chrono.m.l(mVar).equals(j$.time.chrono.t.f68512c);
            }

            @Override // j$.time.temporal.p
            public final long D(m mVar) {
                if (r(mVar)) {
                    return g.J(j$.time.h.D(mVar));
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final t t(m mVar) {
                if (!r(mVar)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                return range();
            }

            @Override // j$.time.temporal.p
            public final l G(l lVar, long j10) {
                if (!r(lVar)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.f68639b.a(j10, g.WEEK_BASED_YEAR);
                j$.time.h hVarD = j$.time.h.D(lVar);
                int iD = hVarD.d(a.DAY_OF_WEEK);
                int I = g.I(hVarD);
                if (I == 53 && g.K(iA) == 52) {
                    I = 52;
                }
                return lVar.h(j$.time.h.M(iA, 1, 4).P(((I - 1) * 7) + (iD - r6.d(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        f68642b = new g[]{gVar, gVar2, gVar3, gVar4};
        f68641a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int K(int i10) {
        j$.time.h hVarM = j$.time.h.M(i10, 1, 1);
        if (hVarM.I() != j$.time.e.THURSDAY) {
            return (hVarM.I() == j$.time.e.WEDNESDAY && hVarM.s()) ? 53 : 52;
        }
        return 53;
    }

    public static int I(j$.time.h hVar) {
        int iOrdinal = hVar.I().ordinal();
        int iJ = hVar.J() - 1;
        int i10 = (3 - iOrdinal) + iJ;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iJ < i12) {
            return (int) t.e(1L, K(J(hVar.V(180).R(-1L)))).f68666d;
        }
        int i13 = ((iJ - i12) / 7) + 1;
        if (i13 != 53 || i12 == -3 || (i12 == -2 && hVar.s())) {
            return i13;
        }
        return 1;
    }

    public static int J(j$.time.h hVar) {
        int i10 = hVar.f68601a;
        int iJ = hVar.J();
        if (iJ <= 3) {
            return iJ - hVar.I().ordinal() < -2 ? i10 - 1 : i10;
        }
        if (iJ >= 363) {
            return ((iJ - 363) - (hVar.s() ? 1 : 0)) - hVar.I().ordinal() >= 0 ? i10 + 1 : i10;
        }
        return i10;
    }
}
