package fo;

import android.util.Pair;
import ao.b2;
import ao.k0;
import gn.u1;
import gn.v1;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o extends u {

    /* renamed from: c, reason: collision with root package name */
    public n f55920c;

    public abstract Pair a(n nVar, int[][][] iArr, int[] iArr2, k0 k0Var, u1 u1Var);

    public final n getCurrentMappedTrackInfo() {
        return this.f55920c;
    }

    @Override // fo.u
    public final void onSelectionActivated(Object obj) {
        this.f55920c = (n) obj;
    }

    @Override // fo.u
    public final v selectTracks(io.bidmachine.media3.exoplayer.u1[] u1VarArr, b2 b2Var, k0 k0Var, u1 u1Var) throws a0 {
        int[] iArr;
        b2 b2Var2 = b2Var;
        boolean z10 = true;
        int[] iArr2 = new int[u1VarArr.length + 1];
        int length = u1VarArr.length + 1;
        v1[][] v1VarArr = new v1[length][];
        int[][][] iArr3 = new int[u1VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = b2Var2.f7552a;
            v1VarArr[i10] = new v1[i11];
            iArr3[i10] = new int[i11][];
        }
        int length2 = u1VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            iArr4[i12] = u1VarArr[i12].supportsMixedMimeTypeAdaptation();
        }
        int i13 = 0;
        while (i13 < b2Var2.f7552a) {
            v1 v1Var = b2Var2.get(i13);
            int i14 = v1Var.f58207c;
            int i15 = v1Var.f58205a;
            boolean z11 = i14 == 5 ? z10 : false;
            int length3 = u1VarArr.length;
            boolean z12 = z10;
            int i16 = 0;
            int i17 = 0;
            while (i16 < u1VarArr.length) {
                io.bidmachine.media3.exoplayer.u1 u1Var2 = u1VarArr[i16];
                int iMax = 0;
                int i18 = 0;
                while (i18 < i15) {
                    iMax = Math.max(iMax, io.bidmachine.media3.exoplayer.u1.getFormatSupport(u1Var2.supportsFormat(v1Var.getFormat(i18))));
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
            if (length3 == u1VarArr.length) {
                iArr = new int[i15];
            } else {
                io.bidmachine.media3.exoplayer.u1 u1Var3 = u1VarArr[length3];
                int[] iArr7 = new int[i15];
                for (int i19 = 0; i19 < i15; i19++) {
                    iArr7[i19] = u1Var3.supportsFormat(v1Var.getFormat(i19));
                }
                iArr = iArr7;
            }
            int i20 = iArr6[length3];
            v1VarArr[length3][i20] = v1Var;
            iArr3[length3][i20] = iArr;
            iArr6[length3] = i20 + 1;
            i13++;
            b2Var2 = b2Var;
            z10 = z12;
            iArr2 = iArr6;
        }
        int[] iArr8 = iArr2;
        b2[] b2VarArr = new b2[u1VarArr.length];
        String[] strArr = new String[u1VarArr.length];
        int[] iArr9 = new int[u1VarArr.length];
        for (int i21 = 0; i21 < u1VarArr.length; i21++) {
            int i22 = iArr8[i21];
            b2VarArr[i21] = new b2((v1[]) a1.nullSafeArrayCopy(v1VarArr[i21], i22));
            iArr3[i21] = (int[][]) a1.nullSafeArrayCopy(iArr3[i21], i22);
            strArr[i21] = u1VarArr[i21].getName();
            iArr9[i21] = u1VarArr[i21].getTrackType();
        }
        n nVar = new n(strArr, iArr9, b2VarArr, iArr4, iArr3, new b2((v1[]) a1.nullSafeArrayCopy(v1VarArr[u1VarArr.length], iArr8[u1VarArr.length])));
        Pair pairA = a(nVar, iArr3, iArr4, k0Var, u1Var);
        return new v((io.bidmachine.media3.exoplayer.v1[]) pairA.first, (l[]) pairA.second, s.buildTracks(nVar, (p[]) pairA.second), nVar);
    }
}
