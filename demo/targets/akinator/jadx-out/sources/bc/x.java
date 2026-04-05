package bc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends c {
    @Override // bc.c
    public final long g() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // bc.c
    public final long h() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // bc.c
    public final long i() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // bc.c
    public final long k(char[] cArr, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) {
        return Float.isNaN(f.h(z10, j10, i12, z11, i13)) ? Float.floatToRawIntBits(Float.parseFloat(new String(cArr, i10, i11 - i10))) : Float.floatToRawIntBits(r4);
    }

    @Override // bc.c
    public final long l(char[] cArr, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) throws NumberFormatException {
        float fL = f.l(z10, j10, i12, z11, i13);
        if (Float.isNaN(fL)) {
            fL = Float.parseFloat(new String(cArr, i10, i11 - i10));
        }
        return Float.floatToRawIntBits(fL);
    }
}
