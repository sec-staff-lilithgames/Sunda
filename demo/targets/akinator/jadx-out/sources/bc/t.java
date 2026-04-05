package bc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends c {
    @Override // bc.c
    public final long g() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // bc.c
    public final long h() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // bc.c
    public final long i() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // bc.c
    public final long k(char[] cArr, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) throws NumberFormatException {
        double dG = f.g(z10, j10, i12, z11, i13);
        if (Double.isNaN(dG)) {
            dG = Double.parseDouble(new String(cArr, i10, i11 - i10));
        }
        return Double.doubleToRawLongBits(dG);
    }

    @Override // bc.c
    public final long l(char[] cArr, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) throws NumberFormatException {
        double dK = f.k(j10, i12, i13, z10, z11);
        if (Double.isNaN(dK)) {
            dK = Double.parseDouble(new String(cArr, i10, i11 - i10));
        }
        return Double.doubleToRawLongBits(dK);
    }
}
