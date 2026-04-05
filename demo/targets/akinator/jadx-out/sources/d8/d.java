package d8;

import androidx.datastore.preferences.protobuf.h0;
import com.google.android.play.core.splitinstall.internal.d0;
import java.io.EOFException;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pw.g;
import pw.k;
import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: n, reason: collision with root package name */
    public static final l f51940n = l.encodeUtf8("'\\");

    /* renamed from: o, reason: collision with root package name */
    public static final l f51941o = l.encodeUtf8("\"\\");

    /* renamed from: p, reason: collision with root package name */
    public static final l f51942p = l.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: h, reason: collision with root package name */
    public final k f51943h;

    /* renamed from: i, reason: collision with root package name */
    public final g f51944i;

    /* renamed from: j, reason: collision with root package name */
    public int f51945j;

    /* renamed from: k, reason: collision with root package name */
    public long f51946k;

    /* renamed from: l, reason: collision with root package name */
    public int f51947l;

    /* renamed from: m, reason: collision with root package name */
    public String f51948m;

    static {
        l.encodeUtf8("\n\r");
        l.encodeUtf8("*/");
    }

    public d(k kVar) {
        this.f51937c = new int[32];
        this.f51938e = new String[32];
        this.f51939f = new int[32];
        this.f51945j = 0;
        if (kVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f51943h = kVar;
        this.f51944i = kVar.buffer();
        a(6);
    }

    @Override // d8.c
    public void beginArray() throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 3) {
            a(1);
            this.f51939f[this.f51936b - 1] = 0;
            this.f51945j = 0;
        } else {
            throw new d0("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // d8.c
    public void beginObject() throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 1) {
            a(3);
            this.f51945j = 0;
        } else {
            throw new d0("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51945j = 0;
        this.f51937c[0] = 8;
        this.f51936b = 1;
        this.f51944i.clear();
        this.f51943h.close();
    }

    public final void d() throws h0 {
        b("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // d8.c
    public void endArray() throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 4) {
            throw new d0("Expected END_ARRAY but was " + peek() + " at path " + getPath());
        }
        int i10 = this.f51936b;
        this.f51936b = i10 - 1;
        int[] iArr = this.f51939f;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f51945j = 0;
    }

    @Override // d8.c
    public void endObject() throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 2) {
            throw new d0("Expected END_OBJECT but was " + peek() + " at path " + getPath());
        }
        int i10 = this.f51936b;
        int i11 = i10 - 1;
        this.f51936b = i11;
        this.f51938e[i11] = null;
        int[] iArr = this.f51939f;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f51945j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (j(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.f51946k = r8;
        r7.skip(r2);
        r9 = 16;
        r22.f51945j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r22.f51947l = r2;
        r9 = 17;
        r22.f51945j = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h() throws androidx.datastore.preferences.protobuf.h0, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.d.h():int");
    }

    @Override // d8.c
    public boolean hasNext() throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        return (iH == 2 || iH == 4 || iH == 18) ? false : true;
    }

    public final int i(String str, a aVar) {
        int length = aVar.f51922a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f51922a[i10])) {
                this.f51945j = 0;
                this.f51938e[this.f51936b - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean j(int i10) throws h0 {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        throw null;
    }

    public final int k(boolean z10) throws h0, EOFException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            k kVar = this.f51943h;
            if (!kVar.request(i11)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j10 = i10;
            g gVar = this.f51944i;
            byte b10 = gVar.getByte(j10);
            if (b10 != 10 && b10 != 32 && b10 != 13 && b10 != 9) {
                gVar.skip(j10);
                if (b10 == 47) {
                    if (kVar.request(2L)) {
                        d();
                        throw null;
                    }
                } else if (b10 == 35) {
                    d();
                    throw null;
                }
                return b10;
            }
            i10 = i11;
        }
    }

    public final String l(l lVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jIndexOfElement = this.f51943h.indexOfElement(lVar);
            if (jIndexOfElement == -1) {
                b("Unterminated string");
                throw null;
            }
            g gVar = this.f51944i;
            if (gVar.getByte(jIndexOfElement) != 92) {
                if (sb2 == null) {
                    String utf8 = gVar.readUtf8(jIndexOfElement);
                    gVar.readByte();
                    return utf8;
                }
                sb2.append(gVar.readUtf8(jIndexOfElement));
                gVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(gVar.readUtf8(jIndexOfElement));
            gVar.readByte();
            sb2.append(n());
        }
    }

    public final String m() throws IOException {
        long jIndexOfElement = this.f51943h.indexOfElement(f51942p);
        g gVar = this.f51944i;
        return jIndexOfElement != -1 ? gVar.readUtf8(jIndexOfElement) : gVar.readUtf8();
    }

    public final char n() throws h0, EOFException {
        int i10;
        k kVar = this.f51943h;
        if (!kVar.request(1L)) {
            b("Unterminated escape sequence");
            throw null;
        }
        g gVar = this.f51944i;
        byte b10 = gVar.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            b("Invalid escape sequence: \\" + ((char) b10));
            throw null;
        }
        if (!kVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte b11 = gVar.getByte(i11);
            char c11 = (char) (c10 << 4);
            if (b11 >= 48 && b11 <= 57) {
                i10 = b11 - 48;
            } else if (b11 >= 97 && b11 <= 102) {
                i10 = b11 - 87;
            } else {
                if (b11 < 65 || b11 > 70) {
                    b("\\u" + gVar.readUtf8(4L));
                    throw null;
                }
                i10 = b11 - 55;
            }
            c10 = (char) (i10 + c11);
        }
        gVar.skip(4L);
        return c10;
    }

    @Override // d8.c
    public boolean nextBoolean() throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 5) {
            this.f51945j = 0;
            int[] iArr = this.f51939f;
            int i10 = this.f51936b - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iH == 6) {
            this.f51945j = 0;
            int[] iArr2 = this.f51939f;
            int i11 = this.f51936b - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new d0("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // d8.c
    public double nextDouble() throws NumberFormatException, IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 16) {
            this.f51945j = 0;
            int[] iArr = this.f51939f;
            int i10 = this.f51936b - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f51946k;
        }
        if (iH == 17) {
            this.f51948m = this.f51944i.readUtf8(this.f51947l);
        } else if (iH == 9) {
            this.f51948m = l(f51941o);
        } else if (iH == 8) {
            this.f51948m = l(f51940n);
        } else if (iH == 10) {
            this.f51948m = m();
        } else if (iH != 11) {
            throw new d0("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.f51945j = 11;
        try {
            double d10 = Double.parseDouble(this.f51948m);
            if (Double.isNaN(d10) || Double.isInfinite(d10)) {
                throw new h0("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
            }
            this.f51948m = null;
            this.f51945j = 0;
            int[] iArr2 = this.f51939f;
            int i11 = this.f51936b - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new d0("Expected a double but was " + this.f51948m + " at path " + getPath());
        }
    }

    @Override // d8.c
    public int nextInt() throws NumberFormatException, IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 16) {
            long j10 = this.f51946k;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f51945j = 0;
                int[] iArr = this.f51939f;
                int i11 = this.f51936b - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new d0("Expected an int but was " + this.f51946k + " at path " + getPath());
        }
        if (iH == 17) {
            this.f51948m = this.f51944i.readUtf8(this.f51947l);
        } else if (iH == 9 || iH == 8) {
            String strL = iH == 9 ? l(f51941o) : l(f51940n);
            this.f51948m = strL;
            try {
                int i12 = Integer.parseInt(strL);
                this.f51945j = 0;
                int[] iArr2 = this.f51939f;
                int i13 = this.f51936b - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iH != 11) {
            throw new d0("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.f51945j = 11;
        try {
            double d10 = Double.parseDouble(this.f51948m);
            int i14 = (int) d10;
            if (i14 != d10) {
                throw new d0("Expected an int but was " + this.f51948m + " at path " + getPath());
            }
            this.f51948m = null;
            this.f51945j = 0;
            int[] iArr3 = this.f51939f;
            int i15 = this.f51936b - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new d0("Expected an int but was " + this.f51948m + " at path " + getPath());
        }
    }

    @Override // d8.c
    public String nextName() throws IOException {
        String strL;
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            strL = m();
        } else if (iH == 13) {
            strL = l(f51941o);
        } else if (iH == 12) {
            strL = l(f51940n);
        } else {
            if (iH != 15) {
                throw new d0("Expected a name but was " + peek() + " at path " + getPath());
            }
            strL = this.f51948m;
        }
        this.f51945j = 0;
        this.f51938e[this.f51936b - 1] = strL;
        return strL;
    }

    @Override // d8.c
    public String nextString() throws IOException {
        String utf8;
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 10) {
            utf8 = m();
        } else if (iH == 9) {
            utf8 = l(f51941o);
        } else if (iH == 8) {
            utf8 = l(f51940n);
        } else if (iH == 11) {
            utf8 = this.f51948m;
            this.f51948m = null;
        } else if (iH == 16) {
            utf8 = Long.toString(this.f51946k);
        } else {
            if (iH != 17) {
                throw new d0("Expected a string but was " + peek() + " at path " + getPath());
            }
            utf8 = this.f51944i.readUtf8(this.f51947l);
        }
        this.f51945j = 0;
        int[] iArr = this.f51939f;
        int i10 = this.f51936b - 1;
        iArr[i10] = iArr[i10] + 1;
        return utf8;
    }

    public final void o(l lVar) throws IOException {
        while (true) {
            long jIndexOfElement = this.f51943h.indexOfElement(lVar);
            if (jIndexOfElement == -1) {
                b("Unterminated string");
                throw null;
            }
            g gVar = this.f51944i;
            if (gVar.getByte(jIndexOfElement) != 92) {
                gVar.skip(jIndexOfElement + 1);
                return;
            } else {
                gVar.skip(jIndexOfElement + 1);
                n();
            }
        }
    }

    @Override // d8.c
    public b peek() throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        switch (iH) {
            case 1:
                return b.f51926e;
            case 2:
                return b.f51927f;
            case 3:
                return b.f51924b;
            case 4:
                return b.f51925c;
            case 5:
            case 6:
                return b.f51931j;
            case 7:
                return b.f51932k;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.f51929h;
            case 12:
            case 13:
            case 14:
            case 15:
                return b.f51928g;
            case 16:
            case 17:
                return b.f51930i;
            case 18:
                return b.f51933l;
            default:
                throw new AssertionError();
        }
    }

    @Override // d8.c
    public int selectName(a aVar) throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH < 12 || iH > 15) {
            return -1;
        }
        if (iH == 15) {
            return i(this.f51948m, aVar);
        }
        int iSelect = this.f51943h.select(aVar.f51923b);
        if (iSelect != -1) {
            this.f51945j = 0;
            this.f51938e[this.f51936b - 1] = aVar.f51922a[iSelect];
            return iSelect;
        }
        String str = this.f51938e[this.f51936b - 1];
        String strNextName = nextName();
        int i10 = i(strNextName, aVar);
        if (i10 == -1) {
            this.f51945j = 15;
            this.f51948m = strNextName;
            this.f51938e[this.f51936b - 1] = str;
        }
        return i10;
    }

    @Override // d8.c
    public void skipName() throws IOException {
        int iH = this.f51945j;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            long jIndexOfElement = this.f51943h.indexOfElement(f51942p);
            g gVar = this.f51944i;
            if (jIndexOfElement == -1) {
                jIndexOfElement = gVar.size();
            }
            gVar.skip(jIndexOfElement);
        } else if (iH == 13) {
            o(f51941o);
        } else if (iH == 12) {
            o(f51940n);
        } else if (iH != 15) {
            throw new d0("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.f51945j = 0;
        this.f51938e[this.f51936b - 1] = AbstractJsonLexerKt.NULL;
    }

    @Override // d8.c
    public void skipValue() throws IOException {
        int i10 = 0;
        do {
            int iH = this.f51945j;
            if (iH == 0) {
                iH = h();
            }
            if (iH == 3) {
                a(1);
            } else if (iH == 1) {
                a(3);
            } else {
                if (iH == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new d0("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f51936b--;
                } else if (iH == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new d0("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f51936b--;
                } else {
                    g gVar = this.f51944i;
                    if (iH == 14 || iH == 10) {
                        long jIndexOfElement = this.f51943h.indexOfElement(f51942p);
                        if (jIndexOfElement == -1) {
                            jIndexOfElement = gVar.size();
                        }
                        gVar.skip(jIndexOfElement);
                    } else if (iH == 9 || iH == 13) {
                        o(f51941o);
                    } else if (iH == 8 || iH == 12) {
                        o(f51940n);
                    } else if (iH == 17) {
                        gVar.skip(this.f51947l);
                    } else if (iH == 18) {
                        throw new d0("Expected a value but was " + peek() + " at path " + getPath());
                    }
                }
                this.f51945j = 0;
            }
            i10++;
            this.f51945j = 0;
        } while (i10 != 0);
        int[] iArr = this.f51939f;
        int i11 = this.f51936b - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f51938e[i11] = AbstractJsonLexerKt.NULL;
    }

    public String toString() {
        return "JsonReader(" + this.f51943h + ")";
    }
}
