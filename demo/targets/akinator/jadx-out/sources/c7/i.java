package c7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    public static final int calculateInSampleSize(int i10, int i11, int i12, int i13, m7.i iVar) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = h.$EnumSwitchMapping$0[iVar.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new tu.t();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return qv.v.coerceAtLeast(iMin, 1);
    }

    public static final double computeSizeMultiplier(int i10, int i11, int i12, int i13, m7.i iVar) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int i14 = h.$EnumSwitchMapping$0[iVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new tu.t();
    }

    public static final float computeSizeMultiplier(float f10, float f11, float f12, float f13, m7.i iVar) {
        float f14 = f12 / f10;
        float f15 = f13 / f11;
        int i10 = h.$EnumSwitchMapping$0[iVar.ordinal()];
        if (i10 == 1) {
            return Math.max(f14, f15);
        }
        if (i10 == 2) {
            return Math.min(f14, f15);
        }
        throw new tu.t();
    }

    public static final double computeSizeMultiplier(double d10, double d11, double d12, double d13, m7.i iVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = h.$EnumSwitchMapping$0[iVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new tu.t();
    }
}
