package io.ktor.http;

import a.b;
import com.amazon.device.ads.DTBMetricReport;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import io.ktor.util.date.GMTDate;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import qv.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CookieDateParser {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieDateParser$parse$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isDelimiter(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieDateParser$parse$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isNonDelimiter(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieDateParser$parse$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements l {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isDelimiter(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieDateParser$parse$4, reason: invalid class name */
    public static final class AnonymousClass4 extends f0 implements a {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            return "day-of-month not in [1,31]";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieDateParser$parse$5, reason: invalid class name */
    public static final class AnonymousClass5 extends f0 implements a {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            return "year >= 1601";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieDateParser$parse$6, reason: invalid class name */
    public static final class AnonymousClass6 extends f0 implements a {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            return "hours > 23";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieDateParser$parse$7, reason: invalid class name */
    public static final class AnonymousClass7 extends f0 implements a {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            return "minutes > 59";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieDateParser$parse$8, reason: invalid class name */
    public static final class AnonymousClass8 extends f0 implements a {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            return "seconds > 59";
        }
    }

    private final <T> void checkFieldNotNull(String str, String str2, T t10) {
        if (t10 == null) {
            throw new InvalidCookieDateException(str, b.k("Could not find ", str2));
        }
    }

    private final void checkRequirement(String str, boolean z10, a aVar) {
        if (!z10) {
            throw new InvalidCookieDateException(str, (String) aVar.invoke());
        }
    }

    public final GMTDate parse(String source) throws NumberFormatException {
        e0.checkNotNullParameter(source, "source");
        StringLexer stringLexer = new StringLexer(source);
        CookieDateBuilder cookieDateBuilder = new CookieDateBuilder();
        stringLexer.acceptWhile(AnonymousClass1.INSTANCE);
        while (stringLexer.getHasRemaining()) {
            if (stringLexer.test(AnonymousClass2.INSTANCE)) {
                int index = stringLexer.getIndex();
                stringLexer.acceptWhile(CookieDateParser$parse$token$1$1.INSTANCE);
                String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                CookieUtilsKt.handleToken(cookieDateBuilder, strSubstring);
                stringLexer.acceptWhile(AnonymousClass3.INSTANCE);
            }
        }
        Integer year = cookieDateBuilder.getYear();
        m mVar = new m(70, 99);
        if (year == null || !mVar.contains(year.intValue())) {
            m mVar2 = new m(0, 69);
            if (year != null && mVar2.contains(year.intValue())) {
                Integer year2 = cookieDateBuilder.getYear();
                e0.checkNotNull(year2);
                cookieDateBuilder.setYear(Integer.valueOf(year2.intValue() + 2000));
            }
        } else {
            Integer year3 = cookieDateBuilder.getYear();
            e0.checkNotNull(year3);
            cookieDateBuilder.setYear(Integer.valueOf(year3.intValue() + 1900));
        }
        checkFieldNotNull(source, "day-of-month", cookieDateBuilder.getDayOfMonth());
        checkFieldNotNull(source, SFPXhf.NXgvZtTHvqlizR, cookieDateBuilder.getMonth());
        checkFieldNotNull(source, "year", cookieDateBuilder.getYear());
        checkFieldNotNull(source, DTBMetricReport.TIME, cookieDateBuilder.getHours());
        checkFieldNotNull(source, DTBMetricReport.TIME, cookieDateBuilder.getMinutes());
        checkFieldNotNull(source, DTBMetricReport.TIME, cookieDateBuilder.getSeconds());
        m mVar3 = new m(1, 31);
        Integer dayOfMonth = cookieDateBuilder.getDayOfMonth();
        checkRequirement(source, dayOfMonth != null && mVar3.contains(dayOfMonth.intValue()), AnonymousClass4.INSTANCE);
        Integer year4 = cookieDateBuilder.getYear();
        e0.checkNotNull(year4);
        checkRequirement(source, year4.intValue() >= 1601, AnonymousClass5.INSTANCE);
        Integer hours = cookieDateBuilder.getHours();
        e0.checkNotNull(hours);
        checkRequirement(source, hours.intValue() <= 23, AnonymousClass6.INSTANCE);
        Integer minutes = cookieDateBuilder.getMinutes();
        e0.checkNotNull(minutes);
        checkRequirement(source, minutes.intValue() <= 59, AnonymousClass7.INSTANCE);
        Integer seconds = cookieDateBuilder.getSeconds();
        e0.checkNotNull(seconds);
        checkRequirement(source, seconds.intValue() <= 59, AnonymousClass8.INSTANCE);
        return cookieDateBuilder.build();
    }
}
