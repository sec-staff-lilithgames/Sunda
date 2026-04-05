package ic;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j0 {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f59498l = new char[0];

    /* renamed from: a, reason: collision with root package name */
    public final b f59499a;

    /* renamed from: b, reason: collision with root package name */
    public char[] f59500b;

    /* renamed from: c, reason: collision with root package name */
    public int f59501c;

    /* renamed from: d, reason: collision with root package name */
    public int f59502d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f59503e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59504f;

    /* renamed from: g, reason: collision with root package name */
    public int f59505g;

    /* renamed from: h, reason: collision with root package name */
    public char[] f59506h;

    /* renamed from: i, reason: collision with root package name */
    public int f59507i;

    /* renamed from: j, reason: collision with root package name */
    public String f59508j;

    /* renamed from: k, reason: collision with root package name */
    public char[] f59509k;

    public j0(b bVar) {
        this.f59499a = bVar;
    }

    public static void a(int i10, int i11) {
        throw new IllegalStateException(o2.n(i10 + i11, "TextBuffer overrun: size reached (", ") exceeds maximum of 2147483647"));
    }

    public static j0 fromInitial(char[] cArr) {
        j0 j0Var = new j0(null);
        j0Var.f59506h = cArr;
        j0Var.f59507i = cArr.length;
        j0Var.f59501c = -1;
        return j0Var;
    }

    public void append(char c10) throws IOException {
        if (this.f59501c >= 0) {
            e(16);
        }
        this.f59508j = null;
        this.f59509k = null;
        char[] cArr = this.f59506h;
        if (this.f59507i >= cArr.length) {
            f(1);
            d();
            cArr = this.f59506h;
        }
        int i10 = this.f59507i;
        this.f59507i = i10 + 1;
        cArr[i10] = c10;
    }

    public final char[] b(int i10) {
        b bVar = this.f59499a;
        return bVar != null ? bVar.allocCharBuffer(2, i10) : new char[Math.max(i10, 500)];
    }

    public b bufferRecycler() {
        return this.f59499a;
    }

    public final void c() {
        this.f59504f = false;
        this.f59503e.clear();
        this.f59505g = 0;
        this.f59507i = 0;
    }

    public char[] contentsAsArray() throws IOException {
        int i10;
        char[] cArrCopyOf = this.f59509k;
        if (cArrCopyOf == null) {
            String str = this.f59508j;
            if (str != null) {
                cArrCopyOf = str.toCharArray();
            } else {
                int i11 = this.f59501c;
                char[] cArr = f59498l;
                if (i11 >= 0) {
                    int i12 = this.f59502d;
                    if (i12 < 1) {
                        cArrCopyOf = cArr;
                    } else {
                        g(i12);
                        int i13 = this.f59501c;
                        cArrCopyOf = i13 == 0 ? Arrays.copyOf(this.f59500b, i12) : Arrays.copyOfRange(this.f59500b, i13, i12 + i13);
                    }
                } else {
                    int size = size();
                    if (size < 1) {
                        if (size < 0) {
                            a(this.f59505g, this.f59507i);
                            throw null;
                        }
                        cArrCopyOf = cArr;
                    } else {
                        g(size);
                        cArrCopyOf = new char[size];
                        ArrayList arrayList = this.f59503e;
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            i10 = 0;
                            for (int i14 = 0; i14 < size2; i14++) {
                                char[] cArr2 = (char[]) this.f59503e.get(i14);
                                int length = cArr2.length;
                                System.arraycopy(cArr2, 0, cArrCopyOf, i10, length);
                                i10 += length;
                            }
                        } else {
                            i10 = 0;
                        }
                        System.arraycopy(this.f59506h, 0, cArrCopyOf, i10, this.f59507i);
                    }
                }
            }
            this.f59509k = cArrCopyOf;
        }
        return cArrCopyOf;
    }

    @Deprecated
    public BigDecimal contentsAsDecimal() throws NumberFormatException {
        return contentsAsDecimal(false);
    }

    public double contentsAsDouble(boolean z10) throws NumberFormatException {
        String str = this.f59508j;
        if (str != null) {
            return cc.m.parseDouble(str, z10);
        }
        int i10 = this.f59501c;
        if (i10 >= 0) {
            return cc.m.parseDouble(this.f59500b, i10, this.f59502d, z10);
        }
        if (!this.f59504f) {
            return cc.m.parseDouble(this.f59506h, 0, this.f59507i, z10);
        }
        char[] cArr = this.f59509k;
        if (cArr != null) {
            return cc.m.parseDouble(cArr, z10);
        }
        try {
            return cc.m.parseDouble(contentsAsString(), z10);
        } catch (IOException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    @Deprecated
    public float contentsAsFloat() throws NumberFormatException {
        return contentsAsFloat(false);
    }

    public int contentsAsInt(boolean z10) {
        char[] cArr;
        int i10 = this.f59501c;
        return (i10 < 0 || (cArr = this.f59500b) == null) ? z10 ? -cc.m.parseInt(this.f59506h, 1, this.f59507i - 1) : cc.m.parseInt(this.f59506h, 0, this.f59507i) : z10 ? -cc.m.parseInt(cArr, i10 + 1, this.f59502d - 1) : cc.m.parseInt(cArr, i10, this.f59502d);
    }

    public long contentsAsLong(boolean z10) {
        char[] cArr;
        int i10 = this.f59501c;
        return (i10 < 0 || (cArr = this.f59500b) == null) ? z10 ? -cc.m.parseLong(this.f59506h, 1, this.f59507i - 1) : cc.m.parseLong(this.f59506h, 0, this.f59507i) : z10 ? -cc.m.parseLong(cArr, i10 + 1, this.f59502d - 1) : cc.m.parseLong(cArr, i10, this.f59502d);
    }

    public String contentsAsString() throws IOException {
        if (this.f59508j == null) {
            char[] cArr = this.f59509k;
            if (cArr != null) {
                this.f59508j = new String(cArr);
            } else if (this.f59501c >= 0) {
                int i10 = this.f59502d;
                if (i10 < 1) {
                    this.f59508j = "";
                    return "";
                }
                g(i10);
                this.f59508j = new String(this.f59500b, this.f59501c, this.f59502d);
            } else {
                int i11 = this.f59505g;
                int i12 = this.f59507i;
                if (i11 != 0) {
                    int i13 = i11 + i12;
                    if (i13 < 0) {
                        a(i11, i12);
                        throw null;
                    }
                    g(i13);
                    StringBuilder sb2 = new StringBuilder(i13);
                    ArrayList arrayList = this.f59503e;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            char[] cArr2 = (char[]) this.f59503e.get(i14);
                            sb2.append(cArr2, 0, cArr2.length);
                        }
                    }
                    sb2.append(this.f59506h, 0, this.f59507i);
                    this.f59508j = sb2.toString();
                } else if (i12 == 0) {
                    this.f59508j = "";
                } else {
                    g(i12);
                    this.f59508j = new String(this.f59506h, 0, i12);
                }
            }
        }
        return this.f59508j;
    }

    public int contentsToWriter(Writer writer) throws IOException {
        int i10;
        char[] cArr = this.f59509k;
        if (cArr != null) {
            writer.write(cArr);
            return this.f59509k.length;
        }
        String str = this.f59508j;
        if (str != null) {
            writer.write(str);
            return this.f59508j.length();
        }
        int i11 = this.f59501c;
        if (i11 >= 0) {
            int i12 = this.f59502d;
            if (i12 > 0) {
                writer.write(this.f59500b, i11, i12);
            }
            return i12;
        }
        ArrayList arrayList = this.f59503e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr2 = (char[]) this.f59503e.get(i13);
                int length = cArr2.length;
                i10 += length;
                writer.write(cArr2, 0, length);
            }
        } else {
            i10 = 0;
        }
        int i14 = this.f59507i;
        if (i14 <= 0) {
            return i10;
        }
        int i15 = i10 + i14;
        writer.write(this.f59506h, 0, i14);
        return i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v9 int) = (r1v7 int), (r1v8 int) binds: [B:8:0x0026, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f59503e
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f59503e = r0
        Lb:
            char[] r0 = r3.f59506h
            r1 = 1
            r3.f59504f = r1
            java.util.ArrayList r1 = r3.f59503e
            r1.add(r0)
            int r1 = r3.f59505g
            int r2 = r0.length
            int r1 = r1 + r2
            r3.f59505g = r1
            if (r1 < 0) goto L34
            r1 = 0
            r3.f59507i = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L2a
        L28:
            r0 = r1
            goto L2f
        L2a:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L2f
            goto L28
        L2f:
            char[] r0 = new char[r0]
            r3.f59506h = r0
            return
        L34:
            int r2 = r0.length
            int r1 = r1 - r2
            int r0 = r0.length
            a(r1, r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.j0.d():void");
    }

    public final void e(int i10) {
        int i11 = this.f59502d;
        this.f59502d = 0;
        char[] cArr = this.f59500b;
        this.f59500b = null;
        int i12 = this.f59501c;
        this.f59501c = -1;
        int i13 = i10 + i11;
        char[] cArr2 = this.f59506h;
        if (cArr2 == null || i13 > cArr2.length) {
            this.f59506h = b(i13);
        }
        if (i11 > 0) {
            System.arraycopy(cArr, i12, this.f59506h, 0, i11);
        }
        this.f59505g = 0;
        this.f59507i = i11;
    }

    public char[] emptyAndGetCurrentSegment() {
        this.f59501c = -1;
        this.f59507i = 0;
        this.f59502d = 0;
        this.f59500b = null;
        this.f59508j = null;
        this.f59509k = null;
        if (this.f59504f) {
            c();
        }
        char[] cArr = this.f59506h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrB = b(0);
        this.f59506h = cArrB;
        return cArrB;
    }

    public void ensureNotShared() {
        if (this.f59501c >= 0) {
            e(16);
        }
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this.f59506h;
        int length = cArr.length;
        int i10 = (length >> 1) + length;
        if (i10 > 65536) {
            i10 = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        this.f59506h = cArrCopyOf;
        return cArrCopyOf;
    }

    public final void f(int i10) {
        int i11 = this.f59505g + this.f59507i + i10;
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        g(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        r4 = r3.f59503e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r4.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r3.f59507i = 0;
        r3.f59504f = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        return contentsAsString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String finishAndReturn(int r4, boolean r5) throws java.io.IOException {
        /*
            r3 = this;
            if (r5 == 0) goto L48
            int r5 = r4 + (-1)
            r0 = 32
            if (r5 < 0) goto Le
            char[] r1 = r3.f59506h
            char r1 = r1[r5]
            if (r1 > r0) goto L48
        Le:
            char[] r4 = r3.f59506h
        L10:
            int r1 = r5 + (-1)
            if (r1 < 0) goto L21
            char r2 = r4[r1]
            if (r2 <= r0) goto L1f
            r3.f59507i = r5
            java.lang.String r4 = r3.contentsAsString()
            return r4
        L1f:
            r5 = r1
            goto L10
        L21:
            java.util.ArrayList r4 = r3.f59503e
            if (r4 == 0) goto L3e
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L2c
            goto L3e
        L2c:
            java.util.ArrayList r4 = r3.f59503e
            int r5 = r4.size()
            int r5 = r5 + (-1)
            java.lang.Object r4 = r4.remove(r5)
            char[] r4 = (char[]) r4
            r3.f59506h = r4
            int r5 = r4.length
            goto Le
        L3e:
            r4 = 0
            r3.f59507i = r4
            r3.f59504f = r4
            java.lang.String r4 = r3.contentsAsString()
            return r4
        L48:
            r3.f59507i = r4
            java.lang.String r4 = r3.contentsAsString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.j0.finishAndReturn(int, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1
      0x002c: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:8:0x002a, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] finishCurrentSegment() throws java.io.IOException {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f59503e
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f59503e = r0
        Lb:
            r0 = 1
            r3.f59504f = r0
            java.util.ArrayList r0 = r3.f59503e
            char[] r1 = r3.f59506h
            r0.add(r1)
            char[] r0 = r3.f59506h
            int r0 = r0.length
            int r1 = r3.f59505g
            int r1 = r1 + r0
            r3.f59505g = r1
            if (r1 < 0) goto L38
            r2 = 0
            r3.f59507i = r2
            r3.g(r1)
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L2e
        L2c:
            r0 = r1
            goto L33
        L2e:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L33
            goto L2c
        L33:
            char[] r0 = new char[r0]
            r3.f59506h = r0
            return r0
        L38:
            int r1 = r1 - r0
            a(r1, r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.j0.finishCurrentSegment():char[]");
    }

    public char[] getBufferWithoutReset() {
        return this.f59506h;
    }

    public char[] getCurrentSegment() {
        if (this.f59501c >= 0) {
            e(1);
        } else {
            char[] cArr = this.f59506h;
            if (cArr == null) {
                this.f59506h = b(0);
            } else if (this.f59507i >= cArr.length) {
                d();
            }
        }
        return this.f59506h;
    }

    public int getCurrentSegmentSize() {
        return this.f59507i;
    }

    public char[] getTextBuffer() throws IOException {
        if (this.f59501c >= 0) {
            return this.f59500b;
        }
        char[] cArr = this.f59509k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f59508j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f59509k = charArray;
            return charArray;
        }
        if (this.f59504f) {
            return contentsAsArray();
        }
        char[] cArr2 = this.f59506h;
        return cArr2 == null ? f59498l : cArr2;
    }

    public int getTextOffset() {
        int i10 = this.f59501c;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public boolean hasTextAsCharacters() {
        return this.f59501c >= 0 || this.f59509k != null || this.f59508j == null;
    }

    public void releaseBuffers() {
        char[] cArr;
        this.f59501c = -1;
        this.f59507i = 0;
        this.f59502d = 0;
        this.f59500b = null;
        this.f59509k = null;
        if (this.f59504f) {
            c();
        }
        b bVar = this.f59499a;
        if (bVar == null || (cArr = this.f59506h) == null) {
            return;
        }
        this.f59506h = null;
        bVar.releaseCharBuffer(2, cArr);
    }

    public void resetWith(char c10) {
        this.f59501c = -1;
        this.f59502d = 0;
        this.f59508j = null;
        this.f59509k = null;
        if (this.f59504f) {
            c();
        } else if (this.f59506h == null) {
            this.f59506h = b(1);
        }
        this.f59506h[0] = c10;
        this.f59505g = 1;
        this.f59507i = 1;
    }

    public void resetWithCopy(char[] cArr, int i10, int i11) throws IOException {
        this.f59500b = null;
        this.f59501c = -1;
        this.f59502d = 0;
        this.f59508j = null;
        this.f59509k = null;
        if (this.f59504f) {
            c();
        } else if (this.f59506h == null) {
            this.f59506h = b(i11);
        }
        this.f59505g = 0;
        this.f59507i = 0;
        append(cArr, i10, i11);
    }

    public void resetWithEmpty() {
        this.f59501c = -1;
        this.f59507i = 0;
        this.f59502d = 0;
        this.f59500b = null;
        this.f59508j = null;
        this.f59509k = null;
        if (this.f59504f) {
            c();
        }
    }

    public void resetWithShared(char[] cArr, int i10, int i11) {
        this.f59508j = null;
        this.f59509k = null;
        this.f59500b = cArr;
        this.f59501c = i10;
        this.f59502d = i11;
        if (this.f59504f) {
            c();
        }
    }

    public void resetWithString(String str) throws IOException {
        this.f59500b = null;
        this.f59501c = -1;
        this.f59502d = 0;
        g(str.length());
        this.f59508j = str;
        this.f59509k = null;
        if (this.f59504f) {
            c();
        }
        this.f59507i = 0;
    }

    public String setCurrentAndReturn(int i10) throws IOException {
        this.f59507i = i10;
        if (this.f59505g > 0) {
            return contentsAsString();
        }
        g(i10);
        String str = i10 == 0 ? "" : new String(this.f59506h, 0, i10);
        this.f59508j = str;
        return str;
    }

    public void setCurrentLength(int i10) {
        this.f59507i = i10;
    }

    public int size() {
        if (this.f59501c >= 0) {
            return this.f59502d;
        }
        char[] cArr = this.f59509k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f59508j;
        return str != null ? str.length() : this.f59505g + this.f59507i;
    }

    public String toString() {
        try {
            return contentsAsString();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }

    public BigDecimal contentsAsDecimal(boolean z10) throws NumberFormatException {
        String str = this.f59508j;
        if (str != null) {
            return cc.m.parseBigDecimal(str, z10);
        }
        int i10 = this.f59501c;
        if (i10 >= 0) {
            return cc.m.parseBigDecimal(this.f59500b, i10, this.f59502d, z10);
        }
        if (!this.f59504f) {
            return cc.m.parseBigDecimal(this.f59506h, 0, this.f59507i, z10);
        }
        char[] cArr = this.f59509k;
        if (cArr != null) {
            return cc.m.parseBigDecimal(cArr, z10);
        }
        try {
            return cc.m.parseBigDecimal(contentsAsArray(), z10);
        } catch (IOException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public float contentsAsFloat(boolean z10) throws NumberFormatException {
        String str = this.f59508j;
        if (str != null) {
            return cc.m.parseFloat(str, z10);
        }
        int i10 = this.f59501c;
        if (i10 >= 0) {
            return cc.m.parseFloat(this.f59500b, i10, this.f59502d, z10);
        }
        if (!this.f59504f) {
            return cc.m.parseFloat(this.f59506h, 0, this.f59507i, z10);
        }
        char[] cArr = this.f59509k;
        if (cArr != null) {
            return cc.m.parseFloat(cArr, z10);
        }
        try {
            return cc.m.parseFloat(contentsAsString(), z10);
        } catch (IOException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public char[] expandCurrentSegment(int i10) {
        char[] cArr = this.f59506h;
        if (cArr.length >= i10) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        this.f59506h = cArrCopyOf;
        return cArrCopyOf;
    }

    public void append(char[] cArr, int i10, int i11) throws IOException {
        if (this.f59501c >= 0) {
            e(i11);
        }
        this.f59508j = null;
        this.f59509k = null;
        char[] cArr2 = this.f59506h;
        int length = cArr2.length;
        int i12 = this.f59507i;
        int i13 = length - i12;
        if (i13 >= i11) {
            System.arraycopy(cArr, i10, cArr2, i12, i11);
            this.f59507i += i11;
            return;
        }
        f(i11);
        if (i13 > 0) {
            System.arraycopy(cArr, i10, cArr2, this.f59507i, i13);
            i10 += i13;
            i11 -= i13;
        }
        do {
            d();
            int iMin = Math.min(this.f59506h.length, i11);
            System.arraycopy(cArr, i10, this.f59506h, 0, iMin);
            this.f59507i += iMin;
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    @Deprecated
    public double contentsAsDouble() throws NumberFormatException {
        return contentsAsDouble(false);
    }

    public void resetWithCopy(String str, int i10, int i11) throws IOException {
        this.f59500b = null;
        this.f59501c = -1;
        this.f59502d = 0;
        this.f59508j = null;
        this.f59509k = null;
        if (this.f59504f) {
            c();
        } else if (this.f59506h == null) {
            this.f59506h = b(i11);
        }
        this.f59505g = 0;
        this.f59507i = 0;
        append(str, i10, i11);
    }

    public void append(String str, int i10, int i11) throws IOException {
        if (this.f59501c >= 0) {
            e(i11);
        }
        this.f59508j = null;
        this.f59509k = null;
        char[] cArr = this.f59506h;
        int length = cArr.length;
        int i12 = this.f59507i;
        int i13 = length - i12;
        if (i13 >= i11) {
            str.getChars(i10, i10 + i11, cArr, i12);
            this.f59507i += i11;
            return;
        }
        f(i11);
        if (i13 > 0) {
            int i14 = i10 + i13;
            str.getChars(i10, i14, cArr, this.f59507i);
            i11 -= i13;
            i10 = i14;
        }
        while (true) {
            d();
            int iMin = Math.min(this.f59506h.length, i11);
            int i15 = i10 + iMin;
            str.getChars(i10, i15, this.f59506h, 0);
            this.f59507i += iMin;
            i11 -= iMin;
            if (i11 <= 0) {
                return;
            } else {
                i10 = i15;
            }
        }
    }

    public void g(int i10) {
    }
}
