package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
public enum h implements r {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* renamed from: a, reason: collision with root package name */
    public final String f68644a;

    static {
        Duration.r(31556952L, 0);
        Duration.r(7889238L, 0);
    }

    h(String str) {
        this.f68644a = str;
    }

    @Override // j$.time.temporal.r
    public final l r(l lVar, long j10) {
        int i10 = b.f68640a[ordinal()];
        if (i10 == 1) {
            return lVar.g(Math.addExact(lVar.d(r0), j10), i.f68647c);
        }
        if (i10 == 2) {
            return lVar.j(j10 / 4, ChronoUnit.YEARS).j((j10 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f68644a;
    }
}
