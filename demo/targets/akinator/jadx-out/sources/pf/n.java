package pf;

import android.util.Pair;
import bf.d0;
import bf.m1;
import bf.n1;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.m3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n extends w {

    /* renamed from: c, reason: collision with root package name */
    public m f81131c;

    public abstract Pair a(m mVar, int[][][] iArr, int[] iArr2, d0 d0Var, m3 m3Var);

    public final m getCurrentMappedTrackInfo() {
        return this.f81131c;
    }

    @Override // pf.w
    public final void onSelectionActivated(Object obj) {
        this.f81131c = (m) obj;
    }

    @Override // pf.w
    public final x selectTracks(b3[] b3VarArr, n1 n1Var, d0 d0Var, m3 m3Var) throws com.google.android.exoplayer2.r {
        int[] iArr;
        n1 n1Var2 = n1Var;
        boolean z10 = true;
        int[] iArr2 = new int[b3VarArr.length + 1];
        int length = b3VarArr.length + 1;
        m1[][] m1VarArr = new m1[length][];
        int[][][] iArr3 = new int[b3VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = n1Var2.f9356b;
            m1VarArr[i10] = new m1[i11];
            iArr3[i10] = new int[i11][];
        }
        int length2 = b3VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            iArr4[i12] = b3VarArr[i12].supportsMixedMimeTypeAdaptation();
        }
        int i13 = 0;
        while (i13 < n1Var2.f9356b) {
            m1 m1Var = n1Var2.get(i13);
            int i14 = m1Var.f9334e;
            int i15 = m1Var.f9332b;
            boolean z11 = i14 == 5 ? z10 : false;
            int length3 = b3VarArr.length;
            boolean z12 = z10;
            int i16 = 0;
            int i17 = 0;
            while (i16 < b3VarArr.length) {
                b3 b3Var = b3VarArr[i16];
                int iMax = 0;
                int i18 = 0;
                while (i18 < i15) {
                    iMax = Math.max(iMax, b3.getFormatSupport(b3Var.supportsFormat(m1Var.getFormat(i18))));
                    i18++;
                    iArr2 = iArr2;
                }
                int[] iArr5 = iArr2;
                boolean z13 = iArr5[i16] == 0 ? z12 : false;
                if (iMax > i17 || (iMax == i17 && z11 && !z12 && z13)) {
                    i17 = iMax;
                    z12 = z13;
                    length3 = i16;
                }
                i16++;
                iArr2 = iArr5;
            }
            int[] iArr6 = iArr2;
            if (length3 == b3VarArr.length) {
                iArr = new int[i15];
            } else {
                b3 b3Var2 = b3VarArr[length3];
                int[] iArr7 = new int[i15];
                for (int i19 = 0; i19 < i15; i19++) {
                    iArr7[i19] = b3Var2.supportsFormat(m1Var.getFormat(i19));
                }
                iArr = iArr7;
            }
            int i20 = iArr6[length3];
            m1VarArr[length3][i20] = m1Var;
            iArr3[length3][i20] = iArr;
            iArr6[length3] = i20 + 1;
            i13++;
            n1Var2 = n1Var;
            z10 = z12;
            iArr2 = iArr6;
        }
        int[] iArr8 = iArr2;
        n1[] n1VarArr = new n1[b3VarArr.length];
        String[] strArr = new String[b3VarArr.length];
        int[] iArr9 = new int[b3VarArr.length];
        for (int i21 = 0; i21 < b3VarArr.length; i21++) {
            int i22 = iArr8[i21];
            n1VarArr[i21] = new n1((m1[]) com.google.android.exoplayer2.util.n1.nullSafeArrayCopy(m1VarArr[i21], i22));
            iArr3[i21] = (int[][]) com.google.android.exoplayer2.util.n1.nullSafeArrayCopy(iArr3[i21], i22);
            strArr[i21] = b3VarArr[i21].getName();
            iArr9[i21] = b3VarArr[i21].getTrackType();
        }
        m mVar = new m(strArr, iArr9, n1VarArr, iArr4, iArr3, new n1((m1[]) com.google.android.exoplayer2.util.n1.nullSafeArrayCopy(m1VarArr[b3VarArr.length], iArr8[b3VarArr.length])));
        Pair pairA = a(mVar, iArr3, iArr4, d0Var, m3Var);
        return new x((c3[]) pairA.first, (k[]) pairA.second, u.buildTracks(mVar, (o[]) pairA.second), mVar);
    }
}
