package com.bytedance.sdk.component.jd.jpo.jd;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class qk extends cm {

    /* renamed from: qk, reason: collision with root package name */
    final transient byte[][] f18573qk;
    final transient int[] xyk;

    public qk(jpo jpoVar, int i10) {
        super(null);
        zz.jpo(jpoVar.f18568jd, 0L, i10);
        my myVar = jpoVar.jpo;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = myVar.wqx;
            int i15 = myVar.f18570jd;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            myVar = myVar.f18571jj;
        }
        this.f18573qk = new byte[i13][];
        this.xyk = new int[i13 * 2];
        my myVar2 = jpoVar.jpo;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f18573qk;
            bArr[i16] = myVar2.jpo;
            int i17 = myVar2.wqx;
            int i18 = myVar2.f18570jd;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.xyk;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            myVar2.f18569cm = true;
            i16++;
            myVar2 = myVar2.f18571jj;
        }
    }

    private cm my() {
        return new cm(cm());
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public byte[] cm() {
        int[] iArr = this.xyk;
        byte[][] bArr = this.f18573qk;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.xyk;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f18573qk[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cm) {
            cm cmVar = (cm) obj;
            if (cmVar.wqx() == wqx() && jpo(0, cmVar, 0, wqx())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public int hashCode() {
        int i10 = this.my;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f18573qk.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f18573qk[i11];
            int[] iArr = this.xyk;
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
        this.my = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public String jd() {
        return my().jd();
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public String jpo() {
        return my().jpo();
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public String toString() {
        return my().toString();
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public int wqx() {
        return this.xyk[this.f18573qk.length - 1];
    }

    private int jd(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.xyk, 0, this.f18573qk.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public cm jpo(int i10, int i11) {
        return my().jpo(i10, i11);
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public byte jpo(int i10) {
        zz.jpo(this.xyk[this.f18573qk.length - 1], i10, 1L);
        int iJd = jd(i10);
        int i11 = iJd == 0 ? 0 : this.xyk[iJd - 1];
        int[] iArr = this.xyk;
        byte[][] bArr = this.f18573qk;
        return bArr[iJd][(i10 - i11) + iArr[bArr.length + iJd]];
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public boolean jpo(int i10, cm cmVar, int i11, int i12) {
        if (i10 < 0 || i10 > wqx() - i12) {
            return false;
        }
        int iJd = jd(i10);
        while (i12 > 0) {
            int i13 = iJd == 0 ? 0 : this.xyk[iJd - 1];
            int iMin = Math.min(i12, ((this.xyk[iJd] - i13) + i13) - i10);
            int[] iArr = this.xyk;
            byte[][] bArr = this.f18573qk;
            if (!cmVar.jpo(i11, bArr[iJd], (i10 - i13) + iArr[bArr.length + iJd], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iJd++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.jd.cm
    public boolean jpo(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > wqx() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iJd = jd(i10);
        while (i12 > 0) {
            int i13 = iJd == 0 ? 0 : this.xyk[iJd - 1];
            int iMin = Math.min(i12, ((this.xyk[iJd] - i13) + i13) - i10);
            int[] iArr = this.xyk;
            byte[][] bArr2 = this.f18573qk;
            if (!zz.jpo(bArr2[iJd], (i10 - i13) + iArr[bArr2.length + iJd], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iJd++;
        }
        return true;
    }
}
