package j$.time.format;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: h, reason: collision with root package name */
    public static final a f68575h = new a(0);

    /* renamed from: i, reason: collision with root package name */
    public static final Map f68576i;

    /* renamed from: a, reason: collision with root package name */
    public s f68577a;

    /* renamed from: b, reason: collision with root package name */
    public final s f68578b;

    /* renamed from: c, reason: collision with root package name */
    public final List f68579c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68580d;

    /* renamed from: e, reason: collision with root package name */
    public int f68581e;

    /* renamed from: f, reason: collision with root package name */
    public char f68582f;

    /* renamed from: g, reason: collision with root package name */
    public int f68583g;

    static {
        HashMap map = new HashMap();
        f68576i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.f68645a;
        map.put('Q', gVar);
        map.put('q', gVar);
        Character chValueOf = Character.valueOf(GMTDateParser.MONTH);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put(chValueOf, aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put(Character.valueOf(GMTDateParser.DAY_OF_MONTH), j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put(Character.valueOf(GMTDateParser.HOURS), j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put(Character.valueOf(GMTDateParser.MINUTES), j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put(Character.valueOf(GMTDateParser.SECONDS), j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.k.f68653a);
    }

    public s() {
        this.f68577a = this;
        this.f68579c = new ArrayList();
        this.f68583g = -1;
        this.f68578b = null;
        this.f68580d = false;
    }

    public s(s sVar) {
        this.f68577a = this;
        this.f68579c = new ArrayList();
        this.f68583g = -1;
        this.f68578b = sVar;
        this.f68580d = true;
    }

    public final void j(j$.time.temporal.p pVar) {
        i(new j(pVar, 1, 19, a0.NORMAL));
    }

    public final void k(j$.time.temporal.p pVar, int i10) {
        Objects.requireNonNull(pVar, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        i(new j(pVar, i10, i10, a0.NOT_NEGATIVE));
    }

    public final void l(j$.time.temporal.p pVar, int i10, int i11, a0 a0Var) {
        if (i10 == i11 && a0Var == a0.NOT_NEGATIVE) {
            k(pVar, i11);
            return;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(a0Var, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
        i(new j(pVar, i10, i11, a0Var));
    }

    public final void i(j jVar) {
        j jVarB;
        s sVar = this.f68577a;
        int i10 = sVar.f68583g;
        if (i10 < 0) {
            sVar.f68583g = b(jVar);
            return;
        }
        j jVar2 = (j) ((ArrayList) sVar.f68579c).get(i10);
        int i11 = jVar.f68549b;
        int i12 = jVar.f68550c;
        if (i11 == i12 && jVar.f68551d == a0.NOT_NEGATIVE) {
            jVarB = jVar2.c(i12);
            b(jVar.b());
            this.f68577a.f68583g = i10;
        } else {
            jVarB = jVar2.b();
            this.f68577a.f68583g = b(jVar);
        }
        ((ArrayList) this.f68577a.f68579c).set(i10, jVarB);
    }

    public final void h(j$.time.temporal.p pVar, b0 b0Var) {
        Objects.requireNonNull(b0Var, "textStyle");
        b(new o(pVar, b0Var, x.f68594c));
    }

    public final void g(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        b0 b0Var = b0.FULL;
        b(new o(aVar, b0Var, new b(new w(Collections.singletonMap(b0Var, linkedHashMap)))));
    }

    public final void f(String str, String str2) {
        b(new k(str, str2));
    }

    public final void e(b0 b0Var) {
        Objects.requireNonNull(b0Var, TtmlNode.TAG_STYLE);
        if (b0Var != b0.FULL && b0Var != b0.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        b(new i(b0Var, 0));
    }

    public final void c(char c10) {
        b(new d(c10));
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new d(str.charAt(0)));
        } else {
            b(new i(str, 1));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        e eVar = dateTimeFormatter.f68531a;
        if (eVar.f68543b) {
            eVar = new e(eVar.f68542a, false);
        }
        b(eVar);
    }

    public final void n() {
        s sVar = this.f68577a;
        sVar.f68583g = -1;
        this.f68577a = new s(sVar);
    }

    public final void m() {
        s sVar = this.f68577a;
        if (sVar.f68578b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) sVar.f68579c).size() > 0) {
            s sVar2 = this.f68577a;
            e eVar = new e(sVar2.f68579c, sVar2.f68580d);
            this.f68577a = this.f68577a.f68578b;
            b(eVar);
            return;
        }
        this.f68577a = this.f68577a.f68578b;
    }

    public final int b(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        s sVar = this.f68577a;
        int i10 = sVar.f68581e;
        if (i10 > 0) {
            l lVar = new l(fVar, i10, sVar.f68582f);
            sVar.f68581e = 0;
            sVar.f68582f = (char) 0;
            fVar = lVar;
        }
        ((ArrayList) sVar.f68579c).add(fVar);
        this.f68577a.f68583g = -1;
        return ((ArrayList) r5.f68579c).size() - 1;
    }

    public final DateTimeFormatter o(z zVar, j$.time.chrono.m mVar) {
        return p(Locale.getDefault(), zVar, mVar);
    }

    public final DateTimeFormatter p(Locale locale, z zVar, j$.time.chrono.m mVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f68577a.f68578b != null) {
            m();
        }
        e eVar = new e(this.f68579c, false);
        y yVar = y.f68595a;
        return new DateTimeFormatter(eVar, locale, zVar, mVar);
    }
}
