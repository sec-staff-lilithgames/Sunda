package j$.time.format;

import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class p extends j {

    /* renamed from: g, reason: collision with root package name */
    public final char f68568g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68569h;

    @Override // j$.time.format.j, j$.time.format.f
    public final boolean r(u uVar, StringBuilder sb2) {
        j$.time.temporal.u uVar2;
        f jVar;
        Locale locale = uVar.f68589b.f68532b;
        ConcurrentMap concurrentMap = j$.time.temporal.v.f68676g;
        Objects.requireNonNull(locale, "locale");
        j$.time.temporal.v vVarA = j$.time.temporal.v.a(j$.time.e.f68526a[((((int) ((r0.getFirstDayOfWeek() - 1) % 7)) + 7) + j$.time.e.SUNDAY.ordinal()) % 7], Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c10 = this.f68568g;
        if (c10 == 'W') {
            uVar2 = vVarA.f68681d;
        } else {
            if (c10 == 'Y') {
                j$.time.temporal.u uVar3 = vVarA.f68683f;
                int i10 = this.f68569h;
                if (i10 == 2) {
                    jVar = new m(uVar3, 2, 2, m.f68561h, this.f68552e);
                } else {
                    jVar = new j(uVar3, i10, 19, i10 < 4 ? a0.NORMAL : a0.EXCEEDS_PAD, this.f68552e);
                }
                return jVar.r(uVar, sb2);
            }
            if (c10 == 'c' || c10 == 'e') {
                uVar2 = vVarA.f68680c;
            } else {
                if (c10 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                uVar2 = vVarA.f68682e;
            }
        }
        jVar = new j(uVar2, this.f68549b, this.f68550c, a0.NOT_NEGATIVE, this.f68552e);
        return jVar.r(uVar, sb2);
    }

    public p(char c10, int i10, int i11, int i12, int i13) {
        super(null, i11, i12, a0.NOT_NEGATIVE, i13);
        this.f68568g = c10;
        this.f68569h = i10;
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.f68552e == -1) {
            return this;
        }
        return new p(this.f68568g, this.f68569h, this.f68549b, this.f68550c, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i10) {
        return new p(this.f68568g, this.f68569h, this.f68549b, this.f68550c, this.f68552e + i10);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i10 = this.f68569h;
        char c10 = this.f68568g;
        if (c10 != 'Y') {
            if (c10 == 'W') {
                sb2.append("WeekOfMonth");
            } else if (c10 == 'c' || c10 == 'e') {
                sb2.append("DayOfWeek");
            } else if (c10 == 'w') {
                sb2.append("WeekOfWeekBasedYear");
            }
            sb2.append(",");
            sb2.append(i10);
        } else if (i10 == 1) {
            sb2.append("WeekBasedYear");
        } else if (i10 == 2) {
            sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb2.append("WeekBasedYear,");
            sb2.append(i10);
            sb2.append(",19,");
            sb2.append(i10 < 4 ? a0.NORMAL : a0.EXCEEDS_PAD);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
