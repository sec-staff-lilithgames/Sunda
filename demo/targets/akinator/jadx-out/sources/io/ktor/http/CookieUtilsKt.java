package io.ktor.http;

import io.ktor.util.date.Month;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import kv.q;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CookieUtilsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39821 extends f0 implements l {
        public static final C39821 INSTANCE = new C39821();

        public C39821() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(c10 == ':');
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$3, reason: invalid class name */
    public static final class AnonymousClass3 extends f0 implements l {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(c10 == ':');
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$5, reason: invalid class name */
    public static final class AnonymousClass5 extends f0 implements l {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$6, reason: invalid class name */
    public static final class AnonymousClass6 extends f0 implements l {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseYear$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39831 extends f0 implements l {
        public static final C39831 INSTANCE = new C39831();

        public C39831() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseYear$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39842 extends f0 implements l {
        public static final C39842 INSTANCE = new C39842();

        public C39842() {
            super(1);
        }

        public final Boolean invoke(char c10) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c10));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    public static final void handleToken(CookieDateBuilder cookieDateBuilder, String token) throws NumberFormatException {
        e0.checkNotNullParameter(cookieDateBuilder, "<this>");
        e0.checkNotNullParameter(token, "token");
        if (cookieDateBuilder.getHours() == null || cookieDateBuilder.getMinutes() == null || cookieDateBuilder.getSeconds() == null) {
            StringLexer stringLexer = new StringLexer(token);
            int index = stringLexer.getIndex();
            if (stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
                stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
                String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                int i10 = Integer.parseInt(strSubstring);
                if (stringLexer.accept(C39821.INSTANCE)) {
                    int index2 = stringLexer.getIndex();
                    if (stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                        stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                        String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                        e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        int i11 = Integer.parseInt(strSubstring2);
                        if (stringLexer.accept(AnonymousClass3.INSTANCE)) {
                            int index3 = stringLexer.getIndex();
                            if (stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                                stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                                String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                                e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                int i12 = Integer.parseInt(strSubstring3);
                                if (stringLexer.accept(AnonymousClass5.INSTANCE)) {
                                    stringLexer.acceptWhile(AnonymousClass6.INSTANCE);
                                }
                                cookieDateBuilder.setHours(Integer.valueOf(i10));
                                cookieDateBuilder.setMinutes(Integer.valueOf(i11));
                                cookieDateBuilder.setSeconds(Integer.valueOf(i12));
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (cookieDateBuilder.getDayOfMonth() == null) {
            StringLexer stringLexer2 = new StringLexer(token);
            int index4 = stringLexer2.getIndex();
            if (stringLexer2.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
                stringLexer2.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
                String strSubstring4 = stringLexer2.getSource().substring(index4, stringLexer2.getIndex());
                e0.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                int i13 = Integer.parseInt(strSubstring4);
                if (stringLexer2.accept(AnonymousClass1.INSTANCE)) {
                    stringLexer2.acceptWhile(AnonymousClass2.INSTANCE);
                }
                cookieDateBuilder.setDayOfMonth(Integer.valueOf(i13));
                return;
            }
        }
        if (cookieDateBuilder.getMonth() == null && token.length() >= 3) {
            for (Month month : Month.values()) {
                if (k0.startsWith(token, month.getValue(), true)) {
                    cookieDateBuilder.setMonth(month);
                    return;
                }
            }
        }
        if (cookieDateBuilder.getYear() == null) {
            StringLexer stringLexer3 = new StringLexer(token);
            int index5 = stringLexer3.getIndex();
            for (int i14 = 0; i14 < 2; i14++) {
                if (!stringLexer3.accept(CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                    return;
                }
            }
            for (int i15 = 0; i15 < 2; i15++) {
                stringLexer3.accept(CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
            }
            String strSubstring5 = stringLexer3.getSource().substring(index5, stringLexer3.getIndex());
            e0.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            int i16 = Integer.parseInt(strSubstring5);
            if (stringLexer3.accept(C39831.INSTANCE)) {
                stringLexer3.acceptWhile(C39842.INSTANCE);
            }
            cookieDateBuilder.setYear(Integer.valueOf(i16));
        }
    }

    public static final boolean isDelimiter(char c10) {
        if (c10 == '\t') {
            return true;
        }
        if (' ' <= c10 && c10 < '0') {
            return true;
        }
        if (';' <= c10 && c10 < 'A') {
            return true;
        }
        if ('[' > c10 || c10 >= 'a') {
            return '{' <= c10 && c10 < 127;
        }
        return true;
    }

    public static final boolean isDigit(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    public static final boolean isNonDelimiter(char c10) {
        if (c10 >= 0 && c10 < '\t') {
            return true;
        }
        if ('\n' <= c10 && c10 < ' ') {
            return true;
        }
        if (('0' <= c10 && c10 < ':') || c10 == ':') {
            return true;
        }
        if ('a' <= c10 && c10 < '{') {
            return true;
        }
        if ('A' > c10 || c10 >= '[') {
            return 127 <= c10 && c10 < 256;
        }
        return true;
    }

    public static final boolean isNonDigit(char c10) {
        if (c10 < 0 || c10 >= '0') {
            return 'J' <= c10 && c10 < 256;
        }
        return true;
    }

    public static final boolean isOctet(char c10) {
        return c10 >= 0 && c10 < 256;
    }

    public static final void otherwise(boolean z10, a block) {
        e0.checkNotNullParameter(block, "block");
        if (z10) {
            return;
        }
        block.invoke();
    }

    public static final void tryParseDayOfMonth(String str, l success) throws NumberFormatException {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
            stringLexer.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
            String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int i10 = Integer.parseInt(strSubstring);
            if (stringLexer.accept(AnonymousClass1.INSTANCE)) {
                stringLexer.acceptWhile(AnonymousClass2.INSTANCE);
            }
            success.invoke(Integer.valueOf(i10));
        }
    }

    public static final void tryParseMonth(String str, l success) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(success, "success");
        if (str.length() < 3) {
            return;
        }
        for (Month month : Month.values()) {
            if (k0.startsWith(str, month.getValue(), true)) {
                success.invoke(month);
                return;
            }
        }
    }

    public static final void tryParseTime(String str, q success) throws NumberFormatException {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
            stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
            String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int i10 = Integer.parseInt(strSubstring);
            if (stringLexer.accept(C39821.INSTANCE)) {
                int index2 = stringLexer.getIndex();
                if (stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                    stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                    String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                    e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int i11 = Integer.parseInt(strSubstring2);
                    if (stringLexer.accept(AnonymousClass3.INSTANCE)) {
                        int index3 = stringLexer.getIndex();
                        if (stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                            stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                            String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                            e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                            int i12 = Integer.parseInt(strSubstring3);
                            if (stringLexer.accept(AnonymousClass5.INSTANCE)) {
                                stringLexer.acceptWhile(AnonymousClass6.INSTANCE);
                            }
                            success.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
                        }
                    }
                }
            }
        }
    }

    public static final void tryParseYear(String str, l success) throws NumberFormatException {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(success, "success");
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!stringLexer.accept(CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                return;
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            stringLexer.accept(CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
        }
        String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        int i12 = Integer.parseInt(strSubstring);
        if (stringLexer.accept(C39831.INSTANCE)) {
            stringLexer.acceptWhile(C39842.INSTANCE);
        }
        success.invoke(Integer.valueOf(i12));
    }
}
