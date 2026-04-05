package com.mbridge.msdk.thrid.okio;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class q extends f {

    /* renamed from: f, reason: collision with root package name */
    final transient byte[][] f43859f;

    /* renamed from: g, reason: collision with root package name */
    final transient int[] f43860g;

    public q(c cVar, int i10) {
        super(null);
        u.a(cVar.f43818b, 0L, i10);
        o oVar = cVar.f43817a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = oVar.f43852c;
            int i15 = oVar.f43851b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            oVar = oVar.f43855f;
        }
        this.f43859f = new byte[i13][];
        this.f43860g = new int[i13 * 2];
        o oVar2 = cVar.f43817a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f43859f;
            bArr[i16] = oVar2.f43850a;
            int i17 = oVar2.f43852c;
            int i18 = oVar2.f43851b;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.f43860g;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            oVar2.f43853d = true;
            i16++;
            oVar2 = oVar2.f43855f;
        }
    }

    private f i() {
        return new f(g());
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String a() {
        return i().a();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String b() {
        return i().b();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f c() {
        return i().c();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f d() {
        return i().d();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public int e() {
        return this.f43860g[this.f43859f.length - 1];
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.e() == e() && a(0, fVar, 0, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f f() {
        return i().f();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public byte[] g() {
        int[] iArr = this.f43860g;
        byte[][] bArr = this.f43859f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f43860g;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f43859f[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String h() {
        return i().h();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public int hashCode() {
        int i10 = this.f43823b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f43859f.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f43859f[i11];
            int[] iArr = this.f43860g;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f43823b = i12;
        return i12;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String toString() {
        return i().toString();
    }

    private int b(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.f43860g, 0, this.f43859f.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f a(int i10, int i11) {
        return i().a(i10, i11);
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public byte a(int i10) {
        u.a(this.f43860g[this.f43859f.length - 1], i10, 1L);
        int iB = b(i10);
        int i11 = iB == 0 ? 0 : this.f43860g[iB - 1];
        int[] iArr = this.f43860g;
        byte[][] bArr = this.f43859f;
        return bArr[iB][(i10 - i11) + iArr[bArr.length + iB]];
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public void a(c cVar) {
        int length = this.f43859f.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f43860g;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            o oVar = new o(this.f43859f[i10], i12, (i12 + i13) - i11, true, false);
            o oVar2 = cVar.f43817a;
            if (oVar2 == null) {
                oVar.f43856g = oVar;
                oVar.f43855f = oVar;
                cVar.f43817a = oVar;
            } else {
                oVar2.f43856g.a(oVar);
            }
            i10++;
            i11 = i13;
        }
        cVar.f43818b += i11;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean a(int i10, f fVar, int i11, int i12) {
        if (i10 < 0 || i10 > e() - i12) {
            return false;
        }
        int iB = b(i10);
        while (i12 > 0) {
            int i13 = iB == 0 ? 0 : this.f43860g[iB - 1];
            int iMin = Math.min(i12, ((this.f43860g[iB] - i13) + i13) - i10);
            int[] iArr = this.f43860g;
            byte[][] bArr = this.f43859f;
            if (!fVar.a(i11, bArr[iB], (i10 - i13) + iArr[bArr.length + iB], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iB++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean a(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > e() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iB = b(i10);
        while (i12 > 0) {
            int i13 = iB == 0 ? 0 : this.f43860g[iB - 1];
            int iMin = Math.min(i12, ((this.f43860g[iB] - i13) + i13) - i10);
            int[] iArr = this.f43860g;
            byte[][] bArr2 = this.f43859f;
            if (!u.a(bArr2[iB], (i10 - i13) + iArr[bArr2.length + iB], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iB++;
        }
        return true;
    }
}
