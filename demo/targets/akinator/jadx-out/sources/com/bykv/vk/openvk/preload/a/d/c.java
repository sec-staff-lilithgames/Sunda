package com.bykv.vk.openvk.preload.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f16971a = new String[128];

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f16972b;

    /* renamed from: c, reason: collision with root package name */
    private final Writer f16973c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f16974d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    private int f16975e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f16976f;

    /* renamed from: g, reason: collision with root package name */
    private String f16977g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16978h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16979i;

    /* renamed from: j, reason: collision with root package name */
    private String f16980j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16981k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f16971a[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f16971a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f16972b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.f16977g = ":";
        this.f16981k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f16973c = writer;
    }

    private int i() {
        int i10 = this.f16975e;
        if (i10 != 0) {
            return this.f16974d[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void j() throws IOException {
        if (this.f16980j != null) {
            l();
            c(this.f16980j);
            this.f16980j = null;
        }
    }

    private void k() throws IOException {
        if (this.f16976f == null) {
            return;
        }
        this.f16973c.write(10);
        int i10 = this.f16975e;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f16973c.write(this.f16976f);
        }
    }

    private void l() throws IOException {
        int i10 = i();
        if (i10 == 5) {
            this.f16973c.write(44);
        } else if (i10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        b(4);
    }

    private void m() throws IOException {
        int i10 = i();
        if (i10 == 1) {
            b(2);
            k();
            return;
        }
        if (i10 == 2) {
            this.f16973c.append(AbstractJsonLexerKt.COMMA);
            k();
        } else {
            if (i10 == 4) {
                this.f16973c.append((CharSequence) this.f16977g);
                b(5);
                return;
            }
            if (i10 != 6) {
                if (i10 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f16978h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            b(7);
        }
    }

    public final void a(boolean z10) {
        this.f16978h = z10;
    }

    public final void b(boolean z10) {
        this.f16979i = z10;
    }

    public final void c(boolean z10) {
        this.f16981k = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16973c.close();
        int i10 = this.f16975e;
        if (i10 > 1 || (i10 == 1 && this.f16974d[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f16975e = 0;
    }

    public final c d() throws IOException {
        j();
        return a(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    public final c e() throws IOException {
        return a(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public final c f() throws IOException {
        j();
        return a(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f16975e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f16973c.flush();
    }

    public final c g() throws IOException {
        return a(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public final c h() throws IOException {
        if (this.f16980j != null) {
            if (!this.f16981k) {
                this.f16980j = null;
                return this;
            }
            j();
        }
        m();
        this.f16973c.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public final boolean a() {
        return this.f16978h;
    }

    public final boolean b() {
        return this.f16979i;
    }

    public final boolean c() {
        return this.f16981k;
    }

    private c a(int i10, char c10) throws IOException {
        m();
        a(i10);
        this.f16973c.write(c10);
        return this;
    }

    private void b(int i10) {
        this.f16974d[this.f16975e - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f16979i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.f16972b
            goto L9
        L7:
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.f16971a
        L9:
            java.io.Writer r1 = r8.f16973c
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f16973c
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f16973c
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f16973c
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f16973c
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.c.c(java.lang.String):void");
    }

    public final c d(boolean z10) throws IOException {
        j();
        m();
        this.f16973c.write(z10 ? "true" : "false");
        return this;
    }

    public final c b(String str) throws IOException {
        if (str == null) {
            return h();
        }
        j();
        m();
        c(str);
        return this;
    }

    private c a(int i10, int i11, char c10) throws IOException {
        int i12 = i();
        if (i12 != i11 && i12 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f16980j == null) {
            this.f16975e--;
            if (i12 == i11) {
                k();
            }
            this.f16973c.write(c10);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f16980j);
    }

    private void a(int i10) {
        int i11 = this.f16975e;
        int[] iArr = this.f16974d;
        if (i11 == iArr.length) {
            this.f16974d = Arrays.copyOf(iArr, i11 << 1);
        }
        int[] iArr2 = this.f16974d;
        int i12 = this.f16975e;
        this.f16975e = i12 + 1;
        iArr2[i12] = i10;
    }

    public final c a(String str) throws IOException {
        if (str != null) {
            if (this.f16980j == null) {
                if (this.f16975e != 0) {
                    this.f16980j = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public final c a(Boolean bool) throws IOException {
        if (bool == null) {
            return h();
        }
        j();
        m();
        this.f16973c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public final c a(long j10) throws IOException {
        j();
        m();
        this.f16973c.write(Long.toString(j10));
        return this;
    }

    public final c a(Number number) throws IOException {
        if (number == null) {
            return h();
        }
        j();
        String string = number.toString();
        if (!this.f16978h && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        m();
        this.f16973c.append((CharSequence) string);
        return this;
    }
}
