package com.google.android.gms.common.server.response;

import android.util.Log;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.ktor.util.date.GMTDateParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {AbstractJsonLexerKt.UNICODE_ESC, 'l', 'l'};
    private static final char[] zab = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e'};
    private static final char[] zac = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e', AbstractJsonLexerKt.STRING};
    private static final char[] zad = {'a', 'l', GMTDateParser.SECONDS, 'e'};
    private static final char[] zae = {'a', 'l', GMTDateParser.SECONDS, 'e', AbstractJsonLexerKt.STRING};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th2) {
            super("Error instantiating inner object", th2);
        }

        public ParseException(Throwable th2) {
            super(th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L60
            r4 = r0
        L12:
            if (r4 >= r3) goto L58
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L2b
            if (r11 == 0) goto L23
            char r6 = r11[r0]
            if (r6 != r5) goto L23
            goto L2b
        L23:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L2b:
            int r6 = r4 + 1
            r7 = 34
            if (r5 != r7) goto L4f
            if (r1 != 0) goto L4d
            r10.append(r9, r0, r4)
            r8.reset()
            long r0 = (long) r6
            r8.skip(r0)
            if (r2 == 0) goto L48
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L48:
            java.lang.String r8 = r10.toString()
            return r8
        L4d:
            r1 = r0
            goto L56
        L4f:
            r4 = 92
            if (r5 != r4) goto L4d
            r1 = r1 ^ 1
            r2 = 1
        L56:
            r4 = r6
            goto L12
        L58:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaA(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char zai(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i10;
        int i11;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c10 = cArr[0];
        int i12 = c10 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i13 = c10 == '-' ? 1 : 0;
        if (i13 < iZam) {
            i11 = i13 + 1;
            int iDigit = Character.digit(cArr[i13], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i10 = -iDigit;
        } else {
            i10 = 0;
            i11 = i13;
        }
        while (i11 < iZam) {
            int i14 = i11 + 1;
            int iDigit2 = Character.digit(cArr[i11], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i10 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i15 = i10 * 10;
            if (i15 < i12 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i10 = i15 - iDigit2;
            i11 = i14;
        }
        if (i13 == 0) {
            return -i10;
        }
        if (i11 > 1) {
            return i10;
        }
        throw new ParseException("No digits to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i10;
        char cZai = zai(bufferedReader);
        if (cZai == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZai == '\"') {
            i10 = 0;
            boolean z10 = false;
            while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                char c10 = cArr[i10];
                if (Character.isISOControl(c10)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i11 = i10 + 1;
                if (c10 != '\"') {
                    if (c10 == '\\') {
                        z10 = !z10;
                    }
                    i10 = i11;
                } else if (!z10) {
                    bufferedReader.reset();
                    bufferedReader.skip(i11);
                    return i10;
                }
                z10 = false;
                i10 = i11;
            }
        } else {
            cArr[0] = cZai;
            i10 = 1;
            while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                char c11 = cArr[i10];
                if (c11 == '}' || c11 == ',' || Character.isWhitespace(c11) || cArr[i10] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i10 - 1);
                    cArr[i10] = 0;
                    return i10;
                }
                i10++;
            }
        }
        if (i10 == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j10;
        int i10;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c10 = cArr[0];
        long j11 = c10 == '-' ? Long.MIN_VALUE : C.TIME_UNSET;
        int i11 = c10 == '-' ? 1 : 0;
        int i12 = 10;
        if (i11 < iZam) {
            i10 = i11 + 1;
            int iDigit = Character.digit(cArr[i11], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j10 = -iDigit;
        } else {
            j10 = 0;
            i10 = i11;
        }
        while (i10 < iZam) {
            int i13 = i10 + 1;
            int iDigit2 = Character.digit(cArr[i10], i12);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j10 < Buffer.OVERFLOW_ZONE) {
                throw new ParseException("Number too large");
            }
            long j12 = j10 * 10;
            long j13 = j11;
            long j14 = iDigit2;
            if (j12 < j13 + j14) {
                throw new ParseException("Number too large");
            }
            j10 = j12 - j14;
            i10 = i13;
            j11 = j13;
            i12 = 10;
        }
        if (i11 == 0) {
            return -j10;
        }
        if (i10 > 1) {
            return j10;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) throws ParseException, IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, char[] cArr2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            return zaA(bufferedReader, cArr, sb2, cArr2);
        }
        if (cZai != 'n') {
            throw new ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            this.zat.push(3);
            String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return strZaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cZai == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (cZai == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cZai = zai(bufferedReader);
        int i10 = 1;
        if (cZai == '\"') {
            if (bufferedReader.read(this.zao) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c10 = this.zao[0];
            boolean z10 = false;
            do {
                if (c10 == '\"') {
                    if (z10) {
                        z10 = true;
                        c10 = '\"';
                    }
                }
                z10 = c10 == '\\' ? !z10 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c10 = this.zao[0];
            } while (!Character.isISOControl(c10));
            throw new ParseException("Unexpected control character while reading string");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) == ']') {
                zaw(5);
            } else {
                bufferedReader.reset();
                boolean z11 = false;
                boolean z12 = false;
                while (i10 > 0) {
                    char cZai2 = zai(bufferedReader);
                    if (cZai2 == 0) {
                        throw new ParseException("Unexpected EOF while parsing array");
                    }
                    if (Character.isISOControl(cZai2)) {
                        throw new ParseException("Unexpected control character while reading array");
                    }
                    if (cZai2 == '\"') {
                        if (!z12) {
                            z11 = !z11;
                        }
                        cZai2 = '\"';
                    }
                    if (cZai2 == '[') {
                        if (!z11) {
                            i10++;
                        }
                        cZai2 = '[';
                    }
                    if (cZai2 == ']' && !z11) {
                        i10--;
                    }
                    z12 = (cZai2 == '\\' && z11) ? !z12 : false;
                }
                zaw(5);
            }
        } else if (cZai != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char cZai3 = zai(bufferedReader);
            if (cZai3 == '}') {
                zaw(1);
            } else {
                if (cZai3 != '\"') {
                    throw new ParseException("Unexpected token " + cZai3);
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                while (zar(bufferedReader) != null) {
                }
                zaw(1);
            }
        }
        char cZai4 = zai(bufferedReader);
        if (cZai4 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (cZai4 == '}') {
            zaw(2);
            return null;
        }
        throw new ParseException("Unexpected token " + cZai4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, iZam));
    }

    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (cZai != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cZai2 = zai(bufferedReader);
            if (cZai2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cZai2 != ',') {
                if (cZai2 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char cZai = zai(bufferedReader);
        if (cZai == ']') {
            zaw(5);
            return arrayList;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (cZai != '{') {
            throw new ParseException("Unexpected token: " + cZai);
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!zaz(bufferedReader, fastJsonResponseZad)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZad);
                char cZai2 = zai(bufferedReader);
                if (cZai2 != ',') {
                    if (cZai2 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    throw new ParseException("Unexpected token: " + cZai2);
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (IllegalAccessException e10) {
                throw new ParseException("Error instantiating inner object", e10);
            } catch (InstantiationException e11) {
                throw new ParseException("Error instantiating inner object", e11);
            }
        }
    }

    private final void zaw(int i10) throws ParseException {
        if (this.zat.isEmpty()) {
            throw new ParseException(o2.k(i10, "Expected state ", " but had empty stack"));
        }
        int iIntValue = ((Integer) this.zat.pop()).intValue();
        if (iIntValue != i10) {
            throw new ParseException(i.a(i10, iIntValue, "Expected state ", " but had "));
        }
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i10 = 0;
        while (true) {
            int length = cArr.length;
            if (i10 >= length) {
                return;
            }
            int i11 = bufferedReader.read(this.zap, 0, length - i10);
            if (i11 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i12 = 0; i12 < i11; i12++) {
                if (cArr[i12 + i10] != this.zap[i12]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i10 += i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z10) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            if (z10) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (cZai == 'f') {
            zax(bufferedReader, z10 ? zae : zad);
            return false;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (cZai == 't') {
            zax(bufferedReader, z10 ? zac : zab);
            return true;
        }
        throw new ParseException("Unexpected token: " + cZai);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0251 A[SYNTHETIC] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zaz(java.io.BufferedReader r18, com.google.android.gms.common.server.response.FastJsonResponse r19) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    public void parse(InputStream inputStream, T t10) throws ParseException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char cZai = zai(bufferedReader);
                if (cZai == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cZai == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t10.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t10.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (cZai != '{') {
                        throw new ParseException("Unexpected token: " + cZai);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t10);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e10) {
                throw new ParseException(e10);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th2;
        }
    }
}
