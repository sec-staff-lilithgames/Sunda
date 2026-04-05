package j$.time.format;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: e, reason: collision with root package name */
    public static final DateTimeFormatter f68530e;

    /* renamed from: a, reason: collision with root package name */
    public final e f68531a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f68532b;

    /* renamed from: c, reason: collision with root package name */
    public final y f68533c;

    /* renamed from: d, reason: collision with root package name */
    public final j$.time.chrono.m f68534d;

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0479 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.format.DateTimeFormatter ofPattern(java.lang.String r20, java.util.Locale r21) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.ofPattern(java.lang.String, java.util.Locale):j$.time.format.DateTimeFormatter");
    }

    static {
        s sVar = new s();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        a0 a0Var = a0.EXCEEDS_PAD;
        sVar.l(aVar, 4, 10, a0Var);
        sVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        sVar.k(aVar2, 2);
        sVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        sVar.k(aVar3, 2);
        z zVar = z.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.f68512c;
        DateTimeFormatter dateTimeFormatterO = sVar.o(zVar, tVar);
        ISO_LOCAL_DATE = dateTimeFormatterO;
        s sVar2 = new s();
        n nVar = n.INSENSITIVE;
        sVar2.b(nVar);
        sVar2.a(dateTimeFormatterO);
        k kVar = k.f68554e;
        sVar2.b(kVar);
        sVar2.o(zVar, tVar);
        s sVar3 = new s();
        sVar3.b(nVar);
        sVar3.a(dateTimeFormatterO);
        sVar3.n();
        sVar3.b(kVar);
        sVar3.o(zVar, tVar);
        s sVar4 = new s();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        sVar4.k(aVar4, 2);
        sVar4.c(AbstractJsonLexerKt.COLON);
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        sVar4.k(aVar5, 2);
        sVar4.n();
        sVar4.c(AbstractJsonLexerKt.COLON);
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        sVar4.k(aVar6, 2);
        sVar4.n();
        sVar4.b(new g(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true));
        DateTimeFormatter dateTimeFormatterO2 = sVar4.o(zVar, null);
        s sVar5 = new s();
        sVar5.b(nVar);
        sVar5.a(dateTimeFormatterO2);
        sVar5.b(kVar);
        sVar5.o(zVar, null);
        s sVar6 = new s();
        sVar6.b(nVar);
        sVar6.a(dateTimeFormatterO2);
        sVar6.n();
        sVar6.b(kVar);
        sVar6.o(zVar, null);
        s sVar7 = new s();
        sVar7.b(nVar);
        sVar7.a(dateTimeFormatterO);
        sVar7.c('T');
        sVar7.a(dateTimeFormatterO2);
        DateTimeFormatter dateTimeFormatterO3 = sVar7.o(zVar, tVar);
        s sVar8 = new s();
        sVar8.b(nVar);
        sVar8.a(dateTimeFormatterO3);
        n nVar2 = n.LENIENT;
        sVar8.b(nVar2);
        sVar8.b(kVar);
        n nVar3 = n.STRICT;
        sVar8.b(nVar3);
        DateTimeFormatter dateTimeFormatterO4 = sVar8.o(zVar, tVar);
        s sVar9 = new s();
        sVar9.a(dateTimeFormatterO4);
        sVar9.n();
        sVar9.c(AbstractJsonLexerKt.BEGIN_LIST);
        n nVar4 = n.SENSITIVE;
        sVar9.b(nVar4);
        a aVar7 = s.f68575h;
        sVar9.b(new q(aVar7, "ZoneRegionId()"));
        sVar9.c(AbstractJsonLexerKt.END_LIST);
        sVar9.o(zVar, tVar);
        s sVar10 = new s();
        sVar10.a(dateTimeFormatterO3);
        sVar10.n();
        sVar10.b(kVar);
        sVar10.n();
        sVar10.c(AbstractJsonLexerKt.BEGIN_LIST);
        sVar10.b(nVar4);
        sVar10.b(new q(aVar7, "ZoneRegionId()"));
        sVar10.c(AbstractJsonLexerKt.END_LIST);
        sVar10.o(zVar, tVar);
        s sVar11 = new s();
        sVar11.b(nVar);
        sVar11.l(aVar, 4, 10, a0Var);
        sVar11.c('-');
        sVar11.k(j$.time.temporal.a.DAY_OF_YEAR, 3);
        sVar11.n();
        sVar11.b(kVar);
        sVar11.o(zVar, tVar);
        s sVar12 = new s();
        sVar12.b(nVar);
        sVar12.l(j$.time.temporal.i.f68647c, 4, 10, a0Var);
        sVar12.d("-W");
        sVar12.k(j$.time.temporal.i.f68646b, 2);
        sVar12.c('-');
        j$.time.temporal.a aVar8 = j$.time.temporal.a.DAY_OF_WEEK;
        sVar12.k(aVar8, 1);
        sVar12.n();
        sVar12.b(kVar);
        sVar12.o(zVar, tVar);
        s sVar13 = new s();
        sVar13.b(nVar);
        sVar13.b(new h());
        f68530e = sVar13.o(zVar, null);
        s sVar14 = new s();
        sVar14.b(nVar);
        sVar14.k(aVar, 4);
        sVar14.k(aVar2, 2);
        sVar14.k(aVar3, 2);
        sVar14.n();
        sVar14.b(nVar2);
        sVar14.f("+HHMMss", "Z");
        sVar14.b(nVar3);
        sVar14.o(zVar, tVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        s sVar15 = new s();
        sVar15.b(nVar);
        sVar15.b(nVar2);
        sVar15.n();
        sVar15.g(aVar8, map);
        sVar15.d(", ");
        sVar15.m();
        sVar15.l(aVar3, 1, 2, a0.NOT_NEGATIVE);
        sVar15.c(' ');
        sVar15.g(aVar2, map2);
        sVar15.c(' ');
        sVar15.k(aVar, 4);
        sVar15.c(' ');
        sVar15.k(aVar4, 2);
        sVar15.c(AbstractJsonLexerKt.COLON);
        sVar15.k(aVar5, 2);
        sVar15.n();
        sVar15.c(AbstractJsonLexerKt.COLON);
        sVar15.k(aVar6, 2);
        sVar15.m();
        sVar15.c(' ');
        sVar15.f("+HHMM", "GMT");
        sVar15.o(z.SMART, tVar);
    }

    public DateTimeFormatter(e eVar, Locale locale, z zVar, j$.time.chrono.m mVar) {
        y yVar = y.f68595a;
        this.f68531a = eVar;
        Objects.requireNonNull(locale, "locale");
        this.f68532b = locale;
        this.f68533c = yVar;
        Objects.requireNonNull(zVar, "resolverStyle");
        this.f68534d = mVar;
    }

    public final String a(j$.time.temporal.m mVar) {
        StringBuilder sb2 = new StringBuilder(32);
        try {
            this.f68531a.r(new u(mVar, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new j$.time.c(e10.getMessage(), e10);
        }
    }

    public final String toString() {
        String string = this.f68531a.toString();
        return string.startsWith(C3191e4.i.f36529d) ? string : string.substring(1, string.length() - 1);
    }
}
