package com.bykv.vk.openvk.preload.a.d;

import com.bykv.vk.openvk.preload.a.b.e;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private final Reader f16946b;

    /* renamed from: i, reason: collision with root package name */
    private long f16953i;

    /* renamed from: j, reason: collision with root package name */
    private int f16954j;

    /* renamed from: k, reason: collision with root package name */
    private String f16955k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f16956l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f16958n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f16959o;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16947c = false;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f16948d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    private int f16949e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f16950f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f16951g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f16952h = 0;

    /* renamed from: a, reason: collision with root package name */
    int f16945a = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f16957m = 1;

    static {
        e.f16902a = new e() { // from class: com.bykv.vk.openvk.preload.a.d.a.1
            @Override // com.bykv.vk.openvk.preload.a.b.e
            public final void a(a aVar) throws IOException {
                if (aVar instanceof com.bykv.vk.openvk.preload.a.b.a.e) {
                    throw null;
                }
                int iQ = aVar.f16945a;
                if (iQ == 0) {
                    iQ = aVar.q();
                }
                if (iQ == 13) {
                    aVar.f16945a = 9;
                    return;
                }
                if (iQ == 12) {
                    aVar.f16945a = 8;
                } else {
                    if (iQ == 14) {
                        aVar.f16945a = 10;
                        return;
                    }
                    throw new IllegalStateException("Expected a name but was " + aVar.f() + aVar.r());
                }
            }
        };
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f16956l = iArr;
        iArr[0] = 6;
        this.f16958n = new String[32];
        this.f16959o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f16946b = reader;
    }

    private int s() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.f16948d[this.f16949e];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = AbstractJsonLexerKt.NULL;
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f16949e + i11 >= this.f16950f && !b(i11 + 1)) {
                return 0;
            }
            char c11 = this.f16948d[this.f16949e + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f16949e + length < this.f16950f || b(length + 1)) && a(this.f16948d[this.f16949e + length])) {
            return 0;
        }
        this.f16949e += length;
        this.f16945a = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        if (a(r14) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0096, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r9 != 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r10 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
    
        if (r13 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
    
        if (r11 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (r13 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (r13 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
    
        r19.f16953i = r11;
        r19.f16949e += r8;
        r19.f16945a = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b8, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b9, code lost:
    
        if (r9 == 2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
    
        if (r9 == 4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bf, code lost:
    
        if (r9 != 7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c2, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c3, code lost:
    
        r19.f16954j = r8;
        r19.f16945a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        return 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int t() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.t():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        v();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String u() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f16949e
            int r4 = r3 + r2
            int r5 = r6.f16950f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f16948d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.v()
            goto L5c
        L4e:
            char[] r3 = r6.f16948d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f16948d
            int r4 = r6.f16949e
            r0.append(r3, r4, r2)
            int r3 = r6.f16949e
            int r3 = r3 + r2
            r6.f16949e = r3
            r2 = 1
            boolean r2 = r6.b(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f16948d
            int r3 = r6.f16949e
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f16948d
            int r3 = r6.f16949e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f16949e
            int r2 = r2 + r1
            r6.f16949e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.u():java.lang.String");
    }

    private void v() throws IOException {
        if (!this.f16947c) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void w() throws IOException {
        char c10;
        do {
            if (this.f16949e >= this.f16950f && !b(1)) {
                return;
            }
            char[] cArr = this.f16948d;
            int i10 = this.f16949e;
            int i11 = i10 + 1;
            this.f16949e = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f16951g++;
                this.f16952h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private char x() throws IOException {
        int i10;
        if (this.f16949e == this.f16950f && !b(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.f16948d;
        int i11 = this.f16949e;
        int i12 = i11 + 1;
        this.f16949e = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f16951g++;
            this.f16952h = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            throw b("Invalid escape sequence");
        }
        if (i11 + 5 > this.f16950f && !b(4)) {
            throw b("Unterminated escape sequence");
        }
        int i13 = this.f16949e;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = this.f16948d[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(this.f16948d, this.f16949e, 4)));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (i10 + c13);
            i13++;
        }
        this.f16949e += 4;
        return c11;
    }

    private void y() throws IOException {
        b(true);
        int i10 = this.f16949e;
        int i11 = i10 - 1;
        this.f16949e = i11;
        if (i10 + 4 <= this.f16950f || b(5)) {
            char[] cArr = this.f16948d;
            if (cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                this.f16949e += 5;
            }
        }
    }

    public final void a(boolean z10) {
        this.f16947c = z10;
    }

    public void b() throws IOException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + f() + r());
        }
        int i10 = this.f16957m;
        this.f16957m = i10 - 1;
        int[] iArr = this.f16959o;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f16945a = 0;
    }

    public void c() throws IOException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 1) {
            a(3);
            this.f16945a = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + r());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16945a = 0;
        this.f16956l[0] = 8;
        this.f16957m = 1;
        this.f16946b.close();
    }

    public void d() throws IOException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + f() + r());
        }
        int i10 = this.f16957m;
        int i11 = i10 - 1;
        this.f16957m = i11;
        this.f16958n[i11] = null;
        int[] iArr = this.f16959o;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f16945a = 0;
    }

    public boolean e() throws IOException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        return (iQ == 2 || iQ == 4) ? false : true;
    }

    public b f() throws IOException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        switch (iQ) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String g() throws IOException {
        String strB;
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 14) {
            strB = u();
        } else if (iQ == 12) {
            strB = b('\'');
        } else {
            if (iQ != 13) {
                throw new IllegalStateException("Expected a name but was " + f() + r());
            }
            strB = b(AbstractJsonLexerKt.STRING);
        }
        this.f16945a = 0;
        this.f16958n[this.f16957m - 1] = strB;
        return strB;
    }

    public String h() throws IOException {
        String str;
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 10) {
            str = u();
        } else if (iQ == 8) {
            str = b('\'');
        } else if (iQ == 9) {
            str = b(AbstractJsonLexerKt.STRING);
        } else if (iQ == 11) {
            str = this.f16955k;
            this.f16955k = null;
        } else if (iQ == 15) {
            str = Long.toString(this.f16953i);
        } else {
            if (iQ != 16) {
                throw new IllegalStateException("Expected a string but was " + f() + r());
            }
            str = new String(this.f16948d, this.f16949e, this.f16954j);
            this.f16949e += this.f16954j;
        }
        this.f16945a = 0;
        int[] iArr = this.f16959o;
        int i10 = this.f16957m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public boolean i() throws IOException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 5) {
            this.f16945a = 0;
            int[] iArr = this.f16959o;
            int i10 = this.f16957m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iQ != 6) {
            throw new IllegalStateException("Expected a boolean but was " + f() + r());
        }
        this.f16945a = 0;
        int[] iArr2 = this.f16959o;
        int i11 = this.f16957m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public void j() throws IOException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ != 7) {
            throw new IllegalStateException("Expected null but was " + f() + r());
        }
        this.f16945a = 0;
        int[] iArr = this.f16959o;
        int i10 = this.f16957m - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public double k() throws IOException, NumberFormatException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            this.f16945a = 0;
            int[] iArr = this.f16959o;
            int i10 = this.f16957m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f16953i;
        }
        if (iQ == 16) {
            this.f16955k = new String(this.f16948d, this.f16949e, this.f16954j);
            this.f16949e += this.f16954j;
        } else if (iQ == 8 || iQ == 9) {
            this.f16955k = b(iQ == 8 ? '\'' : AbstractJsonLexerKt.STRING);
        } else if (iQ == 10) {
            this.f16955k = u();
        } else if (iQ != 11) {
            throw new IllegalStateException("Expected a double but was " + f() + r());
        }
        this.f16945a = 11;
        double d10 = Double.parseDouble(this.f16955k);
        if (!this.f16947c && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + r());
        }
        this.f16955k = null;
        this.f16945a = 0;
        int[] iArr2 = this.f16959o;
        int i11 = this.f16957m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public long l() throws IOException, NumberFormatException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            this.f16945a = 0;
            int[] iArr = this.f16959o;
            int i10 = this.f16957m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f16953i;
        }
        if (iQ == 16) {
            this.f16955k = new String(this.f16948d, this.f16949e, this.f16954j);
            this.f16949e += this.f16954j;
        } else {
            if (iQ != 8 && iQ != 9 && iQ != 10) {
                throw new IllegalStateException("Expected a long but was " + f() + r());
            }
            if (iQ == 10) {
                this.f16955k = u();
            } else {
                this.f16955k = b(iQ == 8 ? '\'' : AbstractJsonLexerKt.STRING);
            }
            try {
                long j10 = Long.parseLong(this.f16955k);
                this.f16945a = 0;
                int[] iArr2 = this.f16959o;
                int i11 = this.f16957m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f16945a = 11;
        double d10 = Double.parseDouble(this.f16955k);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f16955k + r());
        }
        this.f16955k = null;
        this.f16945a = 0;
        int[] iArr3 = this.f16959o;
        int i12 = this.f16957m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public int m() throws IOException, NumberFormatException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 15) {
            long j10 = this.f16953i;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f16953i + r());
            }
            this.f16945a = 0;
            int[] iArr = this.f16959o;
            int i11 = this.f16957m - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iQ == 16) {
            this.f16955k = new String(this.f16948d, this.f16949e, this.f16954j);
            this.f16949e += this.f16954j;
        } else {
            if (iQ != 8 && iQ != 9 && iQ != 10) {
                throw new IllegalStateException("Expected an int but was " + f() + r());
            }
            if (iQ == 10) {
                this.f16955k = u();
            } else {
                this.f16955k = b(iQ == 8 ? '\'' : AbstractJsonLexerKt.STRING);
            }
            try {
                int i12 = Integer.parseInt(this.f16955k);
                this.f16945a = 0;
                int[] iArr2 = this.f16959o;
                int i13 = this.f16957m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f16945a = 11;
        double d10 = Double.parseDouble(this.f16955k);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f16955k + r());
        }
        this.f16955k = null;
        this.f16945a = 0;
        int[] iArr3 = this.f16959o;
        int i15 = this.f16957m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
    
        v();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.n():void");
    }

    public String o() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f16957m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f16956l[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(this.f16959o[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f16958n[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public final boolean p() {
        return this.f16947c;
    }

    public final String r() {
        StringBuilder sbF = i.f(this.f16951g + 1, (this.f16949e - this.f16952h) + 1, " at line ", " column ", " path ");
        sbF.append(o());
        return sbF.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + r();
    }

    public void a() throws IOException {
        int iQ = this.f16945a;
        if (iQ == 0) {
            iQ = q();
        }
        if (iQ == 3) {
            a(1);
            this.f16959o[this.f16957m - 1] = 0;
            this.f16945a = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + r());
        }
    }

    public final int q() throws IOException {
        int iB;
        int[] iArr = this.f16956l;
        int i10 = this.f16957m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iB2 = b(true);
            if (iB2 != 44) {
                if (iB2 != 59) {
                    if (iB2 != 93) {
                        throw b(wHkgq.PXYOrdNiGmvyu);
                    }
                    this.f16945a = 4;
                    return 4;
                }
                v();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iB = b(true)) != 44) {
                    if (iB != 59) {
                        if (iB != 125) {
                            throw b("Unterminated object");
                        }
                        this.f16945a = 2;
                        return 2;
                    }
                    v();
                }
                int iB3 = b(true);
                if (iB3 == 34) {
                    this.f16945a = 13;
                    return 13;
                }
                if (iB3 == 39) {
                    v();
                    this.f16945a = 12;
                    return 12;
                }
                if (iB3 == 125) {
                    if (i11 == 5) {
                        throw b("Expected name");
                    }
                    this.f16945a = 2;
                    return 2;
                }
                v();
                this.f16949e--;
                if (!a((char) iB3)) {
                    throw b("Expected name");
                }
                this.f16945a = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iB4 = b(true);
                if (iB4 != 58) {
                    if (iB4 != 61) {
                        throw b("Expected ':'");
                    }
                    v();
                    if (this.f16949e < this.f16950f || b(1)) {
                        char[] cArr = this.f16948d;
                        int i12 = this.f16949e;
                        if (cArr[i12] == '>') {
                            this.f16949e = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f16947c) {
                    y();
                }
                this.f16956l[this.f16957m - 1] = 7;
            } else if (i11 == 7) {
                if (b(false) == -1) {
                    this.f16945a = 17;
                    return 17;
                }
                v();
                this.f16949e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iB5 = b(true);
        if (iB5 == 34) {
            this.f16945a = 9;
            return 9;
        }
        if (iB5 == 39) {
            v();
            this.f16945a = 8;
            return 8;
        }
        if (iB5 != 44 && iB5 != 59) {
            if (iB5 == 91) {
                this.f16945a = 3;
                return 3;
            }
            if (iB5 != 93) {
                if (iB5 == 123) {
                    this.f16945a = 1;
                    return 1;
                }
                this.f16949e--;
                int iS = s();
                if (iS != 0) {
                    return iS;
                }
                int iT = t();
                if (iT != 0) {
                    return iT;
                }
                if (!a(this.f16948d[this.f16949e])) {
                    throw b("Expected value");
                }
                v();
                this.f16945a = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f16945a = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw b("Unexpected value");
        }
        v();
        this.f16949e--;
        this.f16945a = 7;
        return 7;
    }

    private void c(char c10) throws IOException {
        char[] cArr = this.f16948d;
        while (true) {
            int i10 = this.f16949e;
            int i11 = this.f16950f;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f16949e = i12;
                        return;
                    }
                    if (c11 == '\\') {
                        this.f16949e = i12;
                        x();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f16951g++;
                            this.f16952h = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f16949e = i10;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private String b(char c10) throws IOException {
        char[] cArr = this.f16948d;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f16949e;
            int i11 = this.f16950f;
            int i12 = i10;
            while (true) {
                if (i12 < i11) {
                    int i13 = i12 + 1;
                    char c11 = cArr[i12];
                    if (c11 == c10) {
                        this.f16949e = i13;
                        int i14 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i10, i14);
                        }
                        sb2.append(cArr, i10, i14);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        this.f16949e = i13;
                        int i15 = i13 - i10;
                        int i16 = i15 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i15 << 1, 16));
                        }
                        sb2.append(cArr, i10, i16);
                        sb2.append(x());
                    } else {
                        if (c11 == '\n') {
                            this.f16951g++;
                            this.f16952h = i13;
                        }
                        i12 = i13;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i12 - i10) << 1, 16));
                    }
                    sb2.append(cArr, i10, i12 - i10);
                    this.f16949e = i12;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean a(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        v();
        return false;
    }

    private void a(int i10) {
        int i11 = this.f16957m;
        int[] iArr = this.f16956l;
        if (i11 == iArr.length) {
            int i12 = i11 << 1;
            this.f16956l = Arrays.copyOf(iArr, i12);
            this.f16959o = Arrays.copyOf(this.f16959o, i12);
            this.f16958n = (String[]) Arrays.copyOf(this.f16958n, i12);
        }
        int[] iArr2 = this.f16956l;
        int i13 = this.f16957m;
        this.f16957m = i13 + 1;
        iArr2[i13] = i10;
    }

    private boolean a(String str) throws IOException {
        int i10;
        int length = str.length();
        while (true) {
            if (this.f16949e + length > this.f16950f && !b(length)) {
                return false;
            }
            char[] cArr = this.f16948d;
            int i11 = this.f16949e;
            if (cArr[i11] != '\n') {
                while (i10 < length) {
                    i10 = this.f16948d[this.f16949e + i10] == str.charAt(i10) ? i10 + 1 : 0;
                }
                return true;
            }
            this.f16951g++;
            this.f16952h = i11 + 1;
            this.f16949e++;
        }
    }

    private boolean b(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f16948d;
        int i13 = this.f16952h;
        int i14 = this.f16949e;
        this.f16952h = i13 - i14;
        int i15 = this.f16950f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f16950f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f16950f = 0;
        }
        this.f16949e = 0;
        do {
            Reader reader = this.f16946b;
            int i17 = this.f16950f;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f16950f + i18;
            this.f16950f = i11;
            if (this.f16951g == 0 && (i12 = this.f16952h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f16949e++;
                this.f16952h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int b(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.f16948d
            int r1 = r8.f16949e
            int r2 = r8.f16950f
        L6:
            r3 = 1
            if (r1 != r2) goto L32
            r8.f16949e = r1
            boolean r1 = r8.b(r3)
            if (r1 == 0) goto L16
            int r1 = r8.f16949e
            int r2 = r8.f16950f
            goto L32
        L16:
            if (r9 != 0) goto L1a
            r9 = -1
            return r9
        L1a:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "End of input"
            r0.<init>(r1)
            java.lang.String r1 = r8.r()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L32:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L42
            int r1 = r8.f16951g
            int r1 = r1 + r3
            r8.f16951g = r1
            r8.f16952h = r4
            goto Lae
        L42:
            r6 = 32
            if (r5 == r6) goto Lae
            r6 = 13
            if (r5 == r6) goto Lae
            r6 = 9
            if (r5 == r6) goto Lae
            r6 = 47
            if (r5 != r6) goto L99
            r8.f16949e = r4
            r7 = 2
            if (r4 != r2) goto L65
            r8.f16949e = r1
            boolean r1 = r8.b(r7)
            int r2 = r8.f16949e
            int r2 = r2 + r3
            r8.f16949e = r2
            if (r1 != 0) goto L65
            goto L72
        L65:
            r8.v()
            int r1 = r8.f16949e
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L7f
            if (r2 == r6) goto L73
        L72:
            return r5
        L73:
            int r1 = r1 + 1
            r8.f16949e = r1
            r8.w()
            int r1 = r8.f16949e
            int r2 = r8.f16950f
            goto L6
        L7f:
            int r1 = r1 + 1
            r8.f16949e = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.a(r1)
            if (r1 == 0) goto L92
            int r1 = r8.f16949e
            int r1 = r1 + r7
            int r2 = r8.f16950f
            goto L6
        L92:
            java.lang.String r9 = "Unterminated comment"
            java.io.IOException r9 = r8.b(r9)
            throw r9
        L99:
            r1 = 35
            if (r5 != r1) goto Lab
            r8.f16949e = r4
            r8.v()
            r8.w()
            int r1 = r8.f16949e
            int r2 = r8.f16950f
            goto L6
        Lab:
            r8.f16949e = r4
            return r5
        Lae:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.b(boolean):int");
    }

    private IOException b(String str) throws IOException {
        StringBuilder sbU = o2.u(str);
        sbU.append(r());
        throw new d(sbU.toString());
    }
}
