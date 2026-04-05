package j$.time;

import com.vungle.ads.internal.protos.Sdk;
import j$.time.temporal.ChronoUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m implements j$.time.temporal.m, j$.time.temporal.n {
    public static final m APRIL;
    public static final m AUGUST;
    public static final m DECEMBER;
    public static final m FEBRUARY;
    public static final m JANUARY;
    public static final m JULY;
    public static final m JUNE;
    public static final m MARCH;
    public static final m MAY;
    public static final m NOVEMBER;
    public static final m OCTOBER;
    public static final m SEPTEMBER;

    /* renamed from: a, reason: collision with root package name */
    public static final m[] f68616a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ m[] f68617b;

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f68617b.clone();
    }

    static {
        m mVar = new m("JANUARY", 0);
        JANUARY = mVar;
        m mVar2 = new m("FEBRUARY", 1);
        FEBRUARY = mVar2;
        m mVar3 = new m("MARCH", 2);
        MARCH = mVar3;
        m mVar4 = new m("APRIL", 3);
        APRIL = mVar4;
        m mVar5 = new m("MAY", 4);
        MAY = mVar5;
        m mVar6 = new m("JUNE", 5);
        JUNE = mVar6;
        m mVar7 = new m("JULY", 6);
        JULY = mVar7;
        m mVar8 = new m("AUGUST", 7);
        AUGUST = mVar8;
        m mVar9 = new m("SEPTEMBER", 8);
        SEPTEMBER = mVar9;
        m mVar10 = new m("OCTOBER", 9);
        OCTOBER = mVar10;
        m mVar11 = new m("NOVEMBER", 10);
        NOVEMBER = mVar11;
        m mVar12 = new m("DECEMBER", 11);
        DECEMBER = mVar12;
        f68617b = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12};
        f68616a = values();
    }

    public static m G(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new c("Invalid value for MonthOfYear: " + i10);
        }
        return f68616a[i10 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR : pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.range();
        }
        return super.i(pVar);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.d(pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
        }
        return pVar.D(this);
    }

    public final int t(boolean z10) {
        int i10 = l.f68615a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public final int D() {
        int i10 = l.f68615a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int r(boolean z10) {
        switch (l.f68615a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68657b) {
            return j$.time.chrono.t.f68512c;
        }
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.MONTHS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.m.l(lVar).equals(j$.time.chrono.t.f68512c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return lVar.g(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
