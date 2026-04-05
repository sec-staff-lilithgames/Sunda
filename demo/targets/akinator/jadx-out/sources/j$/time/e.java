package j$.time;

import j$.time.temporal.ChronoUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e implements j$.time.temporal.m, j$.time.temporal.n {
    public static final e FRIDAY;
    public static final e MONDAY;
    public static final e SATURDAY;
    public static final e SUNDAY;
    public static final e THURSDAY;
    public static final e TUESDAY;
    public static final e WEDNESDAY;

    /* renamed from: a, reason: collision with root package name */
    public static final e[] f68526a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f68527b;

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f68527b.clone();
    }

    static {
        e eVar = new e("MONDAY", 0);
        MONDAY = eVar;
        e eVar2 = new e("TUESDAY", 1);
        TUESDAY = eVar2;
        e eVar3 = new e("WEDNESDAY", 2);
        WEDNESDAY = eVar3;
        e eVar4 = new e("THURSDAY", 3);
        THURSDAY = eVar4;
        e eVar5 = new e("FRIDAY", 4);
        FRIDAY = eVar5;
        e eVar6 = new e("SATURDAY", 5);
        SATURDAY = eVar6;
        e eVar7 = new e("SUNDAY", 6);
        SUNDAY = eVar7;
        f68527b = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f68526a = values();
    }

    public static e r(int i10) {
        if (i10 < 1 || i10 > 7) {
            throw new c("Invalid value for DayOfWeek: " + i10);
        }
        return f68526a[i10 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.DAY_OF_WEEK : pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return pVar.range();
        }
        return super.i(pVar);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return super.d(pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
        }
        return pVar.D(this);
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.DAYS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.g(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
